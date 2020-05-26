package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysInspectArchives implements Serializable {

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
     * 职务
     */
    private String position;

    /**
     * 核查时间
     */
    private Date inspectTime;

    /**
     * 核查问题
     */
    private String inspectProblem;

    /**
     * 核查记录
     */
    private String inspectRecord;

    /**
     * 审核认定
     */
    private String reviewIdentified;

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
     * 获取 职务
     * @return 职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 职务
     * @param position 职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 核查时间
     * @return 核查时间
     */
    public Date getInspectTime() {
        return inspectTime;
    }

    /**
     * 设置 核查时间
     * @param inspectTime 核查时间
     */
    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    /**
     * 获取 核查问题
     * @return 核查问题
     */
    public String getInspectProblem() {
        return inspectProblem;
    }

    /**
     * 设置 核查问题
     * @param inspectProblem 核查问题
     */
    public void setInspectProblem(String inspectProblem) {
        this.inspectProblem = inspectProblem;
    }

    /**
     * 获取 核查记录
     * @return 核查记录
     */
    public String getInspectRecord() {
        return inspectRecord;
    }

    /**
     * 设置 核查记录
     * @param inspectRecord 核查记录
     */
    public void setInspectRecord(String inspectRecord) {
        this.inspectRecord = inspectRecord;
    }

    /**
     * 获取 审核认定
     * @return 审核认定
     */
    public String getReviewIdentified() {
        return reviewIdentified;
    }

    /**
     * 设置 审核认定
     * @param reviewIdentified 审核认定
     */
    public void setReviewIdentified(String reviewIdentified) {
        this.reviewIdentified = reviewIdentified;
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
        sb.append(", inspectTime=").append(inspectTime);
        sb.append(", inspectProblem=").append(inspectProblem);
        sb.append(", inspectRecord=").append(inspectRecord);
        sb.append(", reviewIdentified=").append(reviewIdentified);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}