package com.nantian.service.impl;

import com.nantian.common.util.CollectionUtils;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.*;
import com.nantian.mapper.sys.SysPermissionMapper;
import com.nantian.mapper.sys.SysRolePermissionMapper;
import com.nantian.mapper.sys.SysUserRoleMapper;
import com.nantian.service.CacheService;
import com.nantian.service.IndexService;
import com.nantian.service.MenuService;
import com.nantian.util.TreeUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>ClassName: IndexServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-06</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class IndexServiceImpl implements IndexService {
    private static Logger log = LoggerFactory.getLogger(IndexServiceImpl.class);


    @Autowired
    MenuService menuService;

    @Autowired
    CacheService cacheService;

    @Autowired
    SysUserRoleMapper userRoleMapper;

    @Autowired
    SysRolePermissionMapper rolePermissionMapper;

    @Autowired
    SysPermissionMapper permissionMapper;

    @Override
    public List<TreeDTO> queryCurrentUserMenu() {
        SysUser user = cacheService.getCurrentUserInfo();

        //通过关系表，查询表当前用户对应的所有角色
        SysUserRoleExample userRoleExample = new SysUserRoleExample();
        userRoleExample.createCriteria().andUserIdEqualTo(user.getId());
        List<SysUserRoleKey> userRoleKeys = userRoleMapper.selectByExample(userRoleExample);

        List<Long> roleIds = new ArrayList<>();
        for (SysUserRoleKey userRoleKey : userRoleKeys) {
            roleIds.add(userRoleKey.getRoleId());
        }

        //通过角色的id，查询出所有的角色对应的权限id
        SysRolePermissionExample rolePermissionExample = new SysRolePermissionExample();
        rolePermissionExample.createCriteria().andRoleIdIn(roleIds);
        List<SysRolePermissionKey> permissionKeys = rolePermissionMapper.selectByExample(rolePermissionExample);

        List<Long> permissionIds = new ArrayList<>();
        for (SysRolePermissionKey rolePermissionKey : permissionKeys) {
            permissionIds.add(rolePermissionKey.getPermissionId());
        }

        //通过权限id，查询出所有的权限信息
        SysPermissionExample permissionExample = new SysPermissionExample();
        permissionExample.createCriteria().andTypeNotEqualTo("3").andIdIn(permissionIds);
        List<SysPermission> permissions = permissionMapper.selectByExample(permissionExample);

        if (CollectionUtils.isNotEmpty(permissions)) {
            //整理出根菜单
            List<SysPermission> rootPermission = new ArrayList<>();
            for (SysPermission permission : permissions) {
                //是否有父菜单
                boolean isParent = (permission.getParentId() == null && (permission.getParentId() == null || permission.getParentId() <= 0));
                //没有父菜单且类型为 1的分类菜单为根菜单
                if ("1".equals(permission.getType()) && isParent) {
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
                TreeDTO tree = menuService.getPermissionTree(root, permissions);
                trees.add(tree);
            }

            //排序
            trees= TreeUtils.ascTree (trees);

            //返回打勾后的权限树
            return trees;
        }
        return new ArrayList<>();
    }
}
