package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlPaypalShipAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlPaypalShipAddressExample() {
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

        public Criteria andShippingaddressIdIsNull() {
            addCriterion("shippingAddress_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdIsNotNull() {
            addCriterion("shippingAddress_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdEqualTo(Integer value) {
            addCriterion("shippingAddress_id =", value, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdNotEqualTo(Integer value) {
            addCriterion("shippingAddress_id <>", value, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdGreaterThan(Integer value) {
            addCriterion("shippingAddress_id >", value, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shippingAddress_id >=", value, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdLessThan(Integer value) {
            addCriterion("shippingAddress_id <", value, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("shippingAddress_id <=", value, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdIn(List<Integer> values) {
            addCriterion("shippingAddress_id in", values, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdNotIn(List<Integer> values) {
            addCriterion("shippingAddress_id not in", values, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdBetween(Integer value1, Integer value2) {
            addCriterion("shippingAddress_id between", value1, value2, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shippingAddress_id not between", value1, value2, "shippingaddressId");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidIsNull() {
            addCriterion("shippingAddress_payInfoid is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidIsNotNull() {
            addCriterion("shippingAddress_payInfoid is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidEqualTo(String value) {
            addCriterion("shippingAddress_payInfoid =", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidNotEqualTo(String value) {
            addCriterion("shippingAddress_payInfoid <>", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidGreaterThan(String value) {
            addCriterion("shippingAddress_payInfoid >", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_payInfoid >=", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidLessThan(String value) {
            addCriterion("shippingAddress_payInfoid <", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_payInfoid <=", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidLike(String value) {
            addCriterion("shippingAddress_payInfoid like", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidNotLike(String value) {
            addCriterion("shippingAddress_payInfoid not like", value, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidIn(List<String> values) {
            addCriterion("shippingAddress_payInfoid in", values, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidNotIn(List<String> values) {
            addCriterion("shippingAddress_payInfoid not in", values, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidBetween(String value1, String value2) {
            addCriterion("shippingAddress_payInfoid between", value1, value2, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPayinfoidNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_payInfoid not between", value1, value2, "shippingaddressPayinfoid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidIsNull() {
            addCriterion("shippingAddress_paymentid is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidIsNotNull() {
            addCriterion("shippingAddress_paymentid is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidEqualTo(String value) {
            addCriterion("shippingAddress_paymentid =", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidNotEqualTo(String value) {
            addCriterion("shippingAddress_paymentid <>", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidGreaterThan(String value) {
            addCriterion("shippingAddress_paymentid >", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_paymentid >=", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidLessThan(String value) {
            addCriterion("shippingAddress_paymentid <", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_paymentid <=", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidLike(String value) {
            addCriterion("shippingAddress_paymentid like", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidNotLike(String value) {
            addCriterion("shippingAddress_paymentid not like", value, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidIn(List<String> values) {
            addCriterion("shippingAddress_paymentid in", values, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidNotIn(List<String> values) {
            addCriterion("shippingAddress_paymentid not in", values, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidBetween(String value1, String value2) {
            addCriterion("shippingAddress_paymentid between", value1, value2, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPaymentidNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_paymentid not between", value1, value2, "shippingaddressPaymentid");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameIsNull() {
            addCriterion("shippingAddress_recipient_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameIsNotNull() {
            addCriterion("shippingAddress_recipient_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameEqualTo(String value) {
            addCriterion("shippingAddress_recipient_name =", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameNotEqualTo(String value) {
            addCriterion("shippingAddress_recipient_name <>", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameGreaterThan(String value) {
            addCriterion("shippingAddress_recipient_name >", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_recipient_name >=", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameLessThan(String value) {
            addCriterion("shippingAddress_recipient_name <", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_recipient_name <=", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameLike(String value) {
            addCriterion("shippingAddress_recipient_name like", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameNotLike(String value) {
            addCriterion("shippingAddress_recipient_name not like", value, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameIn(List<String> values) {
            addCriterion("shippingAddress_recipient_name in", values, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameNotIn(List<String> values) {
            addCriterion("shippingAddress_recipient_name not in", values, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameBetween(String value1, String value2) {
            addCriterion("shippingAddress_recipient_name between", value1, value2, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressRecipientNameNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_recipient_name not between", value1, value2, "shippingaddressRecipientName");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeIsNull() {
            addCriterion("shippingAddress_country_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeIsNotNull() {
            addCriterion("shippingAddress_country_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeEqualTo(String value) {
            addCriterion("shippingAddress_country_code =", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeNotEqualTo(String value) {
            addCriterion("shippingAddress_country_code <>", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeGreaterThan(String value) {
            addCriterion("shippingAddress_country_code >", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_country_code >=", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeLessThan(String value) {
            addCriterion("shippingAddress_country_code <", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_country_code <=", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeLike(String value) {
            addCriterion("shippingAddress_country_code like", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeNotLike(String value) {
            addCriterion("shippingAddress_country_code not like", value, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeIn(List<String> values) {
            addCriterion("shippingAddress_country_code in", values, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeNotIn(List<String> values) {
            addCriterion("shippingAddress_country_code not in", values, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeBetween(String value1, String value2) {
            addCriterion("shippingAddress_country_code between", value1, value2, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCountryCodeNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_country_code not between", value1, value2, "shippingaddressCountryCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityIsNull() {
            addCriterion("shippingAddress_city is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityIsNotNull() {
            addCriterion("shippingAddress_city is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityEqualTo(String value) {
            addCriterion("shippingAddress_city =", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityNotEqualTo(String value) {
            addCriterion("shippingAddress_city <>", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityGreaterThan(String value) {
            addCriterion("shippingAddress_city >", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_city >=", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityLessThan(String value) {
            addCriterion("shippingAddress_city <", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_city <=", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityLike(String value) {
            addCriterion("shippingAddress_city like", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityNotLike(String value) {
            addCriterion("shippingAddress_city not like", value, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityIn(List<String> values) {
            addCriterion("shippingAddress_city in", values, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityNotIn(List<String> values) {
            addCriterion("shippingAddress_city not in", values, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityBetween(String value1, String value2) {
            addCriterion("shippingAddress_city between", value1, value2, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCityNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_city not between", value1, value2, "shippingaddressCity");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1IsNull() {
            addCriterion("shippingAddress_line1 is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1IsNotNull() {
            addCriterion("shippingAddress_line1 is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1EqualTo(String value) {
            addCriterion("shippingAddress_line1 =", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1NotEqualTo(String value) {
            addCriterion("shippingAddress_line1 <>", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1GreaterThan(String value) {
            addCriterion("shippingAddress_line1 >", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1GreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_line1 >=", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1LessThan(String value) {
            addCriterion("shippingAddress_line1 <", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1LessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_line1 <=", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1Like(String value) {
            addCriterion("shippingAddress_line1 like", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1NotLike(String value) {
            addCriterion("shippingAddress_line1 not like", value, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1In(List<String> values) {
            addCriterion("shippingAddress_line1 in", values, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1NotIn(List<String> values) {
            addCriterion("shippingAddress_line1 not in", values, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1Between(String value1, String value2) {
            addCriterion("shippingAddress_line1 between", value1, value2, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine1NotBetween(String value1, String value2) {
            addCriterion("shippingAddress_line1 not between", value1, value2, "shippingaddressLine1");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2IsNull() {
            addCriterion("shippingAddress_line2 is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2IsNotNull() {
            addCriterion("shippingAddress_line2 is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2EqualTo(String value) {
            addCriterion("shippingAddress_line2 =", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2NotEqualTo(String value) {
            addCriterion("shippingAddress_line2 <>", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2GreaterThan(String value) {
            addCriterion("shippingAddress_line2 >", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2GreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_line2 >=", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2LessThan(String value) {
            addCriterion("shippingAddress_line2 <", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2LessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_line2 <=", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2Like(String value) {
            addCriterion("shippingAddress_line2 like", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2NotLike(String value) {
            addCriterion("shippingAddress_line2 not like", value, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2In(List<String> values) {
            addCriterion("shippingAddress_line2 in", values, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2NotIn(List<String> values) {
            addCriterion("shippingAddress_line2 not in", values, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2Between(String value1, String value2) {
            addCriterion("shippingAddress_line2 between", value1, value2, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressLine2NotBetween(String value1, String value2) {
            addCriterion("shippingAddress_line2 not between", value1, value2, "shippingaddressLine2");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeIsNull() {
            addCriterion("shippingAddress_postal_code is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeIsNotNull() {
            addCriterion("shippingAddress_postal_code is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeEqualTo(String value) {
            addCriterion("shippingAddress_postal_code =", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeNotEqualTo(String value) {
            addCriterion("shippingAddress_postal_code <>", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeGreaterThan(String value) {
            addCriterion("shippingAddress_postal_code >", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_postal_code >=", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeLessThan(String value) {
            addCriterion("shippingAddress_postal_code <", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_postal_code <=", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeLike(String value) {
            addCriterion("shippingAddress_postal_code like", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeNotLike(String value) {
            addCriterion("shippingAddress_postal_code not like", value, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeIn(List<String> values) {
            addCriterion("shippingAddress_postal_code in", values, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeNotIn(List<String> values) {
            addCriterion("shippingAddress_postal_code not in", values, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeBetween(String value1, String value2) {
            addCriterion("shippingAddress_postal_code between", value1, value2, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressPostalCodeNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_postal_code not between", value1, value2, "shippingaddressPostalCode");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailIsNull() {
            addCriterion("shippingAddress_email is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailIsNotNull() {
            addCriterion("shippingAddress_email is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailEqualTo(String value) {
            addCriterion("shippingAddress_email =", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailNotEqualTo(String value) {
            addCriterion("shippingAddress_email <>", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailGreaterThan(String value) {
            addCriterion("shippingAddress_email >", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_email >=", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailLessThan(String value) {
            addCriterion("shippingAddress_email <", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_email <=", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailLike(String value) {
            addCriterion("shippingAddress_email like", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailNotLike(String value) {
            addCriterion("shippingAddress_email not like", value, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailIn(List<String> values) {
            addCriterion("shippingAddress_email in", values, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailNotIn(List<String> values) {
            addCriterion("shippingAddress_email not in", values, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailBetween(String value1, String value2) {
            addCriterion("shippingAddress_email between", value1, value2, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressEmailNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_email not between", value1, value2, "shippingaddressEmail");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateIsNull() {
            addCriterion("shippingAddress_state is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateIsNotNull() {
            addCriterion("shippingAddress_state is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateEqualTo(String value) {
            addCriterion("shippingAddress_state =", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateNotEqualTo(String value) {
            addCriterion("shippingAddress_state <>", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateGreaterThan(String value) {
            addCriterion("shippingAddress_state >", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_state >=", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateLessThan(String value) {
            addCriterion("shippingAddress_state <", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_state <=", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateLike(String value) {
            addCriterion("shippingAddress_state like", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateNotLike(String value) {
            addCriterion("shippingAddress_state not like", value, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateIn(List<String> values) {
            addCriterion("shippingAddress_state in", values, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateNotIn(List<String> values) {
            addCriterion("shippingAddress_state not in", values, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateBetween(String value1, String value2) {
            addCriterion("shippingAddress_state between", value1, value2, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressStateNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_state not between", value1, value2, "shippingaddressState");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeIsNull() {
            addCriterion("shippingAddress_createTime is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeIsNotNull() {
            addCriterion("shippingAddress_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeEqualTo(String value) {
            addCriterion("shippingAddress_createTime =", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeNotEqualTo(String value) {
            addCriterion("shippingAddress_createTime <>", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeGreaterThan(String value) {
            addCriterion("shippingAddress_createTime >", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_createTime >=", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeLessThan(String value) {
            addCriterion("shippingAddress_createTime <", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_createTime <=", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeLike(String value) {
            addCriterion("shippingAddress_createTime like", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeNotLike(String value) {
            addCriterion("shippingAddress_createTime not like", value, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeIn(List<String> values) {
            addCriterion("shippingAddress_createTime in", values, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeNotIn(List<String> values) {
            addCriterion("shippingAddress_createTime not in", values, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeBetween(String value1, String value2) {
            addCriterion("shippingAddress_createTime between", value1, value2, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressCreatetimeNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_createTime not between", value1, value2, "shippingaddressCreatetime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeIsNull() {
            addCriterion("shippingAddress_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeIsNotNull() {
            addCriterion("shippingAddress_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeEqualTo(String value) {
            addCriterion("shippingAddress_motifyTime =", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeNotEqualTo(String value) {
            addCriterion("shippingAddress_motifyTime <>", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeGreaterThan(String value) {
            addCriterion("shippingAddress_motifyTime >", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("shippingAddress_motifyTime >=", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeLessThan(String value) {
            addCriterion("shippingAddress_motifyTime <", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("shippingAddress_motifyTime <=", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeLike(String value) {
            addCriterion("shippingAddress_motifyTime like", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeNotLike(String value) {
            addCriterion("shippingAddress_motifyTime not like", value, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeIn(List<String> values) {
            addCriterion("shippingAddress_motifyTime in", values, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeNotIn(List<String> values) {
            addCriterion("shippingAddress_motifyTime not in", values, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeBetween(String value1, String value2) {
            addCriterion("shippingAddress_motifyTime between", value1, value2, "shippingaddressMotifytime");
            return (Criteria) this;
        }

        public Criteria andShippingaddressMotifytimeNotBetween(String value1, String value2) {
            addCriterion("shippingAddress_motifyTime not between", value1, value2, "shippingaddressMotifytime");
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