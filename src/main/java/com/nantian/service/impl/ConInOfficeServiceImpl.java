package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.ConInOfficeException;
import com.nantian.mapper.sys.SysConInOfficeMapper;
import com.nantian.service.ConInOfficeService;
import com.nantian.vo.ConInOfficeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class ConInOfficeServiceImpl implements ConInOfficeService {
    @Autowired
    SysConInOfficeMapper sysConInOfficeMapper;

    @Override
    public void add(ConInOfficeVO conInOfficeVO) throws ConInOfficeException {
        SysConInOffice sysConInOffice = new SysConInOffice();
        sysConInOffice.setId(conInOfficeVO.getId());
        sysConInOffice.setCandidateName(conInOfficeVO.getCandidateName());
        sysConInOffice.setConversationDate(conInOfficeVO.getConversationDate());
        sysConInOffice.setConversationPerson(conInOfficeVO.getConversationPerson());
        sysConInOffice.setConversationRecord(conInOfficeVO.getConversationRecord());

        SysConInOfficeExample example = new SysConInOfficeExample();
        example.createCriteria().andIdEqualTo(conInOfficeVO.getId());
        Long count = sysConInOfficeMapper.countByExample(example);

        if(count > 0 ){
            sysConInOffice.setUpdateTime(new Date());
            sysConInOfficeMapper.updateByPrimaryKeySelective(sysConInOffice);
        } else {
            sysConInOffice.setCreationTime(new Date());
            sysConInOfficeMapper.insertSelective(sysConInOffice);
        }

    }

    @Override
    public SysConInOffice queryById(Long id) throws ConInOfficeException {
        SysConInOfficeExample example = new SysConInOfficeExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysConInOffice> sysConInOfficeList = sysConInOfficeMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysConInOfficeList)) {
            return null;
        }
        return sysConInOfficeList.get(0);
    }

    @Override
    public void updateSysFlowByUserID(List<ConInOfficeVO> conInOfficeVOList) throws ConInOfficeException {
         for(int i =0;i<conInOfficeVOList.size();i++){
             SysConInOffice sysConInOffice =querySysConInOffice(conInOfficeVOList.get(i).getId());
             SysFlow sysFlow = new SysFlow();
             sysFlow.setUserid(sysConInOffice.getId());
             sysFlow.setConInOfficeId(sysConInOffice.getId());
             sysFlow.setStep14("14");
             sysFlow.setConInOfficeResult(new SimpleDateFormat("yyyy-MM-dd").format(sysConInOffice.getConversationDate()));
             sysConInOfficeMapper.updateByUserId(sysFlow);

         }
    }

    public SysConInOffice querySysConInOffice(Long id)throws ConInOfficeException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysConInOfficeMapper.selectByPrimaryKey(id);
    }
}

