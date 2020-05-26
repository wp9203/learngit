package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.AppBankingSupervisionException;
import com.nantian.exception.ConHonestException;
import com.nantian.mapper.sys.SysAppBankingSupervisionMapper;
import com.nantian.mapper.sys.SysConHonestMapper;
import com.nantian.service.AppBankingSupervisionService;
import com.nantian.service.ConHonestService;
import com.nantian.vo.AppBankingSupervisionVO;
import com.nantian.vo.ConHonestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AppBankingSupervisionServiceImpl implements AppBankingSupervisionService {
    @Autowired
    SysAppBankingSupervisionMapper sysAppBankingSupervisionMapper;

    @Override
    public void add(AppBankingSupervisionVO appBankingSupervisionVO) throws AppBankingSupervisionException {
        SysAppBankingSupervision sysAppBankingSupervision = new SysAppBankingSupervision();

        sysAppBankingSupervision.setId(appBankingSupervisionVO.getId());
        sysAppBankingSupervision.setCandidateName(appBankingSupervisionVO.getCandidateName());
        sysAppBankingSupervision.setUnit(appBankingSupervisionVO.getUnit());
        sysAppBankingSupervision.setPosition(appBankingSupervisionVO.getPosition());
        sysAppBankingSupervision.setApprove(appBankingSupervisionVO.getApprove());
        sysAppBankingSupervision.setApprovalDate(appBankingSupervisionVO.getApprovalDate());
        sysAppBankingSupervision.setApprovalNumber(appBankingSupervisionVO.getApprovalNumber());
        sysAppBankingSupervision.setPass(appBankingSupervisionVO.getPass());
        sysAppBankingSupervision.setReplyDate(appBankingSupervisionVO.getReplyDate());
        sysAppBankingSupervision.setReplyNumber(appBankingSupervisionVO.getReplyNumber());
        sysAppBankingSupervision.setReplyData(appBankingSupervisionVO.getReplyData());

        SysAppBankingSupervisionExample example = new SysAppBankingSupervisionExample();
        example.createCriteria().andIdEqualTo(appBankingSupervisionVO.getId());
        Long count = sysAppBankingSupervisionMapper.countByExample(example);

        if(count > 0 ){
            sysAppBankingSupervision.setUpdateTime(new Date());
            sysAppBankingSupervisionMapper.updateByPrimaryKeySelective(sysAppBankingSupervision);
        } else {
            sysAppBankingSupervision.setCreationTime(new Date());
            sysAppBankingSupervisionMapper.insertSelective(sysAppBankingSupervision);
        }

    }

    @Override
    public SysAppBankingSupervision queryById(Long id) throws AppBankingSupervisionException {
        SysAppBankingSupervisionExample example = new SysAppBankingSupervisionExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysAppBankingSupervision> sysAppBankingSupervisionList = sysAppBankingSupervisionMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysAppBankingSupervisionList)) {
            return null;
        }
        return sysAppBankingSupervisionList.get(0);
    }

    @Override
    public void updateSysFlowByUserID(List<AppBankingSupervisionVO> appBankingSupervisionVOList) throws AppBankingSupervisionException {
         for(int i =0;i<appBankingSupervisionVOList.size();i++){
             SysAppBankingSupervision sysAppBankingSupervision
                     =querySysAppBankingSupervision(appBankingSupervisionVOList.get(i).getId());
             SysFlow sysFlow = new SysFlow();

             if(sysAppBankingSupervision.getApprove().equals("1")){//获取需要核准

                 sysFlow.setAppBankingSupervisionResult(
                         new SimpleDateFormat("yyyy-MM-dd").format(sysAppBankingSupervision.getReplyDate()));
                 sysFlow.setUserid(sysAppBankingSupervision.getId());
                 sysFlow.setAppBankingSupervisionId(sysAppBankingSupervision.getId());
                 sysFlow.setStep16("16");
                 if(sysAppBankingSupervision.getPass().equals("2")){
                     sysFlow.setFlowStatus("1"); //设置为已完成 无后续流程
                     sysFlow.setStep16("");
                 }
             }else{ //不需要核准
                 sysFlow.setStep16("16");
                 sysFlow.setUserid(sysAppBankingSupervision.getId());
                 sysFlow.setAppBankingSupervisionId(sysAppBankingSupervision.getId());
                 sysFlow.setAppBankingSupervisionResult("否");

             }
             sysFlow.setStep16("16");
             sysAppBankingSupervisionMapper.updateByUserId(sysFlow);

         }
    }

    public SysAppBankingSupervision querySysAppBankingSupervision(Long id)throws AppBankingSupervisionException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysAppBankingSupervisionMapper.selectByPrimaryKey(id);
    }
}

