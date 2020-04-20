package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class ImgDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImgDetailExample() {
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

        public Criteria andImgDetailIdIsNull() {
            addCriterion("img_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdIsNotNull() {
            addCriterion("img_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdEqualTo(Integer value) {
            addCriterion("img_detail_id =", value, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdNotEqualTo(Integer value) {
            addCriterion("img_detail_id <>", value, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdGreaterThan(Integer value) {
            addCriterion("img_detail_id >", value, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_detail_id >=", value, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdLessThan(Integer value) {
            addCriterion("img_detail_id <", value, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_detail_id <=", value, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdIn(List<Integer> values) {
            addCriterion("img_detail_id in", values, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdNotIn(List<Integer> values) {
            addCriterion("img_detail_id not in", values, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdBetween(Integer value1, Integer value2) {
            addCriterion("img_detail_id between", value1, value2, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_detail_id not between", value1, value2, "imgDetailId");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameIsNull() {
            addCriterion("img_detail_name is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameIsNotNull() {
            addCriterion("img_detail_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameEqualTo(String value) {
            addCriterion("img_detail_name =", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameNotEqualTo(String value) {
            addCriterion("img_detail_name <>", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameGreaterThan(String value) {
            addCriterion("img_detail_name >", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail_name >=", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameLessThan(String value) {
            addCriterion("img_detail_name <", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameLessThanOrEqualTo(String value) {
            addCriterion("img_detail_name <=", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameLike(String value) {
            addCriterion("img_detail_name like", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameNotLike(String value) {
            addCriterion("img_detail_name not like", value, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameIn(List<String> values) {
            addCriterion("img_detail_name in", values, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameNotIn(List<String> values) {
            addCriterion("img_detail_name not in", values, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameBetween(String value1, String value2) {
            addCriterion("img_detail_name between", value1, value2, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailNameNotBetween(String value1, String value2) {
            addCriterion("img_detail_name not between", value1, value2, "imgDetailName");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlIsNull() {
            addCriterion("img_detail_url is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlIsNotNull() {
            addCriterion("img_detail_url is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlEqualTo(String value) {
            addCriterion("img_detail_url =", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlNotEqualTo(String value) {
            addCriterion("img_detail_url <>", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlGreaterThan(String value) {
            addCriterion("img_detail_url >", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail_url >=", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlLessThan(String value) {
            addCriterion("img_detail_url <", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlLessThanOrEqualTo(String value) {
            addCriterion("img_detail_url <=", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlLike(String value) {
            addCriterion("img_detail_url like", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlNotLike(String value) {
            addCriterion("img_detail_url not like", value, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlIn(List<String> values) {
            addCriterion("img_detail_url in", values, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlNotIn(List<String> values) {
            addCriterion("img_detail_url not in", values, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlBetween(String value1, String value2) {
            addCriterion("img_detail_url between", value1, value2, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailUrlNotBetween(String value1, String value2) {
            addCriterion("img_detail_url not between", value1, value2, "imgDetailUrl");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdIsNull() {
            addCriterion("img_detail_category_id is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdIsNotNull() {
            addCriterion("img_detail_category_id is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdEqualTo(Integer value) {
            addCriterion("img_detail_category_id =", value, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdNotEqualTo(Integer value) {
            addCriterion("img_detail_category_id <>", value, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdGreaterThan(Integer value) {
            addCriterion("img_detail_category_id >", value, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("img_detail_category_id >=", value, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdLessThan(Integer value) {
            addCriterion("img_detail_category_id <", value, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("img_detail_category_id <=", value, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdIn(List<Integer> values) {
            addCriterion("img_detail_category_id in", values, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdNotIn(List<Integer> values) {
            addCriterion("img_detail_category_id not in", values, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("img_detail_category_id between", value1, value2, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("img_detail_category_id not between", value1, value2, "imgDetailCategoryId");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameIsNull() {
            addCriterion("img_detail_category_name is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameIsNotNull() {
            addCriterion("img_detail_category_name is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameEqualTo(String value) {
            addCriterion("img_detail_category_name =", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameNotEqualTo(String value) {
            addCriterion("img_detail_category_name <>", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameGreaterThan(String value) {
            addCriterion("img_detail_category_name >", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail_category_name >=", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameLessThan(String value) {
            addCriterion("img_detail_category_name <", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("img_detail_category_name <=", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameLike(String value) {
            addCriterion("img_detail_category_name like", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameNotLike(String value) {
            addCriterion("img_detail_category_name not like", value, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameIn(List<String> values) {
            addCriterion("img_detail_category_name in", values, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameNotIn(List<String> values) {
            addCriterion("img_detail_category_name not in", values, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameBetween(String value1, String value2) {
            addCriterion("img_detail_category_name between", value1, value2, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCategoryNameNotBetween(String value1, String value2) {
            addCriterion("img_detail_category_name not between", value1, value2, "imgDetailCategoryName");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeIsNull() {
            addCriterion("img_detail_createTime is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeIsNotNull() {
            addCriterion("img_detail_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeEqualTo(String value) {
            addCriterion("img_detail_createTime =", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeNotEqualTo(String value) {
            addCriterion("img_detail_createTime <>", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeGreaterThan(String value) {
            addCriterion("img_detail_createTime >", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail_createTime >=", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeLessThan(String value) {
            addCriterion("img_detail_createTime <", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("img_detail_createTime <=", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeLike(String value) {
            addCriterion("img_detail_createTime like", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeNotLike(String value) {
            addCriterion("img_detail_createTime not like", value, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeIn(List<String> values) {
            addCriterion("img_detail_createTime in", values, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeNotIn(List<String> values) {
            addCriterion("img_detail_createTime not in", values, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeBetween(String value1, String value2) {
            addCriterion("img_detail_createTime between", value1, value2, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailCreatetimeNotBetween(String value1, String value2) {
            addCriterion("img_detail_createTime not between", value1, value2, "imgDetailCreatetime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeIsNull() {
            addCriterion("img_detail_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeIsNotNull() {
            addCriterion("img_detail_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeEqualTo(String value) {
            addCriterion("img_detail_motifyTime =", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeNotEqualTo(String value) {
            addCriterion("img_detail_motifyTime <>", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeGreaterThan(String value) {
            addCriterion("img_detail_motifyTime >", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("img_detail_motifyTime >=", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeLessThan(String value) {
            addCriterion("img_detail_motifyTime <", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("img_detail_motifyTime <=", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeLike(String value) {
            addCriterion("img_detail_motifyTime like", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeNotLike(String value) {
            addCriterion("img_detail_motifyTime not like", value, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeIn(List<String> values) {
            addCriterion("img_detail_motifyTime in", values, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeNotIn(List<String> values) {
            addCriterion("img_detail_motifyTime not in", values, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeBetween(String value1, String value2) {
            addCriterion("img_detail_motifyTime between", value1, value2, "imgDetailMotifytime");
            return (Criteria) this;
        }

        public Criteria andImgDetailMotifytimeNotBetween(String value1, String value2) {
            addCriterion("img_detail_motifyTime not between", value1, value2, "imgDetailMotifytime");
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