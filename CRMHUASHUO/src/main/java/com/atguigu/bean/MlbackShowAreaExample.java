package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackShowAreaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackShowAreaExample() {
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

        public Criteria andShowareaIdIsNull() {
            addCriterion("showArea_id is null");
            return (Criteria) this;
        }

        public Criteria andShowareaIdIsNotNull() {
            addCriterion("showArea_id is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaIdEqualTo(Integer value) {
            addCriterion("showArea_id =", value, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdNotEqualTo(Integer value) {
            addCriterion("showArea_id <>", value, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdGreaterThan(Integer value) {
            addCriterion("showArea_id >", value, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("showArea_id >=", value, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdLessThan(Integer value) {
            addCriterion("showArea_id <", value, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdLessThanOrEqualTo(Integer value) {
            addCriterion("showArea_id <=", value, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdIn(List<Integer> values) {
            addCriterion("showArea_id in", values, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdNotIn(List<Integer> values) {
            addCriterion("showArea_id not in", values, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdBetween(Integer value1, Integer value2) {
            addCriterion("showArea_id between", value1, value2, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("showArea_id not between", value1, value2, "showareaId");
            return (Criteria) this;
        }

        public Criteria andShowareaNameIsNull() {
            addCriterion("showArea_name is null");
            return (Criteria) this;
        }

        public Criteria andShowareaNameIsNotNull() {
            addCriterion("showArea_name is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaNameEqualTo(String value) {
            addCriterion("showArea_name =", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameNotEqualTo(String value) {
            addCriterion("showArea_name <>", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameGreaterThan(String value) {
            addCriterion("showArea_name >", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameGreaterThanOrEqualTo(String value) {
            addCriterion("showArea_name >=", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameLessThan(String value) {
            addCriterion("showArea_name <", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameLessThanOrEqualTo(String value) {
            addCriterion("showArea_name <=", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameLike(String value) {
            addCriterion("showArea_name like", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameNotLike(String value) {
            addCriterion("showArea_name not like", value, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameIn(List<String> values) {
            addCriterion("showArea_name in", values, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameNotIn(List<String> values) {
            addCriterion("showArea_name not in", values, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameBetween(String value1, String value2) {
            addCriterion("showArea_name between", value1, value2, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaNameNotBetween(String value1, String value2) {
            addCriterion("showArea_name not between", value1, value2, "showareaName");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlIsNull() {
            addCriterion("showArea_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlIsNotNull() {
            addCriterion("showArea_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlEqualTo(String value) {
            addCriterion("showArea_imgurl =", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlNotEqualTo(String value) {
            addCriterion("showArea_imgurl <>", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlGreaterThan(String value) {
            addCriterion("showArea_imgurl >", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("showArea_imgurl >=", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlLessThan(String value) {
            addCriterion("showArea_imgurl <", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlLessThanOrEqualTo(String value) {
            addCriterion("showArea_imgurl <=", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlLike(String value) {
            addCriterion("showArea_imgurl like", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlNotLike(String value) {
            addCriterion("showArea_imgurl not like", value, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlIn(List<String> values) {
            addCriterion("showArea_imgurl in", values, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlNotIn(List<String> values) {
            addCriterion("showArea_imgurl not in", values, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlBetween(String value1, String value2) {
            addCriterion("showArea_imgurl between", value1, value2, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgurlNotBetween(String value1, String value2) {
            addCriterion("showArea_imgurl not between", value1, value2, "showareaImgurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlIsNull() {
            addCriterion("showArea_imgpcurl is null");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlIsNotNull() {
            addCriterion("showArea_imgpcurl is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlEqualTo(String value) {
            addCriterion("showArea_imgpcurl =", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlNotEqualTo(String value) {
            addCriterion("showArea_imgpcurl <>", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlGreaterThan(String value) {
            addCriterion("showArea_imgpcurl >", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlGreaterThanOrEqualTo(String value) {
            addCriterion("showArea_imgpcurl >=", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlLessThan(String value) {
            addCriterion("showArea_imgpcurl <", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlLessThanOrEqualTo(String value) {
            addCriterion("showArea_imgpcurl <=", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlLike(String value) {
            addCriterion("showArea_imgpcurl like", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlNotLike(String value) {
            addCriterion("showArea_imgpcurl not like", value, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlIn(List<String> values) {
            addCriterion("showArea_imgpcurl in", values, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlNotIn(List<String> values) {
            addCriterion("showArea_imgpcurl not in", values, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlBetween(String value1, String value2) {
            addCriterion("showArea_imgpcurl between", value1, value2, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaImgpcurlNotBetween(String value1, String value2) {
            addCriterion("showArea_imgpcurl not between", value1, value2, "showareaImgpcurl");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusIsNull() {
            addCriterion("showArea_status is null");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusIsNotNull() {
            addCriterion("showArea_status is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusEqualTo(Integer value) {
            addCriterion("showArea_status =", value, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusNotEqualTo(Integer value) {
            addCriterion("showArea_status <>", value, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusGreaterThan(Integer value) {
            addCriterion("showArea_status >", value, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("showArea_status >=", value, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusLessThan(Integer value) {
            addCriterion("showArea_status <", value, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("showArea_status <=", value, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusIn(List<Integer> values) {
            addCriterion("showArea_status in", values, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusNotIn(List<Integer> values) {
            addCriterion("showArea_status not in", values, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusBetween(Integer value1, Integer value2) {
            addCriterion("showArea_status between", value1, value2, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("showArea_status not between", value1, value2, "showareaStatus");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthIsNull() {
            addCriterion("showArea_numth is null");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthIsNotNull() {
            addCriterion("showArea_numth is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthEqualTo(Integer value) {
            addCriterion("showArea_numth =", value, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthNotEqualTo(Integer value) {
            addCriterion("showArea_numth <>", value, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthGreaterThan(Integer value) {
            addCriterion("showArea_numth >", value, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthGreaterThanOrEqualTo(Integer value) {
            addCriterion("showArea_numth >=", value, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthLessThan(Integer value) {
            addCriterion("showArea_numth <", value, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthLessThanOrEqualTo(Integer value) {
            addCriterion("showArea_numth <=", value, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthIn(List<Integer> values) {
            addCriterion("showArea_numth in", values, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthNotIn(List<Integer> values) {
            addCriterion("showArea_numth not in", values, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthBetween(Integer value1, Integer value2) {
            addCriterion("showArea_numth between", value1, value2, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaNumthNotBetween(Integer value1, Integer value2) {
            addCriterion("showArea_numth not between", value1, value2, "showareaNumth");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeIsNull() {
            addCriterion("showArea_createTime is null");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeIsNotNull() {
            addCriterion("showArea_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeEqualTo(String value) {
            addCriterion("showArea_createTime =", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeNotEqualTo(String value) {
            addCriterion("showArea_createTime <>", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeGreaterThan(String value) {
            addCriterion("showArea_createTime >", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("showArea_createTime >=", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeLessThan(String value) {
            addCriterion("showArea_createTime <", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("showArea_createTime <=", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeLike(String value) {
            addCriterion("showArea_createTime like", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeNotLike(String value) {
            addCriterion("showArea_createTime not like", value, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeIn(List<String> values) {
            addCriterion("showArea_createTime in", values, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeNotIn(List<String> values) {
            addCriterion("showArea_createTime not in", values, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeBetween(String value1, String value2) {
            addCriterion("showArea_createTime between", value1, value2, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaCreatetimeNotBetween(String value1, String value2) {
            addCriterion("showArea_createTime not between", value1, value2, "showareaCreatetime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeIsNull() {
            addCriterion("showArea_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeIsNotNull() {
            addCriterion("showArea_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeEqualTo(String value) {
            addCriterion("showArea_motifyTime =", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeNotEqualTo(String value) {
            addCriterion("showArea_motifyTime <>", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeGreaterThan(String value) {
            addCriterion("showArea_motifyTime >", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("showArea_motifyTime >=", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeLessThan(String value) {
            addCriterion("showArea_motifyTime <", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("showArea_motifyTime <=", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeLike(String value) {
            addCriterion("showArea_motifyTime like", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeNotLike(String value) {
            addCriterion("showArea_motifyTime not like", value, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeIn(List<String> values) {
            addCriterion("showArea_motifyTime in", values, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeNotIn(List<String> values) {
            addCriterion("showArea_motifyTime not in", values, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeBetween(String value1, String value2) {
            addCriterion("showArea_motifyTime between", value1, value2, "showareaMotifytime");
            return (Criteria) this;
        }

        public Criteria andShowareaMotifytimeNotBetween(String value1, String value2) {
            addCriterion("showArea_motifyTime not between", value1, value2, "showareaMotifytime");
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