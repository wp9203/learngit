package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;
import java.util.List;

public class AnnouncedInOfficeVO {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    private List<Long> ids;

    private List<AnnouncedInOfficeVO> infos;

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
     * 职等
     */
    private String positionLevel;

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
     * 宣布时间
     */
    private Date announceTime;

    /**
     * 宣布人
     */
    private String announcePerson;

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

    public List<AnnouncedInOfficeVO> getInfos() {
        return infos;
    }

    public void setInfos(List<AnnouncedInOfficeVO> infos) {
        this.infos = infos;
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

    public Date getAnnounceTime() {
        return announceTime;
    }

    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
    }

    public String getAnnouncePerson() {
        return announcePerson;
    }

    public void setAnnouncePerson(String announcePerson) {
        this.announcePerson = announcePerson;
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
        return "AnnouncedInOfficeVO{" +
                "id=" + id +
                ", ids=" + ids +
                ", infos=" + infos +
                ", candidateName='" + candidateName + '\'' +
                ", unit='" + unit + '\'' +
                ", position='" + position + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", aspiringUnit='" + aspiringUnit + '\'' +
                ", aspiringPosition='" + aspiringPosition + '\'' +
                ", aspiringPositionLevel='" + aspiringPositionLevel + '\'' +
                ", note='" + note + '\'' +
                ", announceTime=" + announceTime +
                ", announcePerson='" + announcePerson + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                '}';
    }
}
