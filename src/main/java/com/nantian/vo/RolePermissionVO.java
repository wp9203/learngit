package com.nantian.vo;


import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.List;

/**
 * <p>ClassName: RolePermissionVO</p>
 * <p>Description: 角色权限</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-03</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class RolePermissionVO {

    /**
     * 角色id
     */
    private Long roleId;

    /**
     * 权限的id
     */
    private List<Long> permissionIds;

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public List<Long> getPermissionIds() {
        return permissionIds;
    }

    public void setPermissionIds(List<Long> permissionIds) {
        this.permissionIds = permissionIds;
    }

    @Override
    public String toString() {
        return "RolePermissionVO{" +
                "roleId=" + roleId +
                ", permissionIds=" + permissionIds +
                '}';
    }
}
