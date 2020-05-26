package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class InspectArchivesVO {
    /**
     * ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<InspectArchivesVO> infos;

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

    public Date getInspectTime() {
        return inspectTime;
    }

    public void setInspectTime(Date inspectTime) {
        this.inspectTime = inspectTime;
    }

    public String getInspectProblem() {
        return inspectProblem;
    }

    public void setInspectProblem(String inspectProblem) {
        this.inspectProblem = inspectProblem;
    }

    public String getInspectRecord() {
        return inspectRecord;
    }

    public void setInspectRecord(String inspectRecord) {
        this.inspectRecord = inspectRecord;
    }

    public String getReviewIdentified() {
        return reviewIdentified;
    }

    public void setReviewIdentified(String reviewIdentified) {
        this.reviewIdentified = reviewIdentified;
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

    public List<InspectArchivesVO> getInfos() {
        return infos;
    }

    public void setInfos(List<InspectArchivesVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "InspectArchivesVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", inspectTime=" + inspectTime +
                ", inspectProblem='" + inspectProblem + '\'' +
                ", inspectRecord='" + inspectRecord + '\'' +
                ", reviewIdentified='" + reviewIdentified + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
