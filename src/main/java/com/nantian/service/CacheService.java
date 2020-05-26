package com.nantian.service;

import com.nantian.dto.DictionaryDTO;
import com.nantian.entity.sys.SysOrg;
import com.nantian.entity.sys.SysRole;
import com.nantian.entity.sys.SysUser;

import java.util.List;

/**
 * <p>ClassName: CacheService</p>
 * <p>Description: 缓存用户信息service</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-03</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public interface CacheService {

    /**
     * 保存当前用户的角色id
     * @param username 用户名
     * @param roles 角色
     */
    void saveCurrentUserRole(String username, List<SysRole> roles);

    /**
     * 保存当前用户的个人信息
     * @param user 个人信息
     */
    void saveCurrentUserInfo(SysUser user);

    /**
     * 保存当前用户的构信息
     * @param org 机构信息
     */
    void saveCurrentOrgInfo(SysOrg org);

    /**
     * 从缓存中获取当前用户的角色信息
     * @return 角色id
     */
    List<Long> getCurrentUserRole();

    /**
     * 从缓存中获取当前用户的角色编号信息
     * @return 角色编号
     */
    List<String> getCurrentUserRoleNos();

    /**
     * 从缓存中获取当前用户的信息
     * @return 用户信息
     */
    SysUser getCurrentUserInfo();

    /**
     * 从缓存中获取当前用户的机构信息
     * @return 机构信息
     */
    SysOrg getCurrentOrgInfo();

    /**
     * 获取缓存字典信息
     * @param dictName 字典名称
     * @return 字典数据
     */
    List<DictionaryDTO> getCacheDictValue(String dictName);

    /**
     * 缓存字典信息值
     * @param dictName 字典名称
     * @param data 字典数据
     */
    void setCacheDictValue(String dictName, List<DictionaryDTO> data);

    /**
     * 更新字典缓存
     * @param dictName
     * @param cacheDictValue
     */
    void updateDictValue(String dictName, List<DictionaryDTO> cacheDictValue);

    /**
     * 判断当前用户是否管理员
     * @return 是否管理员
     */
    boolean isAdmin();
}
