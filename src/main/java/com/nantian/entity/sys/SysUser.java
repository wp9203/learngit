package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysUser implements Serializable {
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
    @JSONField(serializeUsing = ToStringSerializer.class)
    private String name;

    /**
     * 所属机构ID
     */
    private String orgNo;

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
     * 扩展字段1
     */
    private String extend1;

    /**
     * 扩展字段2
     */
    private String extend2;

    /**
     * 本次登录时间
     */
    private String loginTime;

    /**
     * 上一次登录时间
     */
    private Date lastLoginTime;

    /**
     * 当天登录错误次数
     */
    private Integer errorCount;

    /**
     * 创建时间 审计字段
     */
    private Date creationTime;

    /**
     * 更新时间 审计字段
     */
    private Date updateTime;

    /**
     * 性别，默认0；0保密；1男；2女
     */
    private String sex;

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

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

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
     * 获取 帐号
     * @return 帐号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置 帐号
     * @param username 帐号
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取 密码
     * @return 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置 密码
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取 用户名称
     * @return 用户名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置 用户名称
     * @param name 用户名称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取 所属机构ID
     * @return 所属机构ID
     */
    public String getOrgNo() {
        return orgNo;
    }

    /**
     * 设置 所属机构ID
     * @param orgNo 所属机构ID
     */
    public void setOrgNo(String orgNo) {
        this.orgNo = orgNo;
    }

    /**
     * 获取 手机号--11位，加区位
     * @return 手机号--11位，加区位
     */
    public String getPhoneNo() {
        return phoneNo;
    }

    /**
     * 设置 手机号--11位，加区位
     * @param phoneNo 手机号--11位，加区位
     */
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    /**
     * 获取 固定号码--三个区位，加分隔线，加7位坐机号
     * @return 固定号码--三个区位，加分隔线，加7位坐机号
     */
    public String getLandline() {
        return landline;
    }

    /**
     * 设置 固定号码--三个区位，加分隔线，加7位坐机号
     * @param landline 固定号码--三个区位，加分隔线，加7位坐机号
     */
    public void setLandline(String landline) {
        this.landline = landline;
    }

    /**
     * 获取 身份证
     * @return 身份证
     */
    public String getIdCard() {
        return idCard;
    }

    /**
     * 设置 身份证
     * @param idCard 身份证
     */
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    /**
     * 获取 邮箱
     * @return 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置 邮箱
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取 地址
     * @return 地址
     */
    public String getAdress() {
        return adress;
    }

    /**
     * 设置 地址
     * @param adress 地址
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * 获取 邮政编码
     * @return 邮政编码
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * 设置 邮政编码
     * @param zipCode 邮政编码
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    /**
     * 获取 状态 0废止；1可用；2临时锁定；3：永久锁定
     * @return 状态 0废止；1可用；2临时锁定；3：永久锁定
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置 状态 0废止；1可用；2临时锁定；3：永久锁定
     * @param status 状态 0废止；1可用；2临时锁定；3：永久锁定
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
     * 获取 本次登录时间
     * @return 本次登录时间
     */
    public String getLoginTime() {
        return loginTime;
    }

    /**
     * 设置 本次登录时间
     * @param loginTime 本次登录时间
     */
    public void setLoginTime(String loginTime) {
        this.loginTime = loginTime;
    }

    /**
     * 获取 上一次登录时间
     * @return 上一次登录时间
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置 上一次登录时间
     * @param lastLoginTime 上一次登录时间
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取 当天登录错误次数
     * @return 当天登录错误次数
     */
    public Integer getErrorCount() {
        return errorCount;
    }

    /**
     * 设置 当天登录错误次数
     * @param errorCount 当天登录错误次数
     */
    public void setErrorCount(Integer errorCount) {
        this.errorCount = errorCount;
    }

    /**
     * 获取 创建时间 审计字段
     * @return 创建时间 审计字段
     */
    public Date getCreationTime() {
        return creationTime;
    }

    /**
     * 设置 创建时间 审计字段
     * @param creationTime 创建时间 审计字段
     */
    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * 获取 更新时间 审计字段
     * @return 更新时间 审计字段
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置 更新时间 审计字段
     * @param updateTime 更新时间 审计字段
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取 性别，默认0；0保密；1男；2女
     * @return 性别，默认0；0保密；1男；2女
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置 性别，默认0；0保密；1男；2女
     * @param sex 性别，默认0；0保密；1男；2女
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取 单位
     * @return 单位
     */
    public String getCompany() {
        return company;
    }

    /**
     * 设置 单位
     * @param company 单位
     */
    public void setCompany(String company) {
        this.company = company;
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
     * 获取 出生年月
     * @return 出生年月
     */
    public String getBirthDate() {
        return birthDate;
    }

    /**
     * 设置 出生年月
     * @param birthDate 出生年月
     */
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * 获取 政治面貌
     * @return 政治面貌
     */
    public String getPoliticsStatus() {
        return politicsStatus;
    }

    /**
     * 设置 政治面貌
     * @param politicsStatus 政治面貌
     */
    public void setPoliticsStatus(String politicsStatus) {
        this.politicsStatus = politicsStatus;
    }

    /**
     * 获取 学历
     * @return 学历
     */
    public String getEducation() {
        return education;
    }

    /**
     * 设置 学历
     * @param education 学历
     */
    public void setEducation(String education) {
        this.education = education;
    }

    /**
     * 获取 在职时间
     * @return 在职时间
     */
    public String getInPositionTime() {
        return inPositionTime;
    }

    /**
     * 设置 在职时间
     * @param inPositionTime 在职时间
     */
    public void setInPositionTime(String inPositionTime) {
        this.inPositionTime = inPositionTime;
    }

    /**
     * 获取 在同职时间
     * @return 在同职时间
     */
    public String getInSamePositionTime() {
        return inSamePositionTime;
    }

    /**
     * 设置 在同职时间
     * @param inSamePositionTime 在同职时间
     */
    public void setInSamePositionTime(String inSamePositionTime) {
        this.inSamePositionTime = inSamePositionTime;
    }

    /**
     * 获取 在同职等时间
     * @return 在同职等时间
     */
    public String getInSamePositionLevelTime() {
        return inSamePositionLevelTime;
    }

    /**
     * 设置 在同职等时间
     * @param inSamePositionLevelTime 在同职等时间
     */
    public void setInSamePositionLevelTime(String inSamePositionLevelTime) {
        this.inSamePositionLevelTime = inSamePositionLevelTime;
    }

    /**
     * 获取 入行时间
     * @return 入行时间
     */
    public String getIntoBankTime() {
        return intoBankTime;
    }

    /**
     * 设置 入行时间
     * @param intoBankTime 入行时间
     */
    public void setIntoBankTime(String intoBankTime) {
        this.intoBankTime = intoBankTime;
    }

    /**
     * 获取 上一年考察结果
     * @return 上一年考察结果
     */
    public String getLastYearInspectionResult() {
        return lastYearInspectionResult;
    }

    /**
     * 设置 上一年考察结果
     * @param lastYearInspectionResult 上一年考察结果
     */
    public void setLastYearInspectionResult(String lastYearInspectionResult) {
        this.lastYearInspectionResult = lastYearInspectionResult;
    }

    /**
     * 获取 处分
     * @return 处分
     */
    public String getPunishment() {
        return punishment;
    }

    /**
     * 设置 处分
     * @param punishment 处分
     */
    public void setPunishment(String punishment) {
        this.punishment = punishment;
    }

    /**
     * 获取 破格
     * @return 破格
     */
    public String getExceptional() {
        return exceptional;
    }

    /**
     * 设置 破格
     * @param exceptional 破格
     */
    public void setExceptional(String exceptional) {
        this.exceptional = exceptional;
    }

    /**
     * 获取 回避
     * @return 回避
     */
    public String getAvoid() {
        return avoid;
    }

    /**
     * 设置 回避
     * @param avoid 回避
     */
    public void setAvoid(String avoid) {
        this.avoid = avoid;
    }

    /**
     * 获取 拟调整职位
     * @return 拟调整职位
     */
    public String getAspiringPosition() {
        return aspiringPosition;
    }

    /**
     * 设置 拟调整职位
     * @param aspiringPosition 拟调整职位
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
     * 获取 推荐意见信
     * @return 推荐意见信
     */
    public String getRecommendationLetter() {
        return recommendationLetter;
    }

    /**
     * 设置 推荐意见信
     * @param recommendationLetter 推荐意见信
     */
    public void setRecommendationLetter(String recommendationLetter) {
        this.recommendationLetter = recommendationLetter;
    }

    /**
     * 获取 笔记
     * @return 笔记
     */
    public String getNote() {
        return note;
    }

    /**
     * 设置 笔记
     * @param note 笔记
     */
    public void setNote(String note) {
        this.note = note;
    }

    /**
     * 获取 员工编号
     * @return 员工编号
     */
    public String getUserno() {
        return userno;
    }

    /**
     * 设置 员工编号
     * @param userno 员工编号
     */
    public void setUserno(String userno) {
        this.userno = userno;
    }

    /**
     * 获取 机构类型
     * @return 机构类型
     */
    public String getOrgType() {
        return orgType;
    }

    /**
     * 设置 机构类型
     * @param orgType 机构类型
     */
    public void setOrgType(String orgType) {
        this.orgType = orgType;
    }

    /**
     * 获取 机构
     * @return 机构
     */
    public String getOrg() {
        return org;
    }

    /**
     * 设置 机构
     * @param org 机构
     */
    public void setOrg(String org) {
        this.org = org;
    }

    /**
     * 获取 职位序列
     * @return 职位序列
     */
    public String getPositionSerial() {
        return positionSerial;
    }

    /**
     * 设置 职位序列
     * @param positionSerial 职位序列
     */
    public void setPositionSerial(String positionSerial) {
        this.positionSerial = positionSerial;
    }

    /**
     * 获取 专业技能级别
     * @return 专业技能级别
     */
    public String getSkillLevel() {
        return skillLevel;
    }

    /**
     * 设置 专业技能级别
     * @param skillLevel 专业技能级别
     */
    public void setSkillLevel(String skillLevel) {
        this.skillLevel = skillLevel;
    }

    /**
     * 获取 年龄
     * @return 年龄
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置 年龄
     * @param age 年龄
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * 获取 专业技能资格
     * @return 专业技能资格
     */
    public String getSkillQualification() {
        return skillQualification;
    }

    /**
     * 设置 专业技能资格
     * @param skillQualification 专业技能资格
     */
    public void setSkillQualification(String skillQualification) {
        this.skillQualification = skillQualification;
    }

    /**
     * 获取 第二年考察结果
     * @return 第二年考察结果
     */
    public String getSecondYearInspectionResult() {
        return secondYearInspectionResult;
    }

    /**
     * 设置 第二年考察结果
     * @param secondYearInspectionResult 第二年考察结果
     */
    public void setSecondYearInspectionResult(String secondYearInspectionResult) {
        this.secondYearInspectionResult = secondYearInspectionResult;
    }

    /**
     * 获取 第三年考察结果
     * @return 第三年考察结果
     */
    public String getThirdYearInspectionResult() {
        return thirdYearInspectionResult;
    }

    /**
     * 设置 第三年考察结果
     * @param thirdYearInspectionResult 第三年考察结果
     */
    public void setThirdYearInspectionResult(String thirdYearInspectionResult) {
        this.thirdYearInspectionResult = thirdYearInspectionResult;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", name=").append(name);
        sb.append(", orgNo=").append(orgNo);
        sb.append(", phoneNo=").append(phoneNo);
        sb.append(", landline=").append(landline);
        sb.append(", idCard=").append(idCard);
        sb.append(", email=").append(email);
        sb.append(", adress=").append(adress);
        sb.append(", zipCode=").append(zipCode);
        sb.append(", status=").append(status);
        sb.append(", extend1=").append(extend1);
        sb.append(", extend2=").append(extend2);
        sb.append(", loginTime=").append(loginTime);
        sb.append(", lastLoginTime=").append(lastLoginTime);
        sb.append(", errorCount=").append(errorCount);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", sex=").append(sex);
        sb.append(", company=").append(company);
        sb.append(", position=").append(position);
        sb.append(", positionLevel=").append(positionLevel);
        sb.append(", birthDate=").append(birthDate);
        sb.append(", politicsStatus=").append(politicsStatus);
        sb.append(", education=").append(education);
        sb.append(", inPositionTime=").append(inPositionTime);
        sb.append(", inSamePositionTime=").append(inSamePositionTime);
        sb.append(", inSamePositionLevelTime=").append(inSamePositionLevelTime);
        sb.append(", intoBankTime=").append(intoBankTime);
        sb.append(", lastYearInspectionResult=").append(lastYearInspectionResult);
        sb.append(", punishment=").append(punishment);
        sb.append(", exceptional=").append(exceptional);
        sb.append(", avoid=").append(avoid);
        sb.append(", aspiringPosition=").append(aspiringPosition);
        sb.append(", aspiringPositionLevel=").append(aspiringPositionLevel);
        sb.append(", recommendationLetter=").append(recommendationLetter);
        sb.append(", note=").append(note);
        sb.append(", userno=").append(userno);
        sb.append(", orgType=").append(orgType);
        sb.append(", org=").append(org);
        sb.append(", positionSerial=").append(positionSerial);
        sb.append(", skillLevel=").append(skillLevel);
        sb.append(", age=").append(age);
        sb.append(", skillQualification=").append(skillQualification);
        sb.append(", secondYearInspectionResult=").append(secondYearInspectionResult);
        sb.append(", thirdYearInspectionResult=").append(thirdYearInspectionResult);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}