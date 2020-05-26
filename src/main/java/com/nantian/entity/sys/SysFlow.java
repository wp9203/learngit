package com.nantian.entity.sys;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.io.Serializable;
import java.util.Date;

public class SysFlow implements Serializable {
    /**
     * 流程表Id
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long id;

    /**
     * 竞聘者ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long userid;

    /**
     * 竞聘者
     */
    private String username;

    /**
     * 拟调整单位
     */
    private String aspiringUnit;

    /**
     * 拟调整职务
     */
    private String aspiringPosition;

    /**
     * 步骤1
     */
    private String step1;

    /**
     * 单位推荐ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long unitReId;

    /**
     * 单位推荐结果
     */
    private String unitReResult;

    /**
     * 步骤2
     */
    private String step2;

    /**
     * 动议（第一次上会）
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long firstMotionId;

    /**
     * 动议结果
     */
    private String firstMotionResult;

    /**
     * 步骤3
     */
    private String step3;

    /**
     * 实施前报告ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long reportBeforeImId;

    /**
     * 实施前报告结果
     */
    private String reportBeforeImResult;

    /**
     * 步骤4
     */
    private String step4;

    /**
     * 民主推荐与考察ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long democracyInsReId;

    /**
     * 民主推荐与考察结果
     */
    private String democracyInsReResult;

    /**
     * 步骤5
     */
    private String step5;

    /**
     * 核查档案ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long inspectArchivesId;

    /**
     * 核查档案结果
     */
    private String inspectArchivesResult;

    /**
     * 步骤6
     */
    private String step6;

    /**
     * 纪委部意见ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long comDisInsReOpId;

    /**
     * 纪委部意见结果
     */
    private String comDisInsReOpResult;

    /**
     * 步骤7
     */
    private String step7;

    /**
     * 合规部意见ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long complianceDepOpId;

    /**
     * 合规部意见结果
     */
    private String complianceDepOpResult;

    /**
     * 步骤8
     */
    private String step8;

    /**
     * 研究决定ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long secondMotionId;

    /**
     * 研究决定结果
     */
    private String secondMotionResult;

    /**
     * 步骤9
     */
    private String step9;

    /**
     * 任前公示ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long pubBeforeInOfficeId;

    /**
     * 任前公示结果
     */
    private String pubBeforeInOfficeResult;

    /**
     * 步骤10
     */
    private String step10;

    /**
     * 研究决定（三次上会）ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long thirdMotionId;

    /**
     * 研究决定（三次上会）结果
     */
    private String thirdMotionResult;

    /**
     * 步骤11
     */
    private String step11;

    /**
     * 任前报批ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long appBeforeInOfficeId;

    /**
     * 任前报批结果
     */
    private String appBeforeInOfficeResult;

    /**
     * 步骤12
     */
    private String step12;

    /**
     * 离职检查ID 
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long outgoingInspectionId;

    /**
     * 离职检查结果
     */
    private String outgoingInspectionResult;

    /**
     * 步骤13
     */
    private String step13;

    /**
     * 任职谈话ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long conInOfficeId;

    /**
     * 任职谈话结果
     */
    private String conInOfficeResult;

    /**
     * 步骤14
     */
    private String step14;

    /**
     * 廉洁谈话ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long conHonestId;

    /**
     * 廉洁谈话结果
     */
    private String conHonestResult;

    /**
     * 步骤15
     */
    private String step15;

    /**
     * 当地银保监核准ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long appBankingSupervisionId;

    /**
     * 当地银保监核准结果
     */
    private String appBankingSupervisionResult;

    /**
     * 步骤16
     */
    private String step16;

    /**
     * 任职宣布ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long announcedInOfficeId;

    /**
     * 任职宣布结果
     */
    private String announcedInOfficeResult;

    /**
     * 步骤17
     */
    private String step17;

    /**
     * 发文任免ID
     */
    @JSONField(serializeUsing = ToStringSerializer.class)
    private Long postAppointId;

    /**
     * 发文任免结果
     */
    private String postAppointResult;

    /**
     * 步骤18
     */
    private String step18;

    /**
     * 创建时间
     */
    private Date creationTime;

    /**
     * 修改时间
     */
    private Date updateTime;

    /**
     * 流程状态 0：进行中 1：已完成
     */
    private String flowStatus;

