package com.nantian.entity.sys;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysCandidateInfoExample {
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
    public SysCandidateInfoExample() {
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

        public Criteria andCandidateTypeIsNull() {
            addCriterion("CANDIDATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeIsNotNull() {
            addCriterion("CANDIDATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeEqualTo(String value) {
            addCriterion("CANDIDATE_TYPE =", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeNotEqualTo(String value) {
            addCriterion("CANDIDATE_TYPE <>", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeGreaterThan(String value) {
            addCriterion("CANDIDATE_TYPE >", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_TYPE >=", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeLessThan(String value) {
            addCriterion("CANDIDATE_TYPE <", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_TYPE <=", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeLike(String value) {
            addCriterion("CANDIDATE_TYPE like", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeNotLike(String value) {
            addCriterion("CANDIDATE_TYPE not like", value, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeIn(List<String> values) {
            addCriterion("CANDIDATE_TYPE in", values, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeNotIn(List<String> values) {
            addCriterion("CANDIDATE_TYPE not in", values, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeBetween(String value1, String value2) {
            addCriterion("CANDIDATE_TYPE between", value1, value2, "candidateType");
            return (Criteria) this;
        }

        public Criteria andCandidateTypeNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_TYPE not between", value1, value2, "candidateType");
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

        public Criteria andSexIsNull() {
            addCriterion("SEX is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("SEX is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("SEX =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("SEX <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("SEX >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("SEX >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("SEX <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("SEX <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("SEX like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("SEX not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("SEX in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("SEX not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("SEX between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("SEX not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(String value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(String value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(String value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(String value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(String value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLike(String value) {
            addCriterion("BIRTHDAY like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotLike(String value) {
            addCriterion("BIRTHDAY not like", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<String> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<String> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(String value1, String value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(String value1, String value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNull() {
            addCriterion("DEPARTMENT is null");
            return (Criteria) this;
        }

        public Criteria andDepartmentIsNotNull() {
            addCriterion("DEPARTMENT is not null");
            return (Criteria) this;
        }

        public Criteria andDepartmentEqualTo(String value) {
            addCriterion("DEPARTMENT =", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotEqualTo(String value) {
            addCriterion("DEPARTMENT <>", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThan(String value) {
            addCriterion("DEPARTMENT >", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentGreaterThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT >=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThan(String value) {
            addCriterion("DEPARTMENT <", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLessThanOrEqualTo(String value) {
            addCriterion("DEPARTMENT <=", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentLike(String value) {
            addCriterion("DEPARTMENT like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotLike(String value) {
            addCriterion("DEPARTMENT not like", value, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentIn(List<String> values) {
            addCriterion("DEPARTMENT in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotIn(List<String> values) {
            addCriterion("DEPARTMENT not in", values, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentBetween(String value1, String value2) {
            addCriterion("DEPARTMENT between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andDepartmentNotBetween(String value1, String value2) {
            addCriterion("DEPARTMENT not between", value1, value2, "department");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNull() {
            addCriterion("ORGANIZATION is null");
            return (Criteria) this;
        }

        public Criteria andOrganizationIsNotNull() {
            addCriterion("ORGANIZATION is not null");
            return (Criteria) this;
        }

        public Criteria andOrganizationEqualTo(String value) {
            addCriterion("ORGANIZATION =", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotEqualTo(String value) {
            addCriterion("ORGANIZATION <>", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThan(String value) {
            addCriterion("ORGANIZATION >", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationGreaterThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION >=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThan(String value) {
            addCriterion("ORGANIZATION <", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLessThanOrEqualTo(String value) {
            addCriterion("ORGANIZATION <=", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationLike(String value) {
            addCriterion("ORGANIZATION like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotLike(String value) {
            addCriterion("ORGANIZATION not like", value, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationIn(List<String> values) {
            addCriterion("ORGANIZATION in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotIn(List<String> values) {
            addCriterion("ORGANIZATION not in", values, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationBetween(String value1, String value2) {
            addCriterion("ORGANIZATION between", value1, value2, "organization");
            return (Criteria) this;
        }

        public Criteria andOrganizationNotBetween(String value1, String value2) {
            addCriterion("ORGANIZATION not between", value1, value2, "organization");
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

        public Criteria andApprovalTypeIsNull() {
            addCriterion("APPROVAL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIsNotNull() {
            addCriterion("APPROVAL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeEqualTo(String value) {
            addCriterion("APPROVAL_TYPE =", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotEqualTo(String value) {
            addCriterion("APPROVAL_TYPE <>", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeGreaterThan(String value) {
            addCriterion("APPROVAL_TYPE >", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeGreaterThanOrEqualTo(String value) {
            addCriterion("APPROVAL_TYPE >=", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLessThan(String value) {
            addCriterion("APPROVAL_TYPE <", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLessThanOrEqualTo(String value) {
            addCriterion("APPROVAL_TYPE <=", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeLike(String value) {
            addCriterion("APPROVAL_TYPE like", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotLike(String value) {
            addCriterion("APPROVAL_TYPE not like", value, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeIn(List<String> values) {
            addCriterion("APPROVAL_TYPE in", values, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotIn(List<String> values) {
            addCriterion("APPROVAL_TYPE not in", values, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeBetween(String value1, String value2) {
            addCriterion("APPROVAL_TYPE between", value1, value2, "approvalType");
            return (Criteria) this;
        }

        public Criteria andApprovalTypeNotBetween(String value1, String value2) {
            addCriterion("APPROVAL_TYPE not between", value1, value2, "approvalType");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNull() {
            addCriterion("REPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andReplyDateIsNotNull() {
            addCriterion("REPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyDateEqualTo(Date value) {
            addCriterion("REPLY_DATE =", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotEqualTo(Date value) {
            addCriterion("REPLY_DATE <>", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThan(Date value) {
            addCriterion("REPLY_DATE >", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("REPLY_DATE >=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThan(Date value) {
            addCriterion("REPLY_DATE <", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateLessThanOrEqualTo(Date value) {
            addCriterion("REPLY_DATE <=", value, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateIn(List<Date> values) {
            addCriterion("REPLY_DATE in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotIn(List<Date> values) {
            addCriterion("REPLY_DATE not in", values, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateBetween(Date value1, Date value2) {
            addCriterion("REPLY_DATE between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andReplyDateNotBetween(Date value1, Date value2) {
            addCriterion("REPLY_DATE not between", value1, value2, "replyDate");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberIsNull() {
            addCriterion("CANDIDATE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberIsNotNull() {
            addCriterion("CANDIDATE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberEqualTo(String value) {
            addCriterion("CANDIDATE_NUMBER =", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotEqualTo(String value) {
            addCriterion("CANDIDATE_NUMBER <>", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberGreaterThan(String value) {
            addCriterion("CANDIDATE_NUMBER >", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_NUMBER >=", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberLessThan(String value) {
            addCriterion("CANDIDATE_NUMBER <", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_NUMBER <=", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberLike(String value) {
            addCriterion("CANDIDATE_NUMBER like", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotLike(String value) {
            addCriterion("CANDIDATE_NUMBER not like", value, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberIn(List<String> values) {
            addCriterion("CANDIDATE_NUMBER in", values, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotIn(List<String> values) {
            addCriterion("CANDIDATE_NUMBER not in", values, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberBetween(String value1, String value2) {
            addCriterion("CANDIDATE_NUMBER between", value1, value2, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andCandidateNumberNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_NUMBER not between", value1, value2, "candidateNumber");
            return (Criteria) this;
        }

        public Criteria andWrittenDateIsNull() {
            addCriterion("WRITTEN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andWrittenDateIsNotNull() {
            addCriterion("WRITTEN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andWrittenDateEqualTo(Date value) {
            addCriterion("WRITTEN_DATE =", value, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateNotEqualTo(Date value) {
            addCriterion("WRITTEN_DATE <>", value, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateGreaterThan(Date value) {
            addCriterion("WRITTEN_DATE >", value, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateGreaterThanOrEqualTo(Date value) {
            addCriterion("WRITTEN_DATE >=", value, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateLessThan(Date value) {
            addCriterion("WRITTEN_DATE <", value, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateLessThanOrEqualTo(Date value) {
            addCriterion("WRITTEN_DATE <=", value, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateIn(List<Date> values) {
            addCriterion("WRITTEN_DATE in", values, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateNotIn(List<Date> values) {
            addCriterion("WRITTEN_DATE not in", values, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateBetween(Date value1, Date value2) {
            addCriterion("WRITTEN_DATE between", value1, value2, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenDateNotBetween(Date value1, Date value2) {
            addCriterion("WRITTEN_DATE not between", value1, value2, "writtenDate");
            return (Criteria) this;
        }

        public Criteria andWrittenResultIsNull() {
            addCriterion("WRITTEN_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andWrittenResultIsNotNull() {
            addCriterion("WRITTEN_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andWrittenResultEqualTo(String value) {
            addCriterion("WRITTEN_RESULT =", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultNotEqualTo(String value) {
            addCriterion("WRITTEN_RESULT <>", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultGreaterThan(String value) {
            addCriterion("WRITTEN_RESULT >", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultGreaterThanOrEqualTo(String value) {
            addCriterion("WRITTEN_RESULT >=", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultLessThan(String value) {
            addCriterion("WRITTEN_RESULT <", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultLessThanOrEqualTo(String value) {
            addCriterion("WRITTEN_RESULT <=", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultLike(String value) {
            addCriterion("WRITTEN_RESULT like", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultNotLike(String value) {
            addCriterion("WRITTEN_RESULT not like", value, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultIn(List<String> values) {
            addCriterion("WRITTEN_RESULT in", values, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultNotIn(List<String> values) {
            addCriterion("WRITTEN_RESULT not in", values, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultBetween(String value1, String value2) {
            addCriterion("WRITTEN_RESULT between", value1, value2, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenResultNotBetween(String value1, String value2) {
            addCriterion("WRITTEN_RESULT not between", value1, value2, "writtenResult");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingIsNull() {
            addCriterion("WRITTEN_RANKING is null");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingIsNotNull() {
            addCriterion("WRITTEN_RANKING is not null");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingEqualTo(String value) {
            addCriterion("WRITTEN_RANKING =", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingNotEqualTo(String value) {
            addCriterion("WRITTEN_RANKING <>", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingGreaterThan(String value) {
            addCriterion("WRITTEN_RANKING >", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingGreaterThanOrEqualTo(String value) {
            addCriterion("WRITTEN_RANKING >=", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingLessThan(String value) {
            addCriterion("WRITTEN_RANKING <", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingLessThanOrEqualTo(String value) {
            addCriterion("WRITTEN_RANKING <=", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingLike(String value) {
            addCriterion("WRITTEN_RANKING like", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingNotLike(String value) {
            addCriterion("WRITTEN_RANKING not like", value, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingIn(List<String> values) {
            addCriterion("WRITTEN_RANKING in", values, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingNotIn(List<String> values) {
            addCriterion("WRITTEN_RANKING not in", values, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingBetween(String value1, String value2) {
            addCriterion("WRITTEN_RANKING between", value1, value2, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andWrittenRankingNotBetween(String value1, String value2) {
            addCriterion("WRITTEN_RANKING not between", value1, value2, "writtenRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewDateIsNull() {
            addCriterion("INTERVIEW_DATE is null");
            return (Criteria) this;
        }

        public Criteria andInterviewDateIsNotNull() {
            addCriterion("INTERVIEW_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewDateEqualTo(Date value) {
            addCriterion("INTERVIEW_DATE =", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateNotEqualTo(Date value) {
            addCriterion("INTERVIEW_DATE <>", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateGreaterThan(Date value) {
            addCriterion("INTERVIEW_DATE >", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateGreaterThanOrEqualTo(Date value) {
            addCriterion("INTERVIEW_DATE >=", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateLessThan(Date value) {
            addCriterion("INTERVIEW_DATE <", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateLessThanOrEqualTo(Date value) {
            addCriterion("INTERVIEW_DATE <=", value, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateIn(List<Date> values) {
            addCriterion("INTERVIEW_DATE in", values, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateNotIn(List<Date> values) {
            addCriterion("INTERVIEW_DATE not in", values, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateBetween(Date value1, Date value2) {
            addCriterion("INTERVIEW_DATE between", value1, value2, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewDateNotBetween(Date value1, Date value2) {
            addCriterion("INTERVIEW_DATE not between", value1, value2, "interviewDate");
            return (Criteria) this;
        }

        public Criteria andInterviewResultIsNull() {
            addCriterion("INTERVIEW_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andInterviewResultIsNotNull() {
            addCriterion("INTERVIEW_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewResultEqualTo(String value) {
            addCriterion("INTERVIEW_RESULT =", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotEqualTo(String value) {
            addCriterion("INTERVIEW_RESULT <>", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultGreaterThan(String value) {
            addCriterion("INTERVIEW_RESULT >", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVIEW_RESULT >=", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultLessThan(String value) {
            addCriterion("INTERVIEW_RESULT <", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultLessThanOrEqualTo(String value) {
            addCriterion("INTERVIEW_RESULT <=", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultLike(String value) {
            addCriterion("INTERVIEW_RESULT like", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotLike(String value) {
            addCriterion("INTERVIEW_RESULT not like", value, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultIn(List<String> values) {
            addCriterion("INTERVIEW_RESULT in", values, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotIn(List<String> values) {
            addCriterion("INTERVIEW_RESULT not in", values, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultBetween(String value1, String value2) {
            addCriterion("INTERVIEW_RESULT between", value1, value2, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewResultNotBetween(String value1, String value2) {
            addCriterion("INTERVIEW_RESULT not between", value1, value2, "interviewResult");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingIsNull() {
            addCriterion("INTERVIEW_RANKING is null");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingIsNotNull() {
            addCriterion("INTERVIEW_RANKING is not null");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingEqualTo(String value) {
            addCriterion("INTERVIEW_RANKING =", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingNotEqualTo(String value) {
            addCriterion("INTERVIEW_RANKING <>", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingGreaterThan(String value) {
            addCriterion("INTERVIEW_RANKING >", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingGreaterThanOrEqualTo(String value) {
            addCriterion("INTERVIEW_RANKING >=", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingLessThan(String value) {
            addCriterion("INTERVIEW_RANKING <", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingLessThanOrEqualTo(String value) {
            addCriterion("INTERVIEW_RANKING <=", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingLike(String value) {
            addCriterion("INTERVIEW_RANKING like", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingNotLike(String value) {
            addCriterion("INTERVIEW_RANKING not like", value, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingIn(List<String> values) {
            addCriterion("INTERVIEW_RANKING in", values, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingNotIn(List<String> values) {
            addCriterion("INTERVIEW_RANKING not in", values, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingBetween(String value1, String value2) {
            addCriterion("INTERVIEW_RANKING between", value1, value2, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andInterviewRankingNotBetween(String value1, String value2) {
            addCriterion("INTERVIEW_RANKING not between", value1, value2, "interviewRanking");
            return (Criteria) this;
        }

        public Criteria andThesisDateIsNull() {
            addCriterion("THESIS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andThesisDateIsNotNull() {
            addCriterion("THESIS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andThesisDateEqualTo(Date value) {
            addCriterion("THESIS_DATE =", value, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateNotEqualTo(Date value) {
            addCriterion("THESIS_DATE <>", value, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateGreaterThan(Date value) {
            addCriterion("THESIS_DATE >", value, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateGreaterThanOrEqualTo(Date value) {
            addCriterion("THESIS_DATE >=", value, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateLessThan(Date value) {
            addCriterion("THESIS_DATE <", value, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateLessThanOrEqualTo(Date value) {
            addCriterion("THESIS_DATE <=", value, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateIn(List<Date> values) {
            addCriterion("THESIS_DATE in", values, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateNotIn(List<Date> values) {
            addCriterion("THESIS_DATE not in", values, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateBetween(Date value1, Date value2) {
            addCriterion("THESIS_DATE between", value1, value2, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisDateNotBetween(Date value1, Date value2) {
            addCriterion("THESIS_DATE not between", value1, value2, "thesisDate");
            return (Criteria) this;
        }

        public Criteria andThesisResultIsNull() {
            addCriterion("THESIS_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andThesisResultIsNotNull() {
            addCriterion("THESIS_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andThesisResultEqualTo(String value) {
            addCriterion("THESIS_RESULT =", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultNotEqualTo(String value) {
            addCriterion("THESIS_RESULT <>", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultGreaterThan(String value) {
            addCriterion("THESIS_RESULT >", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultGreaterThanOrEqualTo(String value) {
            addCriterion("THESIS_RESULT >=", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultLessThan(String value) {
            addCriterion("THESIS_RESULT <", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultLessThanOrEqualTo(String value) {
            addCriterion("THESIS_RESULT <=", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultLike(String value) {
            addCriterion("THESIS_RESULT like", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultNotLike(String value) {
            addCriterion("THESIS_RESULT not like", value, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultIn(List<String> values) {
            addCriterion("THESIS_RESULT in", values, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultNotIn(List<String> values) {
            addCriterion("THESIS_RESULT not in", values, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultBetween(String value1, String value2) {
            addCriterion("THESIS_RESULT between", value1, value2, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisResultNotBetween(String value1, String value2) {
            addCriterion("THESIS_RESULT not between", value1, value2, "thesisResult");
            return (Criteria) this;
        }

        public Criteria andThesisRankingIsNull() {
            addCriterion("THESIS_RANKING is null");
            return (Criteria) this;
        }

        public Criteria andThesisRankingIsNotNull() {
            addCriterion("THESIS_RANKING is not null");
            return (Criteria) this;
        }

        public Criteria andThesisRankingEqualTo(String value) {
            addCriterion("THESIS_RANKING =", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingNotEqualTo(String value) {
            addCriterion("THESIS_RANKING <>", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingGreaterThan(String value) {
            addCriterion("THESIS_RANKING >", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingGreaterThanOrEqualTo(String value) {
            addCriterion("THESIS_RANKING >=", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingLessThan(String value) {
            addCriterion("THESIS_RANKING <", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingLessThanOrEqualTo(String value) {
            addCriterion("THESIS_RANKING <=", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingLike(String value) {
            addCriterion("THESIS_RANKING like", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingNotLike(String value) {
            addCriterion("THESIS_RANKING not like", value, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingIn(List<String> values) {
            addCriterion("THESIS_RANKING in", values, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingNotIn(List<String> values) {
            addCriterion("THESIS_RANKING not in", values, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingBetween(String value1, String value2) {
            addCriterion("THESIS_RANKING between", value1, value2, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andThesisRankingNotBetween(String value1, String value2) {
            addCriterion("THESIS_RANKING not between", value1, value2, "thesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultIsNull() {
            addCriterion("SYNTHESIS_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultIsNotNull() {
            addCriterion("SYNTHESIS_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultEqualTo(String value) {
            addCriterion("SYNTHESIS_RESULT =", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultNotEqualTo(String value) {
            addCriterion("SYNTHESIS_RESULT <>", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultGreaterThan(String value) {
            addCriterion("SYNTHESIS_RESULT >", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultGreaterThanOrEqualTo(String value) {
            addCriterion("SYNTHESIS_RESULT >=", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultLessThan(String value) {
            addCriterion("SYNTHESIS_RESULT <", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultLessThanOrEqualTo(String value) {
            addCriterion("SYNTHESIS_RESULT <=", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultLike(String value) {
            addCriterion("SYNTHESIS_RESULT like", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultNotLike(String value) {
            addCriterion("SYNTHESIS_RESULT not like", value, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultIn(List<String> values) {
            addCriterion("SYNTHESIS_RESULT in", values, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultNotIn(List<String> values) {
            addCriterion("SYNTHESIS_RESULT not in", values, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultBetween(String value1, String value2) {
            addCriterion("SYNTHESIS_RESULT between", value1, value2, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisResultNotBetween(String value1, String value2) {
            addCriterion("SYNTHESIS_RESULT not between", value1, value2, "synthesisResult");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingIsNull() {
            addCriterion("SYNTHESIS_RANKING is null");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingIsNotNull() {
            addCriterion("SYNTHESIS_RANKING is not null");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingEqualTo(String value) {
            addCriterion("SYNTHESIS_RANKING =", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingNotEqualTo(String value) {
            addCriterion("SYNTHESIS_RANKING <>", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingGreaterThan(String value) {
            addCriterion("SYNTHESIS_RANKING >", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingGreaterThanOrEqualTo(String value) {
            addCriterion("SYNTHESIS_RANKING >=", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingLessThan(String value) {
            addCriterion("SYNTHESIS_RANKING <", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingLessThanOrEqualTo(String value) {
            addCriterion("SYNTHESIS_RANKING <=", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingLike(String value) {
            addCriterion("SYNTHESIS_RANKING like", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingNotLike(String value) {
            addCriterion("SYNTHESIS_RANKING not like", value, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingIn(List<String> values) {
            addCriterion("SYNTHESIS_RANKING in", values, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingNotIn(List<String> values) {
            addCriterion("SYNTHESIS_RANKING not in", values, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingBetween(String value1, String value2) {
            addCriterion("SYNTHESIS_RANKING between", value1, value2, "synthesisRanking");
            return (Criteria) this;
        }

        public Criteria andSynthesisRankingNotBetween(String value1, String value2) {
            addCriterion("SYNTHESIS_RANKING not between", value1, value2, "synthesisRanking");
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

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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