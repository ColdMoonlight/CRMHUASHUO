package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackProductViewDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackProductViewDetailExample() {
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

        public Criteria andProviewdetailIdIsNull() {
            addCriterion("proViewDetail_id is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdIsNotNull() {
            addCriterion("proViewDetail_id is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdEqualTo(Integer value) {
            addCriterion("proViewDetail_id =", value, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdNotEqualTo(Integer value) {
            addCriterion("proViewDetail_id <>", value, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdGreaterThan(Integer value) {
            addCriterion("proViewDetail_id >", value, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("proViewDetail_id >=", value, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdLessThan(Integer value) {
            addCriterion("proViewDetail_id <", value, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("proViewDetail_id <=", value, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdIn(List<Integer> values) {
            addCriterion("proViewDetail_id in", values, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdNotIn(List<Integer> values) {
            addCriterion("proViewDetail_id not in", values, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdBetween(Integer value1, Integer value2) {
            addCriterion("proViewDetail_id between", value1, value2, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("proViewDetail_id not between", value1, value2, "proviewdetailId");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidIsNull() {
            addCriterion("proViewDetail_sessionid is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidIsNotNull() {
            addCriterion("proViewDetail_sessionid is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidEqualTo(String value) {
            addCriterion("proViewDetail_sessionid =", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidNotEqualTo(String value) {
            addCriterion("proViewDetail_sessionid <>", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidGreaterThan(String value) {
            addCriterion("proViewDetail_sessionid >", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidGreaterThanOrEqualTo(String value) {
            addCriterion("proViewDetail_sessionid >=", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidLessThan(String value) {
            addCriterion("proViewDetail_sessionid <", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidLessThanOrEqualTo(String value) {
            addCriterion("proViewDetail_sessionid <=", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidLike(String value) {
            addCriterion("proViewDetail_sessionid like", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidNotLike(String value) {
            addCriterion("proViewDetail_sessionid not like", value, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidIn(List<String> values) {
            addCriterion("proViewDetail_sessionid in", values, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidNotIn(List<String> values) {
            addCriterion("proViewDetail_sessionid not in", values, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidBetween(String value1, String value2) {
            addCriterion("proViewDetail_sessionid between", value1, value2, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSessionidNotBetween(String value1, String value2) {
            addCriterion("proViewDetail_sessionid not between", value1, value2, "proviewdetailSessionid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameIsNull() {
            addCriterion("proViewDetail_name is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameIsNotNull() {
            addCriterion("proViewDetail_name is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameEqualTo(String value) {
            addCriterion("proViewDetail_name =", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameNotEqualTo(String value) {
            addCriterion("proViewDetail_name <>", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameGreaterThan(String value) {
            addCriterion("proViewDetail_name >", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("proViewDetail_name >=", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameLessThan(String value) {
            addCriterion("proViewDetail_name <", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameLessThanOrEqualTo(String value) {
            addCriterion("proViewDetail_name <=", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameLike(String value) {
            addCriterion("proViewDetail_name like", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameNotLike(String value) {
            addCriterion("proViewDetail_name not like", value, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameIn(List<String> values) {
            addCriterion("proViewDetail_name in", values, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameNotIn(List<String> values) {
            addCriterion("proViewDetail_name not in", values, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameBetween(String value1, String value2) {
            addCriterion("proViewDetail_name between", value1, value2, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailNameNotBetween(String value1, String value2) {
            addCriterion("proViewDetail_name not between", value1, value2, "proviewdetailName");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidIsNull() {
            addCriterion("proViewDetail_proid is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidIsNotNull() {
            addCriterion("proViewDetail_proid is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidEqualTo(Integer value) {
            addCriterion("proViewDetail_proid =", value, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidNotEqualTo(Integer value) {
            addCriterion("proViewDetail_proid <>", value, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidGreaterThan(Integer value) {
            addCriterion("proViewDetail_proid >", value, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidGreaterThanOrEqualTo(Integer value) {
            addCriterion("proViewDetail_proid >=", value, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidLessThan(Integer value) {
            addCriterion("proViewDetail_proid <", value, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidLessThanOrEqualTo(Integer value) {
            addCriterion("proViewDetail_proid <=", value, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidIn(List<Integer> values) {
            addCriterion("proViewDetail_proid in", values, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidNotIn(List<Integer> values) {
            addCriterion("proViewDetail_proid not in", values, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidBetween(Integer value1, Integer value2) {
            addCriterion("proViewDetail_proid between", value1, value2, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailProidNotBetween(Integer value1, Integer value2) {
            addCriterion("proViewDetail_proid not between", value1, value2, "proviewdetailProid");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameIsNull() {
            addCriterion("proViewDetail_proname is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameIsNotNull() {
            addCriterion("proViewDetail_proname is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameEqualTo(String value) {
            addCriterion("proViewDetail_proname =", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameNotEqualTo(String value) {
            addCriterion("proViewDetail_proname <>", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameGreaterThan(String value) {
            addCriterion("proViewDetail_proname >", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameGreaterThanOrEqualTo(String value) {
            addCriterion("proViewDetail_proname >=", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameLessThan(String value) {
            addCriterion("proViewDetail_proname <", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameLessThanOrEqualTo(String value) {
            addCriterion("proViewDetail_proname <=", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameLike(String value) {
            addCriterion("proViewDetail_proname like", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameNotLike(String value) {
            addCriterion("proViewDetail_proname not like", value, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameIn(List<String> values) {
            addCriterion("proViewDetail_proname in", values, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameNotIn(List<String> values) {
            addCriterion("proViewDetail_proname not in", values, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameBetween(String value1, String value2) {
            addCriterion("proViewDetail_proname between", value1, value2, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailPronameNotBetween(String value1, String value2) {
            addCriterion("proViewDetail_proname not between", value1, value2, "proviewdetailProname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameIsNull() {
            addCriterion("proViewDetail_seoname is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameIsNotNull() {
            addCriterion("proViewDetail_seoname is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameEqualTo(String value) {
            addCriterion("proViewDetail_seoname =", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameNotEqualTo(String value) {
            addCriterion("proViewDetail_seoname <>", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameGreaterThan(String value) {
            addCriterion("proViewDetail_seoname >", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameGreaterThanOrEqualTo(String value) {
            addCriterion("proViewDetail_seoname >=", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameLessThan(String value) {
            addCriterion("proViewDetail_seoname <", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameLessThanOrEqualTo(String value) {
            addCriterion("proViewDetail_seoname <=", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameLike(String value) {
            addCriterion("proViewDetail_seoname like", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameNotLike(String value) {
            addCriterion("proViewDetail_seoname not like", value, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameIn(List<String> values) {
            addCriterion("proViewDetail_seoname in", values, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameNotIn(List<String> values) {
            addCriterion("proViewDetail_seoname not in", values, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameBetween(String value1, String value2) {
            addCriterion("proViewDetail_seoname between", value1, value2, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailSeonameNotBetween(String value1, String value2) {
            addCriterion("proViewDetail_seoname not between", value1, value2, "proviewdetailSeoname");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeIsNull() {
            addCriterion("proViewDetail_createTime is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeIsNotNull() {
            addCriterion("proViewDetail_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeEqualTo(String value) {
            addCriterion("proViewDetail_createTime =", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeNotEqualTo(String value) {
            addCriterion("proViewDetail_createTime <>", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeGreaterThan(String value) {
            addCriterion("proViewDetail_createTime >", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("proViewDetail_createTime >=", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeLessThan(String value) {
            addCriterion("proViewDetail_createTime <", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("proViewDetail_createTime <=", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeLike(String value) {
            addCriterion("proViewDetail_createTime like", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeNotLike(String value) {
            addCriterion("proViewDetail_createTime not like", value, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeIn(List<String> values) {
            addCriterion("proViewDetail_createTime in", values, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeNotIn(List<String> values) {
            addCriterion("proViewDetail_createTime not in", values, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeBetween(String value1, String value2) {
            addCriterion("proViewDetail_createTime between", value1, value2, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailCreatetimeNotBetween(String value1, String value2) {
            addCriterion("proViewDetail_createTime not between", value1, value2, "proviewdetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeIsNull() {
            addCriterion("proViewDetail_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeIsNotNull() {
            addCriterion("proViewDetail_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeEqualTo(String value) {
            addCriterion("proViewDetail_motifyTime =", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeNotEqualTo(String value) {
            addCriterion("proViewDetail_motifyTime <>", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeGreaterThan(String value) {
            addCriterion("proViewDetail_motifyTime >", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("proViewDetail_motifyTime >=", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeLessThan(String value) {
            addCriterion("proViewDetail_motifyTime <", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("proViewDetail_motifyTime <=", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeLike(String value) {
            addCriterion("proViewDetail_motifyTime like", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeNotLike(String value) {
            addCriterion("proViewDetail_motifyTime not like", value, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeIn(List<String> values) {
            addCriterion("proViewDetail_motifyTime in", values, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeNotIn(List<String> values) {
            addCriterion("proViewDetail_motifyTime not in", values, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeBetween(String value1, String value2) {
            addCriterion("proViewDetail_motifyTime between", value1, value2, "proviewdetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andProviewdetailMotifytimeNotBetween(String value1, String value2) {
            addCriterion("proViewDetail_motifyTime not between", value1, value2, "proviewdetailMotifytime");
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