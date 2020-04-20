package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackShipEmailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackShipEmailExample() {
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

        public Criteria andShipemailIdIsNull() {
            addCriterion("shipEmail_id is null");
            return (Criteria) this;
        }

        public Criteria andShipemailIdIsNotNull() {
            addCriterion("shipEmail_id is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailIdEqualTo(Integer value) {
            addCriterion("shipEmail_id =", value, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdNotEqualTo(Integer value) {
            addCriterion("shipEmail_id <>", value, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdGreaterThan(Integer value) {
            addCriterion("shipEmail_id >", value, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipEmail_id >=", value, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdLessThan(Integer value) {
            addCriterion("shipEmail_id <", value, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipEmail_id <=", value, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdIn(List<Integer> values) {
            addCriterion("shipEmail_id in", values, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdNotIn(List<Integer> values) {
            addCriterion("shipEmail_id not in", values, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdBetween(Integer value1, Integer value2) {
            addCriterion("shipEmail_id between", value1, value2, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipEmail_id not between", value1, value2, "shipemailId");
            return (Criteria) this;
        }

        public Criteria andShipemailNameIsNull() {
            addCriterion("shipEmail_name is null");
            return (Criteria) this;
        }

        public Criteria andShipemailNameIsNotNull() {
            addCriterion("shipEmail_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailNameEqualTo(String value) {
            addCriterion("shipEmail_name =", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameNotEqualTo(String value) {
            addCriterion("shipEmail_name <>", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameGreaterThan(String value) {
            addCriterion("shipEmail_name >", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_name >=", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameLessThan(String value) {
            addCriterion("shipEmail_name <", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_name <=", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameLike(String value) {
            addCriterion("shipEmail_name like", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameNotLike(String value) {
            addCriterion("shipEmail_name not like", value, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameIn(List<String> values) {
            addCriterion("shipEmail_name in", values, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameNotIn(List<String> values) {
            addCriterion("shipEmail_name not in", values, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameBetween(String value1, String value2) {
            addCriterion("shipEmail_name between", value1, value2, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNameNotBetween(String value1, String value2) {
            addCriterion("shipEmail_name not between", value1, value2, "shipemailName");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethIsNull() {
            addCriterion("shipEmail_nameth is null");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethIsNotNull() {
            addCriterion("shipEmail_nameth is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethEqualTo(Integer value) {
            addCriterion("shipEmail_nameth =", value, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethNotEqualTo(Integer value) {
            addCriterion("shipEmail_nameth <>", value, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethGreaterThan(Integer value) {
            addCriterion("shipEmail_nameth >", value, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipEmail_nameth >=", value, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethLessThan(Integer value) {
            addCriterion("shipEmail_nameth <", value, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethLessThanOrEqualTo(Integer value) {
            addCriterion("shipEmail_nameth <=", value, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethIn(List<Integer> values) {
            addCriterion("shipEmail_nameth in", values, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethNotIn(List<Integer> values) {
            addCriterion("shipEmail_nameth not in", values, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethBetween(Integer value1, Integer value2) {
            addCriterion("shipEmail_nameth between", value1, value2, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailNamethNotBetween(Integer value1, Integer value2) {
            addCriterion("shipEmail_nameth not between", value1, value2, "shipemailNameth");
            return (Criteria) this;
        }

        public Criteria andShipemailDayIsNull() {
            addCriterion("shipEmail_day is null");
            return (Criteria) this;
        }

        public Criteria andShipemailDayIsNotNull() {
            addCriterion("shipEmail_day is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailDayEqualTo(String value) {
            addCriterion("shipEmail_day =", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayNotEqualTo(String value) {
            addCriterion("shipEmail_day <>", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayGreaterThan(String value) {
            addCriterion("shipEmail_day >", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_day >=", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayLessThan(String value) {
            addCriterion("shipEmail_day <", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_day <=", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayLike(String value) {
            addCriterion("shipEmail_day like", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayNotLike(String value) {
            addCriterion("shipEmail_day not like", value, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayIn(List<String> values) {
            addCriterion("shipEmail_day in", values, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayNotIn(List<String> values) {
            addCriterion("shipEmail_day not in", values, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayBetween(String value1, String value2) {
            addCriterion("shipEmail_day between", value1, value2, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailDayNotBetween(String value1, String value2) {
            addCriterion("shipEmail_day not between", value1, value2, "shipemailDay");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkIsNull() {
            addCriterion("shipEmail_wwwlink is null");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkIsNotNull() {
            addCriterion("shipEmail_wwwlink is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkEqualTo(String value) {
            addCriterion("shipEmail_wwwlink =", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkNotEqualTo(String value) {
            addCriterion("shipEmail_wwwlink <>", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkGreaterThan(String value) {
            addCriterion("shipEmail_wwwlink >", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_wwwlink >=", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkLessThan(String value) {
            addCriterion("shipEmail_wwwlink <", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_wwwlink <=", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkLike(String value) {
            addCriterion("shipEmail_wwwlink like", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkNotLike(String value) {
            addCriterion("shipEmail_wwwlink not like", value, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkIn(List<String> values) {
            addCriterion("shipEmail_wwwlink in", values, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkNotIn(List<String> values) {
            addCriterion("shipEmail_wwwlink not in", values, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkBetween(String value1, String value2) {
            addCriterion("shipEmail_wwwlink between", value1, value2, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailWwwlinkNotBetween(String value1, String value2) {
            addCriterion("shipEmail_wwwlink not between", value1, value2, "shipemailWwwlink");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamIsNull() {
            addCriterion("shipEmail_team is null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamIsNotNull() {
            addCriterion("shipEmail_team is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamEqualTo(String value) {
            addCriterion("shipEmail_team =", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamNotEqualTo(String value) {
            addCriterion("shipEmail_team <>", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamGreaterThan(String value) {
            addCriterion("shipEmail_team >", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_team >=", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamLessThan(String value) {
            addCriterion("shipEmail_team <", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_team <=", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamLike(String value) {
            addCriterion("shipEmail_team like", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamNotLike(String value) {
            addCriterion("shipEmail_team not like", value, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamIn(List<String> values) {
            addCriterion("shipEmail_team in", values, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamNotIn(List<String> values) {
            addCriterion("shipEmail_team not in", values, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamBetween(String value1, String value2) {
            addCriterion("shipEmail_team between", value1, value2, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamNotBetween(String value1, String value2) {
            addCriterion("shipEmail_team not between", value1, value2, "shipemailTeam");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailIsNull() {
            addCriterion("shipEmail_teamEmail is null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailIsNotNull() {
            addCriterion("shipEmail_teamEmail is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailEqualTo(String value) {
            addCriterion("shipEmail_teamEmail =", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailNotEqualTo(String value) {
            addCriterion("shipEmail_teamEmail <>", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailGreaterThan(String value) {
            addCriterion("shipEmail_teamEmail >", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_teamEmail >=", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailLessThan(String value) {
            addCriterion("shipEmail_teamEmail <", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_teamEmail <=", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailLike(String value) {
            addCriterion("shipEmail_teamEmail like", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailNotLike(String value) {
            addCriterion("shipEmail_teamEmail not like", value, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailIn(List<String> values) {
            addCriterion("shipEmail_teamEmail in", values, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailNotIn(List<String> values) {
            addCriterion("shipEmail_teamEmail not in", values, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailBetween(String value1, String value2) {
            addCriterion("shipEmail_teamEmail between", value1, value2, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamemailNotBetween(String value1, String value2) {
            addCriterion("shipEmail_teamEmail not between", value1, value2, "shipemailTeamemail");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappIsNull() {
            addCriterion("shipEmail_teamWhatsapp is null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappIsNotNull() {
            addCriterion("shipEmail_teamWhatsapp is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappEqualTo(String value) {
            addCriterion("shipEmail_teamWhatsapp =", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappNotEqualTo(String value) {
            addCriterion("shipEmail_teamWhatsapp <>", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappGreaterThan(String value) {
            addCriterion("shipEmail_teamWhatsapp >", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_teamWhatsapp >=", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappLessThan(String value) {
            addCriterion("shipEmail_teamWhatsapp <", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_teamWhatsapp <=", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappLike(String value) {
            addCriterion("shipEmail_teamWhatsapp like", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappNotLike(String value) {
            addCriterion("shipEmail_teamWhatsapp not like", value, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappIn(List<String> values) {
            addCriterion("shipEmail_teamWhatsapp in", values, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappNotIn(List<String> values) {
            addCriterion("shipEmail_teamWhatsapp not in", values, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappBetween(String value1, String value2) {
            addCriterion("shipEmail_teamWhatsapp between", value1, value2, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamwhatsappNotBetween(String value1, String value2) {
            addCriterion("shipEmail_teamWhatsapp not between", value1, value2, "shipemailTeamwhatsapp");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneIsNull() {
            addCriterion("shipEmail_teamTelphone is null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneIsNotNull() {
            addCriterion("shipEmail_teamTelphone is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneEqualTo(String value) {
            addCriterion("shipEmail_teamTelphone =", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneNotEqualTo(String value) {
            addCriterion("shipEmail_teamTelphone <>", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneGreaterThan(String value) {
            addCriterion("shipEmail_teamTelphone >", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_teamTelphone >=", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneLessThan(String value) {
            addCriterion("shipEmail_teamTelphone <", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_teamTelphone <=", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneLike(String value) {
            addCriterion("shipEmail_teamTelphone like", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneNotLike(String value) {
            addCriterion("shipEmail_teamTelphone not like", value, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneIn(List<String> values) {
            addCriterion("shipEmail_teamTelphone in", values, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneNotIn(List<String> values) {
            addCriterion("shipEmail_teamTelphone not in", values, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneBetween(String value1, String value2) {
            addCriterion("shipEmail_teamTelphone between", value1, value2, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailTeamtelphoneNotBetween(String value1, String value2) {
            addCriterion("shipEmail_teamTelphone not between", value1, value2, "shipemailTeamtelphone");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeIsNull() {
            addCriterion("shipEmail_createTime is null");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeIsNotNull() {
            addCriterion("shipEmail_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeEqualTo(String value) {
            addCriterion("shipEmail_createTime =", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeNotEqualTo(String value) {
            addCriterion("shipEmail_createTime <>", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeGreaterThan(String value) {
            addCriterion("shipEmail_createTime >", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_createTime >=", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeLessThan(String value) {
            addCriterion("shipEmail_createTime <", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_createTime <=", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeLike(String value) {
            addCriterion("shipEmail_createTime like", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeNotLike(String value) {
            addCriterion("shipEmail_createTime not like", value, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeIn(List<String> values) {
            addCriterion("shipEmail_createTime in", values, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeNotIn(List<String> values) {
            addCriterion("shipEmail_createTime not in", values, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeBetween(String value1, String value2) {
            addCriterion("shipEmail_createTime between", value1, value2, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailCreatetimeNotBetween(String value1, String value2) {
            addCriterion("shipEmail_createTime not between", value1, value2, "shipemailCreatetime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeIsNull() {
            addCriterion("shipEmail_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeIsNotNull() {
            addCriterion("shipEmail_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeEqualTo(String value) {
            addCriterion("shipEmail_motifyTime =", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeNotEqualTo(String value) {
            addCriterion("shipEmail_motifyTime <>", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeGreaterThan(String value) {
            addCriterion("shipEmail_motifyTime >", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("shipEmail_motifyTime >=", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeLessThan(String value) {
            addCriterion("shipEmail_motifyTime <", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("shipEmail_motifyTime <=", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeLike(String value) {
            addCriterion("shipEmail_motifyTime like", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeNotLike(String value) {
            addCriterion("shipEmail_motifyTime not like", value, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeIn(List<String> values) {
            addCriterion("shipEmail_motifyTime in", values, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeNotIn(List<String> values) {
            addCriterion("shipEmail_motifyTime not in", values, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeBetween(String value1, String value2) {
            addCriterion("shipEmail_motifyTime between", value1, value2, "shipemailMotifytime");
            return (Criteria) this;
        }

        public Criteria andShipemailMotifytimeNotBetween(String value1, String value2) {
            addCriterion("shipEmail_motifyTime not between", value1, value2, "shipemailMotifytime");
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