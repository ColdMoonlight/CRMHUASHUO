package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MlfrontCartItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontCartItemExample() {
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

        public Criteria andCartitemIdIsNull() {
            addCriterion("cartItem_id is null");
            return (Criteria) this;
        }

        public Criteria andCartitemIdIsNotNull() {
            addCriterion("cartItem_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemIdEqualTo(Integer value) {
            addCriterion("cartItem_id =", value, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdNotEqualTo(Integer value) {
            addCriterion("cartItem_id <>", value, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdGreaterThan(Integer value) {
            addCriterion("cartItem_id >", value, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItem_id >=", value, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdLessThan(Integer value) {
            addCriterion("cartItem_id <", value, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdLessThanOrEqualTo(Integer value) {
            addCriterion("cartItem_id <=", value, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdIn(List<Integer> values) {
            addCriterion("cartItem_id in", values, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdNotIn(List<Integer> values) {
            addCriterion("cartItem_id not in", values, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_id between", value1, value2, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_id not between", value1, value2, "cartitemId");
            return (Criteria) this;
        }

        public Criteria andCartitemUidIsNull() {
            addCriterion("cartItem_uid is null");
            return (Criteria) this;
        }

        public Criteria andCartitemUidIsNotNull() {
            addCriterion("cartItem_uid is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemUidEqualTo(Integer value) {
            addCriterion("cartItem_uid =", value, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidNotEqualTo(Integer value) {
            addCriterion("cartItem_uid <>", value, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidGreaterThan(Integer value) {
            addCriterion("cartItem_uid >", value, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItem_uid >=", value, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidLessThan(Integer value) {
            addCriterion("cartItem_uid <", value, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidLessThanOrEqualTo(Integer value) {
            addCriterion("cartItem_uid <=", value, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidIn(List<Integer> values) {
            addCriterion("cartItem_uid in", values, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidNotIn(List<Integer> values) {
            addCriterion("cartItem_uid not in", values, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_uid between", value1, value2, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemUidNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_uid not between", value1, value2, "cartitemUid");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdIsNull() {
            addCriterion("cartItem_cart_id is null");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdIsNotNull() {
            addCriterion("cartItem_cart_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdEqualTo(Integer value) {
            addCriterion("cartItem_cart_id =", value, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdNotEqualTo(Integer value) {
            addCriterion("cartItem_cart_id <>", value, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdGreaterThan(Integer value) {
            addCriterion("cartItem_cart_id >", value, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItem_cart_id >=", value, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdLessThan(Integer value) {
            addCriterion("cartItem_cart_id <", value, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdLessThanOrEqualTo(Integer value) {
            addCriterion("cartItem_cart_id <=", value, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdIn(List<Integer> values) {
            addCriterion("cartItem_cart_id in", values, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdNotIn(List<Integer> values) {
            addCriterion("cartItem_cart_id not in", values, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_cart_id between", value1, value2, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemCartIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_cart_id not between", value1, value2, "cartitemCartId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdIsNull() {
            addCriterion("cartItem_product_id is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdIsNotNull() {
            addCriterion("cartItem_product_id is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdEqualTo(Integer value) {
            addCriterion("cartItem_product_id =", value, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdNotEqualTo(Integer value) {
            addCriterion("cartItem_product_id <>", value, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdGreaterThan(Integer value) {
            addCriterion("cartItem_product_id >", value, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItem_product_id >=", value, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdLessThan(Integer value) {
            addCriterion("cartItem_product_id <", value, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("cartItem_product_id <=", value, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdIn(List<Integer> values) {
            addCriterion("cartItem_product_id in", values, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdNotIn(List<Integer> values) {
            addCriterion("cartItem_product_id not in", values, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_product_id between", value1, value2, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_product_id not between", value1, value2, "cartitemProductId");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameIsNull() {
            addCriterion("cartItem_product_name is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameIsNotNull() {
            addCriterion("cartItem_product_name is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameEqualTo(String value) {
            addCriterion("cartItem_product_name =", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameNotEqualTo(String value) {
            addCriterion("cartItem_product_name <>", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameGreaterThan(String value) {
            addCriterion("cartItem_product_name >", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_product_name >=", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameLessThan(String value) {
            addCriterion("cartItem_product_name <", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameLessThanOrEqualTo(String value) {
            addCriterion("cartItem_product_name <=", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameLike(String value) {
            addCriterion("cartItem_product_name like", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameNotLike(String value) {
            addCriterion("cartItem_product_name not like", value, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameIn(List<String> values) {
            addCriterion("cartItem_product_name in", values, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameNotIn(List<String> values) {
            addCriterion("cartItem_product_name not in", values, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameBetween(String value1, String value2) {
            addCriterion("cartItem_product_name between", value1, value2, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNameNotBetween(String value1, String value2) {
            addCriterion("cartItem_product_name not between", value1, value2, "cartitemProductName");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceIsNull() {
            addCriterion("cartItem_product_originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceIsNotNull() {
            addCriterion("cartItem_product_originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceEqualTo(BigDecimal value) {
            addCriterion("cartItem_product_originalPrice =", value, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("cartItem_product_originalPrice <>", value, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("cartItem_product_originalPrice >", value, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cartItem_product_originalPrice >=", value, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceLessThan(BigDecimal value) {
            addCriterion("cartItem_product_originalPrice <", value, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cartItem_product_originalPrice <=", value, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceIn(List<BigDecimal> values) {
            addCriterion("cartItem_product_originalPrice in", values, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("cartItem_product_originalPrice not in", values, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cartItem_product_originalPrice between", value1, value2, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductOriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cartItem_product_originalPrice not between", value1, value2, "cartitemProductOriginalprice");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlIsNull() {
            addCriterion("cartItem_product_mainimgurl is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlIsNotNull() {
            addCriterion("cartItem_product_mainimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlEqualTo(String value) {
            addCriterion("cartItem_product_mainimgurl =", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlNotEqualTo(String value) {
            addCriterion("cartItem_product_mainimgurl <>", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlGreaterThan(String value) {
            addCriterion("cartItem_product_mainimgurl >", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_product_mainimgurl >=", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlLessThan(String value) {
            addCriterion("cartItem_product_mainimgurl <", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlLessThanOrEqualTo(String value) {
            addCriterion("cartItem_product_mainimgurl <=", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlLike(String value) {
            addCriterion("cartItem_product_mainimgurl like", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlNotLike(String value) {
            addCriterion("cartItem_product_mainimgurl not like", value, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlIn(List<String> values) {
            addCriterion("cartItem_product_mainimgurl in", values, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlNotIn(List<String> values) {
            addCriterion("cartItem_product_mainimgurl not in", values, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlBetween(String value1, String value2) {
            addCriterion("cartItem_product_mainimgurl between", value1, value2, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductMainimgurlNotBetween(String value1, String value2) {
            addCriterion("cartItem_product_mainimgurl not between", value1, value2, "cartitemProductMainimgurl");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffIsNull() {
            addCriterion("cartItem_product_actoff is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffIsNotNull() {
            addCriterion("cartItem_product_actoff is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffEqualTo(Integer value) {
            addCriterion("cartItem_product_actoff =", value, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffNotEqualTo(Integer value) {
            addCriterion("cartItem_product_actoff <>", value, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffGreaterThan(Integer value) {
            addCriterion("cartItem_product_actoff >", value, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItem_product_actoff >=", value, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffLessThan(Integer value) {
            addCriterion("cartItem_product_actoff <", value, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffLessThanOrEqualTo(Integer value) {
            addCriterion("cartItem_product_actoff <=", value, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffIn(List<Integer> values) {
            addCriterion("cartItem_product_actoff in", values, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffNotIn(List<Integer> values) {
            addCriterion("cartItem_product_actoff not in", values, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_product_actoff between", value1, value2, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductActoffNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_product_actoff not between", value1, value2, "cartitemProductActoff");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrIsNull() {
            addCriterion("cartItem_productsku_idStr is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrIsNotNull() {
            addCriterion("cartItem_productsku_idStr is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrEqualTo(String value) {
            addCriterion("cartItem_productsku_idStr =", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrNotEqualTo(String value) {
            addCriterion("cartItem_productsku_idStr <>", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrGreaterThan(String value) {
            addCriterion("cartItem_productsku_idStr >", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_idStr >=", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrLessThan(String value) {
            addCriterion("cartItem_productsku_idStr <", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrLessThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_idStr <=", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrLike(String value) {
            addCriterion("cartItem_productsku_idStr like", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrNotLike(String value) {
            addCriterion("cartItem_productsku_idStr not like", value, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrIn(List<String> values) {
            addCriterion("cartItem_productsku_idStr in", values, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrNotIn(List<String> values) {
            addCriterion("cartItem_productsku_idStr not in", values, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_idStr between", value1, value2, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdstrNotBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_idStr not between", value1, value2, "cartitemProductskuIdstr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrIsNull() {
            addCriterion("cartItem_productsku_idnameStr is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrIsNotNull() {
            addCriterion("cartItem_productsku_idnameStr is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrEqualTo(String value) {
            addCriterion("cartItem_productsku_idnameStr =", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrNotEqualTo(String value) {
            addCriterion("cartItem_productsku_idnameStr <>", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrGreaterThan(String value) {
            addCriterion("cartItem_productsku_idnameStr >", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_idnameStr >=", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrLessThan(String value) {
            addCriterion("cartItem_productsku_idnameStr <", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrLessThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_idnameStr <=", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrLike(String value) {
            addCriterion("cartItem_productsku_idnameStr like", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrNotLike(String value) {
            addCriterion("cartItem_productsku_idnameStr not like", value, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrIn(List<String> values) {
            addCriterion("cartItem_productsku_idnameStr in", values, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrNotIn(List<String> values) {
            addCriterion("cartItem_productsku_idnameStr not in", values, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_idnameStr between", value1, value2, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuIdnamestrNotBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_idnameStr not between", value1, value2, "cartitemProductskuIdnamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrIsNull() {
            addCriterion("cartItem_productsku_nameStr is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrIsNotNull() {
            addCriterion("cartItem_productsku_nameStr is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrEqualTo(String value) {
            addCriterion("cartItem_productsku_nameStr =", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrNotEqualTo(String value) {
            addCriterion("cartItem_productsku_nameStr <>", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrGreaterThan(String value) {
            addCriterion("cartItem_productsku_nameStr >", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_nameStr >=", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrLessThan(String value) {
            addCriterion("cartItem_productsku_nameStr <", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrLessThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_nameStr <=", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrLike(String value) {
            addCriterion("cartItem_productsku_nameStr like", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrNotLike(String value) {
            addCriterion("cartItem_productsku_nameStr not like", value, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrIn(List<String> values) {
            addCriterion("cartItem_productsku_nameStr in", values, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrNotIn(List<String> values) {
            addCriterion("cartItem_productsku_nameStr not in", values, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_nameStr between", value1, value2, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuNamestrNotBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_nameStr not between", value1, value2, "cartitemProductskuNamestr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrIsNull() {
            addCriterion("cartItem_productsku_moneyStr is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrIsNotNull() {
            addCriterion("cartItem_productsku_moneyStr is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrEqualTo(String value) {
            addCriterion("cartItem_productsku_moneyStr =", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrNotEqualTo(String value) {
            addCriterion("cartItem_productsku_moneyStr <>", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrGreaterThan(String value) {
            addCriterion("cartItem_productsku_moneyStr >", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_moneyStr >=", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrLessThan(String value) {
            addCriterion("cartItem_productsku_moneyStr <", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrLessThanOrEqualTo(String value) {
            addCriterion("cartItem_productsku_moneyStr <=", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrLike(String value) {
            addCriterion("cartItem_productsku_moneyStr like", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrNotLike(String value) {
            addCriterion("cartItem_productsku_moneyStr not like", value, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrIn(List<String> values) {
            addCriterion("cartItem_productsku_moneyStr in", values, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrNotIn(List<String> values) {
            addCriterion("cartItem_productsku_moneyStr not in", values, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_moneyStr between", value1, value2, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductskuMoneystrNotBetween(String value1, String value2) {
            addCriterion("cartItem_productsku_moneyStr not between", value1, value2, "cartitemProductskuMoneystr");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberIsNull() {
            addCriterion("cartItem_product_number is null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberIsNotNull() {
            addCriterion("cartItem_product_number is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberEqualTo(Integer value) {
            addCriterion("cartItem_product_number =", value, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberNotEqualTo(Integer value) {
            addCriterion("cartItem_product_number <>", value, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberGreaterThan(Integer value) {
            addCriterion("cartItem_product_number >", value, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("cartItem_product_number >=", value, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberLessThan(Integer value) {
            addCriterion("cartItem_product_number <", value, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberLessThanOrEqualTo(Integer value) {
            addCriterion("cartItem_product_number <=", value, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberIn(List<Integer> values) {
            addCriterion("cartItem_product_number in", values, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberNotIn(List<Integer> values) {
            addCriterion("cartItem_product_number not in", values, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_product_number between", value1, value2, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemProductNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("cartItem_product_number not between", value1, value2, "cartitemProductNumber");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeIsNull() {
            addCriterion("cartItem_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeIsNotNull() {
            addCriterion("cartItem_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeEqualTo(String value) {
            addCriterion("cartItem_createTime =", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeNotEqualTo(String value) {
            addCriterion("cartItem_createTime <>", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeGreaterThan(String value) {
            addCriterion("cartItem_createTime >", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_createTime >=", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeLessThan(String value) {
            addCriterion("cartItem_createTime <", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("cartItem_createTime <=", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeLike(String value) {
            addCriterion("cartItem_createTime like", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeNotLike(String value) {
            addCriterion("cartItem_createTime not like", value, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeIn(List<String> values) {
            addCriterion("cartItem_createTime in", values, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeNotIn(List<String> values) {
            addCriterion("cartItem_createTime not in", values, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeBetween(String value1, String value2) {
            addCriterion("cartItem_createTime between", value1, value2, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemCreatetimeNotBetween(String value1, String value2) {
            addCriterion("cartItem_createTime not between", value1, value2, "cartitemCreatetime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeIsNull() {
            addCriterion("cartItem_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeIsNotNull() {
            addCriterion("cartItem_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeEqualTo(String value) {
            addCriterion("cartItem_motifyTime =", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeNotEqualTo(String value) {
            addCriterion("cartItem_motifyTime <>", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeGreaterThan(String value) {
            addCriterion("cartItem_motifyTime >", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("cartItem_motifyTime >=", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeLessThan(String value) {
            addCriterion("cartItem_motifyTime <", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("cartItem_motifyTime <=", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeLike(String value) {
            addCriterion("cartItem_motifyTime like", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeNotLike(String value) {
            addCriterion("cartItem_motifyTime not like", value, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeIn(List<String> values) {
            addCriterion("cartItem_motifyTime in", values, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeNotIn(List<String> values) {
            addCriterion("cartItem_motifyTime not in", values, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeBetween(String value1, String value2) {
            addCriterion("cartItem_motifyTime between", value1, value2, "cartitemMotifytime");
            return (Criteria) this;
        }

        public Criteria andCartitemMotifytimeNotBetween(String value1, String value2) {
            addCriterion("cartItem_motifyTime not between", value1, value2, "cartitemMotifytime");
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