package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.List;

/**
 * <p>ClassName: UserVO</p>
 * <p>Description: 用户</p>
 * <p>Copyright: Copyright©2014</p>
 * <p>Company: 广州南天电脑系统有限公司</p>
 * <p>Date: 2019-12-01</p>
 *
 * @author 刘晓辉
 * @version 1.0
 */
public class UserVO {
    /**
     * ID主键
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 帐号
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 所属机构ID
     */
    private String orgNo;
    /**
     * 性别
     */
    private String sex;

    /**
     * 手机号--11位，加区位
     */
    private String phoneNo;

    /**
     * 固定号码--三个区位，加分隔线，加7位坐机号
     */
    private String landline;

    /**
     * 身份证
     */
    private String idCard;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 地址
     */
    private String adress;

    /**
     * 邮政编码
     */
    private String zipCode;
    /**
     * 状态 0废止；1可用；2临时锁定；3：永久锁定
     */
    private String status;

    /**
     * 单位
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private String company;

    /**
     * 职务
     */
    private String position;

    /**
     * 职等
     */
    private String positionLevel;

    /**
     * 出生年月
     */
    private String birthDate;

    /**
     * 政治面貌
     */
    private String politicsStatus;

    /**
     * 学历
     */
    private String education;

    /**
     * 在职时间
     */
    private String inPositionTime;

    /**
     * 在同职时间
     */
    private String inSamePositionTime;

    /**
     * 在同职等时间
     */
    private String inSamePositionLevelTime;

    /**
     * 入行时间
     */
    private String intoBankTime;

    /**
     * 上一年考察结果
     */
    private String lastYearInspectionResult;

    /**
     * 处分
     */
    private String punishment;

    /**
     * 破格
     */
    private String exceptional;

    /**
     * 回避
     */
    private String avoid;

    /**
     * 拟调整职位
     */
    private String aspiringPosition;

    /**
     * 拟调整职等
     */
    private String aspiringPositionLevel;

    /**
     * 推荐意见信
     */
    private String recommendationLetter;

    /**
     * 笔记
     */
    private String note;

    /**
     * 员工编号
     */
    private String userno;

    /**
     * 机构类型
     */
    private String orgType;

    /**
     * 机构
     */
    private String org;

    /**
     * 职位序列
     */
    private String positionSerial;

    /**
     * 专业技能级别
     */
    private String skillLevel;

    /**
     * 年龄
     */
    private String age;

    /**
     * 专业技能资格
     */
    private String skillQualification;

    /**
     * 第二年考察结果
     */
    private String secondYearInspectionResult;

    /**
     * 第三年考察结果
     */
    private String thirdYearInspectionResult;

    private List<Long> roleIds;

    /**
     * 竞聘类型
     */
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<Long> getRoleIds() {
        return roleIds;
    }

    public void setRoleIds(List<Long> roleIds) {
        this.roleIds = roleIds;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrgNo() {
        return orgNo;
    }

    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getLandline() {
        return landline;
    }

    public void setLandline(String landline) {
        this.landline = landline;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPoliticsStatus() {
        return politicsStatus;
    }

    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getInPositionTime() {
        return inPositionTime;
    }

    public void setInPositionTime(String inPositionTime) {
        this.inPositionTime = inPositionTime;
    }

    public String getInSamePositionTime() {
        return inSamePositionTime;
    }

    public void setInSamePositionTime(String inSamePositionTime) {
        this.inSamePositionTime = inSamePositionTime;
    }

    public String getInSamePositionLevelTime() {
        return inSamePositionLevelTime;
    }

    public void setInSamePositionLevelTime(String inSamePositionLevelTime) {
        this.inSamePositionLevelTime = inSamePositionLevelTime;
    }

    public String getIntoBankTime() {
        return intoBankTime;
    }

    public void setIntoBankTime(String intoBankTime) {
        this.intoBankTime = intoBankTime;
    }

    public String getLastYearInspectionResult() {
        return lastYearInspectionResult;
    }

    public void setLastYearInspectionResult(String lastYearInspectionResult) {
        this.lastYearInspectionResult = lastYearInspectionResult;
    }

    public String getPunishment() {
        return punishment;
    }

    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    public String getExceptional() {
        return exceptional;
    }

    public void setExceptional(String exceptional) {
        this.exceptional = exceptional;
    }

    public String getAvoid() {
        return avoid;
    }

    public void setAvoid(String avoid) {
        this.avoid = avoid;
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

    public String getRecommendationLetter() {
        return recommendationLetter;
    }

    public void setRecommendationLetter(String recommendationLetter) {
        this.recommendationLetter = recommendationLetter;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getUserno() {
        return userno;
    }

    public void setUserno(String userno) {
        this.userno = userno;
    }

    public String getOrgType() {
        return orgType;
    }

    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getPositionSerial() {
        return positionSerial;
    }

    public void setPositionSerial(String positionSerial) {
        this.positionSerial = positionSerial;
    }

    public String getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSkillQualification() {
        return skillQualification;
    }

    public void setSkillQualification(String skillQualification) {
        this.skillQualification = skillQualification;
    }

    public String getSecondYearInspectionResult() {
        return secondYearInspectionResult;
    }

    public void setSecondYearInspectionResult(String secondYearInspectionResult) {
        this.secondYearInspectionResult = secondYearInspectionResult;
    }

    public String getThirdYearInspectionResult() {
        return thirdYearInspectionResult;
    }

    public void setThirdYearInspectionResult(String thirdYearInspectionResult) {
        this.thirdYearInspectionResult = thirdYearInspectionResult;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", orgNo='" + orgNo + '\'' +
                ", sex='" + sex + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", landline='" + landline + '\'' +
                ", idCard='" + idCard + '\'' +
                ", email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", status='" + status + '\'' +
                ", company='" + company + '\'' +
                ", position='" + position + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", politicsStatus='" + politicsStatus + '\'' +
                ", education='" + education + '\'' +
                ", inPositionTime='" + inPositionTime + '\'' +
                ", inSamePositionTime='" + inSamePositionTime + '\'' +
                ", inSamePositionLevelTime='" + inSamePositionLevelTime + '\'' +
                ", intoBankTime='" + intoBankTime + '\'' +
                ", lastYearInspectionResult='" + lastYearInspectionResult + '\'' +
                ", punishment='" + punishment + '\'' +
                ", exceptional='" + exceptional + '\'' +
                ", avoid='" + avoid + '\'' +
                ", aspiringPosition='" + aspiringPosition + '\'' +
                ", aspiringPositionLevel='" + aspiringPositionLevel + '\'' +
                ", recommendationLetter='" + recommendationLetter + '\'' +
                ", note='" + note + '\'' +
                ", userno='" + userno + '\'' +
                ", orgType='" + orgType + '\'' +
                ", org='" + org + '\'' +
                ", positionSerial='" + positionSerial + '\'' +
                ", skillLevel='" + skillLevel + '\'' +
                ", age='" + age + '\'' +
                ", skillQualification='" + skillQualification + '\'' +
                ", secondYearInspectionResult='" + secondYearInspectionResult + '\'' +
                ", thirdYearInspectionResult='" + thirdYearInspectionResult + '\'' +
                ", roleIds=" + roleIds +
                ", type='" + type + '\'' +
                '}';
    }
}
