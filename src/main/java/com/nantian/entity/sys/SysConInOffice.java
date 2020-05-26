package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysConInOffice implements Serializable {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 谈话时间
     */
    private Date conversationDate;

    /**
     * 谈话人
     */
    private String conversationPerson;

    /**
     * 谈话记录
     */
    private String conversationRecord;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 竞聘者
     * @return 竞聘者
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * 设置 竞聘者
     * @param candidateName 竞聘者
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * 获取 谈话时间
     * @return 谈话时间
     */
    public Date getConversationDate() {
        return conversationDate;
    }

    /**
     * 设置 谈话时间
     * @param conversationDate 谈话时间
     */
    public void setConversationDate(Date conversationDate) {
        this.conversationDate = conversationDate;
    }

    /**
     * 获取 谈话人
     * @return 谈话人
     */
    public String getConversationPerson() {
        return conversationPerson;
    }

    /**
     * 设置 谈话人
     * @param conversationPerson 谈话人
     */
    public void setConversationPerson(String conversationPerson) {
        this.conversationPerson = conversationPerson;
    }

    /**
     * 获取 谈话记录
     * @return 谈话记录
     */
    public String getConversationRecord() {
        return conversationRecord;
    }

    /**
     * 设置 谈话记录
     * @param conversationRecord 谈话记录
     */
    public void setConversationRecord(String conversationRecord) {
        this.conversationRecord = conversationRecord;
    }

    /**
     * 获取 创建时间
     * @return 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 修改时间
     * @return 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间
     * @param updateTime 修改时间
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
        sb.append(", candidateName=").append(candidateName);
        sb.append(", conversationDate=").append(conversationDate);
        sb.append(", conversationPerson=").append(conversationPerson);
        sb.append(", conversationRecord=").append(conversationRecord);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}