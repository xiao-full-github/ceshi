package cn.com.yzton.secondary.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EapUser2Example implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EapUser2Example() {
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

    protected abstract static class GeneratedCriteria implements Serializable {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("isAdmin is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("isAdmin is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(Boolean value) {
            addCriterion("isAdmin =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(Boolean value) {
            addCriterion("isAdmin <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(Boolean value) {
            addCriterion("isAdmin >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isAdmin >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(Boolean value) {
            addCriterion("isAdmin <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(Boolean value) {
            addCriterion("isAdmin <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<Boolean> values) {
            addCriterion("isAdmin in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<Boolean> values) {
            addCriterion("isAdmin not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(Boolean value1, Boolean value2) {
            addCriterion("isAdmin between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isAdmin not between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("Memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("Memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("Memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("Memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("Memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("Memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("Memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("Memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("Memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("Memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("Memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("Memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("Memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("Memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNull() {
            addCriterion("lastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIsNotNull() {
            addCriterion("lastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogindateEqualTo(Date value) {
            addCriterion("lastLoginDate =", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotEqualTo(Date value) {
            addCriterion("lastLoginDate <>", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThan(Date value) {
            addCriterion("lastLoginDate >", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLoginDate >=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThan(Date value) {
            addCriterion("lastLoginDate <", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateLessThanOrEqualTo(Date value) {
            addCriterion("lastLoginDate <=", value, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateIn(List<Date> values) {
            addCriterion("lastLoginDate in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotIn(List<Date> values) {
            addCriterion("lastLoginDate not in", values, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateBetween(Date value1, Date value2) {
            addCriterion("lastLoginDate between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andLastlogindateNotBetween(Date value1, Date value2) {
            addCriterion("lastLoginDate not between", value1, value2, "lastlogindate");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNull() {
            addCriterion("OrderNum is null");
            return (Criteria) this;
        }

        public Criteria andOrdernumIsNotNull() {
            addCriterion("OrderNum is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernumEqualTo(Integer value) {
            addCriterion("OrderNum =", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotEqualTo(Integer value) {
            addCriterion("OrderNum <>", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThan(Integer value) {
            addCriterion("OrderNum >", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumGreaterThanOrEqualTo(Integer value) {
            addCriterion("OrderNum >=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThan(Integer value) {
            addCriterion("OrderNum <", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumLessThanOrEqualTo(Integer value) {
            addCriterion("OrderNum <=", value, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumIn(List<Integer> values) {
            addCriterion("OrderNum in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotIn(List<Integer> values) {
            addCriterion("OrderNum not in", values, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumBetween(Integer value1, Integer value2) {
            addCriterion("OrderNum between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andOrdernumNotBetween(Integer value1, Integer value2) {
            addCriterion("OrderNum not between", value1, value2, "ordernum");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNull() {
            addCriterion("createdDate is null");
            return (Criteria) this;
        }

        public Criteria andCreateddateIsNotNull() {
            addCriterion("createdDate is not null");
            return (Criteria) this;
        }

        public Criteria andCreateddateEqualTo(Date value) {
            addCriterion("createdDate =", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotEqualTo(Date value) {
            addCriterion("createdDate <>", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThan(Date value) {
            addCriterion("createdDate >", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateGreaterThanOrEqualTo(Date value) {
            addCriterion("createdDate >=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThan(Date value) {
            addCriterion("createdDate <", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateLessThanOrEqualTo(Date value) {
            addCriterion("createdDate <=", value, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateIn(List<Date> values) {
            addCriterion("createdDate in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotIn(List<Date> values) {
            addCriterion("createdDate not in", values, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateBetween(Date value1, Date value2) {
            addCriterion("createdDate between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andCreateddateNotBetween(Date value1, Date value2) {
            addCriterion("createdDate not between", value1, value2, "createddate");
            return (Criteria) this;
        }

        public Criteria andActortypeIsNull() {
            addCriterion("ActorType is null");
            return (Criteria) this;
        }

        public Criteria andActortypeIsNotNull() {
            addCriterion("ActorType is not null");
            return (Criteria) this;
        }

        public Criteria andActortypeEqualTo(Boolean value) {
            addCriterion("ActorType =", value, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeNotEqualTo(Boolean value) {
            addCriterion("ActorType <>", value, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeGreaterThan(Boolean value) {
            addCriterion("ActorType >", value, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ActorType >=", value, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeLessThan(Boolean value) {
            addCriterion("ActorType <", value, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeLessThanOrEqualTo(Boolean value) {
            addCriterion("ActorType <=", value, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeIn(List<Boolean> values) {
            addCriterion("ActorType in", values, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeNotIn(List<Boolean> values) {
            addCriterion("ActorType not in", values, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeBetween(Boolean value1, Boolean value2) {
            addCriterion("ActorType between", value1, value2, "actortype");
            return (Criteria) this;
        }

        public Criteria andActortypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ActorType not between", value1, value2, "actortype");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersIsNull() {
            addCriterion("IsHeadQuarters is null");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersIsNotNull() {
            addCriterion("IsHeadQuarters is not null");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersEqualTo(Boolean value) {
            addCriterion("IsHeadQuarters =", value, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersNotEqualTo(Boolean value) {
            addCriterion("IsHeadQuarters <>", value, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersGreaterThan(Boolean value) {
            addCriterion("IsHeadQuarters >", value, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsHeadQuarters >=", value, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersLessThan(Boolean value) {
            addCriterion("IsHeadQuarters <", value, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersLessThanOrEqualTo(Boolean value) {
            addCriterion("IsHeadQuarters <=", value, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersIn(List<Boolean> values) {
            addCriterion("IsHeadQuarters in", values, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersNotIn(List<Boolean> values) {
            addCriterion("IsHeadQuarters not in", values, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHeadQuarters between", value1, value2, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIsheadquartersNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsHeadQuarters not between", value1, value2, "isheadquarters");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganIsNull() {
            addCriterion("IdMarketingOrgan is null");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganIsNotNull() {
            addCriterion("IdMarketingOrgan is not null");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganEqualTo(Integer value) {
            addCriterion("IdMarketingOrgan =", value, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganNotEqualTo(Integer value) {
            addCriterion("IdMarketingOrgan <>", value, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganGreaterThan(Integer value) {
            addCriterion("IdMarketingOrgan >", value, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdMarketingOrgan >=", value, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganLessThan(Integer value) {
            addCriterion("IdMarketingOrgan <", value, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganLessThanOrEqualTo(Integer value) {
            addCriterion("IdMarketingOrgan <=", value, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganIn(List<Integer> values) {
            addCriterion("IdMarketingOrgan in", values, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganNotIn(List<Integer> values) {
            addCriterion("IdMarketingOrgan not in", values, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganBetween(Integer value1, Integer value2) {
            addCriterion("IdMarketingOrgan between", value1, value2, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andIdmarketingorganNotBetween(Integer value1, Integer value2) {
            addCriterion("IdMarketingOrgan not between", value1, value2, "idmarketingorgan");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateIsNull() {
            addCriterion("LastModifyDate is null");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateIsNotNull() {
            addCriterion("LastModifyDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateEqualTo(Date value) {
            addCriterion("LastModifyDate =", value, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateNotEqualTo(Date value) {
            addCriterion("LastModifyDate <>", value, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateGreaterThan(Date value) {
            addCriterion("LastModifyDate >", value, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateGreaterThanOrEqualTo(Date value) {
            addCriterion("LastModifyDate >=", value, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateLessThan(Date value) {
            addCriterion("LastModifyDate <", value, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateLessThanOrEqualTo(Date value) {
            addCriterion("LastModifyDate <=", value, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateIn(List<Date> values) {
            addCriterion("LastModifyDate in", values, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateNotIn(List<Date> values) {
            addCriterion("LastModifyDate not in", values, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateBetween(Date value1, Date value2) {
            addCriterion("LastModifyDate between", value1, value2, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andLastmodifydateNotBetween(Date value1, Date value2) {
            addCriterion("LastModifyDate not between", value1, value2, "lastmodifydate");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("`password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`password` not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andExpressionnameIsNull() {
            addCriterion("ExpressionName is null");
            return (Criteria) this;
        }

        public Criteria andExpressionnameIsNotNull() {
            addCriterion("ExpressionName is not null");
            return (Criteria) this;
        }

        public Criteria andExpressionnameEqualTo(String value) {
            addCriterion("ExpressionName =", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameNotEqualTo(String value) {
            addCriterion("ExpressionName <>", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameGreaterThan(String value) {
            addCriterion("ExpressionName >", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameGreaterThanOrEqualTo(String value) {
            addCriterion("ExpressionName >=", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameLessThan(String value) {
            addCriterion("ExpressionName <", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameLessThanOrEqualTo(String value) {
            addCriterion("ExpressionName <=", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameLike(String value) {
            addCriterion("ExpressionName like", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameNotLike(String value) {
            addCriterion("ExpressionName not like", value, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameIn(List<String> values) {
            addCriterion("ExpressionName in", values, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameNotIn(List<String> values) {
            addCriterion("ExpressionName not in", values, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameBetween(String value1, String value2) {
            addCriterion("ExpressionName between", value1, value2, "expressionname");
            return (Criteria) this;
        }

        public Criteria andExpressionnameNotBetween(String value1, String value2) {
            addCriterion("ExpressionName not between", value1, value2, "expressionname");
            return (Criteria) this;
        }

        public Criteria andDuduphoneIsNull() {
            addCriterion("DuduPhone is null");
            return (Criteria) this;
        }

        public Criteria andDuduphoneIsNotNull() {
            addCriterion("DuduPhone is not null");
            return (Criteria) this;
        }

        public Criteria andDuduphoneEqualTo(String value) {
            addCriterion("DuduPhone =", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneNotEqualTo(String value) {
            addCriterion("DuduPhone <>", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneGreaterThan(String value) {
            addCriterion("DuduPhone >", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneGreaterThanOrEqualTo(String value) {
            addCriterion("DuduPhone >=", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneLessThan(String value) {
            addCriterion("DuduPhone <", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneLessThanOrEqualTo(String value) {
            addCriterion("DuduPhone <=", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneLike(String value) {
            addCriterion("DuduPhone like", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneNotLike(String value) {
            addCriterion("DuduPhone not like", value, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneIn(List<String> values) {
            addCriterion("DuduPhone in", values, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneNotIn(List<String> values) {
            addCriterion("DuduPhone not in", values, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneBetween(String value1, String value2) {
            addCriterion("DuduPhone between", value1, value2, "duduphone");
            return (Criteria) this;
        }

        public Criteria andDuduphoneNotBetween(String value1, String value2) {
            addCriterion("DuduPhone not between", value1, value2, "duduphone");
            return (Criteria) this;
        }

        public Criteria andIsdemoIsNull() {
            addCriterion("IsDemo is null");
            return (Criteria) this;
        }

        public Criteria andIsdemoIsNotNull() {
            addCriterion("IsDemo is not null");
            return (Criteria) this;
        }

        public Criteria andIsdemoEqualTo(Boolean value) {
            addCriterion("IsDemo =", value, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoNotEqualTo(Boolean value) {
            addCriterion("IsDemo <>", value, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoGreaterThan(Boolean value) {
            addCriterion("IsDemo >", value, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDemo >=", value, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoLessThan(Boolean value) {
            addCriterion("IsDemo <", value, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDemo <=", value, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoIn(List<Boolean> values) {
            addCriterion("IsDemo in", values, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoNotIn(List<Boolean> values) {
            addCriterion("IsDemo not in", values, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDemo between", value1, value2, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIsdemoNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDemo not between", value1, value2, "isdemo");
            return (Criteria) this;
        }

        public Criteria andIssystemIsNull() {
            addCriterion("issystem is null");
            return (Criteria) this;
        }

        public Criteria andIssystemIsNotNull() {
            addCriterion("issystem is not null");
            return (Criteria) this;
        }

        public Criteria andIssystemEqualTo(Boolean value) {
            addCriterion("issystem =", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemNotEqualTo(Boolean value) {
            addCriterion("issystem <>", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemGreaterThan(Boolean value) {
            addCriterion("issystem >", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemGreaterThanOrEqualTo(Boolean value) {
            addCriterion("issystem >=", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemLessThan(Boolean value) {
            addCriterion("issystem <", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemLessThanOrEqualTo(Boolean value) {
            addCriterion("issystem <=", value, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemIn(List<Boolean> values) {
            addCriterion("issystem in", values, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemNotIn(List<Boolean> values) {
            addCriterion("issystem not in", values, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemBetween(Boolean value1, Boolean value2) {
            addCriterion("issystem between", value1, value2, "issystem");
            return (Criteria) this;
        }

        public Criteria andIssystemNotBetween(Boolean value1, Boolean value2) {
            addCriterion("issystem not between", value1, value2, "issystem");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginIsNull() {
            addCriterion("IsControlLogin is null");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginIsNotNull() {
            addCriterion("IsControlLogin is not null");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginEqualTo(Boolean value) {
            addCriterion("IsControlLogin =", value, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginNotEqualTo(Boolean value) {
            addCriterion("IsControlLogin <>", value, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginGreaterThan(Boolean value) {
            addCriterion("IsControlLogin >", value, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsControlLogin >=", value, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginLessThan(Boolean value) {
            addCriterion("IsControlLogin <", value, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginLessThanOrEqualTo(Boolean value) {
            addCriterion("IsControlLogin <=", value, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginIn(List<Boolean> values) {
            addCriterion("IsControlLogin in", values, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginNotIn(List<Boolean> values) {
            addCriterion("IsControlLogin not in", values, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginBetween(Boolean value1, Boolean value2) {
            addCriterion("IsControlLogin between", value1, value2, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andIscontrolloginNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsControlLogin not between", value1, value2, "iscontrollogin");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("Code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("Code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("Code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("Code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("Code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("Code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("Code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("Code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("Code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("Code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("Code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("Code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("Code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("Code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andAuthstateIsNull() {
            addCriterion("AuthState is null");
            return (Criteria) this;
        }

        public Criteria andAuthstateIsNotNull() {
            addCriterion("AuthState is not null");
            return (Criteria) this;
        }

        public Criteria andAuthstateEqualTo(Boolean value) {
            addCriterion("AuthState =", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateNotEqualTo(Boolean value) {
            addCriterion("AuthState <>", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateGreaterThan(Boolean value) {
            addCriterion("AuthState >", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("AuthState >=", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateLessThan(Boolean value) {
            addCriterion("AuthState <", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateLessThanOrEqualTo(Boolean value) {
            addCriterion("AuthState <=", value, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateIn(List<Boolean> values) {
            addCriterion("AuthState in", values, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateNotIn(List<Boolean> values) {
            addCriterion("AuthState not in", values, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateBetween(Boolean value1, Boolean value2) {
            addCriterion("AuthState between", value1, value2, "authstate");
            return (Criteria) this;
        }

        public Criteria andAuthstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("AuthState not between", value1, value2, "authstate");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNull() {
            addCriterion("PersonName is null");
            return (Criteria) this;
        }

        public Criteria andPersonnameIsNotNull() {
            addCriterion("PersonName is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnameEqualTo(String value) {
            addCriterion("PersonName =", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotEqualTo(String value) {
            addCriterion("PersonName <>", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThan(String value) {
            addCriterion("PersonName >", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameGreaterThanOrEqualTo(String value) {
            addCriterion("PersonName >=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThan(String value) {
            addCriterion("PersonName <", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLessThanOrEqualTo(String value) {
            addCriterion("PersonName <=", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameLike(String value) {
            addCriterion("PersonName like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotLike(String value) {
            addCriterion("PersonName not like", value, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameIn(List<String> values) {
            addCriterion("PersonName in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotIn(List<String> values) {
            addCriterion("PersonName not in", values, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameBetween(String value1, String value2) {
            addCriterion("PersonName between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andPersonnameNotBetween(String value1, String value2) {
            addCriterion("PersonName not between", value1, value2, "personname");
            return (Criteria) this;
        }

        public Criteria andIsstopedIsNull() {
            addCriterion("isStoped is null");
            return (Criteria) this;
        }

        public Criteria andIsstopedIsNotNull() {
            addCriterion("isStoped is not null");
            return (Criteria) this;
        }

        public Criteria andIsstopedEqualTo(Boolean value) {
            addCriterion("isStoped =", value, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedNotEqualTo(Boolean value) {
            addCriterion("isStoped <>", value, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedGreaterThan(Boolean value) {
            addCriterion("isStoped >", value, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isStoped >=", value, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedLessThan(Boolean value) {
            addCriterion("isStoped <", value, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedLessThanOrEqualTo(Boolean value) {
            addCriterion("isStoped <=", value, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedIn(List<Boolean> values) {
            addCriterion("isStoped in", values, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedNotIn(List<Boolean> values) {
            addCriterion("isStoped not in", values, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedBetween(Boolean value1, Boolean value2) {
            addCriterion("isStoped between", value1, value2, "isstoped");
            return (Criteria) this;
        }

        public Criteria andIsstopedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isStoped not between", value1, value2, "isstoped");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("`name` is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("`name` is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("`name` =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("`name` <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("`name` >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("`name` >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("`name` <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("`name` <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("`name` like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("`name` not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("`name` in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("`name` not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("`name` between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("`name` not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNull() {
            addCriterion("IsUsed is null");
            return (Criteria) this;
        }

        public Criteria andIsusedIsNotNull() {
            addCriterion("IsUsed is not null");
            return (Criteria) this;
        }

        public Criteria andIsusedEqualTo(Boolean value) {
            addCriterion("IsUsed =", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotEqualTo(Boolean value) {
            addCriterion("IsUsed <>", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThan(Boolean value) {
            addCriterion("IsUsed >", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsUsed >=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThan(Boolean value) {
            addCriterion("IsUsed <", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedLessThanOrEqualTo(Boolean value) {
            addCriterion("IsUsed <=", value, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedIn(List<Boolean> values) {
            addCriterion("IsUsed in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotIn(List<Boolean> values) {
            addCriterion("IsUsed not in", values, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUsed between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIsusedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsUsed not between", value1, value2, "isused");
            return (Criteria) this;
        }

        public Criteria andIswebIsNull() {
            addCriterion("IsWeb is null");
            return (Criteria) this;
        }

        public Criteria andIswebIsNotNull() {
            addCriterion("IsWeb is not null");
            return (Criteria) this;
        }

        public Criteria andIswebEqualTo(Boolean value) {
            addCriterion("IsWeb =", value, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebNotEqualTo(Boolean value) {
            addCriterion("IsWeb <>", value, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebGreaterThan(Boolean value) {
            addCriterion("IsWeb >", value, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsWeb >=", value, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebLessThan(Boolean value) {
            addCriterion("IsWeb <", value, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebLessThanOrEqualTo(Boolean value) {
            addCriterion("IsWeb <=", value, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebIn(List<Boolean> values) {
            addCriterion("IsWeb in", values, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebNotIn(List<Boolean> values) {
            addCriterion("IsWeb not in", values, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebBetween(Boolean value1, Boolean value2) {
            addCriterion("IsWeb between", value1, value2, "isweb");
            return (Criteria) this;
        }

        public Criteria andIswebNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsWeb not between", value1, value2, "isweb");
            return (Criteria) this;
        }

        public Criteria andIsmobileIsNull() {
            addCriterion("IsMobile is null");
            return (Criteria) this;
        }

        public Criteria andIsmobileIsNotNull() {
            addCriterion("IsMobile is not null");
            return (Criteria) this;
        }

        public Criteria andIsmobileEqualTo(Boolean value) {
            addCriterion("IsMobile =", value, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileNotEqualTo(Boolean value) {
            addCriterion("IsMobile <>", value, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileGreaterThan(Boolean value) {
            addCriterion("IsMobile >", value, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsMobile >=", value, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileLessThan(Boolean value) {
            addCriterion("IsMobile <", value, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileLessThanOrEqualTo(Boolean value) {
            addCriterion("IsMobile <=", value, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileIn(List<Boolean> values) {
            addCriterion("IsMobile in", values, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileNotIn(List<Boolean> values) {
            addCriterion("IsMobile not in", values, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMobile between", value1, value2, "ismobile");
            return (Criteria) this;
        }

        public Criteria andIsmobileNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsMobile not between", value1, value2, "ismobile");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateIsNull() {
            addCriterion("UpgradePwdState is null");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateIsNotNull() {
            addCriterion("UpgradePwdState is not null");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateEqualTo(Boolean value) {
            addCriterion("UpgradePwdState =", value, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateNotEqualTo(Boolean value) {
            addCriterion("UpgradePwdState <>", value, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateGreaterThan(Boolean value) {
            addCriterion("UpgradePwdState >", value, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("UpgradePwdState >=", value, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateLessThan(Boolean value) {
            addCriterion("UpgradePwdState <", value, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateLessThanOrEqualTo(Boolean value) {
            addCriterion("UpgradePwdState <=", value, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateIn(List<Boolean> values) {
            addCriterion("UpgradePwdState in", values, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateNotIn(List<Boolean> values) {
            addCriterion("UpgradePwdState not in", values, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateBetween(Boolean value1, Boolean value2) {
            addCriterion("UpgradePwdState between", value1, value2, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andUpgradepwdstateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("UpgradePwdState not between", value1, value2, "upgradepwdstate");
            return (Criteria) this;
        }

        public Criteria andClouduseridIsNull() {
            addCriterion("CloudUserId is null");
            return (Criteria) this;
        }

        public Criteria andClouduseridIsNotNull() {
            addCriterion("CloudUserId is not null");
            return (Criteria) this;
        }

        public Criteria andClouduseridEqualTo(String value) {
            addCriterion("CloudUserId =", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridNotEqualTo(String value) {
            addCriterion("CloudUserId <>", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridGreaterThan(String value) {
            addCriterion("CloudUserId >", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridGreaterThanOrEqualTo(String value) {
            addCriterion("CloudUserId >=", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridLessThan(String value) {
            addCriterion("CloudUserId <", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridLessThanOrEqualTo(String value) {
            addCriterion("CloudUserId <=", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridLike(String value) {
            addCriterion("CloudUserId like", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridNotLike(String value) {
            addCriterion("CloudUserId not like", value, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridIn(List<String> values) {
            addCriterion("CloudUserId in", values, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridNotIn(List<String> values) {
            addCriterion("CloudUserId not in", values, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridBetween(String value1, String value2) {
            addCriterion("CloudUserId between", value1, value2, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andClouduseridNotBetween(String value1, String value2) {
            addCriterion("CloudUserId not between", value1, value2, "clouduserid");
            return (Criteria) this;
        }

        public Criteria andIdpersonIsNull() {
            addCriterion("IdPerson is null");
            return (Criteria) this;
        }

        public Criteria andIdpersonIsNotNull() {
            addCriterion("IdPerson is not null");
            return (Criteria) this;
        }

        public Criteria andIdpersonEqualTo(Integer value) {
            addCriterion("IdPerson =", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotEqualTo(Integer value) {
            addCriterion("IdPerson <>", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonGreaterThan(Integer value) {
            addCriterion("IdPerson >", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonGreaterThanOrEqualTo(Integer value) {
            addCriterion("IdPerson >=", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonLessThan(Integer value) {
            addCriterion("IdPerson <", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonLessThanOrEqualTo(Integer value) {
            addCriterion("IdPerson <=", value, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonIn(List<Integer> values) {
            addCriterion("IdPerson in", values, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotIn(List<Integer> values) {
            addCriterion("IdPerson not in", values, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonBetween(Integer value1, Integer value2) {
            addCriterion("IdPerson between", value1, value2, "idperson");
            return (Criteria) this;
        }

        public Criteria andIdpersonNotBetween(Integer value1, Integer value2) {
            addCriterion("IdPerson not between", value1, value2, "idperson");
            return (Criteria) this;
        }

        public Criteria andIsdstIsNull() {
            addCriterion("IsDst is null");
            return (Criteria) this;
        }

        public Criteria andIsdstIsNotNull() {
            addCriterion("IsDst is not null");
            return (Criteria) this;
        }

        public Criteria andIsdstEqualTo(Boolean value) {
            addCriterion("IsDst =", value, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstNotEqualTo(Boolean value) {
            addCriterion("IsDst <>", value, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstGreaterThan(Boolean value) {
            addCriterion("IsDst >", value, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsDst >=", value, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstLessThan(Boolean value) {
            addCriterion("IsDst <", value, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstLessThanOrEqualTo(Boolean value) {
            addCriterion("IsDst <=", value, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstIn(List<Boolean> values) {
            addCriterion("IsDst in", values, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstNotIn(List<Boolean> values) {
            addCriterion("IsDst not in", values, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDst between", value1, value2, "isdst");
            return (Criteria) this;
        }

        public Criteria andIsdstNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsDst not between", value1, value2, "isdst");
            return (Criteria) this;
        }

        public Criteria andTsIsNull() {
            addCriterion("ts is null");
            return (Criteria) this;
        }

        public Criteria andTsIsNotNull() {
            addCriterion("ts is not null");
            return (Criteria) this;
        }

        public Criteria andTsEqualTo(Date value) {
            addCriterion("ts =", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotEqualTo(Date value) {
            addCriterion("ts <>", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThan(Date value) {
            addCriterion("ts >", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsGreaterThanOrEqualTo(Date value) {
            addCriterion("ts >=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThan(Date value) {
            addCriterion("ts <", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsLessThanOrEqualTo(Date value) {
            addCriterion("ts <=", value, "ts");
            return (Criteria) this;
        }

        public Criteria andTsIn(List<Date> values) {
            addCriterion("ts in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotIn(List<Date> values) {
            addCriterion("ts not in", values, "ts");
            return (Criteria) this;
        }

        public Criteria andTsBetween(Date value1, Date value2) {
            addCriterion("ts between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andTsNotBetween(Date value1, Date value2) {
            addCriterion("ts not between", value1, value2, "ts");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroIsNull() {
            addCriterion("ShowNewFuncIntro is null");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroIsNotNull() {
            addCriterion("ShowNewFuncIntro is not null");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroEqualTo(Boolean value) {
            addCriterion("ShowNewFuncIntro =", value, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroNotEqualTo(Boolean value) {
            addCriterion("ShowNewFuncIntro <>", value, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroGreaterThan(Boolean value) {
            addCriterion("ShowNewFuncIntro >", value, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ShowNewFuncIntro >=", value, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroLessThan(Boolean value) {
            addCriterion("ShowNewFuncIntro <", value, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroLessThanOrEqualTo(Boolean value) {
            addCriterion("ShowNewFuncIntro <=", value, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroIn(List<Boolean> values) {
            addCriterion("ShowNewFuncIntro in", values, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroNotIn(List<Boolean> values) {
            addCriterion("ShowNewFuncIntro not in", values, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroBetween(Boolean value1, Boolean value2) {
            addCriterion("ShowNewFuncIntro between", value1, value2, "shownewfuncintro");
            return (Criteria) this;
        }

        public Criteria andShownewfuncintroNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ShowNewFuncIntro not between", value1, value2, "shownewfuncintro");
            return (Criteria) this;
        }
    }

    /**
     *
     */
    public static class Criteria extends GeneratedCriteria implements Serializable {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion implements Serializable {
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