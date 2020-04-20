package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlfrontUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontUserExample() {
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNull() {
            addCriterion("user_email is null");
            return (Criteria) this;
        }

        public Criteria andUserEmailIsNotNull() {
            addCriterion("user_email is not null");
            return (Criteria) this;
        }

        public Criteria andUserEmailEqualTo(String value) {
            addCriterion("user_email =", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotEqualTo(String value) {
            addCriterion("user_email <>", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThan(String value) {
            addCriterion("user_email >", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailGreaterThanOrEqualTo(String value) {
            addCriterion("user_email >=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThan(String value) {
            addCriterion("user_email <", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLessThanOrEqualTo(String value) {
            addCriterion("user_email <=", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailLike(String value) {
            addCriterion("user_email like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotLike(String value) {
            addCriterion("user_email not like", value, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailIn(List<String> values) {
            addCriterion("user_email in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotIn(List<String> values) {
            addCriterion("user_email not in", values, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailBetween(String value1, String value2) {
            addCriterion("user_email between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserEmailNotBetween(String value1, String value2) {
            addCriterion("user_email not between", value1, value2, "userEmail");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNull() {
            addCriterion("user_password is null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIsNotNull() {
            addCriterion("user_password is not null");
            return (Criteria) this;
        }

        public Criteria andUserPasswordEqualTo(String value) {
            addCriterion("user_password =", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotEqualTo(String value) {
            addCriterion("user_password <>", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThan(String value) {
            addCriterion("user_password >", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("user_password >=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThan(String value) {
            addCriterion("user_password <", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLessThanOrEqualTo(String value) {
            addCriterion("user_password <=", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordLike(String value) {
            addCriterion("user_password like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotLike(String value) {
            addCriterion("user_password not like", value, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordIn(List<String> values) {
            addCriterion("user_password in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotIn(List<String> values) {
            addCriterion("user_password not in", values, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordBetween(String value1, String value2) {
            addCriterion("user_password between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserPasswordNotBetween(String value1, String value2) {
            addCriterion("user_password not between", value1, value2, "userPassword");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIsNull() {
            addCriterion("user_telephone is null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIsNotNull() {
            addCriterion("user_telephone is not null");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneEqualTo(String value) {
            addCriterion("user_telephone =", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotEqualTo(String value) {
            addCriterion("user_telephone <>", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneGreaterThan(String value) {
            addCriterion("user_telephone >", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_telephone >=", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLessThan(String value) {
            addCriterion("user_telephone <", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLessThanOrEqualTo(String value) {
            addCriterion("user_telephone <=", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneLike(String value) {
            addCriterion("user_telephone like", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotLike(String value) {
            addCriterion("user_telephone not like", value, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneIn(List<String> values) {
            addCriterion("user_telephone in", values, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotIn(List<String> values) {
            addCriterion("user_telephone not in", values, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneBetween(String value1, String value2) {
            addCriterion("user_telephone between", value1, value2, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserTelephoneNotBetween(String value1, String value2) {
            addCriterion("user_telephone not between", value1, value2, "userTelephone");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryIsNull() {
            addCriterion("user_address_country is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryIsNotNull() {
            addCriterion("user_address_country is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryEqualTo(String value) {
            addCriterion("user_address_country =", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryNotEqualTo(String value) {
            addCriterion("user_address_country <>", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryGreaterThan(String value) {
            addCriterion("user_address_country >", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_country >=", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryLessThan(String value) {
            addCriterion("user_address_country <", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryLessThanOrEqualTo(String value) {
            addCriterion("user_address_country <=", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryLike(String value) {
            addCriterion("user_address_country like", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryNotLike(String value) {
            addCriterion("user_address_country not like", value, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryIn(List<String> values) {
            addCriterion("user_address_country in", values, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryNotIn(List<String> values) {
            addCriterion("user_address_country not in", values, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryBetween(String value1, String value2) {
            addCriterion("user_address_country between", value1, value2, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressCountryNotBetween(String value1, String value2) {
            addCriterion("user_address_country not between", value1, value2, "userAddressCountry");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceIsNull() {
            addCriterion("user_address_province is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceIsNotNull() {
            addCriterion("user_address_province is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceEqualTo(String value) {
            addCriterion("user_address_province =", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotEqualTo(String value) {
            addCriterion("user_address_province <>", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceGreaterThan(String value) {
            addCriterion("user_address_province >", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_province >=", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceLessThan(String value) {
            addCriterion("user_address_province <", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceLessThanOrEqualTo(String value) {
            addCriterion("user_address_province <=", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceLike(String value) {
            addCriterion("user_address_province like", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotLike(String value) {
            addCriterion("user_address_province not like", value, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceIn(List<String> values) {
            addCriterion("user_address_province in", values, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotIn(List<String> values) {
            addCriterion("user_address_province not in", values, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceBetween(String value1, String value2) {
            addCriterion("user_address_province between", value1, value2, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressProvinceNotBetween(String value1, String value2) {
            addCriterion("user_address_province not between", value1, value2, "userAddressProvince");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIsNull() {
            addCriterion("user_address_city is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIsNotNull() {
            addCriterion("user_address_city is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityEqualTo(String value) {
            addCriterion("user_address_city =", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotEqualTo(String value) {
            addCriterion("user_address_city <>", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityGreaterThan(String value) {
            addCriterion("user_address_city >", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_city >=", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLessThan(String value) {
            addCriterion("user_address_city <", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLessThanOrEqualTo(String value) {
            addCriterion("user_address_city <=", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityLike(String value) {
            addCriterion("user_address_city like", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotLike(String value) {
            addCriterion("user_address_city not like", value, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityIn(List<String> values) {
            addCriterion("user_address_city in", values, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotIn(List<String> values) {
            addCriterion("user_address_city not in", values, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityBetween(String value1, String value2) {
            addCriterion("user_address_city between", value1, value2, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressCityNotBetween(String value1, String value2) {
            addCriterion("user_address_city not between", value1, value2, "userAddressCity");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressIsNull() {
            addCriterion("user_address_streetaddress is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressIsNotNull() {
            addCriterion("user_address_streetaddress is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressEqualTo(String value) {
            addCriterion("user_address_streetaddress =", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressNotEqualTo(String value) {
            addCriterion("user_address_streetaddress <>", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressGreaterThan(String value) {
            addCriterion("user_address_streetaddress >", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_streetaddress >=", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressLessThan(String value) {
            addCriterion("user_address_streetaddress <", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressLessThanOrEqualTo(String value) {
            addCriterion("user_address_streetaddress <=", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressLike(String value) {
            addCriterion("user_address_streetaddress like", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressNotLike(String value) {
            addCriterion("user_address_streetaddress not like", value, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressIn(List<String> values) {
            addCriterion("user_address_streetaddress in", values, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressNotIn(List<String> values) {
            addCriterion("user_address_streetaddress not in", values, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressBetween(String value1, String value2) {
            addCriterion("user_address_streetaddress between", value1, value2, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressStreetaddressNotBetween(String value1, String value2) {
            addCriterion("user_address_streetaddress not between", value1, value2, "userAddressStreetaddress");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeIsNull() {
            addCriterion("user_address_postalcode is null");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeIsNotNull() {
            addCriterion("user_address_postalcode is not null");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeEqualTo(String value) {
            addCriterion("user_address_postalcode =", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeNotEqualTo(String value) {
            addCriterion("user_address_postalcode <>", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeGreaterThan(String value) {
            addCriterion("user_address_postalcode >", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_address_postalcode >=", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeLessThan(String value) {
            addCriterion("user_address_postalcode <", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeLessThanOrEqualTo(String value) {
            addCriterion("user_address_postalcode <=", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeLike(String value) {
            addCriterion("user_address_postalcode like", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeNotLike(String value) {
            addCriterion("user_address_postalcode not like", value, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeIn(List<String> values) {
            addCriterion("user_address_postalcode in", values, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeNotIn(List<String> values) {
            addCriterion("user_address_postalcode not in", values, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeBetween(String value1, String value2) {
            addCriterion("user_address_postalcode between", value1, value2, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserAddressPostalcodeNotBetween(String value1, String value2) {
            addCriterion("user_address_postalcode not between", value1, value2, "userAddressPostalcode");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameIsNull() {
            addCriterion("user_firstName is null");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameIsNotNull() {
            addCriterion("user_firstName is not null");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameEqualTo(String value) {
            addCriterion("user_firstName =", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameNotEqualTo(String value) {
            addCriterion("user_firstName <>", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameGreaterThan(String value) {
            addCriterion("user_firstName >", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_firstName >=", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameLessThan(String value) {
            addCriterion("user_firstName <", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameLessThanOrEqualTo(String value) {
            addCriterion("user_firstName <=", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameLike(String value) {
            addCriterion("user_firstName like", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameNotLike(String value) {
            addCriterion("user_firstName not like", value, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameIn(List<String> values) {
            addCriterion("user_firstName in", values, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameNotIn(List<String> values) {
            addCriterion("user_firstName not in", values, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameBetween(String value1, String value2) {
            addCriterion("user_firstName between", value1, value2, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserFirstnameNotBetween(String value1, String value2) {
            addCriterion("user_firstName not between", value1, value2, "userFirstname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameIsNull() {
            addCriterion("user_lastName is null");
            return (Criteria) this;
        }

        public Criteria andUserLastnameIsNotNull() {
            addCriterion("user_lastName is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastnameEqualTo(String value) {
            addCriterion("user_lastName =", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameNotEqualTo(String value) {
            addCriterion("user_lastName <>", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameGreaterThan(String value) {
            addCriterion("user_lastName >", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("user_lastName >=", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameLessThan(String value) {
            addCriterion("user_lastName <", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameLessThanOrEqualTo(String value) {
            addCriterion("user_lastName <=", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameLike(String value) {
            addCriterion("user_lastName like", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameNotLike(String value) {
            addCriterion("user_lastName not like", value, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameIn(List<String> values) {
            addCriterion("user_lastName in", values, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameNotIn(List<String> values) {
            addCriterion("user_lastName not in", values, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameBetween(String value1, String value2) {
            addCriterion("user_lastName between", value1, value2, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserLastnameNotBetween(String value1, String value2) {
            addCriterion("user_lastName not between", value1, value2, "userLastname");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNull() {
            addCriterion("user_createTime is null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIsNotNull() {
            addCriterion("user_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeEqualTo(String value) {
            addCriterion("user_createTime =", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotEqualTo(String value) {
            addCriterion("user_createTime <>", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThan(String value) {
            addCriterion("user_createTime >", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_createTime >=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThan(String value) {
            addCriterion("user_createTime <", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("user_createTime <=", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeLike(String value) {
            addCriterion("user_createTime like", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotLike(String value) {
            addCriterion("user_createTime not like", value, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeIn(List<String> values) {
            addCriterion("user_createTime in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotIn(List<String> values) {
            addCriterion("user_createTime not in", values, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeBetween(String value1, String value2) {
            addCriterion("user_createTime between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserCreatetimeNotBetween(String value1, String value2) {
            addCriterion("user_createTime not between", value1, value2, "userCreatetime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeIsNull() {
            addCriterion("user_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeIsNotNull() {
            addCriterion("user_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeEqualTo(String value) {
            addCriterion("user_motifyTime =", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeNotEqualTo(String value) {
            addCriterion("user_motifyTime <>", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeGreaterThan(String value) {
            addCriterion("user_motifyTime >", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_motifyTime >=", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeLessThan(String value) {
            addCriterion("user_motifyTime <", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("user_motifyTime <=", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeLike(String value) {
            addCriterion("user_motifyTime like", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeNotLike(String value) {
            addCriterion("user_motifyTime not like", value, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeIn(List<String> values) {
            addCriterion("user_motifyTime in", values, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeNotIn(List<String> values) {
            addCriterion("user_motifyTime not in", values, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeBetween(String value1, String value2) {
            addCriterion("user_motifyTime between", value1, value2, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserMotifytimeNotBetween(String value1, String value2) {
            addCriterion("user_motifyTime not between", value1, value2, "userMotifytime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeIsNull() {
            addCriterion("user_lastonlineTime is null");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeIsNotNull() {
            addCriterion("user_lastonlineTime is not null");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeEqualTo(String value) {
            addCriterion("user_lastonlineTime =", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeNotEqualTo(String value) {
            addCriterion("user_lastonlineTime <>", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeGreaterThan(String value) {
            addCriterion("user_lastonlineTime >", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeGreaterThanOrEqualTo(String value) {
            addCriterion("user_lastonlineTime >=", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeLessThan(String value) {
            addCriterion("user_lastonlineTime <", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeLessThanOrEqualTo(String value) {
            addCriterion("user_lastonlineTime <=", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeLike(String value) {
            addCriterion("user_lastonlineTime like", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeNotLike(String value) {
            addCriterion("user_lastonlineTime not like", value, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeIn(List<String> values) {
            addCriterion("user_lastonlineTime in", values, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeNotIn(List<String> values) {
            addCriterion("user_lastonlineTime not in", values, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeBetween(String value1, String value2) {
            addCriterion("user_lastonlineTime between", value1, value2, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserLastonlinetimeNotBetween(String value1, String value2) {
            addCriterion("user_lastonlineTime not between", value1, value2, "userLastonlinetime");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNull() {
            addCriterion("user_point is null");
            return (Criteria) this;
        }

        public Criteria andUserPointIsNotNull() {
            addCriterion("user_point is not null");
            return (Criteria) this;
        }

        public Criteria andUserPointEqualTo(Integer value) {
            addCriterion("user_point =", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotEqualTo(Integer value) {
            addCriterion("user_point <>", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThan(Integer value) {
            addCriterion("user_point >", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_point >=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThan(Integer value) {
            addCriterion("user_point <", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointLessThanOrEqualTo(Integer value) {
            addCriterion("user_point <=", value, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointIn(List<Integer> values) {
            addCriterion("user_point in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotIn(List<Integer> values) {
            addCriterion("user_point not in", values, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointBetween(Integer value1, Integer value2) {
            addCriterion("user_point between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserPointNotBetween(Integer value1, Integer value2) {
            addCriterion("user_point not between", value1, value2, "userPoint");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrIsNull() {
            addCriterion("user_couponidStr is null");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrIsNotNull() {
            addCriterion("user_couponidStr is not null");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrEqualTo(String value) {
            addCriterion("user_couponidStr =", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrNotEqualTo(String value) {
            addCriterion("user_couponidStr <>", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrGreaterThan(String value) {
            addCriterion("user_couponidStr >", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrGreaterThanOrEqualTo(String value) {
            addCriterion("user_couponidStr >=", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrLessThan(String value) {
            addCriterion("user_couponidStr <", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrLessThanOrEqualTo(String value) {
            addCriterion("user_couponidStr <=", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrLike(String value) {
            addCriterion("user_couponidStr like", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrNotLike(String value) {
            addCriterion("user_couponidStr not like", value, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrIn(List<String> values) {
            addCriterion("user_couponidStr in", values, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrNotIn(List<String> values) {
            addCriterion("user_couponidStr not in", values, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrBetween(String value1, String value2) {
            addCriterion("user_couponidStr between", value1, value2, "userCouponidstr");
            return (Criteria) this;
        }

        public Criteria andUserCouponidstrNotBetween(String value1, String value2) {
            addCriterion("user_couponidStr not between", value1, value2, "userCouponidstr");
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