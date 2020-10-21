package cn.com.yzton.primary.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EapUserExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EapUserExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("Id not between", value1, value2, "id");
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

        public Criteria andCaccNumIsNull() {
            addCriterion("cAcc_Num is null");
            return (Criteria) this;
        }

        public Criteria andCaccNumIsNotNull() {
            addCriterion("cAcc_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCaccNumEqualTo(Integer value) {
            addCriterion("cAcc_Num =", value, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumNotEqualTo(Integer value) {
            addCriterion("cAcc_Num <>", value, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumGreaterThan(Integer value) {
            addCriterion("cAcc_Num >", value, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("cAcc_Num >=", value, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumLessThan(Integer value) {
            addCriterion("cAcc_Num <", value, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumLessThanOrEqualTo(Integer value) {
            addCriterion("cAcc_Num <=", value, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumIn(List<Integer> values) {
            addCriterion("cAcc_Num in", values, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumNotIn(List<Integer> values) {
            addCriterion("cAcc_Num not in", values, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumBetween(Integer value1, Integer value2) {
            addCriterion("cAcc_Num between", value1, value2, "caccNum");
            return (Criteria) this;
        }

        public Criteria andCaccNumNotBetween(Integer value1, Integer value2) {
            addCriterion("cAcc_Num not between", value1, value2, "caccNum");
            return (Criteria) this;
        }

        public Criteria andIdwebserverIsNull() {
            addCriterion("idWebServer is null");
            return (Criteria) this;
        }

        public Criteria andIdwebserverIsNotNull() {
            addCriterion("idWebServer is not null");
            return (Criteria) this;
        }

        public Criteria andIdwebserverEqualTo(Integer value) {
            addCriterion("idWebServer =", value, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverNotEqualTo(Integer value) {
            addCriterion("idWebServer <>", value, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverGreaterThan(Integer value) {
            addCriterion("idWebServer >", value, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverGreaterThanOrEqualTo(Integer value) {
            addCriterion("idWebServer >=", value, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverLessThan(Integer value) {
            addCriterion("idWebServer <", value, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverLessThanOrEqualTo(Integer value) {
            addCriterion("idWebServer <=", value, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverIn(List<Integer> values) {
            addCriterion("idWebServer in", values, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverNotIn(List<Integer> values) {
            addCriterion("idWebServer not in", values, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverBetween(Integer value1, Integer value2) {
            addCriterion("idWebServer between", value1, value2, "idwebserver");
            return (Criteria) this;
        }

        public Criteria andIdwebserverNotBetween(Integer value1, Integer value2) {
            addCriterion("idWebServer not between", value1, value2, "idwebserver");
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

        public Criteria andCdkeyIsNull() {
            addCriterion("CDKey is null");
            return (Criteria) this;
        }

        public Criteria andCdkeyIsNotNull() {
            addCriterion("CDKey is not null");
            return (Criteria) this;
        }

        public Criteria andCdkeyEqualTo(String value) {
            addCriterion("CDKey =", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyNotEqualTo(String value) {
            addCriterion("CDKey <>", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyGreaterThan(String value) {
            addCriterion("CDKey >", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyGreaterThanOrEqualTo(String value) {
            addCriterion("CDKey >=", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyLessThan(String value) {
            addCriterion("CDKey <", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyLessThanOrEqualTo(String value) {
            addCriterion("CDKey <=", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyLike(String value) {
            addCriterion("CDKey like", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyNotLike(String value) {
            addCriterion("CDKey not like", value, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyIn(List<String> values) {
            addCriterion("CDKey in", values, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyNotIn(List<String> values) {
            addCriterion("CDKey not in", values, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyBetween(String value1, String value2) {
            addCriterion("CDKey between", value1, value2, "cdkey");
            return (Criteria) this;
        }

        public Criteria andCdkeyNotBetween(String value1, String value2) {
            addCriterion("CDKey not between", value1, value2, "cdkey");
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

        public Criteria andPasswordIsNull() {
            addCriterion("`Password` is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("`Password` is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("`Password` =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("`Password` <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("`Password` >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("`Password` >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("`Password` <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("`Password` <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("`Password` like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("`Password` not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("`Password` in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("`Password` not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("`Password` between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("`Password` not between", value1, value2, "password");
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

        public Criteria andUseridIsNull() {
            addCriterion("UserID is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("UserID is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNull() {
            addCriterion("RealName is null");
            return (Criteria) this;
        }

        public Criteria andRealnameIsNotNull() {
            addCriterion("RealName is not null");
            return (Criteria) this;
        }

        public Criteria andRealnameEqualTo(String value) {
            addCriterion("RealName =", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotEqualTo(String value) {
            addCriterion("RealName <>", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThan(String value) {
            addCriterion("RealName >", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("RealName >=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThan(String value) {
            addCriterion("RealName <", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLessThanOrEqualTo(String value) {
            addCriterion("RealName <=", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameLike(String value) {
            addCriterion("RealName like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotLike(String value) {
            addCriterion("RealName not like", value, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameIn(List<String> values) {
            addCriterion("RealName in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotIn(List<String> values) {
            addCriterion("RealName not in", values, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameBetween(String value1, String value2) {
            addCriterion("RealName between", value1, value2, "realname");
            return (Criteria) this;
        }

        public Criteria andRealnameNotBetween(String value1, String value2) {
            addCriterion("RealName not between", value1, value2, "realname");
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

        public Criteria andLastlogoutdateIsNull() {
            addCriterion("lastLogoutDate is null");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateIsNotNull() {
            addCriterion("lastLogoutDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateEqualTo(Date value) {
            addCriterion("lastLogoutDate =", value, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateNotEqualTo(Date value) {
            addCriterion("lastLogoutDate <>", value, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateGreaterThan(Date value) {
            addCriterion("lastLogoutDate >", value, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateGreaterThanOrEqualTo(Date value) {
            addCriterion("lastLogoutDate >=", value, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateLessThan(Date value) {
            addCriterion("lastLogoutDate <", value, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateLessThanOrEqualTo(Date value) {
            addCriterion("lastLogoutDate <=", value, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateIn(List<Date> values) {
            addCriterion("lastLogoutDate in", values, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateNotIn(List<Date> values) {
            addCriterion("lastLogoutDate not in", values, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateBetween(Date value1, Date value2) {
            addCriterion("lastLogoutDate between", value1, value2, "lastlogoutdate");
            return (Criteria) this;
        }

        public Criteria andLastlogoutdateNotBetween(Date value1, Date value2) {
            addCriterion("lastLogoutDate not between", value1, value2, "lastlogoutdate");
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

        public Criteria andSkinvalueIsNull() {
            addCriterion("SkinValue is null");
            return (Criteria) this;
        }

        public Criteria andSkinvalueIsNotNull() {
            addCriterion("SkinValue is not null");
            return (Criteria) this;
        }

        public Criteria andSkinvalueEqualTo(String value) {
            addCriterion("SkinValue =", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueNotEqualTo(String value) {
            addCriterion("SkinValue <>", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueGreaterThan(String value) {
            addCriterion("SkinValue >", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueGreaterThanOrEqualTo(String value) {
            addCriterion("SkinValue >=", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueLessThan(String value) {
            addCriterion("SkinValue <", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueLessThanOrEqualTo(String value) {
            addCriterion("SkinValue <=", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueLike(String value) {
            addCriterion("SkinValue like", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueNotLike(String value) {
            addCriterion("SkinValue not like", value, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueIn(List<String> values) {
            addCriterion("SkinValue in", values, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueNotIn(List<String> values) {
            addCriterion("SkinValue not in", values, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueBetween(String value1, String value2) {
            addCriterion("SkinValue between", value1, value2, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andSkinvalueNotBetween(String value1, String value2) {
            addCriterion("SkinValue not between", value1, value2, "skinvalue");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNull() {
            addCriterion("GroupName is null");
            return (Criteria) this;
        }

        public Criteria andGroupnameIsNotNull() {
            addCriterion("GroupName is not null");
            return (Criteria) this;
        }

        public Criteria andGroupnameEqualTo(String value) {
            addCriterion("GroupName =", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotEqualTo(String value) {
            addCriterion("GroupName <>", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThan(String value) {
            addCriterion("GroupName >", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameGreaterThanOrEqualTo(String value) {
            addCriterion("GroupName >=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThan(String value) {
            addCriterion("GroupName <", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLessThanOrEqualTo(String value) {
            addCriterion("GroupName <=", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameLike(String value) {
            addCriterion("GroupName like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotLike(String value) {
            addCriterion("GroupName not like", value, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameIn(List<String> values) {
            addCriterion("GroupName in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotIn(List<String> values) {
            addCriterion("GroupName not in", values, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameBetween(String value1, String value2) {
            addCriterion("GroupName between", value1, value2, "groupname");
            return (Criteria) this;
        }

        public Criteria andGroupnameNotBetween(String value1, String value2) {
            addCriterion("GroupName not between", value1, value2, "groupname");
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

        public Criteria andRolecodeIsNull() {
            addCriterion("RoleCode is null");
            return (Criteria) this;
        }

        public Criteria andRolecodeIsNotNull() {
            addCriterion("RoleCode is not null");
            return (Criteria) this;
        }

        public Criteria andRolecodeEqualTo(String value) {
            addCriterion("RoleCode =", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeNotEqualTo(String value) {
            addCriterion("RoleCode <>", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeGreaterThan(String value) {
            addCriterion("RoleCode >", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeGreaterThanOrEqualTo(String value) {
            addCriterion("RoleCode >=", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeLessThan(String value) {
            addCriterion("RoleCode <", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeLessThanOrEqualTo(String value) {
            addCriterion("RoleCode <=", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeLike(String value) {
            addCriterion("RoleCode like", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeNotLike(String value) {
            addCriterion("RoleCode not like", value, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeIn(List<String> values) {
            addCriterion("RoleCode in", values, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeNotIn(List<String> values) {
            addCriterion("RoleCode not in", values, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeBetween(String value1, String value2) {
            addCriterion("RoleCode between", value1, value2, "rolecode");
            return (Criteria) this;
        }

        public Criteria andRolecodeNotBetween(String value1, String value2) {
            addCriterion("RoleCode not between", value1, value2, "rolecode");
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