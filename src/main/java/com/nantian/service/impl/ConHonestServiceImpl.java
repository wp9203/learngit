package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.ConHonestException;
import com.nantian.mapper.sys.SysConHonestMapper;
import com.nantian.service.ConHonestService;
import com.nantian.vo.ConHonestVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ConHonestServiceImpl implements ConHonestService {
    @Autowired
    SysConHonestMapper sysConHonestMapper;

    @Override
    public void add(ConHonestVO conHonestVO) throws ConHonestException {
        SysConHonest sysConHonest = new SysConHonest();
        sysConHonest.setId(conHonestVO.getId());
        sysConHonest.setCandidateName(conHonestVO.getCandidateName());
        sysConHonest.setConversationDate(conHonestVO.getConversationDate());
        sysConHonest.setConversationPerson(conHonestVO.getConversationPerson());
        sysConHonest.setConversationData(conHonestVO.getConversationData());

        SysConHonestExample example = new SysConHonestExample();
        example.createCriteria().andIdEqualTo(conHonestVO.getId());
        Long count = sysConHonestMapper.countByExample(example);

        if(count > 0 ){
            sysConHonest.setUpdateTime(new Date());
            sysConHonestMapper.updateByPrimaryKeySelective(sysConHonest);
        } else {
            sysConHonest.setCreationTime(new Date());
            sysConHonestMapper.insertSelective(sysConHonest);
        }

    }

    @Override
    public SysConHonest queryById(Long id) throws ConHonestException {
        SysConHonestExample example = new SysConHonestExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysConHonest> sysConHonestList = sysConHonestMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysConHonestList)) {
            return null;
        }
        return sysConHonestList.get(0);
    }

    @Override
    public void updateSysFlowByUserID(List<ConHonestVO> conHonestVOList) throws ConHonestException {
         for(int i =0;i<conHonestVOList.size();i++){
             SysConHonest sysConHonest =querySysConHonest(conHonestVOList.get(i).getId());
             SysFlow sysFlow = new SysFlow();
             sysFlow.setUserid(sysConHonest.getId());
             sysFlow.setConHonestId(sysConHonest.getId());
             sysFlow.setStep15("15");
             sysFlow.setConHonestResult(new SimpleDateFormat("yyyy-MM-dd").format(sysConHonest.getConversationDate()));
             sysConHonestMapper.updateByUserId(sysFlow);

         }
    }

    public SysConHonest querySysConHonest(Long id)throws ConHonestException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysConHonestMapper.selectByPrimaryKey(id);
    }
}

