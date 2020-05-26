package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.AnnouncedInOfficeException;
import com.nantian.exception.AppBankingSupervisionException;
import com.nantian.mapper.sys.SysAnnouncedInOfficeMapper;
import com.nantian.mapper.sys.SysAppBankingSupervisionMapper;
import com.nantian.service.AnnouncedInOfficeService;
import com.nantian.service.AppBankingSupervisionService;
import com.nantian.vo.AnnouncedInOfficeVO;
import com.nantian.vo.AppBankingSupervisionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class AnnouncedInOfficeServiceImpl implements AnnouncedInOfficeService {
    @Autowired
    SysAnnouncedInOfficeMapper sysAnnouncedInOfficeMapper;

    @Override
    public void add(AnnouncedInOfficeVO announcedInOfficeVO) throws AnnouncedInOfficeException {
        SysAnnouncedInOffice sysAnnouncedInOffice = new SysAnnouncedInOffice();

        sysAnnouncedInOffice.setId(announcedInOfficeVO.getId());
        sysAnnouncedInOffice.setCandidateName(announcedInOfficeVO.getCandidateName());
        sysAnnouncedInOffice.setUnit(announcedInOfficeVO.getUnit()); //原单位
        sysAnnouncedInOffice.setPosition(announcedInOfficeVO.getPosition()); //原职务
        sysAnnouncedInOffice.setPositionLevel(announcedInOfficeVO.getPositionLevel());//原职等

        sysAnnouncedInOffice.setAspiringUnit(announcedInOfficeVO.getAspiringUnit());//调整单位
        sysAnnouncedInOffice.setAspiringPosition(announcedInOfficeVO.getAspiringPosition());//调整职务
        sysAnnouncedInOffice.setAspiringPositionLevel(announcedInOfficeVO.getAspiringPositionLevel());//调整职等

        sysAnnouncedInOffice.setNote(announcedInOfficeVO.getNote()); //备注
        sysAnnouncedInOffice.setAnnounceTime(announcedInOfficeVO.getAnnounceTime()); //宣布时间
        sysAnnouncedInOffice.setAnnouncePerson(announcedInOfficeVO.getAnnouncePerson());//宣布人

        SysAnnouncedInOfficeExample example = new SysAnnouncedInOfficeExample();
        example.createCriteria().andIdEqualTo(announcedInOfficeVO.getId());
        Long count = sysAnnouncedInOfficeMapper.countByExample(example);

        if(count > 0 ){
            sysAnnouncedInOffice.setUpdateTime(new Date());
            sysAnnouncedInOfficeMapper.updateByPrimaryKeySelective(sysAnnouncedInOffice);
        } else {
            sysAnnouncedInOffice.setCreationTime(new Date());
            sysAnnouncedInOfficeMapper.insertSelective(sysAnnouncedInOffice);
        }

    }

    @Override
    public SysAnnouncedInOffice queryById(Long id) throws AnnouncedInOfficeException {
        SysAnnouncedInOfficeExample example = new SysAnnouncedInOfficeExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysAnnouncedInOffice> sysAnnouncedInOfficeList = sysAnnouncedInOfficeMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysAnnouncedInOfficeList)) {
            return null;
        }
        return sysAnnouncedInOfficeList.get(0);
    }

    @Override
    public void updateSysFlowByUserID(List<AnnouncedInOfficeVO> announcedInOfficeVOList) throws AnnouncedInOfficeException {
         for(int i =0;i<announcedInOfficeVOList.size();i++){
             SysAnnouncedInOffice sysAnnouncedInOffice
                     =querySysAnnouncedInOffice(announcedInOfficeVOList.get(i).getId());
             SysFlow sysFlow = new SysFlow();
             sysFlow.setUserid(sysAnnouncedInOffice.getId());
             sysFlow.setAnnouncedInOfficeId(sysAnnouncedInOffice.getId());
             sysFlow.setAnnouncedInOfficeResult(
                         new SimpleDateFormat("yyyy-MM-dd").format(sysAnnouncedInOffice.getAnnounceTime()));
             sysFlow.setStep17("17");
             sysAnnouncedInOfficeMapper.updateByUserId(sysFlow);
         }
    }

    public SysAnnouncedInOffice querySysAnnouncedInOffice(Long id)throws AnnouncedInOfficeException{
        //return sysUnitRecommendedMapper.selectByPrimaryKey(id);
        return sysAnnouncedInOfficeMapper.selectByPrimaryKey(id);
    }
}