    /**
     * 机构
     */
    private String org;

    /**
     * 调整类型 0：提拔 1：平调 2：降职 3：转非 4：辞职 5：其他
     */
    private String adjustType;

    /**
     * 职等： 0：五职等；1：六职等；2：七职等；3:八职等；4：九职等；5：十职等；6：十一职等；7：十二职等；8：十三职等；9：十四职等；10：十五职等；
     */
    private String positionLevel;

    /**
     * 起始时间
     */
    private Date startDate;

    /**
     * 结束时间
     */
    private Date endDate;

    /**
     * 序列化版本号
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 流程表Id
     * @return 流程表Id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置 流程表Id
     * @param id 流程表Id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取 竞聘者ID
     * @return 竞聘者ID
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * 设置 竞聘者ID
     * @param userid 竞聘者ID
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * 获取 竞聘者
     * @return 竞聘者
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置 竞聘者
     * @param username 竞聘者
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取 步骤1
     * @return 步骤1
     */
    public String getStep1() {
        return step1;
    }

    /**
     * 设置 步骤1
     * @param step1 步骤1
     */
    public void setStep1(String step1) {
        this.step1 = step1;
    }

    /**
     * 获取 单位推荐ID
     * @return 单位推荐ID
     */
    public Long getUnitReId() {
        return unitReId;
    }

    /**
     * 设置 单位推荐ID
     * @param unitReId 单位推荐ID
     */
    public void setUnitReId(Long unitReId) {
        this.unitReId = unitReId;
    }

    /**
     * 获取 单位推荐结果
     * @return 单位推荐结果
     */
    public String getUnitReResult() {
        return unitReResult;
    }

    /**
     * 设置 单位推荐结果
     * @param unitReResult 单位推荐结果
     */
    public void setUnitReResult(String unitReResult) {
        this.unitReResult = unitReResult;
    }

    /**
     * 获取 步骤2
     * @return 步骤2
     */
    public String getStep2() {
        return step2;
    }

    /**
     * 设置 步骤2
     * @param step2 步骤2
     */
    public void setStep2(String step2) {
        this.step2 = step2;
    }

    /**
     * 获取 动议（第一次上会）
     * @return 动议（第一次上会）
     */
    public Long getFirstMotionId() {
        return firstMotionId;
    }

    /**
     * 设置 动议（第一次上会）
     * @param firstMotionId 动议（第一次上会）
     */
    public void setFirstMotionId(Long firstMotionId) {
        this.firstMotionId = firstMotionId;
    }

    /**
     * 获取 动议结果
     * @return 动议结果
     */
    public String getFirstMotionResult() {
        return firstMotionResult;
    }

    /**
     * 设置 动议结果
     * @param firstMotionResult 动议结果
     */
    public void setFirstMotionResult(String firstMotionResult) {
        this.firstMotionResult = firstMotionResult;
    }

    /**
     * 获取 步骤3
     * @return 步骤3
     */
    public String getStep3() {
        return step3;
    }

    /**
     * 设置 步骤3
     * @param step3 步骤3
     */
    public void setStep3(String step3) {
        this.step3 = step3;
    }

    /**
     * 获取 实施前报告ID
     * @return 实施前报告ID
     */
    public Long getReportBeforeImId() {
        return reportBeforeImId;
    }

    /**
     * 设置 实施前报告ID
     * @param reportBeforeImId 实施前报告ID
     */
    public void setReportBeforeImId(Long reportBeforeImId) {
        this.reportBeforeImId = reportBeforeImId;
    }

    /**
     * 获取 实施前报告结果
     * @return 实施前报告结果
     */
    public String getReportBeforeImResult() {
        return reportBeforeImResult;
    }

    /**
     * 设置 实施前报告结果
     * @param reportBeforeImResult 实施前报告结果
     */
    public void setReportBeforeImResult(String reportBeforeImResult) {
        this.reportBeforeImResult = reportBeforeImResult;
    }

    /**
     * 获取 步骤4
     * @return 步骤4
     */
    public String getStep4() {
        return step4;
    }

    /**
     * 设置 步骤4
     * @param step4 步骤4
     */
    public void setStep4(String step4) {
        this.step4 = step4;
    }

