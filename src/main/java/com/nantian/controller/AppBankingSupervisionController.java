package com.nantian.controller;


import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysAppBankingSupervision;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.entity.sys.SysConHonest;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.AppBankingSupervisionException;
import com.nantian.exception.ConHonestException;
import com.nantian.service.AppBankingSupervisionService;
import com.nantian.service.CandidateInfoService;
import com.nantian.service.ConHonestService;
import com.nantian.vo.AppBankingSupervisionVO;
import com.nantian.vo.ConHonestVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: UserController</p>
 * <p>Description: 银保监控制器</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2020-04-16</p>
 *
 * @author wp
 * @version 1.0
 */

@Trade(channel = "api", transCode = "appBankingSupervision")
public class AppBankingSupervisionController {
    private static Logger log= LoggerFactory.getLogger(AppBankingSupervisionController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    AppBankingSupervisionService appBankingSupervisionService;


    /**
     * 根据ID查询表中数据
     * @param context
     * @param appBankingSupervisionVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject AppBankingSupervisionVO appBankingSupervisionVO)throws AppBankingSupervisionException {
        try{
            List<SysAppBankingSupervision> sysAppBankingSupervisionList = new ArrayList<>();
            List<SysAppBankingSupervision> sysAppBankingSupervisionList1 = new ArrayList<>();

            List<Long> ids = appBankingSupervisionVO.getIds();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);

                SysAppBankingSupervision sysAppBankingSupervision = appBankingSupervisionService.queryById(id);
                System.out.println("sysAppBankingSupervision:"+sysAppBankingSupervision);
                if(sysAppBankingSupervision != null){
                    sysAppBankingSupervisionList1.add(sysAppBankingSupervision);
                }

            }
            List<SysAppBankingSupervision> sysAppBankingSupervisionList2 = new ArrayList<>();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);
                //页面显示的任职单位，任职职务，任职职等 均为调整的 所以从竞聘表中查询
                SysCandidateInfo sysCandidateInfo =  candidateInfoService.queryCandidateInfoById(id);
                System.out.println(sysCandidateInfo);
                System.out.println("2");
                SysAppBankingSupervision sysAppBankingSupervision = new SysAppBankingSupervision();
                sysAppBankingSupervision.setId(sysCandidateInfo.getId());
                sysAppBankingSupervision.setCandidateName(sysCandidateInfo.getCandidateName());
                sysAppBankingSupervision.setUnit(sysCandidateInfo.getAspiringUnit());//竞聘单位
                sysAppBankingSupervision.setPosition(sysCandidateInfo.getAspiringPosition());//竞聘职务

                System.out.println("sysAppBankingSupervision:"+sysAppBankingSupervision);
                sysAppBankingSupervisionList2.add(sysAppBankingSupervision);
            }
            System.out.println("sysAppBankingSupervisionList1:"+sysAppBankingSupervisionList1+"size():"+sysAppBankingSupervisionList1.size());
            if(sysAppBankingSupervisionList1.size()>0){
                for(int i =0; i<sysAppBankingSupervisionList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                    Long id1 = sysAppBankingSupervisionList1.get(i).getId();
                    for(int k = 0 ;k<sysAppBankingSupervisionList2.size();k++){
                        Long id2 = sysAppBankingSupervisionList2.get(k).getId();
                        if(id2.equals(id1)){
                            sysAppBankingSupervisionList2.remove(k);
                            k--;
                        }
                    }
                }
                System.out.println("集合2的长度："+sysAppBankingSupervisionList1.size());
                //合并两个集合 list2 与 sysInspectArchivesList;
                sysAppBankingSupervisionList.addAll(sysAppBankingSupervisionList1);
                if(sysAppBankingSupervisionList2.size()>0){
                    sysAppBankingSupervisionList.addAll(sysAppBankingSupervisionList2);
                }
                System.out.println("合并："+sysAppBankingSupervisionList2);
            }else{
                sysAppBankingSupervisionList.addAll(sysAppBankingSupervisionList2);
            }
            System.out.println(sysAppBankingSupervisionList);
            context.setRstObject("data", sysAppBankingSupervisionList);
        }catch(AppBankingSupervisionException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }


    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject AppBankingSupervisionVO appBankingSupervisionVO)throws AppBankingSupervisionException{

        //获取表格数据
        List<AppBankingSupervisionVO> appBankingSupervisionVOList = appBankingSupervisionVO.getInfos();
        try {
            System.out.println("appBankingSupervisionVOList:"+appBankingSupervisionVOList);
            for(int i = 0;i < appBankingSupervisionVOList.size();i++){
                appBankingSupervisionService.add(appBankingSupervisionVOList.get(i));
            }
        } catch (AppBankingSupervisionException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject AppBankingSupervisionVO appBankingSupervisionVO)throws AppBankingSupervisionException{

        System.out.println("提交");
        //获取表格数据
        List<AppBankingSupervisionVO> appBankingSupervisionVOList = appBankingSupervisionVO.getInfos();

        //没有保存直接提交
        try {
            System.out.println("appBankingSupervisionVOList:"+appBankingSupervisionVOList);
            for(int i = 0;i < appBankingSupervisionVOList.size();i++){
                appBankingSupervisionService.add(appBankingSupervisionVOList.get(i));
            }
            //根据ID 更新到流程表字段
            appBankingSupervisionService.updateSysFlowByUserID(appBankingSupervisionVOList);
        } catch (AppBankingSupervisionException e) {
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
