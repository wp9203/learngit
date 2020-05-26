package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysLoginLog implements Serializable {
    /**
     * 编号
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 登录用户
     */
    private String username;

    /**
     * 登录IP地址
     */
    private String ipAddress;

    /**
     * 登录的设备
     */
    private String equipment;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 登录时间	审计字段
     */
    private Date creationTime;

    /**
     * 登录日志路径
     */
    private String path;

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
     * 获取 登录用户
     * @return 登录用户
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置 登录用户
     * @param username 登录用户
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取 登录IP地址
     * @return 登录IP地址
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置 登录IP地址
     * @param ipAddress 登录IP地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 获取 登录的设备
     * @return 登录的设备
     */
    public String getEquipment() {
        return equipment;
    }

    /**
     * 设置 登录的设备
     * @param equipment 登录的设备
     */
    public void setEquipment(String equipment) {
        this.equipment = equipment;
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
     * 获取 登录时间	审计字段
     * @return 登录时间	审计字段
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 登录时间	审计字段
     * @param creationTime 登录时间	审计字段
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 登录日志路径
     * @return 登录日志路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置 登录日志路径
     * @param path 登录日志路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", equipment=").append(equipment);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", path=").append(path);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}