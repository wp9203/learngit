package com.nantian.service.impl;


import com.nantian.common.util.CollectionUtils;
import com.nantian.entity.sys.*;
import com.nantian.exception.InspectArchivesException;
import com.nantian.exception.SecondMotionException;
import com.nantian.mapper.sys.SysInspectArchivesMapper;

import com.nantian.mapper.sys.SysSecondMotionMapper;
import com.nantian.service.InspectArchivesService;
import com.nantian.service.SecondMotionService;
import com.nantian.vo.InspectArchivesVO;
import com.nantian.vo.SecondMotionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class SecondMotionServiceImpl implements SecondMotionService {
    @Autowired
    SysSecondMotionMapper sysSecondMotionMapper;


    @Override
    public void add(List<SecondMotionVO> secondMotionVOs) throws SecondMotionException {
        for(int i=0;i<secondMotionVOs.size();i++){
            SecondMotionVO secondMotionVO = secondMotionVOs.get(i);
            SysSecondMotion sysSecondMotion = new SysSecondMotion();
            sysSecondMotion.setId(secondMotionVO.getId());
            sysSecondMotion.setCandidateName(secondMotionVO.getCandidateName());
            sysSecondMotion.setDueNumber(secondMotionVO.getDueNumber());
            sysSecondMotion.setActualNumber(secondMotionVO.getActualNumber());
            sysSecondMotion.setSummaryNumber(secondMotionVO.getSummaryNumber());
            sysSecondMotion.setSignFilePath(secondMotionVO.getSignFilePath());
            sysSecondMotion.setSummaryFilePath(secondMotionVO.getSummaryFilePath());
            sysSecondMotion.setHost(secondMotionVO.getHost());
            sysSecondMotion.setMeetingDate(secondMotionVO.getMeetingDate());
            sysSecondMotion.setUnit(secondMotionVO.getUnit());
            sysSecondMotion.setPosition(secondMotionVO.getPosition());
            sysSecondMotion.setPositionLevel(secondMotionVO.getPositionLevel());
            sysSecondMotion.setNote(secondMotionVO.getNote());
            sysSecondMotion.setPass(secondMotionVO.getPass());
            sysSecondMotion.setNewPosition(secondMotionVO.getNewPosition());

            //判断是否在数据已经存在该数据记录的ID
            SysSecondMotionExample sysSecondMotionExample = new SysSecondMotionExample();
            sysSecondMotionExample.createCriteria().andIdEqualTo(secondMotionVO.getId());
            Long count  = sysSecondMotionMapper.countByExample(sysSecondMotionExample);

            if(count > 0){//存在  更新
                sysSecondMotion.setUpdateTime(new Date());
                sysSecondMotionMapper.updateByPrimaryKeySelective(sysSecondMotion);
            } else{ //插入
                sysSecondMotion.setCreationTime(new Date());
                sysSecondMotionMapper.insertSelective(sysSecondMotion);
            }
        }
    }

    @Override
    public void submit(SecondMotionVO secondMotionVOs) throws SecondMotionException {

    }

    @Override
    public SysSecondMotion queryById(Long id) throws SecondMotionException {
        SysSecondMotionExample example = new SysSecondMotionExample();
        example.createCriteria().andIdEqualTo(id);
        List<SysSecondMotion> sysSecondMotionList = sysSecondMotionMapper.selectByExample(example);
        if (CollectionUtils.isEmpty(sysSecondMotionList)) {
            return null;
        }
        return sysSecondMotionList.get(0);
    }

    @Override
    public void updateSysFlowByUserID(List<SecondMotionVO> secondMotionVOList) throws SecondMotionException {
        for(int i = 0;i < secondMotionVOList.size();i++){
            SecondMotionVO secondMotionVO = secondMotionVOList.get(i);
            SysSecondMotion sysSecondMotion = querySysSecondMotion(secondMotionVO.getId());
            SysFlow sysFlow = new SysFlow();
            sysFlow.setUserid(sysSecondMotion.getId());
            sysFlow.setStep9("9");
            sysFlow.setSecondMotionId(sysSecondMotion.getId());
            //首页显示党委会时间（? 对于未通过 的 首页该字段如何显示 ）
            sysFlow.setSecondMotionResult(new SimpleDateFormat("yyyy-MM-dd").
                    format(sysSecondMotion.getMeetingDate()));
            //获取pass 字段值
            String  pass = secondMotionVO.getPass();
            if(pass.equals("2")){ // 会议没有通过  记录自动完结
                sysFlow.setFlowStatus("1");
                //对于未通过 的 首页该字段如何显示   --- 此处修改首页 字段的显示
                sysFlow.setStep9("");
            }

            sysSecondMotionMapper.updateByUserId(sysFlow);

        }
    }

    @Override
    public void updateNewPositionById(SecondMotionVO secondMotionVO) throws SecondMotionException {
        SysSecondMotion sysSecondMotion = new SysSecondMotion();
        sysSecondMotion.setId(secondMotionVO.getId());
        sysSecondMotion.setNewPosition(secondMotionVO.getNewPosition());

        //判断是否在数据已经存在该数据记录的ID
        SysSecondMotionExample sysSecondMotionExample = new SysSecondMotionExample();
        sysSecondMotionExample.createCriteria().andIdEqualTo(secondMotionVO.getId());
        Long count  = sysSecondMotionMapper.countByExample(sysSecondMotionExample);
        if(count > 0){//存在  更新
            sysSecondMotion.setUpdateTime(new Date());
            sysSecondMotionMapper.updateByPrimaryKeySelective(sysSecondMotion);
        } else{ //插入
            sysSecondMotion.setCreationTime(new Date());
            sysSecondMotionMapper.insertSelective(sysSecondMotion);
        }



    }

    public SysSecondMotion querySysSecondMotion(Long id) throws SecondMotionException{
        return sysSecondMotionMapper.selectByPrimaryKey(id);
    }
}

