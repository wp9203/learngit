package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysSecondMotion implements Serializable {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * ��������
     */
    private Date meetingDate;

    /**
     * ������
     */
    private String host;

    /**
     * ������������
     */
    private String dueNumber;

    /**
     * ������������
     */
    private String actualNumber;

    /**
     * ������
     */
    private String candidateName;

    /**
     * ����
     */
    private String unit;

    /**
     * ����
     */
    private String position;

    /**
     * ����
     */
    private String positionLevel;

    /**
     * ����
     */
    private String note;

    /**
     * ��������
     */
    private String pass;

    /**
     * ������������
     */
    private String changUnit;

    /**
     * ��������
     */
    private Date creationTime;

    /**
     * ��������
     */
    private Date updateTime;

    private String summaryNumber;

    private String signFilePath;

    private String summaryFilePath;

    private String newPosition;

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
     * 获取 ��������
     * @return ��������
     */
    public Date getMeetingDate() {
        return meetingDate;
    }

    /**
     * 设置 ��������
     * @param meetingDate ��������
     */
    public void setMeetingDate(Date meetingDate) {
        this.meetingDate = meetingDate;
    }

    /**
     * 获取 ������
     * @return ������
     */
    public String getHost() {
        return host;
    }

    /**
     * 设置 ������
     * @param host ������
     */
    public void setHost(String host) {
        this.host = host;
    }

    /**
     * 获取 ������������
     * @return ������������
     */
    public String getDueNumber() {
        return dueNumber;
    }

    /**
     * 设置 ������������
     * @param dueNumber ������������
     */
    public void setDueNumber(String dueNumber) {
        this.dueNumber = dueNumber;
    }

    /**
     * 获取 ������������
     * @return ������������
     */
    public String getActualNumber() {
        return actualNumber;
    }

    /**
     * 设置 ������������
     * @param actualNumber ������������
     */
    public void setActualNumber(String actualNumber) {
        this.actualNumber = actualNumber;
    }

    /**
     * 获取 ������
     * @return ������
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * 设置 ������
     * @param candidateName ������
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * 获取 ����
     * @return ����
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置 ����
     * @param unit ����
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取 ����
     * @return ����
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 ����
     * @param position ����
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 ����
     * @return ����
     */
    public String getPositionLevel() {
        return positionLevel;
    }

    /**
     * 设置 ����
     * @param positionLevel ����
     */
    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    /**
     * 获取 ����
     * @return ����
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置 ����
     * @param note ����
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取 ��������
     * @return ��������
     */
    public String getPass() {
        return pass;
    }

    /**
     * 设置 ��������
     * @param pass ��������
     */
    public void setPass(String pass) {
        this.pass = pass;
    }

    /**
     * 获取 ������������
     * @return ������������
     */
    public String getChangUnit() {
        return changUnit;
    }

    /**
     * 设置 ������������
     * @param changUnit ������������
     */
    public void setChangUnit(String changUnit) {
        this.changUnit = changUnit;
    }

    /**
     * 获取 ��������
     * @return ��������
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 ��������
     * @param creationTime ��������
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 ��������
     * @return ��������
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 ��������
     * @param updateTime ��������
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSummaryNumber() {
        return summaryNumber;
    }

    public void setSummaryNumber(String summaryNumber) {
        this.summaryNumber = summaryNumber;
    }

    public String getSignFilePath() {
        return signFilePath;
    }

    public void setSignFilePath(String signFilePath) {
        this.signFilePath = signFilePath;
    }

    public String getSummaryFilePath() {
        return summaryFilePath;
    }

    public void setSummaryFilePath(String summaryFilePath) {
        this.summaryFilePath = summaryFilePath;
    }

    public String getNewPosition() {
        return newPosition;
    }

    public void setNewPosition(String newPosition) {
        this.newPosition = newPosition;
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
        sb.append(", candidateName=").append(candidateName);
        sb.append(", unit=").append(unit);
        sb.append(", position=").append(position);
        sb.append(", positionLevel=").append(positionLevel);
        sb.append(", note=").append(note);
        sb.append(", pass=").append(pass);
        sb.append(", changUnit=").append(changUnit);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", summaryNumber=").append(summaryNumber);
        sb.append(", signFilePath=").append(signFilePath);
        sb.append(", summaryFilePath=").append(summaryFilePath);
        sb.append(", newPosition=").append(newPosition);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}