    /**
     * 获取 民主推荐与考察ID
     * @return 民主推荐与考察ID
     */
    public Long getDemocracyInsReId() {
        return democracyInsReId;
    }

    /**
     * 设置 民主推荐与考察ID
     * @param democracyInsReId 民主推荐与考察ID
     */
    public void setDemocracyInsReId(Long democracyInsReId) {
        this.democracyInsReId = democracyInsReId;
    }

    /**
     * 获取 民主推荐与考察结果
     * @return 民主推荐与考察结果
     */
    public String getDemocracyInsReResult() {
        return democracyInsReResult;
    }

    /**
     * 设置 民主推荐与考察结果
     * @param democracyInsReResult 民主推荐与考察结果
     */
    public void setDemocracyInsReResult(String democracyInsReResult) {
        this.democracyInsReResult = democracyInsReResult;
    }

    /**
     * 获取 步骤5
     * @return 步骤5
     */
    public String getStep5() {
        return step5;
    }

    /**
     * 设置 步骤5
     * @param step5 步骤5
     */
    public void setStep5(String step5) {
        this.step5 = step5;
    }

    /**
     * 获取 核查档案ID
     * @return 核查档案ID
     */
    public Long getInspectArchivesId() {
        return inspectArchivesId;
    }

    /**
     * 设置 核查档案ID
     * @param inspectArchivesId 核查档案ID
     */
    public void setInspectArchivesId(Long inspectArchivesId) {
        this.inspectArchivesId = inspectArchivesId;
    }

    /**
     * 获取 核查档案结果
     * @return 核查档案结果
     */
    public String getInspectArchivesResult() {
        return inspectArchivesResult;
    }

    /**
     * 设置 核查档案结果
     * @param inspectArchivesResult 核查档案结果
     */
    public void setInspectArchivesResult(String inspectArchivesResult) {
        this.inspectArchivesResult = inspectArchivesResult;
    }

    /**
     * 获取 步骤6
     * @return 步骤6
     */
    public String getStep6() {
        return step6;
    }

    /**
     * 设置 步骤6
     * @param step6 步骤6
     */
    public void setStep6(String step6) {
        this.step6 = step6;
    }

    /**
     * 获取 纪委部意见ID
     * @return 纪委部意见ID
     */
    public Long getComDisInsReOpId() {
        return comDisInsReOpId;
    }

    /**
     * 设置 纪委部意见ID
     * @param comDisInsReOpId 纪委部意见ID
     */
    public void setComDisInsReOpId(Long comDisInsReOpId) {
        this.comDisInsReOpId = comDisInsReOpId;
    }

    /**
     * 获取 纪委部意见结果
     * @return 纪委部意见结果
     */
    public String getComDisInsReOpResult() {
        return comDisInsReOpResult;
    }

    /**
     * 设置 纪委部意见结果
     * @param comDisInsReOpResult 纪委部意见结果
     */
    public void setComDisInsReOpResult(String comDisInsReOpResult) {
        this.comDisInsReOpResult = comDisInsReOpResult;
    }

    /**
     * 获取 步骤7
     * @return 步骤7
     */
    public String getStep7() {
        return step7;
    }

    /**
     * 设置 步骤7
     * @param step7 步骤7
     */
    public void setStep7(String step7) {
        this.step7 = step7;
    }

    /**
     * 获取 合规部意见ID
     * @return 合规部意见ID
     */
    public Long getComplianceDepOpId() {
        return complianceDepOpId;
    }

    /**
     * 设置 合规部意见ID
     * @param complianceDepOpId 合规部意见ID
     */
    public void setComplianceDepOpId(Long complianceDepOpId) {
        this.complianceDepOpId = complianceDepOpId;
    }

    /**
     * 获取 合规部意见结果
     * @return 合规部意见结果
     */
    public String getComplianceDepOpResult() {
        return complianceDepOpResult;
    }

    /**
     * 设置 合规部意见结果
     * @param complianceDepOpResult 合规部意见结果
     */
    public void setComplianceDepOpResult(String complianceDepOpResult) {
        this.complianceDepOpResult = complianceDepOpResult;
    }

    /**
     * 获取 步骤8
     * @return 步骤8
     */
    public String getStep8() {
        return step8;
    }

