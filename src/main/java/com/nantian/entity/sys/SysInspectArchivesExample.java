package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysInspectArchivesExample {
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
    public SysInspectArchivesExample() {
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

        public Criteria andInspectTimeIsNull() {
            addCriterion("INSPECT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIsNotNull() {
            addCriterion("INSPECT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInspectTimeEqualTo(Date value) {
            addCriterion("INSPECT_TIME =", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotEqualTo(Date value) {
            addCriterion("INSPECT_TIME <>", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThan(Date value) {
            addCriterion("INSPECT_TIME >", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("INSPECT_TIME >=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThan(Date value) {
            addCriterion("INSPECT_TIME <", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeLessThanOrEqualTo(Date value) {
            addCriterion("INSPECT_TIME <=", value, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeIn(List<Date> values) {
            addCriterion("INSPECT_TIME in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotIn(List<Date> values) {
            addCriterion("INSPECT_TIME not in", values, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeBetween(Date value1, Date value2) {
            addCriterion("INSPECT_TIME between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectTimeNotBetween(Date value1, Date value2) {
            addCriterion("INSPECT_TIME not between", value1, value2, "inspectTime");
            return (Criteria) this;
        }

        public Criteria andInspectProblemIsNull() {
            addCriterion("INSPECT_PROBLEM is null");
            return (Criteria) this;
        }

        public Criteria andInspectProblemIsNotNull() {
            addCriterion("INSPECT_PROBLEM is not null");
            return (Criteria) this;
        }

        public Criteria andInspectProblemEqualTo(String value) {
            addCriterion("INSPECT_PROBLEM =", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemNotEqualTo(String value) {
            addCriterion("INSPECT_PROBLEM <>", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemGreaterThan(String value) {
            addCriterion("INSPECT_PROBLEM >", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECT_PROBLEM >=", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemLessThan(String value) {
            addCriterion("INSPECT_PROBLEM <", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemLessThanOrEqualTo(String value) {
            addCriterion("INSPECT_PROBLEM <=", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemLike(String value) {
            addCriterion("INSPECT_PROBLEM like", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemNotLike(String value) {
            addCriterion("INSPECT_PROBLEM not like", value, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemIn(List<String> values) {
            addCriterion("INSPECT_PROBLEM in", values, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemNotIn(List<String> values) {
            addCriterion("INSPECT_PROBLEM not in", values, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemBetween(String value1, String value2) {
            addCriterion("INSPECT_PROBLEM between", value1, value2, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectProblemNotBetween(String value1, String value2) {
            addCriterion("INSPECT_PROBLEM not between", value1, value2, "inspectProblem");
            return (Criteria) this;
        }

        public Criteria andInspectRecordIsNull() {
            addCriterion("INSPECT_RECORD is null");
            return (Criteria) this;
        }

        public Criteria andInspectRecordIsNotNull() {
            addCriterion("INSPECT_RECORD is not null");
            return (Criteria) this;
        }

        public Criteria andInspectRecordEqualTo(String value) {
            addCriterion("INSPECT_RECORD =", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordNotEqualTo(String value) {
            addCriterion("INSPECT_RECORD <>", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordGreaterThan(String value) {
            addCriterion("INSPECT_RECORD >", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECT_RECORD >=", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordLessThan(String value) {
            addCriterion("INSPECT_RECORD <", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordLessThanOrEqualTo(String value) {
            addCriterion("INSPECT_RECORD <=", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordLike(String value) {
            addCriterion("INSPECT_RECORD like", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordNotLike(String value) {
            addCriterion("INSPECT_RECORD not like", value, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordIn(List<String> values) {
            addCriterion("INSPECT_RECORD in", values, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordNotIn(List<String> values) {
            addCriterion("INSPECT_RECORD not in", values, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordBetween(String value1, String value2) {
            addCriterion("INSPECT_RECORD between", value1, value2, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andInspectRecordNotBetween(String value1, String value2) {
            addCriterion("INSPECT_RECORD not between", value1, value2, "inspectRecord");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedIsNull() {
            addCriterion("REVIEW_IDENTIFIED is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedIsNotNull() {
            addCriterion("REVIEW_IDENTIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedEqualTo(String value) {
            addCriterion("REVIEW_IDENTIFIED =", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedNotEqualTo(String value) {
            addCriterion("REVIEW_IDENTIFIED <>", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedGreaterThan(String value) {
            addCriterion("REVIEW_IDENTIFIED >", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedGreaterThanOrEqualTo(String value) {
            addCriterion("REVIEW_IDENTIFIED >=", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedLessThan(String value) {
            addCriterion("REVIEW_IDENTIFIED <", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedLessThanOrEqualTo(String value) {
            addCriterion("REVIEW_IDENTIFIED <=", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedLike(String value) {
            addCriterion("REVIEW_IDENTIFIED like", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedNotLike(String value) {
            addCriterion("REVIEW_IDENTIFIED not like", value, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedIn(List<String> values) {
            addCriterion("REVIEW_IDENTIFIED in", values, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedNotIn(List<String> values) {
            addCriterion("REVIEW_IDENTIFIED not in", values, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedBetween(String value1, String value2) {
            addCriterion("REVIEW_IDENTIFIED between", value1, value2, "reviewIdentified");
            return (Criteria) this;
        }

        public Criteria andReviewIdentifiedNotBetween(String value1, String value2) {
            addCriterion("REVIEW_IDENTIFIED not between", value1, value2, "reviewIdentified");
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