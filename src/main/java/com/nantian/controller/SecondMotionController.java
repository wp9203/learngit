package com.nantian.controller;


import com.nantian.common.util.StringUtils;
import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysComplianceDepOp;
import com.nantian.entity.sys.SysSecondMotion;
import com.nantian.entity.sys.SysUser;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.SecondMotionException;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.ComplianceDepOpService;
import com.nantian.service.SecondMotionService;
import com.nantian.service.UserService;
import com.nantian.vo.ComplianceDepOpVO;
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

@Trade(channel = "api", transCode = "secondMotion")
public class SecondMotionController {
    private static Logger log= LoggerFactory.getLogger(SecondMotionController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    SecondMotionService secondMotionService;


    /**
     * 根据ID查询表中数据
     * @param context
     * @param complianceDepOpVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject ComplianceDepOpVO complianceDepOpVO)throws SecondMotionException {

        List<SysSecondMotion> secondMotionArrayList = new ArrayList<>();
        List<SysSecondMotion> secondMotionArrayList1 = new ArrayList<>();
        SysSecondMotion sysSecondMotionForm = new SysSecondMotion();
        List<Long> ids = complianceDepOpVO.getIds();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);

            SysSecondMotion sysSecondMotion = secondMotionService.queryById(id);
            System.out.println("sysSecondMotion:"+sysSecondMotion);
            if(sysSecondMotion != null){
                secondMotionArrayList1.add(sysSecondMotion);
                sysSecondMotionForm.setMeetingDate(sysSecondMotion.getMeetingDate());
                sysSecondMotionForm.setHost(sysSecondMotion.getHost());
                sysSecondMotionForm.setDueNumber(sysSecondMotion.getDueNumber());
                sysSecondMotionForm.setActualNumber(sysSecondMotion.getActualNumber());
                sysSecondMotionForm.setSummaryNumber(sysSecondMotion.getSummaryNumber());
                sysSecondMotionForm.setSignFilePath(sysSecondMotion.getSignFilePath());
                sysSecondMotionForm.setSummaryFilePath(sysSecondMotion.getSummaryFilePath());
            }

        }
        List<SysSecondMotion> secondMotionArrayList2 = new ArrayList<>();
        for(int i = 0 ;i<ids.size();i++){
            Long id = ids.get(i);
            //页面显示的任职单位，任职职务，任职职等 均为调整的 所以从竞聘表中查询
            SysCandidateInfo sysCandidateInfo =  candidateInfoService.queryCandidateInfoById(id);
            System.out.println("2");
            SysSecondMotion sysSecondMotion = new SysSecondMotion();
            sysSecondMotion.setCandidateName(sysCandidateInfo.getCandidateName());
            sysSecondMotion.setUnit(sysCandidateInfo.getUnit());
            sysSecondMotion.setPosition(sysCandidateInfo.getPosition());
            sysSecondMotion.setPositionLevel(sysCandidateInfo.getPositionLevel());
            sysSecondMotion.setNote(sysCandidateInfo.getNote());
            sysSecondMotion.setId(sysCandidateInfo.getId());
            System.out.println("sysSecondMotion:"+sysSecondMotion);
            secondMotionArrayList2.add(sysSecondMotion);
        }
        System.out.println("secondMotionArrayList1:"+secondMotionArrayList1+"size():"+secondMotionArrayList1.size());
        if(secondMotionArrayList1.size()>0){
            for(int i =0; i<secondMotionArrayList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                Long id1 = secondMotionArrayList1.get(i).getId();
                for(int k = 0 ;k<secondMotionArrayList2.size();k++){
                    Long id2 = secondMotionArrayList2.get(k).getId();
                    if(id2.equals(id1)){
                        secondMotionArrayList2.remove(k);
                        k--;
                    }
                }
            }
            System.out.println("集合2的长度："+secondMotionArrayList2.size());
            //合并两个集合 list2 与 sysInspectArchivesList;
            secondMotionArrayList.addAll(secondMotionArrayList1);
            if(secondMotionArrayList2.size()>0){
                secondMotionArrayList.addAll(secondMotionArrayList2);
            }
            System.out.println("合并："+secondMotionArrayList);
        }else{
            secondMotionArrayList.addAll(secondMotionArrayList2);
        }
        System.out.println(secondMotionArrayList);
        context.setRstObject("data", secondMotionArrayList);
        context.setRstObject("dataForm",sysSecondMotionForm);

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject SecondMotionVO secondMotionVO)throws SecondMotionException{



        try {
            //获取表单数据
            SecondMotionVO secondMotionVO_form = secondMotionVO.getReq().get(0);
            //获取表格数据
            List<SecondMotionVO> secondMotionVOList = secondMotionVO.getInfos();
            for(SecondMotionVO secondMotionVO_table:secondMotionVOList){
                secondMotionVO_table.setMeetingDate(secondMotionVO_form.getMeetingDate());
                secondMotionVO_table.setHost(secondMotionVO_form.getHost());
                secondMotionVO_table.setDueNumber(secondMotionVO_form.getDueNumber());
                secondMotionVO_table.setActualNumber(secondMotionVO_form.getActualNumber());
                secondMotionVO_table.setSummaryNumber(secondMotionVO_form.getSummaryNumber());
                secondMotionVO_table.setSignFilePath(secondMotionVO_form.getSignFilePath());
                secondMotionVO_table.setSummaryFilePath(secondMotionVO_form.getSummaryFilePath());
            }
            System.out.println("secondMotionVOList:"+secondMotionVOList);
            secondMotionService.add(secondMotionVOList);
        } catch (SecondMotionException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject SecondMotionVO secondMotionVO)throws SecondMotionException{



        //没有保存直接提交
        try {
            System.out.println("提交");
            //获取表单数据
            SecondMotionVO secondMotionVO_form = secondMotionVO.getReq().get(0);


            //获取表格数据
            List<SecondMotionVO> secondMotionVOList = secondMotionVO.getInfos();

            for(SecondMotionVO secondMotionVO_table:secondMotionVOList){
                secondMotionVO_table.setMeetingDate(secondMotionVO_form.getMeetingDate());
                secondMotionVO_table.setHost(secondMotionVO_form.getHost());
                secondMotionVO_table.setDueNumber(secondMotionVO_form.getDueNumber());
                secondMotionVO_table.setActualNumber(secondMotionVO_form.getActualNumber());
                secondMotionVO_table.setSummaryNumber(secondMotionVO_form.getSummaryNumber());
                secondMotionVO_table.setSignFilePath(secondMotionVO_form.getSignFilePath());
                secondMotionVO_table.setSummaryFilePath(secondMotionVO_form.getSummaryFilePath());
            }
            System.out.println("secondMotionVOList:"+secondMotionVOList);
            secondMotionService.add(secondMotionVOList);
            //根据ID 更新到流程表字段
            secondMotionService.updateSysFlowByUserID(secondMotionVOList);

            //任职单位更新(选择了 '是' 才更新)
        } catch (SecondMotionException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }




    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void update(ApplicationContext context, @ParameterObject SecondMotionVO secondMotionVO)throws SecondMotionException{
        System.out.println("updateByIdNewPosition"+secondMotionVO);
        secondMotionService.updateNewPositionById(secondMotionVO.getInfos().get(0));

    }



}
