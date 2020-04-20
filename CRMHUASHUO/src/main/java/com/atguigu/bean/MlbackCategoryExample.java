package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MlbackCategoryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackCategoryExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlIsNull() {
            addCriterion("category_imgurl is null");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlIsNotNull() {
            addCriterion("category_imgurl is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlEqualTo(String value) {
            addCriterion("category_imgurl =", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlNotEqualTo(String value) {
            addCriterion("category_imgurl <>", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlGreaterThan(String value) {
            addCriterion("category_imgurl >", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("category_imgurl >=", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlLessThan(String value) {
            addCriterion("category_imgurl <", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlLessThanOrEqualTo(String value) {
            addCriterion("category_imgurl <=", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlLike(String value) {
            addCriterion("category_imgurl like", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlNotLike(String value) {
            addCriterion("category_imgurl not like", value, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlIn(List<String> values) {
            addCriterion("category_imgurl in", values, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlNotIn(List<String> values) {
            addCriterion("category_imgurl not in", values, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlBetween(String value1, String value2) {
            addCriterion("category_imgurl between", value1, value2, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryImgurlNotBetween(String value1, String value2) {
            addCriterion("category_imgurl not between", value1, value2, "categoryImgurl");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIsNull() {
            addCriterion("category_parent_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIsNotNull() {
            addCriterion("category_parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdEqualTo(Integer value) {
            addCriterion("category_parent_id =", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotEqualTo(Integer value) {
            addCriterion("category_parent_id <>", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdGreaterThan(Integer value) {
            addCriterion("category_parent_id >", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_parent_id >=", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdLessThan(Integer value) {
            addCriterion("category_parent_id <", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_parent_id <=", value, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdIn(List<Integer> values) {
            addCriterion("category_parent_id in", values, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotIn(List<Integer> values) {
            addCriterion("category_parent_id not in", values, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdBetween(Integer value1, Integer value2) {
            addCriterion("category_parent_id between", value1, value2, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_parent_id not between", value1, value2, "categoryParentId");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameIsNull() {
            addCriterion("category_parent_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameIsNotNull() {
            addCriterion("category_parent_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameEqualTo(String value) {
            addCriterion("category_parent_name =", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameNotEqualTo(String value) {
            addCriterion("category_parent_name <>", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameGreaterThan(String value) {
            addCriterion("category_parent_name >", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_parent_name >=", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameLessThan(String value) {
            addCriterion("category_parent_name <", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameLessThanOrEqualTo(String value) {
            addCriterion("category_parent_name <=", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameLike(String value) {
            addCriterion("category_parent_name like", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameNotLike(String value) {
            addCriterion("category_parent_name not like", value, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameIn(List<String> values) {
            addCriterion("category_parent_name in", values, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameNotIn(List<String> values) {
            addCriterion("category_parent_name not in", values, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameBetween(String value1, String value2) {
            addCriterion("category_parent_name between", value1, value2, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryParentNameNotBetween(String value1, String value2) {
            addCriterion("category_parent_name not between", value1, value2, "categoryParentName");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIsNull() {
            addCriterion("category_status is null");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIsNotNull() {
            addCriterion("category_status is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusEqualTo(Integer value) {
            addCriterion("category_status =", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotEqualTo(Integer value) {
            addCriterion("category_status <>", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusGreaterThan(Integer value) {
            addCriterion("category_status >", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_status >=", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusLessThan(Integer value) {
            addCriterion("category_status <", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusLessThanOrEqualTo(Integer value) {
            addCriterion("category_status <=", value, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusIn(List<Integer> values) {
            addCriterion("category_status in", values, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotIn(List<Integer> values) {
            addCriterion("category_status not in", values, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusBetween(Integer value1, Integer value2) {
            addCriterion("category_status between", value1, value2, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategoryStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("category_status not between", value1, value2, "categoryStatus");
            return (Criteria) this;
        }

        public Criteria andCategorySeoIsNull() {
            addCriterion("category_seo is null");
            return (Criteria) this;
        }

        public Criteria andCategorySeoIsNotNull() {
            addCriterion("category_seo is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySeoEqualTo(String value) {
            addCriterion("category_seo =", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoNotEqualTo(String value) {
            addCriterion("category_seo <>", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoGreaterThan(String value) {
            addCriterion("category_seo >", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoGreaterThanOrEqualTo(String value) {
            addCriterion("category_seo >=", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoLessThan(String value) {
            addCriterion("category_seo <", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoLessThanOrEqualTo(String value) {
            addCriterion("category_seo <=", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoLike(String value) {
            addCriterion("category_seo like", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoNotLike(String value) {
            addCriterion("category_seo not like", value, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoIn(List<String> values) {
            addCriterion("category_seo in", values, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoNotIn(List<String> values) {
            addCriterion("category_seo not in", values, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoBetween(String value1, String value2) {
            addCriterion("category_seo between", value1, value2, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySeoNotBetween(String value1, String value2) {
            addCriterion("category_seo not between", value1, value2, "categorySeo");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderIsNull() {
            addCriterion("category_sort_order is null");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderIsNotNull() {
            addCriterion("category_sort_order is not null");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderEqualTo(Integer value) {
            addCriterion("category_sort_order =", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderNotEqualTo(Integer value) {
            addCriterion("category_sort_order <>", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderGreaterThan(Integer value) {
            addCriterion("category_sort_order >", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_sort_order >=", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderLessThan(Integer value) {
            addCriterion("category_sort_order <", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderLessThanOrEqualTo(Integer value) {
            addCriterion("category_sort_order <=", value, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderIn(List<Integer> values) {
            addCriterion("category_sort_order in", values, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderNotIn(List<Integer> values) {
            addCriterion("category_sort_order not in", values, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderBetween(Integer value1, Integer value2) {
            addCriterion("category_sort_order between", value1, value2, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategorySortOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("category_sort_order not between", value1, value2, "categorySortOrder");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdIsNull() {
            addCriterion("category_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdIsNotNull() {
            addCriterion("category_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdEqualTo(Integer value) {
            addCriterion("category_admin_id =", value, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdNotEqualTo(Integer value) {
            addCriterion("category_admin_id <>", value, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdGreaterThan(Integer value) {
            addCriterion("category_admin_id >", value, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_admin_id >=", value, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdLessThan(Integer value) {
            addCriterion("category_admin_id <", value, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_admin_id <=", value, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdIn(List<Integer> values) {
            addCriterion("category_admin_id in", values, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdNotIn(List<Integer> values) {
            addCriterion("category_admin_id not in", values, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("category_admin_id between", value1, value2, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_admin_id not between", value1, value2, "categoryAdminId");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameIsNull() {
            addCriterion("category_admin_operaterName is null");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameIsNotNull() {
            addCriterion("category_admin_operaterName is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameEqualTo(String value) {
            addCriterion("category_admin_operaterName =", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameNotEqualTo(String value) {
            addCriterion("category_admin_operaterName <>", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameGreaterThan(String value) {
            addCriterion("category_admin_operaterName >", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameGreaterThanOrEqualTo(String value) {
            addCriterion("category_admin_operaterName >=", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameLessThan(String value) {
            addCriterion("category_admin_operaterName <", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameLessThanOrEqualTo(String value) {
            addCriterion("category_admin_operaterName <=", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameLike(String value) {
            addCriterion("category_admin_operaterName like", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameNotLike(String value) {
            addCriterion("category_admin_operaterName not like", value, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameIn(List<String> values) {
            addCriterion("category_admin_operaterName in", values, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameNotIn(List<String> values) {
            addCriterion("category_admin_operaterName not in", values, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameBetween(String value1, String value2) {
            addCriterion("category_admin_operaterName between", value1, value2, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryAdminOperaternameNotBetween(String value1, String value2) {
            addCriterion("category_admin_operaterName not between", value1, value2, "categoryAdminOperatername");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeIsNull() {
            addCriterion("category_createTime is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeIsNotNull() {
            addCriterion("category_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeEqualTo(Date value) {
            addCriterion("category_createTime =", value, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeNotEqualTo(Date value) {
            addCriterion("category_createTime <>", value, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeGreaterThan(Date value) {
            addCriterion("category_createTime >", value, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("category_createTime >=", value, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeLessThan(Date value) {
            addCriterion("category_createTime <", value, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("category_createTime <=", value, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeIn(List<Date> values) {
            addCriterion("category_createTime in", values, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeNotIn(List<Date> values) {
            addCriterion("category_createTime not in", values, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeBetween(Date value1, Date value2) {
            addCriterion("category_createTime between", value1, value2, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("category_createTime not between", value1, value2, "categoryCreatetime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeIsNull() {
            addCriterion("category_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeIsNotNull() {
            addCriterion("category_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeEqualTo(Date value) {
            addCriterion("category_motifyTime =", value, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeNotEqualTo(Date value) {
            addCriterion("category_motifyTime <>", value, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeGreaterThan(Date value) {
            addCriterion("category_motifyTime >", value, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("category_motifyTime >=", value, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeLessThan(Date value) {
            addCriterion("category_motifyTime <", value, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeLessThanOrEqualTo(Date value) {
            addCriterion("category_motifyTime <=", value, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeIn(List<Date> values) {
            addCriterion("category_motifyTime in", values, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeNotIn(List<Date> values) {
            addCriterion("category_motifyTime not in", values, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeBetween(Date value1, Date value2) {
            addCriterion("category_motifyTime between", value1, value2, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryMotifytimeNotBetween(Date value1, Date value2) {
            addCriterion("category_motifyTime not between", value1, value2, "categoryMotifytime");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNull() {
            addCriterion("category_desc is null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIsNotNull() {
            addCriterion("category_desc is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryDescEqualTo(String value) {
            addCriterion("category_desc =", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotEqualTo(String value) {
            addCriterion("category_desc <>", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThan(String value) {
            addCriterion("category_desc >", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescGreaterThanOrEqualTo(String value) {
            addCriterion("category_desc >=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThan(String value) {
            addCriterion("category_desc <", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLessThanOrEqualTo(String value) {
            addCriterion("category_desc <=", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescLike(String value) {
            addCriterion("category_desc like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotLike(String value) {
            addCriterion("category_desc not like", value, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescIn(List<String> values) {
            addCriterion("category_desc in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotIn(List<String> values) {
            addCriterion("category_desc not in", values, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescBetween(String value1, String value2) {
            addCriterion("category_desc between", value1, value2, "categoryDesc");
            return (Criteria) this;
        }

        public Criteria andCategoryDescNotBetween(String value1, String value2) {
            addCriterion("category_desc not between", value1, value2, "categoryDesc");
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