    /**
     * 设置 步骤8
     * @param step8 步骤8
     */
    public void setStep8(String step8) {
        this.step8 = step8;
    }

    /**
     * 获取 研究决定ID
     * @return 研究决定ID
     */
    public Long getSecondMotionId() {
        return secondMotionId;
    }

    /**
     * 设置 研究决定ID
     * @param secondMotionId 研究决定ID
     */
    public void setSecondMotionId(Long secondMotionId) {
        this.secondMotionId = secondMotionId;
    }

    /**
     * 获取 研究决定结果
     * @return 研究决定结果
     */
    public String getSecondMotionResult() {
        return secondMotionResult;
    }

    /**
     * 设置 研究决定结果
     * @param secondMotionResult 研究决定结果
     */
    public void setSecondMotionResult(String secondMotionResult) {
        this.secondMotionResult = secondMotionResult;
    }

    /**
     * 获取 步骤9
     * @return 步骤9
     */
    public String getStep9() {
        return step9;
    }

    /**
     * 设置 步骤9
     * @param step9 步骤9
     */
    public void setStep9(String step9) {
        this.step9 = step9;
    }

    /**
     * 获取 任前公示ID
     * @return 任前公示ID
     */
    public Long getPubBeforeInOfficeId() {
        return pubBeforeInOfficeId;
    }

    /**
     * 设置 任前公示ID
     * @param pubBeforeInOfficeId 任前公示ID
     */
    public void setPubBeforeInOfficeId(Long pubBeforeInOfficeId) {
        this.pubBeforeInOfficeId = pubBeforeInOfficeId;
    }

    /**
     * 获取 任前公示结果
     * @return 任前公示结果
     */
    public String getPubBeforeInOfficeResult() {
        return pubBeforeInOfficeResult;
    }

    /**
     * 设置 任前公示结果
     * @param pubBeforeInOfficeResult 任前公示结果
     */
    public void setPubBeforeInOfficeResult(String pubBeforeInOfficeResult) {
        this.pubBeforeInOfficeResult = pubBeforeInOfficeResult;
    }

    /**
     * 获取 步骤10
     * @return 步骤10
     */
    public String getStep10() {
        return step10;
    }

    /**
     * 设置 步骤10
     * @param step10 步骤10
     */
    public void setStep10(String step10) {
        this.step10 = step10;
    }

    /**
     * 获取 研究决定（三次上会）ID
     * @return 研究决定（三次上会）ID
     */
    public Long getThirdMotionId() {
        return thirdMotionId;
    }

    /**
     * 设置 研究决定（三次上会）ID
     * @param thirdMotionId 研究决定（三次上会）ID
     */
    public void setThirdMotionId(Long thirdMotionId) {
        this.thirdMotionId = thirdMotionId;
    }

    /**
     * 获取 研究决定（三次上会）结果
     * @return 研究决定（三次上会）结果
     */
    public String getThirdMotionResult() {
        return thirdMotionResult;
    }

    /**
     * 设置 研究决定（三次上会）结果
     * @param thirdMotionResult 研究决定（三次上会）结果
     */
    public void setThirdMotionResult(String thirdMotionResult) {
        this.thirdMotionResult = thirdMotionResult;
    }

    /**
     * 获取 步骤11
     * @return 步骤11
     */
    public String getStep11() {
        return step11;
    }

    /**
     * 设置 步骤11
     * @param step11 步骤11
     */
    public void setStep11(String step11) {
        this.step11 = step11;
    }

    /**
     * 获取 任前报批ID
     * @return 任前报批ID
     */
    public Long getAppBeforeInOfficeId() {
        return appBeforeInOfficeId;
    }

    /**
     * 设置 任前报批ID
     * @param appBeforeInOfficeId 任前报批ID
     */
    public void setAppBeforeInOfficeId(Long appBeforeInOfficeId) {
        this.appBeforeInOfficeId = appBeforeInOfficeId;
    }

    /**
     * 获取 任前报批结果
     * @return 任前报批结果
     */
    public String getAppBeforeInOfficeResult() {
        return appBeforeInOfficeResult;
    }

