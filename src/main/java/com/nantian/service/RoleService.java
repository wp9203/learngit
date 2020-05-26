package com.nantian.service;



import com.github.pagehelper.Page;
import com.nantian.dto.TreeDTO;
import com.nantian.entity.sys.SysPermission;
import com.nantian.entity.sys.SysRole;
import com.nantian.entity.sys.SysUser;
import com.nantian.vo.RolePermissionVO;
import com.nantian.vo.RoleVO;

import java.util.List;

/**
 * <p>ClassName: RoleService</p>
 * <p>Description: 角色service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-11-30</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface RoleService {

    /**
     * 根据用户名，查找该用户对应的角色信息
     * @param username 用户名
     * @return 角色列表
     */
    List<SysRole> getUserRole(String username);

    /**
     * 获取全部的角色信息
     * @return 角色列表
     */
    List<SysRole> getAllRole();
    /**
     * 查询指定条件下的角色信息
     * @param roleNo 角色编号
     * @param name 角色名称
     * @param status 角色状态
     * @param page 当前页数
     * @param limit 每页数量
     * @return 角色列表
     */
    Page<SysRole> query(String roleNo, String name, String status, int page, int limit);

    /**
     * 添加一个角色
     * @param roleVO 角色信息
     */
    void addRole(RoleVO roleVO);

    /**
     * 删除指定id的角色
     * @param roleId 待删除的角色id
     */
    void delete(long roleId);

    /**
     * 更新角色信息
     * @param roleVO 待更新的角色信息
     */
    void update(RoleVO roleVO);

    /**
     * 获取指定角色id拥有权限，及最大的权限
     * 最大权限为当前登录用户的权限范围
     * 当指定角色的权限id比当前用户登录的用户权限大时，其余权限不显示
     * @param roleId 角色id
     * @return 权限集
     */
    List<TreeDTO> getRolePermission(Long roleId);

    /**
     * 更新角色的权限
     * @param rolePermissionVO 新的角色id对应的权限信息
     */
    void updateRolePermission(RolePermissionVO rolePermissionVO);

    /**
     * 获取指定角色的信息
     * @param roleId 角色的id
     * @return 角色信息
     */
    SysRole getRole(Long roleId);

}
