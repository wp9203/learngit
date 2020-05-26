package com.nantian.entity.sys;

import java.io.Serializable;
import java.util.Date;

public class SysFirstMotion implements Serializable {
    /**
     * 动议ID 
     */
    private Long id;

    /**
     * 动议时间
     */
    private Date meetingDate;

    /**
     * 主持人
     */
    private String host;

    /**
     * 应到人数
     */
    private String dueNumber;

    /**
     * 实到人数
     */
    private String actualNumber;

    /**
     * 纪要文号
     */
    private String summaryNumber;

    /**
     * 竞聘者名字
     */
    private String candidateName;

    /**
     * 调整类型
     */
    private String adjustType;

    /**
     * 拟调整单位
     */
    private String aspiringUnit;

    /**
     * 拟调整职务
     */
    private String aspiringPosition;

    /**
     * 拟调整职等
     */
    private String aspiringPositionLevel;

    /**
     * 备注
     */
    private String note;

    /**
     * 是否通过
     */
    private String pass;

    /**
     * 流程实例ID
     */
    private String instanceId;

    private Date creationTime;

    private Date updateTime;

    private String summaryFileName;

    private String signFileName;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 动议ID 
     * @return 动议ID 
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 动议ID 
     * @param id 动议ID 
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 动议时间
     * @return 动议时间
     */
    public Date getMeetingDate() {
        return meetingDate;
    }

    /**
     * 设置 动议时间
     * @param meetingDate 动议时间
     */
    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    /**
     * 获取 主持人
     * @return 主持人
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置 主持人
     * @param host 主持人
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 获取 应到人数
     * @return 应到人数
     */
    public String getDueNumber() {
        return dueNumber;
    }

    /**
     * 设置 应到人数
     * @param dueNumber 应到人数
     */
    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    /**
     * 获取 实到人数
     * @return 实到人数
     */
    public String getActualNumber() {
        return actualNumber;
    }

    /**
     * 设置 实到人数
     * @param actualNumber 实到人数
     */
    public void setActualNumber(String actualNumber) {
        this.actualNumber = actualNumber;
    }

    /**
     * 获取 纪要文号
     * @return 纪要文号
     */
    public String getSummaryNumber() {
        return summaryNumber;
    }

    /**
     * 设置 纪要文号
     * @param summaryNumber 纪要文号
     */
    public void setSummaryNumber(String summaryNumber) {
        this.summaryNumber = summaryNumber;
    }

    /**
     * 获取 竞聘者名字
     * @return 竞聘者名字
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * 设置 竞聘者名字
     * @param candidateName 竞聘者名字
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * 获取 调整类型
     * @return 调整类型
     */
    public String getAdjustType() {
        return adjustType;
    }

    /**
     * 设置 调整类型
     * @param adjustType 调整类型
     */
    public void setAdjustType(String adjustType) {
        this.adjustType = adjustType;
    }

    /**
     * 获取 拟调整单位
     * @return 拟调整单位
     */
    public String getAspiringUnit() {
        return aspiringUnit;
    }

    /**
     * 设置 拟调整单位
     * @param aspiringUnit 拟调整单位
     */
    public void setAspiringUnit(String aspiringUnit) {
        this.aspiringUnit = aspiringUnit;
    }

    /**
     * 获取 拟调整职务
     * @return 拟调整职务
     */
    public String getAspiringPosition() {
        return aspiringPosition;
    }

    /**
     * 设置 拟调整职务
     * @param aspiringPosition 拟调整职务
     */
    public void setAspiringPosition(String aspiringPosition) {
        this.aspiringPosition = aspiringPosition;
    }

    /**
     * 获取 拟调整职等
     * @return 拟调整职等
     */
    public String getAspiringPositionLevel() {
        return aspiringPositionLevel;
    }

    /**
     * 设置 拟调整职等
     * @param aspiringPositionLevel 拟调整职等
     */
    public void setAspiringPositionLevel(String aspiringPositionLevel) {
        this.aspiringPositionLevel = aspiringPositionLevel;
    }

    /**
     * 获取 备注
     * @return 备注
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置 备注
     * @param note 备注
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取 是否通过
     * @return 是否通过
     */
    public String getPass() {
        return pass;
    }

    /**
     * 设置 是否通过
     * @param pass 是否通过
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 获取 流程实例ID
     * @return 流程实例ID
     */
    public String getInstanceId() {
        return instanceId;
    }

    /**
     * 设置 流程实例ID
     * @param instanceId 流程实例ID
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
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

    public String getSummaryFileName() {
        return summaryFileName;
    }

    public void setSummaryFileName(String summaryFileName) {
        this.summaryFileName = summaryFileName;
    }

    public String getSignFileName() {
        return signFileName;
    }

    public void setSignFileName(String signFileName) {
        this.signFileName = signFileName;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", meetingDate=").append(meetingDate);
        sb.append(", host=").append(host);
        sb.append(", dueNumber=").append(dueNumber);
        sb.append(", actualNumber=").append(actualNumber);
        sb.append(", summaryNumber=").append(summaryNumber);
        sb.append(", candidateName=").append(candidateName);
        sb.append(", adjustType=").append(adjustType);
        sb.append(", aspiringUnit=").append(aspiringUnit);
        sb.append(", aspiringPosition=").append(aspiringPosition);
        sb.append(", aspiringPositionLevel=").append(aspiringPositionLevel);
        sb.append(", note=").append(note);
        sb.append(", pass=").append(pass);
        sb.append(", instanceId=").append(instanceId);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", summaryFileName=").append(summaryFileName);
        sb.append(", signFileName=").append(signFileName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}