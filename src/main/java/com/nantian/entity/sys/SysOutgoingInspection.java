package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysOutgoingInspection implements Serializable {
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者
     */
    private String candidateName;

    /**
     * 离职检查时间
     */
    private Date checkDate;

    /**
     * 离职检查结论
     */
    private String checkConclusion;

    /**
     * 离职检查材料
     */
    private String checkData;

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
     * 获取 离职检查时间
     * @return 离职检查时间
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 设置 离职检查时间
     * @param checkDate 离职检查时间
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取 离职检查结论
     * @return 离职检查结论
     */
    public String getCheckConclusion() {
        return checkConclusion;
    }

    /**
     * 设置 离职检查结论
     * @param checkConclusion 离职检查结论
     */
    public void setCheckConclusion(String checkConclusion) {
        this.checkConclusion = checkConclusion;
    }

    /**
     * 获取 离职检查材料
     * @return 离职检查材料
     */
    public String getCheckData() {
        return checkData;
    }

    /**
     * 设置 离职检查材料
     * @param checkData 离职检查材料
     */
    public void setCheckData(String checkData) {
        this.checkData = checkData;
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
        sb.append(", checkDate=").append(checkDate);
        sb.append(", checkConclusion=").append(checkConclusion);
        sb.append(", checkData=").append(checkData);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}