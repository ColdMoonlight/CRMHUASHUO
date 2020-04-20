package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlPaypalStateprovinceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlPaypalStateprovinceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

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

        public Criteria andStateprovinceIdIsNull() {
            addCriterion("stateprovince_id is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdIsNotNull() {
            addCriterion("stateprovince_id is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdEqualTo(Integer value) {
            addCriterion("stateprovince_id =", value, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdNotEqualTo(Integer value) {
            addCriterion("stateprovince_id <>", value, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdGreaterThan(Integer value) {
            addCriterion("stateprovince_id >", value, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("stateprovince_id >=", value, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdLessThan(Integer value) {
            addCriterion("stateprovince_id <", value, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("stateprovince_id <=", value, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdIn(List<Integer> values) {
            addCriterion("stateprovince_id in", values, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdNotIn(List<Integer> values) {
            addCriterion("stateprovince_id not in", values, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdBetween(Integer value1, Integer value2) {
            addCriterion("stateprovince_id between", value1, value2, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("stateprovince_id not between", value1, value2, "stateprovinceId");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeIsNull() {
            addCriterion("stateprovince_name_code is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeIsNotNull() {
            addCriterion("stateprovince_name_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeEqualTo(String value) {
            addCriterion("stateprovince_name_code =", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeNotEqualTo(String value) {
            addCriterion("stateprovince_name_code <>", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeGreaterThan(String value) {
            addCriterion("stateprovince_name_code >", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stateprovince_name_code >=", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeLessThan(String value) {
            addCriterion("stateprovince_name_code <", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeLessThanOrEqualTo(String value) {
            addCriterion("stateprovince_name_code <=", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeLike(String value) {
            addCriterion("stateprovince_name_code like", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeNotLike(String value) {
            addCriterion("stateprovince_name_code not like", value, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeIn(List<String> values) {
            addCriterion("stateprovince_name_code in", values, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeNotIn(List<String> values) {
            addCriterion("stateprovince_name_code not in", values, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeBetween(String value1, String value2) {
            addCriterion("stateprovince_name_code between", value1, value2, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameCodeNotBetween(String value1, String value2) {
            addCriterion("stateprovince_name_code not between", value1, value2, "stateprovinceNameCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameIsNull() {
            addCriterion("stateprovince_name is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameIsNotNull() {
            addCriterion("stateprovince_name is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameEqualTo(String value) {
            addCriterion("stateprovince_name =", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameNotEqualTo(String value) {
            addCriterion("stateprovince_name <>", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameGreaterThan(String value) {
            addCriterion("stateprovince_name >", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameGreaterThanOrEqualTo(String value) {
            addCriterion("stateprovince_name >=", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameLessThan(String value) {
            addCriterion("stateprovince_name <", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameLessThanOrEqualTo(String value) {
            addCriterion("stateprovince_name <=", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameLike(String value) {
            addCriterion("stateprovince_name like", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameNotLike(String value) {
            addCriterion("stateprovince_name not like", value, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameIn(List<String> values) {
            addCriterion("stateprovince_name in", values, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameNotIn(List<String> values) {
            addCriterion("stateprovince_name not in", values, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameBetween(String value1, String value2) {
            addCriterion("stateprovince_name between", value1, value2, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceNameNotBetween(String value1, String value2) {
            addCriterion("stateprovince_name not between", value1, value2, "stateprovinceName");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeIsNull() {
            addCriterion("stateprovince_country_code is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeIsNotNull() {
            addCriterion("stateprovince_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeEqualTo(String value) {
            addCriterion("stateprovince_country_code =", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeNotEqualTo(String value) {
            addCriterion("stateprovince_country_code <>", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeGreaterThan(String value) {
            addCriterion("stateprovince_country_code >", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("stateprovince_country_code >=", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeLessThan(String value) {
            addCriterion("stateprovince_country_code <", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("stateprovince_country_code <=", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeLike(String value) {
            addCriterion("stateprovince_country_code like", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeNotLike(String value) {
            addCriterion("stateprovince_country_code not like", value, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeIn(List<String> values) {
            addCriterion("stateprovince_country_code in", values, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeNotIn(List<String> values) {
            addCriterion("stateprovince_country_code not in", values, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeBetween(String value1, String value2) {
            addCriterion("stateprovince_country_code between", value1, value2, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryCodeNotBetween(String value1, String value2) {
            addCriterion("stateprovince_country_code not between", value1, value2, "stateprovinceCountryCode");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryIsNull() {
            addCriterion("stateprovince_country is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryIsNotNull() {
            addCriterion("stateprovince_country is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryEqualTo(String value) {
            addCriterion("stateprovince_country =", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryNotEqualTo(String value) {
            addCriterion("stateprovince_country <>", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryGreaterThan(String value) {
            addCriterion("stateprovince_country >", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryGreaterThanOrEqualTo(String value) {
            addCriterion("stateprovince_country >=", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryLessThan(String value) {
            addCriterion("stateprovince_country <", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryLessThanOrEqualTo(String value) {
            addCriterion("stateprovince_country <=", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryLike(String value) {
            addCriterion("stateprovince_country like", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryNotLike(String value) {
            addCriterion("stateprovince_country not like", value, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryIn(List<String> values) {
            addCriterion("stateprovince_country in", values, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryNotIn(List<String> values) {
            addCriterion("stateprovince_country not in", values, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryBetween(String value1, String value2) {
            addCriterion("stateprovince_country between", value1, value2, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCountryNotBetween(String value1, String value2) {
            addCriterion("stateprovince_country not between", value1, value2, "stateprovinceCountry");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeIsNull() {
            addCriterion("stateprovince_createTime is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeIsNotNull() {
            addCriterion("stateprovince_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeEqualTo(String value) {
            addCriterion("stateprovince_createTime =", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeNotEqualTo(String value) {
            addCriterion("stateprovince_createTime <>", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeGreaterThan(String value) {
            addCriterion("stateprovince_createTime >", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("stateprovince_createTime >=", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeLessThan(String value) {
            addCriterion("stateprovince_createTime <", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("stateprovince_createTime <=", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeLike(String value) {
            addCriterion("stateprovince_createTime like", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeNotLike(String value) {
            addCriterion("stateprovince_createTime not like", value, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeIn(List<String> values) {
            addCriterion("stateprovince_createTime in", values, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeNotIn(List<String> values) {
            addCriterion("stateprovince_createTime not in", values, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeBetween(String value1, String value2) {
            addCriterion("stateprovince_createTime between", value1, value2, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceCreatetimeNotBetween(String value1, String value2) {
            addCriterion("stateprovince_createTime not between", value1, value2, "stateprovinceCreatetime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeIsNull() {
            addCriterion("stateprovince_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeIsNotNull() {
            addCriterion("stateprovince_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeEqualTo(String value) {
            addCriterion("stateprovince_motifyTime =", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeNotEqualTo(String value) {
            addCriterion("stateprovince_motifyTime <>", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeGreaterThan(String value) {
            addCriterion("stateprovince_motifyTime >", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("stateprovince_motifyTime >=", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeLessThan(String value) {
            addCriterion("stateprovince_motifyTime <", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("stateprovince_motifyTime <=", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeLike(String value) {
            addCriterion("stateprovince_motifyTime like", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeNotLike(String value) {
            addCriterion("stateprovince_motifyTime not like", value, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeIn(List<String> values) {
            addCriterion("stateprovince_motifyTime in", values, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeNotIn(List<String> values) {
            addCriterion("stateprovince_motifyTime not in", values, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeBetween(String value1, String value2) {
            addCriterion("stateprovince_motifyTime between", value1, value2, "stateprovinceMotifytime");
            return (Criteria) this;
        }

        public Criteria andStateprovinceMotifytimeNotBetween(String value1, String value2) {
            addCriterion("stateprovince_motifyTime not between", value1, value2, "stateprovinceMotifytime");
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