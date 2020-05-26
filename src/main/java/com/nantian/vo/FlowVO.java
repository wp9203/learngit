package com.nantian.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.ToStringSerializer;

import java.util.Date;

public class FlowVO {
        /**
         * ID主键
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long id;

        /**
         * 用户ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long userid;
        /**
         * 用户
         */
        private String username;
        /**
         * 推荐单位
         */
        private String aspiring_unit;
        /**
         * 推荐职位
         */
        private String aspiring_position;
        /**
         * 步骤1
         */
        private String step1;
        /**
         * 单位推荐ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long unit_re_id;
        /**
         * 单位推荐结果
         */
        private String unit_re_result;
        /**
         * 步骤2
         */
        private String step2;
        /**
         * 动议ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long first_motion_id;
        /**
         * 动议结果
         */
        private String first_motion_result;
        /**
         * 步骤3
         */
        private String step3;
        /**
         * 实施前报告ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long report_before_im_id;
        /**
         * 实施前报告结果
         */
        private String report_before_im_result;
        /**
         * 步骤4
         */
        private String step4;
        /**
         * 民主推荐与考察ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long democracy_ins_re_id;
        /**
         * 民主推荐与考察结果
         */
        private String democracy_ins_re_result;
        /**
         * 步骤5
         */
        private String step5;
        /**
         * 核查档案ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long inspect_archives_id;
        /**
         * 核查档案结果
         */
        private String inspect_archives_result;
        /**
         * 步骤6
         */
        private String step6;
        /**
         * 纪委部意见ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long com_dis_ins_re_op_id;
        /**
         * 纪委部意见结果
         */
        private String com_dis_ins_re_op_result;
        /**
         * 步骤7
         */
        private String step7;
        /**
         * 合规部意见ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long compliance_dep_op_id;
        /**
         * 合规部意见结果
         */
        private String compliance_dep_op_result;
        /**
         * 步骤8
         */
        private String step8;
        /**
         * 研究决定ID（二次上会）
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long second_motion_id;
        /**
         * 研究决定结果（二次上会）
         */
        private String second_motion_result;
        /**
         * 步骤9
         */
        private String step9;
        /**
         * 任前公示ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long pub_before_in_office_id;
        /**
         * 任前公示结果
         */
        private String pub_before_in_office_result;
        /**
         * 步骤10
         */
        private String step10;
        /**
         * 研究决定ID（三次上会）
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long third_motion_id;
        /**
         * 研究决定结果（上次上会）
         */
        private String third_motion_result;
        /**
         * 步骤11
         */
        private String step11;
        /**
         * 任前报批ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long app_before_in_office_id;
        /**
         * 任前报批结果
         */
        private String app_before_in_office_result;
        /**
         * 步骤12
         */
        private String step12;
        /**
         * 离任检查ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long outgoing_inspection_id;
        /**
         * 离任检查结果
         */
        private String outgoing_inspection_result;
        /**
         * 步骤13
         */
        private String step13;
        /**
         * 任职谈话ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long con_in_office_id;
        /**
         * 任职谈话结果
         */
        private String con_in_office_result;
        /**
         * 步骤14
         */
        private String step14;
        /**
         * 廉洁谈话ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long con_honest_id;
        /**
         * 廉洁谈话结果
         */
        private String con_honest_result;
        /**
         * 步骤15
         */
        private String step15;
        /**
         * 银保监核准ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long app_banking_supervision_id;
        /**
         * 银保监核准结果
         */
        private String app_banking_supervision_result;
        /**
         * 步骤16
         */
        private String step16;
        /**
         * 任职宣布ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long announced_in_office_id;
        /**
         * 任职宣布结果
         */
        private String announced_in_office_result;
        /**
         * 步骤17
         */
        private String step17;
        /**
         * 发文任免ID
         */
        @JSONField(serializeUsing = ToStringSerializer.class)
        private Long post_appoint_id;
        /**
         * 发文任免结果
         */
        private String post_appoint_result;
        /**
         * 步骤18
         */
        private String step18;

        /**
         * 创建时间 审计字段
         */
        private Date creationTime;

