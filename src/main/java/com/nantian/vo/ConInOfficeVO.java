package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class ConInOfficeVO {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<ConInOfficeVO> infos;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<ConInOfficeVO> getInfos() {
        return infos;
    }

    public void setInfos(List<ConInOfficeVO> infos) {
        this.infos = infos;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Date getConversationDate() {
        return conversationDate;
    }

    public void setConversationDate(Date conversationDate) {
        this.conversationDate = conversationDate;
    }

    public String getConversationPerson() {
        return conversationPerson;
    }

    public void setConversationPerson(String conversationPerson) {
        this.conversationPerson = conversationPerson;
    }

    public String getConversationRecord() {
        return conversationRecord;
    }

    public void setConversationRecord(String conversationRecord) {
        this.conversationRecord = conversationRecord;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "ConInOfficeVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", conversationDate=" + conversationDate +
                ", conversationPerson='" + conversationPerson + '\'' +
                ", conversationRecord='" + conversationRecord + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
