package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFirstMotionExample {
    /**
     * 排序条件
     */
    protected String orderByClause;

    /**
     * 是否distinct
     */
    protected boolean distinct;

    /**
     * 条件集合
     */
    protected List<Criteria> oredCriteria;

    /**
     * 构造器 
     */
    public SysFirstMotionExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * 设置 排序条件
     * @param orderByClause 排序条件
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * 获取 排序条件
     * @return 排序条件
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * 设置 是否distinct
     * @param distinct 是否distinct
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * 获取 是否distinct
     * @return 是否distinct
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * 获取 所有条件规则
     * @return 所有条件规则
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIsNull() {
            addCriterion("MEETING_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIsNotNull() {
            addCriterion("MEETING_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMeetingDateEqualTo(Date value) {
            addCriterion("MEETING_DATE =", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotEqualTo(Date value) {
            addCriterion("MEETING_DATE <>", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateGreaterThan(Date value) {
            addCriterion("MEETING_DATE >", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MEETING_DATE >=", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateLessThan(Date value) {
            addCriterion("MEETING_DATE <", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateLessThanOrEqualTo(Date value) {
            addCriterion("MEETING_DATE <=", value, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateIn(List<Date> values) {
            addCriterion("MEETING_DATE in", values, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotIn(List<Date> values) {
            addCriterion("MEETING_DATE not in", values, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateBetween(Date value1, Date value2) {
            addCriterion("MEETING_DATE between", value1, value2, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andMeetingDateNotBetween(Date value1, Date value2) {
            addCriterion("MEETING_DATE not between", value1, value2, "meetingDate");
            return (Criteria) this;
        }

        public Criteria andHostIsNull() {
            addCriterion("HOST is null");
            return (Criteria) this;
        }

        public Criteria andHostIsNotNull() {
            addCriterion("HOST is not null");
            return (Criteria) this;
        }

        public Criteria andHostEqualTo(String value) {
            addCriterion("HOST =", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotEqualTo(String value) {
            addCriterion("HOST <>", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThan(String value) {
            addCriterion("HOST >", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostGreaterThanOrEqualTo(String value) {
            addCriterion("HOST >=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThan(String value) {
            addCriterion("HOST <", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLessThanOrEqualTo(String value) {
            addCriterion("HOST <=", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostLike(String value) {
            addCriterion("HOST like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotLike(String value) {
            addCriterion("HOST not like", value, "host");
            return (Criteria) this;
        }

        public Criteria andHostIn(List<String> values) {
            addCriterion("HOST in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotIn(List<String> values) {
            addCriterion("HOST not in", values, "host");
            return (Criteria) this;
        }

        public Criteria andHostBetween(String value1, String value2) {
            addCriterion("HOST between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andHostNotBetween(String value1, String value2) {
            addCriterion("HOST not between", value1, value2, "host");
            return (Criteria) this;
        }

        public Criteria andDueNumberIsNull() {
            addCriterion("DUE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andDueNumberIsNotNull() {
            addCriterion("DUE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andDueNumberEqualTo(String value) {
            addCriterion("DUE_NUMBER =", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotEqualTo(String value) {
            addCriterion("DUE_NUMBER <>", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberGreaterThan(String value) {
            addCriterion("DUE_NUMBER >", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberGreaterThanOrEqualTo(String value) {
            addCriterion("DUE_NUMBER >=", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberLessThan(String value) {
            addCriterion("DUE_NUMBER <", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberLessThanOrEqualTo(String value) {
            addCriterion("DUE_NUMBER <=", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberLike(String value) {
            addCriterion("DUE_NUMBER like", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotLike(String value) {
            addCriterion("DUE_NUMBER not like", value, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberIn(List<String> values) {
            addCriterion("DUE_NUMBER in", values, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotIn(List<String> values) {
            addCriterion("DUE_NUMBER not in", values, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberBetween(String value1, String value2) {
            addCriterion("DUE_NUMBER between", value1, value2, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andDueNumberNotBetween(String value1, String value2) {
            addCriterion("DUE_NUMBER not between", value1, value2, "dueNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberIsNull() {
            addCriterion("ACTUAL_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andActualNumberIsNotNull() {
            addCriterion("ACTUAL_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andActualNumberEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER =", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER <>", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberGreaterThan(String value) {
            addCriterion("ACTUAL_NUMBER >", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER >=", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLessThan(String value) {
            addCriterion("ACTUAL_NUMBER <", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLessThanOrEqualTo(String value) {
            addCriterion("ACTUAL_NUMBER <=", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberLike(String value) {
            addCriterion("ACTUAL_NUMBER like", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotLike(String value) {
            addCriterion("ACTUAL_NUMBER not like", value, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberIn(List<String> values) {
            addCriterion("ACTUAL_NUMBER in", values, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotIn(List<String> values) {
            addCriterion("ACTUAL_NUMBER not in", values, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberBetween(String value1, String value2) {
            addCriterion("ACTUAL_NUMBER between", value1, value2, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andActualNumberNotBetween(String value1, String value2) {
            addCriterion("ACTUAL_NUMBER not between", value1, value2, "actualNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberIsNull() {
            addCriterion("SUMMARY_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberIsNotNull() {
            addCriterion("SUMMARY_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberEqualTo(String value) {
            addCriterion("SUMMARY_NUMBER =", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberNotEqualTo(String value) {
            addCriterion("SUMMARY_NUMBER <>", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberGreaterThan(String value) {
            addCriterion("SUMMARY_NUMBER >", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY_NUMBER >=", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberLessThan(String value) {
            addCriterion("SUMMARY_NUMBER <", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY_NUMBER <=", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberLike(String value) {
            addCriterion("SUMMARY_NUMBER like", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberNotLike(String value) {
            addCriterion("SUMMARY_NUMBER not like", value, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberIn(List<String> values) {
            addCriterion("SUMMARY_NUMBER in", values, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberNotIn(List<String> values) {
            addCriterion("SUMMARY_NUMBER not in", values, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberBetween(String value1, String value2) {
            addCriterion("SUMMARY_NUMBER between", value1, value2, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andSummaryNumberNotBetween(String value1, String value2) {
            addCriterion("SUMMARY_NUMBER not between", value1, value2, "summaryNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIsNull() {
            addCriterion("CANDIDATE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIsNotNull() {
            addCriterion("CANDIDATE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateNameEqualTo(String value) {
            addCriterion("CANDIDATE_NAME =", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotEqualTo(String value) {
            addCriterion("CANDIDATE_NAME <>", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameGreaterThan(String value) {
            addCriterion("CANDIDATE_NAME >", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_NAME >=", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLessThan(String value) {
            addCriterion("CANDIDATE_NAME <", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_NAME <=", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameLike(String value) {
            addCriterion("CANDIDATE_NAME like", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotLike(String value) {
            addCriterion("CANDIDATE_NAME not like", value, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameIn(List<String> values) {
            addCriterion("CANDIDATE_NAME in", values, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotIn(List<String> values) {
            addCriterion("CANDIDATE_NAME not in", values, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameBetween(String value1, String value2) {
            addCriterion("CANDIDATE_NAME between", value1, value2, "candidateName");
            return (Criteria) this;
        }

        public Criteria andCandidateNameNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_NAME not between", value1, value2, "candidateName");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIsNull() {
            addCriterion("ADJUST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIsNotNull() {
            addCriterion("ADJUST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeEqualTo(String value) {
            addCriterion("ADJUST_TYPE =", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotEqualTo(String value) {
            addCriterion("ADJUST_TYPE <>", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeGreaterThan(String value) {
            addCriterion("ADJUST_TYPE >", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ADJUST_TYPE >=", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLessThan(String value) {
            addCriterion("ADJUST_TYPE <", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLessThanOrEqualTo(String value) {
            addCriterion("ADJUST_TYPE <=", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeLike(String value) {
            addCriterion("ADJUST_TYPE like", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotLike(String value) {
            addCriterion("ADJUST_TYPE not like", value, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeIn(List<String> values) {
            addCriterion("ADJUST_TYPE in", values, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotIn(List<String> values) {
            addCriterion("ADJUST_TYPE not in", values, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeBetween(String value1, String value2) {
            addCriterion("ADJUST_TYPE between", value1, value2, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAdjustTypeNotBetween(String value1, String value2) {
            addCriterion("ADJUST_TYPE not between", value1, value2, "adjustType");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitIsNull() {
            addCriterion("ASPIRING_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitIsNotNull() {
            addCriterion("ASPIRING_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitEqualTo(String value) {
            addCriterion("ASPIRING_UNIT =", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitNotEqualTo(String value) {
            addCriterion("ASPIRING_UNIT <>", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitGreaterThan(String value) {
            addCriterion("ASPIRING_UNIT >", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitGreaterThanOrEqualTo(String value) {
            addCriterion("ASPIRING_UNIT >=", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitLessThan(String value) {
            addCriterion("ASPIRING_UNIT <", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitLessThanOrEqualTo(String value) {
            addCriterion("ASPIRING_UNIT <=", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitLike(String value) {
            addCriterion("ASPIRING_UNIT like", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitNotLike(String value) {
            addCriterion("ASPIRING_UNIT not like", value, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitIn(List<String> values) {
            addCriterion("ASPIRING_UNIT in", values, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitNotIn(List<String> values) {
            addCriterion("ASPIRING_UNIT not in", values, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitBetween(String value1, String value2) {
            addCriterion("ASPIRING_UNIT between", value1, value2, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringUnitNotBetween(String value1, String value2) {
            addCriterion("ASPIRING_UNIT not between", value1, value2, "aspiringUnit");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionIsNull() {
            addCriterion("ASPIRING_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionIsNotNull() {
            addCriterion("ASPIRING_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionEqualTo(String value) {
            addCriterion("ASPIRING_POSITION =", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionNotEqualTo(String value) {
            addCriterion("ASPIRING_POSITION <>", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionGreaterThan(String value) {
            addCriterion("ASPIRING_POSITION >", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionGreaterThanOrEqualTo(String value) {
            addCriterion("ASPIRING_POSITION >=", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLessThan(String value) {
            addCriterion("ASPIRING_POSITION <", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLessThanOrEqualTo(String value) {
            addCriterion("ASPIRING_POSITION <=", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLike(String value) {
            addCriterion("ASPIRING_POSITION like", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionNotLike(String value) {
            addCriterion("ASPIRING_POSITION not like", value, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionIn(List<String> values) {
            addCriterion("ASPIRING_POSITION in", values, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionNotIn(List<String> values) {
            addCriterion("ASPIRING_POSITION not in", values, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionBetween(String value1, String value2) {
            addCriterion("ASPIRING_POSITION between", value1, value2, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionNotBetween(String value1, String value2) {
            addCriterion("ASPIRING_POSITION not between", value1, value2, "aspiringPosition");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelIsNull() {
            addCriterion("ASPIRING_POSITION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelIsNotNull() {
            addCriterion("ASPIRING_POSITION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelEqualTo(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL =", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelNotEqualTo(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL <>", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelGreaterThan(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL >", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL >=", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelLessThan(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL <", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelLessThanOrEqualTo(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL <=", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelLike(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL like", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelNotLike(String value) {
            addCriterion("ASPIRING_POSITION_LEVEL not like", value, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelIn(List<String> values) {
            addCriterion("ASPIRING_POSITION_LEVEL in", values, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelNotIn(List<String> values) {
            addCriterion("ASPIRING_POSITION_LEVEL not in", values, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelBetween(String value1, String value2) {
            addCriterion("ASPIRING_POSITION_LEVEL between", value1, value2, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andAspiringPositionLevelNotBetween(String value1, String value2) {
            addCriterion("ASPIRING_POSITION_LEVEL not between", value1, value2, "aspiringPositionLevel");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("NOTE is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("NOTE is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("NOTE =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("NOTE <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("NOTE >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("NOTE >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("NOTE <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("NOTE <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("NOTE like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("NOTE not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("NOTE in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("NOTE not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("NOTE between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("NOTE not between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andPassIsNull() {
            addCriterion("PASS is null");
            return (Criteria) this;
        }

        public Criteria andPassIsNotNull() {
            addCriterion("PASS is not null");
            return (Criteria) this;
        }

        public Criteria andPassEqualTo(String value) {
            addCriterion("PASS =", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotEqualTo(String value) {
            addCriterion("PASS <>", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThan(String value) {
            addCriterion("PASS >", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassGreaterThanOrEqualTo(String value) {
            addCriterion("PASS >=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThan(String value) {
            addCriterion("PASS <", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLessThanOrEqualTo(String value) {
            addCriterion("PASS <=", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassLike(String value) {
            addCriterion("PASS like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotLike(String value) {
            addCriterion("PASS not like", value, "pass");
            return (Criteria) this;
        }

        public Criteria andPassIn(List<String> values) {
            addCriterion("PASS in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotIn(List<String> values) {
            addCriterion("PASS not in", values, "pass");
            return (Criteria) this;
        }

        public Criteria andPassBetween(String value1, String value2) {
            addCriterion("PASS between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andPassNotBetween(String value1, String value2) {
            addCriterion("PASS not between", value1, value2, "pass");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNull() {
            addCriterion("INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIsNotNull() {
            addCriterion("INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInstanceIdEqualTo(String value) {
            addCriterion("INSTANCE_ID =", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotEqualTo(String value) {
            addCriterion("INSTANCE_ID <>", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThan(String value) {
            addCriterion("INSTANCE_ID >", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("INSTANCE_ID >=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThan(String value) {
            addCriterion("INSTANCE_ID <", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLessThanOrEqualTo(String value) {
            addCriterion("INSTANCE_ID <=", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdLike(String value) {
            addCriterion("INSTANCE_ID like", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotLike(String value) {
            addCriterion("INSTANCE_ID not like", value, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdIn(List<String> values) {
            addCriterion("INSTANCE_ID in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotIn(List<String> values) {
            addCriterion("INSTANCE_ID not in", values, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdBetween(String value1, String value2) {
            addCriterion("INSTANCE_ID between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andInstanceIdNotBetween(String value1, String value2) {
            addCriterion("INSTANCE_ID not between", value1, value2, "instanceId");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("CREATION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("CREATION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("CREATION_TIME =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("CREATION_TIME <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("CREATION_TIME >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("CREATION_TIME <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("CREATION_TIME <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("CREATION_TIME in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("CREATION_TIME not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("CREATION_TIME not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("UPDATE_TIME =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("UPDATE_TIME <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("UPDATE_TIME >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("UPDATE_TIME <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_TIME <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("UPDATE_TIME in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("UPDATE_TIME not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_TIME not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameIsNull() {
            addCriterion("SUMMARY_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameIsNotNull() {
            addCriterion("SUMMARY_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameEqualTo(String value) {
            addCriterion("SUMMARY_FILE_NAME =", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameNotEqualTo(String value) {
            addCriterion("SUMMARY_FILE_NAME <>", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameGreaterThan(String value) {
            addCriterion("SUMMARY_FILE_NAME >", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY_FILE_NAME >=", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameLessThan(String value) {
            addCriterion("SUMMARY_FILE_NAME <", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY_FILE_NAME <=", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameLike(String value) {
            addCriterion("SUMMARY_FILE_NAME like", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameNotLike(String value) {
            addCriterion("SUMMARY_FILE_NAME not like", value, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameIn(List<String> values) {
            addCriterion("SUMMARY_FILE_NAME in", values, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameNotIn(List<String> values) {
            addCriterion("SUMMARY_FILE_NAME not in", values, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameBetween(String value1, String value2) {
            addCriterion("SUMMARY_FILE_NAME between", value1, value2, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSummaryFileNameNotBetween(String value1, String value2) {
            addCriterion("SUMMARY_FILE_NAME not between", value1, value2, "summaryFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameIsNull() {
            addCriterion("SIGN_FILE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSignFileNameIsNotNull() {
            addCriterion("SIGN_FILE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSignFileNameEqualTo(String value) {
            addCriterion("SIGN_FILE_NAME =", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameNotEqualTo(String value) {
            addCriterion("SIGN_FILE_NAME <>", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameGreaterThan(String value) {
            addCriterion("SIGN_FILE_NAME >", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_FILE_NAME >=", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameLessThan(String value) {
            addCriterion("SIGN_FILE_NAME <", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameLessThanOrEqualTo(String value) {
            addCriterion("SIGN_FILE_NAME <=", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameLike(String value) {
            addCriterion("SIGN_FILE_NAME like", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameNotLike(String value) {
            addCriterion("SIGN_FILE_NAME not like", value, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameIn(List<String> values) {
            addCriterion("SIGN_FILE_NAME in", values, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameNotIn(List<String> values) {
            addCriterion("SIGN_FILE_NAME not in", values, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameBetween(String value1, String value2) {
            addCriterion("SIGN_FILE_NAME between", value1, value2, "signFileName");
            return (Criteria) this;
        }

        public Criteria andSignFileNameNotBetween(String value1, String value2) {
            addCriterion("SIGN_FILE_NAME not between", value1, value2, "signFileName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}