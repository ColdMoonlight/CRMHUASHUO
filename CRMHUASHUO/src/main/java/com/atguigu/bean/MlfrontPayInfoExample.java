package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MlfrontPayInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontPayInfoExample() {
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

        public Criteria andPayinfoIdIsNull() {
            addCriterion("payInfo_id is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdIsNotNull() {
            addCriterion("payInfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdEqualTo(Integer value) {
            addCriterion("payInfo_id =", value, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdNotEqualTo(Integer value) {
            addCriterion("payInfo_id <>", value, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdGreaterThan(Integer value) {
            addCriterion("payInfo_id >", value, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payInfo_id >=", value, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdLessThan(Integer value) {
            addCriterion("payInfo_id <", value, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("payInfo_id <=", value, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdIn(List<Integer> values) {
            addCriterion("payInfo_id in", values, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdNotIn(List<Integer> values) {
            addCriterion("payInfo_id not in", values, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_id between", value1, value2, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_id not between", value1, value2, "payinfoId");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidIsNull() {
            addCriterion("payInfo_uid is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidIsNotNull() {
            addCriterion("payInfo_uid is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidEqualTo(Integer value) {
            addCriterion("payInfo_uid =", value, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidNotEqualTo(Integer value) {
            addCriterion("payInfo_uid <>", value, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidGreaterThan(Integer value) {
            addCriterion("payInfo_uid >", value, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("payInfo_uid >=", value, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidLessThan(Integer value) {
            addCriterion("payInfo_uid <", value, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidLessThanOrEqualTo(Integer value) {
            addCriterion("payInfo_uid <=", value, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidIn(List<Integer> values) {
            addCriterion("payInfo_uid in", values, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidNotIn(List<Integer> values) {
            addCriterion("payInfo_uid not in", values, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_uid between", value1, value2, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoUidNotBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_uid not between", value1, value2, "payinfoUid");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpIsNull() {
            addCriterion("payInfo_ip is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpIsNotNull() {
            addCriterion("payInfo_ip is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpEqualTo(String value) {
            addCriterion("payInfo_ip =", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpNotEqualTo(String value) {
            addCriterion("payInfo_ip <>", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpGreaterThan(String value) {
            addCriterion("payInfo_ip >", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpGreaterThanOrEqualTo(String value) {
            addCriterion("payInfo_ip >=", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpLessThan(String value) {
            addCriterion("payInfo_ip <", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpLessThanOrEqualTo(String value) {
            addCriterion("payInfo_ip <=", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpLike(String value) {
            addCriterion("payInfo_ip like", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpNotLike(String value) {
            addCriterion("payInfo_ip not like", value, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpIn(List<String> values) {
            addCriterion("payInfo_ip in", values, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpNotIn(List<String> values) {
            addCriterion("payInfo_ip not in", values, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpBetween(String value1, String value2) {
            addCriterion("payInfo_ip between", value1, value2, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoIpNotBetween(String value1, String value2) {
            addCriterion("payInfo_ip not between", value1, value2, "payinfoIp");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidIsNull() {
            addCriterion("payInfo_oid is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidIsNotNull() {
            addCriterion("payInfo_oid is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidEqualTo(Integer value) {
            addCriterion("payInfo_oid =", value, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidNotEqualTo(Integer value) {
            addCriterion("payInfo_oid <>", value, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidGreaterThan(Integer value) {
            addCriterion("payInfo_oid >", value, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("payInfo_oid >=", value, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidLessThan(Integer value) {
            addCriterion("payInfo_oid <", value, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidLessThanOrEqualTo(Integer value) {
            addCriterion("payInfo_oid <=", value, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidIn(List<Integer> values) {
            addCriterion("payInfo_oid in", values, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidNotIn(List<Integer> values) {
            addCriterion("payInfo_oid not in", values, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_oid between", value1, value2, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoOidNotBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_oid not between", value1, value2, "payinfoOid");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformIsNull() {
            addCriterion("payInfo_platform is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformIsNotNull() {
            addCriterion("payInfo_platform is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformEqualTo(String value) {
            addCriterion("payInfo_platform =", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformNotEqualTo(String value) {
            addCriterion("payInfo_platform <>", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformGreaterThan(String value) {
            addCriterion("payInfo_platform >", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("payInfo_platform >=", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformLessThan(String value) {
            addCriterion("payInfo_platform <", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformLessThanOrEqualTo(String value) {
            addCriterion("payInfo_platform <=", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformLike(String value) {
            addCriterion("payInfo_platform like", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformNotLike(String value) {
            addCriterion("payInfo_platform not like", value, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformIn(List<String> values) {
            addCriterion("payInfo_platform in", values, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformNotIn(List<String> values) {
            addCriterion("payInfo_platform not in", values, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformBetween(String value1, String value2) {
            addCriterion("payInfo_platform between", value1, value2, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformNotBetween(String value1, String value2) {
            addCriterion("payInfo_platform not between", value1, value2, "payinfoPlatform");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeIsNull() {
            addCriterion("payInfo_platformSerialCode is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeIsNotNull() {
            addCriterion("payInfo_platformSerialCode is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeEqualTo(String value) {
            addCriterion("payInfo_platformSerialCode =", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeNotEqualTo(String value) {
            addCriterion("payInfo_platformSerialCode <>", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeGreaterThan(String value) {
            addCriterion("payInfo_platformSerialCode >", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeGreaterThanOrEqualTo(String value) {
            addCriterion("payInfo_platformSerialCode >=", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeLessThan(String value) {
            addCriterion("payInfo_platformSerialCode <", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeLessThanOrEqualTo(String value) {
            addCriterion("payInfo_platformSerialCode <=", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeLike(String value) {
            addCriterion("payInfo_platformSerialCode like", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeNotLike(String value) {
            addCriterion("payInfo_platformSerialCode not like", value, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeIn(List<String> values) {
            addCriterion("payInfo_platformSerialCode in", values, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeNotIn(List<String> values) {
            addCriterion("payInfo_platformSerialCode not in", values, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeBetween(String value1, String value2) {
            addCriterion("payInfo_platformSerialCode between", value1, value2, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoPlatformserialcodeNotBetween(String value1, String value2) {
            addCriterion("payInfo_platformSerialCode not between", value1, value2, "payinfoPlatformserialcode");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyIsNull() {
            addCriterion("payInfo_money is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyIsNotNull() {
            addCriterion("payInfo_money is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyEqualTo(BigDecimal value) {
            addCriterion("payInfo_money =", value, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyNotEqualTo(BigDecimal value) {
            addCriterion("payInfo_money <>", value, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyGreaterThan(BigDecimal value) {
            addCriterion("payInfo_money >", value, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payInfo_money >=", value, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyLessThan(BigDecimal value) {
            addCriterion("payInfo_money <", value, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payInfo_money <=", value, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyIn(List<BigDecimal> values) {
            addCriterion("payInfo_money in", values, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyNotIn(List<BigDecimal> values) {
            addCriterion("payInfo_money not in", values, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payInfo_money between", value1, value2, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payInfo_money not between", value1, value2, "payinfoMoney");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusIsNull() {
            addCriterion("payInfo_status is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusIsNotNull() {
            addCriterion("payInfo_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusEqualTo(Integer value) {
            addCriterion("payInfo_status =", value, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusNotEqualTo(Integer value) {
            addCriterion("payInfo_status <>", value, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusGreaterThan(Integer value) {
            addCriterion("payInfo_status >", value, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("payInfo_status >=", value, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusLessThan(Integer value) {
            addCriterion("payInfo_status <", value, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusLessThanOrEqualTo(Integer value) {
            addCriterion("payInfo_status <=", value, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusIn(List<Integer> values) {
            addCriterion("payInfo_status in", values, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusNotIn(List<Integer> values) {
            addCriterion("payInfo_status not in", values, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_status between", value1, value2, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("payInfo_status not between", value1, value2, "payinfoStatus");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonIsNull() {
            addCriterion("payInfo_reason is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonIsNotNull() {
            addCriterion("payInfo_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonEqualTo(String value) {
            addCriterion("payInfo_reason =", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonNotEqualTo(String value) {
            addCriterion("payInfo_reason <>", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonGreaterThan(String value) {
            addCriterion("payInfo_reason >", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonGreaterThanOrEqualTo(String value) {
            addCriterion("payInfo_reason >=", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonLessThan(String value) {
            addCriterion("payInfo_reason <", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonLessThanOrEqualTo(String value) {
            addCriterion("payInfo_reason <=", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonLike(String value) {
            addCriterion("payInfo_reason like", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonNotLike(String value) {
            addCriterion("payInfo_reason not like", value, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonIn(List<String> values) {
            addCriterion("payInfo_reason in", values, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonNotIn(List<String> values) {
            addCriterion("payInfo_reason not in", values, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonBetween(String value1, String value2) {
            addCriterion("payInfo_reason between", value1, value2, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoReasonNotBetween(String value1, String value2) {
            addCriterion("payInfo_reason not between", value1, value2, "payinfoReason");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeIsNull() {
            addCriterion("payInfo_createTime is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeIsNotNull() {
            addCriterion("payInfo_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeEqualTo(String value) {
            addCriterion("payInfo_createTime =", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeNotEqualTo(String value) {
            addCriterion("payInfo_createTime <>", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeGreaterThan(String value) {
            addCriterion("payInfo_createTime >", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("payInfo_createTime >=", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeLessThan(String value) {
            addCriterion("payInfo_createTime <", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("payInfo_createTime <=", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeLike(String value) {
            addCriterion("payInfo_createTime like", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeNotLike(String value) {
            addCriterion("payInfo_createTime not like", value, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeIn(List<String> values) {
            addCriterion("payInfo_createTime in", values, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeNotIn(List<String> values) {
            addCriterion("payInfo_createTime not in", values, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeBetween(String value1, String value2) {
            addCriterion("payInfo_createTime between", value1, value2, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoCreatetimeNotBetween(String value1, String value2) {
            addCriterion("payInfo_createTime not between", value1, value2, "payinfoCreatetime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeIsNull() {
            addCriterion("payInfo_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeIsNotNull() {
            addCriterion("payInfo_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeEqualTo(String value) {
            addCriterion("payInfo_motifyTime =", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeNotEqualTo(String value) {
            addCriterion("payInfo_motifyTime <>", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeGreaterThan(String value) {
            addCriterion("payInfo_motifyTime >", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("payInfo_motifyTime >=", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeLessThan(String value) {
            addCriterion("payInfo_motifyTime <", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("payInfo_motifyTime <=", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeLike(String value) {
            addCriterion("payInfo_motifyTime like", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeNotLike(String value) {
            addCriterion("payInfo_motifyTime not like", value, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeIn(List<String> values) {
            addCriterion("payInfo_motifyTime in", values, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeNotIn(List<String> values) {
            addCriterion("payInfo_motifyTime not in", values, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeBetween(String value1, String value2) {
            addCriterion("payInfo_motifyTime between", value1, value2, "payinfoMotifytime");
            return (Criteria) this;
        }

        public Criteria andPayinfoMotifytimeNotBetween(String value1, String value2) {
            addCriterion("payInfo_motifyTime not between", value1, value2, "payinfoMotifytime");
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