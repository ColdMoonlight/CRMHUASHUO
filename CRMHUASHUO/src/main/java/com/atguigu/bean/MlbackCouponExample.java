package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MlbackCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackCouponExample() {
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

        public Criteria andCouponIdIsNull() {
            addCriterion("coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponIdIsNotNull() {
            addCriterion("coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponIdEqualTo(Integer value) {
            addCriterion("coupon_id =", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotEqualTo(Integer value) {
            addCriterion("coupon_id <>", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThan(Integer value) {
            addCriterion("coupon_id >", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_id >=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThan(Integer value) {
            addCriterion("coupon_id <", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_id <=", value, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdIn(List<Integer> values) {
            addCriterion("coupon_id in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotIn(List<Integer> values) {
            addCriterion("coupon_id not in", values, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_id not between", value1, value2, "couponId");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNull() {
            addCriterion("coupon_name is null");
            return (Criteria) this;
        }

        public Criteria andCouponNameIsNotNull() {
            addCriterion("coupon_name is not null");
            return (Criteria) this;
        }

        public Criteria andCouponNameEqualTo(String value) {
            addCriterion("coupon_name =", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotEqualTo(String value) {
            addCriterion("coupon_name <>", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThan(String value) {
            addCriterion("coupon_name >", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_name >=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThan(String value) {
            addCriterion("coupon_name <", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLessThanOrEqualTo(String value) {
            addCriterion("coupon_name <=", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameLike(String value) {
            addCriterion("coupon_name like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotLike(String value) {
            addCriterion("coupon_name not like", value, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameIn(List<String> values) {
            addCriterion("coupon_name in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotIn(List<String> values) {
            addCriterion("coupon_name not in", values, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameBetween(String value1, String value2) {
            addCriterion("coupon_name between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponNameNotBetween(String value1, String value2) {
            addCriterion("coupon_name not between", value1, value2, "couponName");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNull() {
            addCriterion("coupon_price is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIsNotNull() {
            addCriterion("coupon_price is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceEqualTo(BigDecimal value) {
            addCriterion("coupon_price =", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotEqualTo(BigDecimal value) {
            addCriterion("coupon_price <>", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThan(BigDecimal value) {
            addCriterion("coupon_price >", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price >=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThan(BigDecimal value) {
            addCriterion("coupon_price <", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price <=", value, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceIn(List<BigDecimal> values) {
            addCriterion("coupon_price in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotIn(List<BigDecimal> values) {
            addCriterion("coupon_price not in", values, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price not between", value1, value2, "couponPrice");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineIsNull() {
            addCriterion("coupon_price_baseline is null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineIsNotNull() {
            addCriterion("coupon_price_baseline is not null");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineEqualTo(BigDecimal value) {
            addCriterion("coupon_price_baseline =", value, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineNotEqualTo(BigDecimal value) {
            addCriterion("coupon_price_baseline <>", value, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineGreaterThan(BigDecimal value) {
            addCriterion("coupon_price_baseline >", value, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price_baseline >=", value, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineLessThan(BigDecimal value) {
            addCriterion("coupon_price_baseline <", value, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineLessThanOrEqualTo(BigDecimal value) {
            addCriterion("coupon_price_baseline <=", value, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineIn(List<BigDecimal> values) {
            addCriterion("coupon_price_baseline in", values, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineNotIn(List<BigDecimal> values) {
            addCriterion("coupon_price_baseline not in", values, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price_baseline between", value1, value2, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponPriceBaselineNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("coupon_price_baseline not between", value1, value2, "couponPriceBaseline");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNull() {
            addCriterion("coupon_status is null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIsNotNull() {
            addCriterion("coupon_status is not null");
            return (Criteria) this;
        }

        public Criteria andCouponStatusEqualTo(Integer value) {
            addCriterion("coupon_status =", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotEqualTo(Integer value) {
            addCriterion("coupon_status <>", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThan(Integer value) {
            addCriterion("coupon_status >", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_status >=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThan(Integer value) {
            addCriterion("coupon_status <", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_status <=", value, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusIn(List<Integer> values) {
            addCriterion("coupon_status in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotIn(List<Integer> values) {
            addCriterion("coupon_status not in", values, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_status not between", value1, value2, "couponStatus");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNull() {
            addCriterion("coupon_code is null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIsNotNull() {
            addCriterion("coupon_code is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCodeEqualTo(String value) {
            addCriterion("coupon_code =", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotEqualTo(String value) {
            addCriterion("coupon_code <>", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThan(String value) {
            addCriterion("coupon_code >", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_code >=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThan(String value) {
            addCriterion("coupon_code <", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLessThanOrEqualTo(String value) {
            addCriterion("coupon_code <=", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeLike(String value) {
            addCriterion("coupon_code like", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotLike(String value) {
            addCriterion("coupon_code not like", value, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeIn(List<String> values) {
            addCriterion("coupon_code in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotIn(List<String> values) {
            addCriterion("coupon_code not in", values, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeBetween(String value1, String value2) {
            addCriterion("coupon_code between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponCodeNotBetween(String value1, String value2) {
            addCriterion("coupon_code not between", value1, value2, "couponCode");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdIsNull() {
            addCriterion("coupon_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdIsNotNull() {
            addCriterion("coupon_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdEqualTo(Integer value) {
            addCriterion("coupon_admin_id =", value, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdNotEqualTo(Integer value) {
            addCriterion("coupon_admin_id <>", value, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdGreaterThan(Integer value) {
            addCriterion("coupon_admin_id >", value, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("coupon_admin_id >=", value, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdLessThan(Integer value) {
            addCriterion("coupon_admin_id <", value, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("coupon_admin_id <=", value, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdIn(List<Integer> values) {
            addCriterion("coupon_admin_id in", values, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdNotIn(List<Integer> values) {
            addCriterion("coupon_admin_id not in", values, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("coupon_admin_id between", value1, value2, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("coupon_admin_id not between", value1, value2, "couponAdminId");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameIsNull() {
            addCriterion("coupon_admin_operatorName is null");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameIsNotNull() {
            addCriterion("coupon_admin_operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameEqualTo(String value) {
            addCriterion("coupon_admin_operatorName =", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameNotEqualTo(String value) {
            addCriterion("coupon_admin_operatorName <>", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameGreaterThan(String value) {
            addCriterion("coupon_admin_operatorName >", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_admin_operatorName >=", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameLessThan(String value) {
            addCriterion("coupon_admin_operatorName <", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameLessThanOrEqualTo(String value) {
            addCriterion("coupon_admin_operatorName <=", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameLike(String value) {
            addCriterion("coupon_admin_operatorName like", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameNotLike(String value) {
            addCriterion("coupon_admin_operatorName not like", value, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameIn(List<String> values) {
            addCriterion("coupon_admin_operatorName in", values, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameNotIn(List<String> values) {
            addCriterion("coupon_admin_operatorName not in", values, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameBetween(String value1, String value2) {
            addCriterion("coupon_admin_operatorName between", value1, value2, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponAdminOperatornameNotBetween(String value1, String value2) {
            addCriterion("coupon_admin_operatorName not between", value1, value2, "couponAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeIsNull() {
            addCriterion("coupon_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeIsNotNull() {
            addCriterion("coupon_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeEqualTo(String value) {
            addCriterion("coupon_createTime =", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotEqualTo(String value) {
            addCriterion("coupon_createTime <>", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeGreaterThan(String value) {
            addCriterion("coupon_createTime >", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_createTime >=", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeLessThan(String value) {
            addCriterion("coupon_createTime <", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("coupon_createTime <=", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeLike(String value) {
            addCriterion("coupon_createTime like", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotLike(String value) {
            addCriterion("coupon_createTime not like", value, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeIn(List<String> values) {
            addCriterion("coupon_createTime in", values, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotIn(List<String> values) {
            addCriterion("coupon_createTime not in", values, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeBetween(String value1, String value2) {
            addCriterion("coupon_createTime between", value1, value2, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponCreatetimeNotBetween(String value1, String value2) {
            addCriterion("coupon_createTime not between", value1, value2, "couponCreatetime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeIsNull() {
            addCriterion("coupon_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeIsNotNull() {
            addCriterion("coupon_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeEqualTo(String value) {
            addCriterion("coupon_motifyTime =", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeNotEqualTo(String value) {
            addCriterion("coupon_motifyTime <>", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeGreaterThan(String value) {
            addCriterion("coupon_motifyTime >", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_motifyTime >=", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeLessThan(String value) {
            addCriterion("coupon_motifyTime <", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("coupon_motifyTime <=", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeLike(String value) {
            addCriterion("coupon_motifyTime like", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeNotLike(String value) {
            addCriterion("coupon_motifyTime not like", value, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeIn(List<String> values) {
            addCriterion("coupon_motifyTime in", values, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeNotIn(List<String> values) {
            addCriterion("coupon_motifyTime not in", values, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeBetween(String value1, String value2) {
            addCriterion("coupon_motifyTime between", value1, value2, "couponMotifytime");
            return (Criteria) this;
        }

        public Criteria andCouponMotifytimeNotBetween(String value1, String value2) {
            addCriterion("coupon_motifyTime not between", value1, value2, "couponMotifytime");
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