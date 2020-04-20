package com.atguigu.bean;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class MlfrontOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlfrontOrderExample() {
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

        public Criteria andOrderIpIsNull() {
            addCriterion("order_ip is null");
            return (Criteria) this;
        }

        public Criteria andOrderIpIsNotNull() {
            addCriterion("order_ip is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIpEqualTo(String value) {
            addCriterion("order_ip =", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpNotEqualTo(String value) {
            addCriterion("order_ip <>", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpGreaterThan(String value) {
            addCriterion("order_ip >", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpGreaterThanOrEqualTo(String value) {
            addCriterion("order_ip >=", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpLessThan(String value) {
            addCriterion("order_ip <", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpLessThanOrEqualTo(String value) {
            addCriterion("order_ip <=", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpLike(String value) {
            addCriterion("order_ip like", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpNotLike(String value) {
            addCriterion("order_ip not like", value, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpIn(List<String> values) {
            addCriterion("order_ip in", values, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpNotIn(List<String> values) {
            addCriterion("order_ip not in", values, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpBetween(String value1, String value2) {
            addCriterion("order_ip between", value1, value2, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderIpNotBetween(String value1, String value2) {
            addCriterion("order_ip not between", value1, value2, "orderIp");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrIsNull() {
            addCriterion("order_orderItemIdStr is null");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrIsNotNull() {
            addCriterion("order_orderItemIdStr is not null");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrEqualTo(String value) {
            addCriterion("order_orderItemIdStr =", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrNotEqualTo(String value) {
            addCriterion("order_orderItemIdStr <>", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrGreaterThan(String value) {
            addCriterion("order_orderItemIdStr >", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrGreaterThanOrEqualTo(String value) {
            addCriterion("order_orderItemIdStr >=", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrLessThan(String value) {
            addCriterion("order_orderItemIdStr <", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrLessThanOrEqualTo(String value) {
            addCriterion("order_orderItemIdStr <=", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrLike(String value) {
            addCriterion("order_orderItemIdStr like", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrNotLike(String value) {
            addCriterion("order_orderItemIdStr not like", value, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrIn(List<String> values) {
            addCriterion("order_orderItemIdStr in", values, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrNotIn(List<String> values) {
            addCriterion("order_orderItemIdStr not in", values, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrBetween(String value1, String value2) {
            addCriterion("order_orderItemIdStr between", value1, value2, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderOrderitemidstrNotBetween(String value1, String value2) {
            addCriterion("order_orderItemIdStr not between", value1, value2, "orderOrderitemidstr");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNull() {
            addCriterion("order_money is null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIsNotNull() {
            addCriterion("order_money is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyEqualTo(BigDecimal value) {
            addCriterion("order_money =", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotEqualTo(BigDecimal value) {
            addCriterion("order_money <>", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThan(BigDecimal value) {
            addCriterion("order_money >", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money >=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThan(BigDecimal value) {
            addCriterion("order_money <", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("order_money <=", value, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyIn(List<BigDecimal> values) {
            addCriterion("order_money in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotIn(List<BigDecimal> values) {
            addCriterion("order_money not in", values, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andOrderMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("order_money not between", value1, value2, "orderMoney");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdIsNull() {
            addCriterion("addressinfo_id is null");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdIsNotNull() {
            addCriterion("addressinfo_id is not null");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdEqualTo(Integer value) {
            addCriterion("addressinfo_id =", value, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdNotEqualTo(Integer value) {
            addCriterion("addressinfo_id <>", value, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdGreaterThan(Integer value) {
            addCriterion("addressinfo_id >", value, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("addressinfo_id >=", value, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdLessThan(Integer value) {
            addCriterion("addressinfo_id <", value, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("addressinfo_id <=", value, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdIn(List<Integer> values) {
            addCriterion("addressinfo_id in", values, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdNotIn(List<Integer> values) {
            addCriterion("addressinfo_id not in", values, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("addressinfo_id between", value1, value2, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andAddressinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("addressinfo_id not between", value1, value2, "addressinfoId");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNull() {
            addCriterion("order_createTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIsNotNull() {
            addCriterion("order_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeEqualTo(String value) {
            addCriterion("order_createTime =", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotEqualTo(String value) {
            addCriterion("order_createTime <>", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThan(String value) {
            addCriterion("order_createTime >", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_createTime >=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThan(String value) {
            addCriterion("order_createTime <", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("order_createTime <=", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeLike(String value) {
            addCriterion("order_createTime like", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotLike(String value) {
            addCriterion("order_createTime not like", value, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeIn(List<String> values) {
            addCriterion("order_createTime in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotIn(List<String> values) {
            addCriterion("order_createTime not in", values, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeBetween(String value1, String value2) {
            addCriterion("order_createTime between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderCreatetimeNotBetween(String value1, String value2) {
            addCriterion("order_createTime not between", value1, value2, "orderCreatetime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeIsNull() {
            addCriterion("order_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeIsNotNull() {
            addCriterion("order_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeEqualTo(String value) {
            addCriterion("order_motifyTime =", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeNotEqualTo(String value) {
            addCriterion("order_motifyTime <>", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeGreaterThan(String value) {
            addCriterion("order_motifyTime >", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_motifyTime >=", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeLessThan(String value) {
            addCriterion("order_motifyTime <", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("order_motifyTime <=", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeLike(String value) {
            addCriterion("order_motifyTime like", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeNotLike(String value) {
            addCriterion("order_motifyTime not like", value, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeIn(List<String> values) {
            addCriterion("order_motifyTime in", values, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeNotIn(List<String> values) {
            addCriterion("order_motifyTime not in", values, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeBetween(String value1, String value2) {
            addCriterion("order_motifyTime between", value1, value2, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderMotifytimeNotBetween(String value1, String value2) {
            addCriterion("order_motifyTime not between", value1, value2, "orderMotifytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeIsNull() {
            addCriterion("order_payTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeIsNotNull() {
            addCriterion("order_payTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeEqualTo(String value) {
            addCriterion("order_payTime =", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeNotEqualTo(String value) {
            addCriterion("order_payTime <>", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeGreaterThan(String value) {
            addCriterion("order_payTime >", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_payTime >=", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeLessThan(String value) {
            addCriterion("order_payTime <", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeLessThanOrEqualTo(String value) {
            addCriterion("order_payTime <=", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeLike(String value) {
            addCriterion("order_payTime like", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeNotLike(String value) {
            addCriterion("order_payTime not like", value, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeIn(List<String> values) {
            addCriterion("order_payTime in", values, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeNotIn(List<String> values) {
            addCriterion("order_payTime not in", values, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeBetween(String value1, String value2) {
            addCriterion("order_payTime between", value1, value2, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderPaytimeNotBetween(String value1, String value2) {
            addCriterion("order_payTime not between", value1, value2, "orderPaytime");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidIsNull() {
            addCriterion("order_logisticsId is null");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidIsNotNull() {
            addCriterion("order_logisticsId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidEqualTo(Integer value) {
            addCriterion("order_logisticsId =", value, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidNotEqualTo(Integer value) {
            addCriterion("order_logisticsId <>", value, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidGreaterThan(Integer value) {
            addCriterion("order_logisticsId >", value, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_logisticsId >=", value, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidLessThan(Integer value) {
            addCriterion("order_logisticsId <", value, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidLessThanOrEqualTo(Integer value) {
            addCriterion("order_logisticsId <=", value, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidIn(List<Integer> values) {
            addCriterion("order_logisticsId in", values, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidNotIn(List<Integer> values) {
            addCriterion("order_logisticsId not in", values, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidBetween(Integer value1, Integer value2) {
            addCriterion("order_logisticsId between", value1, value2, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsidNotBetween(Integer value1, Integer value2) {
            addCriterion("order_logisticsId not between", value1, value2, "orderLogisticsid");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameIsNull() {
            addCriterion("order_logisticsName is null");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameIsNotNull() {
            addCriterion("order_logisticsName is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameEqualTo(String value) {
            addCriterion("order_logisticsName =", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameNotEqualTo(String value) {
            addCriterion("order_logisticsName <>", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameGreaterThan(String value) {
            addCriterion("order_logisticsName >", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameGreaterThanOrEqualTo(String value) {
            addCriterion("order_logisticsName >=", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameLessThan(String value) {
            addCriterion("order_logisticsName <", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameLessThanOrEqualTo(String value) {
            addCriterion("order_logisticsName <=", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameLike(String value) {
            addCriterion("order_logisticsName like", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameNotLike(String value) {
            addCriterion("order_logisticsName not like", value, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameIn(List<String> values) {
            addCriterion("order_logisticsName in", values, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameNotIn(List<String> values) {
            addCriterion("order_logisticsName not in", values, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameBetween(String value1, String value2) {
            addCriterion("order_logisticsName between", value1, value2, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnameNotBetween(String value1, String value2) {
            addCriterion("order_logisticsName not between", value1, value2, "orderLogisticsname");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberIsNull() {
            addCriterion("order_logisticsNumber is null");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberIsNotNull() {
            addCriterion("order_logisticsNumber is not null");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberEqualTo(String value) {
            addCriterion("order_logisticsNumber =", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberNotEqualTo(String value) {
            addCriterion("order_logisticsNumber <>", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberGreaterThan(String value) {
            addCriterion("order_logisticsNumber >", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberGreaterThanOrEqualTo(String value) {
            addCriterion("order_logisticsNumber >=", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberLessThan(String value) {
            addCriterion("order_logisticsNumber <", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberLessThanOrEqualTo(String value) {
            addCriterion("order_logisticsNumber <=", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberLike(String value) {
            addCriterion("order_logisticsNumber like", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberNotLike(String value) {
            addCriterion("order_logisticsNumber not like", value, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberIn(List<String> values) {
            addCriterion("order_logisticsNumber in", values, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberNotIn(List<String> values) {
            addCriterion("order_logisticsNumber not in", values, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberBetween(String value1, String value2) {
            addCriterion("order_logisticsNumber between", value1, value2, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderLogisticsnumberNotBetween(String value1, String value2) {
            addCriterion("order_logisticsNumber not between", value1, value2, "orderLogisticsnumber");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeIsNull() {
            addCriterion("order_sendTime is null");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeIsNotNull() {
            addCriterion("order_sendTime is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeEqualTo(String value) {
            addCriterion("order_sendTime =", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeNotEqualTo(String value) {
            addCriterion("order_sendTime <>", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeGreaterThan(String value) {
            addCriterion("order_sendTime >", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeGreaterThanOrEqualTo(String value) {
            addCriterion("order_sendTime >=", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeLessThan(String value) {
            addCriterion("order_sendTime <", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeLessThanOrEqualTo(String value) {
            addCriterion("order_sendTime <=", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeLike(String value) {
            addCriterion("order_sendTime like", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeNotLike(String value) {
            addCriterion("order_sendTime not like", value, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeIn(List<String> values) {
            addCriterion("order_sendTime in", values, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeNotIn(List<String> values) {
            addCriterion("order_sendTime not in", values, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeBetween(String value1, String value2) {
            addCriterion("order_sendTime between", value1, value2, "orderSendtime");
            return (Criteria) this;
        }

        public Criteria andOrderSendtimeNotBetween(String value1, String value2) {
            addCriterion("order_sendTime not between", value1, value2, "orderSendtime");
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