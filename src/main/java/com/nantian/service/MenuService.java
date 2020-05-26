package com.nantian.service;

import com.github.pagehelper.Page;
import com.nantian.dto.PermissionDTO;
import com.nantian.dto.TreeDTO;
import com.nantian.easytrade.http.core.ApplicationContext;
import com.nantian.entity.sys.SysPermission;
import com.nantian.vo.PermissionVO;

import java.util.List;

/**
 * <p>ClassName: MenuService</p>
 * <p>Description: 菜单service </p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface MenuService {

    /**
     * 根据角色id获取角色对应的权限
     * @param roleId 角色id
     * @return 权限集合
     */
    List<SysPermission> getRolePermission(Long roleId);

    /**
     * 根据角色id获取角色对应的权限
     * @param roleIds 角色id集合
     * @return 权限集合
     */
    List<SysPermission> getRolePermission(List<Long> roleIds);

    /**
     * 获取管理员的菜单权限
     * @return 管理员的菜单权限
     */
    List<SysPermission> getAdminPermission();

    /**
     * 将菜单权限整理成树结构
     * @param parentPermission 当前菜单权限
     * @param permissions 所有菜单权限
     * @return 树结构的菜单权限
     */
    TreeDTO getPermissionTree(SysPermission parentPermission, List<SysPermission> permissions);

    /**
     * 对菜单树中拥有的权限进行打勾
     * @param ownedPermissionIds 当前拥有的权限Id
     * @param treeDTO 菜单树
     * @return 打勾后的权限树
     */
    TreeDTO checkedPermission(List<Long> ownedPermissionIds, TreeDTO treeDTO);

    /**
     * 更新角色的权限
     * @param roleId 角色id
     * @param permissionIds 权限id集合
     */
    void updateRolePermission(Long roleId, List<Long> permissionIds);

    /**
     * 查询指定父权限下的所有权限
     * @param permissionPid 父权限id
     * @param name 权限名称
     * @param page 当前页数
     * @param limit 分页数量
     * @return 权限信息
     */
    Page<SysPermission> query(Long permissionPid, String name, int page, int limit);


    /**
     * 查询全部的菜单权限信息
     * @return 菜单树信息
     */
    List<TreeDTO> queryTree();

    /**
     * 删除指定id的权限
     * @param permissionId 待删除的权限id
     */
    void deletePermission(Long permissionId);

    /**
     * 新增一个权限信息
     * @param permissionVO 权限信息
     */
    void addPermission(PermissionVO permissionVO);

    /**
     * 更新指定id的权限信息
     * @param permissionVO 待更新的权限信息
     */
    void updatePermission(PermissionVO permissionVO);

    /**
     * 查询指定id的权限信息
     * @param permissionId 权限id
     * @return 权限信息
     */
    PermissionDTO getPermission(Long permissionId);

}
