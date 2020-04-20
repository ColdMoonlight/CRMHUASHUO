package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackEmailExample() {
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

        public Criteria andEmailIdIsNull() {
            addCriterion("email_id is null");
            return (Criteria) this;
        }

        public Criteria andEmailIdIsNotNull() {
            addCriterion("email_id is not null");
            return (Criteria) this;
        }

        public Criteria andEmailIdEqualTo(Integer value) {
            addCriterion("email_id =", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotEqualTo(Integer value) {
            addCriterion("email_id <>", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThan(Integer value) {
            addCriterion("email_id >", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("email_id >=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThan(Integer value) {
            addCriterion("email_id <", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdLessThanOrEqualTo(Integer value) {
            addCriterion("email_id <=", value, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdIn(List<Integer> values) {
            addCriterion("email_id in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotIn(List<Integer> values) {
            addCriterion("email_id not in", values, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdBetween(Integer value1, Integer value2) {
            addCriterion("email_id between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("email_id not between", value1, value2, "emailId");
            return (Criteria) this;
        }

        public Criteria andEmailNameIsNull() {
            addCriterion("email_name is null");
            return (Criteria) this;
        }

        public Criteria andEmailNameIsNotNull() {
            addCriterion("email_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmailNameEqualTo(String value) {
            addCriterion("email_name =", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotEqualTo(String value) {
            addCriterion("email_name <>", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameGreaterThan(String value) {
            addCriterion("email_name >", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameGreaterThanOrEqualTo(String value) {
            addCriterion("email_name >=", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameLessThan(String value) {
            addCriterion("email_name <", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameLessThanOrEqualTo(String value) {
            addCriterion("email_name <=", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameLike(String value) {
            addCriterion("email_name like", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotLike(String value) {
            addCriterion("email_name not like", value, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameIn(List<String> values) {
            addCriterion("email_name in", values, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotIn(List<String> values) {
            addCriterion("email_name not in", values, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameBetween(String value1, String value2) {
            addCriterion("email_name between", value1, value2, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailNameNotBetween(String value1, String value2) {
            addCriterion("email_name not between", value1, value2, "emailName");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNull() {
            addCriterion("email_status is null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIsNotNull() {
            addCriterion("email_status is not null");
            return (Criteria) this;
        }

        public Criteria andEmailStatusEqualTo(String value) {
            addCriterion("email_status =", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotEqualTo(String value) {
            addCriterion("email_status <>", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThan(String value) {
            addCriterion("email_status >", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusGreaterThanOrEqualTo(String value) {
            addCriterion("email_status >=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThan(String value) {
            addCriterion("email_status <", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLessThanOrEqualTo(String value) {
            addCriterion("email_status <=", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusLike(String value) {
            addCriterion("email_status like", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotLike(String value) {
            addCriterion("email_status not like", value, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusIn(List<String> values) {
            addCriterion("email_status in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotIn(List<String> values) {
            addCriterion("email_status not in", values, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusBetween(String value1, String value2) {
            addCriterion("email_status between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailStatusNotBetween(String value1, String value2) {
            addCriterion("email_status not between", value1, value2, "emailStatus");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeIsNull() {
            addCriterion("email_createTime is null");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeIsNotNull() {
            addCriterion("email_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeEqualTo(String value) {
            addCriterion("email_createTime =", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeNotEqualTo(String value) {
            addCriterion("email_createTime <>", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeGreaterThan(String value) {
            addCriterion("email_createTime >", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("email_createTime >=", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeLessThan(String value) {
            addCriterion("email_createTime <", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("email_createTime <=", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeLike(String value) {
            addCriterion("email_createTime like", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeNotLike(String value) {
            addCriterion("email_createTime not like", value, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeIn(List<String> values) {
            addCriterion("email_createTime in", values, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeNotIn(List<String> values) {
            addCriterion("email_createTime not in", values, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeBetween(String value1, String value2) {
            addCriterion("email_createTime between", value1, value2, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailCreatetimeNotBetween(String value1, String value2) {
            addCriterion("email_createTime not between", value1, value2, "emailCreatetime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeIsNull() {
            addCriterion("email_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeIsNotNull() {
            addCriterion("email_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeEqualTo(String value) {
            addCriterion("email_motifyTime =", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeNotEqualTo(String value) {
            addCriterion("email_motifyTime <>", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeGreaterThan(String value) {
            addCriterion("email_motifyTime >", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("email_motifyTime >=", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeLessThan(String value) {
            addCriterion("email_motifyTime <", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("email_motifyTime <=", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeLike(String value) {
            addCriterion("email_motifyTime like", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeNotLike(String value) {
            addCriterion("email_motifyTime not like", value, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeIn(List<String> values) {
            addCriterion("email_motifyTime in", values, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeNotIn(List<String> values) {
            addCriterion("email_motifyTime not in", values, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeBetween(String value1, String value2) {
            addCriterion("email_motifyTime between", value1, value2, "emailMotifytime");
            return (Criteria) this;
        }

        public Criteria andEmailMotifytimeNotBetween(String value1, String value2) {
            addCriterion("email_motifyTime not between", value1, value2, "emailMotifytime");
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