package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

/**
 * <p>ClassName: OrgVO</p>
 * <p>Description: 机构信息</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-05</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class OrgVO {
    /**
     * ID主键
     */
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
     * 机构状态  1可用；0不可用
     */
    private String status;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getOrgLevel() {
        return orgLevel;
    }

    public void setOrgLevel(Integer orgLevel) {
        this.orgLevel = orgLevel;
    }

    public String getOrgLvl2Id() {
        return orgLvl2Id;
    }

    public void setOrgLvl2Id(String orgLvl2Id) {
        this.orgLvl2Id = orgLvl2Id;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "OrgVO{" +
                "id=" + id +
                ", orgNo='" + orgNo + '\'' +
                ", name='" + name + '\'' +
                ", parentId='" + parentId + '\'' +
                ", adress='" + adress + '\'' +
                ", orgLevel=" + orgLevel +
                ", orgLvl2Id='" + orgLvl2Id + '\'' +
                ", area='" + area + '\'' +
                ", remark='" + remark + '\'' +
                ", status='" + status + '\'' +
                ", tel='" + tel + '\'' +
                ", charger='" + charger + '\'' +
                ", grade='" + grade + '\'' +
                '}';
    }
}
