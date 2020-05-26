package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    /**
     * 编号
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 角色编号
     */
    private String roleNo;

    /**
     * 角色名称
     */
    private String name;

    /**
     * 角色英文名称
     */
    private String engName;

    /**
     * 状态	0不可用，1可用
     */
    private String status;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 创建时间	审计字段
     */
    private Date creationTime;

    /**
     * 更新时间	审计字段
     */
    private Date updateTime;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 编号
     * @return 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 编号
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 角色编号
     * @return 角色编号
     */
    public String getRoleNo() {
        return roleNo;
    }

    /**
     * 设置 角色编号
     * @param roleNo 角色编号
     */
    public void setRoleNo(String roleNo) {
        this.roleNo = roleNo;
    }

    /**
     * 获取 角色名称
     * @return 角色名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 角色名称
     * @param name 角色名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 角色英文名称
     * @return 角色英文名称
     */
    public String getEngName() {
        return engName;
    }

    /**
     * 设置 角色英文名称
     * @param engName 角色英文名称
     */
    public void setEngName(String engName) {
        this.engName = engName;
    }

    /**
     * 获取 状态	0不可用，1可用
     * @return 状态	0不可用，1可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 状态	0不可用，1可用
     * @param status 状态	0不可用，1可用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取 扩展字段1
     * @return 扩展字段1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * 设置 扩展字段1
     * @param extend1 扩展字段1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    /**
     * 获取 扩展字段2
     * @return 扩展字段2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * 设置 扩展字段2
     * @param extend2 扩展字段2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    /**
     * 获取 创建时间	审计字段
     * @return 创建时间	审计字段
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间	审计字段
     * @param creationTime 创建时间	审计字段
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 更新时间	审计字段
     * @return 更新时间	审计字段
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间	审计字段
     * @param updateTime 更新时间	审计字段
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleNo=").append(roleNo);
        sb.append(", name=").append(name);
        sb.append(", engName=").append(engName);
        sb.append(", status=").append(status);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}