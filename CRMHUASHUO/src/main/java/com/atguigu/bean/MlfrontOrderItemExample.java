package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MlfrontOrderItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontOrderItemExample() {
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

        public Criteria andOrderitemIdIsNull() {
            addCriterion("orderItem_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdIsNotNull() {
            addCriterion("orderItem_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdEqualTo(Integer value) {
            addCriterion("orderItem_id =", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdNotEqualTo(Integer value) {
            addCriterion("orderItem_id <>", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdGreaterThan(Integer value) {
            addCriterion("orderItem_id >", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_id >=", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdLessThan(Integer value) {
            addCriterion("orderItem_id <", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_id <=", value, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdIn(List<Integer> values) {
            addCriterion("orderItem_id in", values, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdNotIn(List<Integer> values) {
            addCriterion("orderItem_id not in", values, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_id between", value1, value2, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderitemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_id not between", value1, value2, "orderitemId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderUidIsNull() {
            addCriterion("order_uid is null");
            return (Criteria) this;
        }

        public Criteria andOrderUidIsNotNull() {
            addCriterion("order_uid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderUidEqualTo(Integer value) {
            addCriterion("order_uid =", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotEqualTo(Integer value) {
            addCriterion("order_uid <>", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidGreaterThan(Integer value) {
            addCriterion("order_uid >", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_uid >=", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidLessThan(Integer value) {
            addCriterion("order_uid <", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidLessThanOrEqualTo(Integer value) {
            addCriterion("order_uid <=", value, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidIn(List<Integer> values) {
            addCriterion("order_uid in", values, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotIn(List<Integer> values) {
            addCriterion("order_uid not in", values, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidBetween(Integer value1, Integer value2) {
            addCriterion("order_uid between", value1, value2, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderUidNotBetween(Integer value1, Integer value2) {
            addCriterion("order_uid not between", value1, value2, "orderUid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidIsNull() {
            addCriterion("orderItem_pid is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidIsNotNull() {
            addCriterion("orderItem_pid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidEqualTo(Integer value) {
            addCriterion("orderItem_pid =", value, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidNotEqualTo(Integer value) {
            addCriterion("orderItem_pid <>", value, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidGreaterThan(Integer value) {
            addCriterion("orderItem_pid >", value, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_pid >=", value, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidLessThan(Integer value) {
            addCriterion("orderItem_pid <", value, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_pid <=", value, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidIn(List<Integer> values) {
            addCriterion("orderItem_pid in", values, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidNotIn(List<Integer> values) {
            addCriterion("orderItem_pid not in", values, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_pid between", value1, value2, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_pid not between", value1, value2, "orderitemPid");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameIsNull() {
            addCriterion("orderItem_pName is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameIsNotNull() {
            addCriterion("orderItem_pName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameEqualTo(String value) {
            addCriterion("orderItem_pName =", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameNotEqualTo(String value) {
            addCriterion("orderItem_pName <>", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameGreaterThan(String value) {
            addCriterion("orderItem_pName >", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_pName >=", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameLessThan(String value) {
            addCriterion("orderItem_pName <", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameLessThanOrEqualTo(String value) {
            addCriterion("orderItem_pName <=", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameLike(String value) {
            addCriterion("orderItem_pName like", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameNotLike(String value) {
            addCriterion("orderItem_pName not like", value, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameIn(List<String> values) {
            addCriterion("orderItem_pName in", values, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameNotIn(List<String> values) {
            addCriterion("orderItem_pName not in", values, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameBetween(String value1, String value2) {
            addCriterion("orderItem_pName between", value1, value2, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemPnameNotBetween(String value1, String value2) {
            addCriterion("orderItem_pName not between", value1, value2, "orderitemPname");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceIsNull() {
            addCriterion("orderItem_product_originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceIsNotNull() {
            addCriterion("orderItem_product_originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceEqualTo(BigDecimal value) {
            addCriterion("orderItem_product_originalPrice =", value, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("orderItem_product_originalPrice <>", value, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("orderItem_product_originalPrice >", value, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderItem_product_originalPrice >=", value, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceLessThan(BigDecimal value) {
            addCriterion("orderItem_product_originalPrice <", value, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderItem_product_originalPrice <=", value, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceIn(List<BigDecimal> values) {
            addCriterion("orderItem_product_originalPrice in", values, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("orderItem_product_originalPrice not in", values, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderItem_product_originalPrice between", value1, value2, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductOriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderItem_product_originalPrice not between", value1, value2, "orderitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlIsNull() {
            addCriterion("orderItem_product_mainimgURL is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlIsNotNull() {
            addCriterion("orderItem_product_mainimgURL is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlEqualTo(String value) {
            addCriterion("orderItem_product_mainimgURL =", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlNotEqualTo(String value) {
            addCriterion("orderItem_product_mainimgURL <>", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlGreaterThan(String value) {
            addCriterion("orderItem_product_mainimgURL >", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_product_mainimgURL >=", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlLessThan(String value) {
            addCriterion("orderItem_product_mainimgURL <", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlLessThanOrEqualTo(String value) {
            addCriterion("orderItem_product_mainimgURL <=", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlLike(String value) {
            addCriterion("orderItem_product_mainimgURL like", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlNotLike(String value) {
            addCriterion("orderItem_product_mainimgURL not like", value, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlIn(List<String> values) {
            addCriterion("orderItem_product_mainimgURL in", values, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlNotIn(List<String> values) {
            addCriterion("orderItem_product_mainimgURL not in", values, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlBetween(String value1, String value2) {
            addCriterion("orderItem_product_mainimgURL between", value1, value2, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductMainimgurlNotBetween(String value1, String value2) {
            addCriterion("orderItem_product_mainimgURL not between", value1, value2, "orderitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffIsNull() {
            addCriterion("orderItem_product_accoff is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffIsNotNull() {
            addCriterion("orderItem_product_accoff is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffEqualTo(Integer value) {
            addCriterion("orderItem_product_accoff =", value, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffNotEqualTo(Integer value) {
            addCriterion("orderItem_product_accoff <>", value, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffGreaterThan(Integer value) {
            addCriterion("orderItem_product_accoff >", value, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_product_accoff >=", value, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffLessThan(Integer value) {
            addCriterion("orderItem_product_accoff <", value, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_product_accoff <=", value, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffIn(List<Integer> values) {
            addCriterion("orderItem_product_accoff in", values, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffNotIn(List<Integer> values) {
            addCriterion("orderItem_product_accoff not in", values, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_product_accoff between", value1, value2, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemProductAccoffNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_product_accoff not between", value1, value2, "orderitemProductAccoff");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrIsNull() {
            addCriterion("orderItem_pSku_idStr is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrIsNotNull() {
            addCriterion("orderItem_pSku_idStr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrEqualTo(String value) {
            addCriterion("orderItem_pSku_idStr =", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrNotEqualTo(String value) {
            addCriterion("orderItem_pSku_idStr <>", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrGreaterThan(String value) {
            addCriterion("orderItem_pSku_idStr >", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_idStr >=", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrLessThan(String value) {
            addCriterion("orderItem_pSku_idStr <", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrLessThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_idStr <=", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrLike(String value) {
            addCriterion("orderItem_pSku_idStr like", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrNotLike(String value) {
            addCriterion("orderItem_pSku_idStr not like", value, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrIn(List<String> values) {
            addCriterion("orderItem_pSku_idStr in", values, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrNotIn(List<String> values) {
            addCriterion("orderItem_pSku_idStr not in", values, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_idStr between", value1, value2, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdstrNotBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_idStr not between", value1, value2, "orderitemPskuIdstr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrIsNull() {
            addCriterion("orderItem_pSku_idnameStr is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrIsNotNull() {
            addCriterion("orderItem_pSku_idnameStr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrEqualTo(String value) {
            addCriterion("orderItem_pSku_idnameStr =", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrNotEqualTo(String value) {
            addCriterion("orderItem_pSku_idnameStr <>", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrGreaterThan(String value) {
            addCriterion("orderItem_pSku_idnameStr >", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_idnameStr >=", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrLessThan(String value) {
            addCriterion("orderItem_pSku_idnameStr <", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrLessThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_idnameStr <=", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrLike(String value) {
            addCriterion("orderItem_pSku_idnameStr like", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrNotLike(String value) {
            addCriterion("orderItem_pSku_idnameStr not like", value, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrIn(List<String> values) {
            addCriterion("orderItem_pSku_idnameStr in", values, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrNotIn(List<String> values) {
            addCriterion("orderItem_pSku_idnameStr not in", values, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_idnameStr between", value1, value2, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuIdnamestrNotBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_idnameStr not between", value1, value2, "orderitemPskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrIsNull() {
            addCriterion("orderItem_pSku_nameStr is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrIsNotNull() {
            addCriterion("orderItem_pSku_nameStr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrEqualTo(String value) {
            addCriterion("orderItem_pSku_nameStr =", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrNotEqualTo(String value) {
            addCriterion("orderItem_pSku_nameStr <>", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrGreaterThan(String value) {
            addCriterion("orderItem_pSku_nameStr >", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_nameStr >=", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrLessThan(String value) {
            addCriterion("orderItem_pSku_nameStr <", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrLessThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_nameStr <=", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrLike(String value) {
            addCriterion("orderItem_pSku_nameStr like", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrNotLike(String value) {
            addCriterion("orderItem_pSku_nameStr not like", value, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrIn(List<String> values) {
            addCriterion("orderItem_pSku_nameStr in", values, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrNotIn(List<String> values) {
            addCriterion("orderItem_pSku_nameStr not in", values, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_nameStr between", value1, value2, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNamestrNotBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_nameStr not between", value1, value2, "orderitemPskuNamestr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrIsNull() {
            addCriterion("orderItem_pSku_moneyStr is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrIsNotNull() {
            addCriterion("orderItem_pSku_moneyStr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrEqualTo(String value) {
            addCriterion("orderItem_pSku_moneyStr =", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrNotEqualTo(String value) {
            addCriterion("orderItem_pSku_moneyStr <>", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrGreaterThan(String value) {
            addCriterion("orderItem_pSku_moneyStr >", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_moneyStr >=", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrLessThan(String value) {
            addCriterion("orderItem_pSku_moneyStr <", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrLessThanOrEqualTo(String value) {
            addCriterion("orderItem_pSku_moneyStr <=", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrLike(String value) {
            addCriterion("orderItem_pSku_moneyStr like", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrNotLike(String value) {
            addCriterion("orderItem_pSku_moneyStr not like", value, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrIn(List<String> values) {
            addCriterion("orderItem_pSku_moneyStr in", values, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrNotIn(List<String> values) {
            addCriterion("orderItem_pSku_moneyStr not in", values, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_moneyStr between", value1, value2, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuMoneystrNotBetween(String value1, String value2) {
            addCriterion("orderItem_pSku_moneyStr not between", value1, value2, "orderitemPskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberIsNull() {
            addCriterion("orderItem_pSku_number is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberIsNotNull() {
            addCriterion("orderItem_pSku_number is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberEqualTo(Integer value) {
            addCriterion("orderItem_pSku_number =", value, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberNotEqualTo(Integer value) {
            addCriterion("orderItem_pSku_number <>", value, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberGreaterThan(Integer value) {
            addCriterion("orderItem_pSku_number >", value, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderItem_pSku_number >=", value, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberLessThan(Integer value) {
            addCriterion("orderItem_pSku_number <", value, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberLessThanOrEqualTo(Integer value) {
            addCriterion("orderItem_pSku_number <=", value, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberIn(List<Integer> values) {
            addCriterion("orderItem_pSku_number in", values, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberNotIn(List<Integer> values) {
            addCriterion("orderItem_pSku_number not in", values, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_pSku_number between", value1, value2, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("orderItem_pSku_number not between", value1, value2, "orderitemPskuNumber");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyIsNull() {
            addCriterion("orderItem_pSku_reaMoney is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyIsNotNull() {
            addCriterion("orderItem_pSku_reaMoney is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyEqualTo(BigDecimal value) {
            addCriterion("orderItem_pSku_reaMoney =", value, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyNotEqualTo(BigDecimal value) {
            addCriterion("orderItem_pSku_reaMoney <>", value, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyGreaterThan(BigDecimal value) {
            addCriterion("orderItem_pSku_reaMoney >", value, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("orderItem_pSku_reaMoney >=", value, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyLessThan(BigDecimal value) {
            addCriterion("orderItem_pSku_reaMoney <", value, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("orderItem_pSku_reaMoney <=", value, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyIn(List<BigDecimal> values) {
            addCriterion("orderItem_pSku_reaMoney in", values, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyNotIn(List<BigDecimal> values) {
            addCriterion("orderItem_pSku_reaMoney not in", values, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderItem_pSku_reaMoney between", value1, value2, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemPskuReamoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("orderItem_pSku_reaMoney not between", value1, value2, "orderitemPskuReamoney");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeIsNull() {
            addCriterion("orderItem_createTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeIsNotNull() {
            addCriterion("orderItem_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeEqualTo(String value) {
            addCriterion("orderItem_createTime =", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeNotEqualTo(String value) {
            addCriterion("orderItem_createTime <>", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeGreaterThan(String value) {
            addCriterion("orderItem_createTime >", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_createTime >=", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeLessThan(String value) {
            addCriterion("orderItem_createTime <", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("orderItem_createTime <=", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeLike(String value) {
            addCriterion("orderItem_createTime like", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeNotLike(String value) {
            addCriterion("orderItem_createTime not like", value, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeIn(List<String> values) {
            addCriterion("orderItem_createTime in", values, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeNotIn(List<String> values) {
            addCriterion("orderItem_createTime not in", values, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeBetween(String value1, String value2) {
            addCriterion("orderItem_createTime between", value1, value2, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemCreatetimeNotBetween(String value1, String value2) {
            addCriterion("orderItem_createTime not between", value1, value2, "orderitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeIsNull() {
            addCriterion("orderItem_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeIsNotNull() {
            addCriterion("orderItem_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeEqualTo(String value) {
            addCriterion("orderItem_motifyTime =", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeNotEqualTo(String value) {
            addCriterion("orderItem_motifyTime <>", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeGreaterThan(String value) {
            addCriterion("orderItem_motifyTime >", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("orderItem_motifyTime >=", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeLessThan(String value) {
            addCriterion("orderItem_motifyTime <", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("orderItem_motifyTime <=", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeLike(String value) {
            addCriterion("orderItem_motifyTime like", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeNotLike(String value) {
            addCriterion("orderItem_motifyTime not like", value, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeIn(List<String> values) {
            addCriterion("orderItem_motifyTime in", values, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeNotIn(List<String> values) {
            addCriterion("orderItem_motifyTime not in", values, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeBetween(String value1, String value2) {
            addCriterion("orderItem_motifyTime between", value1, value2, "orderitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderitemMotifytimeNotBetween(String value1, String value2) {
            addCriterion("orderItem_motifyTime not between", value1, value2, "orderitemMotifytime");
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