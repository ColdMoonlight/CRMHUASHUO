package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackProductImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackProductImgExample() {
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

        public Criteria andProductimgIdIsNull() {
            addCriterion("productImg_id is null");
            return (Criteria) this;
        }

        public Criteria andProductimgIdIsNotNull() {
            addCriterion("productImg_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgIdEqualTo(Integer value) {
            addCriterion("productImg_id =", value, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdNotEqualTo(Integer value) {
            addCriterion("productImg_id <>", value, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdGreaterThan(Integer value) {
            addCriterion("productImg_id >", value, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("productImg_id >=", value, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdLessThan(Integer value) {
            addCriterion("productImg_id <", value, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdLessThanOrEqualTo(Integer value) {
            addCriterion("productImg_id <=", value, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdIn(List<Integer> values) {
            addCriterion("productImg_id in", values, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdNotIn(List<Integer> values) {
            addCriterion("productImg_id not in", values, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdBetween(Integer value1, Integer value2) {
            addCriterion("productImg_id between", value1, value2, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgIdNotBetween(Integer value1, Integer value2) {
            addCriterion("productImg_id not between", value1, value2, "productimgId");
            return (Criteria) this;
        }

        public Criteria andProductimgNameIsNull() {
            addCriterion("productImg_name is null");
            return (Criteria) this;
        }

        public Criteria andProductimgNameIsNotNull() {
            addCriterion("productImg_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgNameEqualTo(String value) {
            addCriterion("productImg_name =", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameNotEqualTo(String value) {
            addCriterion("productImg_name <>", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameGreaterThan(String value) {
            addCriterion("productImg_name >", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameGreaterThanOrEqualTo(String value) {
            addCriterion("productImg_name >=", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameLessThan(String value) {
            addCriterion("productImg_name <", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameLessThanOrEqualTo(String value) {
            addCriterion("productImg_name <=", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameLike(String value) {
            addCriterion("productImg_name like", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameNotLike(String value) {
            addCriterion("productImg_name not like", value, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameIn(List<String> values) {
            addCriterion("productImg_name in", values, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameNotIn(List<String> values) {
            addCriterion("productImg_name not in", values, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameBetween(String value1, String value2) {
            addCriterion("productImg_name between", value1, value2, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgNameNotBetween(String value1, String value2) {
            addCriterion("productImg_name not between", value1, value2, "productimgName");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlIsNull() {
            addCriterion("productImg_url is null");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlIsNotNull() {
            addCriterion("productImg_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlEqualTo(String value) {
            addCriterion("productImg_url =", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlNotEqualTo(String value) {
            addCriterion("productImg_url <>", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlGreaterThan(String value) {
            addCriterion("productImg_url >", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlGreaterThanOrEqualTo(String value) {
            addCriterion("productImg_url >=", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlLessThan(String value) {
            addCriterion("productImg_url <", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlLessThanOrEqualTo(String value) {
            addCriterion("productImg_url <=", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlLike(String value) {
            addCriterion("productImg_url like", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlNotLike(String value) {
            addCriterion("productImg_url not like", value, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlIn(List<String> values) {
            addCriterion("productImg_url in", values, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlNotIn(List<String> values) {
            addCriterion("productImg_url not in", values, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlBetween(String value1, String value2) {
            addCriterion("productImg_url between", value1, value2, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductimgUrlNotBetween(String value1, String value2) {
            addCriterion("productImg_url not between", value1, value2, "productimgUrl");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderIsNull() {
            addCriterion("productImg_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderIsNotNull() {
            addCriterion("productImg_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderEqualTo(Integer value) {
            addCriterion("productImg_sort_order =", value, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderNotEqualTo(Integer value) {
            addCriterion("productImg_sort_order <>", value, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderGreaterThan(Integer value) {
            addCriterion("productImg_sort_order >", value, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("productImg_sort_order >=", value, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderLessThan(Integer value) {
            addCriterion("productImg_sort_order <", value, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("productImg_sort_order <=", value, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderIn(List<Integer> values) {
            addCriterion("productImg_sort_order in", values, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderNotIn(List<Integer> values) {
            addCriterion("productImg_sort_order not in", values, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderBetween(Integer value1, Integer value2) {
            addCriterion("productImg_sort_order between", value1, value2, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgSortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("productImg_sort_order not between", value1, value2, "productimgSortOrder");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeIsNull() {
            addCriterion("productImg_createTime is null");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeIsNotNull() {
            addCriterion("productImg_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeEqualTo(String value) {
            addCriterion("productImg_createTime =", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeNotEqualTo(String value) {
            addCriterion("productImg_createTime <>", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeGreaterThan(String value) {
            addCriterion("productImg_createTime >", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("productImg_createTime >=", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeLessThan(String value) {
            addCriterion("productImg_createTime <", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("productImg_createTime <=", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeLike(String value) {
            addCriterion("productImg_createTime like", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeNotLike(String value) {
            addCriterion("productImg_createTime not like", value, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeIn(List<String> values) {
            addCriterion("productImg_createTime in", values, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeNotIn(List<String> values) {
            addCriterion("productImg_createTime not in", values, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeBetween(String value1, String value2) {
            addCriterion("productImg_createTime between", value1, value2, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgCreatetimeNotBetween(String value1, String value2) {
            addCriterion("productImg_createTime not between", value1, value2, "productimgCreatetime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeIsNull() {
            addCriterion("productImg_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeIsNotNull() {
            addCriterion("productImg_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeEqualTo(String value) {
            addCriterion("productImg_motifyTime =", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeNotEqualTo(String value) {
            addCriterion("productImg_motifyTime <>", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeGreaterThan(String value) {
            addCriterion("productImg_motifyTime >", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("productImg_motifyTime >=", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeLessThan(String value) {
            addCriterion("productImg_motifyTime <", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("productImg_motifyTime <=", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeLike(String value) {
            addCriterion("productImg_motifyTime like", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeNotLike(String value) {
            addCriterion("productImg_motifyTime not like", value, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeIn(List<String> values) {
            addCriterion("productImg_motifyTime in", values, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeNotIn(List<String> values) {
            addCriterion("productImg_motifyTime not in", values, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeBetween(String value1, String value2) {
            addCriterion("productImg_motifyTime between", value1, value2, "productimgMotifytime");
            return (Criteria) this;
        }

        public Criteria andProductimgMotifytimeNotBetween(String value1, String value2) {
            addCriterion("productImg_motifyTime not between", value1, value2, "productimgMotifytime");
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