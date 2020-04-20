package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlfrontUserTemporaryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontUserTemporaryExample() {
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

        public Criteria andUsertemporaryIdIsNull() {
            addCriterion("userTemporary_id is null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdIsNotNull() {
            addCriterion("userTemporary_id is not null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdEqualTo(Integer value) {
            addCriterion("userTemporary_id =", value, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdNotEqualTo(Integer value) {
            addCriterion("userTemporary_id <>", value, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdGreaterThan(Integer value) {
            addCriterion("userTemporary_id >", value, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("userTemporary_id >=", value, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdLessThan(Integer value) {
            addCriterion("userTemporary_id <", value, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdLessThanOrEqualTo(Integer value) {
            addCriterion("userTemporary_id <=", value, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdIn(List<Integer> values) {
            addCriterion("userTemporary_id in", values, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdNotIn(List<Integer> values) {
            addCriterion("userTemporary_id not in", values, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdBetween(Integer value1, Integer value2) {
            addCriterion("userTemporary_id between", value1, value2, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("userTemporary_id not between", value1, value2, "usertemporaryId");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpIsNull() {
            addCriterion("userTemporary_ip is null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpIsNotNull() {
            addCriterion("userTemporary_ip is not null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpEqualTo(String value) {
            addCriterion("userTemporary_ip =", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpNotEqualTo(String value) {
            addCriterion("userTemporary_ip <>", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpGreaterThan(String value) {
            addCriterion("userTemporary_ip >", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpGreaterThanOrEqualTo(String value) {
            addCriterion("userTemporary_ip >=", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpLessThan(String value) {
            addCriterion("userTemporary_ip <", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpLessThanOrEqualTo(String value) {
            addCriterion("userTemporary_ip <=", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpLike(String value) {
            addCriterion("userTemporary_ip like", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpNotLike(String value) {
            addCriterion("userTemporary_ip not like", value, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpIn(List<String> values) {
            addCriterion("userTemporary_ip in", values, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpNotIn(List<String> values) {
            addCriterion("userTemporary_ip not in", values, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpBetween(String value1, String value2) {
            addCriterion("userTemporary_ip between", value1, value2, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryIpNotBetween(String value1, String value2) {
            addCriterion("userTemporary_ip not between", value1, value2, "usertemporaryIp");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeIsNull() {
            addCriterion("userTemporary_createTime is null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeIsNotNull() {
            addCriterion("userTemporary_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeEqualTo(String value) {
            addCriterion("userTemporary_createTime =", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeNotEqualTo(String value) {
            addCriterion("userTemporary_createTime <>", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeGreaterThan(String value) {
            addCriterion("userTemporary_createTime >", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("userTemporary_createTime >=", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeLessThan(String value) {
            addCriterion("userTemporary_createTime <", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("userTemporary_createTime <=", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeLike(String value) {
            addCriterion("userTemporary_createTime like", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeNotLike(String value) {
            addCriterion("userTemporary_createTime not like", value, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeIn(List<String> values) {
            addCriterion("userTemporary_createTime in", values, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeNotIn(List<String> values) {
            addCriterion("userTemporary_createTime not in", values, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeBetween(String value1, String value2) {
            addCriterion("userTemporary_createTime between", value1, value2, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryCreatetimeNotBetween(String value1, String value2) {
            addCriterion("userTemporary_createTime not between", value1, value2, "usertemporaryCreatetime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeIsNull() {
            addCriterion("userTemporary_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeIsNotNull() {
            addCriterion("userTemporary_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeEqualTo(String value) {
            addCriterion("userTemporary_motifyTime =", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeNotEqualTo(String value) {
            addCriterion("userTemporary_motifyTime <>", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeGreaterThan(String value) {
            addCriterion("userTemporary_motifyTime >", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("userTemporary_motifyTime >=", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeLessThan(String value) {
            addCriterion("userTemporary_motifyTime <", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("userTemporary_motifyTime <=", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeLike(String value) {
            addCriterion("userTemporary_motifyTime like", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeNotLike(String value) {
            addCriterion("userTemporary_motifyTime not like", value, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeIn(List<String> values) {
            addCriterion("userTemporary_motifyTime in", values, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeNotIn(List<String> values) {
            addCriterion("userTemporary_motifyTime not in", values, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeBetween(String value1, String value2) {
            addCriterion("userTemporary_motifyTime between", value1, value2, "usertemporaryMotifytime");
            return (Criteria) this;
        }

        public Criteria andUsertemporaryMotifytimeNotBetween(String value1, String value2) {
            addCriterion("userTemporary_motifyTime not between", value1, value2, "usertemporaryMotifytime");
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