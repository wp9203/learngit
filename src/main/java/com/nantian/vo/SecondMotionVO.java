package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class SecondMotionVO {

    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<SecondMotionVO> infos;

    private List<SecondMotionVO> req;

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

    public List<SecondMotionVO> getInfos() {
        return infos;
    }

    public void setInfos(List<SecondMotionVO> infos) {
        this.infos = infos;
    }

    public List<SecondMotionVO> getReq() {
        return req;
    }

    public void setReq(List<SecondMotionVO> req) {
        this.req = req;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getChangUnit() {
        return changUnit;
    }

    public void setChangUnit(String changUnit) {
        this.changUnit = changUnit;
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
        return "SecondMotionVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", req=" + req +
                ", meetingDate=" + meetingDate +
                ", host='" + host + '\'' +
                ", dueNumber='" + dueNumber + '\'' +
                ", actualNumber='" + actualNumber + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", note='" + note + '\'' +
                ", pass='" + pass + '\'' +
                ", changUnit='" + changUnit + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", summaryNumber='" + summaryNumber + '\'' +
                ", signFilePath='" + signFilePath + '\'' +
                ", summaryFilePath='" + summaryFilePath + '\'' +
                ", newPosition='" + newPosition + '\'' +
                '}';
    }
}
