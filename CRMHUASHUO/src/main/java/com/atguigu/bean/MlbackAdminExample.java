package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackAdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackAdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameIsNull() {
            addCriterion("admin_accName is null");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameIsNotNull() {
            addCriterion("admin_accName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameEqualTo(String value) {
            addCriterion("admin_accName =", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameNotEqualTo(String value) {
            addCriterion("admin_accName <>", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameGreaterThan(String value) {
            addCriterion("admin_accName >", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_accName >=", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameLessThan(String value) {
            addCriterion("admin_accName <", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameLessThanOrEqualTo(String value) {
            addCriterion("admin_accName <=", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameLike(String value) {
            addCriterion("admin_accName like", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameNotLike(String value) {
            addCriterion("admin_accName not like", value, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameIn(List<String> values) {
            addCriterion("admin_accName in", values, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameNotIn(List<String> values) {
            addCriterion("admin_accName not in", values, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameBetween(String value1, String value2) {
            addCriterion("admin_accName between", value1, value2, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminAccnameNotBetween(String value1, String value2) {
            addCriterion("admin_accName not between", value1, value2, "adminAccname");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameIsNull() {
            addCriterion("admin_operaterName is null");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameIsNotNull() {
            addCriterion("admin_operaterName is not null");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameEqualTo(String value) {
            addCriterion("admin_operaterName =", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameNotEqualTo(String value) {
            addCriterion("admin_operaterName <>", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameGreaterThan(String value) {
            addCriterion("admin_operaterName >", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_operaterName >=", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameLessThan(String value) {
            addCriterion("admin_operaterName <", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameLessThanOrEqualTo(String value) {
            addCriterion("admin_operaterName <=", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameLike(String value) {
            addCriterion("admin_operaterName like", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameNotLike(String value) {
            addCriterion("admin_operaterName not like", value, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameIn(List<String> values) {
            addCriterion("admin_operaterName in", values, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameNotIn(List<String> values) {
            addCriterion("admin_operaterName not in", values, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameBetween(String value1, String value2) {
            addCriterion("admin_operaterName between", value1, value2, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminOperaternameNotBetween(String value1, String value2) {
            addCriterion("admin_operaterName not between", value1, value2, "adminOperatername");
            return (Criteria) this;
        }

        public Criteria andAdminPowerIsNull() {
            addCriterion("admin_power is null");
            return (Criteria) this;
        }

        public Criteria andAdminPowerIsNotNull() {
            addCriterion("admin_power is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPowerEqualTo(Integer value) {
            addCriterion("admin_power =", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerNotEqualTo(Integer value) {
            addCriterion("admin_power <>", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerGreaterThan(Integer value) {
            addCriterion("admin_power >", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_power >=", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerLessThan(Integer value) {
            addCriterion("admin_power <", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerLessThanOrEqualTo(Integer value) {
            addCriterion("admin_power <=", value, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerIn(List<Integer> values) {
            addCriterion("admin_power in", values, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerNotIn(List<Integer> values) {
            addCriterion("admin_power not in", values, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerBetween(Integer value1, Integer value2) {
            addCriterion("admin_power between", value1, value2, "adminPower");
            return (Criteria) this;
        }

        public Criteria andAdminPowerNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_power not between", value1, value2, "adminPower");
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