        /**
         * 更新时间 审计字段
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

    public String getFlowStatus() {
        return flowStatus;
    }

    public void setFlowStatus(String flowStatus) {
        this.flowStatus = flowStatus;
    }

    public String getOrg() {
        return org;
    }

    public void setOrg(String org) {
        this.org = org;
    }

    public String getAdjustType() {
        return adjustType;
    }

    public void setAdjustType(String adjustType) {
        this.adjustType = adjustType;
    }

    public String getPositionLevel() {
        return positionLevel;
    }

    public void setPositionLevel(String positionLevel) {
        this.positionLevel = positionLevel;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public static long getSerialVersionUID() {
            return serialVersionUID;
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public Long getUserid() {
            return userid;
        }

        public void setUserid(Long userid) {
            this.userid = userid;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getAspiring_unit() {
            return aspiring_unit;
        }

        public void setAspiring_unit(String aspiring_unit) {
            this.aspiring_unit = aspiring_unit;
        }

        public String getAspiring_position() {
            return aspiring_position;
        }

        public void setAspiring_position(String aspiring_position) {
            this.aspiring_position = aspiring_position;
        }

        public String getStep1() {
            return step1;
        }

        public void setStep1(String step1) {
            this.step1 = step1;
        }

        public Long getUnit_re_id() {
            return unit_re_id;
        }

        public void setUnit_re_id(Long unit_re_id) {
            this.unit_re_id = unit_re_id;
        }

        public String getUnit_re_result() {
            return unit_re_result;
        }

        public void setUnit_re_result(String unit_re_result) {
            this.unit_re_result = unit_re_result;
        }

        public String getStep2() {
            return step2;
        }

        public void setStep2(String step2) {
            this.step2 = step2;
        }

        public Long getFirst_motion_id() {
            return first_motion_id;
        }

        public void setFirst_motion_id(Long first_motion_id) {
            this.first_motion_id = first_motion_id;
        }

        public String getFirst_motion_result() {
            return first_motion_result;
        }

        public void setFirst_motion_result(String first_motion_result) {
            this.first_motion_result = first_motion_result;
        }

        public String getStep3() {
            return step3;
        }

        public void setStep3(String step3) {
            this.step3 = step3;
        }

        public Long getReport_before_im_id() {
            return report_before_im_id;
        }

        public void setReport_before_im_id(Long report_before_im_id) {
            this.report_before_im_id = report_before_im_id;
        }

        public String getReport_before_im_result() {
            return report_before_im_result;
        }

        public void setReport_before_im_result(String report_before_im_result) {
            this.report_before_im_result = report_before_im_result;
        }

        public String getStep4() {
            return step4;
        }

        public void setStep4(String step4) {
            this.step4 = step4;
        }

        public Long getDemocracy_ins_re_id() {
            return democracy_ins_re_id;
        }

        public void setDemocracy_ins_re_id(Long democracy_ins_re_id) {
            this.democracy_ins_re_id = democracy_ins_re_id;
        }

        public String getDemocracy_ins_re_result() {
            return democracy_ins_re_result;
        }

        public void setDemocracy_ins_re_result(String democracy_ins_re_result) {
            this.democracy_ins_re_result = democracy_ins_re_result;
        }

        public String getStep5() {
            return step5;
        }

        public void setStep5(String step5) {
            this.step5 = step5;
        }

        public Long getInspect_archives_id() {
            return inspect_archives_id;
        }

        public void setInspect_archives_id(Long inspect_archives_id) {
            this.inspect_archives_id = inspect_archives_id;
        }

        public String getInspect_archives_result() {
            return inspect_archives_result;
        }

        public void setInspect_archives_result(String inspect_archives_result) {
            this.inspect_archives_result = inspect_archives_result;
        }

        public String getStep6() {
            return step6;
        }

        public void setStep6(String step6) {
            this.step6 = step6;
        }

        public Long getCom_dis_ins_re_op_id() {
            return com_dis_ins_re_op_id;
        }

        public void setCom_dis_ins_re_op_id(Long com_dis_ins_re_op_id) {
            this.com_dis_ins_re_op_id = com_dis_ins_re_op_id;
        }

        public String getCom_dis_ins_re_op_result() {
            return com_dis_ins_re_op_result;
        }

        public void setCom_dis_ins_re_op_result(String com_dis_ins_re_op_result) {
            this.com_dis_ins_re_op_result = com_dis_ins_re_op_result;
        }

        public String getStep7() {
            return step7;
        }

        public void setStep7(String step7) {
            this.step7 = step7;
        }

        public Long getCompliance_dep_op_id() {
            return compliance_dep_op_id;
        }

        public void setCompliance_dep_op_id(Long compliance_dep_op_id) {
            this.compliance_dep_op_id = compliance_dep_op_id;
        }

        public String getCompliance_dep_op_result() {
            return compliance_dep_op_result;
        }

        public void setCompliance_dep_op_result(String compliance_dep_op_result) {
            this.compliance_dep_op_result = compliance_dep_op_result;
        }

        public String getStep8() {
            return step8;
        }

        public void setStep8(String step8) {
            this.step8 = step8;
        }

        public Long getSecond_motion_id() {
            return second_motion_id;
        }

        public void setSecond_motion_id(Long second_motion_id) {
            this.second_motion_id = second_motion_id;
        }

        public String getSecond_motion_result() {
            return second_motion_result;
        }

        public void setSecond_motion_result(String second_motion_result) {
            this.second_motion_result = second_motion_result;
        }

        public String getStep9() {
            return step9;
        }

        public void setStep9(String step9) {
            this.step9 = step9;
        }

        public Long getPub_before_in_office_id() {
            return pub_before_in_office_id;
        }

        public void setPub_before_in_office_id(Long pub_before_in_office_id) {
            this.pub_before_in_office_id = pub_before_in_office_id;
        }

        public String getPub_before_in_office_result() {
            return pub_before_in_office_result;
        }

        public void setPub_before_in_office_result(String pub_before_in_office_result) {
            this.pub_before_in_office_result = pub_before_in_office_result;
        }

        public String getStep10() {
            return step10;
        }

        public void setStep10(String step10) {
            this.step10 = step10;
        }

        public Long getThird_motion_id() {
            return third_motion_id;
        }

        public void setThird_motion_id(Long third_motion_id) {
            this.third_motion_id = third_motion_id;
        }

        public String getThird_motion_result() {
            return third_motion_result;
        }

        public void setThird_motion_result(String third_motion_result) {
            this.third_motion_result = third_motion_result;
        }

        public String getStep11() {
            return step11;
        }

        public void setStep11(String step11) {
            this.step11 = step11;
        }

        public Long getApp_before_in_office_id() {
            return app_before_in_office_id;
        }

        public void setApp_before_in_office_id(Long app_before_in_office_id) {
            this.app_before_in_office_id = app_before_in_office_id;
        }

        public String getApp_before_in_office_result() {
            return app_before_in_office_result;
        }

        public void setApp_before_in_office_result(String app_before_in_office_result) {
            this.app_before_in_office_result = app_before_in_office_result;
        }

        public String getStep12() {
            return step12;
        }

        public void setStep12(String step12) {
            this.step12 = step12;
        }

        public Long getOutgoing_inspection_id() {
            return outgoing_inspection_id;
        }

        public void setOutgoing_inspection_id(Long outgoing_inspection_id) {
            this.outgoing_inspection_id = outgoing_inspection_id;
        }

        public String getOutgoing_inspection_result() {
            return outgoing_inspection_result;
        }

        public void setOutgoing_inspection_result(String outgoing_inspection_result) {
            this.outgoing_inspection_result = outgoing_inspection_result;
        }

        public String getStep13() {
            return step13;
        }

        public void setStep13(String step13) {
            this.step13 = step13;
        }

        public Long getCon_in_office_id() {
            return con_in_office_id;
        }

        public void setCon_in_office_id(Long con_in_office_id) {
            this.con_in_office_id = con_in_office_id;
        }

        public String getCon_in_office_result() {
            return con_in_office_result;
        }

        public void setCon_in_office_result(String con_in_office_result) {
            this.con_in_office_result = con_in_office_result;
        }

        public String getStep14() {
            return step14;
        }

        public void setStep14(String step14) {
            this.step14 = step14;
        }

        public Long getCon_honest_id() {
            return con_honest_id;
        }

        public void setCon_honest_id(Long con_honest_id) {
            this.con_honest_id = con_honest_id;
        }

        public String getCon_honest_result() {
            return con_honest_result;
        }

        public void setCon_honest_result(String con_honest_result) {
            this.con_honest_result = con_honest_result;
        }

        public String getStep15() {
            return step15;
        }

        public void setStep15(String step15) {
            this.step15 = step15;
        }

        public Long getApp_banking_supervision_id() {
            return app_banking_supervision_id;
        }

        public void setApp_banking_supervision_id(Long app_banking_supervision_id) {
            this.app_banking_supervision_id = app_banking_supervision_id;
        }

        public String getApp_banking_supervision_result() {
            return app_banking_supervision_result;
        }

        public void setApp_banking_supervision_result(String app_banking_supervision_result) {
            this.app_banking_supervision_result = app_banking_supervision_result;
        }

        public String getStep16() {
            return step16;
        }

        public void setStep16(String step16) {
            this.step16 = step16;
        }

        public Long getAnnounced_in_office_id() {
            return announced_in_office_id;
        }

        public void setAnnounced_in_office_id(Long announced_in_office_id) {
            this.announced_in_office_id = announced_in_office_id;
        }

        public String getAnnounced_in_office_result() {
            return announced_in_office_result;
        }

        public void setAnnounced_in_office_result(String announced_in_office_result) {
            this.announced_in_office_result = announced_in_office_result;
        }

        public String getStep17() {
            return step17;
        }

        public void setStep17(String step17) {
            this.step17 = step17;
        }

        public Long getPost_appoint_id() {
            return post_appoint_id;
        }

        public void setPost_appoint_id(Long post_appoint_id) {
            this.post_appoint_id = post_appoint_id;
        }

        public String getPost_appoint_result() {
            return post_appoint_result;
        }

        public void setPost_appoint_result(String post_appoint_result) {
            this.post_appoint_result = post_appoint_result;
        }

        public String getStep18() {
            return step18;
        }

        public void setStep18(String step18) {
            this.step18 = step18;
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
        return "FlowVO{" +
                "id=" + id +
                ", userid=" + userid +
                ", username='" + username + '\'' +
                ", aspiring_unit='" + aspiring_unit + '\'' +
                ", aspiring_position='" + aspiring_position + '\'' +
                ", step1='" + step1 + '\'' +
                ", unit_re_id=" + unit_re_id +
                ", unit_re_result='" + unit_re_result + '\'' +
                ", step2='" + step2 + '\'' +
                ", first_motion_id=" + first_motion_id +
                ", first_motion_result='" + first_motion_result + '\'' +
                ", step3='" + step3 + '\'' +
                ", report_before_im_id=" + report_before_im_id +
                ", report_before_im_result='" + report_before_im_result + '\'' +
                ", step4='" + step4 + '\'' +
                ", democracy_ins_re_id=" + democracy_ins_re_id +
                ", democracy_ins_re_result='" + democracy_ins_re_result + '\'' +
                ", step5='" + step5 + '\'' +
                ", inspect_archives_id=" + inspect_archives_id +
                ", inspect_archives_result='" + inspect_archives_result + '\'' +
                ", step6='" + step6 + '\'' +
                ", com_dis_ins_re_op_id=" + com_dis_ins_re_op_id +
                ", com_dis_ins_re_op_result='" + com_dis_ins_re_op_result + '\'' +
                ", step7='" + step7 + '\'' +
                ", compliance_dep_op_id=" + compliance_dep_op_id +
                ", compliance_dep_op_result='" + compliance_dep_op_result + '\'' +
                ", step8='" + step8 + '\'' +
                ", second_motion_id=" + second_motion_id +
                ", second_motion_result='" + second_motion_result + '\'' +
                ", step9='" + step9 + '\'' +
                ", pub_before_in_office_id=" + pub_before_in_office_id +
                ", pub_before_in_office_result='" + pub_before_in_office_result + '\'' +
                ", step10='" + step10 + '\'' +
                ", third_motion_id=" + third_motion_id +
                ", third_motion_result='" + third_motion_result + '\'' +
                ", step11='" + step11 + '\'' +
                ", app_before_in_office_id=" + app_before_in_office_id +
                ", app_before_in_office_result='" + app_before_in_office_result + '\'' +
                ", step12='" + step12 + '\'' +
                ", outgoing_inspection_id=" + outgoing_inspection_id +
                ", outgoing_inspection_result='" + outgoing_inspection_result + '\'' +
                ", step13='" + step13 + '\'' +
                ", con_in_office_id=" + con_in_office_id +
                ", con_in_office_result='" + con_in_office_result + '\'' +
                ", step14='" + step14 + '\'' +
                ", con_honest_id=" + con_honest_id +
                ", con_honest_result='" + con_honest_result + '\'' +
                ", step15='" + step15 + '\'' +
                ", app_banking_supervision_id=" + app_banking_supervision_id +
                ", app_banking_supervision_result='" + app_banking_supervision_result + '\'' +
                ", step16='" + step16 + '\'' +
                ", announced_in_office_id=" + announced_in_office_id +
                ", announced_in_office_result='" + announced_in_office_result + '\'' +
                ", step17='" + step17 + '\'' +
                ", post_appoint_id=" + post_appoint_id +
                ", post_appoint_result='" + post_appoint_result + '\'' +
                ", step18='" + step18 + '\'' +
                ", creationTime=" + creationTime +
                ", updateTime=" + updateTime +
                ", flowStatus='" + flowStatus + '\'' +
                ", org='" + org + '\'' +
                ", adjustType='" + adjustType + '\'' +
                ", positionLevel='" + positionLevel + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
