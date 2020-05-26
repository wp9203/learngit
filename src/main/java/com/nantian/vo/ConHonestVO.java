package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class ConHonestVO {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<ConHonestVO> infos;

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
     * 谈话材料
     */
    private String conversationData;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     * @return
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

    public List<ConHonestVO> getInfos() {
        return infos;
    }

    public void setInfos(List<ConHonestVO> infos) {
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

    public String getConversationData() {
        return conversationData;
    }

    public void setConversationData(String conversationData) {
        this.conversationData = conversationData;
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
        return "ConHonestVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", conversationDate=" + conversationDate +
                ", conversationPerson='" + conversationPerson + '\'' +
                ", conversationData='" + conversationData + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
