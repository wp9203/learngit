package com.nantian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.AuthorizationDTO;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.*;
import com.nantian.mapper.sys.SysRoleMapper;
import com.nantian.mapper.sys.SysRolePermissionMapper;
import com.nantian.mapper.sys.SysUserMapper;
import com.nantian.mapper.sys.SysUserRoleMapper;
import com.nantian.service.CacheService;
import com.nantian.service.MenuService;
import com.nantian.service.PermissionService;
import com.nantian.service.RoleService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.util.SqlUtils;
import com.nantian.vo.RolePermissionVO;
import com.nantian.vo.RoleVO;
import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * <p>ClassName: RoleServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class RoleServiceImpl implements RoleService {

    private static Logger log = LoggerFactory.getLogger(RoleServiceImpl.class);

    @Autowired
    SysUserRoleMapper userRoleMapper;

    @Autowired
    SysRoleMapper roleMapper;

    @Autowired
    SysUserMapper userMapper;

    @Autowired
    MenuService menuService;

    @Autowired
    CacheService cacheService;

    @Autowired
    SysRolePermissionMapper rolePermissionMapper;

    @Autowired
    PermissionService permissionService;

    @Override
    public List<SysRole> getUserRole(String username) {

        //根据用户名，查询出用户的id
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andUsernameEqualTo(username);
        List<SysUser> users = userMapper.selectByExample(userExample);
        if (CollectionUtils.isEmpty(users)) {
            return null;
        }

        SysUser user = users.get(0);

        //根据用户名查询用户角色表
        SysUserRoleExample userRoleExample = new SysUserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(user.getId());
        List<SysUserRoleKey> userRoleKeys = userRoleMapper.selectByExample(userRoleExample);

        if (CollectionUtils.isEmpty(userRoleKeys)) {
            return new ArrayList<>();
        }

        //查询所有对应的角色id
        List<Long> roleIds = new ArrayList<>();
        for (SysUserRoleKey userRoleKey : userRoleKeys) {
            roleIds.add(userRoleKey.getRoleId());
        }

        if (CollectionUtils.isEmpty(roleIds)) {
            return new ArrayList<>();
        }

        //查询角色表
        SysRoleExample roleExample = new SysRoleExample();
        roleExample.createCriteria().andIdIn(roleIds);
        List<SysRole> roles = roleMapper.selectByExample(roleExample);

        return roles;
    }

    @Override
    public List<SysRole> getAllRole() {
        SysRoleExample roleExample = new SysRoleExample();
        roleExample.createCriteria().andStatusEqualTo(StatusConsts.ROLE_STATUS_NORMAL);
        return roleMapper.selectByExample(roleExample);
    }

    @Override
    public Page<SysRole> query(String roleNo, String name, String status, int page, int limit) {
        SysRoleExample roleExample = new SysRoleExample();
        SysRoleExample.Criteria criteria = roleExample.createCriteria();
        if (StringUtils.isNotBlank(name)) {
            criteria.andNameLike(SqlUtils.allLike(name));
        }

        if (StringUtils.isNotBlank(status)) {
            criteria.andStatusEqualTo(status);
        }

        if (StringUtils.isNotBlank(roleNo)) {
            criteria.andRoleNoLike(SqlUtils.allLike(roleNo));
        }

        PageHelper.startPage(page, limit);
        Page<SysRole> roles = (Page<SysRole>) roleMapper.selectByExample(roleExample);

        return roles;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addRole(RoleVO roleVO) {
        SysRole role = new SysRole();
        SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake();
        Long id = snowflakeIdUtils.nextId();
        role.setId(id);
        role.setRoleNo(roleVO.getRoleNo());
        role.setName(roleVO.getName());
        role.setEngName(roleVO.getEngName());
        role.setStatus(roleVO.getStatus());
        role.setUpdateTime(new Date());
        role.setCreationTime(new Date());

        roleMapper.insertSelective(role);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void delete(long roleId) {
        roleMapper.deleteByPrimaryKey(roleId);
        //删除角色对应的权限
        SysRolePermissionExample rolePermissionExample = new SysRolePermissionExample();
        rolePermissionExample.createCriteria().andRoleIdEqualTo(roleId);
        rolePermissionMapper.deleteByExample(rolePermissionExample);
        //更新缓存中的权限
        List<SysRolePermissionKey> permissionKeys = rolePermissionMapper.selectByExample(rolePermissionExample);
        if (CollectionUtils.isNotEmpty(permissionKeys)) {
            List<Long> permissionIds = new ArrayList<>();
            for (SysRolePermissionKey rolePermissionKey : permissionKeys) {
                permissionIds.add(rolePermissionKey.getPermissionId());
            }
            //更新url对应的角色
            List<AuthorizationDTO> authorizations = permissionService.queryPermissionRoleData(permissionIds);
            if (CollectionUtils.isNotEmpty(authorizations)) {
                permissionService.updatePermissionCache(authorizations);
            }
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void update(RoleVO roleVO) {
        SysRole role = new SysRole();
        role.setId(roleVO.getId());
        role.setName(roleVO.getName());
        role.setEngName(roleVO.getEngName());
        role.setStatus(roleVO.getStatus());
        role.setUpdateTime(new Date());
        roleMapper.updateByPrimaryKeySelective(role);
    }

    @Override
    public List<TreeDTO> getRolePermission(Long roleId) {

        //获取当前用户信息
        SysUser user = cacheService.getCurrentUserInfo();

        //获取当前用户的角色信息
        List<Long> roles = cacheService.getCurrentUserRole();

        //获取角色拥有的权限
        List<SysPermission> permissions = menuService.getRolePermission(roleId);
        //获取当前用户的所有权限
        List<SysPermission> sysPermissions = null;

        if (cacheService.isAdmin()) {
            sysPermissions = menuService.getAdminPermission();
        } else {
            sysPermissions = menuService.getRolePermission(roles);
        }

        //用户权限不为空时
        if (CollectionUtils.isNotEmpty(sysPermissions)) {
            //整理出根菜单
            List<SysPermission> rootPermission = new ArrayList<SysPermission>();
            for (SysPermission permission : sysPermissions) {
                //是否有父菜单
                boolean isParent = (permission.getParentId() == null && (permission.getParentId() == null || permission.getParentId() <= 0));
                //没有父菜单且类型为 1的分类菜单为根菜单
                if (StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals(permission.getType()) && isParent) {
                    rootPermission.add(permission);
                }
            }
            //正常情况下最少拥有一个根菜单
            if (CollectionUtils.isEmpty(rootPermission)) {
                log.info("非法的菜单结构");
                return null;
            }
            //将所有的权限整理成树结构
            List<TreeDTO> trees = new ArrayList<>();
            for (SysPermission root: rootPermission) {
                TreeDTO tree = menuService.getPermissionTree(root, sysPermissions);
                trees.add(tree);
            }
            //整理出拥有的权限id
            List<Long> ownedPermissionIds = new ArrayList<>();
            for (SysPermission ownedPermission :permissions) {
                ownedPermissionIds.add(ownedPermission.getId());
            }
            //将整理好的所有权限，判断当前权限是否为该角色拥有，有的则打勾上
            List<TreeDTO> checkedTrees = new ArrayList<>();
            for (TreeDTO tree : trees) {
                TreeDTO checkTree = menuService.checkedPermission(ownedPermissionIds, tree);
                checkedTrees.add(checkTree);
            }
            //返回打勾后的权限树
            return checkedTrees;
        }
        return null;
    }

    @Transactional(rollbackFor=Exception.class)
    @Override
    public void updateRolePermission(RolePermissionVO rolePermissionVO) {
        menuService.updateRolePermission(rolePermissionVO.getRoleId(), rolePermissionVO.getPermissionIds());
    }

    @Override
    public SysRole getRole(Long roleId) {
        return roleMapper.selectByPrimaryKey(roleId);
    }


}
