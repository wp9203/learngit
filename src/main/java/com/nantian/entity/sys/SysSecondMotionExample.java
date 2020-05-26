package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysSecondMotionExample {
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
    public SysSecondMotionExample() {
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

        public Criteria andUnitIsNull() {
            addCriterion("UNIT is null");
            return (Criteria) this;
        }

        public Criteria andUnitIsNotNull() {
            addCriterion("UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitEqualTo(String value) {
            addCriterion("UNIT =", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotEqualTo(String value) {
            addCriterion("UNIT <>", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThan(String value) {
            addCriterion("UNIT >", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT >=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThan(String value) {
            addCriterion("UNIT <", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLessThanOrEqualTo(String value) {
            addCriterion("UNIT <=", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitLike(String value) {
            addCriterion("UNIT like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotLike(String value) {
            addCriterion("UNIT not like", value, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitIn(List<String> values) {
            addCriterion("UNIT in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotIn(List<String> values) {
            addCriterion("UNIT not in", values, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitBetween(String value1, String value2) {
            addCriterion("UNIT between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andUnitNotBetween(String value1, String value2) {
            addCriterion("UNIT not between", value1, value2, "unit");
            return (Criteria) this;
        }

        public Criteria andPositionIsNull() {
            addCriterion("POSITION is null");
            return (Criteria) this;
        }

        public Criteria andPositionIsNotNull() {
            addCriterion("POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andPositionEqualTo(String value) {
            addCriterion("POSITION =", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotEqualTo(String value) {
            addCriterion("POSITION <>", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThan(String value) {
            addCriterion("POSITION >", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION >=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThan(String value) {
            addCriterion("POSITION <", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLessThanOrEqualTo(String value) {
            addCriterion("POSITION <=", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLike(String value) {
            addCriterion("POSITION like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotLike(String value) {
            addCriterion("POSITION not like", value, "position");
            return (Criteria) this;
        }

        public Criteria andPositionIn(List<String> values) {
            addCriterion("POSITION in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotIn(List<String> values) {
            addCriterion("POSITION not in", values, "position");
            return (Criteria) this;
        }

        public Criteria andPositionBetween(String value1, String value2) {
            addCriterion("POSITION between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionNotBetween(String value1, String value2) {
            addCriterion("POSITION not between", value1, value2, "position");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIsNull() {
            addCriterion("POSITION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIsNotNull() {
            addCriterion("POSITION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andPositionLevelEqualTo(String value) {
            addCriterion("POSITION_LEVEL =", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotEqualTo(String value) {
            addCriterion("POSITION_LEVEL <>", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelGreaterThan(String value) {
            addCriterion("POSITION_LEVEL >", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_LEVEL >=", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLessThan(String value) {
            addCriterion("POSITION_LEVEL <", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLessThanOrEqualTo(String value) {
            addCriterion("POSITION_LEVEL <=", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelLike(String value) {
            addCriterion("POSITION_LEVEL like", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotLike(String value) {
            addCriterion("POSITION_LEVEL not like", value, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelIn(List<String> values) {
            addCriterion("POSITION_LEVEL in", values, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotIn(List<String> values) {
            addCriterion("POSITION_LEVEL not in", values, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelBetween(String value1, String value2) {
            addCriterion("POSITION_LEVEL between", value1, value2, "positionLevel");
            return (Criteria) this;
        }

        public Criteria andPositionLevelNotBetween(String value1, String value2) {
            addCriterion("POSITION_LEVEL not between", value1, value2, "positionLevel");
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

        public Criteria andChangUnitIsNull() {
            addCriterion("CHANG_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andChangUnitIsNotNull() {
            addCriterion("CHANG_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andChangUnitEqualTo(String value) {
            addCriterion("CHANG_UNIT =", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitNotEqualTo(String value) {
            addCriterion("CHANG_UNIT <>", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitGreaterThan(String value) {
            addCriterion("CHANG_UNIT >", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CHANG_UNIT >=", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitLessThan(String value) {
            addCriterion("CHANG_UNIT <", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitLessThanOrEqualTo(String value) {
            addCriterion("CHANG_UNIT <=", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitLike(String value) {
            addCriterion("CHANG_UNIT like", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitNotLike(String value) {
            addCriterion("CHANG_UNIT not like", value, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitIn(List<String> values) {
            addCriterion("CHANG_UNIT in", values, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitNotIn(List<String> values) {
            addCriterion("CHANG_UNIT not in", values, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitBetween(String value1, String value2) {
            addCriterion("CHANG_UNIT between", value1, value2, "changUnit");
            return (Criteria) this;
        }

        public Criteria andChangUnitNotBetween(String value1, String value2) {
            addCriterion("CHANG_UNIT not between", value1, value2, "changUnit");
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

        public Criteria andSignFilePathIsNull() {
            addCriterion("SIGN_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSignFilePathIsNotNull() {
            addCriterion("SIGN_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSignFilePathEqualTo(String value) {
            addCriterion("SIGN_FILE_PATH =", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathNotEqualTo(String value) {
            addCriterion("SIGN_FILE_PATH <>", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathGreaterThan(String value) {
            addCriterion("SIGN_FILE_PATH >", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("SIGN_FILE_PATH >=", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathLessThan(String value) {
            addCriterion("SIGN_FILE_PATH <", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathLessThanOrEqualTo(String value) {
            addCriterion("SIGN_FILE_PATH <=", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathLike(String value) {
            addCriterion("SIGN_FILE_PATH like", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathNotLike(String value) {
            addCriterion("SIGN_FILE_PATH not like", value, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathIn(List<String> values) {
            addCriterion("SIGN_FILE_PATH in", values, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathNotIn(List<String> values) {
            addCriterion("SIGN_FILE_PATH not in", values, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathBetween(String value1, String value2) {
            addCriterion("SIGN_FILE_PATH between", value1, value2, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSignFilePathNotBetween(String value1, String value2) {
            addCriterion("SIGN_FILE_PATH not between", value1, value2, "signFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathIsNull() {
            addCriterion("SUMMARY_FILE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathIsNotNull() {
            addCriterion("SUMMARY_FILE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathEqualTo(String value) {
            addCriterion("SUMMARY_FILE_PATH =", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathNotEqualTo(String value) {
            addCriterion("SUMMARY_FILE_PATH <>", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathGreaterThan(String value) {
            addCriterion("SUMMARY_FILE_PATH >", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("SUMMARY_FILE_PATH >=", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathLessThan(String value) {
            addCriterion("SUMMARY_FILE_PATH <", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathLessThanOrEqualTo(String value) {
            addCriterion("SUMMARY_FILE_PATH <=", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathLike(String value) {
            addCriterion("SUMMARY_FILE_PATH like", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathNotLike(String value) {
            addCriterion("SUMMARY_FILE_PATH not like", value, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathIn(List<String> values) {
            addCriterion("SUMMARY_FILE_PATH in", values, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathNotIn(List<String> values) {
            addCriterion("SUMMARY_FILE_PATH not in", values, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathBetween(String value1, String value2) {
            addCriterion("SUMMARY_FILE_PATH between", value1, value2, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andSummaryFilePathNotBetween(String value1, String value2) {
            addCriterion("SUMMARY_FILE_PATH not between", value1, value2, "summaryFilePath");
            return (Criteria) this;
        }

        public Criteria andNewPositionIsNull() {
            addCriterion("NEW_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andNewPositionIsNotNull() {
            addCriterion("NEW_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andNewPositionEqualTo(String value) {
            addCriterion("NEW_POSITION =", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotEqualTo(String value) {
            addCriterion("NEW_POSITION <>", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionGreaterThan(String value) {
            addCriterion("NEW_POSITION >", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionGreaterThanOrEqualTo(String value) {
            addCriterion("NEW_POSITION >=", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionLessThan(String value) {
            addCriterion("NEW_POSITION <", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionLessThanOrEqualTo(String value) {
            addCriterion("NEW_POSITION <=", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionLike(String value) {
            addCriterion("NEW_POSITION like", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotLike(String value) {
            addCriterion("NEW_POSITION not like", value, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionIn(List<String> values) {
            addCriterion("NEW_POSITION in", values, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotIn(List<String> values) {
            addCriterion("NEW_POSITION not in", values, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionBetween(String value1, String value2) {
            addCriterion("NEW_POSITION between", value1, value2, "newPosition");
            return (Criteria) this;
        }

        public Criteria andNewPositionNotBetween(String value1, String value2) {
            addCriterion("NEW_POSITION not between", value1, value2, "newPosition");
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