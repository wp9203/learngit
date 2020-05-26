package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysAppBankingSupervision implements Serializable {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 单位
     */
    private String unit;

    /**
     * 职位
     */
    private String position;

    /**
     * 是否需要核准
     */
    private String approve;

    /**
     * 报批时间
     */
    private Date approvalDate;

    /**
     * 报批文号
     */
    private String approvalNumber;

    /**
     * 批复时间
     */
    private Date replyDate;

    /**
     * 是否同意
     */
    private String pass;

    /**
     * 批复文号
     */
    private String replyNumber;

    /**
     * 批复材料
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
     * 获取 单位
     * @return 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置 单位
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取 职位
     * @return 职位
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 职位
     * @param position 职位
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 是否需要核准
     * @return 是否需要核准
     */
    public String getApprove() {
        return approve;
    }

    /**
     * 设置 是否需要核准
     * @param approve 是否需要核准
     */
    public void setApprove(String approve) {
        this.approve = approve;
    }

    /**
     * 获取 报批时间
     * @return 报批时间
     */
    public Date getApprovalDate() {
        return approvalDate;
    }

    /**
     * 设置 报批时间
     * @param approvalDate 报批时间
     */
    public void setApprovalDate(Date approvalDate) {
        this.approvalDate = approvalDate;
    }

    /**
     * 获取 报批文号
     * @return 报批文号
     */
    public String getApprovalNumber() {
        return approvalNumber;
    }

    /**
     * 设置 报批文号
     * @param approvalNumber 报批文号
     */
    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    /**
     * 获取 批复时间
     * @return 批复时间
     */
    public Date getReplyDate() {
        return replyDate;
    }

    /**
     * 设置 批复时间
     * @param replyDate 批复时间
     */
    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    /**
     * 获取 是否同意
     * @return 是否同意
     */
    public String getPass() {
        return pass;
    }

    /**
     * 设置 是否同意
     * @param pass 是否同意
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 获取 批复文号
     * @return 批复文号
     */
    public String getReplyNumber() {
        return replyNumber;
    }

    /**
     * 设置 批复文号
     * @param replyNumber 批复文号
     */
    public void setReplyNumber(String replyNumber) {
        this.replyNumber = replyNumber;
    }

    /**
     * 获取 批复材料
     * @return 批复材料
     */
    public String getReplyData() {
        return replyData;
    }

    /**
     * 设置 批复材料
     * @param replyData 批复材料
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
        sb.append(", unit=").append(unit);
        sb.append(", position=").append(position);
        sb.append(", approve=").append(approve);
        sb.append(", approvalDate=").append(approvalDate);
        sb.append(", approvalNumber=").append(approvalNumber);
        sb.append(", replyDate=").append(replyDate);
        sb.append(", pass=").append(pass);
        sb.append(", replyNumber=").append(replyNumber);
        sb.append(", replyData=").append(replyData);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}