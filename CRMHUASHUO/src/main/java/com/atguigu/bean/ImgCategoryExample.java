package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class ImgCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImgCategoryExample() {
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

        public Criteria andImgCategoryIdIsNull() {
            addCriterion("img_category_id is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdIsNotNull() {
            addCriterion("img_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdEqualTo(Integer value) {
            addCriterion("img_category_id =", value, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdNotEqualTo(Integer value) {
            addCriterion("img_category_id <>", value, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdGreaterThan(Integer value) {
            addCriterion("img_category_id >", value, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_category_id >=", value, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdLessThan(Integer value) {
            addCriterion("img_category_id <", value, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_category_id <=", value, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdIn(List<Integer> values) {
            addCriterion("img_category_id in", values, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdNotIn(List<Integer> values) {
            addCriterion("img_category_id not in", values, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("img_category_id between", value1, value2, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_category_id not between", value1, value2, "imgCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameIsNull() {
            addCriterion("img_category_name is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameIsNotNull() {
            addCriterion("img_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameEqualTo(String value) {
            addCriterion("img_category_name =", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameNotEqualTo(String value) {
            addCriterion("img_category_name <>", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameGreaterThan(String value) {
            addCriterion("img_category_name >", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_name >=", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameLessThan(String value) {
            addCriterion("img_category_name <", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("img_category_name <=", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameLike(String value) {
            addCriterion("img_category_name like", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameNotLike(String value) {
            addCriterion("img_category_name not like", value, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameIn(List<String> values) {
            addCriterion("img_category_name in", values, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameNotIn(List<String> values) {
            addCriterion("img_category_name not in", values, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameBetween(String value1, String value2) {
            addCriterion("img_category_name between", value1, value2, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryNameNotBetween(String value1, String value2) {
            addCriterion("img_category_name not between", value1, value2, "imgCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdIsNull() {
            addCriterion("img_category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdIsNotNull() {
            addCriterion("img_category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdEqualTo(String value) {
            addCriterion("img_category_parent_id =", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdNotEqualTo(String value) {
            addCriterion("img_category_parent_id <>", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdGreaterThan(String value) {
            addCriterion("img_category_parent_id >", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_parent_id >=", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdLessThan(String value) {
            addCriterion("img_category_parent_id <", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdLessThanOrEqualTo(String value) {
            addCriterion("img_category_parent_id <=", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdLike(String value) {
            addCriterion("img_category_parent_id like", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdNotLike(String value) {
            addCriterion("img_category_parent_id not like", value, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdIn(List<String> values) {
            addCriterion("img_category_parent_id in", values, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdNotIn(List<String> values) {
            addCriterion("img_category_parent_id not in", values, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdBetween(String value1, String value2) {
            addCriterion("img_category_parent_id between", value1, value2, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentIdNotBetween(String value1, String value2) {
            addCriterion("img_category_parent_id not between", value1, value2, "imgCategoryParentId");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameIsNull() {
            addCriterion("img_category_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameIsNotNull() {
            addCriterion("img_category_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameEqualTo(String value) {
            addCriterion("img_category_parent_name =", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameNotEqualTo(String value) {
            addCriterion("img_category_parent_name <>", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameGreaterThan(String value) {
            addCriterion("img_category_parent_name >", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_parent_name >=", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameLessThan(String value) {
            addCriterion("img_category_parent_name <", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameLessThanOrEqualTo(String value) {
            addCriterion("img_category_parent_name <=", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameLike(String value) {
            addCriterion("img_category_parent_name like", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameNotLike(String value) {
            addCriterion("img_category_parent_name not like", value, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameIn(List<String> values) {
            addCriterion("img_category_parent_name in", values, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameNotIn(List<String> values) {
            addCriterion("img_category_parent_name not in", values, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameBetween(String value1, String value2) {
            addCriterion("img_category_parent_name between", value1, value2, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategoryParentNameNotBetween(String value1, String value2) {
            addCriterion("img_category_parent_name not between", value1, value2, "imgCategoryParentName");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoIsNull() {
            addCriterion("img_category_seo is null");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoIsNotNull() {
            addCriterion("img_category_seo is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoEqualTo(String value) {
            addCriterion("img_category_seo =", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoNotEqualTo(String value) {
            addCriterion("img_category_seo <>", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoGreaterThan(String value) {
            addCriterion("img_category_seo >", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_seo >=", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoLessThan(String value) {
            addCriterion("img_category_seo <", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoLessThanOrEqualTo(String value) {
            addCriterion("img_category_seo <=", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoLike(String value) {
            addCriterion("img_category_seo like", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoNotLike(String value) {
            addCriterion("img_category_seo not like", value, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoIn(List<String> values) {
            addCriterion("img_category_seo in", values, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoNotIn(List<String> values) {
            addCriterion("img_category_seo not in", values, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoBetween(String value1, String value2) {
            addCriterion("img_category_seo between", value1, value2, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySeoNotBetween(String value1, String value2) {
            addCriterion("img_category_seo not between", value1, value2, "imgCategorySeo");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderIsNull() {
            addCriterion("img_category_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderIsNotNull() {
            addCriterion("img_category_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderEqualTo(String value) {
            addCriterion("img_category_sort_order =", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderNotEqualTo(String value) {
            addCriterion("img_category_sort_order <>", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderGreaterThan(String value) {
            addCriterion("img_category_sort_order >", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_sort_order >=", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderLessThan(String value) {
            addCriterion("img_category_sort_order <", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderLessThanOrEqualTo(String value) {
            addCriterion("img_category_sort_order <=", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderLike(String value) {
            addCriterion("img_category_sort_order like", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderNotLike(String value) {
            addCriterion("img_category_sort_order not like", value, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderIn(List<String> values) {
            addCriterion("img_category_sort_order in", values, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderNotIn(List<String> values) {
            addCriterion("img_category_sort_order not in", values, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderBetween(String value1, String value2) {
            addCriterion("img_category_sort_order between", value1, value2, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategorySortOrderNotBetween(String value1, String value2) {
            addCriterion("img_category_sort_order not between", value1, value2, "imgCategorySortOrder");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeIsNull() {
            addCriterion("img_category_createTime is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeIsNotNull() {
            addCriterion("img_category_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeEqualTo(String value) {
            addCriterion("img_category_createTime =", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeNotEqualTo(String value) {
            addCriterion("img_category_createTime <>", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeGreaterThan(String value) {
            addCriterion("img_category_createTime >", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_createTime >=", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeLessThan(String value) {
            addCriterion("img_category_createTime <", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("img_category_createTime <=", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeLike(String value) {
            addCriterion("img_category_createTime like", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeNotLike(String value) {
            addCriterion("img_category_createTime not like", value, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeIn(List<String> values) {
            addCriterion("img_category_createTime in", values, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeNotIn(List<String> values) {
            addCriterion("img_category_createTime not in", values, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeBetween(String value1, String value2) {
            addCriterion("img_category_createTime between", value1, value2, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryCreatetimeNotBetween(String value1, String value2) {
            addCriterion("img_category_createTime not between", value1, value2, "imgCategoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeIsNull() {
            addCriterion("img_category_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeIsNotNull() {
            addCriterion("img_category_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeEqualTo(String value) {
            addCriterion("img_category_motifyTime =", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeNotEqualTo(String value) {
            addCriterion("img_category_motifyTime <>", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeGreaterThan(String value) {
            addCriterion("img_category_motifyTime >", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_motifyTime >=", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeLessThan(String value) {
            addCriterion("img_category_motifyTime <", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("img_category_motifyTime <=", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeLike(String value) {
            addCriterion("img_category_motifyTime like", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeNotLike(String value) {
            addCriterion("img_category_motifyTime not like", value, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeIn(List<String> values) {
            addCriterion("img_category_motifyTime in", values, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeNotIn(List<String> values) {
            addCriterion("img_category_motifyTime not in", values, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeBetween(String value1, String value2) {
            addCriterion("img_category_motifyTime between", value1, value2, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryMotifytimeNotBetween(String value1, String value2) {
            addCriterion("img_category_motifyTime not between", value1, value2, "imgCategoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescIsNull() {
            addCriterion("img_category_desc is null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescIsNotNull() {
            addCriterion("img_category_desc is not null");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescEqualTo(String value) {
            addCriterion("img_category_desc =", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescNotEqualTo(String value) {
            addCriterion("img_category_desc <>", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescGreaterThan(String value) {
            addCriterion("img_category_desc >", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("img_category_desc >=", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescLessThan(String value) {
            addCriterion("img_category_desc <", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescLessThanOrEqualTo(String value) {
            addCriterion("img_category_desc <=", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescLike(String value) {
            addCriterion("img_category_desc like", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescNotLike(String value) {
            addCriterion("img_category_desc not like", value, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescIn(List<String> values) {
            addCriterion("img_category_desc in", values, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescNotIn(List<String> values) {
            addCriterion("img_category_desc not in", values, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescBetween(String value1, String value2) {
            addCriterion("img_category_desc between", value1, value2, "imgCategoryDesc");
            return (Criteria) this;
        }

        public Criteria andImgCategoryDescNotBetween(String value1, String value2) {
            addCriterion("img_category_desc not between", value1, value2, "imgCategoryDesc");
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