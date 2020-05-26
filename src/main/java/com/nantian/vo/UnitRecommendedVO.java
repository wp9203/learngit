package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class UnitRecommendedVO {

    /**
     * 竞聘者id
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者名字
     */
    private String candidateName;

    /**
     * 竞聘者单位
     */
    private String candidateUnit;

    private String getCandidatePositionLevel;

    /**
     * 竞聘者职务
     */
    private String candidatePosition;


    /**
     * 单位推荐材料
     */
    private String unitRecommendedMaterial;




    private Date creationTime;

    private Date updateTime;

    /**
     * 职等
     */
    private String candidatePositionLevel;

    private List<Long> ids;

    private List<UnitRecommendedVO> infos;

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

    public String getCandidateUnit() {
        return candidateUnit;
    }

    public void setCandidateUnit(String candidateUnit) {
        this.candidateUnit = candidateUnit;
    }

    public String getGetCandidatePositionLevel() {
        return getCandidatePositionLevel;
    }

    public void setGetCandidatePositionLevel(String getCandidatePositionLevel) {
        this.getCandidatePositionLevel = getCandidatePositionLevel;
    }

    public String getCandidatePosition() {
        return candidatePosition;
    }

    public void setCandidatePosition(String candidatePosition) {
        this.candidatePosition = candidatePosition;
    }

    public String getUnitRecommendedMaterial() {
        return unitRecommendedMaterial;
    }

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

    public List<Long> getIds() {
        return ids;
    }

    public void setIds(List<Long> ids) {
        this.ids = ids;
    }

    public List<UnitRecommendedVO> getInfos() {
        return infos;
    }

    public void setInfos(List<UnitRecommendedVO> infos) {
        this.infos = infos;
    }

    @Override
    public String toString() {
        return "UnitRecommendedVO{" +
                "id=" + id +
                ", candidateName='" + candidateName + '\'' +
                ", candidateUnit='" + candidateUnit + '\'' +
                ", getCandidatePositionLevel='" + getCandidatePositionLevel + '\'' +
                ", candidatePosition='" + candidatePosition + '\'' +
                ", unitRecommendedMaterial='" + unitRecommendedMaterial + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", candidatePositionLevel='" + candidatePositionLevel + '\'' +
                ", ids=" + ids +
                ", infos=" + infos +
                '}';
    }
}
