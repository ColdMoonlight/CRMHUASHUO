package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MlbackProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackProductExample() {
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

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductSeoIsNull() {
            addCriterion("product_seo is null");
            return (Criteria) this;
        }

        public Criteria andProductSeoIsNotNull() {
            addCriterion("product_seo is not null");
            return (Criteria) this;
        }

        public Criteria andProductSeoEqualTo(String value) {
            addCriterion("product_seo =", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoNotEqualTo(String value) {
            addCriterion("product_seo <>", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoGreaterThan(String value) {
            addCriterion("product_seo >", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoGreaterThanOrEqualTo(String value) {
            addCriterion("product_seo >=", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoLessThan(String value) {
            addCriterion("product_seo <", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoLessThanOrEqualTo(String value) {
            addCriterion("product_seo <=", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoLike(String value) {
            addCriterion("product_seo like", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoNotLike(String value) {
            addCriterion("product_seo not like", value, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoIn(List<String> values) {
            addCriterion("product_seo in", values, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoNotIn(List<String> values) {
            addCriterion("product_seo not in", values, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoBetween(String value1, String value2) {
            addCriterion("product_seo between", value1, value2, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductSeoNotBetween(String value1, String value2) {
            addCriterion("product_seo not between", value1, value2, "productSeo");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidIsNull() {
            addCriterion("product_categoryId is null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidIsNotNull() {
            addCriterion("product_categoryId is not null");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidEqualTo(Integer value) {
            addCriterion("product_categoryId =", value, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidNotEqualTo(Integer value) {
            addCriterion("product_categoryId <>", value, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidGreaterThan(Integer value) {
            addCriterion("product_categoryId >", value, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_categoryId >=", value, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidLessThan(Integer value) {
            addCriterion("product_categoryId <", value, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidLessThanOrEqualTo(Integer value) {
            addCriterion("product_categoryId <=", value, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidIn(List<Integer> values) {
            addCriterion("product_categoryId in", values, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidNotIn(List<Integer> values) {
            addCriterion("product_categoryId not in", values, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidBetween(Integer value1, Integer value2) {
            addCriterion("product_categoryId between", value1, value2, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductCategoryidNotBetween(Integer value1, Integer value2) {
            addCriterion("product_categoryId not between", value1, value2, "productCategoryid");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlIsNull() {
            addCriterion("product_mainimgurl is null");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlIsNotNull() {
            addCriterion("product_mainimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlEqualTo(String value) {
            addCriterion("product_mainimgurl =", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlNotEqualTo(String value) {
            addCriterion("product_mainimgurl <>", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlGreaterThan(String value) {
            addCriterion("product_mainimgurl >", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("product_mainimgurl >=", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlLessThan(String value) {
            addCriterion("product_mainimgurl <", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlLessThanOrEqualTo(String value) {
            addCriterion("product_mainimgurl <=", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlLike(String value) {
            addCriterion("product_mainimgurl like", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlNotLike(String value) {
            addCriterion("product_mainimgurl not like", value, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlIn(List<String> values) {
            addCriterion("product_mainimgurl in", values, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlNotIn(List<String> values) {
            addCriterion("product_mainimgurl not in", values, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlBetween(String value1, String value2) {
            addCriterion("product_mainimgurl between", value1, value2, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductMainimgurlNotBetween(String value1, String value2) {
            addCriterion("product_mainimgurl not between", value1, value2, "productMainimgurl");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceIsNull() {
            addCriterion("product_originalPrice is null");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceIsNotNull() {
            addCriterion("product_originalPrice is not null");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceEqualTo(BigDecimal value) {
            addCriterion("product_originalPrice =", value, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceNotEqualTo(BigDecimal value) {
            addCriterion("product_originalPrice <>", value, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceGreaterThan(BigDecimal value) {
            addCriterion("product_originalPrice >", value, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("product_originalPrice >=", value, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceLessThan(BigDecimal value) {
            addCriterion("product_originalPrice <", value, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("product_originalPrice <=", value, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceIn(List<BigDecimal> values) {
            addCriterion("product_originalPrice in", values, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceNotIn(List<BigDecimal> values) {
            addCriterion("product_originalPrice not in", values, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_originalPrice between", value1, value2, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductOriginalpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("product_originalPrice not between", value1, value2, "productOriginalprice");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumIsNull() {
            addCriterion("product_haveSaleNum is null");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumIsNotNull() {
            addCriterion("product_haveSaleNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumEqualTo(Integer value) {
            addCriterion("product_haveSaleNum =", value, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumNotEqualTo(Integer value) {
            addCriterion("product_haveSaleNum <>", value, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumGreaterThan(Integer value) {
            addCriterion("product_haveSaleNum >", value, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_haveSaleNum >=", value, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumLessThan(Integer value) {
            addCriterion("product_haveSaleNum <", value, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumLessThanOrEqualTo(Integer value) {
            addCriterion("product_haveSaleNum <=", value, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumIn(List<Integer> values) {
            addCriterion("product_haveSaleNum in", values, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumNotIn(List<Integer> values) {
            addCriterion("product_haveSaleNum not in", values, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumBetween(Integer value1, Integer value2) {
            addCriterion("product_haveSaleNum between", value1, value2, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductHavesalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_haveSaleNum not between", value1, value2, "productHavesalenum");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNull() {
            addCriterion("product_status is null");
            return (Criteria) this;
        }

        public Criteria andProductStatusIsNotNull() {
            addCriterion("product_status is not null");
            return (Criteria) this;
        }

        public Criteria andProductStatusEqualTo(Integer value) {
            addCriterion("product_status =", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotEqualTo(Integer value) {
            addCriterion("product_status <>", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThan(Integer value) {
            addCriterion("product_status >", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_status >=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThan(Integer value) {
            addCriterion("product_status <", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusLessThanOrEqualTo(Integer value) {
            addCriterion("product_status <=", value, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusIn(List<Integer> values) {
            addCriterion("product_status in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotIn(List<Integer> values) {
            addCriterion("product_status not in", values, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusBetween(Integer value1, Integer value2) {
            addCriterion("product_status between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("product_status not between", value1, value2, "productStatus");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNull() {
            addCriterion("product_createTime is null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIsNotNull() {
            addCriterion("product_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeEqualTo(String value) {
            addCriterion("product_createTime =", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotEqualTo(String value) {
            addCriterion("product_createTime <>", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThan(String value) {
            addCriterion("product_createTime >", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("product_createTime >=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThan(String value) {
            addCriterion("product_createTime <", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("product_createTime <=", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeLike(String value) {
            addCriterion("product_createTime like", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotLike(String value) {
            addCriterion("product_createTime not like", value, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeIn(List<String> values) {
            addCriterion("product_createTime in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotIn(List<String> values) {
            addCriterion("product_createTime not in", values, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeBetween(String value1, String value2) {
            addCriterion("product_createTime between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductCreatetimeNotBetween(String value1, String value2) {
            addCriterion("product_createTime not between", value1, value2, "productCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeIsNull() {
            addCriterion("product_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeIsNotNull() {
            addCriterion("product_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeEqualTo(String value) {
            addCriterion("product_motifyTime =", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeNotEqualTo(String value) {
            addCriterion("product_motifyTime <>", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeGreaterThan(String value) {
            addCriterion("product_motifyTime >", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("product_motifyTime >=", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeLessThan(String value) {
            addCriterion("product_motifyTime <", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("product_motifyTime <=", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeLike(String value) {
            addCriterion("product_motifyTime like", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeNotLike(String value) {
            addCriterion("product_motifyTime not like", value, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeIn(List<String> values) {
            addCriterion("product_motifyTime in", values, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeNotIn(List<String> values) {
            addCriterion("product_motifyTime not in", values, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeBetween(String value1, String value2) {
            addCriterion("product_motifyTime between", value1, value2, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductMotifytimeNotBetween(String value1, String value2) {
            addCriterion("product_motifyTime not between", value1, value2, "productMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdIsNull() {
            addCriterion("product_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdIsNotNull() {
            addCriterion("product_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdEqualTo(Integer value) {
            addCriterion("product_admin_id =", value, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdNotEqualTo(Integer value) {
            addCriterion("product_admin_id <>", value, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdGreaterThan(Integer value) {
            addCriterion("product_admin_id >", value, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_admin_id >=", value, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdLessThan(Integer value) {
            addCriterion("product_admin_id <", value, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_admin_id <=", value, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdIn(List<Integer> values) {
            addCriterion("product_admin_id in", values, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdNotIn(List<Integer> values) {
            addCriterion("product_admin_id not in", values, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("product_admin_id between", value1, value2, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_admin_id not between", value1, value2, "productAdminId");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameIsNull() {
            addCriterion("product_admin_operatorName is null");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameIsNotNull() {
            addCriterion("product_admin_operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameEqualTo(String value) {
            addCriterion("product_admin_operatorName =", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameNotEqualTo(String value) {
            addCriterion("product_admin_operatorName <>", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameGreaterThan(String value) {
            addCriterion("product_admin_operatorName >", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("product_admin_operatorName >=", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameLessThan(String value) {
            addCriterion("product_admin_operatorName <", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameLessThanOrEqualTo(String value) {
            addCriterion("product_admin_operatorName <=", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameLike(String value) {
            addCriterion("product_admin_operatorName like", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameNotLike(String value) {
            addCriterion("product_admin_operatorName not like", value, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameIn(List<String> values) {
            addCriterion("product_admin_operatorName in", values, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameNotIn(List<String> values) {
            addCriterion("product_admin_operatorName not in", values, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameBetween(String value1, String value2) {
            addCriterion("product_admin_operatorName between", value1, value2, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductAdminOperatornameNotBetween(String value1, String value2) {
            addCriterion("product_admin_operatorName not between", value1, value2, "productAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andProductLableIsNull() {
            addCriterion("product_lable is null");
            return (Criteria) this;
        }

        public Criteria andProductLableIsNotNull() {
            addCriterion("product_lable is not null");
            return (Criteria) this;
        }

        public Criteria andProductLableEqualTo(Integer value) {
            addCriterion("product_lable =", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotEqualTo(Integer value) {
            addCriterion("product_lable <>", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableGreaterThan(Integer value) {
            addCriterion("product_lable >", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_lable >=", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableLessThan(Integer value) {
            addCriterion("product_lable <", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableLessThanOrEqualTo(Integer value) {
            addCriterion("product_lable <=", value, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableIn(List<Integer> values) {
            addCriterion("product_lable in", values, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotIn(List<Integer> values) {
            addCriterion("product_lable not in", values, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableBetween(Integer value1, Integer value2) {
            addCriterion("product_lable between", value1, value2, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductLableNotBetween(Integer value1, Integer value2) {
            addCriterion("product_lable not between", value1, value2, "productLable");
            return (Criteria) this;
        }

        public Criteria andProductActoffidIsNull() {
            addCriterion("product_actoffId is null");
            return (Criteria) this;
        }

        public Criteria andProductActoffidIsNotNull() {
            addCriterion("product_actoffId is not null");
            return (Criteria) this;
        }

        public Criteria andProductActoffidEqualTo(Integer value) {
            addCriterion("product_actoffId =", value, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidNotEqualTo(Integer value) {
            addCriterion("product_actoffId <>", value, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidGreaterThan(Integer value) {
            addCriterion("product_actoffId >", value, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_actoffId >=", value, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidLessThan(Integer value) {
            addCriterion("product_actoffId <", value, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidLessThanOrEqualTo(Integer value) {
            addCriterion("product_actoffId <=", value, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidIn(List<Integer> values) {
            addCriterion("product_actoffId in", values, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidNotIn(List<Integer> values) {
            addCriterion("product_actoffId not in", values, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidBetween(Integer value1, Integer value2) {
            addCriterion("product_actoffId between", value1, value2, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffidNotBetween(Integer value1, Integer value2) {
            addCriterion("product_actoffId not between", value1, value2, "productActoffid");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffIsNull() {
            addCriterion("product_actoffOff is null");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffIsNotNull() {
            addCriterion("product_actoffOff is not null");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffEqualTo(Integer value) {
            addCriterion("product_actoffOff =", value, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffNotEqualTo(Integer value) {
            addCriterion("product_actoffOff <>", value, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffGreaterThan(Integer value) {
            addCriterion("product_actoffOff >", value, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_actoffOff >=", value, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffLessThan(Integer value) {
            addCriterion("product_actoffOff <", value, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffLessThanOrEqualTo(Integer value) {
            addCriterion("product_actoffOff <=", value, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffIn(List<Integer> values) {
            addCriterion("product_actoffOff in", values, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffNotIn(List<Integer> values) {
            addCriterion("product_actoffOff not in", values, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffBetween(Integer value1, Integer value2) {
            addCriterion("product_actoffOff between", value1, value2, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductActoffoffNotBetween(Integer value1, Integer value2) {
            addCriterion("product_actoffOff not between", value1, value2, "productActoffoff");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumIsNull() {
            addCriterion("product_reviewNum is null");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumIsNotNull() {
            addCriterion("product_reviewNum is not null");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumEqualTo(Integer value) {
            addCriterion("product_reviewNum =", value, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumNotEqualTo(Integer value) {
            addCriterion("product_reviewNum <>", value, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumGreaterThan(Integer value) {
            addCriterion("product_reviewNum >", value, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_reviewNum >=", value, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumLessThan(Integer value) {
            addCriterion("product_reviewNum <", value, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumLessThanOrEqualTo(Integer value) {
            addCriterion("product_reviewNum <=", value, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumIn(List<Integer> values) {
            addCriterion("product_reviewNum in", values, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumNotIn(List<Integer> values) {
            addCriterion("product_reviewNum not in", values, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumBetween(Integer value1, Integer value2) {
            addCriterion("product_reviewNum between", value1, value2, "productReviewnum");
            return (Criteria) this;
        }

        public Criteria andProductReviewnumNotBetween(Integer value1, Integer value2) {
            addCriterion("product_reviewNum not between", value1, value2, "productReviewnum");
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