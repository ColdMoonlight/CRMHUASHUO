package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackActShowProExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackActShowProExample() {
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

        public Criteria andActshowproIdIsNull() {
            addCriterion("actShowPro_id is null");
            return (Criteria) this;
        }

        public Criteria andActshowproIdIsNotNull() {
            addCriterion("actShowPro_id is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproIdEqualTo(Integer value) {
            addCriterion("actShowPro_id =", value, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdNotEqualTo(Integer value) {
            addCriterion("actShowPro_id <>", value, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdGreaterThan(Integer value) {
            addCriterion("actShowPro_id >", value, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_id >=", value, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdLessThan(Integer value) {
            addCriterion("actShowPro_id <", value, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdLessThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_id <=", value, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdIn(List<Integer> values) {
            addCriterion("actShowPro_id in", values, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdNotIn(List<Integer> values) {
            addCriterion("actShowPro_id not in", values, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_id between", value1, value2, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproIdNotBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_id not between", value1, value2, "actshowproId");
            return (Criteria) this;
        }

        public Criteria andActshowproNameIsNull() {
            addCriterion("actShowPro_name is null");
            return (Criteria) this;
        }

        public Criteria andActshowproNameIsNotNull() {
            addCriterion("actShowPro_name is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproNameEqualTo(String value) {
            addCriterion("actShowPro_name =", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameNotEqualTo(String value) {
            addCriterion("actShowPro_name <>", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameGreaterThan(String value) {
            addCriterion("actShowPro_name >", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameGreaterThanOrEqualTo(String value) {
            addCriterion("actShowPro_name >=", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameLessThan(String value) {
            addCriterion("actShowPro_name <", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameLessThanOrEqualTo(String value) {
            addCriterion("actShowPro_name <=", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameLike(String value) {
            addCriterion("actShowPro_name like", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameNotLike(String value) {
            addCriterion("actShowPro_name not like", value, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameIn(List<String> values) {
            addCriterion("actShowPro_name in", values, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameNotIn(List<String> values) {
            addCriterion("actShowPro_name not in", values, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameBetween(String value1, String value2) {
            addCriterion("actShowPro_name between", value1, value2, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproNameNotBetween(String value1, String value2) {
            addCriterion("actShowPro_name not between", value1, value2, "actshowproName");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumIsNull() {
            addCriterion("actShowPro_actNum is null");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumIsNotNull() {
            addCriterion("actShowPro_actNum is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumEqualTo(Integer value) {
            addCriterion("actShowPro_actNum =", value, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumNotEqualTo(Integer value) {
            addCriterion("actShowPro_actNum <>", value, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumGreaterThan(Integer value) {
            addCriterion("actShowPro_actNum >", value, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_actNum >=", value, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumLessThan(Integer value) {
            addCriterion("actShowPro_actNum <", value, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumLessThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_actNum <=", value, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumIn(List<Integer> values) {
            addCriterion("actShowPro_actNum in", values, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumNotIn(List<Integer> values) {
            addCriterion("actShowPro_actNum not in", values, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_actNum between", value1, value2, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproActnumNotBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_actNum not between", value1, value2, "actshowproActnum");
            return (Criteria) this;
        }

        public Criteria andActshowproProidIsNull() {
            addCriterion("actShowPro_proId is null");
            return (Criteria) this;
        }

        public Criteria andActshowproProidIsNotNull() {
            addCriterion("actShowPro_proId is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproProidEqualTo(Integer value) {
            addCriterion("actShowPro_proId =", value, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidNotEqualTo(Integer value) {
            addCriterion("actShowPro_proId <>", value, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidGreaterThan(Integer value) {
            addCriterion("actShowPro_proId >", value, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidGreaterThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_proId >=", value, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidLessThan(Integer value) {
            addCriterion("actShowPro_proId <", value, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidLessThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_proId <=", value, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidIn(List<Integer> values) {
            addCriterion("actShowPro_proId in", values, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidNotIn(List<Integer> values) {
            addCriterion("actShowPro_proId not in", values, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_proId between", value1, value2, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproProidNotBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_proId not between", value1, value2, "actshowproProid");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameIsNull() {
            addCriterion("actShowPro_proName is null");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameIsNotNull() {
            addCriterion("actShowPro_proName is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameEqualTo(String value) {
            addCriterion("actShowPro_proName =", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameNotEqualTo(String value) {
            addCriterion("actShowPro_proName <>", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameGreaterThan(String value) {
            addCriterion("actShowPro_proName >", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameGreaterThanOrEqualTo(String value) {
            addCriterion("actShowPro_proName >=", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameLessThan(String value) {
            addCriterion("actShowPro_proName <", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameLessThanOrEqualTo(String value) {
            addCriterion("actShowPro_proName <=", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameLike(String value) {
            addCriterion("actShowPro_proName like", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameNotLike(String value) {
            addCriterion("actShowPro_proName not like", value, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameIn(List<String> values) {
            addCriterion("actShowPro_proName in", values, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameNotIn(List<String> values) {
            addCriterion("actShowPro_proName not in", values, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameBetween(String value1, String value2) {
            addCriterion("actShowPro_proName between", value1, value2, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproPronameNotBetween(String value1, String value2) {
            addCriterion("actShowPro_proName not between", value1, value2, "actshowproProname");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlIsNull() {
            addCriterion("actShowPro_imgwapurl is null");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlIsNotNull() {
            addCriterion("actShowPro_imgwapurl is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlEqualTo(String value) {
            addCriterion("actShowPro_imgwapurl =", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlNotEqualTo(String value) {
            addCriterion("actShowPro_imgwapurl <>", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlGreaterThan(String value) {
            addCriterion("actShowPro_imgwapurl >", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlGreaterThanOrEqualTo(String value) {
            addCriterion("actShowPro_imgwapurl >=", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlLessThan(String value) {
            addCriterion("actShowPro_imgwapurl <", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlLessThanOrEqualTo(String value) {
            addCriterion("actShowPro_imgwapurl <=", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlLike(String value) {
            addCriterion("actShowPro_imgwapurl like", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlNotLike(String value) {
            addCriterion("actShowPro_imgwapurl not like", value, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlIn(List<String> values) {
            addCriterion("actShowPro_imgwapurl in", values, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlNotIn(List<String> values) {
            addCriterion("actShowPro_imgwapurl not in", values, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlBetween(String value1, String value2) {
            addCriterion("actShowPro_imgwapurl between", value1, value2, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgwapurlNotBetween(String value1, String value2) {
            addCriterion("actShowPro_imgwapurl not between", value1, value2, "actshowproImgwapurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlIsNull() {
            addCriterion("actShowPro_imgpcurl is null");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlIsNotNull() {
            addCriterion("actShowPro_imgpcurl is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlEqualTo(String value) {
            addCriterion("actShowPro_imgpcurl =", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlNotEqualTo(String value) {
            addCriterion("actShowPro_imgpcurl <>", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlGreaterThan(String value) {
            addCriterion("actShowPro_imgpcurl >", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlGreaterThanOrEqualTo(String value) {
            addCriterion("actShowPro_imgpcurl >=", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlLessThan(String value) {
            addCriterion("actShowPro_imgpcurl <", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlLessThanOrEqualTo(String value) {
            addCriterion("actShowPro_imgpcurl <=", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlLike(String value) {
            addCriterion("actShowPro_imgpcurl like", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlNotLike(String value) {
            addCriterion("actShowPro_imgpcurl not like", value, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlIn(List<String> values) {
            addCriterion("actShowPro_imgpcurl in", values, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlNotIn(List<String> values) {
            addCriterion("actShowPro_imgpcurl not in", values, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlBetween(String value1, String value2) {
            addCriterion("actShowPro_imgpcurl between", value1, value2, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproImgpcurlNotBetween(String value1, String value2) {
            addCriterion("actShowPro_imgpcurl not between", value1, value2, "actshowproImgpcurl");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusIsNull() {
            addCriterion("actShowPro_status is null");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusIsNotNull() {
            addCriterion("actShowPro_status is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusEqualTo(Integer value) {
            addCriterion("actShowPro_status =", value, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusNotEqualTo(Integer value) {
            addCriterion("actShowPro_status <>", value, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusGreaterThan(Integer value) {
            addCriterion("actShowPro_status >", value, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_status >=", value, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusLessThan(Integer value) {
            addCriterion("actShowPro_status <", value, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusLessThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_status <=", value, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusIn(List<Integer> values) {
            addCriterion("actShowPro_status in", values, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusNotIn(List<Integer> values) {
            addCriterion("actShowPro_status not in", values, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_status between", value1, value2, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_status not between", value1, value2, "actshowproStatus");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthIsNull() {
            addCriterion("actShowPro_orderth is null");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthIsNotNull() {
            addCriterion("actShowPro_orderth is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthEqualTo(Integer value) {
            addCriterion("actShowPro_orderth =", value, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthNotEqualTo(Integer value) {
            addCriterion("actShowPro_orderth <>", value, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthGreaterThan(Integer value) {
            addCriterion("actShowPro_orderth >", value, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthGreaterThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_orderth >=", value, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthLessThan(Integer value) {
            addCriterion("actShowPro_orderth <", value, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthLessThanOrEqualTo(Integer value) {
            addCriterion("actShowPro_orderth <=", value, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthIn(List<Integer> values) {
            addCriterion("actShowPro_orderth in", values, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthNotIn(List<Integer> values) {
            addCriterion("actShowPro_orderth not in", values, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_orderth between", value1, value2, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproOrderthNotBetween(Integer value1, Integer value2) {
            addCriterion("actShowPro_orderth not between", value1, value2, "actshowproOrderth");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeIsNull() {
            addCriterion("actShowPro_createTime is null");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeIsNotNull() {
            addCriterion("actShowPro_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeEqualTo(String value) {
            addCriterion("actShowPro_createTime =", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeNotEqualTo(String value) {
            addCriterion("actShowPro_createTime <>", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeGreaterThan(String value) {
            addCriterion("actShowPro_createTime >", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("actShowPro_createTime >=", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeLessThan(String value) {
            addCriterion("actShowPro_createTime <", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("actShowPro_createTime <=", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeLike(String value) {
            addCriterion("actShowPro_createTime like", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeNotLike(String value) {
            addCriterion("actShowPro_createTime not like", value, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeIn(List<String> values) {
            addCriterion("actShowPro_createTime in", values, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeNotIn(List<String> values) {
            addCriterion("actShowPro_createTime not in", values, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeBetween(String value1, String value2) {
            addCriterion("actShowPro_createTime between", value1, value2, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproCreatetimeNotBetween(String value1, String value2) {
            addCriterion("actShowPro_createTime not between", value1, value2, "actshowproCreatetime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeIsNull() {
            addCriterion("actShowPro_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeIsNotNull() {
            addCriterion("actShowPro_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeEqualTo(String value) {
            addCriterion("actShowPro_motifyTime =", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeNotEqualTo(String value) {
            addCriterion("actShowPro_motifyTime <>", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeGreaterThan(String value) {
            addCriterion("actShowPro_motifyTime >", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("actShowPro_motifyTime >=", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeLessThan(String value) {
            addCriterion("actShowPro_motifyTime <", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("actShowPro_motifyTime <=", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeLike(String value) {
            addCriterion("actShowPro_motifyTime like", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeNotLike(String value) {
            addCriterion("actShowPro_motifyTime not like", value, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeIn(List<String> values) {
            addCriterion("actShowPro_motifyTime in", values, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeNotIn(List<String> values) {
            addCriterion("actShowPro_motifyTime not in", values, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeBetween(String value1, String value2) {
            addCriterion("actShowPro_motifyTime between", value1, value2, "actshowproMotifytime");
            return (Criteria) this;
        }

        public Criteria andActshowproMotifytimeNotBetween(String value1, String value2) {
            addCriterion("actShowPro_motifyTime not between", value1, value2, "actshowproMotifytime");
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