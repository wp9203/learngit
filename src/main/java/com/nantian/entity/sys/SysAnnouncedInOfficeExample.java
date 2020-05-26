package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAnnouncedInOfficeExample {
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
    public SysAnnouncedInOfficeExample() {
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

        public Criteria andAnnounceTimeIsNull() {
            addCriterion("ANNOUNCE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeIsNotNull() {
            addCriterion("ANNOUNCE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeEqualTo(Date value) {
            addCriterion("ANNOUNCE_TIME =", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeNotEqualTo(Date value) {
            addCriterion("ANNOUNCE_TIME <>", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeGreaterThan(Date value) {
            addCriterion("ANNOUNCE_TIME >", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ANNOUNCE_TIME >=", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeLessThan(Date value) {
            addCriterion("ANNOUNCE_TIME <", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeLessThanOrEqualTo(Date value) {
            addCriterion("ANNOUNCE_TIME <=", value, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeIn(List<Date> values) {
            addCriterion("ANNOUNCE_TIME in", values, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeNotIn(List<Date> values) {
            addCriterion("ANNOUNCE_TIME not in", values, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeBetween(Date value1, Date value2) {
            addCriterion("ANNOUNCE_TIME between", value1, value2, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnounceTimeNotBetween(Date value1, Date value2) {
            addCriterion("ANNOUNCE_TIME not between", value1, value2, "announceTime");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonIsNull() {
            addCriterion("ANNOUNCE_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonIsNotNull() {
            addCriterion("ANNOUNCE_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonEqualTo(String value) {
            addCriterion("ANNOUNCE_PERSON =", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonNotEqualTo(String value) {
            addCriterion("ANNOUNCE_PERSON <>", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonGreaterThan(String value) {
            addCriterion("ANNOUNCE_PERSON >", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonGreaterThanOrEqualTo(String value) {
            addCriterion("ANNOUNCE_PERSON >=", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonLessThan(String value) {
            addCriterion("ANNOUNCE_PERSON <", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonLessThanOrEqualTo(String value) {
            addCriterion("ANNOUNCE_PERSON <=", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonLike(String value) {
            addCriterion("ANNOUNCE_PERSON like", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonNotLike(String value) {
            addCriterion("ANNOUNCE_PERSON not like", value, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonIn(List<String> values) {
            addCriterion("ANNOUNCE_PERSON in", values, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonNotIn(List<String> values) {
            addCriterion("ANNOUNCE_PERSON not in", values, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonBetween(String value1, String value2) {
            addCriterion("ANNOUNCE_PERSON between", value1, value2, "announcePerson");
            return (Criteria) this;
        }

        public Criteria andAnnouncePersonNotBetween(String value1, String value2) {
            addCriterion("ANNOUNCE_PERSON not between", value1, value2, "announcePerson");
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