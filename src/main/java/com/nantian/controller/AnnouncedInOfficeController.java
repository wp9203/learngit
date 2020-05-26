package com.nantian.controller;


import com.nantian.easytrade.annotation.ParameterObject;
import com.nantian.easytrade.annotation.Push;
import com.nantian.easytrade.annotation.Trade;
import com.nantian.easytrade.enumeration.ParamFormatEnum;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysAnnouncedInOffice;
import com.nantian.entity.sys.SysAppBankingSupervision;
import com.nantian.entity.sys.SysCandidateInfo;
import com.nantian.enumeration.ErrorCodeEnum;
import com.nantian.exception.AnnouncedInOfficeException;
import com.nantian.exception.AppBankingSupervisionException;
import com.nantian.service.AnnouncedInOfficeService;
import com.nantian.service.AppBankingSupervisionService;
import com.nantian.service.CandidateInfoService;
import com.nantian.vo.AnnouncedInOfficeVO;
import com.nantian.vo.AppBankingSupervisionVO;
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

@Trade(channel = "api", transCode = "announcedInOffice")
public class AnnouncedInOfficeController {
    private static Logger log= LoggerFactory.getLogger(AnnouncedInOfficeController.class);
    @Autowired
    CandidateInfoService candidateInfoService;
    @Autowired
    AnnouncedInOfficeService announcedInOfficeService;


    /**
     * 根据ID查询表中数据
     * @param context
     * @param announcedInOfficeVO
     */
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void queryByIds(ApplicationContext context,@ParameterObject AnnouncedInOfficeVO announcedInOfficeVO)throws AnnouncedInOfficeException {
        try{
            List<SysAnnouncedInOffice> sysAnnouncedInOfficeList = new ArrayList<>();
            List<SysAnnouncedInOffice> sysAnnouncedInOfficeList1 = new ArrayList<>();

            List<Long> ids = announcedInOfficeVO.getIds();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);

                SysAnnouncedInOffice sysAnnouncedInOffice = announcedInOfficeService.queryById(id);
                System.out.println("sysAnnouncedInOffice:"+sysAnnouncedInOffice);
                if(sysAnnouncedInOffice != null){
                    sysAnnouncedInOfficeList1.add(sysAnnouncedInOffice);
                }

            }
            List<SysAnnouncedInOffice> sysAnnouncedInOfficeList2 = new ArrayList<>();
            for(int i = 0 ;i<ids.size();i++){
                Long id = ids.get(i);
                //页面显示的任职单位，任职职务，任职职等 均为调整的 所以从竞聘表中查询
                SysCandidateInfo sysCandidateInfo =  candidateInfoService.queryCandidateInfoById(id);
                System.out.println(sysCandidateInfo);
                System.out.println("2");
                SysAnnouncedInOffice sysAnnouncedInOffice = new SysAnnouncedInOffice();
                sysAnnouncedInOffice.setId(sysCandidateInfo.getId());
                sysAnnouncedInOffice.setCandidateName(sysCandidateInfo.getCandidateName());

                sysAnnouncedInOffice.setUnit(sysCandidateInfo.getUnit());//原单位
                sysAnnouncedInOffice.setPosition(sysCandidateInfo.getPosition());//原职务
                sysAnnouncedInOffice.setPositionLevel(sysCandidateInfo.getPositionLevel());//原职等

                sysAnnouncedInOffice.setAspiringUnit(sysCandidateInfo.getAspiringUnit());//调整单位
                sysAnnouncedInOffice.setAspiringPosition(sysCandidateInfo.getAspiringPosition());//调整职务
                sysAnnouncedInOffice.setAspiringPositionLevel(sysCandidateInfo.getAspiringPositionLevel());//调整职等

                sysAnnouncedInOffice.setNote(sysCandidateInfo.getNote()); //备注

                System.out.println("sysAnnouncedInOffice:"+sysAnnouncedInOffice);
                sysAnnouncedInOfficeList2.add(sysAnnouncedInOffice);
            }
            System.out.println("sysAnnouncedInOfficeList1:"+sysAnnouncedInOfficeList1+"size():"+sysAnnouncedInOfficeList1.size());
            if(sysAnnouncedInOfficeList1.size()>0){
                for(int i =0; i<sysAnnouncedInOfficeList1.size();i++){//根据集合1 元素的id去删除集合2 中相同id 的元素
                    Long id1 = sysAnnouncedInOfficeList1.get(i).getId();
                    for(int k = 0 ;k<sysAnnouncedInOfficeList2.size();k++){
                        Long id2 = sysAnnouncedInOfficeList2.get(k).getId();
                        if(id2.equals(id1)){
                            sysAnnouncedInOfficeList2.remove(k);
                            k--;
                        }
                    }
                }
                System.out.println("集合2的长度："+sysAnnouncedInOfficeList2.size());
                //合并两个集合 list2 与 sysInspectArchivesList;
                sysAnnouncedInOfficeList.addAll(sysAnnouncedInOfficeList1);
                if(sysAnnouncedInOfficeList2.size()>0){
                    sysAnnouncedInOfficeList.addAll(sysAnnouncedInOfficeList2);
                }
                System.out.println("合并："+sysAnnouncedInOfficeList);
            }else{ //若集合1 无数据 则直接将集合2放入 返回数据集合中
                sysAnnouncedInOfficeList.addAll(sysAnnouncedInOfficeList2);
            }
            System.out.println(sysAnnouncedInOfficeList);
            context.setRstObject("data", sysAnnouncedInOfficeList);
        }catch(AnnouncedInOfficeException e){
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }


    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void add(ApplicationContext context, @ParameterObject AnnouncedInOfficeVO announcedInOfficeVO)throws AnnouncedInOfficeException{

        //获取表格数据
        List<AnnouncedInOfficeVO> announcedInOfficeVOList = announcedInOfficeVO.getInfos();
        try {
            System.out.println("announcedInOfficeVOList:"+announcedInOfficeVOList);
            for(int i = 0;i < announcedInOfficeVOList.size();i++){
                announcedInOfficeService.add(announcedInOfficeVOList.get(i));
            }
        } catch (AnnouncedInOfficeException e) {
            context.setErrorMsg(ErrorCodeEnum.ERROR.getErrcode(), ErrorCodeEnum.ERROR.getErrmsg());
            log.error(e.getMessage(), e);
        }

    }
    @Push(requestFormat = ParamFormatEnum.JSON)
    public void submit(ApplicationContext context, @ParameterObject AnnouncedInOfficeVO announcedInOfficeVO)throws AnnouncedInOfficeException{

        System.out.println("提交");
        //获取表格数据
        List<AnnouncedInOfficeVO> announcedInOfficeVOList = announcedInOfficeVO.getInfos();

        //没有保存直接提交
        try {
            System.out.println("announcedInOfficeVOList:"+announcedInOfficeVOList);
            for(int i = 0;i < announcedInOfficeVOList.size();i++){
                announcedInOfficeService.add(announcedInOfficeVOList.get(i));
            }
            //根据ID 更新到流程表字段
            announcedInOfficeService.updateSysFlowByUserID(announcedInOfficeVOList);
        } catch (AnnouncedInOfficeException e) {
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
