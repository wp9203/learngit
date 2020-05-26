package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysAnnouncedInOffice implements Serializable {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

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
     * 获取 单位
     * @return 单位
     */
    public String getUnit() {
        return unit;
    }

    /**
     * 设置 单位
     * @param unit 单位
     */
    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * 获取 职务
     * @return 职务
     */
    public String getPosition() {
        return position;
    }

    /**
     * 设置 职务
     * @param position 职务
     */
    public void setPosition(String position) {
        this.position = position;
    }

    /**
     * 获取 职等
     * @return 职等
     */
    public String getPositionLevel() {
        return positionLevel;
    }

    /**
     * 设置 职等
     * @param positionLevel 职等
     */
    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
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
     * 获取 宣布时间
     * @return 宣布时间
     */
    public Date getAnnounceTime() {
        return announceTime;
    }

    /**
     * 设置 宣布时间
     * @param announceTime 宣布时间
     */
    public void setAnnounceTime(Date announceTime) {
        this.announceTime = announceTime;
    }

    /**
     * 获取 宣布人
     * @return 宣布人
     */
    public String getAnnouncePerson() {
        return announcePerson;
    }

    /**
     * 设置 宣布人
     * @param announcePerson 宣布人
     */
    public void setAnnouncePerson(String announcePerson) {
        this.announcePerson = announcePerson;
    }

    /**
     * 获取 创建时间
     * @return 创建时间
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间
     * @param creationTime 创建时间
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 修改时间
     * @return 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 修改时间
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
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
        sb.append(", aspiringUnit=").append(aspiringUnit);
        sb.append(", aspiringPosition=").append(aspiringPosition);
        sb.append(", aspiringPositionLevel=").append(aspiringPositionLevel);
        sb.append(", note=").append(note);
        sb.append(", announceTime=").append(announceTime);
        sb.append(", announcePerson=").append(announcePerson);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}