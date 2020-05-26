package com.nantian.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.util.StringUtil;
import com.nantian.common.util.CollectionUtils;
import com.nantian.common.util.StringUtils;
import com.nantian.constant.StatusConsts;
import com.nantian.dto.AuthorizationDTO;
import com.nantian.dto.PermissionDTO;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.*;
import com.nantian.mapper.sys.SysPermissionMapper;
import com.nantian.mapper.sys.SysRolePermissionMapper;
import com.nantian.service.CacheService;
import com.nantian.service.MenuService;
import com.nantian.service.PermissionService;
import com.nantian.util.SnowflakeIdUtils;
import com.nantian.util.SqlUtils;
import com.nantian.util.TreeUtils;
import com.nantian.vo.PermissionVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * <p>ClassName: MenuServiceImpl</p>
 * <p>Description: </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
@Service
public class MenuServiceImpl implements MenuService {
    private static Logger log = LoggerFactory.getLogger (MenuServiceImpl.class);
    /**
     * 管理员
     */
    private static String ADMIN = "admin";

    @Autowired
    SysRolePermissionMapper rolePermissionMapper;

    @Autowired
    SysPermissionMapper permissionMapper;

    @Autowired
    CacheService cacheService;
    @Autowired
    PermissionService permissionService;

    @Override
    public List<SysPermission> getRolePermission(Long roleId) {
        List<Long> ids = new ArrayList<> ();
        ids.add (roleId);
        return getRolePermission (ids);
    }

    @Override
    public List<SysPermission> getRolePermission(List<Long> roleIds) {

        //查询出角色id对应的所有权限id集合
        SysRolePermissionExample rolePermissionExample = new SysRolePermissionExample ();
        rolePermissionExample.createCriteria ().andRoleIdIn (roleIds);
        List<SysRolePermissionKey> rolePermissionKeys = rolePermissionMapper.selectByExample (rolePermissionExample);
        //权限id
        List<Long> permissions = new ArrayList<> ();
        for (SysRolePermissionKey rolePermissionKey : rolePermissionKeys) {
            Long permissionId = rolePermissionKey.getPermissionId ();
            if (!permissions.contains (permissionId)) {
                permissions.add (permissionId);
            }
        }
        if (CollectionUtils.isEmpty (permissions)) {
            return new ArrayList<> ();
        }
        //根据权限id集，查询出所有对应的可用的权限信息
        SysPermissionExample permissionExample = new SysPermissionExample ();
        permissionExample.createCriteria ().andIdIn (permissions).andStatusEqualTo ("1");

        List<SysPermission> permissions1 = permissionMapper.selectByExample (permissionExample);

        return permissions1;
    }

    @Override
    public List<SysPermission> getAdminPermission() {
        List<String> roleNos = cacheService.getCurrentUserRoleNos ();
        boolean result = false;
        for (String roleNo : roleNos) {
            if (ADMIN.equals (roleNo)) {
                result = true;
                break;
            }
        }
        if (result) {
            //管理员可以查询全部权限
            SysPermissionExample sysPermissionExample = new SysPermissionExample ();
            sysPermissionExample.createCriteria ().andStatusEqualTo (StatusConsts.PERMISSION_STATUS_NORMAL);
            List<SysPermission> permissions = permissionMapper.selectByExample (sysPermissionExample);
            return permissions;
        }
        return new ArrayList<> ();
    }

