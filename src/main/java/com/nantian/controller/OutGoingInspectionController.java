package com.nantian.controller;


import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysOutgoingInspection;
import com.nantian.entity.sys.SysSecondMotion;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.OutGoingInspectionException;
import com.nantian.exception.SecondMotionException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.OutGoingInspectionService;
import com.nantian.service.SecondMotionService;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.OutGoingInspectionVO;
import com.nantian.vo.SecondMotionVO;
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

@Trade(channel = "api", transCode = "outgoingInspection")
public class OutGoingInspectionController {
    private static Logger log= LoggerFactory.getLogger(OutGoingInspectionController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    OutGoingInspectionService outGoingInspectionService;


    /**
     * 根据ID查询表中数据
     * @param context
     * @param outGoingInspectionVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject OutGoingInspectionVO outGoingInspectionVO)throws OutGoingInspectionException {

        List<SysOutgoingInspection> outgoingInspectionList = new ArrayList<>();
        List<SysOutgoingInspection> outgoingInspectionList1 = new ArrayList<>();

        List<Long> ids = outGoingInspectionVO.getIds();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);

            SysOutgoingInspection sysOutgoingInspection = outGoingInspectionService.queryById(id);
            System.out.println("sysOutgoingInspection:"+sysOutgoingInspection);
            if(sysOutgoingInspection != null){
                outgoingInspectionList1.add(sysOutgoingInspection);

            }

        }
        List<SysOutgoingInspection> outgoingInspectionList2 = new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            //页面显示的任职单位，任职职务，任职职等 均为调整的 所以从竞聘表中查询
            SysCandidateInfo sysCandidateInfo =  candidateInfoService.queryCandidateInfoById(id);
            System.out.println("2");
            SysOutgoingInspection sysOutgoingInspection = new SysOutgoingInspection();
            sysOutgoingInspection.setId(sysCandidateInfo.getId());
            sysOutgoingInspection.setCandidateName(sysCandidateInfo.getCandidateName());

            System.out.println("sysOutgoingInspection:"+sysOutgoingInspection);
            outgoingInspectionList2.add(sysOutgoingInspection);
        }
        System.out.println("outgoingInspectionList1:"+outgoingInspectionList1+"size():"+outgoingInspectionList1.size());
        if(outgoingInspectionList1.size()>0){
            for(int i =0; i<outgoingInspectionList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = outgoingInspectionList1.get(i).getId();
                for(int k = 0 ;k<outgoingInspectionList2.size();k++){
                    Long id2 = outgoingInspectionList2.get(k).getId();
                    if(id2.equals(id1)){
                        outgoingInspectionList2.remove(k);
                        k--;
                    }
                }
            }
            System.out.println("集合2的长度："+outgoingInspectionList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            outgoingInspectionList.addAll(outgoingInspectionList1);
            if(outgoingInspectionList2.size()>0){
                outgoingInspectionList.addAll(outgoingInspectionList2);
            }
            System.out.println("合并："+outgoingInspectionList2);
        }else{
            outgoingInspectionList.addAll(outgoingInspectionList2);
        }
        System.out.println(outgoingInspectionList);
        context.setRstObject("data", outgoingInspectionList);

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject OutGoingInspectionVO outGoingInspectionVO)throws OutGoingInspectionException{
        //获取表格数据
        List<OutGoingInspectionVO> outGoingInspectionVOList = outGoingInspectionVO.getInfos();
        try {
            System.out.println("outGoingInspectionVOList:"+outGoingInspectionVOList);
            for(int i = 0;i < outGoingInspectionVOList.size();i++){
                outGoingInspectionService.add(outGoingInspectionVOList.get(i));
            }
        } catch (OutGoingInspectionException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject OutGoingInspectionVO outGoingInspectionVOs)throws OutGoingInspectionException{
        System.out.println("提交");
        //获取表格数据
        List<OutGoingInspectionVO> outGoingInspectionVOList = outGoingInspectionVOs.getInfos();
        //没有保存直接提交
        try {
            System.out.println("outGoingInspectionVOList:"+outGoingInspectionVOList);
            for(int i = 0;i < outGoingInspectionVOList.size();i++){
                outGoingInspectionService.add(outGoingInspectionVOList.get(i));
            }
            //根据ID 更新到流程表字段
            outGoingInspectionService.updateSysFlowByUserID(outGoingInspectionVOList);
        } catch (OutGoingInspectionException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }


        //任职单位更新(选择了 '是' 才更新)



    }
//    @Push(requestFormat = ParamFormatEnum.JSON)
//    public void update(ApplicationContext context, @ParameterObject SecondMotionVO secondMotionVO)throws SecondMotionException{
//        System.out.println("updateByIdNewPosition"+secondMotionVO);
//        secondMotionService.updateNewPositionById(secondMotionVO.getInfos().get(0));
//
//    }



}
