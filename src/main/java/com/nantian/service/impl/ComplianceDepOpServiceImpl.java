package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.ComplianceDepOpException;
import com.nantian.exception.InspectArchivesException;
import com.nantian.mapper.sys.SysComplianceDepOpMapper;
import com.nantian.mapper.sys.SysFlowMapper;
import com.nantian.mapper.sys.SysInspectArchivesMapper;
import com.nantian.mapper.sys.SysUnitRecommendedMapper;
import com.nantian.service.ComplianceDepOpService;
import com.nantian.service.InspectArchivesService;
import com.nantian.vo.ComplianceDepOpVO;
import com.nantian.vo.InspectArchivesVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ComplianceDepOpServiceImpl implements ComplianceDepOpService {

    private static Logger log = LoggerFactory.getLogger(ComplianceDepOpServiceImpl.class);
    @Autowired
    SysComplianceDepOpMapper sysComplianceDepOpMapper;



    @Override
    public void add(ComplianceDepOpVO complianceDepOpVO) throws ComplianceDepOpException {
        SysComplianceDepOp sysComplianceDepOp = new SysComplianceDepOp();
        sysComplianceDepOp.setId(complianceDepOpVO.getId());
        sysComplianceDepOp.setCandidateName(complianceDepOpVO.getCandidateName());
        sysComplianceDepOp.setReplyTime(complianceDepOpVO.getReplyTime());
        sysComplianceDepOp.setReplyOpinion(complianceDepOpVO.getReplyOpinion());
        sysComplianceDepOp.setReplyNumber(complianceDepOpVO.getReplyNumber());
        sysComplianceDepOp.setReplyData(complianceDepOpVO.getReplyData());
        //判断是否在数据已经存在该数据记录的ID
        SysComplianceDepOpExample example = new SysComplianceDepOpExample();
        example.createCriteria().andIdEqualTo(complianceDepOpVO.getId());
        Long count = sysComplianceDepOpMapper.countByExample(example);
        if(count > 0 ){// 存在 更新
            sysComplianceDepOp.setUpdateTime(new Date());
            sysComplianceDepOpMapper.updateByPrimaryKeySelective(sysComplianceDepOp);
        }else{// 新增
            sysComplianceDepOp.setCreationTime(new Date());
            sysComplianceDepOpMapper.insertSelective(sysComplianceDepOp);
        }
    }

    @Override
    public void submit(ComplianceDepOpVO complianceDepOpVO) throws ComplianceDepOpException {

    }

    @Override
    public SysComplianceDepOp queryById(Long id) throws ComplianceDepOpException {
        SysComplianceDepOpExample example = new SysComplianceDepOpExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysComplianceDepOp> sysComplianceDepOpList = sysComplianceDepOpMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysComplianceDepOpList)) {
            return null;
        }
        return sysComplianceDepOpList.get(0);
    }


    @Override
    public void updateSysFlowByUserID(List<ComplianceDepOpVO> complianceDepOpVOList) throws ComplianceDepOpException {
        for(int i = 0;i < complianceDepOpVOList.size();i++){
            SysFlow sysFlow = new SysFlow();
            SysComplianceDepOp sysComplianceDepOp = querySysComplianceDepOp(complianceDepOpVOList.get(i).getId());
            sysFlow.setUserid(sysComplianceDepOp.getId());
            sysFlow.setStep8("8");
            sysFlow.setComplianceDepOpId(sysComplianceDepOp.getId());
//            if(complianceDepOpVOList.get(i).getUpdateTime()==null){
//                sysFlow.setComplianceDepOpResult(new SimpleDateFormat("yyyy-MM-dd").format(sysComplianceDepOp.getCreationTime()));
//            }else{
//                sysFlow.setComplianceDepOpResult(new SimpleDateFormat("yyyy-MM-dd").format(sysComplianceDepOp.getUpdateTime()));
//
//            }
            //首页显示函复时间
            sysFlow.setComplianceDepOpResult(new SimpleDateFormat("yyyy-MM-dd").format(sysComplianceDepOp.getReplyTime()));
            sysComplianceDepOpMapper.updateByUserId(sysFlow);
        }
    }


    public SysComplianceDepOp querySysComplianceDepOp(Long id)throws ComplianceDepOpException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysComplianceDepOpMapper.selectByPrimaryKey(id);
    }
}

