package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlfrontAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontAddressExample() {
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

        public Criteria andAddressIdIsNull() {
            addCriterion("address_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressIdIsNotNull() {
            addCriterion("address_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIdEqualTo(Integer value) {
            addCriterion("address_id =", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotEqualTo(Integer value) {
            addCriterion("address_id <>", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThan(Integer value) {
            addCriterion("address_id >", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_id >=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThan(Integer value) {
            addCriterion("address_id <", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdLessThanOrEqualTo(Integer value) {
            addCriterion("address_id <=", value, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdIn(List<Integer> values) {
            addCriterion("address_id in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotIn(List<Integer> values) {
            addCriterion("address_id not in", values, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdBetween(Integer value1, Integer value2) {
            addCriterion("address_id between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressIdNotBetween(Integer value1, Integer value2) {
            addCriterion("address_id not between", value1, value2, "addressId");
            return (Criteria) this;
        }

        public Criteria andAddressUidIsNull() {
            addCriterion("address_uid is null");
            return (Criteria) this;
        }

        public Criteria andAddressUidIsNotNull() {
            addCriterion("address_uid is not null");
            return (Criteria) this;
        }

        public Criteria andAddressUidEqualTo(Integer value) {
            addCriterion("address_uid =", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotEqualTo(Integer value) {
            addCriterion("address_uid <>", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidGreaterThan(Integer value) {
            addCriterion("address_uid >", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_uid >=", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLessThan(Integer value) {
            addCriterion("address_uid <", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidLessThanOrEqualTo(Integer value) {
            addCriterion("address_uid <=", value, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidIn(List<Integer> values) {
            addCriterion("address_uid in", values, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotIn(List<Integer> values) {
            addCriterion("address_uid not in", values, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidBetween(Integer value1, Integer value2) {
            addCriterion("address_uid between", value1, value2, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressUidNotBetween(Integer value1, Integer value2) {
            addCriterion("address_uid not between", value1, value2, "addressUid");
            return (Criteria) this;
        }

        public Criteria andAddressIpIsNull() {
            addCriterion("address_ip is null");
            return (Criteria) this;
        }

        public Criteria andAddressIpIsNotNull() {
            addCriterion("address_ip is not null");
            return (Criteria) this;
        }

        public Criteria andAddressIpEqualTo(String value) {
            addCriterion("address_ip =", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpNotEqualTo(String value) {
            addCriterion("address_ip <>", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpGreaterThan(String value) {
            addCriterion("address_ip >", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpGreaterThanOrEqualTo(String value) {
            addCriterion("address_ip >=", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpLessThan(String value) {
            addCriterion("address_ip <", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpLessThanOrEqualTo(String value) {
            addCriterion("address_ip <=", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpLike(String value) {
            addCriterion("address_ip like", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpNotLike(String value) {
            addCriterion("address_ip not like", value, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpIn(List<String> values) {
            addCriterion("address_ip in", values, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpNotIn(List<String> values) {
            addCriterion("address_ip not in", values, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpBetween(String value1, String value2) {
            addCriterion("address_ip between", value1, value2, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressIpNotBetween(String value1, String value2) {
            addCriterion("address_ip not between", value1, value2, "addressIp");
            return (Criteria) this;
        }

        public Criteria andAddressEmailIsNull() {
            addCriterion("address_email is null");
            return (Criteria) this;
        }

        public Criteria andAddressEmailIsNotNull() {
            addCriterion("address_email is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEmailEqualTo(String value) {
            addCriterion("address_email =", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailNotEqualTo(String value) {
            addCriterion("address_email <>", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailGreaterThan(String value) {
            addCriterion("address_email >", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailGreaterThanOrEqualTo(String value) {
            addCriterion("address_email >=", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailLessThan(String value) {
            addCriterion("address_email <", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailLessThanOrEqualTo(String value) {
            addCriterion("address_email <=", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailLike(String value) {
            addCriterion("address_email like", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailNotLike(String value) {
            addCriterion("address_email not like", value, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailIn(List<String> values) {
            addCriterion("address_email in", values, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailNotIn(List<String> values) {
            addCriterion("address_email not in", values, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailBetween(String value1, String value2) {
            addCriterion("address_email between", value1, value2, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressEmailNotBetween(String value1, String value2) {
            addCriterion("address_email not between", value1, value2, "addressEmail");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneIsNull() {
            addCriterion("address_telephone is null");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneIsNotNull() {
            addCriterion("address_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneEqualTo(String value) {
            addCriterion("address_telephone =", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneNotEqualTo(String value) {
            addCriterion("address_telephone <>", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneGreaterThan(String value) {
            addCriterion("address_telephone >", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("address_telephone >=", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneLessThan(String value) {
            addCriterion("address_telephone <", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneLessThanOrEqualTo(String value) {
            addCriterion("address_telephone <=", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneLike(String value) {
            addCriterion("address_telephone like", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneNotLike(String value) {
            addCriterion("address_telephone not like", value, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneIn(List<String> values) {
            addCriterion("address_telephone in", values, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneNotIn(List<String> values) {
            addCriterion("address_telephone not in", values, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneBetween(String value1, String value2) {
            addCriterion("address_telephone between", value1, value2, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressTelephoneNotBetween(String value1, String value2) {
            addCriterion("address_telephone not between", value1, value2, "addressTelephone");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameIsNull() {
            addCriterion("address_userFirstName is null");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameIsNotNull() {
            addCriterion("address_userFirstName is not null");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameEqualTo(String value) {
            addCriterion("address_userFirstName =", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameNotEqualTo(String value) {
            addCriterion("address_userFirstName <>", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameGreaterThan(String value) {
            addCriterion("address_userFirstName >", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("address_userFirstName >=", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameLessThan(String value) {
            addCriterion("address_userFirstName <", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameLessThanOrEqualTo(String value) {
            addCriterion("address_userFirstName <=", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameLike(String value) {
            addCriterion("address_userFirstName like", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameNotLike(String value) {
            addCriterion("address_userFirstName not like", value, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameIn(List<String> values) {
            addCriterion("address_userFirstName in", values, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameNotIn(List<String> values) {
            addCriterion("address_userFirstName not in", values, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameBetween(String value1, String value2) {
            addCriterion("address_userFirstName between", value1, value2, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserfirstnameNotBetween(String value1, String value2) {
            addCriterion("address_userFirstName not between", value1, value2, "addressUserfirstname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameIsNull() {
            addCriterion("address_userLastName is null");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameIsNotNull() {
            addCriterion("address_userLastName is not null");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameEqualTo(String value) {
            addCriterion("address_userLastName =", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameNotEqualTo(String value) {
            addCriterion("address_userLastName <>", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameGreaterThan(String value) {
            addCriterion("address_userLastName >", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameGreaterThanOrEqualTo(String value) {
            addCriterion("address_userLastName >=", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameLessThan(String value) {
            addCriterion("address_userLastName <", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameLessThanOrEqualTo(String value) {
            addCriterion("address_userLastName <=", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameLike(String value) {
            addCriterion("address_userLastName like", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameNotLike(String value) {
            addCriterion("address_userLastName not like", value, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameIn(List<String> values) {
            addCriterion("address_userLastName in", values, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameNotIn(List<String> values) {
            addCriterion("address_userLastName not in", values, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameBetween(String value1, String value2) {
            addCriterion("address_userLastName between", value1, value2, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressUserlastnameNotBetween(String value1, String value2) {
            addCriterion("address_userLastName not between", value1, value2, "addressUserlastname");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIsNull() {
            addCriterion("address_country is null");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIsNotNull() {
            addCriterion("address_country is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCountryEqualTo(Integer value) {
            addCriterion("address_country =", value, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryNotEqualTo(Integer value) {
            addCriterion("address_country <>", value, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryGreaterThan(Integer value) {
            addCriterion("address_country >", value, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryGreaterThanOrEqualTo(Integer value) {
            addCriterion("address_country >=", value, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryLessThan(Integer value) {
            addCriterion("address_country <", value, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryLessThanOrEqualTo(Integer value) {
            addCriterion("address_country <=", value, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryIn(List<Integer> values) {
            addCriterion("address_country in", values, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryNotIn(List<Integer> values) {
            addCriterion("address_country not in", values, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryBetween(Integer value1, Integer value2) {
            addCriterion("address_country between", value1, value2, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressCountryNotBetween(Integer value1, Integer value2) {
            addCriterion("address_country not between", value1, value2, "addressCountry");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNull() {
            addCriterion("address_province is null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIsNotNull() {
            addCriterion("address_province is not null");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceEqualTo(String value) {
            addCriterion("address_province =", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotEqualTo(String value) {
            addCriterion("address_province <>", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThan(String value) {
            addCriterion("address_province >", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("address_province >=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThan(String value) {
            addCriterion("address_province <", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("address_province <=", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceLike(String value) {
            addCriterion("address_province like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotLike(String value) {
            addCriterion("address_province not like", value, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceIn(List<String> values) {
            addCriterion("address_province in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotIn(List<String> values) {
            addCriterion("address_province not in", values, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceBetween(String value1, String value2) {
            addCriterion("address_province between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("address_province not between", value1, value2, "addressProvince");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNull() {
            addCriterion("address_city is null");
            return (Criteria) this;
        }

        public Criteria andAddressCityIsNotNull() {
            addCriterion("address_city is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCityEqualTo(String value) {
            addCriterion("address_city =", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotEqualTo(String value) {
            addCriterion("address_city <>", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThan(String value) {
            addCriterion("address_city >", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("address_city >=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThan(String value) {
            addCriterion("address_city <", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLessThanOrEqualTo(String value) {
            addCriterion("address_city <=", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityLike(String value) {
            addCriterion("address_city like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotLike(String value) {
            addCriterion("address_city not like", value, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityIn(List<String> values) {
            addCriterion("address_city in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotIn(List<String> values) {
            addCriterion("address_city not in", values, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityBetween(String value1, String value2) {
            addCriterion("address_city between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressCityNotBetween(String value1, String value2) {
            addCriterion("address_city not between", value1, value2, "addressCity");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNull() {
            addCriterion("address_detail is null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIsNotNull() {
            addCriterion("address_detail is not null");
            return (Criteria) this;
        }

        public Criteria andAddressDetailEqualTo(String value) {
            addCriterion("address_detail =", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotEqualTo(String value) {
            addCriterion("address_detail <>", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThan(String value) {
            addCriterion("address_detail >", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailGreaterThanOrEqualTo(String value) {
            addCriterion("address_detail >=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThan(String value) {
            addCriterion("address_detail <", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLessThanOrEqualTo(String value) {
            addCriterion("address_detail <=", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailLike(String value) {
            addCriterion("address_detail like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotLike(String value) {
            addCriterion("address_detail not like", value, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailIn(List<String> values) {
            addCriterion("address_detail in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotIn(List<String> values) {
            addCriterion("address_detail not in", values, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailBetween(String value1, String value2) {
            addCriterion("address_detail between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressDetailNotBetween(String value1, String value2) {
            addCriterion("address_detail not between", value1, value2, "addressDetail");
            return (Criteria) this;
        }

        public Criteria andAddressPostIsNull() {
            addCriterion("address_post is null");
            return (Criteria) this;
        }

        public Criteria andAddressPostIsNotNull() {
            addCriterion("address_post is not null");
            return (Criteria) this;
        }

        public Criteria andAddressPostEqualTo(String value) {
            addCriterion("address_post =", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostNotEqualTo(String value) {
            addCriterion("address_post <>", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostGreaterThan(String value) {
            addCriterion("address_post >", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostGreaterThanOrEqualTo(String value) {
            addCriterion("address_post >=", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostLessThan(String value) {
            addCriterion("address_post <", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostLessThanOrEqualTo(String value) {
            addCriterion("address_post <=", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostLike(String value) {
            addCriterion("address_post like", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostNotLike(String value) {
            addCriterion("address_post not like", value, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostIn(List<String> values) {
            addCriterion("address_post in", values, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostNotIn(List<String> values) {
            addCriterion("address_post not in", values, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostBetween(String value1, String value2) {
            addCriterion("address_post between", value1, value2, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressPostNotBetween(String value1, String value2) {
            addCriterion("address_post not between", value1, value2, "addressPost");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeIsNull() {
            addCriterion("address_createTime is null");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeIsNotNull() {
            addCriterion("address_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeEqualTo(String value) {
            addCriterion("address_createTime =", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotEqualTo(String value) {
            addCriterion("address_createTime <>", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeGreaterThan(String value) {
            addCriterion("address_createTime >", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("address_createTime >=", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeLessThan(String value) {
            addCriterion("address_createTime <", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("address_createTime <=", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeLike(String value) {
            addCriterion("address_createTime like", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotLike(String value) {
            addCriterion("address_createTime not like", value, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeIn(List<String> values) {
            addCriterion("address_createTime in", values, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotIn(List<String> values) {
            addCriterion("address_createTime not in", values, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeBetween(String value1, String value2) {
            addCriterion("address_createTime between", value1, value2, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressCreatetimeNotBetween(String value1, String value2) {
            addCriterion("address_createTime not between", value1, value2, "addressCreatetime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeIsNull() {
            addCriterion("address_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeIsNotNull() {
            addCriterion("address_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeEqualTo(String value) {
            addCriterion("address_motifyTime =", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeNotEqualTo(String value) {
            addCriterion("address_motifyTime <>", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeGreaterThan(String value) {
            addCriterion("address_motifyTime >", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("address_motifyTime >=", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeLessThan(String value) {
            addCriterion("address_motifyTime <", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("address_motifyTime <=", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeLike(String value) {
            addCriterion("address_motifyTime like", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeNotLike(String value) {
            addCriterion("address_motifyTime not like", value, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeIn(List<String> values) {
            addCriterion("address_motifyTime in", values, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeNotIn(List<String> values) {
            addCriterion("address_motifyTime not in", values, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeBetween(String value1, String value2) {
            addCriterion("address_motifyTime between", value1, value2, "addressMotifytime");
            return (Criteria) this;
        }

        public Criteria andAddressMotifytimeNotBetween(String value1, String value2) {
            addCriterion("address_motifyTime not between", value1, value2, "addressMotifytime");
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