package com.nantian.vo;


import java.io.Serializable;
import java.util.Date;

public class OperatLogVO implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 登录用户
     */
    private String account;

    /**
     * 渠道
     */
    private String channel;

    /**
     * 交易码
     */
    private String transCode;

    /**
     * 接口
     */
    private String push;

    /**
     * 登录IP地址
     */
    private String ipAddress;

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
     * 路径
     */
    private String path;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取 编号
     *
     * @return 编号
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 编号
     *
     * @param id 编号
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 登录用户
     *
     * @return 登录用户
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置 登录用户
     *
     * @param account 登录用户
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取 渠道
     *
     * @return 渠道
     */
    public String getChannel() {
        return channel;
    }

    /**
     * 设置 渠道
     *
     * @param channel 渠道
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * 获取 交易码
     *
     * @return 交易码
     */
    public String getTransCode() {
        return transCode;
    }

    /**
     * 设置 交易码
     *
     * @param transCode 交易码
     */
    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    /**
     * 获取 接口
     *
     * @return 接口
     */
    public String getPush() {
        return push;
    }

    /**
     * 设置 接口
     *
     * @param push 接口
     */
    public void setPush(String push) {
        this.push = push;
    }

    /**
     * 获取 登录IP地址
     *
     * @return 登录IP地址
     */
    public String getIpAddress() {
        return ipAddress;
    }

    /**
     * 设置 登录IP地址
     *
     * @param ipAddress 登录IP地址
     */
    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * 获取 扩展字段1
     *
     * @return 扩展字段1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * 设置 扩展字段1
     *
     * @param extend1 扩展字段1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    /**
     * 获取 扩展字段2
     *
     * @return 扩展字段2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * 设置 扩展字段2
     *
     * @param extend2 扩展字段2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    /**
     * 获取 登录时间	审计字段
     *
     * @return 登录时间    审计字段
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 登录时间	审计字段
     *
     * @param creationTime 登录时间	审计字段
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    @Override
    public String toString() {
        return "OperatLogVO{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", channel='" + channel + '\'' +
                ", transCode='" + transCode + '\'' +
                ", push='" + push + '\'' +
                ", ipAddress='" + ipAddress + '\'' +
                ", extend1='" + extend1 + '\'' +
                ", extend2='" + extend2 + '\'' +
                ", creationTime=" + creationTime +
                '}';
    }
}