package com.nantian.service.impl;

import com.nantian.common.util.CollectionUtils;
import com.nantian.constant.Application;
import com.nantian.constant.CacheConsts;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.AuthorizationDTO;
import com.nantian.entity.sys.*;
import com.nantian.mapper.sys.SysPermissionMapper;
import com.nantian.mapper.sys.SysRoleMapper;
import com.nantian.mapper.sys.SysRolePermissionMapper;
import com.nantian.service.CacheService;
import com.nantian.service.PermissionService;
import com.nantian.util.RedisUtils;
import org.apache.commons.collections.map.HashedMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

/**
 * <p>ClassName: PermissionServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-23</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    private static Logger log = LoggerFactory.getLogger(PermissionServiceImpl.class);

    @Autowired
    CacheService cacheService;

    @Autowired
    RedisUtils redisUtils;

    @Autowired
    SysPermissionMapper permissionMapper;

    @Autowired
    SysRolePermissionMapper rolePermissionMapper;

    @Autowired
    SysRoleMapper roleMapper;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public List<AuthorizationDTO> queryPermissionRoleData(List<Long> permissionIds) {
        //从权限表中，查询出所有的状态是正常，且是类型是操作的菜单数据
        SysPermissionExample permissionExample = new SysPermissionExample();
        permissionExample.createCriteria().andStatusEqualTo(StatusConsts.PERMISSION_STATUS_NORMAL).andTypeEqualTo(StatusConsts.PERMISSION_TYPE_OPERATION).andIdIn(permissionIds);
        List<SysPermission> permissions = permissionMapper.selectByExample(permissionExample);

        if (CollectionUtils.isEmpty(permissions)) {
            log.info("当前权限表中没有任何权限信息");
            return null;
        }

        List<Long> pIds = new ArrayList<>();
        for (SysPermission permission : permissions) {
            pIds.add(permission.getId());
        }
        //从角色权限关系表中，查询出所有的角色id
        SysRolePermissionExample rolePermissionExample = new SysRolePermissionExample();
        rolePermissionExample.createCriteria().andPermissionIdIn(pIds);
        List<SysRolePermissionKey> rolePermissionKeys = rolePermissionMapper.selectByExample(rolePermissionExample);

        List<Long> roleIds = new ArrayList<>();
        for (SysRolePermissionKey rolePermissionKey : rolePermissionKeys) {
            roleIds.add(rolePermissionKey.getRoleId());
        }

        //查询出权限对应的角色信息
        SysRoleExample roleExample = new SysRoleExample();
        roleExample.createCriteria().andStatusEqualTo(StatusConsts.ROLE_STATUS_NORMAL).andIdIn(roleIds);
        List<SysRole> roles = roleMapper.selectByExample(roleExample);

        if (CollectionUtils.isEmpty(roles)) {
            log.info("角色表中没有任何权限信息");
            return null;
        }
        //将url对应的角色进行整理
        Map<String, List<String>> map = new HashedMap();
        for (SysRolePermissionKey rolePermissionKey : rolePermissionKeys) {
            Long permissionId = rolePermissionKey.getPermissionId();
            Long roleId = rolePermissionKey.getRoleId();
            SysPermission permission = getPermission(permissionId, permissions);
            SysRole role = getRole(roleId, roles);
            List<String> roleNos = map.get(permission.getUrl());
            if (roleNos == null) {
                roleNos = new ArrayList<>();
                roleNos.add(role.getRoleNo());
                map.put(permission.getUrl(), roleNos);
            } else {
                roleNos.add(role.getRoleNo());
            }
        }
        //将权限信息封闭成对象操作
        List<AuthorizationDTO> authorizations = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            AuthorizationDTO authorization = new AuthorizationDTO();
            authorization.setUrl(entry.getKey());
            authorization.setRoles(entry.getValue());
            authorizations.add(authorization);
        }
        return authorizations;
    }

    @Override
    public boolean checkPermission(String url) {
        //获取当前用户的角色信息
        List<String> roles = cacheService.getCurrentUserRoleNos();

        Map<Object, Object> r = redisUtils.hmget(CacheConsts.getAuthCacheName());
        //获取缓存中该url对应的角色信息
        Object obj =  redisUtils.hget(CacheConsts.getAuthCacheName(), url);
        if (obj == null) {
            log.error("从redis中获取权限缓存信息失败");
            return false;
        }
        boolean result = false;
        List<String> roleNos = (List<String>) obj;
        for (String roleno : roles) {
            if (roleNos.contains(roleno)) {
                result = true;
                break;
            }
        }
        return result;
    }

    @Override
    public boolean addPermissionCache(List<AuthorizationDTO> authorizations) {
        Map<String, Object> map = new Hashtable<>();
        for (AuthorizationDTO authorization : authorizations) {
            map.put(authorization.getUrl(), authorization.getRoles());
        }
        return redisUtils.hmset(CacheConsts.getAuthCacheName(), map);
    }

    @Override
    public void updatePermissionCache(List<AuthorizationDTO> authorizations) {
        Map<String, Object> map = new Hashtable<>();
        for (AuthorizationDTO authorization : authorizations) {
            boolean result = redisUtils.hset(CacheConsts.getAuthCacheName(), authorization.getUrl(), authorization.getRoles());
            if (!result) {
                log.error("ur【{}】更新权限缓存信息失败", authorization.getUrl());
            }
        }
    }

    @Override
    public void deletePermissionCache(List<String> urls) {
        if (CollectionUtils.isNotEmpty(urls)) {
            for (String url : urls) {
                redisUtils.hdel(CacheConsts.getAuthCacheName(), url);
            }
        }
    }

    @Override
    public void deletePermissionCache(String url) {
        List<String> urls = new ArrayList<>(1);
        urls.add(url);
        deletePermissionCache(urls);
    }


    /**
     * 获取指定的权限信息
     * @param permissionId 权限id
     * @param permissions 所有的权限信息
     * @return 权限信息
     */
    private SysPermission getPermission(Long permissionId, List<SysPermission> permissions) {
        SysPermission permission = null;
        for (SysPermission sysPermission : permissions) {
            if (sysPermission.getId().equals(permissionId)) {
                permission = sysPermission;
                break;
            }
        }
        return permission;
    }

    /**
     * 获取角色信息
     * @param roleId 角色id
     * @param roles 所有的角色信息
     * @return 角色信息
     */
    private SysRole getRole(Long roleId, List<SysRole> roles) {
        SysRole role = null;
        for (SysRole sysRole : roles) {
            if (sysRole.getId().equals(roleId)) {
                role = sysRole;
                break;
            }
        }
        return role;
    }
}