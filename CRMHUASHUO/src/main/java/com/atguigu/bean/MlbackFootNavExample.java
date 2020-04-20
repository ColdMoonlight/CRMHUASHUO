package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackFootNavExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackFootNavExample() {
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

        public Criteria andFootnavIdIsNull() {
            addCriterion("footnav_id is null");
            return (Criteria) this;
        }

        public Criteria andFootnavIdIsNotNull() {
            addCriterion("footnav_id is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavIdEqualTo(Integer value) {
            addCriterion("footnav_id =", value, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdNotEqualTo(Integer value) {
            addCriterion("footnav_id <>", value, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdGreaterThan(Integer value) {
            addCriterion("footnav_id >", value, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("footnav_id >=", value, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdLessThan(Integer value) {
            addCriterion("footnav_id <", value, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdLessThanOrEqualTo(Integer value) {
            addCriterion("footnav_id <=", value, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdIn(List<Integer> values) {
            addCriterion("footnav_id in", values, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdNotIn(List<Integer> values) {
            addCriterion("footnav_id not in", values, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdBetween(Integer value1, Integer value2) {
            addCriterion("footnav_id between", value1, value2, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavIdNotBetween(Integer value1, Integer value2) {
            addCriterion("footnav_id not between", value1, value2, "footnavId");
            return (Criteria) this;
        }

        public Criteria andFootnavNameIsNull() {
            addCriterion("footnav_name is null");
            return (Criteria) this;
        }

        public Criteria andFootnavNameIsNotNull() {
            addCriterion("footnav_name is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavNameEqualTo(String value) {
            addCriterion("footnav_name =", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameNotEqualTo(String value) {
            addCriterion("footnav_name <>", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameGreaterThan(String value) {
            addCriterion("footnav_name >", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameGreaterThanOrEqualTo(String value) {
            addCriterion("footnav_name >=", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameLessThan(String value) {
            addCriterion("footnav_name <", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameLessThanOrEqualTo(String value) {
            addCriterion("footnav_name <=", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameLike(String value) {
            addCriterion("footnav_name like", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameNotLike(String value) {
            addCriterion("footnav_name not like", value, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameIn(List<String> values) {
            addCriterion("footnav_name in", values, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameNotIn(List<String> values) {
            addCriterion("footnav_name not in", values, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameBetween(String value1, String value2) {
            addCriterion("footnav_name between", value1, value2, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavNameNotBetween(String value1, String value2) {
            addCriterion("footnav_name not between", value1, value2, "footnavName");
            return (Criteria) this;
        }

        public Criteria andFootnavHangIsNull() {
            addCriterion("footnav_hang is null");
            return (Criteria) this;
        }

        public Criteria andFootnavHangIsNotNull() {
            addCriterion("footnav_hang is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavHangEqualTo(Integer value) {
            addCriterion("footnav_hang =", value, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangNotEqualTo(Integer value) {
            addCriterion("footnav_hang <>", value, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangGreaterThan(Integer value) {
            addCriterion("footnav_hang >", value, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangGreaterThanOrEqualTo(Integer value) {
            addCriterion("footnav_hang >=", value, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangLessThan(Integer value) {
            addCriterion("footnav_hang <", value, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangLessThanOrEqualTo(Integer value) {
            addCriterion("footnav_hang <=", value, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangIn(List<Integer> values) {
            addCriterion("footnav_hang in", values, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangNotIn(List<Integer> values) {
            addCriterion("footnav_hang not in", values, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangBetween(Integer value1, Integer value2) {
            addCriterion("footnav_hang between", value1, value2, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavHangNotBetween(Integer value1, Integer value2) {
            addCriterion("footnav_hang not between", value1, value2, "footnavHang");
            return (Criteria) this;
        }

        public Criteria andFootnavLieIsNull() {
            addCriterion("footnav_lie is null");
            return (Criteria) this;
        }

        public Criteria andFootnavLieIsNotNull() {
            addCriterion("footnav_lie is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavLieEqualTo(Integer value) {
            addCriterion("footnav_lie =", value, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieNotEqualTo(Integer value) {
            addCriterion("footnav_lie <>", value, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieGreaterThan(Integer value) {
            addCriterion("footnav_lie >", value, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieGreaterThanOrEqualTo(Integer value) {
            addCriterion("footnav_lie >=", value, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieLessThan(Integer value) {
            addCriterion("footnav_lie <", value, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieLessThanOrEqualTo(Integer value) {
            addCriterion("footnav_lie <=", value, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieIn(List<Integer> values) {
            addCriterion("footnav_lie in", values, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieNotIn(List<Integer> values) {
            addCriterion("footnav_lie not in", values, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieBetween(Integer value1, Integer value2) {
            addCriterion("footnav_lie between", value1, value2, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavLieNotBetween(Integer value1, Integer value2) {
            addCriterion("footnav_lie not between", value1, value2, "footnavLie");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdIsNull() {
            addCriterion("footnav_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdIsNotNull() {
            addCriterion("footnav_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdEqualTo(Integer value) {
            addCriterion("footnav_admin_id =", value, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdNotEqualTo(Integer value) {
            addCriterion("footnav_admin_id <>", value, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdGreaterThan(Integer value) {
            addCriterion("footnav_admin_id >", value, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("footnav_admin_id >=", value, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdLessThan(Integer value) {
            addCriterion("footnav_admin_id <", value, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("footnav_admin_id <=", value, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdIn(List<Integer> values) {
            addCriterion("footnav_admin_id in", values, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdNotIn(List<Integer> values) {
            addCriterion("footnav_admin_id not in", values, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("footnav_admin_id between", value1, value2, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("footnav_admin_id not between", value1, value2, "footnavAdminId");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameIsNull() {
            addCriterion("footnav_admin_operatorName is null");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameIsNotNull() {
            addCriterion("footnav_admin_operatorName is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameEqualTo(String value) {
            addCriterion("footnav_admin_operatorName =", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameNotEqualTo(String value) {
            addCriterion("footnav_admin_operatorName <>", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameGreaterThan(String value) {
            addCriterion("footnav_admin_operatorName >", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameGreaterThanOrEqualTo(String value) {
            addCriterion("footnav_admin_operatorName >=", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameLessThan(String value) {
            addCriterion("footnav_admin_operatorName <", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameLessThanOrEqualTo(String value) {
            addCriterion("footnav_admin_operatorName <=", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameLike(String value) {
            addCriterion("footnav_admin_operatorName like", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameNotLike(String value) {
            addCriterion("footnav_admin_operatorName not like", value, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameIn(List<String> values) {
            addCriterion("footnav_admin_operatorName in", values, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameNotIn(List<String> values) {
            addCriterion("footnav_admin_operatorName not in", values, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameBetween(String value1, String value2) {
            addCriterion("footnav_admin_operatorName between", value1, value2, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavAdminOperatornameNotBetween(String value1, String value2) {
            addCriterion("footnav_admin_operatorName not between", value1, value2, "footnavAdminOperatorname");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeIsNull() {
            addCriterion("footnav_createTime is null");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeIsNotNull() {
            addCriterion("footnav_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeEqualTo(String value) {
            addCriterion("footnav_createTime =", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeNotEqualTo(String value) {
            addCriterion("footnav_createTime <>", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeGreaterThan(String value) {
            addCriterion("footnav_createTime >", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("footnav_createTime >=", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeLessThan(String value) {
            addCriterion("footnav_createTime <", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("footnav_createTime <=", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeLike(String value) {
            addCriterion("footnav_createTime like", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeNotLike(String value) {
            addCriterion("footnav_createTime not like", value, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeIn(List<String> values) {
            addCriterion("footnav_createTime in", values, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeNotIn(List<String> values) {
            addCriterion("footnav_createTime not in", values, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeBetween(String value1, String value2) {
            addCriterion("footnav_createTime between", value1, value2, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavCreatetimeNotBetween(String value1, String value2) {
            addCriterion("footnav_createTime not between", value1, value2, "footnavCreatetime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeIsNull() {
            addCriterion("footnav_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeIsNotNull() {
            addCriterion("footnav_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeEqualTo(String value) {
            addCriterion("footnav_motifyTime =", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeNotEqualTo(String value) {
            addCriterion("footnav_motifyTime <>", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeGreaterThan(String value) {
            addCriterion("footnav_motifyTime >", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("footnav_motifyTime >=", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeLessThan(String value) {
            addCriterion("footnav_motifyTime <", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("footnav_motifyTime <=", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeLike(String value) {
            addCriterion("footnav_motifyTime like", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeNotLike(String value) {
            addCriterion("footnav_motifyTime not like", value, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeIn(List<String> values) {
            addCriterion("footnav_motifyTime in", values, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeNotIn(List<String> values) {
            addCriterion("footnav_motifyTime not in", values, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeBetween(String value1, String value2) {
            addCriterion("footnav_motifyTime between", value1, value2, "footnavMotifytime");
            return (Criteria) this;
        }

        public Criteria andFootnavMotifytimeNotBetween(String value1, String value2) {
            addCriterion("footnav_motifyTime not between", value1, value2, "footnavMotifytime");
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