package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUnitRecommendedExample {
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
    public SysUnitRecommendedExample() {
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

        public Criteria andCandidateUnitIsNull() {
            addCriterion("CANDIDATE_UNIT is null");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitIsNotNull() {
            addCriterion("CANDIDATE_UNIT is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitEqualTo(String value) {
            addCriterion("CANDIDATE_UNIT =", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitNotEqualTo(String value) {
            addCriterion("CANDIDATE_UNIT <>", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitGreaterThan(String value) {
            addCriterion("CANDIDATE_UNIT >", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_UNIT >=", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitLessThan(String value) {
            addCriterion("CANDIDATE_UNIT <", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_UNIT <=", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitLike(String value) {
            addCriterion("CANDIDATE_UNIT like", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitNotLike(String value) {
            addCriterion("CANDIDATE_UNIT not like", value, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitIn(List<String> values) {
            addCriterion("CANDIDATE_UNIT in", values, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitNotIn(List<String> values) {
            addCriterion("CANDIDATE_UNIT not in", values, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitBetween(String value1, String value2) {
            addCriterion("CANDIDATE_UNIT between", value1, value2, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidateUnitNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_UNIT not between", value1, value2, "candidateUnit");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionIsNull() {
            addCriterion("CANDIDATE_POSITION is null");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionIsNotNull() {
            addCriterion("CANDIDATE_POSITION is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION =", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionNotEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION <>", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionGreaterThan(String value) {
            addCriterion("CANDIDATE_POSITION >", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION >=", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLessThan(String value) {
            addCriterion("CANDIDATE_POSITION <", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION <=", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLike(String value) {
            addCriterion("CANDIDATE_POSITION like", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionNotLike(String value) {
            addCriterion("CANDIDATE_POSITION not like", value, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionIn(List<String> values) {
            addCriterion("CANDIDATE_POSITION in", values, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionNotIn(List<String> values) {
            addCriterion("CANDIDATE_POSITION not in", values, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionBetween(String value1, String value2) {
            addCriterion("CANDIDATE_POSITION between", value1, value2, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_POSITION not between", value1, value2, "candidatePosition");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialIsNull() {
            addCriterion("UNIT_RECOMMENDED_MATERIAL is null");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialIsNotNull() {
            addCriterion("UNIT_RECOMMENDED_MATERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialEqualTo(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL =", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialNotEqualTo(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL <>", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialGreaterThan(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL >", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL >=", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialLessThan(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL <", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialLessThanOrEqualTo(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL <=", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialLike(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL like", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialNotLike(String value) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL not like", value, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialIn(List<String> values) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL in", values, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialNotIn(List<String> values) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL not in", values, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialBetween(String value1, String value2) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL between", value1, value2, "unitRecommendedMaterial");
            return (Criteria) this;
        }

        public Criteria andUnitRecommendedMaterialNotBetween(String value1, String value2) {
            addCriterion("UNIT_RECOMMENDED_MATERIAL not between", value1, value2, "unitRecommendedMaterial");
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

        public Criteria andCandidatePositionLevelIsNull() {
            addCriterion("CANDIDATE_POSITION_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelIsNotNull() {
            addCriterion("CANDIDATE_POSITION_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL =", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelNotEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL <>", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelGreaterThan(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL >", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelGreaterThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL >=", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelLessThan(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL <", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelLessThanOrEqualTo(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL <=", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelLike(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL like", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelNotLike(String value) {
            addCriterion("CANDIDATE_POSITION_LEVEL not like", value, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelIn(List<String> values) {
            addCriterion("CANDIDATE_POSITION_LEVEL in", values, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelNotIn(List<String> values) {
            addCriterion("CANDIDATE_POSITION_LEVEL not in", values, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelBetween(String value1, String value2) {
            addCriterion("CANDIDATE_POSITION_LEVEL between", value1, value2, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andCandidatePositionLevelNotBetween(String value1, String value2) {
            addCriterion("CANDIDATE_POSITION_LEVEL not between", value1, value2, "candidatePositionLevel");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNull() {
            addCriterion("ISFINISH is null");
            return (Criteria) this;
        }

        public Criteria andIsfinishIsNotNull() {
            addCriterion("ISFINISH is not null");
            return (Criteria) this;
        }

        public Criteria andIsfinishEqualTo(String value) {
            addCriterion("ISFINISH =", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotEqualTo(String value) {
            addCriterion("ISFINISH <>", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThan(String value) {
            addCriterion("ISFINISH >", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishGreaterThanOrEqualTo(String value) {
            addCriterion("ISFINISH >=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThan(String value) {
            addCriterion("ISFINISH <", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLessThanOrEqualTo(String value) {
            addCriterion("ISFINISH <=", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishLike(String value) {
            addCriterion("ISFINISH like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotLike(String value) {
            addCriterion("ISFINISH not like", value, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishIn(List<String> values) {
            addCriterion("ISFINISH in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotIn(List<String> values) {
            addCriterion("ISFINISH not in", values, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishBetween(String value1, String value2) {
            addCriterion("ISFINISH between", value1, value2, "isfinish");
            return (Criteria) this;
        }

        public Criteria andIsfinishNotBetween(String value1, String value2) {
            addCriterion("ISFINISH not between", value1, value2, "isfinish");
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