    @Override
    public TreeDTO getPermissionTree(SysPermission parentPermission, List<SysPermission> permissions) {
        TreeDTO treeDTO = new TreeDTO ();
        treeDTO.setId (parentPermission.getId ());
        treeDTO.setTitle (parentPermission.getName ());
        treeDTO.setHref (parentPermission.getUrl ());
        treeDTO.setType (parentPermission.getType ());
        treeDTO.setSmallIcon (parentPermission.getSmallIcon ());
        treeDTO.setSorting (parentPermission.getSorting ());
        HashMap map = new HashMap (16);
        map.put ("hide", parentPermission.getHide ());
        treeDTO.setExtendData (map);

        List<TreeDTO> children = new ArrayList<> ();
        //下级菜单
        List<SysPermission> lowerMenus = new ArrayList<> ();
        for (SysPermission permission1 : permissions) {

            boolean eqId = (permission1.getParentId () != null && permission1.getId () != null) && (permission1.getParentId ().equals (parentPermission.getId ()));
            if (eqId) {
                lowerMenus.add (permission1);
            }
        }
        //遍历所有的子菜单，递归查询所有的子菜单
        if (CollectionUtils.isNotEmpty (lowerMenus)) {
            for (SysPermission permission1 : lowerMenus) {
                TreeDTO child = getPermissionTree (permission1, permissions);
                children.add (child);
            }
        }
        treeDTO.setChildren (children);

        return treeDTO;
    }

