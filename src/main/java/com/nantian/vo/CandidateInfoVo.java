package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;

public class CandidateInfoVo {

    /**
     * 竞聘者ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 竞聘者单位
     */
    private String unit;

    /**
     * 竞聘者职务
     */
    private String position;

    /**
     * 竞聘者职等
     */
    private String positionLevel;

    /**
     * 竞聘类型
     */
    private String candidateType;

    /**
     * 调整类型
     */
    private String adjustType;

    /**
     * 竞聘单位
     */
    private String aspiringUnit;

    /**
     * 竞聘职务
     */
    private String aspiringPosition;

    /**
     * 竞聘职等
     */
    private String aspiringPositionLevel;

    /**
     * 性别
     */
    private String sex;

    /**
     * 出生年月日
     */
    private Date birthday;

    /**
     * 部门
     */
    private String department;

    /**
     * 机构
     */
    private String organization;

    /**
     * 备注
     */
    private String note;

    /**
     * 会议时间
     */
    private Date meetingDate;

    /**
     * 主持人
     */
    private String host;

    /**
     * 会议应到人数
     */
    private String dueNumber;

    /**
     * 会议实到人数
     */
    private String actualNumber;

    /**
     * 纪要文号
     */
    private String summaryNumber;

    /**
     * 报批类型
     */
    private String approvalType;

    /**
     * 批复时间
     */
    private Date replyDate;

    /**
     * 竞聘者人数
     */
    private String candidateNumber;

    /**
     * 笔试时间
     */
    private Date writtenDate;

    /**
     * 笔试结果
     */
    private String writtenResult;

    /**
     * 笔试排名
     */
    private String writtenRanking;

    /**
     * 面试时间
     */
    private Date interviewDate;

    /**
     * 面试结果
     */
    private String interviewResult;

    /**
     * 面试排名
     */
    private String interviewRanking;

    /**
     * 论文评审时间
     */
    private Date thesisDate;

    /**
     * 论文评审结果
     */
    private String thesisResult;

    /**
     * 论文评审排名
     */
    private String thesisRanking;

    /**
     * 综合结果
     */
    private String synthesisResult;

    /**
     * 综合排名
     */
    private String synthesisRanking;

    private Date creationTime;

    private Date updateTime;

    /**
     * 推荐类型 0民主推荐 1公开竞聘
     */
    private String type;

    private String positionSerial;

    public String getPositionSerial() {
        return positionSerial;
    }

    public void setPositionSerial(String positionSerial) {
        this.positionSerial = positionSerial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    public String getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
    }

    public String getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(String adjustType) {
        this.adjustType = adjustType;
    }

    public String getAspiringUnit() {
        return aspiringUnit;
    }

    public void setAspiringUnit(String aspiringUnit) {
        this.aspiringUnit = aspiringUnit;
    }

    public String getAspiringPosition() {
        return aspiringPosition;
    }

    public void setAspiringPosition(String aspiringPosition) {
        this.aspiringPosition = aspiringPosition;
    }

    public String getAspiringPositionLevel() {
        return aspiringPositionLevel;
    }

    public void setAspiringPositionLevel(String aspiringPositionLevel) {
        this.aspiringPositionLevel = aspiringPositionLevel;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getMeetingDate() {
        return meetingDate;
    }

    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDueNumber() {
        return dueNumber;
    }

    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    public String getActualNumber() {
        return actualNumber;
    }

    public void setActualNumber(String actualNumber) {
        this.actualNumber = actualNumber;
    }

    public String getSummaryNumber() {
        return summaryNumber;
    }

    public void setSummaryNumber(String summaryNumber) {
        this.summaryNumber = summaryNumber;
    }

    public String getApprovalType() {
        return approvalType;
    }

    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
    }

    public Date getReplyDate() {
        return replyDate;
    }

    public void setReplyDate(Date replyDate) {
        this.replyDate = replyDate;
    }

    public String getCandidateNumber() {
        return candidateNumber;
    }

    public void setCandidateNumber(String candidateNumber) {
        this.candidateNumber = candidateNumber;
    }

    public Date getWrittenDate() {
        return writtenDate;
    }

    public void setWrittenDate(Date writtenDate) {
        this.writtenDate = writtenDate;
    }

    public String getWrittenResult() {
        return writtenResult;
    }

    public void setWrittenResult(String writtenResult) {
        this.writtenResult = writtenResult;
    }

    public String getWrittenRanking() {
        return writtenRanking;
    }

    public void setWrittenRanking(String writtenRanking) {
        this.writtenRanking = writtenRanking;
    }

    public Date getInterviewDate() {
        return interviewDate;
    }

    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    public String getInterviewResult() {
        return interviewResult;
    }

    public void setInterviewResult(String interviewResult) {
        this.interviewResult = interviewResult;
    }

    public String getInterviewRanking() {
        return interviewRanking;
    }

    public void setInterviewRanking(String interviewRanking) {
        this.interviewRanking = interviewRanking;
    }

    public Date getThesisDate() {
        return thesisDate;
    }

    public void setThesisDate(Date thesisDate) {
        this.thesisDate = thesisDate;
    }

    public String getThesisResult() {
        return thesisResult;
    }

    public void setThesisResult(String thesisResult) {
        this.thesisResult = thesisResult;
    }

    public String getThesisRanking() {
        return thesisRanking;
    }

    public void setThesisRanking(String thesisRanking) {
        this.thesisRanking = thesisRanking;
    }

    public String getSynthesisResult() {
        return synthesisResult;
    }

    public void setSynthesisResult(String synthesisResult) {
        this.synthesisResult = synthesisResult;
    }

    public String getSynthesisRanking() {
        return synthesisRanking;
    }

    public void setSynthesisRanking(String synthesisRanking) {
        this.synthesisRanking = synthesisRanking;
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
        return "CandidateInfoVo{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", candidateType='" + candidateType + '\'' +
                ", adjustType='" + adjustType + '\'' +
                ", aspiringUnit='" + aspiringUnit + '\'' +
                ", aspiringPosition='" + aspiringPosition + '\'' +
                ", aspiringPositionLevel='" + aspiringPositionLevel + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", department='" + department + '\'' +
                ", organization='" + organization + '\'' +
                ", note='" + note + '\'' +
                ", meetingDate=" + meetingDate +
                ", host='" + host + '\'' +
                ", dueNumber='" + dueNumber + '\'' +
                ", actualNumber='" + actualNumber + '\'' +
                ", summaryNumber='" + summaryNumber + '\'' +
                ", approvalType='" + approvalType + '\'' +
                ", replyDate=" + replyDate +
                ", candidateNumber='" + candidateNumber + '\'' +
                ", writtenDate=" + writtenDate +
                ", writtenResult='" + writtenResult + '\'' +
                ", writtenRanking='" + writtenRanking + '\'' +
                ", interviewDate=" + interviewDate +
                ", interviewResult='" + interviewResult + '\'' +
                ", interviewRanking='" + interviewRanking + '\'' +
                ", thesisDate=" + thesisDate +
                ", thesisResult='" + thesisResult + '\'' +
                ", thesisRanking='" + thesisRanking + '\'' +
                ", synthesisResult='" + synthesisResult + '\'' +
                ", synthesisRanking='" + synthesisRanking + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", type='" + type + '\'' +
                ", positionSerial='" + positionSerial + '\'' +
                '}';
    }
}
