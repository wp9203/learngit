package com.nantian.service;

import com.nantian.dto.AuthorizationDTO;

import java.util.List;

/**
 * <p>ClassName: PermissionService</p>
 * <p>Description: 权限认证service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-23</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface PermissionService {

    /**
     * 查询指定权限id的url对应的角色信息
     * @param permissionIds 权限id
     * @return url权限对应的角色信息
     */
    List<AuthorizationDTO> queryPermissionRoleData(List<Long> permissionIds);

    /**
     * 查询用户是否拥有该url权限
     * @param url url地址
     * @return 返回是否有权限
     */
    boolean checkPermission(String url);

    /**
     * 添加权限信息到缓存中
     * @param authorizations 权限信息
     * @return 是否添加成功
     */
    boolean addPermissionCache(List<AuthorizationDTO> authorizations);

    /**
     * 更新指定权限的信息
     * @param authorizations 权限信息
     */
    void updatePermissionCache(List<AuthorizationDTO> authorizations);

    /**
     * 删除缓存中的url权限
     * @param urls url集合
     */
    void deletePermissionCache(List<String> urls);

    /**
     * 删除缓存中指定url的权限
     * @param url url
     */
    void deletePermissionCache(String url);
}
