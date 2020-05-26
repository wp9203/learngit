package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysComplianceDepOp implements Serializable {
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
     * 获取 答复时间
     * @return 答复时间
     */
    public Date getReplyTime() {
        return replyTime;
    }

    /**
     * 设置 答复时间
     * @param replyTime 答复时间
     */
    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    /**
     * 获取 答复意见
     * @return 答复意见
     */
    public String getReplyOpinion() {
        return replyOpinion;
    }

    /**
     * 设置 答复意见
     * @param replyOpinion 答复意见
     */
    public void setReplyOpinion(String replyOpinion) {
        this.replyOpinion = replyOpinion;
    }

    /**
     * 获取 答复文号
     * @return 答复文号
     */
    public String getReplyNumber() {
        return replyNumber;
    }

    /**
     * 设置 答复文号
     * @param replyNumber 答复文号
     */
    public void setReplyNumber(String replyNumber) {
        this.replyNumber = replyNumber;
    }

    /**
     * 获取 答复资料
     * @return 答复资料
     */
    public String getReplyData() {
        return replyData;
    }

    /**
     * 设置 答复资料
     * @param replyData 答复资料
     */
    public void setReplyData(String replyData) {
        this.replyData = replyData;
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
        sb.append(", replyTime=").append(replyTime);
        sb.append(", replyOpinion=").append(replyOpinion);
        sb.append(", replyNumber=").append(replyNumber);
        sb.append(", replyData=").append(replyData);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}