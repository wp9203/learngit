package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.OutGoingInspectionException;
import com.nantian.mapper.sys.SysComplianceDepOpMapper;
import com.nantian.mapper.sys.SysOutgoingInspectionMapper;
import com.nantian.service.ComplianceDepOpService;
import com.nantian.service.OutGoingInspectionService;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.OutGoingInspectionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class OutGoingInspectionServiceImpl implements OutGoingInspectionService {
    @Autowired
    SysOutgoingInspectionMapper sysOutgoingInspectionMapper;

    @Override
    public void add(OutGoingInspectionVO outGoingInspectionVO) throws OutGoingInspectionException {
              SysOutgoingInspection sysOutgoingInspection = new SysOutgoingInspection();
              sysOutgoingInspection.setId(outGoingInspectionVO.getId());
              sysOutgoingInspection.setCandidateName(outGoingInspectionVO.getCandidateName());
              sysOutgoingInspection.setCheckDate(outGoingInspectionVO.getCheckDate());
              sysOutgoingInspection.setCheckConclusion(outGoingInspectionVO.getCheckConclusion());
              sysOutgoingInspection.setCheckData(outGoingInspectionVO.getCheckData());

              SysOutgoingInspectionExample example = new SysOutgoingInspectionExample();
              example.createCriteria().andIdEqualTo(outGoingInspectionVO.getId());
              Long count = sysOutgoingInspectionMapper.countByExample(example);

              if(count > 0 ){
                  sysOutgoingInspection.setUpdateTime(new Date());
                  sysOutgoingInspectionMapper.updateByPrimaryKeySelective(sysOutgoingInspection);
              } else {
                  sysOutgoingInspection.setCreationTime(new Date());
                  sysOutgoingInspectionMapper.insertSelective(sysOutgoingInspection);
              }

    }

    @Override
    public SysOutgoingInspection queryById(Long id) throws OutGoingInspectionException {
        SysOutgoingInspectionExample example = new SysOutgoingInspectionExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysOutgoingInspection> sysOutgoingInspectionList = sysOutgoingInspectionMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysOutgoingInspectionList)) {
            return null;
        }
        return sysOutgoingInspectionList.get(0);
    }

    @Override
    public void updateSysFlowByUserID(List<OutGoingInspectionVO> outGoingInspectionVOList) throws OutGoingInspectionException {
        for(int i=0;i<outGoingInspectionVOList.size();i++){
            SysFlow sysFlow = new SysFlow();
            SysOutgoingInspection sysOutgoingInspection = querySysOutGoingInspection(outGoingInspectionVOList.get(i).getId());
            sysFlow.setUserid(sysOutgoingInspection.getId());
            sysFlow.setOutgoingInspectionId(sysOutgoingInspection.getId());
            sysFlow.setStep13("13");
            sysFlow.setOutgoingInspectionResult(new SimpleDateFormat("yyyy-MM-dd").format(sysOutgoingInspection.getCheckDate()));
            sysOutgoingInspectionMapper.updateByUserId(sysFlow);
        }
    }

    public SysOutgoingInspection querySysOutGoingInspection(Long id)throws OutGoingInspectionException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysOutgoingInspectionMapper.selectByPrimaryKey(id);
    }
}