    /**
     * 设置 任前报批结果
     * @param appBeforeInOfficeResult 任前报批结果
     */
    public void setAppBeforeInOfficeResult(String appBeforeInOfficeResult) {
        this.appBeforeInOfficeResult = appBeforeInOfficeResult;
    }

    /**
     * 获取 步骤12
     * @return 步骤12
     */
    public String getStep12() {
        return step12;
    }

    /**
     * 设置 步骤12
     * @param step12 步骤12
     */
    public void setStep12(String step12) {
        this.step12 = step12;
    }

    /**
     * 获取 离职检查ID 
     * @return 离职检查ID 
     */
    public Long getOutgoingInspectionId() {
        return outgoingInspectionId;
    }

    /**
     * 设置 离职检查ID 
     * @param outgoingInspectionId 离职检查ID 
     */
    public void setOutgoingInspectionId(Long outgoingInspectionId) {
        this.outgoingInspectionId = outgoingInspectionId;
    }

    /**
     * 获取 离职检查结果
     * @return 离职检查结果
     */
    public String getOutgoingInspectionResult() {
        return outgoingInspectionResult;
    }

    /**
     * 设置 离职检查结果
     * @param outgoingInspectionResult 离职检查结果
     */
    public void setOutgoingInspectionResult(String outgoingInspectionResult) {
        this.outgoingInspectionResult = outgoingInspectionResult;
    }

    /**
     * 获取 步骤13
     * @return 步骤13
     */
    public String getStep13() {
        return step13;
    }

    /**
     * 设置 步骤13
     * @param step13 步骤13
     */
    public void setStep13(String step13) {
        this.step13 = step13;
    }

    /**
     * 获取 任职谈话ID
     * @return 任职谈话ID
     */
    public Long getConInOfficeId() {
        return conInOfficeId;
    }

    /**
     * 设置 任职谈话ID
     * @param conInOfficeId 任职谈话ID
     */
    public void setConInOfficeId(Long conInOfficeId) {
        this.conInOfficeId = conInOfficeId;
    }

    /**
     * 获取 任职谈话结果
     * @return 任职谈话结果
     */
    public String getConInOfficeResult() {
        return conInOfficeResult;
    }

    /**
     * 设置 任职谈话结果
     * @param conInOfficeResult 任职谈话结果
     */
    public void setConInOfficeResult(String conInOfficeResult) {
        this.conInOfficeResult = conInOfficeResult;
    }

    /**
     * 获取 步骤14
     * @return 步骤14
     */
    public String getStep14() {
        return step14;
    }

    /**
     * 设置 步骤14
     * @param step14 步骤14
     */
    public void setStep14(String step14) {
        this.step14 = step14;
    }

    /**
     * 获取 廉洁谈话ID
     * @return 廉洁谈话ID
     */
    public Long getConHonestId() {
        return conHonestId;
    }

    /**
     * 设置 廉洁谈话ID
     * @param conHonestId 廉洁谈话ID
     */
    public void setConHonestId(Long conHonestId) {
        this.conHonestId = conHonestId;
    }

    /**
     * 获取 廉洁谈话结果
     * @return 廉洁谈话结果
     */
    public String getConHonestResult() {
        return conHonestResult;
    }

    /**
     * 设置 廉洁谈话结果
     * @param conHonestResult 廉洁谈话结果
     */
    public void setConHonestResult(String conHonestResult) {
        this.conHonestResult = conHonestResult;
    }

    /**
     * 获取 步骤15
     * @return 步骤15
     */
    public String getStep15() {
        return step15;
    }

    /**
     * 设置 步骤15
     * @param step15 步骤15
     */
    public void setStep15(String step15) {
        this.step15 = step15;
    }

    /**
     * 获取 当地银保监核准ID
     * @return 当地银保监核准ID
     */
    public Long getAppBankingSupervisionId() {
        return appBankingSupervisionId;
    }

    /**
     * 设置 当地银保监核准ID
     * @param appBankingSupervisionId 当地银保监核准ID
     */
    public void setAppBankingSupervisionId(Long appBankingSupervisionId) {
        this.appBankingSupervisionId = appBankingSupervisionId;
    }

    /**
     * 获取 当地银保监核准结果
     * @return 当地银保监核准结果
     */
    public String getAppBankingSupervisionResult() {
        return appBankingSupervisionResult;
    }

