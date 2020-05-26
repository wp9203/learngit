package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class ComplianceDepOpVO {

    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 答复时间
     */
    private Date replyTime;

    /**
     * 答复意见
     */
    private String replyOpinion;

    /**
     * 答复文号
     */
    private String replyNumber;

    /**
     * 答复资料
     */
    private String replyData;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * id集合
     */
    private List<Long> ids;
    /**
     * complianceDepOp 集合
     */
    private List<ComplianceDepOpVO> infos;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyOpinion() {
        return replyOpinion;
    }

    public void setReplyOpinion(String replyOpinion) {
        this.replyOpinion = replyOpinion;
    }

    public String getReplyNumber() {
        return replyNumber;
    }

    public void setReplyNumber(String replyNumber) {
        this.replyNumber = replyNumber;
    }

    public String getReplyData() {
        return replyData;
    }

    public void setReplyData(String replyData) {
        this.replyData = replyData;
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

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<ComplianceDepOpVO> getInfos() {
        return infos;
    }

    public void setInfos(List<ComplianceDepOpVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "ComplianceDepOpVO{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", replyTime=" + replyTime +
                ", replyOpinion='" + replyOpinion + '\'' +
                ", replyNumber='" + replyNumber + '\'' +
                ", replyData='" + replyData + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", ids=" + ids +
                ", infos=" + infos +
                '}';
    }
}
