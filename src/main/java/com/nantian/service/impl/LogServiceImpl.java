package com.nantian.service.impl;

import com.nantian.entity.sys.SysLoginLog;
import com.nantian.entity.sys.SysOrg;
import com.nantian.exception.SysOperatLogException;
import com.nantian.mapper.sys.SysLoginLogMapper;
import com.nantian.service.CacheService;
import com.nantian.service.LogService;
import com.nantian.service.OperatService;
import com.nantian.util.SnowflakeIdUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;


/**
 * <p>ClassName: LogServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-01</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class LogServiceImpl implements LogService {

    private static Logger log = LoggerFactory.getLogger (LogServiceImpl.class);

    @Autowired
    SysLoginLogMapper loginLogMapper;

    @Autowired
    OperatService operatService;
    @Autowired
    CacheService cacheService;


    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addLoginRecord(String username, String ip, String equipment) {
        SysOrg org = cacheService.getCurrentOrgInfo();
        SysLoginLog loginLog = new SysLoginLog ();
        loginLog.setId (SnowflakeIdUtils.getSnowflake ().nextId ());
        loginLog.setUsername (username);
        loginLog.setIpAddress (ip);
        loginLog.setEquipment (equipment);
        loginLog.setCreationTime (new Date ());
        loginLog.setPath(org.getPath());
        loginLogMapper.insert (loginLog);
    }
}
