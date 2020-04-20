package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlfrontCartExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontCartExample() {
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

        public Criteria andCartIdIsNull() {
            addCriterion("cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartIdIsNotNull() {
            addCriterion("cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartIdEqualTo(Integer value) {
            addCriterion("cart_id =", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotEqualTo(Integer value) {
            addCriterion("cart_id <>", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThan(Integer value) {
            addCriterion("cart_id >", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_id >=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThan(Integer value) {
            addCriterion("cart_id <", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cart_id <=", value, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdIn(List<Integer> values) {
            addCriterion("cart_id in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotIn(List<Integer> values) {
            addCriterion("cart_id not in", values, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cart_id between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_id not between", value1, value2, "cartId");
            return (Criteria) this;
        }

        public Criteria andCartUidIsNull() {
            addCriterion("cart_uid is null");
            return (Criteria) this;
        }

        public Criteria andCartUidIsNotNull() {
            addCriterion("cart_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCartUidEqualTo(Integer value) {
            addCriterion("cart_uid =", value, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidNotEqualTo(Integer value) {
            addCriterion("cart_uid <>", value, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidGreaterThan(Integer value) {
            addCriterion("cart_uid >", value, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cart_uid >=", value, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidLessThan(Integer value) {
            addCriterion("cart_uid <", value, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidLessThanOrEqualTo(Integer value) {
            addCriterion("cart_uid <=", value, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidIn(List<Integer> values) {
            addCriterion("cart_uid in", values, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidNotIn(List<Integer> values) {
            addCriterion("cart_uid not in", values, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidBetween(Integer value1, Integer value2) {
            addCriterion("cart_uid between", value1, value2, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartUidNotBetween(Integer value1, Integer value2) {
            addCriterion("cart_uid not between", value1, value2, "cartUid");
            return (Criteria) this;
        }

        public Criteria andCartIpIsNull() {
            addCriterion("cart_ip is null");
            return (Criteria) this;
        }

        public Criteria andCartIpIsNotNull() {
            addCriterion("cart_ip is not null");
            return (Criteria) this;
        }

        public Criteria andCartIpEqualTo(String value) {
            addCriterion("cart_ip =", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpNotEqualTo(String value) {
            addCriterion("cart_ip <>", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpGreaterThan(String value) {
            addCriterion("cart_ip >", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpGreaterThanOrEqualTo(String value) {
            addCriterion("cart_ip >=", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpLessThan(String value) {
            addCriterion("cart_ip <", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpLessThanOrEqualTo(String value) {
            addCriterion("cart_ip <=", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpLike(String value) {
            addCriterion("cart_ip like", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpNotLike(String value) {
            addCriterion("cart_ip not like", value, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpIn(List<String> values) {
            addCriterion("cart_ip in", values, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpNotIn(List<String> values) {
            addCriterion("cart_ip not in", values, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpBetween(String value1, String value2) {
            addCriterion("cart_ip between", value1, value2, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartIpNotBetween(String value1, String value2) {
            addCriterion("cart_ip not between", value1, value2, "cartIp");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrIsNull() {
            addCriterion("cartItem_idStr is null");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrIsNotNull() {
            addCriterion("cartItem_idStr is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrEqualTo(String value) {
            addCriterion("cartItem_idStr =", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrNotEqualTo(String value) {
            addCriterion("cartItem_idStr <>", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrGreaterThan(String value) {
            addCriterion("cartItem_idStr >", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_idStr >=", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrLessThan(String value) {
            addCriterion("cartItem_idStr <", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrLessThanOrEqualTo(String value) {
            addCriterion("cartItem_idStr <=", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrLike(String value) {
            addCriterion("cartItem_idStr like", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrNotLike(String value) {
            addCriterion("cartItem_idStr not like", value, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrIn(List<String> values) {
            addCriterion("cartItem_idStr in", values, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrNotIn(List<String> values) {
            addCriterion("cartItem_idStr not in", values, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrBetween(String value1, String value2) {
            addCriterion("cartItem_idStr between", value1, value2, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemIdstrNotBetween(String value1, String value2) {
            addCriterion("cartItem_idStr not between", value1, value2, "cartitemIdstr");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeIsNull() {
            addCriterion("cart_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeIsNotNull() {
            addCriterion("cart_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeEqualTo(String value) {
            addCriterion("cart_createTime =", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeNotEqualTo(String value) {
            addCriterion("cart_createTime <>", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeGreaterThan(String value) {
            addCriterion("cart_createTime >", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cart_createTime >=", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeLessThan(String value) {
            addCriterion("cart_createTime <", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("cart_createTime <=", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeLike(String value) {
            addCriterion("cart_createTime like", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeNotLike(String value) {
            addCriterion("cart_createTime not like", value, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeIn(List<String> values) {
            addCriterion("cart_createTime in", values, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeNotIn(List<String> values) {
            addCriterion("cart_createTime not in", values, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeBetween(String value1, String value2) {
            addCriterion("cart_createTime between", value1, value2, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartCreatetimeNotBetween(String value1, String value2) {
            addCriterion("cart_createTime not between", value1, value2, "cartCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeIsNull() {
            addCriterion("cart_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeIsNotNull() {
            addCriterion("cart_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeEqualTo(String value) {
            addCriterion("cart_motifyTime =", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeNotEqualTo(String value) {
            addCriterion("cart_motifyTime <>", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeGreaterThan(String value) {
            addCriterion("cart_motifyTime >", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("cart_motifyTime >=", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeLessThan(String value) {
            addCriterion("cart_motifyTime <", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("cart_motifyTime <=", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeLike(String value) {
            addCriterion("cart_motifyTime like", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeNotLike(String value) {
            addCriterion("cart_motifyTime not like", value, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeIn(List<String> values) {
            addCriterion("cart_motifyTime in", values, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeNotIn(List<String> values) {
            addCriterion("cart_motifyTime not in", values, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeBetween(String value1, String value2) {
            addCriterion("cart_motifyTime between", value1, value2, "cartMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartMotifytimeNotBetween(String value1, String value2) {
            addCriterion("cart_motifyTime not between", value1, value2, "cartMotifytime");
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