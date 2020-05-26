package com.nantian.service.impl;

import com.nantian.common.util.CollectionUtils;
import com.nantian.constant.Application;
import com.nantian.constant.CacheConsts;
import com.nantian.dto.DictionaryDTO;
import com.nantian.entity.sys.SysOrg;
import com.nantian.entity.sys.SysRole;
import com.nantian.entity.sys.SysUser;
import com.nantian.entity.sys.SysUserRoleKey;
import com.nantian.service.CacheService;
import com.nantian.util.RedisUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: CacheServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-03</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class CacheServiceImpl implements CacheService {
    private static Logger log = LoggerFactory.getLogger(CacheServiceImpl.class);

    @Autowired
    RedisUtils redisUtils;

    @Override
    public void saveCurrentUserRole(String username, List<SysRole> roleIds) {
        //存放用户的角色key
        String roleskey = Application.PROJECT_NAME + "_" + username + "_" + "roles";
        //将当前用户的角色信息，存到session中
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute(roleskey, roleIds);
    }

    @Override
    public void saveCurrentUserInfo(SysUser user) {
        //将当前用户的角色信息，存到session中
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute(CacheConsts.USER_NAME, user);
    }

    @Override
    public void saveCurrentOrgInfo(SysOrg org) {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        session.setAttribute(CacheConsts.ORG_INFO, org);
    }

    @Override
    public List<Long> getCurrentUserRole() {
        List<SysRole> roles = getRoles();
        List<Long> ids = new ArrayList<>();
        for (SysRole role : roles) {
            ids.add(role.getId());
        }
        return ids;
    }

    @Override
    public List<String> getCurrentUserRoleNos() {
        List<SysRole> roles = getRoles();
        List<String> nos = new ArrayList<>();
        for (SysRole role : roles) {
            nos.add(role.getRoleNo());
        }
        return nos;
    }

    @Override
    public SysUser getCurrentUserInfo() {
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser user = (SysUser) session.getAttribute(CacheConsts.USER_NAME);
        return user;
    }

    @Override
    public SysOrg getCurrentOrgInfo() {

        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysOrg org = (SysOrg) session.getAttribute(CacheConsts.ORG_INFO);
        return org;
    }

    @Override
    public List<DictionaryDTO> getCacheDictValue(String dictName) {
        String key = Application.PROJECT_NAME + "_" + dictName;
        if (!redisUtils.hasKey(key)) {
            return null;
        }
        List<Object> list = redisUtils.lGet(key, 0, -1);
        if (CollectionUtils.isNotEmpty(list)) {
            List<DictionaryDTO> data = (List) list.get(0);
            return data;
        } else {
            return null;
        }
    }

    @Override
    public void setCacheDictValue(String dictName, List<DictionaryDTO> data) {
        String key = Application.PROJECT_NAME + "_" + dictName;
        boolean result = redisUtils.lSet(key, data, Application.DICTIONARY_CACHE_TIME);
        if (!result) {
            log.error("字典【{}】数据缓存到redis失败", dictName);
        }
    }

    @Override
    public void updateDictValue(String dictName,  List<DictionaryDTO> data) {
        String key = Application.PROJECT_NAME + "_" + dictName;
        redisUtils.del(key);
        setCacheDictValue(key, data);
    }

    @Override
    public boolean isAdmin() {

        List<String> roleNos = getCurrentUserRoleNos();
        boolean admin = false;
        for (String role : roleNos) {
            if ("admin".equals(role)) {
                admin = true;
                break;
            }
        }
        return admin;
    }


    private List<SysRole> getRoles() {

        //将当前用户的角色信息，存到session中
        Subject subject = SecurityUtils.getSubject();
        Session session = subject.getSession();
        SysUser user = (SysUser) session.getAttribute(CacheConsts.USER_NAME);

        //存放用户的角色key
        String roleskey = Application.PROJECT_NAME + "_" + user.getUsername() + "_" + "roles";

        List<SysRole> roles = (List<SysRole>) session.getAttribute(roleskey);
        return roles;
    }
}
