package com.nantian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.StringUtils;
import com.nantian.entity.sys.*;
import com.nantian.mapper.sys.SysLoginLogMapper;
import com.nantian.service.*;
import com.nantian.vo.LoginLogVO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.rmi.runtime.Log;

import java.util.LinkedList;
import java.util.List;

/**
 * <p>ClassName: LoginServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class LoginServiceImpl implements LoginService {
    private static Logger log = LoggerFactory.getLogger(LoginServiceImpl.class);

    @Autowired
    RoleService roleService;

    @Autowired
    OrgService orgService;

    @Autowired
    CacheService cacheService;

    @Autowired
    UserService userService;

    @Autowired
    SysLoginLogMapper sysLoginLogMapper;

    @Override
    public void login(String username, String password) {
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username, password);
        token.setRememberMe(true);
        subject.login(token);
        //查询出用户所拥有的所有角色
        List<SysRole> roles = roleService.getUserRole(username);
        //将用户的角色信息存到缓存中
        cacheService.saveCurrentUserRole(username, roles);
        //将用户的个人信息放到session中
        SysUser user = userService.getUser(username);
        cacheService.saveCurrentUserInfo(user);
        //将用户的机构信息存到session中
        SysOrg org = orgService.getOrg(user.getOrgNo());
        if (org == null) {
            throw new AuthorizationException("授权失败，找不到用户【" + username + "】的机构【" + user.getOrgNo() + "】信息");
        }
        cacheService.saveCurrentOrgInfo(org);

    }

    @Override
    public void logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
    }

    /**
     *
     * @param loginLogVO
     * @param page
     * @param limit
     * @return
     */
    @Override
    public Page<SysLoginLog> query(LoginLogVO loginLogVO, int page, int limit) {
        SysLoginLogExample sysLoginLogExample=new SysLoginLogExample ();
        SysLoginLogExample.Criteria criteria = sysLoginLogExample.createCriteria ();

        if (loginLogVO != null && StringUtils.isNotBlank (loginLogVO.getUsername ())) {
            criteria.andUsernameLike (loginLogVO.getUsername ());
        }

        if (loginLogVO != null && StringUtils.isNotBlank (loginLogVO.getIpAddress ())) {
            criteria.andIpAddressLike (loginLogVO.getIpAddress ());
        }
        sysLoginLogExample.setOrderByClause("creation_time desc");
        PageHelper.startPage (page, limit);
        Page<SysLoginLog> sysLoginLogs = (Page<SysLoginLog>) sysLoginLogMapper.selectByExample (sysLoginLogExample);
        return sysLoginLogs;
    }
}