    /**
     * 设置 当地银保监核准结果
     * @param appBankingSupervisionResult 当地银保监核准结果
     */
    public void setAppBankingSupervisionResult(String appBankingSupervisionResult) {
        this.appBankingSupervisionResult = appBankingSupervisionResult;
    }

    /**
     * 获取 步骤16
     * @return 步骤16
     */
    public String getStep16() {
        return step16;
    }

    /**
     * 设置 步骤16
     * @param step16 步骤16
     */
    public void setStep16(String step16) {
        this.step16 = step16;
    }

    /**
     * 获取 任职宣布ID
     * @return 任职宣布ID
     */
    public Long getAnnouncedInOfficeId() {
        return announcedInOfficeId;
    }

    /**
     * 设置 任职宣布ID
     * @param announcedInOfficeId 任职宣布ID
     */
    public void setAnnouncedInOfficeId(Long announcedInOfficeId) {
        this.announcedInOfficeId = announcedInOfficeId;
    }

    /**
     * 获取 任职宣布结果
     * @return 任职宣布结果
     */
    public String getAnnouncedInOfficeResult() {
        return announcedInOfficeResult;
    }

    /**
     * 设置 任职宣布结果
     * @param announcedInOfficeResult 任职宣布结果
     */
    public void setAnnouncedInOfficeResult(String announcedInOfficeResult) {
        this.announcedInOfficeResult = announcedInOfficeResult;
    }

    /**
     * 获取 步骤17
     * @return 步骤17
     */
    public String getStep17() {
        return step17;
    }

    /**
     * 设置 步骤17
     * @param step17 步骤17
     */
    public void setStep17(String step17) {
        this.step17 = step17;
    }

    /**
     * 获取 发文任免ID
     * @return 发文任免ID
     */
    public Long getPostAppointId() {
        return postAppointId;
    }

    /**
     * 设置 发文任免ID
     * @param postAppointId 发文任免ID
     */
    public void setPostAppointId(Long postAppointId) {
        this.postAppointId = postAppointId;
    }

    /**
     * 获取 发文任免结果
     * @return 发文任免结果
     */
    public String getPostAppointResult() {
        return postAppointResult;
    }

    /**
     * 设置 发文任免结果
     * @param postAppointResult 发文任免结果
     */
    public void setPostAppointResult(String postAppointResult) {
        this.postAppointResult = postAppointResult;
    }

    /**
     * 获取 步骤18
     * @return 步骤18
     */
    public String getStep18() {
        return step18;
    }

