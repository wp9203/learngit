package com.nantian.controller;


import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysConInOffice;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.ConInOfficeException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.ConInOfficeService;
import com.nantian.vo.ConInOfficeVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 单位推荐管理控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-04-16</p>
 *
 * @author wp
 * @version 1.0
 */

@Trade(channel = "api", transCode = "conInOffice")
public class ConInOfficeController {
    private static Logger log= LoggerFactory.getLogger(ConInOfficeController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    ConInOfficeService conInOfficeService;


    /**
     * 根据ID查询表中数据
     * @param context
     * @param conInOfficeVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject ConInOfficeVO conInOfficeVO)throws ConInOfficeException {

        List<SysConInOffice> conInOfficeList = new ArrayList<>();
        List<SysConInOffice> conInOfficeList1 = new ArrayList<>();

        List<Long> ids = conInOfficeVO.getIds();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            SysConInOffice sysConInOffice = conInOfficeService.queryById(id);
            System.out.println("sysConInOffice:"+sysConInOffice);
            if(sysConInOffice != null){
                conInOfficeList1.add(sysConInOffice);
            }
        }
        List<SysConInOffice> conInOfficeList2 = new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            //页面显示的任职单位，任职职务，任职职等 均为调整的 所以从竞聘表中查询
            SysCandidateInfo sysCandidateInfo =  candidateInfoService.queryCandidateInfoById(id);
            System.out.println("2");
            SysConInOffice sysConInOffice = new SysConInOffice();
            sysConInOffice.setId(sysCandidateInfo.getId());
            sysConInOffice.setCandidateName(sysCandidateInfo.getCandidateName());
            System.out.println("sysConInOffice:"+sysConInOffice);
            conInOfficeList2.add(sysConInOffice);
        }
        System.out.println("sysConInOffice1:"+conInOfficeList1+"size():"+conInOfficeList1.size());
        if(conInOfficeList1.size()>0){
            for(int i =0; i<conInOfficeList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = conInOfficeList1.get(i).getId();
                for(int k = 0 ;k<conInOfficeList2.size();k++){
                    Long id2 = conInOfficeList2.get(k).getId();
                    if(id2.equals(id1)){
                        conInOfficeList2.remove(k);
                        k--;
                    }
                }
            }
            System.out.println("集合2的长度："+conInOfficeList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            conInOfficeList.addAll(conInOfficeList1);
            if(conInOfficeList2.size()>0){
                conInOfficeList.addAll(conInOfficeList2);
            }
            System.out.println("合并："+conInOfficeList2);
        }else{
            conInOfficeList.addAll(conInOfficeList2);
        }
        System.out.println(conInOfficeList);
        context.setRstObject("data", conInOfficeList);

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject ConInOfficeVO conInOfficeVO)throws ConInOfficeException{

        //获取表格数据
        List<ConInOfficeVO> conInOfficeVOList = conInOfficeVO.getInfos();

        try {

            System.out.println("conInOfficeVOList:"+conInOfficeVOList);
            for(int i = 0;i < conInOfficeVOList.size();i++){
                conInOfficeService.add(conInOfficeVOList.get(i));
            }

        } catch (ConInOfficeException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject ConInOfficeVO conInOfficeVOs)throws ConInOfficeException{

        System.out.println("提交");
        //获取表格数据
        List<ConInOfficeVO> conInOfficeVOList = conInOfficeVOs.getInfos();

        //没有保存直接提交
        try {
            System.out.println("conInOfficeVOList:"+conInOfficeVOList);
            for(int i = 0;i < conInOfficeVOList.size();i++){
                conInOfficeService.add(conInOfficeVOList.get(i));
            }
            //根据ID 更新到流程表字段
            conInOfficeService.updateSysFlowByUserID(conInOfficeVOList);
        } catch (ConInOfficeException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
//    @Push(requestFormat = ParamFormatEnum.JSON)
//    public void update(ApplicationContext context, @ParameterObject SecondMotionVO secondMotionVO)throws SecondMotionException{
//        System.out.println("updateByIdNewPosition"+secondMotionVO);
//        secondMotionService.updateNewPositionById(secondMotionVO.getInfos().get(0));
//
//    }



}
