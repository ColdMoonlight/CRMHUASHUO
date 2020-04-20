package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackReviewImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackReviewImgExample() {
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

        public Criteria andReviewimgIdIsNull() {
            addCriterion("reviewImg_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdIsNotNull() {
            addCriterion("reviewImg_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdEqualTo(Integer value) {
            addCriterion("reviewImg_id =", value, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdNotEqualTo(Integer value) {
            addCriterion("reviewImg_id <>", value, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdGreaterThan(Integer value) {
            addCriterion("reviewImg_id >", value, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewImg_id >=", value, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdLessThan(Integer value) {
            addCriterion("reviewImg_id <", value, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdLessThanOrEqualTo(Integer value) {
            addCriterion("reviewImg_id <=", value, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdIn(List<Integer> values) {
            addCriterion("reviewImg_id in", values, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdNotIn(List<Integer> values) {
            addCriterion("reviewImg_id not in", values, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdBetween(Integer value1, Integer value2) {
            addCriterion("reviewImg_id between", value1, value2, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewImg_id not between", value1, value2, "reviewimgId");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameIsNull() {
            addCriterion("reviewImg_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameIsNotNull() {
            addCriterion("reviewImg_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameEqualTo(String value) {
            addCriterion("reviewImg_name =", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameNotEqualTo(String value) {
            addCriterion("reviewImg_name <>", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameGreaterThan(String value) {
            addCriterion("reviewImg_name >", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameGreaterThanOrEqualTo(String value) {
            addCriterion("reviewImg_name >=", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameLessThan(String value) {
            addCriterion("reviewImg_name <", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameLessThanOrEqualTo(String value) {
            addCriterion("reviewImg_name <=", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameLike(String value) {
            addCriterion("reviewImg_name like", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameNotLike(String value) {
            addCriterion("reviewImg_name not like", value, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameIn(List<String> values) {
            addCriterion("reviewImg_name in", values, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameNotIn(List<String> values) {
            addCriterion("reviewImg_name not in", values, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameBetween(String value1, String value2) {
            addCriterion("reviewImg_name between", value1, value2, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgNameNotBetween(String value1, String value2) {
            addCriterion("reviewImg_name not between", value1, value2, "reviewimgName");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlIsNull() {
            addCriterion("reviewImg_url is null");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlIsNotNull() {
            addCriterion("reviewImg_url is not null");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlEqualTo(String value) {
            addCriterion("reviewImg_url =", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlNotEqualTo(String value) {
            addCriterion("reviewImg_url <>", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlGreaterThan(String value) {
            addCriterion("reviewImg_url >", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("reviewImg_url >=", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlLessThan(String value) {
            addCriterion("reviewImg_url <", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlLessThanOrEqualTo(String value) {
            addCriterion("reviewImg_url <=", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlLike(String value) {
            addCriterion("reviewImg_url like", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlNotLike(String value) {
            addCriterion("reviewImg_url not like", value, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlIn(List<String> values) {
            addCriterion("reviewImg_url in", values, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlNotIn(List<String> values) {
            addCriterion("reviewImg_url not in", values, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlBetween(String value1, String value2) {
            addCriterion("reviewImg_url between", value1, value2, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewimgUrlNotBetween(String value1, String value2) {
            addCriterion("reviewImg_url not between", value1, value2, "reviewimgUrl");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNull() {
            addCriterion("review_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewIdIsNotNull() {
            addCriterion("review_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewIdEqualTo(Integer value) {
            addCriterion("review_id =", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotEqualTo(Integer value) {
            addCriterion("review_id <>", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThan(Integer value) {
            addCriterion("review_id >", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("review_id >=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThan(Integer value) {
            addCriterion("review_id <", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdLessThanOrEqualTo(Integer value) {
            addCriterion("review_id <=", value, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdIn(List<Integer> values) {
            addCriterion("review_id in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotIn(List<Integer> values) {
            addCriterion("review_id not in", values, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdBetween(Integer value1, Integer value2) {
            addCriterion("review_id between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewIdNotBetween(Integer value1, Integer value2) {
            addCriterion("review_id not between", value1, value2, "reviewId");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderIsNull() {
            addCriterion("reviewImg_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderIsNotNull() {
            addCriterion("reviewImg_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderEqualTo(Integer value) {
            addCriterion("reviewImg_sort_order =", value, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderNotEqualTo(Integer value) {
            addCriterion("reviewImg_sort_order <>", value, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderGreaterThan(Integer value) {
            addCriterion("reviewImg_sort_order >", value, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("reviewImg_sort_order >=", value, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderLessThan(Integer value) {
            addCriterion("reviewImg_sort_order <", value, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("reviewImg_sort_order <=", value, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderIn(List<Integer> values) {
            addCriterion("reviewImg_sort_order in", values, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderNotIn(List<Integer> values) {
            addCriterion("reviewImg_sort_order not in", values, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("reviewImg_sort_order between", value1, value2, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("reviewImg_sort_order not between", value1, value2, "reviewimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeIsNull() {
            addCriterion("reviewImg_createTime is null");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeIsNotNull() {
            addCriterion("reviewImg_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeEqualTo(String value) {
            addCriterion("reviewImg_createTime =", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeNotEqualTo(String value) {
            addCriterion("reviewImg_createTime <>", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeGreaterThan(String value) {
            addCriterion("reviewImg_createTime >", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("reviewImg_createTime >=", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeLessThan(String value) {
            addCriterion("reviewImg_createTime <", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("reviewImg_createTime <=", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeLike(String value) {
            addCriterion("reviewImg_createTime like", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeNotLike(String value) {
            addCriterion("reviewImg_createTime not like", value, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeIn(List<String> values) {
            addCriterion("reviewImg_createTime in", values, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeNotIn(List<String> values) {
            addCriterion("reviewImg_createTime not in", values, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeBetween(String value1, String value2) {
            addCriterion("reviewImg_createTime between", value1, value2, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgCreatetimeNotBetween(String value1, String value2) {
            addCriterion("reviewImg_createTime not between", value1, value2, "reviewimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeIsNull() {
            addCriterion("reviewImg_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeIsNotNull() {
            addCriterion("reviewImg_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeEqualTo(String value) {
            addCriterion("reviewImg_motifyTime =", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeNotEqualTo(String value) {
            addCriterion("reviewImg_motifyTime <>", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeGreaterThan(String value) {
            addCriterion("reviewImg_motifyTime >", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("reviewImg_motifyTime >=", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeLessThan(String value) {
            addCriterion("reviewImg_motifyTime <", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("reviewImg_motifyTime <=", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeLike(String value) {
            addCriterion("reviewImg_motifyTime like", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeNotLike(String value) {
            addCriterion("reviewImg_motifyTime not like", value, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeIn(List<String> values) {
            addCriterion("reviewImg_motifyTime in", values, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeNotIn(List<String> values) {
            addCriterion("reviewImg_motifyTime not in", values, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeBetween(String value1, String value2) {
            addCriterion("reviewImg_motifyTime between", value1, value2, "reviewimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andReviewimgMotifytimeNotBetween(String value1, String value2) {
            addCriterion("reviewImg_motifyTime not between", value1, value2, "reviewimgMotifytime");
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