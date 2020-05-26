package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;

public class SysUserRoleKey implements Serializable {
    /**
     * 编号
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long userId;

    /**
     * 角色编号
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long roleId;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 编号
     * @return 编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置 编号
     * @param userId 编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取 角色编号
     * @return 角色编号
     */
    public Long getRoleId() {
        return roleId;
    }

    /**
     * 设置 角色编号
     * @param roleId 角色编号
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userId=").append(userId);
        sb.append(", roleId=").append(roleId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}