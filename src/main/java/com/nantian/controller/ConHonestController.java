package com.nantian.controller;


import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysConHonest;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.ConHonestException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.ConHonestService;
import com.nantian.vo.ConHonestVO;
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

@Trade(channel = "api", transCode = "conHonest")
public class ConHonestController {
    private static Logger log= LoggerFactory.getLogger(ConHonestController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    ConHonestService conHonestService;


    /**
     * 根据ID查询表中数据
     * @param context
     * @param conHonestVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject ConHonestVO conHonestVO)throws ConHonestException {
        try{
            List<SysConHonest> sysConHonestList = new ArrayList<>();
            List<SysConHonest> sysConHonestList1 = new ArrayList<>();

            List<Long> ids = conHonestVO.getIds();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);

                SysConHonest sysConHonest = conHonestService.queryById(id);
                System.out.println("sysConHonest:"+sysConHonest);
                if(sysConHonest != null){
                    sysConHonestList1.add(sysConHonest);
                }

            }
            List<SysConHonest> sysConHonestList2 = new ArrayList<>();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);
                //页面显示的任职单位，任职职务，任职职等 均为调整的 所以从竞聘表中查询
                SysCandidateInfo sysCandidateInfo =  candidateInfoService.queryCandidateInfoById(id);
                System.out.println("2");
                SysConHonest sysConHonest = new SysConHonest();
                sysConHonest.setId(sysCandidateInfo.getId());
                sysConHonest.setCandidateName(sysCandidateInfo.getCandidateName());
                System.out.println("sysConHonest:"+sysConHonest);
                sysConHonestList2.add(sysConHonest);
            }
            System.out.println("sysConHonestList1:"+sysConHonestList1+"size():"+sysConHonestList1.size());
            if(sysConHonestList1.size()>0){
                for(int i =0; i<sysConHonestList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                    Long id1 = sysConHonestList1.get(i).getId();
                    for(int k = 0 ;k<sysConHonestList2.size();k++){
                        Long id2 = sysConHonestList2.get(k).getId();
                        if(id2.equals(id1)){
                            sysConHonestList2.remove(k);
                            k--;
                        }
                    }
                }
                System.out.println("集合2的长度："+sysConHonestList1.size());
                //合并两个集合 list2 与 sysInspectArchivesList;
                sysConHonestList.addAll(sysConHonestList1);
                if(sysConHonestList2.size()>0){
                    sysConHonestList.addAll(sysConHonestList2);
                }
                System.out.println("合并："+sysConHonestList2);
            }else{
                sysConHonestList.addAll(sysConHonestList2);
            }
            System.out.println(sysConHonestList);
            context.setRstObject("data", sysConHonestList);
        }catch(ConHonestException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }


    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject ConHonestVO conHonestVO)throws ConHonestException{

        //获取表格数据
        List<ConHonestVO> conHonestVOList = conHonestVO.getInfos();
        try {
            System.out.println("conHonestVOList:"+conHonestVOList);
            for(int i = 0;i < conHonestVOList.size();i++){
                conHonestService.add(conHonestVOList.get(i));
            }
        } catch (ConHonestException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject ConHonestVO conHonestVO)throws ConHonestException{

        System.out.println("提交");
        //获取表格数据
        List<ConHonestVO> conHonestVOList = conHonestVO.getInfos();

        //没有保存直接提交
        try {
            System.out.println("conHonestVOList:"+conHonestVOList);
            for(int i = 0;i < conHonestVOList.size();i++){
                conHonestService.add(conHonestVOList.get(i));
            }
            //根据ID 更新到流程表字段
            conHonestService.updateSysFlowByUserID(conHonestVOList);
        } catch (ConHonestException e) {
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
