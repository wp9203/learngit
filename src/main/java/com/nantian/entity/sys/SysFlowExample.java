package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysFlowExample {
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
    public SysFlowExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("USERID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("USERID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Long value) {
            addCriterion("USERID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Long value) {
            addCriterion("USERID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Long value) {
            addCriterion("USERID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Long value) {
            addCriterion("USERID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Long value) {
            addCriterion("USERID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Long value) {
            addCriterion("USERID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Long> values) {
            addCriterion("USERID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Long> values) {
            addCriterion("USERID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Long value1, Long value2) {
            addCriterion("USERID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Long value1, Long value2) {
            addCriterion("USERID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("USERNAME is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("USERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("USERNAME =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("USERNAME <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("USERNAME >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("USERNAME >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("USERNAME <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("USERNAME <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("USERNAME like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("USERNAME not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("USERNAME in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("USERNAME not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("USERNAME between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("USERNAME not between", value1, value2, "username");
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

        public Criteria andStep1IsNull() {
            addCriterion("STEP1 is null");
            return (Criteria) this;
        }

        public Criteria andStep1IsNotNull() {
            addCriterion("STEP1 is not null");
            return (Criteria) this;
        }

        public Criteria andStep1EqualTo(String value) {
            addCriterion("STEP1 =", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1NotEqualTo(String value) {
            addCriterion("STEP1 <>", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1GreaterThan(String value) {
            addCriterion("STEP1 >", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1GreaterThanOrEqualTo(String value) {
            addCriterion("STEP1 >=", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1LessThan(String value) {
            addCriterion("STEP1 <", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1LessThanOrEqualTo(String value) {
            addCriterion("STEP1 <=", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1Like(String value) {
            addCriterion("STEP1 like", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1NotLike(String value) {
            addCriterion("STEP1 not like", value, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1In(List<String> values) {
            addCriterion("STEP1 in", values, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1NotIn(List<String> values) {
            addCriterion("STEP1 not in", values, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1Between(String value1, String value2) {
            addCriterion("STEP1 between", value1, value2, "step1");
            return (Criteria) this;
        }

        public Criteria andStep1NotBetween(String value1, String value2) {
            addCriterion("STEP1 not between", value1, value2, "step1");
            return (Criteria) this;
        }

        public Criteria andUnitReIdIsNull() {
            addCriterion("UNIT_RE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnitReIdIsNotNull() {
            addCriterion("UNIT_RE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnitReIdEqualTo(Long value) {
            addCriterion("UNIT_RE_ID =", value, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdNotEqualTo(Long value) {
            addCriterion("UNIT_RE_ID <>", value, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdGreaterThan(Long value) {
            addCriterion("UNIT_RE_ID >", value, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdGreaterThanOrEqualTo(Long value) {
            addCriterion("UNIT_RE_ID >=", value, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdLessThan(Long value) {
            addCriterion("UNIT_RE_ID <", value, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdLessThanOrEqualTo(Long value) {
            addCriterion("UNIT_RE_ID <=", value, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdIn(List<Long> values) {
            addCriterion("UNIT_RE_ID in", values, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdNotIn(List<Long> values) {
            addCriterion("UNIT_RE_ID not in", values, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdBetween(Long value1, Long value2) {
            addCriterion("UNIT_RE_ID between", value1, value2, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReIdNotBetween(Long value1, Long value2) {
            addCriterion("UNIT_RE_ID not between", value1, value2, "unitReId");
            return (Criteria) this;
        }

        public Criteria andUnitReResultIsNull() {
            addCriterion("UNIT_RE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andUnitReResultIsNotNull() {
            addCriterion("UNIT_RE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andUnitReResultEqualTo(String value) {
            addCriterion("UNIT_RE_RESULT =", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultNotEqualTo(String value) {
            addCriterion("UNIT_RE_RESULT <>", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultGreaterThan(String value) {
            addCriterion("UNIT_RE_RESULT >", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultGreaterThanOrEqualTo(String value) {
            addCriterion("UNIT_RE_RESULT >=", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultLessThan(String value) {
            addCriterion("UNIT_RE_RESULT <", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultLessThanOrEqualTo(String value) {
            addCriterion("UNIT_RE_RESULT <=", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultLike(String value) {
            addCriterion("UNIT_RE_RESULT like", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultNotLike(String value) {
            addCriterion("UNIT_RE_RESULT not like", value, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultIn(List<String> values) {
            addCriterion("UNIT_RE_RESULT in", values, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultNotIn(List<String> values) {
            addCriterion("UNIT_RE_RESULT not in", values, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultBetween(String value1, String value2) {
            addCriterion("UNIT_RE_RESULT between", value1, value2, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andUnitReResultNotBetween(String value1, String value2) {
            addCriterion("UNIT_RE_RESULT not between", value1, value2, "unitReResult");
            return (Criteria) this;
        }

        public Criteria andStep2IsNull() {
            addCriterion("STEP2 is null");
            return (Criteria) this;
        }

        public Criteria andStep2IsNotNull() {
            addCriterion("STEP2 is not null");
            return (Criteria) this;
        }

        public Criteria andStep2EqualTo(String value) {
            addCriterion("STEP2 =", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2NotEqualTo(String value) {
            addCriterion("STEP2 <>", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2GreaterThan(String value) {
            addCriterion("STEP2 >", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2GreaterThanOrEqualTo(String value) {
            addCriterion("STEP2 >=", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2LessThan(String value) {
            addCriterion("STEP2 <", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2LessThanOrEqualTo(String value) {
            addCriterion("STEP2 <=", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2Like(String value) {
            addCriterion("STEP2 like", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2NotLike(String value) {
            addCriterion("STEP2 not like", value, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2In(List<String> values) {
            addCriterion("STEP2 in", values, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2NotIn(List<String> values) {
            addCriterion("STEP2 not in", values, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2Between(String value1, String value2) {
            addCriterion("STEP2 between", value1, value2, "step2");
            return (Criteria) this;
        }

        public Criteria andStep2NotBetween(String value1, String value2) {
            addCriterion("STEP2 not between", value1, value2, "step2");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdIsNull() {
            addCriterion("FIRST_MOTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdIsNotNull() {
            addCriterion("FIRST_MOTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdEqualTo(Long value) {
            addCriterion("FIRST_MOTION_ID =", value, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdNotEqualTo(Long value) {
            addCriterion("FIRST_MOTION_ID <>", value, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdGreaterThan(Long value) {
            addCriterion("FIRST_MOTION_ID >", value, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("FIRST_MOTION_ID >=", value, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdLessThan(Long value) {
            addCriterion("FIRST_MOTION_ID <", value, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdLessThanOrEqualTo(Long value) {
            addCriterion("FIRST_MOTION_ID <=", value, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdIn(List<Long> values) {
            addCriterion("FIRST_MOTION_ID in", values, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdNotIn(List<Long> values) {
            addCriterion("FIRST_MOTION_ID not in", values, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdBetween(Long value1, Long value2) {
            addCriterion("FIRST_MOTION_ID between", value1, value2, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionIdNotBetween(Long value1, Long value2) {
            addCriterion("FIRST_MOTION_ID not between", value1, value2, "firstMotionId");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultIsNull() {
            addCriterion("FIRST_MOTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultIsNotNull() {
            addCriterion("FIRST_MOTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultEqualTo(String value) {
            addCriterion("FIRST_MOTION_RESULT =", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultNotEqualTo(String value) {
            addCriterion("FIRST_MOTION_RESULT <>", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultGreaterThan(String value) {
            addCriterion("FIRST_MOTION_RESULT >", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultGreaterThanOrEqualTo(String value) {
            addCriterion("FIRST_MOTION_RESULT >=", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultLessThan(String value) {
            addCriterion("FIRST_MOTION_RESULT <", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultLessThanOrEqualTo(String value) {
            addCriterion("FIRST_MOTION_RESULT <=", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultLike(String value) {
            addCriterion("FIRST_MOTION_RESULT like", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultNotLike(String value) {
            addCriterion("FIRST_MOTION_RESULT not like", value, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultIn(List<String> values) {
            addCriterion("FIRST_MOTION_RESULT in", values, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultNotIn(List<String> values) {
            addCriterion("FIRST_MOTION_RESULT not in", values, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultBetween(String value1, String value2) {
            addCriterion("FIRST_MOTION_RESULT between", value1, value2, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andFirstMotionResultNotBetween(String value1, String value2) {
            addCriterion("FIRST_MOTION_RESULT not between", value1, value2, "firstMotionResult");
            return (Criteria) this;
        }

        public Criteria andStep3IsNull() {
            addCriterion("STEP3 is null");
            return (Criteria) this;
        }

        public Criteria andStep3IsNotNull() {
            addCriterion("STEP3 is not null");
            return (Criteria) this;
        }

        public Criteria andStep3EqualTo(String value) {
            addCriterion("STEP3 =", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3NotEqualTo(String value) {
            addCriterion("STEP3 <>", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3GreaterThan(String value) {
            addCriterion("STEP3 >", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3GreaterThanOrEqualTo(String value) {
            addCriterion("STEP3 >=", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3LessThan(String value) {
            addCriterion("STEP3 <", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3LessThanOrEqualTo(String value) {
            addCriterion("STEP3 <=", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3Like(String value) {
            addCriterion("STEP3 like", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3NotLike(String value) {
            addCriterion("STEP3 not like", value, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3In(List<String> values) {
            addCriterion("STEP3 in", values, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3NotIn(List<String> values) {
            addCriterion("STEP3 not in", values, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3Between(String value1, String value2) {
            addCriterion("STEP3 between", value1, value2, "step3");
            return (Criteria) this;
        }

        public Criteria andStep3NotBetween(String value1, String value2) {
            addCriterion("STEP3 not between", value1, value2, "step3");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdIsNull() {
            addCriterion("REPORT_BEFORE_IM_ID is null");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdIsNotNull() {
            addCriterion("REPORT_BEFORE_IM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdEqualTo(Long value) {
            addCriterion("REPORT_BEFORE_IM_ID =", value, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdNotEqualTo(Long value) {
            addCriterion("REPORT_BEFORE_IM_ID <>", value, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdGreaterThan(Long value) {
            addCriterion("REPORT_BEFORE_IM_ID >", value, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdGreaterThanOrEqualTo(Long value) {
            addCriterion("REPORT_BEFORE_IM_ID >=", value, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdLessThan(Long value) {
            addCriterion("REPORT_BEFORE_IM_ID <", value, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdLessThanOrEqualTo(Long value) {
            addCriterion("REPORT_BEFORE_IM_ID <=", value, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdIn(List<Long> values) {
            addCriterion("REPORT_BEFORE_IM_ID in", values, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdNotIn(List<Long> values) {
            addCriterion("REPORT_BEFORE_IM_ID not in", values, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdBetween(Long value1, Long value2) {
            addCriterion("REPORT_BEFORE_IM_ID between", value1, value2, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImIdNotBetween(Long value1, Long value2) {
            addCriterion("REPORT_BEFORE_IM_ID not between", value1, value2, "reportBeforeImId");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultIsNull() {
            addCriterion("REPORT_BEFORE_IM_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultIsNotNull() {
            addCriterion("REPORT_BEFORE_IM_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultEqualTo(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT =", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultNotEqualTo(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT <>", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultGreaterThan(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT >", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultGreaterThanOrEqualTo(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT >=", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultLessThan(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT <", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultLessThanOrEqualTo(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT <=", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultLike(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT like", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultNotLike(String value) {
            addCriterion("REPORT_BEFORE_IM_RESULT not like", value, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultIn(List<String> values) {
            addCriterion("REPORT_BEFORE_IM_RESULT in", values, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultNotIn(List<String> values) {
            addCriterion("REPORT_BEFORE_IM_RESULT not in", values, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultBetween(String value1, String value2) {
            addCriterion("REPORT_BEFORE_IM_RESULT between", value1, value2, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andReportBeforeImResultNotBetween(String value1, String value2) {
            addCriterion("REPORT_BEFORE_IM_RESULT not between", value1, value2, "reportBeforeImResult");
            return (Criteria) this;
        }

        public Criteria andStep4IsNull() {
            addCriterion("STEP4 is null");
            return (Criteria) this;
        }

        public Criteria andStep4IsNotNull() {
            addCriterion("STEP4 is not null");
            return (Criteria) this;
        }

        public Criteria andStep4EqualTo(String value) {
            addCriterion("STEP4 =", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4NotEqualTo(String value) {
            addCriterion("STEP4 <>", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4GreaterThan(String value) {
            addCriterion("STEP4 >", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4GreaterThanOrEqualTo(String value) {
            addCriterion("STEP4 >=", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4LessThan(String value) {
            addCriterion("STEP4 <", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4LessThanOrEqualTo(String value) {
            addCriterion("STEP4 <=", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4Like(String value) {
            addCriterion("STEP4 like", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4NotLike(String value) {
            addCriterion("STEP4 not like", value, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4In(List<String> values) {
            addCriterion("STEP4 in", values, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4NotIn(List<String> values) {
            addCriterion("STEP4 not in", values, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4Between(String value1, String value2) {
            addCriterion("STEP4 between", value1, value2, "step4");
            return (Criteria) this;
        }

        public Criteria andStep4NotBetween(String value1, String value2) {
            addCriterion("STEP4 not between", value1, value2, "step4");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdIsNull() {
            addCriterion("DEMOCRACY_INS_RE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdIsNotNull() {
            addCriterion("DEMOCRACY_INS_RE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdEqualTo(Long value) {
            addCriterion("DEMOCRACY_INS_RE_ID =", value, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdNotEqualTo(Long value) {
            addCriterion("DEMOCRACY_INS_RE_ID <>", value, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdGreaterThan(Long value) {
            addCriterion("DEMOCRACY_INS_RE_ID >", value, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdGreaterThanOrEqualTo(Long value) {
            addCriterion("DEMOCRACY_INS_RE_ID >=", value, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdLessThan(Long value) {
            addCriterion("DEMOCRACY_INS_RE_ID <", value, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdLessThanOrEqualTo(Long value) {
            addCriterion("DEMOCRACY_INS_RE_ID <=", value, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdIn(List<Long> values) {
            addCriterion("DEMOCRACY_INS_RE_ID in", values, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdNotIn(List<Long> values) {
            addCriterion("DEMOCRACY_INS_RE_ID not in", values, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdBetween(Long value1, Long value2) {
            addCriterion("DEMOCRACY_INS_RE_ID between", value1, value2, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReIdNotBetween(Long value1, Long value2) {
            addCriterion("DEMOCRACY_INS_RE_ID not between", value1, value2, "democracyInsReId");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultIsNull() {
            addCriterion("DEMOCRACY_INS_RE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultIsNotNull() {
            addCriterion("DEMOCRACY_INS_RE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultEqualTo(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT =", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultNotEqualTo(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT <>", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultGreaterThan(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT >", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultGreaterThanOrEqualTo(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT >=", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultLessThan(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT <", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultLessThanOrEqualTo(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT <=", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultLike(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT like", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultNotLike(String value) {
            addCriterion("DEMOCRACY_INS_RE_RESULT not like", value, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultIn(List<String> values) {
            addCriterion("DEMOCRACY_INS_RE_RESULT in", values, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultNotIn(List<String> values) {
            addCriterion("DEMOCRACY_INS_RE_RESULT not in", values, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultBetween(String value1, String value2) {
            addCriterion("DEMOCRACY_INS_RE_RESULT between", value1, value2, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andDemocracyInsReResultNotBetween(String value1, String value2) {
            addCriterion("DEMOCRACY_INS_RE_RESULT not between", value1, value2, "democracyInsReResult");
            return (Criteria) this;
        }

        public Criteria andStep5IsNull() {
            addCriterion("STEP5 is null");
            return (Criteria) this;
        }

        public Criteria andStep5IsNotNull() {
            addCriterion("STEP5 is not null");
            return (Criteria) this;
        }

        public Criteria andStep5EqualTo(String value) {
            addCriterion("STEP5 =", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5NotEqualTo(String value) {
            addCriterion("STEP5 <>", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5GreaterThan(String value) {
            addCriterion("STEP5 >", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5GreaterThanOrEqualTo(String value) {
            addCriterion("STEP5 >=", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5LessThan(String value) {
            addCriterion("STEP5 <", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5LessThanOrEqualTo(String value) {
            addCriterion("STEP5 <=", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5Like(String value) {
            addCriterion("STEP5 like", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5NotLike(String value) {
            addCriterion("STEP5 not like", value, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5In(List<String> values) {
            addCriterion("STEP5 in", values, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5NotIn(List<String> values) {
            addCriterion("STEP5 not in", values, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5Between(String value1, String value2) {
            addCriterion("STEP5 between", value1, value2, "step5");
            return (Criteria) this;
        }

        public Criteria andStep5NotBetween(String value1, String value2) {
            addCriterion("STEP5 not between", value1, value2, "step5");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdIsNull() {
            addCriterion("INSPECT_ARCHIVES_ID is null");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdIsNotNull() {
            addCriterion("INSPECT_ARCHIVES_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdEqualTo(Long value) {
            addCriterion("INSPECT_ARCHIVES_ID =", value, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdNotEqualTo(Long value) {
            addCriterion("INSPECT_ARCHIVES_ID <>", value, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdGreaterThan(Long value) {
            addCriterion("INSPECT_ARCHIVES_ID >", value, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdGreaterThanOrEqualTo(Long value) {
            addCriterion("INSPECT_ARCHIVES_ID >=", value, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdLessThan(Long value) {
            addCriterion("INSPECT_ARCHIVES_ID <", value, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdLessThanOrEqualTo(Long value) {
            addCriterion("INSPECT_ARCHIVES_ID <=", value, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdIn(List<Long> values) {
            addCriterion("INSPECT_ARCHIVES_ID in", values, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdNotIn(List<Long> values) {
            addCriterion("INSPECT_ARCHIVES_ID not in", values, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdBetween(Long value1, Long value2) {
            addCriterion("INSPECT_ARCHIVES_ID between", value1, value2, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesIdNotBetween(Long value1, Long value2) {
            addCriterion("INSPECT_ARCHIVES_ID not between", value1, value2, "inspectArchivesId");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultIsNull() {
            addCriterion("INSPECT_ARCHIVES_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultIsNotNull() {
            addCriterion("INSPECT_ARCHIVES_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultEqualTo(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT =", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultNotEqualTo(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT <>", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultGreaterThan(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT >", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultGreaterThanOrEqualTo(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT >=", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultLessThan(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT <", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultLessThanOrEqualTo(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT <=", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultLike(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT like", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultNotLike(String value) {
            addCriterion("INSPECT_ARCHIVES_RESULT not like", value, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultIn(List<String> values) {
            addCriterion("INSPECT_ARCHIVES_RESULT in", values, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultNotIn(List<String> values) {
            addCriterion("INSPECT_ARCHIVES_RESULT not in", values, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultBetween(String value1, String value2) {
            addCriterion("INSPECT_ARCHIVES_RESULT between", value1, value2, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andInspectArchivesResultNotBetween(String value1, String value2) {
            addCriterion("INSPECT_ARCHIVES_RESULT not between", value1, value2, "inspectArchivesResult");
            return (Criteria) this;
        }

        public Criteria andStep6IsNull() {
            addCriterion("STEP6 is null");
            return (Criteria) this;
        }

        public Criteria andStep6IsNotNull() {
            addCriterion("STEP6 is not null");
            return (Criteria) this;
        }

        public Criteria andStep6EqualTo(String value) {
            addCriterion("STEP6 =", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6NotEqualTo(String value) {
            addCriterion("STEP6 <>", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6GreaterThan(String value) {
            addCriterion("STEP6 >", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6GreaterThanOrEqualTo(String value) {
            addCriterion("STEP6 >=", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6LessThan(String value) {
            addCriterion("STEP6 <", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6LessThanOrEqualTo(String value) {
            addCriterion("STEP6 <=", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6Like(String value) {
            addCriterion("STEP6 like", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6NotLike(String value) {
            addCriterion("STEP6 not like", value, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6In(List<String> values) {
            addCriterion("STEP6 in", values, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6NotIn(List<String> values) {
            addCriterion("STEP6 not in", values, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6Between(String value1, String value2) {
            addCriterion("STEP6 between", value1, value2, "step6");
            return (Criteria) this;
        }

        public Criteria andStep6NotBetween(String value1, String value2) {
            addCriterion("STEP6 not between", value1, value2, "step6");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdIsNull() {
            addCriterion("COM_DIS_INS_RE_OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdIsNotNull() {
            addCriterion("COM_DIS_INS_RE_OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdEqualTo(Long value) {
            addCriterion("COM_DIS_INS_RE_OP_ID =", value, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdNotEqualTo(Long value) {
            addCriterion("COM_DIS_INS_RE_OP_ID <>", value, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdGreaterThan(Long value) {
            addCriterion("COM_DIS_INS_RE_OP_ID >", value, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COM_DIS_INS_RE_OP_ID >=", value, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdLessThan(Long value) {
            addCriterion("COM_DIS_INS_RE_OP_ID <", value, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdLessThanOrEqualTo(Long value) {
            addCriterion("COM_DIS_INS_RE_OP_ID <=", value, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdIn(List<Long> values) {
            addCriterion("COM_DIS_INS_RE_OP_ID in", values, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdNotIn(List<Long> values) {
            addCriterion("COM_DIS_INS_RE_OP_ID not in", values, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdBetween(Long value1, Long value2) {
            addCriterion("COM_DIS_INS_RE_OP_ID between", value1, value2, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpIdNotBetween(Long value1, Long value2) {
            addCriterion("COM_DIS_INS_RE_OP_ID not between", value1, value2, "comDisInsReOpId");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultIsNull() {
            addCriterion("COM_DIS_INS_RE_OP_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultIsNotNull() {
            addCriterion("COM_DIS_INS_RE_OP_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultEqualTo(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT =", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultNotEqualTo(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT <>", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultGreaterThan(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT >", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultGreaterThanOrEqualTo(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT >=", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultLessThan(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT <", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultLessThanOrEqualTo(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT <=", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultLike(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT like", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultNotLike(String value) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT not like", value, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultIn(List<String> values) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT in", values, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultNotIn(List<String> values) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT not in", values, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultBetween(String value1, String value2) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT between", value1, value2, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andComDisInsReOpResultNotBetween(String value1, String value2) {
            addCriterion("COM_DIS_INS_RE_OP_RESULT not between", value1, value2, "comDisInsReOpResult");
            return (Criteria) this;
        }

        public Criteria andStep7IsNull() {
            addCriterion("STEP7 is null");
            return (Criteria) this;
        }

        public Criteria andStep7IsNotNull() {
            addCriterion("STEP7 is not null");
            return (Criteria) this;
        }

        public Criteria andStep7EqualTo(String value) {
            addCriterion("STEP7 =", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7NotEqualTo(String value) {
            addCriterion("STEP7 <>", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7GreaterThan(String value) {
            addCriterion("STEP7 >", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7GreaterThanOrEqualTo(String value) {
            addCriterion("STEP7 >=", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7LessThan(String value) {
            addCriterion("STEP7 <", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7LessThanOrEqualTo(String value) {
            addCriterion("STEP7 <=", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7Like(String value) {
            addCriterion("STEP7 like", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7NotLike(String value) {
            addCriterion("STEP7 not like", value, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7In(List<String> values) {
            addCriterion("STEP7 in", values, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7NotIn(List<String> values) {
            addCriterion("STEP7 not in", values, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7Between(String value1, String value2) {
            addCriterion("STEP7 between", value1, value2, "step7");
            return (Criteria) this;
        }

        public Criteria andStep7NotBetween(String value1, String value2) {
            addCriterion("STEP7 not between", value1, value2, "step7");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdIsNull() {
            addCriterion("COMPLIANCE_DEP_OP_ID is null");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdIsNotNull() {
            addCriterion("COMPLIANCE_DEP_OP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdEqualTo(Long value) {
            addCriterion("COMPLIANCE_DEP_OP_ID =", value, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdNotEqualTo(Long value) {
            addCriterion("COMPLIANCE_DEP_OP_ID <>", value, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdGreaterThan(Long value) {
            addCriterion("COMPLIANCE_DEP_OP_ID >", value, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdGreaterThanOrEqualTo(Long value) {
            addCriterion("COMPLIANCE_DEP_OP_ID >=", value, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdLessThan(Long value) {
            addCriterion("COMPLIANCE_DEP_OP_ID <", value, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdLessThanOrEqualTo(Long value) {
            addCriterion("COMPLIANCE_DEP_OP_ID <=", value, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdIn(List<Long> values) {
            addCriterion("COMPLIANCE_DEP_OP_ID in", values, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdNotIn(List<Long> values) {
            addCriterion("COMPLIANCE_DEP_OP_ID not in", values, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdBetween(Long value1, Long value2) {
            addCriterion("COMPLIANCE_DEP_OP_ID between", value1, value2, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpIdNotBetween(Long value1, Long value2) {
            addCriterion("COMPLIANCE_DEP_OP_ID not between", value1, value2, "complianceDepOpId");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultIsNull() {
            addCriterion("COMPLIANCE_DEP_OP_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultIsNotNull() {
            addCriterion("COMPLIANCE_DEP_OP_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultEqualTo(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT =", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultNotEqualTo(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT <>", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultGreaterThan(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT >", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT >=", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultLessThan(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT <", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultLessThanOrEqualTo(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT <=", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultLike(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT like", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultNotLike(String value) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT not like", value, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultIn(List<String> values) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT in", values, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultNotIn(List<String> values) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT not in", values, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultBetween(String value1, String value2) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT between", value1, value2, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andComplianceDepOpResultNotBetween(String value1, String value2) {
            addCriterion("COMPLIANCE_DEP_OP_RESULT not between", value1, value2, "complianceDepOpResult");
            return (Criteria) this;
        }

        public Criteria andStep8IsNull() {
            addCriterion("STEP8 is null");
            return (Criteria) this;
        }

        public Criteria andStep8IsNotNull() {
            addCriterion("STEP8 is not null");
            return (Criteria) this;
        }

        public Criteria andStep8EqualTo(String value) {
            addCriterion("STEP8 =", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8NotEqualTo(String value) {
            addCriterion("STEP8 <>", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8GreaterThan(String value) {
            addCriterion("STEP8 >", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8GreaterThanOrEqualTo(String value) {
            addCriterion("STEP8 >=", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8LessThan(String value) {
            addCriterion("STEP8 <", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8LessThanOrEqualTo(String value) {
            addCriterion("STEP8 <=", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8Like(String value) {
            addCriterion("STEP8 like", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8NotLike(String value) {
            addCriterion("STEP8 not like", value, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8In(List<String> values) {
            addCriterion("STEP8 in", values, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8NotIn(List<String> values) {
            addCriterion("STEP8 not in", values, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8Between(String value1, String value2) {
            addCriterion("STEP8 between", value1, value2, "step8");
            return (Criteria) this;
        }

        public Criteria andStep8NotBetween(String value1, String value2) {
            addCriterion("STEP8 not between", value1, value2, "step8");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdIsNull() {
            addCriterion("SECOND_MOTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdIsNotNull() {
            addCriterion("SECOND_MOTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdEqualTo(Long value) {
            addCriterion("SECOND_MOTION_ID =", value, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdNotEqualTo(Long value) {
            addCriterion("SECOND_MOTION_ID <>", value, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdGreaterThan(Long value) {
            addCriterion("SECOND_MOTION_ID >", value, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SECOND_MOTION_ID >=", value, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdLessThan(Long value) {
            addCriterion("SECOND_MOTION_ID <", value, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdLessThanOrEqualTo(Long value) {
            addCriterion("SECOND_MOTION_ID <=", value, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdIn(List<Long> values) {
            addCriterion("SECOND_MOTION_ID in", values, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdNotIn(List<Long> values) {
            addCriterion("SECOND_MOTION_ID not in", values, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdBetween(Long value1, Long value2) {
            addCriterion("SECOND_MOTION_ID between", value1, value2, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionIdNotBetween(Long value1, Long value2) {
            addCriterion("SECOND_MOTION_ID not between", value1, value2, "secondMotionId");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultIsNull() {
            addCriterion("SECOND_MOTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultIsNotNull() {
            addCriterion("SECOND_MOTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultEqualTo(String value) {
            addCriterion("SECOND_MOTION_RESULT =", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultNotEqualTo(String value) {
            addCriterion("SECOND_MOTION_RESULT <>", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultGreaterThan(String value) {
            addCriterion("SECOND_MOTION_RESULT >", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_MOTION_RESULT >=", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultLessThan(String value) {
            addCriterion("SECOND_MOTION_RESULT <", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultLessThanOrEqualTo(String value) {
            addCriterion("SECOND_MOTION_RESULT <=", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultLike(String value) {
            addCriterion("SECOND_MOTION_RESULT like", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultNotLike(String value) {
            addCriterion("SECOND_MOTION_RESULT not like", value, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultIn(List<String> values) {
            addCriterion("SECOND_MOTION_RESULT in", values, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultNotIn(List<String> values) {
            addCriterion("SECOND_MOTION_RESULT not in", values, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultBetween(String value1, String value2) {
            addCriterion("SECOND_MOTION_RESULT between", value1, value2, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andSecondMotionResultNotBetween(String value1, String value2) {
            addCriterion("SECOND_MOTION_RESULT not between", value1, value2, "secondMotionResult");
            return (Criteria) this;
        }

        public Criteria andStep9IsNull() {
            addCriterion("STEP9 is null");
            return (Criteria) this;
        }

        public Criteria andStep9IsNotNull() {
            addCriterion("STEP9 is not null");
            return (Criteria) this;
        }

        public Criteria andStep9EqualTo(String value) {
            addCriterion("STEP9 =", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9NotEqualTo(String value) {
            addCriterion("STEP9 <>", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9GreaterThan(String value) {
            addCriterion("STEP9 >", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9GreaterThanOrEqualTo(String value) {
            addCriterion("STEP9 >=", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9LessThan(String value) {
            addCriterion("STEP9 <", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9LessThanOrEqualTo(String value) {
            addCriterion("STEP9 <=", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9Like(String value) {
            addCriterion("STEP9 like", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9NotLike(String value) {
            addCriterion("STEP9 not like", value, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9In(List<String> values) {
            addCriterion("STEP9 in", values, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9NotIn(List<String> values) {
            addCriterion("STEP9 not in", values, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9Between(String value1, String value2) {
            addCriterion("STEP9 between", value1, value2, "step9");
            return (Criteria) this;
        }

        public Criteria andStep9NotBetween(String value1, String value2) {
            addCriterion("STEP9 not between", value1, value2, "step9");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdIsNull() {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdIsNotNull() {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdEqualTo(Long value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID =", value, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdNotEqualTo(Long value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID <>", value, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdGreaterThan(Long value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID >", value, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID >=", value, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdLessThan(Long value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID <", value, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdLessThanOrEqualTo(Long value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID <=", value, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdIn(List<Long> values) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID in", values, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdNotIn(List<Long> values) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID not in", values, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdBetween(Long value1, Long value2) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID between", value1, value2, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeIdNotBetween(Long value1, Long value2) {
            addCriterion("PUB_BEFORE_IN_OFFICE_ID not between", value1, value2, "pubBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultIsNull() {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultIsNotNull() {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultEqualTo(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT =", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultNotEqualTo(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT <>", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultGreaterThan(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT >", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultGreaterThanOrEqualTo(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT >=", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultLessThan(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT <", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultLessThanOrEqualTo(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT <=", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultLike(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT like", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultNotLike(String value) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT not like", value, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultIn(List<String> values) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT in", values, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultNotIn(List<String> values) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT not in", values, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultBetween(String value1, String value2) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT between", value1, value2, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andPubBeforeInOfficeResultNotBetween(String value1, String value2) {
            addCriterion("PUB_BEFORE_IN_OFFICE_RESULT not between", value1, value2, "pubBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andStep10IsNull() {
            addCriterion("STEP10 is null");
            return (Criteria) this;
        }

        public Criteria andStep10IsNotNull() {
            addCriterion("STEP10 is not null");
            return (Criteria) this;
        }

        public Criteria andStep10EqualTo(String value) {
            addCriterion("STEP10 =", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10NotEqualTo(String value) {
            addCriterion("STEP10 <>", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10GreaterThan(String value) {
            addCriterion("STEP10 >", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10GreaterThanOrEqualTo(String value) {
            addCriterion("STEP10 >=", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10LessThan(String value) {
            addCriterion("STEP10 <", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10LessThanOrEqualTo(String value) {
            addCriterion("STEP10 <=", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10Like(String value) {
            addCriterion("STEP10 like", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10NotLike(String value) {
            addCriterion("STEP10 not like", value, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10In(List<String> values) {
            addCriterion("STEP10 in", values, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10NotIn(List<String> values) {
            addCriterion("STEP10 not in", values, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10Between(String value1, String value2) {
            addCriterion("STEP10 between", value1, value2, "step10");
            return (Criteria) this;
        }

        public Criteria andStep10NotBetween(String value1, String value2) {
            addCriterion("STEP10 not between", value1, value2, "step10");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdIsNull() {
            addCriterion("THIRD_MOTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdIsNotNull() {
            addCriterion("THIRD_MOTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdEqualTo(Long value) {
            addCriterion("THIRD_MOTION_ID =", value, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdNotEqualTo(Long value) {
            addCriterion("THIRD_MOTION_ID <>", value, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdGreaterThan(Long value) {
            addCriterion("THIRD_MOTION_ID >", value, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("THIRD_MOTION_ID >=", value, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdLessThan(Long value) {
            addCriterion("THIRD_MOTION_ID <", value, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdLessThanOrEqualTo(Long value) {
            addCriterion("THIRD_MOTION_ID <=", value, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdIn(List<Long> values) {
            addCriterion("THIRD_MOTION_ID in", values, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdNotIn(List<Long> values) {
            addCriterion("THIRD_MOTION_ID not in", values, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdBetween(Long value1, Long value2) {
            addCriterion("THIRD_MOTION_ID between", value1, value2, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionIdNotBetween(Long value1, Long value2) {
            addCriterion("THIRD_MOTION_ID not between", value1, value2, "thirdMotionId");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultIsNull() {
            addCriterion("THIRD_MOTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultIsNotNull() {
            addCriterion("THIRD_MOTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultEqualTo(String value) {
            addCriterion("THIRD_MOTION_RESULT =", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultNotEqualTo(String value) {
            addCriterion("THIRD_MOTION_RESULT <>", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultGreaterThan(String value) {
            addCriterion("THIRD_MOTION_RESULT >", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_MOTION_RESULT >=", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultLessThan(String value) {
            addCriterion("THIRD_MOTION_RESULT <", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultLessThanOrEqualTo(String value) {
            addCriterion("THIRD_MOTION_RESULT <=", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultLike(String value) {
            addCriterion("THIRD_MOTION_RESULT like", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultNotLike(String value) {
            addCriterion("THIRD_MOTION_RESULT not like", value, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultIn(List<String> values) {
            addCriterion("THIRD_MOTION_RESULT in", values, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultNotIn(List<String> values) {
            addCriterion("THIRD_MOTION_RESULT not in", values, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultBetween(String value1, String value2) {
            addCriterion("THIRD_MOTION_RESULT between", value1, value2, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andThirdMotionResultNotBetween(String value1, String value2) {
            addCriterion("THIRD_MOTION_RESULT not between", value1, value2, "thirdMotionResult");
            return (Criteria) this;
        }

        public Criteria andStep11IsNull() {
            addCriterion("STEP11 is null");
            return (Criteria) this;
        }

        public Criteria andStep11IsNotNull() {
            addCriterion("STEP11 is not null");
            return (Criteria) this;
        }

        public Criteria andStep11EqualTo(String value) {
            addCriterion("STEP11 =", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11NotEqualTo(String value) {
            addCriterion("STEP11 <>", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11GreaterThan(String value) {
            addCriterion("STEP11 >", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11GreaterThanOrEqualTo(String value) {
            addCriterion("STEP11 >=", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11LessThan(String value) {
            addCriterion("STEP11 <", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11LessThanOrEqualTo(String value) {
            addCriterion("STEP11 <=", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11Like(String value) {
            addCriterion("STEP11 like", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11NotLike(String value) {
            addCriterion("STEP11 not like", value, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11In(List<String> values) {
            addCriterion("STEP11 in", values, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11NotIn(List<String> values) {
            addCriterion("STEP11 not in", values, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11Between(String value1, String value2) {
            addCriterion("STEP11 between", value1, value2, "step11");
            return (Criteria) this;
        }

        public Criteria andStep11NotBetween(String value1, String value2) {
            addCriterion("STEP11 not between", value1, value2, "step11");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdIsNull() {
            addCriterion("APP_BEFORE_IN_OFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdIsNotNull() {
            addCriterion("APP_BEFORE_IN_OFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdEqualTo(Long value) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID =", value, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdNotEqualTo(Long value) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID <>", value, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdGreaterThan(Long value) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID >", value, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID >=", value, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdLessThan(Long value) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID <", value, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdLessThanOrEqualTo(Long value) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID <=", value, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdIn(List<Long> values) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID in", values, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdNotIn(List<Long> values) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID not in", values, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdBetween(Long value1, Long value2) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID between", value1, value2, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeIdNotBetween(Long value1, Long value2) {
            addCriterion("APP_BEFORE_IN_OFFICE_ID not between", value1, value2, "appBeforeInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultIsNull() {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultIsNotNull() {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultEqualTo(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT =", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultNotEqualTo(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT <>", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultGreaterThan(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT >", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultGreaterThanOrEqualTo(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT >=", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultLessThan(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT <", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultLessThanOrEqualTo(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT <=", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultLike(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT like", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultNotLike(String value) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT not like", value, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultIn(List<String> values) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT in", values, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultNotIn(List<String> values) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT not in", values, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultBetween(String value1, String value2) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT between", value1, value2, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAppBeforeInOfficeResultNotBetween(String value1, String value2) {
            addCriterion("APP_BEFORE_IN_OFFICE_RESULT not between", value1, value2, "appBeforeInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andStep12IsNull() {
            addCriterion("STEP12 is null");
            return (Criteria) this;
        }

        public Criteria andStep12IsNotNull() {
            addCriterion("STEP12 is not null");
            return (Criteria) this;
        }

        public Criteria andStep12EqualTo(String value) {
            addCriterion("STEP12 =", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12NotEqualTo(String value) {
            addCriterion("STEP12 <>", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12GreaterThan(String value) {
            addCriterion("STEP12 >", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12GreaterThanOrEqualTo(String value) {
            addCriterion("STEP12 >=", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12LessThan(String value) {
            addCriterion("STEP12 <", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12LessThanOrEqualTo(String value) {
            addCriterion("STEP12 <=", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12Like(String value) {
            addCriterion("STEP12 like", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12NotLike(String value) {
            addCriterion("STEP12 not like", value, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12In(List<String> values) {
            addCriterion("STEP12 in", values, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12NotIn(List<String> values) {
            addCriterion("STEP12 not in", values, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12Between(String value1, String value2) {
            addCriterion("STEP12 between", value1, value2, "step12");
            return (Criteria) this;
        }

        public Criteria andStep12NotBetween(String value1, String value2) {
            addCriterion("STEP12 not between", value1, value2, "step12");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdIsNull() {
            addCriterion("OUTGOING_INSPECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdIsNotNull() {
            addCriterion("OUTGOING_INSPECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdEqualTo(Long value) {
            addCriterion("OUTGOING_INSPECTION_ID =", value, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdNotEqualTo(Long value) {
            addCriterion("OUTGOING_INSPECTION_ID <>", value, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdGreaterThan(Long value) {
            addCriterion("OUTGOING_INSPECTION_ID >", value, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("OUTGOING_INSPECTION_ID >=", value, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdLessThan(Long value) {
            addCriterion("OUTGOING_INSPECTION_ID <", value, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdLessThanOrEqualTo(Long value) {
            addCriterion("OUTGOING_INSPECTION_ID <=", value, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdIn(List<Long> values) {
            addCriterion("OUTGOING_INSPECTION_ID in", values, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdNotIn(List<Long> values) {
            addCriterion("OUTGOING_INSPECTION_ID not in", values, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdBetween(Long value1, Long value2) {
            addCriterion("OUTGOING_INSPECTION_ID between", value1, value2, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionIdNotBetween(Long value1, Long value2) {
            addCriterion("OUTGOING_INSPECTION_ID not between", value1, value2, "outgoingInspectionId");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultIsNull() {
            addCriterion("OUTGOING_INSPECTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultIsNotNull() {
            addCriterion("OUTGOING_INSPECTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultEqualTo(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT =", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultNotEqualTo(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT <>", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultGreaterThan(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT >", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT >=", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultLessThan(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT <", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultLessThanOrEqualTo(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT <=", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultLike(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT like", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultNotLike(String value) {
            addCriterion("OUTGOING_INSPECTION_RESULT not like", value, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultIn(List<String> values) {
            addCriterion("OUTGOING_INSPECTION_RESULT in", values, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultNotIn(List<String> values) {
            addCriterion("OUTGOING_INSPECTION_RESULT not in", values, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultBetween(String value1, String value2) {
            addCriterion("OUTGOING_INSPECTION_RESULT between", value1, value2, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andOutgoingInspectionResultNotBetween(String value1, String value2) {
            addCriterion("OUTGOING_INSPECTION_RESULT not between", value1, value2, "outgoingInspectionResult");
            return (Criteria) this;
        }

        public Criteria andStep13IsNull() {
            addCriterion("STEP13 is null");
            return (Criteria) this;
        }

        public Criteria andStep13IsNotNull() {
            addCriterion("STEP13 is not null");
            return (Criteria) this;
        }

        public Criteria andStep13EqualTo(String value) {
            addCriterion("STEP13 =", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13NotEqualTo(String value) {
            addCriterion("STEP13 <>", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13GreaterThan(String value) {
            addCriterion("STEP13 >", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13GreaterThanOrEqualTo(String value) {
            addCriterion("STEP13 >=", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13LessThan(String value) {
            addCriterion("STEP13 <", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13LessThanOrEqualTo(String value) {
            addCriterion("STEP13 <=", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13Like(String value) {
            addCriterion("STEP13 like", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13NotLike(String value) {
            addCriterion("STEP13 not like", value, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13In(List<String> values) {
            addCriterion("STEP13 in", values, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13NotIn(List<String> values) {
            addCriterion("STEP13 not in", values, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13Between(String value1, String value2) {
            addCriterion("STEP13 between", value1, value2, "step13");
            return (Criteria) this;
        }

        public Criteria andStep13NotBetween(String value1, String value2) {
            addCriterion("STEP13 not between", value1, value2, "step13");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdIsNull() {
            addCriterion("CON_IN_OFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdIsNotNull() {
            addCriterion("CON_IN_OFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdEqualTo(Long value) {
            addCriterion("CON_IN_OFFICE_ID =", value, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdNotEqualTo(Long value) {
            addCriterion("CON_IN_OFFICE_ID <>", value, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdGreaterThan(Long value) {
            addCriterion("CON_IN_OFFICE_ID >", value, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CON_IN_OFFICE_ID >=", value, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdLessThan(Long value) {
            addCriterion("CON_IN_OFFICE_ID <", value, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdLessThanOrEqualTo(Long value) {
            addCriterion("CON_IN_OFFICE_ID <=", value, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdIn(List<Long> values) {
            addCriterion("CON_IN_OFFICE_ID in", values, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdNotIn(List<Long> values) {
            addCriterion("CON_IN_OFFICE_ID not in", values, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdBetween(Long value1, Long value2) {
            addCriterion("CON_IN_OFFICE_ID between", value1, value2, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeIdNotBetween(Long value1, Long value2) {
            addCriterion("CON_IN_OFFICE_ID not between", value1, value2, "conInOfficeId");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultIsNull() {
            addCriterion("CON_IN_OFFICE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultIsNotNull() {
            addCriterion("CON_IN_OFFICE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultEqualTo(String value) {
            addCriterion("CON_IN_OFFICE_RESULT =", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultNotEqualTo(String value) {
            addCriterion("CON_IN_OFFICE_RESULT <>", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultGreaterThan(String value) {
            addCriterion("CON_IN_OFFICE_RESULT >", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultGreaterThanOrEqualTo(String value) {
            addCriterion("CON_IN_OFFICE_RESULT >=", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultLessThan(String value) {
            addCriterion("CON_IN_OFFICE_RESULT <", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultLessThanOrEqualTo(String value) {
            addCriterion("CON_IN_OFFICE_RESULT <=", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultLike(String value) {
            addCriterion("CON_IN_OFFICE_RESULT like", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultNotLike(String value) {
            addCriterion("CON_IN_OFFICE_RESULT not like", value, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultIn(List<String> values) {
            addCriterion("CON_IN_OFFICE_RESULT in", values, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultNotIn(List<String> values) {
            addCriterion("CON_IN_OFFICE_RESULT not in", values, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultBetween(String value1, String value2) {
            addCriterion("CON_IN_OFFICE_RESULT between", value1, value2, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andConInOfficeResultNotBetween(String value1, String value2) {
            addCriterion("CON_IN_OFFICE_RESULT not between", value1, value2, "conInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andStep14IsNull() {
            addCriterion("STEP14 is null");
            return (Criteria) this;
        }

        public Criteria andStep14IsNotNull() {
            addCriterion("STEP14 is not null");
            return (Criteria) this;
        }

        public Criteria andStep14EqualTo(String value) {
            addCriterion("STEP14 =", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14NotEqualTo(String value) {
            addCriterion("STEP14 <>", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14GreaterThan(String value) {
            addCriterion("STEP14 >", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14GreaterThanOrEqualTo(String value) {
            addCriterion("STEP14 >=", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14LessThan(String value) {
            addCriterion("STEP14 <", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14LessThanOrEqualTo(String value) {
            addCriterion("STEP14 <=", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14Like(String value) {
            addCriterion("STEP14 like", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14NotLike(String value) {
            addCriterion("STEP14 not like", value, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14In(List<String> values) {
            addCriterion("STEP14 in", values, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14NotIn(List<String> values) {
            addCriterion("STEP14 not in", values, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14Between(String value1, String value2) {
            addCriterion("STEP14 between", value1, value2, "step14");
            return (Criteria) this;
        }

        public Criteria andStep14NotBetween(String value1, String value2) {
            addCriterion("STEP14 not between", value1, value2, "step14");
            return (Criteria) this;
        }

        public Criteria andConHonestIdIsNull() {
            addCriterion("CON_HONEST_ID is null");
            return (Criteria) this;
        }

        public Criteria andConHonestIdIsNotNull() {
            addCriterion("CON_HONEST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andConHonestIdEqualTo(Long value) {
            addCriterion("CON_HONEST_ID =", value, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdNotEqualTo(Long value) {
            addCriterion("CON_HONEST_ID <>", value, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdGreaterThan(Long value) {
            addCriterion("CON_HONEST_ID >", value, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CON_HONEST_ID >=", value, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdLessThan(Long value) {
            addCriterion("CON_HONEST_ID <", value, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdLessThanOrEqualTo(Long value) {
            addCriterion("CON_HONEST_ID <=", value, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdIn(List<Long> values) {
            addCriterion("CON_HONEST_ID in", values, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdNotIn(List<Long> values) {
            addCriterion("CON_HONEST_ID not in", values, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdBetween(Long value1, Long value2) {
            addCriterion("CON_HONEST_ID between", value1, value2, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestIdNotBetween(Long value1, Long value2) {
            addCriterion("CON_HONEST_ID not between", value1, value2, "conHonestId");
            return (Criteria) this;
        }

        public Criteria andConHonestResultIsNull() {
            addCriterion("CON_HONEST_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andConHonestResultIsNotNull() {
            addCriterion("CON_HONEST_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andConHonestResultEqualTo(String value) {
            addCriterion("CON_HONEST_RESULT =", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultNotEqualTo(String value) {
            addCriterion("CON_HONEST_RESULT <>", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultGreaterThan(String value) {
            addCriterion("CON_HONEST_RESULT >", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultGreaterThanOrEqualTo(String value) {
            addCriterion("CON_HONEST_RESULT >=", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultLessThan(String value) {
            addCriterion("CON_HONEST_RESULT <", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultLessThanOrEqualTo(String value) {
            addCriterion("CON_HONEST_RESULT <=", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultLike(String value) {
            addCriterion("CON_HONEST_RESULT like", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultNotLike(String value) {
            addCriterion("CON_HONEST_RESULT not like", value, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultIn(List<String> values) {
            addCriterion("CON_HONEST_RESULT in", values, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultNotIn(List<String> values) {
            addCriterion("CON_HONEST_RESULT not in", values, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultBetween(String value1, String value2) {
            addCriterion("CON_HONEST_RESULT between", value1, value2, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andConHonestResultNotBetween(String value1, String value2) {
            addCriterion("CON_HONEST_RESULT not between", value1, value2, "conHonestResult");
            return (Criteria) this;
        }

        public Criteria andStep15IsNull() {
            addCriterion("STEP15 is null");
            return (Criteria) this;
        }

        public Criteria andStep15IsNotNull() {
            addCriterion("STEP15 is not null");
            return (Criteria) this;
        }

        public Criteria andStep15EqualTo(String value) {
            addCriterion("STEP15 =", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15NotEqualTo(String value) {
            addCriterion("STEP15 <>", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15GreaterThan(String value) {
            addCriterion("STEP15 >", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15GreaterThanOrEqualTo(String value) {
            addCriterion("STEP15 >=", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15LessThan(String value) {
            addCriterion("STEP15 <", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15LessThanOrEqualTo(String value) {
            addCriterion("STEP15 <=", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15Like(String value) {
            addCriterion("STEP15 like", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15NotLike(String value) {
            addCriterion("STEP15 not like", value, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15In(List<String> values) {
            addCriterion("STEP15 in", values, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15NotIn(List<String> values) {
            addCriterion("STEP15 not in", values, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15Between(String value1, String value2) {
            addCriterion("STEP15 between", value1, value2, "step15");
            return (Criteria) this;
        }

        public Criteria andStep15NotBetween(String value1, String value2) {
            addCriterion("STEP15 not between", value1, value2, "step15");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdIsNull() {
            addCriterion("APP_BANKING_SUPERVISION_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdIsNotNull() {
            addCriterion("APP_BANKING_SUPERVISION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdEqualTo(Long value) {
            addCriterion("APP_BANKING_SUPERVISION_ID =", value, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdNotEqualTo(Long value) {
            addCriterion("APP_BANKING_SUPERVISION_ID <>", value, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdGreaterThan(Long value) {
            addCriterion("APP_BANKING_SUPERVISION_ID >", value, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APP_BANKING_SUPERVISION_ID >=", value, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdLessThan(Long value) {
            addCriterion("APP_BANKING_SUPERVISION_ID <", value, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdLessThanOrEqualTo(Long value) {
            addCriterion("APP_BANKING_SUPERVISION_ID <=", value, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdIn(List<Long> values) {
            addCriterion("APP_BANKING_SUPERVISION_ID in", values, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdNotIn(List<Long> values) {
            addCriterion("APP_BANKING_SUPERVISION_ID not in", values, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdBetween(Long value1, Long value2) {
            addCriterion("APP_BANKING_SUPERVISION_ID between", value1, value2, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionIdNotBetween(Long value1, Long value2) {
            addCriterion("APP_BANKING_SUPERVISION_ID not between", value1, value2, "appBankingSupervisionId");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultIsNull() {
            addCriterion("APP_BANKING_SUPERVISION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultIsNotNull() {
            addCriterion("APP_BANKING_SUPERVISION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultEqualTo(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT =", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultNotEqualTo(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT <>", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultGreaterThan(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT >", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultGreaterThanOrEqualTo(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT >=", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultLessThan(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT <", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultLessThanOrEqualTo(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT <=", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultLike(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT like", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultNotLike(String value) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT not like", value, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultIn(List<String> values) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT in", values, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultNotIn(List<String> values) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT not in", values, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultBetween(String value1, String value2) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT between", value1, value2, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andAppBankingSupervisionResultNotBetween(String value1, String value2) {
            addCriterion("APP_BANKING_SUPERVISION_RESULT not between", value1, value2, "appBankingSupervisionResult");
            return (Criteria) this;
        }

        public Criteria andStep16IsNull() {
            addCriterion("STEP16 is null");
            return (Criteria) this;
        }

        public Criteria andStep16IsNotNull() {
            addCriterion("STEP16 is not null");
            return (Criteria) this;
        }

        public Criteria andStep16EqualTo(String value) {
            addCriterion("STEP16 =", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16NotEqualTo(String value) {
            addCriterion("STEP16 <>", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16GreaterThan(String value) {
            addCriterion("STEP16 >", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16GreaterThanOrEqualTo(String value) {
            addCriterion("STEP16 >=", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16LessThan(String value) {
            addCriterion("STEP16 <", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16LessThanOrEqualTo(String value) {
            addCriterion("STEP16 <=", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16Like(String value) {
            addCriterion("STEP16 like", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16NotLike(String value) {
            addCriterion("STEP16 not like", value, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16In(List<String> values) {
            addCriterion("STEP16 in", values, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16NotIn(List<String> values) {
            addCriterion("STEP16 not in", values, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16Between(String value1, String value2) {
            addCriterion("STEP16 between", value1, value2, "step16");
            return (Criteria) this;
        }

        public Criteria andStep16NotBetween(String value1, String value2) {
            addCriterion("STEP16 not between", value1, value2, "step16");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdIsNull() {
            addCriterion("ANNOUNCED_IN_OFFICE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdIsNotNull() {
            addCriterion("ANNOUNCED_IN_OFFICE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdEqualTo(Long value) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID =", value, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdNotEqualTo(Long value) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID <>", value, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdGreaterThan(Long value) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID >", value, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID >=", value, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdLessThan(Long value) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID <", value, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdLessThanOrEqualTo(Long value) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID <=", value, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdIn(List<Long> values) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID in", values, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdNotIn(List<Long> values) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID not in", values, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdBetween(Long value1, Long value2) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID between", value1, value2, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeIdNotBetween(Long value1, Long value2) {
            addCriterion("ANNOUNCED_IN_OFFICE_ID not between", value1, value2, "announcedInOfficeId");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultIsNull() {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultIsNotNull() {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultEqualTo(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT =", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultNotEqualTo(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT <>", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultGreaterThan(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT >", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultGreaterThanOrEqualTo(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT >=", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultLessThan(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT <", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultLessThanOrEqualTo(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT <=", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultLike(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT like", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultNotLike(String value) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT not like", value, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultIn(List<String> values) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT in", values, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultNotIn(List<String> values) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT not in", values, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultBetween(String value1, String value2) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT between", value1, value2, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andAnnouncedInOfficeResultNotBetween(String value1, String value2) {
            addCriterion("ANNOUNCED_IN_OFFICE_RESULT not between", value1, value2, "announcedInOfficeResult");
            return (Criteria) this;
        }

        public Criteria andStep17IsNull() {
            addCriterion("STEP17 is null");
            return (Criteria) this;
        }

        public Criteria andStep17IsNotNull() {
            addCriterion("STEP17 is not null");
            return (Criteria) this;
        }

        public Criteria andStep17EqualTo(String value) {
            addCriterion("STEP17 =", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17NotEqualTo(String value) {
            addCriterion("STEP17 <>", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17GreaterThan(String value) {
            addCriterion("STEP17 >", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17GreaterThanOrEqualTo(String value) {
            addCriterion("STEP17 >=", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17LessThan(String value) {
            addCriterion("STEP17 <", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17LessThanOrEqualTo(String value) {
            addCriterion("STEP17 <=", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17Like(String value) {
            addCriterion("STEP17 like", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17NotLike(String value) {
            addCriterion("STEP17 not like", value, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17In(List<String> values) {
            addCriterion("STEP17 in", values, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17NotIn(List<String> values) {
            addCriterion("STEP17 not in", values, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17Between(String value1, String value2) {
            addCriterion("STEP17 between", value1, value2, "step17");
            return (Criteria) this;
        }

        public Criteria andStep17NotBetween(String value1, String value2) {
            addCriterion("STEP17 not between", value1, value2, "step17");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdIsNull() {
            addCriterion("POST_APPOINT_ID is null");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdIsNotNull() {
            addCriterion("POST_APPOINT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdEqualTo(Long value) {
            addCriterion("POST_APPOINT_ID =", value, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdNotEqualTo(Long value) {
            addCriterion("POST_APPOINT_ID <>", value, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdGreaterThan(Long value) {
            addCriterion("POST_APPOINT_ID >", value, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdGreaterThanOrEqualTo(Long value) {
            addCriterion("POST_APPOINT_ID >=", value, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdLessThan(Long value) {
            addCriterion("POST_APPOINT_ID <", value, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdLessThanOrEqualTo(Long value) {
            addCriterion("POST_APPOINT_ID <=", value, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdIn(List<Long> values) {
            addCriterion("POST_APPOINT_ID in", values, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdNotIn(List<Long> values) {
            addCriterion("POST_APPOINT_ID not in", values, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdBetween(Long value1, Long value2) {
            addCriterion("POST_APPOINT_ID between", value1, value2, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointIdNotBetween(Long value1, Long value2) {
            addCriterion("POST_APPOINT_ID not between", value1, value2, "postAppointId");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultIsNull() {
            addCriterion("POST_APPOINT_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultIsNotNull() {
            addCriterion("POST_APPOINT_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultEqualTo(String value) {
            addCriterion("POST_APPOINT_RESULT =", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultNotEqualTo(String value) {
            addCriterion("POST_APPOINT_RESULT <>", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultGreaterThan(String value) {
            addCriterion("POST_APPOINT_RESULT >", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultGreaterThanOrEqualTo(String value) {
            addCriterion("POST_APPOINT_RESULT >=", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultLessThan(String value) {
            addCriterion("POST_APPOINT_RESULT <", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultLessThanOrEqualTo(String value) {
            addCriterion("POST_APPOINT_RESULT <=", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultLike(String value) {
            addCriterion("POST_APPOINT_RESULT like", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultNotLike(String value) {
            addCriterion("POST_APPOINT_RESULT not like", value, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultIn(List<String> values) {
            addCriterion("POST_APPOINT_RESULT in", values, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultNotIn(List<String> values) {
            addCriterion("POST_APPOINT_RESULT not in", values, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultBetween(String value1, String value2) {
            addCriterion("POST_APPOINT_RESULT between", value1, value2, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andPostAppointResultNotBetween(String value1, String value2) {
            addCriterion("POST_APPOINT_RESULT not between", value1, value2, "postAppointResult");
            return (Criteria) this;
        }

        public Criteria andStep18IsNull() {
            addCriterion("STEP18 is null");
            return (Criteria) this;
        }

        public Criteria andStep18IsNotNull() {
            addCriterion("STEP18 is not null");
            return (Criteria) this;
        }

        public Criteria andStep18EqualTo(String value) {
            addCriterion("STEP18 =", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18NotEqualTo(String value) {
            addCriterion("STEP18 <>", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18GreaterThan(String value) {
            addCriterion("STEP18 >", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18GreaterThanOrEqualTo(String value) {
            addCriterion("STEP18 >=", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18LessThan(String value) {
            addCriterion("STEP18 <", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18LessThanOrEqualTo(String value) {
            addCriterion("STEP18 <=", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18Like(String value) {
            addCriterion("STEP18 like", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18NotLike(String value) {
            addCriterion("STEP18 not like", value, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18In(List<String> values) {
            addCriterion("STEP18 in", values, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18NotIn(List<String> values) {
            addCriterion("STEP18 not in", values, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18Between(String value1, String value2) {
            addCriterion("STEP18 between", value1, value2, "step18");
            return (Criteria) this;
        }

        public Criteria andStep18NotBetween(String value1, String value2) {
            addCriterion("STEP18 not between", value1, value2, "step18");
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

        public Criteria andFlowStatusIsNull() {
            addCriterion("FLOW_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIsNotNull() {
            addCriterion("FLOW_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFlowStatusEqualTo(String value) {
            addCriterion("FLOW_STATUS =", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotEqualTo(String value) {
            addCriterion("FLOW_STATUS <>", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusGreaterThan(String value) {
            addCriterion("FLOW_STATUS >", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusGreaterThanOrEqualTo(String value) {
            addCriterion("FLOW_STATUS >=", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLessThan(String value) {
            addCriterion("FLOW_STATUS <", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLessThanOrEqualTo(String value) {
            addCriterion("FLOW_STATUS <=", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusLike(String value) {
            addCriterion("FLOW_STATUS like", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotLike(String value) {
            addCriterion("FLOW_STATUS not like", value, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusIn(List<String> values) {
            addCriterion("FLOW_STATUS in", values, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotIn(List<String> values) {
            addCriterion("FLOW_STATUS not in", values, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusBetween(String value1, String value2) {
            addCriterion("FLOW_STATUS between", value1, value2, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andFlowStatusNotBetween(String value1, String value2) {
            addCriterion("FLOW_STATUS not between", value1, value2, "flowStatus");
            return (Criteria) this;
        }

        public Criteria andOrgIsNull() {
            addCriterion("ORG is null");
            return (Criteria) this;
        }

        public Criteria andOrgIsNotNull() {
            addCriterion("ORG is not null");
            return (Criteria) this;
        }

        public Criteria andOrgEqualTo(String value) {
            addCriterion("ORG =", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotEqualTo(String value) {
            addCriterion("ORG <>", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThan(String value) {
            addCriterion("ORG >", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgGreaterThanOrEqualTo(String value) {
            addCriterion("ORG >=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThan(String value) {
            addCriterion("ORG <", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLessThanOrEqualTo(String value) {
            addCriterion("ORG <=", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgLike(String value) {
            addCriterion("ORG like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotLike(String value) {
            addCriterion("ORG not like", value, "org");
            return (Criteria) this;
        }

        public Criteria andOrgIn(List<String> values) {
            addCriterion("ORG in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotIn(List<String> values) {
            addCriterion("ORG not in", values, "org");
            return (Criteria) this;
        }

        public Criteria andOrgBetween(String value1, String value2) {
            addCriterion("ORG between", value1, value2, "org");
            return (Criteria) this;
        }

        public Criteria andOrgNotBetween(String value1, String value2) {
            addCriterion("ORG not between", value1, value2, "org");
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

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("END_DATE not between", value1, value2, "endDate");
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