    /**
     * 设置 步骤18
     * @param step18 步骤18
     */
    public void setStep18(String step18) {
        this.step18 = step18;
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

    /**
     * 获取 流程状态 0：进行中 1：已完成
     * @return 流程状态 0：进行中 1：已完成
     */
    public String getFlowStatus() {
        return flowStatus;
    }

    /**
     * 设置 流程状态 0：进行中 1：已完成
     * @param flowStatus 流程状态 0：进行中 1：已完成
     */
    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
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
     * 获取 调整类型 0：提拔 1：平调 2：降职 3：转非 4：辞职 5：其他
     * @return 调整类型 0：提拔 1：平调 2：降职 3：转非 4：辞职 5：其他
     */
    public String getAdjustType() {
        return adjustType;
    }

    /**
     * 设置 调整类型 0：提拔 1：平调 2：降职 3：转非 4：辞职 5：其他
     * @param adjustType 调整类型 0：提拔 1：平调 2：降职 3：转非 4：辞职 5：其他
     */
    public void setAdjustType(String adjustType) {
        this.adjustType = adjustType;
    }

    /**
     * 获取 职等： 0：五职等；1：六职等；2：七职等；3:八职等；4：九职等；5：十职等；6：十一职等；7：十二职等；8：十三职等；9：十四职等；10：十五职等；
     * @return 职等： 0：五职等；1：六职等；2：七职等；3:八职等；4：九职等；5：十职等；6：十一职等；7：十二职等；8：十三职等；9：十四职等；10：十五职等；
     */
    public String getPositionLevel() {
        return positionLevel;
    }

    /**
     * 设置 职等： 0：五职等；1：六职等；2：七职等；3:八职等；4：九职等；5：十职等；6：十一职等；7：十二职等；8：十三职等；9：十四职等；10：十五职等；
     * @param positionLevel 职等： 0：五职等；1：六职等；2：七职等；3:八职等；4：九职等；5：十职等；6：十一职等；7：十二职等；8：十三职等；9：十四职等；10：十五职等；
     */
    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    /**
     * 获取 起始时间
     * @return 起始时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置 起始时间
     * @param startDate 起始时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取 结束时间
     * @return 结束时间
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置 结束时间
     * @param endDate 结束时间
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userid=").append(userid);
        sb.append(", username=").append(username);
        sb.append(", aspiringUnit=").append(aspiringUnit);
        sb.append(", aspiringPosition=").append(aspiringPosition);
        sb.append(", step1=").append(step1);
        sb.append(", unitReId=").append(unitReId);
        sb.append(", unitReResult=").append(unitReResult);
        sb.append(", step2=").append(step2);
        sb.append(", firstMotionId=").append(firstMotionId);
        sb.append(", firstMotionResult=").append(firstMotionResult);
        sb.append(", step3=").append(step3);
        sb.append(", reportBeforeImId=").append(reportBeforeImId);
        sb.append(", reportBeforeImResult=").append(reportBeforeImResult);
        sb.append(", step4=").append(step4);
        sb.append(", democracyInsReId=").append(democracyInsReId);
        sb.append(", democracyInsReResult=").append(democracyInsReResult);
        sb.append(", step5=").append(step5);
        sb.append(", inspectArchivesId=").append(inspectArchivesId);
        sb.append(", inspectArchivesResult=").append(inspectArchivesResult);
        sb.append(", step6=").append(step6);
        sb.append(", comDisInsReOpId=").append(comDisInsReOpId);
        sb.append(", comDisInsReOpResult=").append(comDisInsReOpResult);
        sb.append(", step7=").append(step7);
        sb.append(", complianceDepOpId=").append(complianceDepOpId);
        sb.append(", complianceDepOpResult=").append(complianceDepOpResult);
        sb.append(", step8=").append(step8);
        sb.append(", secondMotionId=").append(secondMotionId);
        sb.append(", secondMotionResult=").append(secondMotionResult);
        sb.append(", step9=").append(step9);
        sb.append(", pubBeforeInOfficeId=").append(pubBeforeInOfficeId);
        sb.append(", pubBeforeInOfficeResult=").append(pubBeforeInOfficeResult);
        sb.append(", step10=").append(step10);
        sb.append(", thirdMotionId=").append(thirdMotionId);
        sb.append(", thirdMotionResult=").append(thirdMotionResult);
        sb.append(", step11=").append(step11);
        sb.append(", appBeforeInOfficeId=").append(appBeforeInOfficeId);
        sb.append(", appBeforeInOfficeResult=").append(appBeforeInOfficeResult);
        sb.append(", step12=").append(step12);
        sb.append(", outgoingInspectionId=").append(outgoingInspectionId);
        sb.append(", outgoingInspectionResult=").append(outgoingInspectionResult);
        sb.append(", step13=").append(step13);
        sb.append(", conInOfficeId=").append(conInOfficeId);
        sb.append(", conInOfficeResult=").append(conInOfficeResult);
        sb.append(", step14=").append(step14);
        sb.append(", conHonestId=").append(conHonestId);
        sb.append(", conHonestResult=").append(conHonestResult);
        sb.append(", step15=").append(step15);
        sb.append(", appBankingSupervisionId=").append(appBankingSupervisionId);
        sb.append(", appBankingSupervisionResult=").append(appBankingSupervisionResult);
        sb.append(", step16=").append(step16);
        sb.append(", announcedInOfficeId=").append(announcedInOfficeId);
        sb.append(", announcedInOfficeResult=").append(announcedInOfficeResult);
        sb.append(", step17=").append(step17);
        sb.append(", postAppointId=").append(postAppointId);
        sb.append(", postAppointResult=").append(postAppointResult);
        sb.append(", step18=").append(step18);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", flowStatus=").append(flowStatus);
        sb.append(", org=").append(org);
        sb.append(", adjustType=").append(adjustType);
        sb.append(", positionLevel=").append(positionLevel);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}