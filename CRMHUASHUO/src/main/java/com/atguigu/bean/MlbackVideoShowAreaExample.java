package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackVideoShowAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackVideoShowAreaExample() {
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

        public Criteria andVideoshowareaIdIsNull() {
            addCriterion("videoShowArea_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdIsNotNull() {
            addCriterion("videoShowArea_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdEqualTo(Integer value) {
            addCriterion("videoShowArea_id =", value, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdNotEqualTo(Integer value) {
            addCriterion("videoShowArea_id <>", value, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdGreaterThan(Integer value) {
            addCriterion("videoShowArea_id >", value, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_id >=", value, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdLessThan(Integer value) {
            addCriterion("videoShowArea_id <", value, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdLessThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_id <=", value, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdIn(List<Integer> values) {
            addCriterion("videoShowArea_id in", values, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdNotIn(List<Integer> values) {
            addCriterion("videoShowArea_id not in", values, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_id between", value1, value2, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_id not between", value1, value2, "videoshowareaId");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameIsNull() {
            addCriterion("videoShowArea_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameIsNotNull() {
            addCriterion("videoShowArea_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameEqualTo(String value) {
            addCriterion("videoShowArea_name =", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameNotEqualTo(String value) {
            addCriterion("videoShowArea_name <>", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameGreaterThan(String value) {
            addCriterion("videoShowArea_name >", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_name >=", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameLessThan(String value) {
            addCriterion("videoShowArea_name <", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_name <=", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameLike(String value) {
            addCriterion("videoShowArea_name like", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameNotLike(String value) {
            addCriterion("videoShowArea_name not like", value, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameIn(List<String> values) {
            addCriterion("videoShowArea_name in", values, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameNotIn(List<String> values) {
            addCriterion("videoShowArea_name not in", values, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameBetween(String value1, String value2) {
            addCriterion("videoShowArea_name between", value1, value2, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaNameNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_name not between", value1, value2, "videoshowareaName");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumIsNull() {
            addCriterion("videoShowArea_areanum is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumIsNotNull() {
            addCriterion("videoShowArea_areanum is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumEqualTo(Integer value) {
            addCriterion("videoShowArea_areanum =", value, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumNotEqualTo(Integer value) {
            addCriterion("videoShowArea_areanum <>", value, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumGreaterThan(Integer value) {
            addCriterion("videoShowArea_areanum >", value, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_areanum >=", value, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumLessThan(Integer value) {
            addCriterion("videoShowArea_areanum <", value, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumLessThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_areanum <=", value, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumIn(List<Integer> values) {
            addCriterion("videoShowArea_areanum in", values, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumNotIn(List<Integer> values) {
            addCriterion("videoShowArea_areanum not in", values, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_areanum between", value1, value2, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaAreanumNotBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_areanum not between", value1, value2, "videoshowareaAreanum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumIsNull() {
            addCriterion("videoShowArea_orderth_num is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumIsNotNull() {
            addCriterion("videoShowArea_orderth_num is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumEqualTo(Integer value) {
            addCriterion("videoShowArea_orderth_num =", value, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumNotEqualTo(Integer value) {
            addCriterion("videoShowArea_orderth_num <>", value, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumGreaterThan(Integer value) {
            addCriterion("videoShowArea_orderth_num >", value, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_orderth_num >=", value, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumLessThan(Integer value) {
            addCriterion("videoShowArea_orderth_num <", value, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumLessThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_orderth_num <=", value, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumIn(List<Integer> values) {
            addCriterion("videoShowArea_orderth_num in", values, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumNotIn(List<Integer> values) {
            addCriterion("videoShowArea_orderth_num not in", values, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_orderth_num between", value1, value2, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaOrderthNumNotBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_orderth_num not between", value1, value2, "videoshowareaOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusIsNull() {
            addCriterion("videoShowArea_wapstatus is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusIsNotNull() {
            addCriterion("videoShowArea_wapstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusEqualTo(Integer value) {
            addCriterion("videoShowArea_wapstatus =", value, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusNotEqualTo(Integer value) {
            addCriterion("videoShowArea_wapstatus <>", value, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusGreaterThan(Integer value) {
            addCriterion("videoShowArea_wapstatus >", value, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_wapstatus >=", value, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusLessThan(Integer value) {
            addCriterion("videoShowArea_wapstatus <", value, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusLessThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_wapstatus <=", value, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusIn(List<Integer> values) {
            addCriterion("videoShowArea_wapstatus in", values, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusNotIn(List<Integer> values) {
            addCriterion("videoShowArea_wapstatus not in", values, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_wapstatus between", value1, value2, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_wapstatus not between", value1, value2, "videoshowareaWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusIsNull() {
            addCriterion("videoShowArea_pcstatus is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusIsNotNull() {
            addCriterion("videoShowArea_pcstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusEqualTo(Integer value) {
            addCriterion("videoShowArea_pcstatus =", value, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusNotEqualTo(Integer value) {
            addCriterion("videoShowArea_pcstatus <>", value, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusGreaterThan(Integer value) {
            addCriterion("videoShowArea_pcstatus >", value, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_pcstatus >=", value, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusLessThan(Integer value) {
            addCriterion("videoShowArea_pcstatus <", value, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusLessThanOrEqualTo(Integer value) {
            addCriterion("videoShowArea_pcstatus <=", value, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusIn(List<Integer> values) {
            addCriterion("videoShowArea_pcstatus in", values, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusNotIn(List<Integer> values) {
            addCriterion("videoShowArea_pcstatus not in", values, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_pcstatus between", value1, value2, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("videoShowArea_pcstatus not between", value1, value2, "videoshowareaPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlIsNull() {
            addCriterion("videoShowArea_wapimgurl is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlIsNotNull() {
            addCriterion("videoShowArea_wapimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlEqualTo(String value) {
            addCriterion("videoShowArea_wapimgurl =", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlNotEqualTo(String value) {
            addCriterion("videoShowArea_wapimgurl <>", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlGreaterThan(String value) {
            addCriterion("videoShowArea_wapimgurl >", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_wapimgurl >=", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlLessThan(String value) {
            addCriterion("videoShowArea_wapimgurl <", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_wapimgurl <=", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlLike(String value) {
            addCriterion("videoShowArea_wapimgurl like", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlNotLike(String value) {
            addCriterion("videoShowArea_wapimgurl not like", value, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlIn(List<String> values) {
            addCriterion("videoShowArea_wapimgurl in", values, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlNotIn(List<String> values) {
            addCriterion("videoShowArea_wapimgurl not in", values, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlBetween(String value1, String value2) {
            addCriterion("videoShowArea_wapimgurl between", value1, value2, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaWapimgurlNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_wapimgurl not between", value1, value2, "videoshowareaWapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlIsNull() {
            addCriterion("videoShowArea_pcimgurl is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlIsNotNull() {
            addCriterion("videoShowArea_pcimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlEqualTo(String value) {
            addCriterion("videoShowArea_pcimgurl =", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlNotEqualTo(String value) {
            addCriterion("videoShowArea_pcimgurl <>", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlGreaterThan(String value) {
            addCriterion("videoShowArea_pcimgurl >", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_pcimgurl >=", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlLessThan(String value) {
            addCriterion("videoShowArea_pcimgurl <", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_pcimgurl <=", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlLike(String value) {
            addCriterion("videoShowArea_pcimgurl like", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlNotLike(String value) {
            addCriterion("videoShowArea_pcimgurl not like", value, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlIn(List<String> values) {
            addCriterion("videoShowArea_pcimgurl in", values, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlNotIn(List<String> values) {
            addCriterion("videoShowArea_pcimgurl not in", values, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlBetween(String value1, String value2) {
            addCriterion("videoShowArea_pcimgurl between", value1, value2, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaPcimgurlNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_pcimgurl not between", value1, value2, "videoshowareaPcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeIsNull() {
            addCriterion("videoShowArea_createTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeIsNotNull() {
            addCriterion("videoShowArea_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeEqualTo(String value) {
            addCriterion("videoShowArea_createTime =", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeNotEqualTo(String value) {
            addCriterion("videoShowArea_createTime <>", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeGreaterThan(String value) {
            addCriterion("videoShowArea_createTime >", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_createTime >=", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeLessThan(String value) {
            addCriterion("videoShowArea_createTime <", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_createTime <=", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeLike(String value) {
            addCriterion("videoShowArea_createTime like", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeNotLike(String value) {
            addCriterion("videoShowArea_createTime not like", value, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeIn(List<String> values) {
            addCriterion("videoShowArea_createTime in", values, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeNotIn(List<String> values) {
            addCriterion("videoShowArea_createTime not in", values, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeBetween(String value1, String value2) {
            addCriterion("videoShowArea_createTime between", value1, value2, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaCreatetimeNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_createTime not between", value1, value2, "videoshowareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeIsNull() {
            addCriterion("videoShowArea_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeIsNotNull() {
            addCriterion("videoShowArea_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeEqualTo(String value) {
            addCriterion("videoShowArea_motifyTime =", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeNotEqualTo(String value) {
            addCriterion("videoShowArea_motifyTime <>", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeGreaterThan(String value) {
            addCriterion("videoShowArea_motifyTime >", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_motifyTime >=", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeLessThan(String value) {
            addCriterion("videoShowArea_motifyTime <", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_motifyTime <=", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeLike(String value) {
            addCriterion("videoShowArea_motifyTime like", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeNotLike(String value) {
            addCriterion("videoShowArea_motifyTime not like", value, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeIn(List<String> values) {
            addCriterion("videoShowArea_motifyTime in", values, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeNotIn(List<String> values) {
            addCriterion("videoShowArea_motifyTime not in", values, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeBetween(String value1, String value2) {
            addCriterion("videoShowArea_motifyTime between", value1, value2, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaMotifytimeNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_motifyTime not between", value1, value2, "videoshowareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeIsNull() {
            addCriterion("videoShowArea_startTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeIsNotNull() {
            addCriterion("videoShowArea_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeEqualTo(String value) {
            addCriterion("videoShowArea_startTime =", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeNotEqualTo(String value) {
            addCriterion("videoShowArea_startTime <>", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeGreaterThan(String value) {
            addCriterion("videoShowArea_startTime >", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_startTime >=", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeLessThan(String value) {
            addCriterion("videoShowArea_startTime <", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_startTime <=", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeLike(String value) {
            addCriterion("videoShowArea_startTime like", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeNotLike(String value) {
            addCriterion("videoShowArea_startTime not like", value, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeIn(List<String> values) {
            addCriterion("videoShowArea_startTime in", values, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeNotIn(List<String> values) {
            addCriterion("videoShowArea_startTime not in", values, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeBetween(String value1, String value2) {
            addCriterion("videoShowArea_startTime between", value1, value2, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaStarttimeNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_startTime not between", value1, value2, "videoshowareaStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeIsNull() {
            addCriterion("videoShowArea_endTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeIsNotNull() {
            addCriterion("videoShowArea_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeEqualTo(String value) {
            addCriterion("videoShowArea_endTime =", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeNotEqualTo(String value) {
            addCriterion("videoShowArea_endTime <>", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeGreaterThan(String value) {
            addCriterion("videoShowArea_endTime >", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("videoShowArea_endTime >=", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeLessThan(String value) {
            addCriterion("videoShowArea_endTime <", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeLessThanOrEqualTo(String value) {
            addCriterion("videoShowArea_endTime <=", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeLike(String value) {
            addCriterion("videoShowArea_endTime like", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeNotLike(String value) {
            addCriterion("videoShowArea_endTime not like", value, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeIn(List<String> values) {
            addCriterion("videoShowArea_endTime in", values, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeNotIn(List<String> values) {
            addCriterion("videoShowArea_endTime not in", values, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeBetween(String value1, String value2) {
            addCriterion("videoShowArea_endTime between", value1, value2, "videoshowareaEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoshowareaEndtimeNotBetween(String value1, String value2) {
            addCriterion("videoShowArea_endTime not between", value1, value2, "videoshowareaEndtime");
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