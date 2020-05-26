package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class FirstMotionVO {
    /**
     * 动议ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 流程ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long flowid;

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

    List<FirstMotionVO> infos;

    private List<Long> ids;

    FirstMotionVO  req;

    public Long getFlowid() {
        return flowid;
    }

    public void setFlowid(Long flowid) {
        this.flowid = flowid;
    }

    public List<FirstMotionVO> getInfos() {
        return infos;
    }

    public void setInfos(List<FirstMotionVO> infos) {
        this.infos = infos;
    }

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public FirstMotionVO getReq() {
        return req;
    }

    public void setReq(FirstMotionVO req) {
        this.req = req;
    }

    private Date creationTime;

    private Date updateTime;

    private String summaryFileName;

    private String file;

    private String signFileName;

    private String layTableCheckbox;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getCandidateName() {
        return candidateName;
    }

    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
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

    public String getInstanceId() {
        return instanceId;
    }

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

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getSignFileName() {
        return signFileName;
    }

    public void setSignFileName(String signFileName) {
        this.signFileName = signFileName;
    }

    public String getLayTableCheckbox() {
        return layTableCheckbox;
    }

    public void setLayTableCheckbox(String layTableCheckbox) {
        this.layTableCheckbox = layTableCheckbox;
    }

    @Override
    public String toString() {
        return "FirstMotionVO{" +
                "id=" + id +
                ", flowid=" + flowid +
                ", meetingDate=" + meetingDate +
                ", host='" + host + '\'' +
                ", dueNumber='" + dueNumber + '\'' +
                ", actualNumber='" + actualNumber + '\'' +
                ", summaryNumber='" + summaryNumber + '\'' +
                ", candidateName='" + candidateName + '\'' +
                ", adjustType='" + adjustType + '\'' +
                ", aspiringUnit='" + aspiringUnit + '\'' +
                ", aspiringPosition='" + aspiringPosition + '\'' +
                ", aspiringPositionLevel='" + aspiringPositionLevel + '\'' +
                ", note='" + note + '\'' +
                ", pass='" + pass + '\'' +
                ", instanceId='" + instanceId + '\'' +
                ", infos=" + infos +
                ", ids=" + ids +
                ", req=" + req +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", summaryFileName='" + summaryFileName + '\'' +
                ", file='" + file + '\'' +
                ", signFileName='" + signFileName + '\'' +
                ", layTableCheckbox='" + layTableCheckbox + '\'' +
                '}';
    }
}
