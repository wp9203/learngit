package com.nantian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.StringUtils;
import com.nantian.entity.sys.SysFlow;
import com.nantian.entity.sys.SysFlowExample;
import com.nantian.exception.FlowException;
import com.nantian.mapper.sys.SysFlowMapper;
import com.nantian.service.FlowService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.util.SqlUtils;
import com.nantian.vo.FlowVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class FlowServiceImpl implements FlowService {

    private static Logger log = LoggerFactory.getLogger(FlowServiceImpl.class);

    @Autowired
    SysFlowMapper flowMapper;



    @Override
    public Page<SysFlow> query(String flowStatus, String org,String adjustType,String positionLevel,String startDate,
                               String endDate,int page, int limit) {

        SysFlowExample flowExample = new SysFlowExample();
        SysFlowExample.Criteria criteria = flowExample.createCriteria();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");



        if (StringUtils.isNotBlank(flowStatus)) {
            criteria.andFlowStatusLike(SqlUtils.allLike(flowStatus));
        }
        if (StringUtils.isNotBlank(org)) {
            criteria.andOrgLike(org);
        }
        if (StringUtils.isNotBlank(adjustType)) {
            criteria.andAdjustTypeLike(SqlUtils.allLike(adjustType));
        }
        if (StringUtils.isNotBlank(positionLevel)) {
            criteria.andPositionLevelLike(SqlUtils.allLike(positionLevel));
        }
//         时间对比??
        if (StringUtils.isNotBlank(startDate)) {
            try {
                criteria.andStartDateGreaterThanOrEqualTo(sdf.parse(startDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
        if (StringUtils.isNotBlank(endDate)){
            try {
                criteria.andEndDateLessThan(sdf.parse(endDate));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }

        PageHelper.startPage(page, limit);
        Page<SysFlow> flows = (Page<SysFlow>) flowMapper.selectByExample(flowExample);
        return flows;
    }

    @Override
    public void addFlow(FlowVO flowVO) throws FlowException {

        SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
        Long id = snowflakeIdUtils.nextId();
        SysFlow sysFlow=new SysFlow();
        sysFlow.setId(id);
        sysFlow.setUserid(flowVO.getUserid());
        sysFlow.setUsername(flowVO.getUsername());
        sysFlow.setAspiringUnit(flowVO.getAspiring_unit());
        sysFlow.setAspiringPosition(flowVO.getAspiring_position());
        sysFlow.setStep1("1");

        sysFlow.setCreationTime(new Date());
        sysFlow.setStartDate(new Date());

        flowMapper.insertSelective(sysFlow);

    }

}
