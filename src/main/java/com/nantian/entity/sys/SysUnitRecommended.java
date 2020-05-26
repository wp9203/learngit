package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysUnitRecommended implements Serializable {
    /**
     * ������id
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * ����������
     */
    private String candidateName;

    /**
     * ����������
     */
    private String candidateUnit;

    /**
     * ����������
     */
    private String candidatePosition;

    /**
     * ������������
     */
    private String unitRecommendedMaterial;

    private Date creationTime;

    private Date updateTime;

    private String candidatePositionLevel;

    private String isfinish;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 ������id
     * @return ������id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 ������id
     * @param id ������id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 ����������
     * @return ����������
     */
    public String getCandidateName() {
        return candidateName;
    }

    /**
     * 设置 ����������
     * @param candidateName ����������
     */
    public void setCandidateName(String candidateName) {
        this.candidateName = candidateName;
    }

    /**
     * 获取 ����������
     * @return ����������
     */
    public String getCandidateUnit() {
        return candidateUnit;
    }

    /**
     * 设置 ����������
     * @param candidateUnit ����������
     */
    public void setCandidateUnit(String candidateUnit) {
        this.candidateUnit = candidateUnit;
    }

    /**
     * 获取 ����������
     * @return ����������
     */
    public String getCandidatePosition() {
        return candidatePosition;
    }

    /**
     * 设置 ����������
     * @param candidatePosition ����������
     */
    public void setCandidatePosition(String candidatePosition) {
        this.candidatePosition = candidatePosition;
    }

    /**
     * 获取 ������������
     * @return ������������
     */
    public String getUnitRecommendedMaterial() {
        return unitRecommendedMaterial;
    }

    /**
     * 设置 ������������
     * @param unitRecommendedMaterial ������������
     */
    public void setUnitRecommendedMaterial(String unitRecommendedMaterial) {
        this.unitRecommendedMaterial = unitRecommendedMaterial;
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

    public String getCandidatePositionLevel() {
        return candidatePositionLevel;
    }

    public void setCandidatePositionLevel(String candidatePositionLevel) {
        this.candidatePositionLevel = candidatePositionLevel;
    }

    public String getIsfinish() {
        return isfinish;
    }

    public void setIsfinish(String isfinish) {
        this.isfinish = isfinish;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", candidateName=").append(candidateName);
        sb.append(", candidateUnit=").append(candidateUnit);
        sb.append(", candidatePosition=").append(candidatePosition);
        sb.append(", unitRecommendedMaterial=").append(unitRecommendedMaterial);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", candidatePositionLevel=").append(candidatePositionLevel);
        sb.append(", isfinish=").append(isfinish);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}