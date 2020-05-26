package com.nantian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.*;
import com.nantian.exception.SysOperatLogException;
import com.nantian.mapper.sys.SysOperatLogMapper;
import com.nantian.mapper.sys.SysPermissionMapper;
import com.nantian.service.CacheService;
import com.nantian.service.OperatService;
import com.nantian.service.PermissionService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.vo.OperatLogVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.OperationsException;
import java.util.Date;
import java.util.List;

/**
 * <p>ClassName: OperatServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class OperatServiceImpl implements OperatService {
    private static Logger log = LoggerFactory.getLogger (OperatServiceImpl.class);

    @Autowired
    private SysOperatLogMapper operatLogMapper;

    @Autowired
    private CacheService cacheService;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addOperatRecord() {
        ApplicationContext context = ApplicationContext.getContext ();
        OperatLogVO operatLogVO = new OperatLogVO ();
        operatLogVO.setAccount (cacheService.getCurrentUserInfo ().getUsername ());
        operatLogVO.setChannel (context.getChannel ());
        operatLogVO.setIpAddress (context.getIp ());
        operatLogVO.setPush (context.getPushName());
        operatLogVO.setCreationTime (new Date ());
        operatLogVO.setTransCode (context.getTransCode ());
        SysOperatLog sysOperatLog = getOperaRecord (operatLogVO);
        operatLogMapper.insertSelective (sysOperatLog);
    }

    /**
     * 组装数据对象
     *
     * @param operatLogVO
     * @return
     */
    private SysOperatLog getOperaRecord(OperatLogVO operatLogVO) {
        SysOrg org = cacheService.getCurrentOrgInfo();
        SysOperatLog sysOperatLog = new SysOperatLog ();
        SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake ();
        sysOperatLog.setId (snowflakeIdUtils.nextId ());
        sysOperatLog.setAccount (operatLogVO.getAccount ());
        sysOperatLog.setChannel (operatLogVO.getChannel ());
        sysOperatLog.setIpAddress (operatLogVO.getIpAddress ());
        sysOperatLog.setPush (operatLogVO.getPush ());
        sysOperatLog.setTransCode (operatLogVO.getTransCode ());
        sysOperatLog.setExtend1 (operatLogVO.getExtend1 ());
        sysOperatLog.setExtend2 (operatLogVO.getExtend2 ());
        sysOperatLog.setCreationTime (operatLogVO.getCreationTime ());
        sysOperatLog.setPath (org.getPath());

        return sysOperatLog;
    }

    @Override
    public Page<SysOperatLog> query(OperatLogVO operatLogVO, int page, int limit) {
        SysOperatLogExample operatLogExample = new SysOperatLogExample ();
        SysOperatLogExample.Criteria criteria = operatLogExample.createCriteria ();

        if (operatLogVO != null && StringUtils.isNotBlank (operatLogVO.getAccount ())) {
            criteria.andAccountLike (operatLogVO.getAccount ());
        }

        if (operatLogVO != null && StringUtils.isNotBlank (operatLogVO.getIpAddress ())) {
            criteria.andIpAddressLike (operatLogVO.getIpAddress ());
        }
        operatLogExample.setOrderByClause("creation_time desc");
        PageHelper.startPage (page, limit);
        Page<SysOperatLog> sysOperatLogs = (Page<SysOperatLog>) operatLogMapper.selectByExample (operatLogExample);
        return sysOperatLogs;
    }
}
