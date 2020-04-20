package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackCountDownExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackCountDownExample() {
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

        public Criteria andCountdownIdIsNull() {
            addCriterion("countDown_id is null");
            return (Criteria) this;
        }

        public Criteria andCountdownIdIsNotNull() {
            addCriterion("countDown_id is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownIdEqualTo(Integer value) {
            addCriterion("countDown_id =", value, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdNotEqualTo(Integer value) {
            addCriterion("countDown_id <>", value, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdGreaterThan(Integer value) {
            addCriterion("countDown_id >", value, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("countDown_id >=", value, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdLessThan(Integer value) {
            addCriterion("countDown_id <", value, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdLessThanOrEqualTo(Integer value) {
            addCriterion("countDown_id <=", value, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdIn(List<Integer> values) {
            addCriterion("countDown_id in", values, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdNotIn(List<Integer> values) {
            addCriterion("countDown_id not in", values, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdBetween(Integer value1, Integer value2) {
            addCriterion("countDown_id between", value1, value2, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownIdNotBetween(Integer value1, Integer value2) {
            addCriterion("countDown_id not between", value1, value2, "countdownId");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleIsNull() {
            addCriterion("countDown_title is null");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleIsNotNull() {
            addCriterion("countDown_title is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleEqualTo(String value) {
            addCriterion("countDown_title =", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleNotEqualTo(String value) {
            addCriterion("countDown_title <>", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleGreaterThan(String value) {
            addCriterion("countDown_title >", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleGreaterThanOrEqualTo(String value) {
            addCriterion("countDown_title >=", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleLessThan(String value) {
            addCriterion("countDown_title <", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleLessThanOrEqualTo(String value) {
            addCriterion("countDown_title <=", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleLike(String value) {
            addCriterion("countDown_title like", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleNotLike(String value) {
            addCriterion("countDown_title not like", value, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleIn(List<String> values) {
            addCriterion("countDown_title in", values, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleNotIn(List<String> values) {
            addCriterion("countDown_title not in", values, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleBetween(String value1, String value2) {
            addCriterion("countDown_title between", value1, value2, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownTitleNotBetween(String value1, String value2) {
            addCriterion("countDown_title not between", value1, value2, "countdownTitle");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionIsNull() {
            addCriterion("countDown_description is null");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionIsNotNull() {
            addCriterion("countDown_description is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionEqualTo(String value) {
            addCriterion("countDown_description =", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionNotEqualTo(String value) {
            addCriterion("countDown_description <>", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionGreaterThan(String value) {
            addCriterion("countDown_description >", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("countDown_description >=", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionLessThan(String value) {
            addCriterion("countDown_description <", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionLessThanOrEqualTo(String value) {
            addCriterion("countDown_description <=", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionLike(String value) {
            addCriterion("countDown_description like", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionNotLike(String value) {
            addCriterion("countDown_description not like", value, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionIn(List<String> values) {
            addCriterion("countDown_description in", values, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionNotIn(List<String> values) {
            addCriterion("countDown_description not in", values, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionBetween(String value1, String value2) {
            addCriterion("countDown_description between", value1, value2, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownDescriptionNotBetween(String value1, String value2) {
            addCriterion("countDown_description not between", value1, value2, "countdownDescription");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeIsNull() {
            addCriterion("countDown_startTime is null");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeIsNotNull() {
            addCriterion("countDown_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeEqualTo(String value) {
            addCriterion("countDown_startTime =", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeNotEqualTo(String value) {
            addCriterion("countDown_startTime <>", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeGreaterThan(String value) {
            addCriterion("countDown_startTime >", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("countDown_startTime >=", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeLessThan(String value) {
            addCriterion("countDown_startTime <", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeLessThanOrEqualTo(String value) {
            addCriterion("countDown_startTime <=", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeLike(String value) {
            addCriterion("countDown_startTime like", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeNotLike(String value) {
            addCriterion("countDown_startTime not like", value, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeIn(List<String> values) {
            addCriterion("countDown_startTime in", values, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeNotIn(List<String> values) {
            addCriterion("countDown_startTime not in", values, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeBetween(String value1, String value2) {
            addCriterion("countDown_startTime between", value1, value2, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownStarttimeNotBetween(String value1, String value2) {
            addCriterion("countDown_startTime not between", value1, value2, "countdownStarttime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeIsNull() {
            addCriterion("countDown_endTime is null");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeIsNotNull() {
            addCriterion("countDown_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeEqualTo(String value) {
            addCriterion("countDown_endTime =", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeNotEqualTo(String value) {
            addCriterion("countDown_endTime <>", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeGreaterThan(String value) {
            addCriterion("countDown_endTime >", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("countDown_endTime >=", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeLessThan(String value) {
            addCriterion("countDown_endTime <", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeLessThanOrEqualTo(String value) {
            addCriterion("countDown_endTime <=", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeLike(String value) {
            addCriterion("countDown_endTime like", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeNotLike(String value) {
            addCriterion("countDown_endTime not like", value, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeIn(List<String> values) {
            addCriterion("countDown_endTime in", values, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeNotIn(List<String> values) {
            addCriterion("countDown_endTime not in", values, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeBetween(String value1, String value2) {
            addCriterion("countDown_endTime between", value1, value2, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownEndtimeNotBetween(String value1, String value2) {
            addCriterion("countDown_endTime not between", value1, value2, "countdownEndtime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeIsNull() {
            addCriterion("countDown_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeIsNotNull() {
            addCriterion("countDown_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeEqualTo(String value) {
            addCriterion("countDown_createTime =", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeNotEqualTo(String value) {
            addCriterion("countDown_createTime <>", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeGreaterThan(String value) {
            addCriterion("countDown_createTime >", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("countDown_createTime >=", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeLessThan(String value) {
            addCriterion("countDown_createTime <", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("countDown_createTime <=", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeLike(String value) {
            addCriterion("countDown_createTime like", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeNotLike(String value) {
            addCriterion("countDown_createTime not like", value, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeIn(List<String> values) {
            addCriterion("countDown_createTime in", values, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeNotIn(List<String> values) {
            addCriterion("countDown_createTime not in", values, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeBetween(String value1, String value2) {
            addCriterion("countDown_createTime between", value1, value2, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownCreatetimeNotBetween(String value1, String value2) {
            addCriterion("countDown_createTime not between", value1, value2, "countdownCreatetime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeIsNull() {
            addCriterion("countDown_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeIsNotNull() {
            addCriterion("countDown_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeEqualTo(String value) {
            addCriterion("countDown_motifyTime =", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeNotEqualTo(String value) {
            addCriterion("countDown_motifyTime <>", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeGreaterThan(String value) {
            addCriterion("countDown_motifyTime >", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("countDown_motifyTime >=", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeLessThan(String value) {
            addCriterion("countDown_motifyTime <", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("countDown_motifyTime <=", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeLike(String value) {
            addCriterion("countDown_motifyTime like", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeNotLike(String value) {
            addCriterion("countDown_motifyTime not like", value, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeIn(List<String> values) {
            addCriterion("countDown_motifyTime in", values, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeNotIn(List<String> values) {
            addCriterion("countDown_motifyTime not in", values, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeBetween(String value1, String value2) {
            addCriterion("countDown_motifyTime between", value1, value2, "countdownMotifytime");
            return (Criteria) this;
        }

        public Criteria andCountdownMotifytimeNotBetween(String value1, String value2) {
            addCriterion("countDown_motifyTime not between", value1, value2, "countdownMotifytime");
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