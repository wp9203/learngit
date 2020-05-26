package com.nantian.entity.sys;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysUserExample {
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
    public SysUserExample() {
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNull() {
            addCriterion("ORG_NO is null");
            return (Criteria) this;
        }

        public Criteria andOrgNoIsNotNull() {
            addCriterion("ORG_NO is not null");
            return (Criteria) this;
        }

        public Criteria andOrgNoEqualTo(String value) {
            addCriterion("ORG_NO =", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotEqualTo(String value) {
            addCriterion("ORG_NO <>", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThan(String value) {
            addCriterion("ORG_NO >", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_NO >=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThan(String value) {
            addCriterion("ORG_NO <", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLessThanOrEqualTo(String value) {
            addCriterion("ORG_NO <=", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoLike(String value) {
            addCriterion("ORG_NO like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotLike(String value) {
            addCriterion("ORG_NO not like", value, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoIn(List<String> values) {
            addCriterion("ORG_NO in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotIn(List<String> values) {
            addCriterion("ORG_NO not in", values, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoBetween(String value1, String value2) {
            addCriterion("ORG_NO between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andOrgNoNotBetween(String value1, String value2) {
            addCriterion("ORG_NO not between", value1, value2, "orgNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNull() {
            addCriterion("PHONE_NO is null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIsNotNull() {
            addCriterion("PHONE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneNoEqualTo(String value) {
            addCriterion("PHONE_NO =", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotEqualTo(String value) {
            addCriterion("PHONE_NO <>", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThan(String value) {
            addCriterion("PHONE_NO >", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NO >=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThan(String value) {
            addCriterion("PHONE_NO <", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NO <=", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoLike(String value) {
            addCriterion("PHONE_NO like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotLike(String value) {
            addCriterion("PHONE_NO not like", value, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoIn(List<String> values) {
            addCriterion("PHONE_NO in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotIn(List<String> values) {
            addCriterion("PHONE_NO not in", values, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoBetween(String value1, String value2) {
            addCriterion("PHONE_NO between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andPhoneNoNotBetween(String value1, String value2) {
            addCriterion("PHONE_NO not between", value1, value2, "phoneNo");
            return (Criteria) this;
        }

        public Criteria andLandlineIsNull() {
            addCriterion("LANDLINE is null");
            return (Criteria) this;
        }

        public Criteria andLandlineIsNotNull() {
            addCriterion("LANDLINE is not null");
            return (Criteria) this;
        }

        public Criteria andLandlineEqualTo(String value) {
            addCriterion("LANDLINE =", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotEqualTo(String value) {
            addCriterion("LANDLINE <>", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineGreaterThan(String value) {
            addCriterion("LANDLINE >", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineGreaterThanOrEqualTo(String value) {
            addCriterion("LANDLINE >=", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLessThan(String value) {
            addCriterion("LANDLINE <", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLessThanOrEqualTo(String value) {
            addCriterion("LANDLINE <=", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineLike(String value) {
            addCriterion("LANDLINE like", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotLike(String value) {
            addCriterion("LANDLINE not like", value, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineIn(List<String> values) {
            addCriterion("LANDLINE in", values, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotIn(List<String> values) {
            addCriterion("LANDLINE not in", values, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineBetween(String value1, String value2) {
            addCriterion("LANDLINE between", value1, value2, "landline");
            return (Criteria) this;
        }

        public Criteria andLandlineNotBetween(String value1, String value2) {
            addCriterion("LANDLINE not between", value1, value2, "landline");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("ID_CARD is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("ID_CARD is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("ID_CARD =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("ID_CARD <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("ID_CARD >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("ID_CARD >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("ID_CARD <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("ID_CARD <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("ID_CARD like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("ID_CARD not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("ID_CARD in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("ID_CARD not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("ID_CARD between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("ID_CARD not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andAdressIsNull() {
            addCriterion("ADRESS is null");
            return (Criteria) this;
        }

        public Criteria andAdressIsNotNull() {
            addCriterion("ADRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAdressEqualTo(String value) {
            addCriterion("ADRESS =", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotEqualTo(String value) {
            addCriterion("ADRESS <>", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThan(String value) {
            addCriterion("ADRESS >", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressGreaterThanOrEqualTo(String value) {
            addCriterion("ADRESS >=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThan(String value) {
            addCriterion("ADRESS <", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLessThanOrEqualTo(String value) {
            addCriterion("ADRESS <=", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressLike(String value) {
            addCriterion("ADRESS like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotLike(String value) {
            addCriterion("ADRESS not like", value, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressIn(List<String> values) {
            addCriterion("ADRESS in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotIn(List<String> values) {
            addCriterion("ADRESS not in", values, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressBetween(String value1, String value2) {
            addCriterion("ADRESS between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andAdressNotBetween(String value1, String value2) {
            addCriterion("ADRESS not between", value1, value2, "adress");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNull() {
            addCriterion("ZIP_CODE is null");
            return (Criteria) this;
        }

        public Criteria andZipCodeIsNotNull() {
            addCriterion("ZIP_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andZipCodeEqualTo(String value) {
            addCriterion("ZIP_CODE =", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotEqualTo(String value) {
            addCriterion("ZIP_CODE <>", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThan(String value) {
            addCriterion("ZIP_CODE >", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE >=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThan(String value) {
            addCriterion("ZIP_CODE <", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLessThanOrEqualTo(String value) {
            addCriterion("ZIP_CODE <=", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeLike(String value) {
            addCriterion("ZIP_CODE like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotLike(String value) {
            addCriterion("ZIP_CODE not like", value, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeIn(List<String> values) {
            addCriterion("ZIP_CODE in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotIn(List<String> values) {
            addCriterion("ZIP_CODE not in", values, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeBetween(String value1, String value2) {
            addCriterion("ZIP_CODE between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andZipCodeNotBetween(String value1, String value2) {
            addCriterion("ZIP_CODE not between", value1, value2, "zipCode");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("STATUS like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("STATUS not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNull() {
            addCriterion("EXTEND1 is null");
            return (Criteria) this;
        }

        public Criteria andExtend1IsNotNull() {
            addCriterion("EXTEND1 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend1EqualTo(String value) {
            addCriterion("EXTEND1 =", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotEqualTo(String value) {
            addCriterion("EXTEND1 <>", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThan(String value) {
            addCriterion("EXTEND1 >", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND1 >=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThan(String value) {
            addCriterion("EXTEND1 <", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1LessThanOrEqualTo(String value) {
            addCriterion("EXTEND1 <=", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Like(String value) {
            addCriterion("EXTEND1 like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotLike(String value) {
            addCriterion("EXTEND1 not like", value, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1In(List<String> values) {
            addCriterion("EXTEND1 in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotIn(List<String> values) {
            addCriterion("EXTEND1 not in", values, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1Between(String value1, String value2) {
            addCriterion("EXTEND1 between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend1NotBetween(String value1, String value2) {
            addCriterion("EXTEND1 not between", value1, value2, "extend1");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNull() {
            addCriterion("EXTEND2 is null");
            return (Criteria) this;
        }

        public Criteria andExtend2IsNotNull() {
            addCriterion("EXTEND2 is not null");
            return (Criteria) this;
        }

        public Criteria andExtend2EqualTo(String value) {
            addCriterion("EXTEND2 =", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotEqualTo(String value) {
            addCriterion("EXTEND2 <>", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThan(String value) {
            addCriterion("EXTEND2 >", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2GreaterThanOrEqualTo(String value) {
            addCriterion("EXTEND2 >=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThan(String value) {
            addCriterion("EXTEND2 <", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2LessThanOrEqualTo(String value) {
            addCriterion("EXTEND2 <=", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Like(String value) {
            addCriterion("EXTEND2 like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotLike(String value) {
            addCriterion("EXTEND2 not like", value, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2In(List<String> values) {
            addCriterion("EXTEND2 in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotIn(List<String> values) {
            addCriterion("EXTEND2 not in", values, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2Between(String value1, String value2) {
            addCriterion("EXTEND2 between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andExtend2NotBetween(String value1, String value2) {
            addCriterion("EXTEND2 not between", value1, value2, "extend2");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNull() {
            addCriterion("LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIsNotNull() {
            addCriterion("LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLoginTimeEqualTo(String value) {
            addCriterion("LOGIN_TIME =", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotEqualTo(String value) {
            addCriterion("LOGIN_TIME <>", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThan(String value) {
            addCriterion("LOGIN_TIME >", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_TIME >=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThan(String value) {
            addCriterion("LOGIN_TIME <", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_TIME <=", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeLike(String value) {
            addCriterion("LOGIN_TIME like", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotLike(String value) {
            addCriterion("LOGIN_TIME not like", value, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeIn(List<String> values) {
            addCriterion("LOGIN_TIME in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotIn(List<String> values) {
            addCriterion("LOGIN_TIME not in", values, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeBetween(String value1, String value2) {
            addCriterion("LOGIN_TIME between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLoginTimeNotBetween(String value1, String value2) {
            addCriterion("LOGIN_TIME not between", value1, value2, "loginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME =", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThan(Date value) {
            addCriterion("LAST_LOGIN_TIME >", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThan(Date value) {
            addCriterion("LAST_LOGIN_TIME <", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotIn(List<Date> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andLastLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "lastLoginTime");
            return (Criteria) this;
        }

        public Criteria andErrorCountIsNull() {
            addCriterion("ERROR_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andErrorCountIsNotNull() {
            addCriterion("ERROR_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andErrorCountEqualTo(Integer value) {
            addCriterion("ERROR_COUNT =", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountNotEqualTo(Integer value) {
            addCriterion("ERROR_COUNT <>", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountGreaterThan(Integer value) {
            addCriterion("ERROR_COUNT >", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ERROR_COUNT >=", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountLessThan(Integer value) {
            addCriterion("ERROR_COUNT <", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountLessThanOrEqualTo(Integer value) {
            addCriterion("ERROR_COUNT <=", value, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountIn(List<Integer> values) {
            addCriterion("ERROR_COUNT in", values, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountNotIn(List<Integer> values) {
            addCriterion("ERROR_COUNT not in", values, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_COUNT between", value1, value2, "errorCount");
            return (Criteria) this;
        }

        public Criteria andErrorCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ERROR_COUNT not between", value1, value2, "errorCount");
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

        public Criteria andCompanyIsNull() {
            addCriterion("COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIsNotNull() {
            addCriterion("COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyEqualTo(String value) {
            addCriterion("COMPANY =", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotEqualTo(String value) {
            addCriterion("COMPANY <>", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThan(String value) {
            addCriterion("COMPANY >", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("COMPANY >=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThan(String value) {
            addCriterion("COMPANY <", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLessThanOrEqualTo(String value) {
            addCriterion("COMPANY <=", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyLike(String value) {
            addCriterion("COMPANY like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotLike(String value) {
            addCriterion("COMPANY not like", value, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyIn(List<String> values) {
            addCriterion("COMPANY in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotIn(List<String> values) {
            addCriterion("COMPANY not in", values, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyBetween(String value1, String value2) {
            addCriterion("COMPANY between", value1, value2, "company");
            return (Criteria) this;
        }

        public Criteria andCompanyNotBetween(String value1, String value2) {
            addCriterion("COMPANY not between", value1, value2, "company");
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

        public Criteria andBirthDateIsNull() {
            addCriterion("BIRTH_DATE is null");
            return (Criteria) this;
        }

        public Criteria andBirthDateIsNotNull() {
            addCriterion("BIRTH_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andBirthDateEqualTo(String value) {
            addCriterion("BIRTH_DATE =", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotEqualTo(String value) {
            addCriterion("BIRTH_DATE <>", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThan(String value) {
            addCriterion("BIRTH_DATE >", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateGreaterThanOrEqualTo(String value) {
            addCriterion("BIRTH_DATE >=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThan(String value) {
            addCriterion("BIRTH_DATE <", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLessThanOrEqualTo(String value) {
            addCriterion("BIRTH_DATE <=", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateLike(String value) {
            addCriterion("BIRTH_DATE like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotLike(String value) {
            addCriterion("BIRTH_DATE not like", value, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateIn(List<String> values) {
            addCriterion("BIRTH_DATE in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotIn(List<String> values) {
            addCriterion("BIRTH_DATE not in", values, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateBetween(String value1, String value2) {
            addCriterion("BIRTH_DATE between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andBirthDateNotBetween(String value1, String value2) {
            addCriterion("BIRTH_DATE not between", value1, value2, "birthDate");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNull() {
            addCriterion("POLITICS_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIsNotNull() {
            addCriterion("POLITICS_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusEqualTo(String value) {
            addCriterion("POLITICS_STATUS =", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotEqualTo(String value) {
            addCriterion("POLITICS_STATUS <>", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThan(String value) {
            addCriterion("POLITICS_STATUS >", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusGreaterThanOrEqualTo(String value) {
            addCriterion("POLITICS_STATUS >=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThan(String value) {
            addCriterion("POLITICS_STATUS <", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLessThanOrEqualTo(String value) {
            addCriterion("POLITICS_STATUS <=", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusLike(String value) {
            addCriterion("POLITICS_STATUS like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotLike(String value) {
            addCriterion("POLITICS_STATUS not like", value, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusIn(List<String> values) {
            addCriterion("POLITICS_STATUS in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotIn(List<String> values) {
            addCriterion("POLITICS_STATUS not in", values, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusBetween(String value1, String value2) {
            addCriterion("POLITICS_STATUS between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andPoliticsStatusNotBetween(String value1, String value2) {
            addCriterion("POLITICS_STATUS not between", value1, value2, "politicsStatus");
            return (Criteria) this;
        }

        public Criteria andEducationIsNull() {
            addCriterion("EDUCATION is null");
            return (Criteria) this;
        }

        public Criteria andEducationIsNotNull() {
            addCriterion("EDUCATION is not null");
            return (Criteria) this;
        }

        public Criteria andEducationEqualTo(String value) {
            addCriterion("EDUCATION =", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotEqualTo(String value) {
            addCriterion("EDUCATION <>", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThan(String value) {
            addCriterion("EDUCATION >", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationGreaterThanOrEqualTo(String value) {
            addCriterion("EDUCATION >=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThan(String value) {
            addCriterion("EDUCATION <", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLessThanOrEqualTo(String value) {
            addCriterion("EDUCATION <=", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationLike(String value) {
            addCriterion("EDUCATION like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotLike(String value) {
            addCriterion("EDUCATION not like", value, "education");
            return (Criteria) this;
        }

        public Criteria andEducationIn(List<String> values) {
            addCriterion("EDUCATION in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotIn(List<String> values) {
            addCriterion("EDUCATION not in", values, "education");
            return (Criteria) this;
        }

        public Criteria andEducationBetween(String value1, String value2) {
            addCriterion("EDUCATION between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andEducationNotBetween(String value1, String value2) {
            addCriterion("EDUCATION not between", value1, value2, "education");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeIsNull() {
            addCriterion("IN_POSITION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeIsNotNull() {
            addCriterion("IN_POSITION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeEqualTo(String value) {
            addCriterion("IN_POSITION_TIME =", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeNotEqualTo(String value) {
            addCriterion("IN_POSITION_TIME <>", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeGreaterThan(String value) {
            addCriterion("IN_POSITION_TIME >", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_POSITION_TIME >=", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeLessThan(String value) {
            addCriterion("IN_POSITION_TIME <", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeLessThanOrEqualTo(String value) {
            addCriterion("IN_POSITION_TIME <=", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeLike(String value) {
            addCriterion("IN_POSITION_TIME like", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeNotLike(String value) {
            addCriterion("IN_POSITION_TIME not like", value, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeIn(List<String> values) {
            addCriterion("IN_POSITION_TIME in", values, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeNotIn(List<String> values) {
            addCriterion("IN_POSITION_TIME not in", values, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeBetween(String value1, String value2) {
            addCriterion("IN_POSITION_TIME between", value1, value2, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInPositionTimeNotBetween(String value1, String value2) {
            addCriterion("IN_POSITION_TIME not between", value1, value2, "inPositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeIsNull() {
            addCriterion("IN_SAME_POSITION_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeIsNotNull() {
            addCriterion("IN_SAME_POSITION_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_TIME =", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeNotEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_TIME <>", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeGreaterThan(String value) {
            addCriterion("IN_SAME_POSITION_TIME >", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_TIME >=", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeLessThan(String value) {
            addCriterion("IN_SAME_POSITION_TIME <", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeLessThanOrEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_TIME <=", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeLike(String value) {
            addCriterion("IN_SAME_POSITION_TIME like", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeNotLike(String value) {
            addCriterion("IN_SAME_POSITION_TIME not like", value, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeIn(List<String> values) {
            addCriterion("IN_SAME_POSITION_TIME in", values, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeNotIn(List<String> values) {
            addCriterion("IN_SAME_POSITION_TIME not in", values, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeBetween(String value1, String value2) {
            addCriterion("IN_SAME_POSITION_TIME between", value1, value2, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionTimeNotBetween(String value1, String value2) {
            addCriterion("IN_SAME_POSITION_TIME not between", value1, value2, "inSamePositionTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeIsNull() {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME is null");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeIsNotNull() {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME =", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeNotEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME <>", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeGreaterThan(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME >", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeGreaterThanOrEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME >=", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeLessThan(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME <", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeLessThanOrEqualTo(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME <=", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeLike(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME like", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeNotLike(String value) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME not like", value, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeIn(List<String> values) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME in", values, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeNotIn(List<String> values) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME not in", values, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeBetween(String value1, String value2) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME between", value1, value2, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andInSamePositionLevelTimeNotBetween(String value1, String value2) {
            addCriterion("IN_SAME_POSITION_LEVEL_TIME not between", value1, value2, "inSamePositionLevelTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeIsNull() {
            addCriterion("INTO_BANK_TIME is null");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeIsNotNull() {
            addCriterion("INTO_BANK_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeEqualTo(String value) {
            addCriterion("INTO_BANK_TIME =", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeNotEqualTo(String value) {
            addCriterion("INTO_BANK_TIME <>", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeGreaterThan(String value) {
            addCriterion("INTO_BANK_TIME >", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeGreaterThanOrEqualTo(String value) {
            addCriterion("INTO_BANK_TIME >=", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeLessThan(String value) {
            addCriterion("INTO_BANK_TIME <", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeLessThanOrEqualTo(String value) {
            addCriterion("INTO_BANK_TIME <=", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeLike(String value) {
            addCriterion("INTO_BANK_TIME like", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeNotLike(String value) {
            addCriterion("INTO_BANK_TIME not like", value, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeIn(List<String> values) {
            addCriterion("INTO_BANK_TIME in", values, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeNotIn(List<String> values) {
            addCriterion("INTO_BANK_TIME not in", values, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeBetween(String value1, String value2) {
            addCriterion("INTO_BANK_TIME between", value1, value2, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andIntoBankTimeNotBetween(String value1, String value2) {
            addCriterion("INTO_BANK_TIME not between", value1, value2, "intoBankTime");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultIsNull() {
            addCriterion("LAST_YEAR_INSPECTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultIsNotNull() {
            addCriterion("LAST_YEAR_INSPECTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultEqualTo(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT =", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultNotEqualTo(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT <>", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultGreaterThan(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT >", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT >=", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultLessThan(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT <", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultLessThanOrEqualTo(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT <=", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultLike(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT like", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultNotLike(String value) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT not like", value, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultIn(List<String> values) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT in", values, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultNotIn(List<String> values) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT not in", values, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultBetween(String value1, String value2) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT between", value1, value2, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andLastYearInspectionResultNotBetween(String value1, String value2) {
            addCriterion("LAST_YEAR_INSPECTION_RESULT not between", value1, value2, "lastYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andPunishmentIsNull() {
            addCriterion("PUNISHMENT is null");
            return (Criteria) this;
        }

        public Criteria andPunishmentIsNotNull() {
            addCriterion("PUNISHMENT is not null");
            return (Criteria) this;
        }

        public Criteria andPunishmentEqualTo(String value) {
            addCriterion("PUNISHMENT =", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentNotEqualTo(String value) {
            addCriterion("PUNISHMENT <>", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentGreaterThan(String value) {
            addCriterion("PUNISHMENT >", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentGreaterThanOrEqualTo(String value) {
            addCriterion("PUNISHMENT >=", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentLessThan(String value) {
            addCriterion("PUNISHMENT <", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentLessThanOrEqualTo(String value) {
            addCriterion("PUNISHMENT <=", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentLike(String value) {
            addCriterion("PUNISHMENT like", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentNotLike(String value) {
            addCriterion("PUNISHMENT not like", value, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentIn(List<String> values) {
            addCriterion("PUNISHMENT in", values, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentNotIn(List<String> values) {
            addCriterion("PUNISHMENT not in", values, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentBetween(String value1, String value2) {
            addCriterion("PUNISHMENT between", value1, value2, "punishment");
            return (Criteria) this;
        }

        public Criteria andPunishmentNotBetween(String value1, String value2) {
            addCriterion("PUNISHMENT not between", value1, value2, "punishment");
            return (Criteria) this;
        }

        public Criteria andExceptionalIsNull() {
            addCriterion("EXCEPTIONAL is null");
            return (Criteria) this;
        }

        public Criteria andExceptionalIsNotNull() {
            addCriterion("EXCEPTIONAL is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionalEqualTo(String value) {
            addCriterion("EXCEPTIONAL =", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalNotEqualTo(String value) {
            addCriterion("EXCEPTIONAL <>", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalGreaterThan(String value) {
            addCriterion("EXCEPTIONAL >", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalGreaterThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONAL >=", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalLessThan(String value) {
            addCriterion("EXCEPTIONAL <", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalLessThanOrEqualTo(String value) {
            addCriterion("EXCEPTIONAL <=", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalLike(String value) {
            addCriterion("EXCEPTIONAL like", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalNotLike(String value) {
            addCriterion("EXCEPTIONAL not like", value, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalIn(List<String> values) {
            addCriterion("EXCEPTIONAL in", values, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalNotIn(List<String> values) {
            addCriterion("EXCEPTIONAL not in", values, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalBetween(String value1, String value2) {
            addCriterion("EXCEPTIONAL between", value1, value2, "exceptional");
            return (Criteria) this;
        }

        public Criteria andExceptionalNotBetween(String value1, String value2) {
            addCriterion("EXCEPTIONAL not between", value1, value2, "exceptional");
            return (Criteria) this;
        }

        public Criteria andAvoidIsNull() {
            addCriterion("AVOID is null");
            return (Criteria) this;
        }

        public Criteria andAvoidIsNotNull() {
            addCriterion("AVOID is not null");
            return (Criteria) this;
        }

        public Criteria andAvoidEqualTo(String value) {
            addCriterion("AVOID =", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidNotEqualTo(String value) {
            addCriterion("AVOID <>", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidGreaterThan(String value) {
            addCriterion("AVOID >", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidGreaterThanOrEqualTo(String value) {
            addCriterion("AVOID >=", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidLessThan(String value) {
            addCriterion("AVOID <", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidLessThanOrEqualTo(String value) {
            addCriterion("AVOID <=", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidLike(String value) {
            addCriterion("AVOID like", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidNotLike(String value) {
            addCriterion("AVOID not like", value, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidIn(List<String> values) {
            addCriterion("AVOID in", values, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidNotIn(List<String> values) {
            addCriterion("AVOID not in", values, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidBetween(String value1, String value2) {
            addCriterion("AVOID between", value1, value2, "avoid");
            return (Criteria) this;
        }

        public Criteria andAvoidNotBetween(String value1, String value2) {
            addCriterion("AVOID not between", value1, value2, "avoid");
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

        public Criteria andRecommendationLetterIsNull() {
            addCriterion("RECOMMENDATION_LETTER is null");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterIsNotNull() {
            addCriterion("RECOMMENDATION_LETTER is not null");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterEqualTo(String value) {
            addCriterion("RECOMMENDATION_LETTER =", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterNotEqualTo(String value) {
            addCriterion("RECOMMENDATION_LETTER <>", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterGreaterThan(String value) {
            addCriterion("RECOMMENDATION_LETTER >", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterGreaterThanOrEqualTo(String value) {
            addCriterion("RECOMMENDATION_LETTER >=", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterLessThan(String value) {
            addCriterion("RECOMMENDATION_LETTER <", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterLessThanOrEqualTo(String value) {
            addCriterion("RECOMMENDATION_LETTER <=", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterLike(String value) {
            addCriterion("RECOMMENDATION_LETTER like", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterNotLike(String value) {
            addCriterion("RECOMMENDATION_LETTER not like", value, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterIn(List<String> values) {
            addCriterion("RECOMMENDATION_LETTER in", values, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterNotIn(List<String> values) {
            addCriterion("RECOMMENDATION_LETTER not in", values, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterBetween(String value1, String value2) {
            addCriterion("RECOMMENDATION_LETTER between", value1, value2, "recommendationLetter");
            return (Criteria) this;
        }

        public Criteria andRecommendationLetterNotBetween(String value1, String value2) {
            addCriterion("RECOMMENDATION_LETTER not between", value1, value2, "recommendationLetter");
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

        public Criteria andUsernoIsNull() {
            addCriterion("USERNO is null");
            return (Criteria) this;
        }

        public Criteria andUsernoIsNotNull() {
            addCriterion("USERNO is not null");
            return (Criteria) this;
        }

        public Criteria andUsernoEqualTo(String value) {
            addCriterion("USERNO =", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotEqualTo(String value) {
            addCriterion("USERNO <>", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThan(String value) {
            addCriterion("USERNO >", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoGreaterThanOrEqualTo(String value) {
            addCriterion("USERNO >=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThan(String value) {
            addCriterion("USERNO <", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLessThanOrEqualTo(String value) {
            addCriterion("USERNO <=", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoLike(String value) {
            addCriterion("USERNO like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotLike(String value) {
            addCriterion("USERNO not like", value, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoIn(List<String> values) {
            addCriterion("USERNO in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotIn(List<String> values) {
            addCriterion("USERNO not in", values, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoBetween(String value1, String value2) {
            addCriterion("USERNO between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andUsernoNotBetween(String value1, String value2) {
            addCriterion("USERNO not between", value1, value2, "userno");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNull() {
            addCriterion("ORG_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIsNotNull() {
            addCriterion("ORG_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOrgTypeEqualTo(String value) {
            addCriterion("ORG_TYPE =", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotEqualTo(String value) {
            addCriterion("ORG_TYPE <>", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThan(String value) {
            addCriterion("ORG_TYPE >", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE >=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThan(String value) {
            addCriterion("ORG_TYPE <", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLessThanOrEqualTo(String value) {
            addCriterion("ORG_TYPE <=", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeLike(String value) {
            addCriterion("ORG_TYPE like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotLike(String value) {
            addCriterion("ORG_TYPE not like", value, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeIn(List<String> values) {
            addCriterion("ORG_TYPE in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotIn(List<String> values) {
            addCriterion("ORG_TYPE not in", values, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeBetween(String value1, String value2) {
            addCriterion("ORG_TYPE between", value1, value2, "orgType");
            return (Criteria) this;
        }

        public Criteria andOrgTypeNotBetween(String value1, String value2) {
            addCriterion("ORG_TYPE not between", value1, value2, "orgType");
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

        public Criteria andPositionSerialIsNull() {
            addCriterion("POSITION_SERIAL is null");
            return (Criteria) this;
        }

        public Criteria andPositionSerialIsNotNull() {
            addCriterion("POSITION_SERIAL is not null");
            return (Criteria) this;
        }

        public Criteria andPositionSerialEqualTo(String value) {
            addCriterion("POSITION_SERIAL =", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialNotEqualTo(String value) {
            addCriterion("POSITION_SERIAL <>", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialGreaterThan(String value) {
            addCriterion("POSITION_SERIAL >", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialGreaterThanOrEqualTo(String value) {
            addCriterion("POSITION_SERIAL >=", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialLessThan(String value) {
            addCriterion("POSITION_SERIAL <", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialLessThanOrEqualTo(String value) {
            addCriterion("POSITION_SERIAL <=", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialLike(String value) {
            addCriterion("POSITION_SERIAL like", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialNotLike(String value) {
            addCriterion("POSITION_SERIAL not like", value, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialIn(List<String> values) {
            addCriterion("POSITION_SERIAL in", values, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialNotIn(List<String> values) {
            addCriterion("POSITION_SERIAL not in", values, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialBetween(String value1, String value2) {
            addCriterion("POSITION_SERIAL between", value1, value2, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andPositionSerialNotBetween(String value1, String value2) {
            addCriterion("POSITION_SERIAL not between", value1, value2, "positionSerial");
            return (Criteria) this;
        }

        public Criteria andSkillLevelIsNull() {
            addCriterion("SKILL_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andSkillLevelIsNotNull() {
            addCriterion("SKILL_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andSkillLevelEqualTo(String value) {
            addCriterion("SKILL_LEVEL =", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelNotEqualTo(String value) {
            addCriterion("SKILL_LEVEL <>", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelGreaterThan(String value) {
            addCriterion("SKILL_LEVEL >", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelGreaterThanOrEqualTo(String value) {
            addCriterion("SKILL_LEVEL >=", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelLessThan(String value) {
            addCriterion("SKILL_LEVEL <", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelLessThanOrEqualTo(String value) {
            addCriterion("SKILL_LEVEL <=", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelLike(String value) {
            addCriterion("SKILL_LEVEL like", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelNotLike(String value) {
            addCriterion("SKILL_LEVEL not like", value, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelIn(List<String> values) {
            addCriterion("SKILL_LEVEL in", values, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelNotIn(List<String> values) {
            addCriterion("SKILL_LEVEL not in", values, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelBetween(String value1, String value2) {
            addCriterion("SKILL_LEVEL between", value1, value2, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andSkillLevelNotBetween(String value1, String value2) {
            addCriterion("SKILL_LEVEL not between", value1, value2, "skillLevel");
            return (Criteria) this;
        }

        public Criteria andAgeIsNull() {
            addCriterion("AGE is null");
            return (Criteria) this;
        }

        public Criteria andAgeIsNotNull() {
            addCriterion("AGE is not null");
            return (Criteria) this;
        }

        public Criteria andAgeEqualTo(String value) {
            addCriterion("AGE =", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotEqualTo(String value) {
            addCriterion("AGE <>", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThan(String value) {
            addCriterion("AGE >", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeGreaterThanOrEqualTo(String value) {
            addCriterion("AGE >=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThan(String value) {
            addCriterion("AGE <", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLessThanOrEqualTo(String value) {
            addCriterion("AGE <=", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeLike(String value) {
            addCriterion("AGE like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotLike(String value) {
            addCriterion("AGE not like", value, "age");
            return (Criteria) this;
        }

        public Criteria andAgeIn(List<String> values) {
            addCriterion("AGE in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotIn(List<String> values) {
            addCriterion("AGE not in", values, "age");
            return (Criteria) this;
        }

        public Criteria andAgeBetween(String value1, String value2) {
            addCriterion("AGE between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andAgeNotBetween(String value1, String value2) {
            addCriterion("AGE not between", value1, value2, "age");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationIsNull() {
            addCriterion("SKILL_QUALIFICATION is null");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationIsNotNull() {
            addCriterion("SKILL_QUALIFICATION is not null");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationEqualTo(String value) {
            addCriterion("SKILL_QUALIFICATION =", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationNotEqualTo(String value) {
            addCriterion("SKILL_QUALIFICATION <>", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationGreaterThan(String value) {
            addCriterion("SKILL_QUALIFICATION >", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationGreaterThanOrEqualTo(String value) {
            addCriterion("SKILL_QUALIFICATION >=", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationLessThan(String value) {
            addCriterion("SKILL_QUALIFICATION <", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationLessThanOrEqualTo(String value) {
            addCriterion("SKILL_QUALIFICATION <=", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationLike(String value) {
            addCriterion("SKILL_QUALIFICATION like", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationNotLike(String value) {
            addCriterion("SKILL_QUALIFICATION not like", value, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationIn(List<String> values) {
            addCriterion("SKILL_QUALIFICATION in", values, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationNotIn(List<String> values) {
            addCriterion("SKILL_QUALIFICATION not in", values, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationBetween(String value1, String value2) {
            addCriterion("SKILL_QUALIFICATION between", value1, value2, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSkillQualificationNotBetween(String value1, String value2) {
            addCriterion("SKILL_QUALIFICATION not between", value1, value2, "skillQualification");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultIsNull() {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultIsNotNull() {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultEqualTo(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT =", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultNotEqualTo(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT <>", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultGreaterThan(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT >", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT >=", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultLessThan(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT <", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultLessThanOrEqualTo(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT <=", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultLike(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT like", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultNotLike(String value) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT not like", value, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultIn(List<String> values) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT in", values, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultNotIn(List<String> values) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT not in", values, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultBetween(String value1, String value2) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT between", value1, value2, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andSecondYearInspectionResultNotBetween(String value1, String value2) {
            addCriterion("SECOND_YEAR_INSPECTION_RESULT not between", value1, value2, "secondYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultIsNull() {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultIsNotNull() {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultEqualTo(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT =", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultNotEqualTo(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT <>", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultGreaterThan(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT >", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultGreaterThanOrEqualTo(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT >=", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultLessThan(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT <", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultLessThanOrEqualTo(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT <=", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultLike(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT like", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultNotLike(String value) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT not like", value, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultIn(List<String> values) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT in", values, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultNotIn(List<String> values) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT not in", values, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultBetween(String value1, String value2) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT between", value1, value2, "thirdYearInspectionResult");
            return (Criteria) this;
        }

        public Criteria andThirdYearInspectionResultNotBetween(String value1, String value2) {
            addCriterion("THIRD_YEAR_INSPECTION_RESULT not between", value1, value2, "thirdYearInspectionResult");
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