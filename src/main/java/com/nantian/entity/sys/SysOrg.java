package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysOrg implements Serializable {
    /**
     * ID主键
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 机构编号
     */
    private String orgNo;

    /**
     * 机构名称
     */
    private String name;

    /**
     * 上级机构ID
     */
    private String parentId;

    /**
     * 机构地址
     */
    private String adress;

    /**
     * 机构路径
     */
    private String path;

    /**
     * 机构等级 1省行，2省部门，3二级行，4网点部门，5网点
     */
    private Integer orgLevel;

    /**
     * 所属二级行机构号
     */
    private String orgLvl2Id;

    /**
     * 机构所属区域
     */
    private String area;

    /**
     * 备注
     */
    private String remark;

    /**
     * 机构电话
     */
    private String tel;

    /**
     * 机构负责人
     */
    private String charger;
    /**
     * 机构级别
     */
    private String grade;



    /**
     * 机构状态  1可用；0不可用
     */
    private String status;

    /**
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 创建时间--  审计字段
     */
    private Date creationTime;

    /**
     * 更新时间--  审计字段
     */
    private Date updateTime;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     * 获取 ID主键
     * @return ID主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 ID主键
     * @param id ID主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 机构编号
     * @return 机构编号
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设置 机构编号
     * @param orgNo 机构编号
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    /**
     * 获取 机构名称
     * @return 机构名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 机构名称
     * @param name 机构名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 上级机构ID
     * @return 上级机构ID
     */
    public String getParentId() {
        return parentId;
    }

    /**
     * 设置 上级机构ID
     * @param parentId 上级机构ID
     */
    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * 获取 机构地址
     * @return 机构地址
     */
    public String getAdress() {
        return adress;
    }

    /**
     * 设置 机构地址
     * @param adress 机构地址
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * 获取 机构路径
     * @return 机构路径
     */
    public String getPath() {
        return path;
    }

    /**
     * 设置 机构路径
     * @param path 机构路径
     */
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * 获取 机构等级 1省行，2省部门，3二级行，4网点部门，5网点
     * @return 机构等级 1省行，2省部门，3二级行，4网点部门，5网点
     */
    public Integer getOrgLevel() {
        return orgLevel;
    }

    /**
     * 设置 机构等级 1省行，2省部门，3二级行，4网点部门，5网点
     * @param orgLevel 机构等级 1省行，2省部门，3二级行，4网点部门，5网点
     */
    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    /**
     * 获取 所属二级行机构号
     * @return 所属二级行机构号
     */
    public String getOrgLvl2Id() {
        return orgLvl2Id;
    }

    /**
     * 设置 所属二级行机构号
     * @param orgLvl2Id 所属二级行机构号
     */
    public void setOrgLvl2Id(String orgLvl2Id) {
        this.orgLvl2Id = orgLvl2Id;
    }

    /**
     * 获取 机构所属区域
     * @return 机构所属区域
     */
    public String getArea() {
        return area;
    }

    /**
     * 设置 机构所属区域
     * @param area 机构所属区域
     */
    public void setArea(String area) {
        this.area = area;
    }

    /**
     * 获取 备注
     * @return 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置 备注
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取 机构状态  1可用；0不可用
     * @return 机构状态  1可用；0不可用
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 机构状态  1可用；0不可用
     * @param status 机构状态  1可用；0不可用
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 获取 扩展字段1
     * @return 扩展字段1
     */
    public String getExtend1() {
        return extend1;
    }

    /**
     * 设置 扩展字段1
     * @param extend1 扩展字段1
     */
    public void setExtend1(String extend1) {
        this.extend1 = extend1;
    }

    /**
     * 获取 扩展字段2
     * @return 扩展字段2
     */
    public String getExtend2() {
        return extend2;
    }

    /**
     * 设置 扩展字段2
     * @param extend2 扩展字段2
     */
    public void setExtend2(String extend2) {
        this.extend2 = extend2;
    }

    /**
     * 获取 创建时间--  审计字段
     * @return 创建时间--  审计字段
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间--  审计字段
     * @param creationTime 创建时间--  审计字段
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 更新时间--  审计字段
     * @return 更新时间--  审计字段
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间--  审计字段
     * @param updateTime 更新时间--  审计字段
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
        sb.append(", orgNo=").append(orgNo);
        sb.append(", name=").append(name);
        sb.append(", parentId=").append(parentId);
        sb.append(", adress=").append(adress);
        sb.append(", path=").append(path);
        sb.append(", orgLevel=").append(orgLevel);
        sb.append(", orgLvl2Id=").append(orgLvl2Id);
        sb.append(", area=").append(area);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        sb.append(",tel=").append(tel);
        sb.append(",charger+").append(charger);
        sb.append(",grade+").append(grade);
        return sb.toString();
    }
}