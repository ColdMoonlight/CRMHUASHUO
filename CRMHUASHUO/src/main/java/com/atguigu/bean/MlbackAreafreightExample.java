package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackAreafreightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackAreafreightExample() {
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

        public Criteria andAreafreightIdIsNull() {
            addCriterion("areafreight_id is null");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdIsNotNull() {
            addCriterion("areafreight_id is not null");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdEqualTo(Integer value) {
            addCriterion("areafreight_id =", value, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdNotEqualTo(Integer value) {
            addCriterion("areafreight_id <>", value, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdGreaterThan(Integer value) {
            addCriterion("areafreight_id >", value, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("areafreight_id >=", value, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdLessThan(Integer value) {
            addCriterion("areafreight_id <", value, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdLessThanOrEqualTo(Integer value) {
            addCriterion("areafreight_id <=", value, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdIn(List<Integer> values) {
            addCriterion("areafreight_id in", values, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdNotIn(List<Integer> values) {
            addCriterion("areafreight_id not in", values, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdBetween(Integer value1, Integer value2) {
            addCriterion("areafreight_id between", value1, value2, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("areafreight_id not between", value1, value2, "areafreightId");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishIsNull() {
            addCriterion("areafreight_country_English is null");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishIsNotNull() {
            addCriterion("areafreight_country_English is not null");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishEqualTo(String value) {
            addCriterion("areafreight_country_English =", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishNotEqualTo(String value) {
            addCriterion("areafreight_country_English <>", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishGreaterThan(String value) {
            addCriterion("areafreight_country_English >", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishGreaterThanOrEqualTo(String value) {
            addCriterion("areafreight_country_English >=", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishLessThan(String value) {
            addCriterion("areafreight_country_English <", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishLessThanOrEqualTo(String value) {
            addCriterion("areafreight_country_English <=", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishLike(String value) {
            addCriterion("areafreight_country_English like", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishNotLike(String value) {
            addCriterion("areafreight_country_English not like", value, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishIn(List<String> values) {
            addCriterion("areafreight_country_English in", values, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishNotIn(List<String> values) {
            addCriterion("areafreight_country_English not in", values, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishBetween(String value1, String value2) {
            addCriterion("areafreight_country_English between", value1, value2, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEnglishNotBetween(String value1, String value2) {
            addCriterion("areafreight_country_English not between", value1, value2, "areafreightCountryEnglish");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryIsNull() {
            addCriterion("areafreight_country is null");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryIsNotNull() {
            addCriterion("areafreight_country is not null");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryEqualTo(String value) {
            addCriterion("areafreight_country =", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryNotEqualTo(String value) {
            addCriterion("areafreight_country <>", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryGreaterThan(String value) {
            addCriterion("areafreight_country >", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryGreaterThanOrEqualTo(String value) {
            addCriterion("areafreight_country >=", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryLessThan(String value) {
            addCriterion("areafreight_country <", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryLessThanOrEqualTo(String value) {
            addCriterion("areafreight_country <=", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryLike(String value) {
            addCriterion("areafreight_country like", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryNotLike(String value) {
            addCriterion("areafreight_country not like", value, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryIn(List<String> values) {
            addCriterion("areafreight_country in", values, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryNotIn(List<String> values) {
            addCriterion("areafreight_country not in", values, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryBetween(String value1, String value2) {
            addCriterion("areafreight_country between", value1, value2, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightCountryNotBetween(String value1, String value2) {
            addCriterion("areafreight_country not between", value1, value2, "areafreightCountry");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceIsNull() {
            addCriterion("areafreight_price is null");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceIsNotNull() {
            addCriterion("areafreight_price is not null");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceEqualTo(Integer value) {
            addCriterion("areafreight_price =", value, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceNotEqualTo(Integer value) {
            addCriterion("areafreight_price <>", value, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceGreaterThan(Integer value) {
            addCriterion("areafreight_price >", value, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("areafreight_price >=", value, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceLessThan(Integer value) {
            addCriterion("areafreight_price <", value, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceLessThanOrEqualTo(Integer value) {
            addCriterion("areafreight_price <=", value, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceIn(List<Integer> values) {
            addCriterion("areafreight_price in", values, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceNotIn(List<Integer> values) {
            addCriterion("areafreight_price not in", values, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceBetween(Integer value1, Integer value2) {
            addCriterion("areafreight_price between", value1, value2, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("areafreight_price not between", value1, value2, "areafreightPrice");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeIsNull() {
            addCriterion("areafreight_createTime is null");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeIsNotNull() {
            addCriterion("areafreight_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeEqualTo(String value) {
            addCriterion("areafreight_createTime =", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeNotEqualTo(String value) {
            addCriterion("areafreight_createTime <>", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeGreaterThan(String value) {
            addCriterion("areafreight_createTime >", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("areafreight_createTime >=", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeLessThan(String value) {
            addCriterion("areafreight_createTime <", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("areafreight_createTime <=", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeLike(String value) {
            addCriterion("areafreight_createTime like", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeNotLike(String value) {
            addCriterion("areafreight_createTime not like", value, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeIn(List<String> values) {
            addCriterion("areafreight_createTime in", values, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeNotIn(List<String> values) {
            addCriterion("areafreight_createTime not in", values, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeBetween(String value1, String value2) {
            addCriterion("areafreight_createTime between", value1, value2, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightCreatetimeNotBetween(String value1, String value2) {
            addCriterion("areafreight_createTime not between", value1, value2, "areafreightCreatetime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeIsNull() {
            addCriterion("areafreight_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeIsNotNull() {
            addCriterion("areafreight_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeEqualTo(String value) {
            addCriterion("areafreight_motifyTime =", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeNotEqualTo(String value) {
            addCriterion("areafreight_motifyTime <>", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeGreaterThan(String value) {
            addCriterion("areafreight_motifyTime >", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("areafreight_motifyTime >=", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeLessThan(String value) {
            addCriterion("areafreight_motifyTime <", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("areafreight_motifyTime <=", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeLike(String value) {
            addCriterion("areafreight_motifyTime like", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeNotLike(String value) {
            addCriterion("areafreight_motifyTime not like", value, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeIn(List<String> values) {
            addCriterion("areafreight_motifyTime in", values, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeNotIn(List<String> values) {
            addCriterion("areafreight_motifyTime not in", values, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeBetween(String value1, String value2) {
            addCriterion("areafreight_motifyTime between", value1, value2, "areafreightMotifytime");
            return (Criteria) this;
        }

        public Criteria andAreafreightMotifytimeNotBetween(String value1, String value2) {
            addCriterion("areafreight_motifyTime not between", value1, value2, "areafreightMotifytime");
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