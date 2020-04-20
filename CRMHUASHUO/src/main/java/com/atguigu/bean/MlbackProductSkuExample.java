package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackProductSkuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackProductSkuExample() {
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

        public Criteria andProductskuIdIsNull() {
            addCriterion("productSku_id is null");
            return (Criteria) this;
        }

        public Criteria andProductskuIdIsNotNull() {
            addCriterion("productSku_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuIdEqualTo(Integer value) {
            addCriterion("productSku_id =", value, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdNotEqualTo(Integer value) {
            addCriterion("productSku_id <>", value, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdGreaterThan(Integer value) {
            addCriterion("productSku_id >", value, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productSku_id >=", value, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdLessThan(Integer value) {
            addCriterion("productSku_id <", value, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdLessThanOrEqualTo(Integer value) {
            addCriterion("productSku_id <=", value, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdIn(List<Integer> values) {
            addCriterion("productSku_id in", values, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdNotIn(List<Integer> values) {
            addCriterion("productSku_id not in", values, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdBetween(Integer value1, Integer value2) {
            addCriterion("productSku_id between", value1, value2, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productSku_id not between", value1, value2, "productskuId");
            return (Criteria) this;
        }

        public Criteria andProductskuNameIsNull() {
            addCriterion("productSku_name is null");
            return (Criteria) this;
        }

        public Criteria andProductskuNameIsNotNull() {
            addCriterion("productSku_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuNameEqualTo(String value) {
            addCriterion("productSku_name =", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameNotEqualTo(String value) {
            addCriterion("productSku_name <>", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameGreaterThan(String value) {
            addCriterion("productSku_name >", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_name >=", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameLessThan(String value) {
            addCriterion("productSku_name <", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameLessThanOrEqualTo(String value) {
            addCriterion("productSku_name <=", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameLike(String value) {
            addCriterion("productSku_name like", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameNotLike(String value) {
            addCriterion("productSku_name not like", value, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameIn(List<String> values) {
            addCriterion("productSku_name in", values, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameNotIn(List<String> values) {
            addCriterion("productSku_name not in", values, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameBetween(String value1, String value2) {
            addCriterion("productSku_name between", value1, value2, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameNotBetween(String value1, String value2) {
            addCriterion("productSku_name not between", value1, value2, "productskuName");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsIsNull() {
            addCriterion("productSku_name_details is null");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsIsNotNull() {
            addCriterion("productSku_name_details is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsEqualTo(String value) {
            addCriterion("productSku_name_details =", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsNotEqualTo(String value) {
            addCriterion("productSku_name_details <>", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsGreaterThan(String value) {
            addCriterion("productSku_name_details >", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_name_details >=", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsLessThan(String value) {
            addCriterion("productSku_name_details <", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsLessThanOrEqualTo(String value) {
            addCriterion("productSku_name_details <=", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsLike(String value) {
            addCriterion("productSku_name_details like", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsNotLike(String value) {
            addCriterion("productSku_name_details not like", value, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsIn(List<String> values) {
            addCriterion("productSku_name_details in", values, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsNotIn(List<String> values) {
            addCriterion("productSku_name_details not in", values, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsBetween(String value1, String value2) {
            addCriterion("productSku_name_details between", value1, value2, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuNameDetailsNotBetween(String value1, String value2) {
            addCriterion("productSku_name_details not between", value1, value2, "productskuNameDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsIsNull() {
            addCriterion("productSku_money_details is null");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsIsNotNull() {
            addCriterion("productSku_money_details is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsEqualTo(String value) {
            addCriterion("productSku_money_details =", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsNotEqualTo(String value) {
            addCriterion("productSku_money_details <>", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsGreaterThan(String value) {
            addCriterion("productSku_money_details >", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_money_details >=", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsLessThan(String value) {
            addCriterion("productSku_money_details <", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsLessThanOrEqualTo(String value) {
            addCriterion("productSku_money_details <=", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsLike(String value) {
            addCriterion("productSku_money_details like", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsNotLike(String value) {
            addCriterion("productSku_money_details not like", value, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsIn(List<String> values) {
            addCriterion("productSku_money_details in", values, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsNotIn(List<String> values) {
            addCriterion("productSku_money_details not in", values, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsBetween(String value1, String value2) {
            addCriterion("productSku_money_details between", value1, value2, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuMoneyDetailsNotBetween(String value1, String value2) {
            addCriterion("productSku_money_details not between", value1, value2, "productskuMoneyDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsIsNull() {
            addCriterion("productSku_stock_details is null");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsIsNotNull() {
            addCriterion("productSku_stock_details is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsEqualTo(String value) {
            addCriterion("productSku_stock_details =", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsNotEqualTo(String value) {
            addCriterion("productSku_stock_details <>", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsGreaterThan(String value) {
            addCriterion("productSku_stock_details >", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_stock_details >=", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsLessThan(String value) {
            addCriterion("productSku_stock_details <", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsLessThanOrEqualTo(String value) {
            addCriterion("productSku_stock_details <=", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsLike(String value) {
            addCriterion("productSku_stock_details like", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsNotLike(String value) {
            addCriterion("productSku_stock_details not like", value, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsIn(List<String> values) {
            addCriterion("productSku_stock_details in", values, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsNotIn(List<String> values) {
            addCriterion("productSku_stock_details not in", values, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsBetween(String value1, String value2) {
            addCriterion("productSku_stock_details between", value1, value2, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuStockDetailsNotBetween(String value1, String value2) {
            addCriterion("productSku_stock_details not between", value1, value2, "productskuStockDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsIsNull() {
            addCriterion("productSku_imageurl_details is null");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsIsNotNull() {
            addCriterion("productSku_imageurl_details is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsEqualTo(String value) {
            addCriterion("productSku_imageurl_details =", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsNotEqualTo(String value) {
            addCriterion("productSku_imageurl_details <>", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsGreaterThan(String value) {
            addCriterion("productSku_imageurl_details >", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_imageurl_details >=", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsLessThan(String value) {
            addCriterion("productSku_imageurl_details <", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsLessThanOrEqualTo(String value) {
            addCriterion("productSku_imageurl_details <=", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsLike(String value) {
            addCriterion("productSku_imageurl_details like", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsNotLike(String value) {
            addCriterion("productSku_imageurl_details not like", value, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsIn(List<String> values) {
            addCriterion("productSku_imageurl_details in", values, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsNotIn(List<String> values) {
            addCriterion("productSku_imageurl_details not in", values, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsBetween(String value1, String value2) {
            addCriterion("productSku_imageurl_details between", value1, value2, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductskuImageurlDetailsNotBetween(String value1, String value2) {
            addCriterion("productSku_imageurl_details not between", value1, value2, "productskuImageurlDetails");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusIsNull() {
            addCriterion("productSku_status is null");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusIsNotNull() {
            addCriterion("productSku_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusEqualTo(Integer value) {
            addCriterion("productSku_status =", value, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusNotEqualTo(Integer value) {
            addCriterion("productSku_status <>", value, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusGreaterThan(Integer value) {
            addCriterion("productSku_status >", value, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("productSku_status >=", value, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusLessThan(Integer value) {
            addCriterion("productSku_status <", value, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusLessThanOrEqualTo(Integer value) {
            addCriterion("productSku_status <=", value, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusIn(List<Integer> values) {
            addCriterion("productSku_status in", values, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusNotIn(List<Integer> values) {
            addCriterion("productSku_status not in", values, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusBetween(Integer value1, Integer value2) {
            addCriterion("productSku_status between", value1, value2, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("productSku_status not between", value1, value2, "productskuStatus");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdIsNull() {
            addCriterion("productSku_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdIsNotNull() {
            addCriterion("productSku_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdEqualTo(Integer value) {
            addCriterion("productSku_admin_id =", value, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdNotEqualTo(Integer value) {
            addCriterion("productSku_admin_id <>", value, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdGreaterThan(Integer value) {
            addCriterion("productSku_admin_id >", value, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productSku_admin_id >=", value, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdLessThan(Integer value) {
            addCriterion("productSku_admin_id <", value, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("productSku_admin_id <=", value, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdIn(List<Integer> values) {
            addCriterion("productSku_admin_id in", values, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdNotIn(List<Integer> values) {
            addCriterion("productSku_admin_id not in", values, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("productSku_admin_id between", value1, value2, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productSku_admin_id not between", value1, value2, "productskuAdminId");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameIsNull() {
            addCriterion("productSku_admin_operatorName is null");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameIsNotNull() {
            addCriterion("productSku_admin_operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameEqualTo(String value) {
            addCriterion("productSku_admin_operatorName =", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameNotEqualTo(String value) {
            addCriterion("productSku_admin_operatorName <>", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameGreaterThan(String value) {
            addCriterion("productSku_admin_operatorName >", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_admin_operatorName >=", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameLessThan(String value) {
            addCriterion("productSku_admin_operatorName <", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameLessThanOrEqualTo(String value) {
            addCriterion("productSku_admin_operatorName <=", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameLike(String value) {
            addCriterion("productSku_admin_operatorName like", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameNotLike(String value) {
            addCriterion("productSku_admin_operatorName not like", value, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameIn(List<String> values) {
            addCriterion("productSku_admin_operatorName in", values, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameNotIn(List<String> values) {
            addCriterion("productSku_admin_operatorName not in", values, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameBetween(String value1, String value2) {
            addCriterion("productSku_admin_operatorName between", value1, value2, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuAdminOperatornameNotBetween(String value1, String value2) {
            addCriterion("productSku_admin_operatorName not between", value1, value2, "productskuAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeIsNull() {
            addCriterion("productSku_createTime is null");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeIsNotNull() {
            addCriterion("productSku_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeEqualTo(String value) {
            addCriterion("productSku_createTime =", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeNotEqualTo(String value) {
            addCriterion("productSku_createTime <>", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeGreaterThan(String value) {
            addCriterion("productSku_createTime >", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_createTime >=", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeLessThan(String value) {
            addCriterion("productSku_createTime <", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("productSku_createTime <=", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeLike(String value) {
            addCriterion("productSku_createTime like", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeNotLike(String value) {
            addCriterion("productSku_createTime not like", value, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeIn(List<String> values) {
            addCriterion("productSku_createTime in", values, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeNotIn(List<String> values) {
            addCriterion("productSku_createTime not in", values, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeBetween(String value1, String value2) {
            addCriterion("productSku_createTime between", value1, value2, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuCreatetimeNotBetween(String value1, String value2) {
            addCriterion("productSku_createTime not between", value1, value2, "productskuCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeIsNull() {
            addCriterion("productSku_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeIsNotNull() {
            addCriterion("productSku_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeEqualTo(String value) {
            addCriterion("productSku_motifyTime =", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeNotEqualTo(String value) {
            addCriterion("productSku_motifyTime <>", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeGreaterThan(String value) {
            addCriterion("productSku_motifyTime >", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("productSku_motifyTime >=", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeLessThan(String value) {
            addCriterion("productSku_motifyTime <", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("productSku_motifyTime <=", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeLike(String value) {
            addCriterion("productSku_motifyTime like", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeNotLike(String value) {
            addCriterion("productSku_motifyTime not like", value, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeIn(List<String> values) {
            addCriterion("productSku_motifyTime in", values, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeNotIn(List<String> values) {
            addCriterion("productSku_motifyTime not in", values, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeBetween(String value1, String value2) {
            addCriterion("productSku_motifyTime between", value1, value2, "productskuMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductskuMotifytimeNotBetween(String value1, String value2) {
            addCriterion("productSku_motifyTime not between", value1, value2, "productskuMotifytime");
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