    @Override
    public TreeDTO checkedPermission(List<Long> ownedPermissionIds, TreeDTO treeDTO) {

        List<TreeDTO> childrens = treeDTO.getChildren ();
        List<TreeDTO> newChildrens = new ArrayList<> ();
        if (CollectionUtils.isNotEmpty (childrens)) {
            for (TreeDTO tree : childrens) {
                TreeDTO checkedThree = checkedPermission (ownedPermissionIds, tree);
                newChildrens.add (checkedThree);
            }
        } else {
            if (ownedPermissionIds.contains (treeDTO.getId ())) {
                treeDTO.setChecked (true);
            }
        }
        treeDTO.setChildren (newChildrens);
        return treeDTO;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updateRolePermission(Long roleId, List<Long> permissionIds) {
        SysRolePermissionExample rolePermissionExample = new SysRolePermissionExample ();
        rolePermissionExample.createCriteria ().andRoleIdEqualTo (roleId);

        //获取角色对应的旧权限
        List<SysRolePermissionKey> permissionKeys = rolePermissionMapper.selectByExample (rolePermissionExample);
        //清空旧权限
        rolePermissionMapper.deleteByExample (rolePermissionExample);
        if(permissionIds != null) {
            //新增新权限
            for (Long permissionId : permissionIds) {
                insertRolePermission(roleId, permissionId);
            }
        }else{
            insertRolePermission(roleId, null);
        }
        //清空旧权限缓存
        //整理权限id
        List<Long> ids = new ArrayList<> ();
        for (SysRolePermissionKey permissionKey : permissionKeys) {
            ids.add (permissionKey.getPermissionId ());
        }
        if (CollectionUtils.isNotEmpty (ids)) {
            //查询出id对应的权限信息
            SysPermissionExample permissionExample = new SysPermissionExample ();
            permissionExample.createCriteria ().andIdIn (ids).andTypeEqualTo (StatusConsts.PERMISSION_TYPE_OPERATION);
            List<SysPermission> permissions = permissionMapper.selectByExample (permissionExample);
            if (CollectionUtils.isNotEmpty (permissionIds)) {
                //获取id对应的url信息
                List<String> urls = new ArrayList<> ();
                for (SysPermission permission : permissions) {
                    urls.add (permission.getUrl ());
                }
                //清空权限缓存
                permissionService.deletePermissionCache (urls);
                //更新新权限缓存
                List<AuthorizationDTO> authorizations = permissionService.queryPermissionRoleData (permissionIds);
                permissionService.updatePermissionCache (authorizations);
            }
        }

    }

    /**
     * 根据角色ID和权限ID更新权限
     * @param roleId
     * @param permissionId
     */
    private void insertRolePermission(Long roleId, Long permissionId) {
        SysRolePermissionKey rolePermissionKey = new SysRolePermissionKey();
        rolePermissionKey.setRoleId(roleId);
        rolePermissionKey.setPermissionId(permissionId);
        rolePermissionMapper.insert(rolePermissionKey);
    }

    @Override
    public Page<SysPermission> query(Long permissionPid, String name, int page, int limit) {
        //查询父权限信息
        SysPermissionExample permissionExample = new SysPermissionExample ();
        SysPermissionExample.Criteria criteria = permissionExample.createCriteria ();
        if (StringUtil.isNotEmpty (name)) {
            criteria.andNameLike (SqlUtils.allLike (name));
        }
        String pid = String.valueOf (permissionPid);
        criteria.andPathLike (SqlUtils.allLike (pid));

        PageHelper.startPage (page, limit);
        Page<SysPermission> permissions = (Page<SysPermission>) permissionMapper.selectByExample (permissionExample);

        return permissions;
    }

    @Override
    public List<TreeDTO> queryTree() {
        //查询出全部的菜单权限
        SysPermissionExample permissionExample = new SysPermissionExample ();
        permissionExample.createCriteria ().andStatusEqualTo (StatusConsts.PERMISSION_STATUS_NORMAL);
        List<SysPermission> permissions = permissionMapper.selectByExample (permissionExample);

        //筛选出根菜单信息

        List<SysPermission> rootPermissions = new ArrayList<> ();
        for (SysPermission permission : permissions) {
            boolean parent = permission.getParentId () == null || permission.getParentId () <= 0;
            if (StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals (permission.getType ()) && parent) {
                rootPermissions.add (permission);
            }
        }


        List<TreeDTO> trees = new ArrayList<> ();
        for (SysPermission permission : rootPermissions) {
            TreeDTO tree = getPermissionTree (permission, permissions);
            trees.add (tree);
        }
        //排序
        trees = TreeUtils.ascTree (trees);
        return trees;
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void deletePermission(Long permissionId) {
        SysPermission permission = permissionMapper.selectByPrimaryKey (permissionId);
        permissionMapper.deleteByPrimaryKey (permissionId);
        //删除缓存中的权限信息
        if (permission != null) {
            if (StatusConsts.PERMISSION_TYPE_OPERATION.equals (permission.getType ())) {
                permissionService.deletePermissionCache (permission.getUrl ());
            }
        }
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void addPermission(PermissionVO permissionVO) {
        //验证父权限
        SnowflakeIdUtils snowflakeIdUtils = SnowflakeIdUtils.getSnowflake ();
        Long id = snowflakeIdUtils.nextId ();

        String path = checkData (permissionVO);
        if (StringUtils.isBlank (path)) {
            path = id.toString ();
        } else {
            path = path + "." + id;
        }

        SysPermission permission = new SysPermission ();

        permission.setId (id);
        permission.setBigIcon (permissionVO.getBigIcon ());
        permission.setSmallIcon (permissionVO.getSmallIcon ());
        permission.setName (permissionVO.getName ());
        permission.setParentId (permissionVO.getParentId ());
        permission.setPath (path);
        permission.setSorting (permissionVO.getSorting ());
        permission.setStatus (permissionVO.getStatus ());
        permission.setType (permissionVO.getType ());
        permission.setUrl (permissionVO.getUrl ());
        permission.setUpdateTime (new Date ());
        permission.setCreationTime (new Date ());
        permission.setHide (permissionVO.getHide ());

        permissionMapper.insertSelective (permission);
    }

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void updatePermission(PermissionVO permissionVO) {

        //查询出旧的权限，判断是否有更新父菜单
        SysPermission permission = permissionMapper.selectByPrimaryKey (permissionVO.getId ());
        if (permission == null) {
            throw new IllegalArgumentException ("找不到id为【" + permissionVO.getId () + "】的权限信息");
        }

        SysPermission permission1 = new SysPermission ();
        permission1.setId (permissionVO.getId ());
        permission1.setUpdateTime (new Date ());
        if (StringUtils.isNotBlank (permissionVO.getStatus ())) {
            permission1.setStatus (permissionVO.getStatus ());
        }
        if (StringUtils.isNotBlank (permissionVO.getUrl ())) {
            permission1.setUrl (permissionVO.getUrl ());
        }
        if (StringUtils.isNotBlank (permissionVO.getName ())) {
            permission1.setName (permissionVO.getName ());
        }
        if (permissionVO.getSorting () != null) {
            permission1.setSorting (permissionVO.getSorting ());
        }
        if (StringUtil.isNotEmpty (permissionVO.getSmallIcon ())) {
            permission1.setSmallIcon (permissionVO.getSmallIcon ());
        }
        if (StringUtil.isNotEmpty (permissionVO.getBigIcon ())) {
            permission1.setBigIcon (permissionVO.getBigIcon ());
        }
        if (StringUtils.isNotBlank (permissionVO.getHide ())) {
            permission1.setHide (permissionVO.getHide ());
        }

        permissionMapper.updateByPrimaryKeySelective (permission1);

        if (permission.getType ().equals (StatusConsts.PERMISSION_TYPE_OPERATION)) {
            //判断是否需要更新缓存中的权限
            ////如果url没有改变，则不需要更新缓存中的权限，如果更改了url ，则需要重新加载权限信息
            if (!permission.getUrl ().equals (permissionVO.getUrl ())) {
                permissionService.deletePermissionCache (permission.getUrl ());
                List<Long> permissionIds = new ArrayList<> (1);
                permissionIds.add (permission.getId ());
                List<AuthorizationDTO> authorizations = permissionService.queryPermissionRoleData (permissionIds);
                permissionService.updatePermissionCache (authorizations);
            }
        }
    }

    @Override
    public PermissionDTO getPermission(Long permissionId) {

        SysPermission permission = permissionMapper.selectByPrimaryKey (permissionId);
        if (permission == null) {
            log.info ("找不到id为【{}】的菜单信息", permissionId);
            return null;
        }

        PermissionDTO permissionDTO = new PermissionDTO ();
        permissionDTO.setId (permission.getId ());
        permissionDTO.setBigIcon (permission.getBigIcon ());
        permissionDTO.setName (permission.getName ());
        permissionDTO.setParentId (permission.getParentId ());
        permissionDTO.setPath (permission.getPath ());
        permissionDTO.setSmallIcon (permission.getSmallIcon ());

        permissionDTO.setSorting (permission.getSorting ());
        permissionDTO.setUrl (permission.getUrl ());
        permissionDTO.setStatus (permission.getStatus ());
        permissionDTO.setType (permission.getType ());
        permissionDTO.setHide (permission.getHide ());
        //查询父菜单的名称
        if (!permission.getType ().equals (StatusConsts.PERMISSION_TYPE_CLASSIFICATION)) {
            SysPermission parentPermission = permissionMapper.selectByPrimaryKey (permission.getParentId ());
            if (parentPermission == null) {
                log.info ("找不到id为【{}】的父菜单信息", permissionId);
                return null;
            }
            permissionDTO.setParentName (parentPermission.getName ());
        }
        return permissionDTO;
    }


    private String checkData(PermissionVO permissionVO) {
        String path = null;
        if (!StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals (permissionVO.getType ())) {
            SysPermissionExample permissionExample = new SysPermissionExample ();
            permissionExample.createCriteria ().andIdEqualTo (permissionVO.getParentId ());
            List<SysPermission> permissions = permissionMapper.selectByExample (permissionExample);
            if (CollectionUtils.isEmpty (permissions)) {
                throw new IllegalArgumentException ("指不到指定的父权限id【" + permissionVO.getParentId () + "】");
            }

            SysPermission parentPermission = permissions.get (0);
            if (StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals (permissionVO.getType ()) && !StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals (parentPermission.getType ())) {
                throw new IllegalArgumentException ("分类菜单权限的上级菜单只能指定分类类型的菜单");
            }
            if (StatusConsts.PERMISSION_TYPE_MENU.equals (permissionVO.getType ()) && !StatusConsts.PERMISSION_TYPE_CLASSIFICATION.equals (parentPermission.getType ())) {
                throw new IllegalArgumentException ("菜单权限的上级菜单只能指定分类类型的菜单");
            }
            if (StatusConsts.PERMISSION_TYPE_OPERATION.equals (permissionVO.getType ()) && !StatusConsts.PERMISSION_TYPE_MENU.equals (parentPermission.getType ())) {
                throw new IllegalArgumentException ("操作类型的权限的上级菜单只能指定菜单类型");
            }
            path = parentPermission.getPath ();
        }
        return path;
    }
}
