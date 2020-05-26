package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysCandidateInfo implements Serializable {
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
    private String birthday;

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
     * 获取 竞聘者单位
     * @return 竞聘者单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置 竞聘者单位
     * @param unit 竞聘者单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取 竞聘者职务
     * @return 竞聘者职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 竞聘者职务
     * @param position 竞聘者职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 竞聘者职等
     * @return 竞聘者职等
     */
    public String getPositionLevel() {
        return positionLevel;
    }

    /**
     * 设置 竞聘者职等
     * @param positionLevel 竞聘者职等
     */
    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    /**
     * 获取 竞聘类型
     * @return 竞聘类型
     */
    public String getCandidateType() {
        return candidateType;
    }

    /**
     * 设置 竞聘类型
     * @param candidateType 竞聘类型
     */
    public void setCandidateType(String candidateType) {
        this.candidateType = candidateType;
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
     * 获取 竞聘单位
     * @return 竞聘单位
     */
    public String getAspiringUnit() {
        return aspiringUnit;
    }

    /**
     * 设置 竞聘单位
     * @param aspiringUnit 竞聘单位
     */
    public void setAspiringUnit(String aspiringUnit) {
        this.aspiringUnit = aspiringUnit;
    }

    /**
     * 获取 竞聘职务
     * @return 竞聘职务
     */
    public String getAspiringPosition() {
        return aspiringPosition;
    }

    /**
     * 设置 竞聘职务
     * @param aspiringPosition 竞聘职务
     */
    public void setAspiringPosition(String aspiringPosition) {
        this.aspiringPosition = aspiringPosition;
    }

    /**
     * 获取 竞聘职等
     * @return 竞聘职等
     */
    public String getAspiringPositionLevel() {
        return aspiringPositionLevel;
    }

    /**
     * 设置 竞聘职等
     * @param aspiringPositionLevel 竞聘职等
     */
    public void setAspiringPositionLevel(String aspiringPositionLevel) {
        this.aspiringPositionLevel = aspiringPositionLevel;
    }

    /**
     * 获取 性别
     * @return 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置 性别
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取 出生年月日
     * @return 出生年月日
     */
    public String getBirthday() {
        return birthday;
    }

    /**
     * 设置 出生年月日
     * @param birthday 出生年月日
     */
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    /**
     * 获取 部门
     * @return 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置 部门
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取 机构
     * @return 机构
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * 设置 机构
     * @param organization 机构
     */
    public void setOrganization(String organization) {
        this.organization = organization;
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
     * 获取 会议时间
     * @return 会议时间
     */
    public Date getMeetingDate() {
        return meetingDate;
    }

    /**
     * 设置 会议时间
     * @param meetingDate 会议时间
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
     * 获取 会议应到人数
     * @return 会议应到人数
     */
    public String getDueNumber() {
        return dueNumber;
    }

    /**
     * 设置 会议应到人数
     * @param dueNumber 会议应到人数
     */
    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    /**
     * 获取 会议实到人数
     * @return 会议实到人数
     */
    public String getActualNumber() {
        return actualNumber;
    }

    /**
     * 设置 会议实到人数
     * @param actualNumber 会议实到人数
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
     * 获取 报批类型
     * @return 报批类型
     */
    public String getApprovalType() {
        return approvalType;
    }

    /**
     * 设置 报批类型
     * @param approvalType 报批类型
     */
    public void setApprovalType(String approvalType) {
        this.approvalType = approvalType;
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
     * 获取 竞聘者人数
     * @return 竞聘者人数
     */
    public String getCandidateNumber() {
        return candidateNumber;
    }

    /**
     * 设置 竞聘者人数
     * @param candidateNumber 竞聘者人数
     */
    public void setCandidateNumber(String candidateNumber) {
        this.candidateNumber = candidateNumber;
    }

    /**
     * 获取 笔试时间
     * @return 笔试时间
     */
    public Date getWrittenDate() {
        return writtenDate;
    }

    /**
     * 设置 笔试时间
     * @param writtenDate 笔试时间
     */
    public void setWrittenDate(Date writtenDate) {
        this.writtenDate = writtenDate;
    }

    /**
     * 获取 笔试结果
     * @return 笔试结果
     */
    public String getWrittenResult() {
        return writtenResult;
    }

    /**
     * 设置 笔试结果
     * @param writtenResult 笔试结果
     */
    public void setWrittenResult(String writtenResult) {
        this.writtenResult = writtenResult;
    }

    /**
     * 获取 笔试排名
     * @return 笔试排名
     */
    public String getWrittenRanking() {
        return writtenRanking;
    }

    /**
     * 设置 笔试排名
     * @param writtenRanking 笔试排名
     */
    public void setWrittenRanking(String writtenRanking) {
        this.writtenRanking = writtenRanking;
    }

    /**
     * 获取 面试时间
     * @return 面试时间
     */
    public Date getInterviewDate() {
        return interviewDate;
    }

    /**
     * 设置 面试时间
     * @param interviewDate 面试时间
     */
    public void setInterviewDate(Date interviewDate) {
        this.interviewDate = interviewDate;
    }

    /**
     * 获取 面试结果
     * @return 面试结果
     */
    public String getInterviewResult() {
        return interviewResult;
    }

    /**
     * 设置 面试结果
     * @param interviewResult 面试结果
     */
    public void setInterviewResult(String interviewResult) {
        this.interviewResult = interviewResult;
    }

    /**
     * 获取 面试排名
     * @return 面试排名
     */
    public String getInterviewRanking() {
        return interviewRanking;
    }

    /**
     * 设置 面试排名
     * @param interviewRanking 面试排名
     */
    public void setInterviewRanking(String interviewRanking) {
        this.interviewRanking = interviewRanking;
    }

    /**
     * 获取 论文评审时间
     * @return 论文评审时间
     */
    public Date getThesisDate() {
        return thesisDate;
    }

    /**
     * 设置 论文评审时间
     * @param thesisDate 论文评审时间
     */
    public void setThesisDate(Date thesisDate) {
        this.thesisDate = thesisDate;
    }

    /**
     * 获取 论文评审结果
     * @return 论文评审结果
     */
    public String getThesisResult() {
        return thesisResult;
    }

    /**
     * 设置 论文评审结果
     * @param thesisResult 论文评审结果
     */
    public void setThesisResult(String thesisResult) {
        this.thesisResult = thesisResult;
    }

    /**
     * 获取 论文评审排名
     * @return 论文评审排名
     */
    public String getThesisRanking() {
        return thesisRanking;
    }

    /**
     * 设置 论文评审排名
     * @param thesisRanking 论文评审排名
     */
    public void setThesisRanking(String thesisRanking) {
        this.thesisRanking = thesisRanking;
    }

    /**
     * 获取 综合结果
     * @return 综合结果
     */
    public String getSynthesisResult() {
        return synthesisResult;
    }

    /**
     * 设置 综合结果
     * @param synthesisResult 综合结果
     */
    public void setSynthesisResult(String synthesisResult) {
        this.synthesisResult = synthesisResult;
    }

    /**
     * 获取 综合排名
     * @return 综合排名
     */
    public String getSynthesisRanking() {
        return synthesisRanking;
    }

    /**
     * 设置 综合排名
     * @param synthesisRanking 综合排名
     */
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

    /**
     * 获取 推荐类型 0民主推荐 1公开竞聘
     * @return 推荐类型 0民主推荐 1公开竞聘
     */
    public String getType() {
        return type;
    }

    /**
     * 设置 推荐类型 0民主推荐 1公开竞聘
     * @param type 推荐类型 0民主推荐 1公开竞聘
     */
    public void setType(String type) {
        this.type = type;
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
        sb.append(", positionLevel=").append(positionLevel);
        sb.append(", candidateType=").append(candidateType);
        sb.append(", adjustType=").append(adjustType);
        sb.append(", aspiringUnit=").append(aspiringUnit);
        sb.append(", aspiringPosition=").append(aspiringPosition);
        sb.append(", aspiringPositionLevel=").append(aspiringPositionLevel);
        sb.append(", sex=").append(sex);
        sb.append(", birthday=").append(birthday);
        sb.append(", department=").append(department);
        sb.append(", organization=").append(organization);
        sb.append(", note=").append(note);
        sb.append(", meetingDate=").append(meetingDate);
        sb.append(", host=").append(host);
        sb.append(", dueNumber=").append(dueNumber);
        sb.append(", actualNumber=").append(actualNumber);
        sb.append(", summaryNumber=").append(summaryNumber);
        sb.append(", approvalType=").append(approvalType);
        sb.append(", replyDate=").append(replyDate);
        sb.append(", candidateNumber=").append(candidateNumber);
        sb.append(", writtenDate=").append(writtenDate);
        sb.append(", writtenResult=").append(writtenResult);
        sb.append(", writtenRanking=").append(writtenRanking);
        sb.append(", interviewDate=").append(interviewDate);
        sb.append(", interviewResult=").append(interviewResult);
        sb.append(", interviewRanking=").append(interviewRanking);
        sb.append(", thesisDate=").append(thesisDate);
        sb.append(", thesisResult=").append(thesisResult);
        sb.append(", thesisRanking=").append(thesisRanking);
        sb.append(", synthesisResult=").append(synthesisResult);
        sb.append(", synthesisRanking=").append(synthesisRanking);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", type=").append(type);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}