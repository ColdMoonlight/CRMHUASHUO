package com.atguigu.bean;

import java.util.ArrayList;
import java.util.List;

public class MlbackVideoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MlbackVideoExample() {
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

        public Criteria andVideoIdIsNull() {
            addCriterion("video_id is null");
            return (Criteria) this;
        }

        public Criteria andVideoIdIsNotNull() {
            addCriterion("video_id is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIdEqualTo(Integer value) {
            addCriterion("video_id =", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotEqualTo(Integer value) {
            addCriterion("video_id <>", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThan(Integer value) {
            addCriterion("video_id >", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_id >=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThan(Integer value) {
            addCriterion("video_id <", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdLessThanOrEqualTo(Integer value) {
            addCriterion("video_id <=", value, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdIn(List<Integer> values) {
            addCriterion("video_id in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotIn(List<Integer> values) {
            addCriterion("video_id not in", values, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdBetween(Integer value1, Integer value2) {
            addCriterion("video_id between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("video_id not between", value1, value2, "videoId");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNull() {
            addCriterion("video_name is null");
            return (Criteria) this;
        }

        public Criteria andVideoNameIsNotNull() {
            addCriterion("video_name is not null");
            return (Criteria) this;
        }

        public Criteria andVideoNameEqualTo(String value) {
            addCriterion("video_name =", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotEqualTo(String value) {
            addCriterion("video_name <>", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThan(String value) {
            addCriterion("video_name >", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameGreaterThanOrEqualTo(String value) {
            addCriterion("video_name >=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThan(String value) {
            addCriterion("video_name <", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLessThanOrEqualTo(String value) {
            addCriterion("video_name <=", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameLike(String value) {
            addCriterion("video_name like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotLike(String value) {
            addCriterion("video_name not like", value, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameIn(List<String> values) {
            addCriterion("video_name in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotIn(List<String> values) {
            addCriterion("video_name not in", values, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameBetween(String value1, String value2) {
            addCriterion("video_name between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoNameNotBetween(String value1, String value2) {
            addCriterion("video_name not between", value1, value2, "videoName");
            return (Criteria) this;
        }

        public Criteria andVideoAreaIsNull() {
            addCriterion("video_area is null");
            return (Criteria) this;
        }

        public Criteria andVideoAreaIsNotNull() {
            addCriterion("video_area is not null");
            return (Criteria) this;
        }

        public Criteria andVideoAreaEqualTo(Integer value) {
            addCriterion("video_area =", value, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaNotEqualTo(Integer value) {
            addCriterion("video_area <>", value, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaGreaterThan(Integer value) {
            addCriterion("video_area >", value, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_area >=", value, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaLessThan(Integer value) {
            addCriterion("video_area <", value, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaLessThanOrEqualTo(Integer value) {
            addCriterion("video_area <=", value, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaIn(List<Integer> values) {
            addCriterion("video_area in", values, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaNotIn(List<Integer> values) {
            addCriterion("video_area not in", values, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaBetween(Integer value1, Integer value2) {
            addCriterion("video_area between", value1, value2, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoAreaNotBetween(Integer value1, Integer value2) {
            addCriterion("video_area not between", value1, value2, "videoArea");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumIsNull() {
            addCriterion("video_orderth_num is null");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumIsNotNull() {
            addCriterion("video_orderth_num is not null");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumEqualTo(Integer value) {
            addCriterion("video_orderth_num =", value, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumNotEqualTo(Integer value) {
            addCriterion("video_orderth_num <>", value, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumGreaterThan(Integer value) {
            addCriterion("video_orderth_num >", value, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_orderth_num >=", value, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumLessThan(Integer value) {
            addCriterion("video_orderth_num <", value, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumLessThanOrEqualTo(Integer value) {
            addCriterion("video_orderth_num <=", value, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumIn(List<Integer> values) {
            addCriterion("video_orderth_num in", values, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumNotIn(List<Integer> values) {
            addCriterion("video_orderth_num not in", values, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumBetween(Integer value1, Integer value2) {
            addCriterion("video_orderth_num between", value1, value2, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoOrderthNumNotBetween(Integer value1, Integer value2) {
            addCriterion("video_orderth_num not between", value1, value2, "videoOrderthNum");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusIsNull() {
            addCriterion("video_wapstatus is null");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusIsNotNull() {
            addCriterion("video_wapstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusEqualTo(Integer value) {
            addCriterion("video_wapstatus =", value, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusNotEqualTo(Integer value) {
            addCriterion("video_wapstatus <>", value, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusGreaterThan(Integer value) {
            addCriterion("video_wapstatus >", value, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_wapstatus >=", value, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusLessThan(Integer value) {
            addCriterion("video_wapstatus <", value, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusLessThanOrEqualTo(Integer value) {
            addCriterion("video_wapstatus <=", value, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusIn(List<Integer> values) {
            addCriterion("video_wapstatus in", values, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusNotIn(List<Integer> values) {
            addCriterion("video_wapstatus not in", values, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusBetween(Integer value1, Integer value2) {
            addCriterion("video_wapstatus between", value1, value2, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("video_wapstatus not between", value1, value2, "videoWapstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusIsNull() {
            addCriterion("video_pcstatus is null");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusIsNotNull() {
            addCriterion("video_pcstatus is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusEqualTo(Integer value) {
            addCriterion("video_pcstatus =", value, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusNotEqualTo(Integer value) {
            addCriterion("video_pcstatus <>", value, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusGreaterThan(Integer value) {
            addCriterion("video_pcstatus >", value, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_pcstatus >=", value, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusLessThan(Integer value) {
            addCriterion("video_pcstatus <", value, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusLessThanOrEqualTo(Integer value) {
            addCriterion("video_pcstatus <=", value, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusIn(List<Integer> values) {
            addCriterion("video_pcstatus in", values, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusNotIn(List<Integer> values) {
            addCriterion("video_pcstatus not in", values, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusBetween(Integer value1, Integer value2) {
            addCriterion("video_pcstatus between", value1, value2, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoPcstatusNotBetween(Integer value1, Integer value2) {
            addCriterion("video_pcstatus not between", value1, value2, "videoPcstatus");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlIsNull() {
            addCriterion("video_wapVideourl is null");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlIsNotNull() {
            addCriterion("video_wapVideourl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlEqualTo(String value) {
            addCriterion("video_wapVideourl =", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlNotEqualTo(String value) {
            addCriterion("video_wapVideourl <>", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlGreaterThan(String value) {
            addCriterion("video_wapVideourl >", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlGreaterThanOrEqualTo(String value) {
            addCriterion("video_wapVideourl >=", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlLessThan(String value) {
            addCriterion("video_wapVideourl <", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlLessThanOrEqualTo(String value) {
            addCriterion("video_wapVideourl <=", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlLike(String value) {
            addCriterion("video_wapVideourl like", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlNotLike(String value) {
            addCriterion("video_wapVideourl not like", value, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlIn(List<String> values) {
            addCriterion("video_wapVideourl in", values, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlNotIn(List<String> values) {
            addCriterion("video_wapVideourl not in", values, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlBetween(String value1, String value2) {
            addCriterion("video_wapVideourl between", value1, value2, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoWapvideourlNotBetween(String value1, String value2) {
            addCriterion("video_wapVideourl not between", value1, value2, "videoWapvideourl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlIsNull() {
            addCriterion("video_pcVideurl is null");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlIsNotNull() {
            addCriterion("video_pcVideurl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlEqualTo(String value) {
            addCriterion("video_pcVideurl =", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlNotEqualTo(String value) {
            addCriterion("video_pcVideurl <>", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlGreaterThan(String value) {
            addCriterion("video_pcVideurl >", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlGreaterThanOrEqualTo(String value) {
            addCriterion("video_pcVideurl >=", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlLessThan(String value) {
            addCriterion("video_pcVideurl <", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlLessThanOrEqualTo(String value) {
            addCriterion("video_pcVideurl <=", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlLike(String value) {
            addCriterion("video_pcVideurl like", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlNotLike(String value) {
            addCriterion("video_pcVideurl not like", value, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlIn(List<String> values) {
            addCriterion("video_pcVideurl in", values, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlNotIn(List<String> values) {
            addCriterion("video_pcVideurl not in", values, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlBetween(String value1, String value2) {
            addCriterion("video_pcVideurl between", value1, value2, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoPcvideurlNotBetween(String value1, String value2) {
            addCriterion("video_pcVideurl not between", value1, value2, "videoPcvideurl");
            return (Criteria) this;
        }

        public Criteria andVideoProidIsNull() {
            addCriterion("video_proid is null");
            return (Criteria) this;
        }

        public Criteria andVideoProidIsNotNull() {
            addCriterion("video_proid is not null");
            return (Criteria) this;
        }

        public Criteria andVideoProidEqualTo(Integer value) {
            addCriterion("video_proid =", value, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidNotEqualTo(Integer value) {
            addCriterion("video_proid <>", value, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidGreaterThan(Integer value) {
            addCriterion("video_proid >", value, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_proid >=", value, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidLessThan(Integer value) {
            addCriterion("video_proid <", value, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidLessThanOrEqualTo(Integer value) {
            addCriterion("video_proid <=", value, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidIn(List<Integer> values) {
            addCriterion("video_proid in", values, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidNotIn(List<Integer> values) {
            addCriterion("video_proid not in", values, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidBetween(Integer value1, Integer value2) {
            addCriterion("video_proid between", value1, value2, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoProidNotBetween(Integer value1, Integer value2) {
            addCriterion("video_proid not between", value1, value2, "videoProid");
            return (Criteria) this;
        }

        public Criteria andVideoPronameIsNull() {
            addCriterion("video_proname is null");
            return (Criteria) this;
        }

        public Criteria andVideoPronameIsNotNull() {
            addCriterion("video_proname is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPronameEqualTo(String value) {
            addCriterion("video_proname =", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameNotEqualTo(String value) {
            addCriterion("video_proname <>", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameGreaterThan(String value) {
            addCriterion("video_proname >", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameGreaterThanOrEqualTo(String value) {
            addCriterion("video_proname >=", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameLessThan(String value) {
            addCriterion("video_proname <", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameLessThanOrEqualTo(String value) {
            addCriterion("video_proname <=", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameLike(String value) {
            addCriterion("video_proname like", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameNotLike(String value) {
            addCriterion("video_proname not like", value, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameIn(List<String> values) {
            addCriterion("video_proname in", values, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameNotIn(List<String> values) {
            addCriterion("video_proname not in", values, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameBetween(String value1, String value2) {
            addCriterion("video_proname between", value1, value2, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoPronameNotBetween(String value1, String value2) {
            addCriterion("video_proname not between", value1, value2, "videoProname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameIsNull() {
            addCriterion("video_seoname is null");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameIsNotNull() {
            addCriterion("video_seoname is not null");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameEqualTo(String value) {
            addCriterion("video_seoname =", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameNotEqualTo(String value) {
            addCriterion("video_seoname <>", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameGreaterThan(String value) {
            addCriterion("video_seoname >", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameGreaterThanOrEqualTo(String value) {
            addCriterion("video_seoname >=", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameLessThan(String value) {
            addCriterion("video_seoname <", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameLessThanOrEqualTo(String value) {
            addCriterion("video_seoname <=", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameLike(String value) {
            addCriterion("video_seoname like", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameNotLike(String value) {
            addCriterion("video_seoname not like", value, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameIn(List<String> values) {
            addCriterion("video_seoname in", values, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameNotIn(List<String> values) {
            addCriterion("video_seoname not in", values, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameBetween(String value1, String value2) {
            addCriterion("video_seoname between", value1, value2, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoSeonameNotBetween(String value1, String value2) {
            addCriterion("video_seoname not between", value1, value2, "videoSeoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateidIsNull() {
            addCriterion("video_cateid is null");
            return (Criteria) this;
        }

        public Criteria andVideoCateidIsNotNull() {
            addCriterion("video_cateid is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCateidEqualTo(Integer value) {
            addCriterion("video_cateid =", value, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidNotEqualTo(Integer value) {
            addCriterion("video_cateid <>", value, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidGreaterThan(Integer value) {
            addCriterion("video_cateid >", value, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_cateid >=", value, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidLessThan(Integer value) {
            addCriterion("video_cateid <", value, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidLessThanOrEqualTo(Integer value) {
            addCriterion("video_cateid <=", value, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidIn(List<Integer> values) {
            addCriterion("video_cateid in", values, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidNotIn(List<Integer> values) {
            addCriterion("video_cateid not in", values, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidBetween(Integer value1, Integer value2) {
            addCriterion("video_cateid between", value1, value2, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCateidNotBetween(Integer value1, Integer value2) {
            addCriterion("video_cateid not between", value1, value2, "videoCateid");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameIsNull() {
            addCriterion("video_catename is null");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameIsNotNull() {
            addCriterion("video_catename is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameEqualTo(String value) {
            addCriterion("video_catename =", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameNotEqualTo(String value) {
            addCriterion("video_catename <>", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameGreaterThan(String value) {
            addCriterion("video_catename >", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameGreaterThanOrEqualTo(String value) {
            addCriterion("video_catename >=", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameLessThan(String value) {
            addCriterion("video_catename <", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameLessThanOrEqualTo(String value) {
            addCriterion("video_catename <=", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameLike(String value) {
            addCriterion("video_catename like", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameNotLike(String value) {
            addCriterion("video_catename not like", value, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameIn(List<String> values) {
            addCriterion("video_catename in", values, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameNotIn(List<String> values) {
            addCriterion("video_catename not in", values, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameBetween(String value1, String value2) {
            addCriterion("video_catename between", value1, value2, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCatenameNotBetween(String value1, String value2) {
            addCriterion("video_catename not between", value1, value2, "videoCatename");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameIsNull() {
            addCriterion("video_cateSeoname is null");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameIsNotNull() {
            addCriterion("video_cateSeoname is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameEqualTo(String value) {
            addCriterion("video_cateSeoname =", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameNotEqualTo(String value) {
            addCriterion("video_cateSeoname <>", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameGreaterThan(String value) {
            addCriterion("video_cateSeoname >", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameGreaterThanOrEqualTo(String value) {
            addCriterion("video_cateSeoname >=", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameLessThan(String value) {
            addCriterion("video_cateSeoname <", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameLessThanOrEqualTo(String value) {
            addCriterion("video_cateSeoname <=", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameLike(String value) {
            addCriterion("video_cateSeoname like", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameNotLike(String value) {
            addCriterion("video_cateSeoname not like", value, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameIn(List<String> values) {
            addCriterion("video_cateSeoname in", values, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameNotIn(List<String> values) {
            addCriterion("video_cateSeoname not in", values, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameBetween(String value1, String value2) {
            addCriterion("video_cateSeoname between", value1, value2, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoCateseonameNotBetween(String value1, String value2) {
            addCriterion("video_cateSeoname not between", value1, value2, "videoCateseoname");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageIsNull() {
            addCriterion("video_ifproORcateORpage is null");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageIsNotNull() {
            addCriterion("video_ifproORcateORpage is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageEqualTo(Integer value) {
            addCriterion("video_ifproORcateORpage =", value, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageNotEqualTo(Integer value) {
            addCriterion("video_ifproORcateORpage <>", value, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageGreaterThan(Integer value) {
            addCriterion("video_ifproORcateORpage >", value, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_ifproORcateORpage >=", value, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageLessThan(Integer value) {
            addCriterion("video_ifproORcateORpage <", value, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageLessThanOrEqualTo(Integer value) {
            addCriterion("video_ifproORcateORpage <=", value, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageIn(List<Integer> values) {
            addCriterion("video_ifproORcateORpage in", values, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageNotIn(List<Integer> values) {
            addCriterion("video_ifproORcateORpage not in", values, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageBetween(Integer value1, Integer value2) {
            addCriterion("video_ifproORcateORpage between", value1, value2, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoIfproorcateorpageNotBetween(Integer value1, Integer value2) {
            addCriterion("video_ifproORcateORpage not between", value1, value2, "videoIfproorcateorpage");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameIsNull() {
            addCriterion("video_pagename is null");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameIsNotNull() {
            addCriterion("video_pagename is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameEqualTo(String value) {
            addCriterion("video_pagename =", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameNotEqualTo(String value) {
            addCriterion("video_pagename <>", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameGreaterThan(String value) {
            addCriterion("video_pagename >", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameGreaterThanOrEqualTo(String value) {
            addCriterion("video_pagename >=", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameLessThan(String value) {
            addCriterion("video_pagename <", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameLessThanOrEqualTo(String value) {
            addCriterion("video_pagename <=", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameLike(String value) {
            addCriterion("video_pagename like", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameNotLike(String value) {
            addCriterion("video_pagename not like", value, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameIn(List<String> values) {
            addCriterion("video_pagename in", values, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameNotIn(List<String> values) {
            addCriterion("video_pagename not in", values, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameBetween(String value1, String value2) {
            addCriterion("video_pagename between", value1, value2, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPagenameNotBetween(String value1, String value2) {
            addCriterion("video_pagename not between", value1, value2, "videoPagename");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameIsNull() {
            addCriterion("video_pageSeoname is null");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameIsNotNull() {
            addCriterion("video_pageSeoname is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameEqualTo(String value) {
            addCriterion("video_pageSeoname =", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameNotEqualTo(String value) {
            addCriterion("video_pageSeoname <>", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameGreaterThan(String value) {
            addCriterion("video_pageSeoname >", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameGreaterThanOrEqualTo(String value) {
            addCriterion("video_pageSeoname >=", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameLessThan(String value) {
            addCriterion("video_pageSeoname <", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameLessThanOrEqualTo(String value) {
            addCriterion("video_pageSeoname <=", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameLike(String value) {
            addCriterion("video_pageSeoname like", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameNotLike(String value) {
            addCriterion("video_pageSeoname not like", value, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameIn(List<String> values) {
            addCriterion("video_pageSeoname in", values, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameNotIn(List<String> values) {
            addCriterion("video_pageSeoname not in", values, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameBetween(String value1, String value2) {
            addCriterion("video_pageSeoname between", value1, value2, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPageseonameNotBetween(String value1, String value2) {
            addCriterion("video_pageSeoname not between", value1, value2, "videoPageseoname");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlIsNull() {
            addCriterion("video_pagewapimgurl is null");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlIsNotNull() {
            addCriterion("video_pagewapimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlEqualTo(String value) {
            addCriterion("video_pagewapimgurl =", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlNotEqualTo(String value) {
            addCriterion("video_pagewapimgurl <>", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlGreaterThan(String value) {
            addCriterion("video_pagewapimgurl >", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("video_pagewapimgurl >=", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlLessThan(String value) {
            addCriterion("video_pagewapimgurl <", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlLessThanOrEqualTo(String value) {
            addCriterion("video_pagewapimgurl <=", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlLike(String value) {
            addCriterion("video_pagewapimgurl like", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlNotLike(String value) {
            addCriterion("video_pagewapimgurl not like", value, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlIn(List<String> values) {
            addCriterion("video_pagewapimgurl in", values, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlNotIn(List<String> values) {
            addCriterion("video_pagewapimgurl not in", values, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlBetween(String value1, String value2) {
            addCriterion("video_pagewapimgurl between", value1, value2, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagewapimgurlNotBetween(String value1, String value2) {
            addCriterion("video_pagewapimgurl not between", value1, value2, "videoPagewapimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlIsNull() {
            addCriterion("video_pagepcimgurl is null");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlIsNotNull() {
            addCriterion("video_pagepcimgurl is not null");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlEqualTo(String value) {
            addCriterion("video_pagepcimgurl =", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlNotEqualTo(String value) {
            addCriterion("video_pagepcimgurl <>", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlGreaterThan(String value) {
            addCriterion("video_pagepcimgurl >", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlGreaterThanOrEqualTo(String value) {
            addCriterion("video_pagepcimgurl >=", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlLessThan(String value) {
            addCriterion("video_pagepcimgurl <", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlLessThanOrEqualTo(String value) {
            addCriterion("video_pagepcimgurl <=", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlLike(String value) {
            addCriterion("video_pagepcimgurl like", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlNotLike(String value) {
            addCriterion("video_pagepcimgurl not like", value, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlIn(List<String> values) {
            addCriterion("video_pagepcimgurl in", values, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlNotIn(List<String> values) {
            addCriterion("video_pagepcimgurl not in", values, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlBetween(String value1, String value2) {
            addCriterion("video_pagepcimgurl between", value1, value2, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoPagepcimgurlNotBetween(String value1, String value2) {
            addCriterion("video_pagepcimgurl not between", value1, value2, "videoPagepcimgurl");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoIsNull() {
            addCriterion("video_ifinto is null");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoIsNotNull() {
            addCriterion("video_ifinto is not null");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoEqualTo(Integer value) {
            addCriterion("video_ifinto =", value, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoNotEqualTo(Integer value) {
            addCriterion("video_ifinto <>", value, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoGreaterThan(Integer value) {
            addCriterion("video_ifinto >", value, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoGreaterThanOrEqualTo(Integer value) {
            addCriterion("video_ifinto >=", value, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoLessThan(Integer value) {
            addCriterion("video_ifinto <", value, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoLessThanOrEqualTo(Integer value) {
            addCriterion("video_ifinto <=", value, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoIn(List<Integer> values) {
            addCriterion("video_ifinto in", values, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoNotIn(List<Integer> values) {
            addCriterion("video_ifinto not in", values, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoBetween(Integer value1, Integer value2) {
            addCriterion("video_ifinto between", value1, value2, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoIfintoNotBetween(Integer value1, Integer value2) {
            addCriterion("video_ifinto not between", value1, value2, "videoIfinto");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeIsNull() {
            addCriterion("video_createTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeIsNotNull() {
            addCriterion("video_createTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeEqualTo(String value) {
            addCriterion("video_createTime =", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeNotEqualTo(String value) {
            addCriterion("video_createTime <>", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeGreaterThan(String value) {
            addCriterion("video_createTime >", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_createTime >=", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeLessThan(String value) {
            addCriterion("video_createTime <", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("video_createTime <=", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeLike(String value) {
            addCriterion("video_createTime like", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeNotLike(String value) {
            addCriterion("video_createTime not like", value, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeIn(List<String> values) {
            addCriterion("video_createTime in", values, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeNotIn(List<String> values) {
            addCriterion("video_createTime not in", values, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeBetween(String value1, String value2) {
            addCriterion("video_createTime between", value1, value2, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoCreatetimeNotBetween(String value1, String value2) {
            addCriterion("video_createTime not between", value1, value2, "videoCreatetime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeIsNull() {
            addCriterion("video_motifyTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeIsNotNull() {
            addCriterion("video_motifyTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeEqualTo(String value) {
            addCriterion("video_motifyTime =", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeNotEqualTo(String value) {
            addCriterion("video_motifyTime <>", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeGreaterThan(String value) {
            addCriterion("video_motifyTime >", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_motifyTime >=", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeLessThan(String value) {
            addCriterion("video_motifyTime <", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeLessThanOrEqualTo(String value) {
            addCriterion("video_motifyTime <=", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeLike(String value) {
            addCriterion("video_motifyTime like", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeNotLike(String value) {
            addCriterion("video_motifyTime not like", value, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeIn(List<String> values) {
            addCriterion("video_motifyTime in", values, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeNotIn(List<String> values) {
            addCriterion("video_motifyTime not in", values, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeBetween(String value1, String value2) {
            addCriterion("video_motifyTime between", value1, value2, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoMotifytimeNotBetween(String value1, String value2) {
            addCriterion("video_motifyTime not between", value1, value2, "videoMotifytime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeIsNull() {
            addCriterion("video_startTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeIsNotNull() {
            addCriterion("video_startTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeEqualTo(String value) {
            addCriterion("video_startTime =", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeNotEqualTo(String value) {
            addCriterion("video_startTime <>", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeGreaterThan(String value) {
            addCriterion("video_startTime >", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_startTime >=", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeLessThan(String value) {
            addCriterion("video_startTime <", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeLessThanOrEqualTo(String value) {
            addCriterion("video_startTime <=", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeLike(String value) {
            addCriterion("video_startTime like", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeNotLike(String value) {
            addCriterion("video_startTime not like", value, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeIn(List<String> values) {
            addCriterion("video_startTime in", values, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeNotIn(List<String> values) {
            addCriterion("video_startTime not in", values, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeBetween(String value1, String value2) {
            addCriterion("video_startTime between", value1, value2, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoStarttimeNotBetween(String value1, String value2) {
            addCriterion("video_startTime not between", value1, value2, "videoStarttime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeIsNull() {
            addCriterion("video_endTime is null");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeIsNotNull() {
            addCriterion("video_endTime is not null");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeEqualTo(String value) {
            addCriterion("video_endTime =", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeNotEqualTo(String value) {
            addCriterion("video_endTime <>", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeGreaterThan(String value) {
            addCriterion("video_endTime >", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeGreaterThanOrEqualTo(String value) {
            addCriterion("video_endTime >=", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeLessThan(String value) {
            addCriterion("video_endTime <", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeLessThanOrEqualTo(String value) {
            addCriterion("video_endTime <=", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeLike(String value) {
            addCriterion("video_endTime like", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeNotLike(String value) {
            addCriterion("video_endTime not like", value, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeIn(List<String> values) {
            addCriterion("video_endTime in", values, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeNotIn(List<String> values) {
            addCriterion("video_endTime not in", values, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeBetween(String value1, String value2) {
            addCriterion("video_endTime between", value1, value2, "videoEndtime");
            return (Criteria) this;
        }

        public Criteria andVideoEndtimeNotBetween(String value1, String value2) {
            addCriterion("video_endTime not between", value1, value2, "videoEndtime");
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