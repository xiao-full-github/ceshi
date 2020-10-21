package cn.com.yzton.primary.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EapOperationLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EapOperationLogExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNull() {
            addCriterion("OperateType is null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIsNotNull() {
            addCriterion("OperateType is not null");
            return (Criteria) this;
        }

        public Criteria andOperatetypeEqualTo(Boolean value) {
            addCriterion("OperateType =", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotEqualTo(Boolean value) {
            addCriterion("OperateType <>", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThan(Boolean value) {
            addCriterion("OperateType >", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("OperateType >=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThan(Boolean value) {
            addCriterion("OperateType <", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeLessThanOrEqualTo(Boolean value) {
            addCriterion("OperateType <=", value, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeIn(List<Boolean> values) {
            addCriterion("OperateType in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotIn(List<Boolean> values) {
            addCriterion("OperateType not in", values, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeBetween(Boolean value1, Boolean value2) {
            addCriterion("OperateType between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andOperatetypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("OperateType not between", value1, value2, "operatetype");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNull() {
            addCriterion("AccountID is null");
            return (Criteria) this;
        }

        public Criteria andAccountidIsNotNull() {
            addCriterion("AccountID is not null");
            return (Criteria) this;
        }

        public Criteria andAccountidEqualTo(String value) {
            addCriterion("AccountID =", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotEqualTo(String value) {
            addCriterion("AccountID <>", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThan(String value) {
            addCriterion("AccountID >", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidGreaterThanOrEqualTo(String value) {
            addCriterion("AccountID >=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThan(String value) {
            addCriterion("AccountID <", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLessThanOrEqualTo(String value) {
            addCriterion("AccountID <=", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidLike(String value) {
            addCriterion("AccountID like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotLike(String value) {
            addCriterion("AccountID not like", value, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidIn(List<String> values) {
            addCriterion("AccountID in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotIn(List<String> values) {
            addCriterion("AccountID not in", values, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidBetween(String value1, String value2) {
            addCriterion("AccountID between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountidNotBetween(String value1, String value2) {
            addCriterion("AccountID not between", value1, value2, "accountid");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNull() {
            addCriterion("AccountName is null");
            return (Criteria) this;
        }

        public Criteria andAccountnameIsNotNull() {
            addCriterion("AccountName is not null");
            return (Criteria) this;
        }

        public Criteria andAccountnameEqualTo(String value) {
            addCriterion("AccountName =", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotEqualTo(String value) {
            addCriterion("AccountName <>", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThan(String value) {
            addCriterion("AccountName >", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameGreaterThanOrEqualTo(String value) {
            addCriterion("AccountName >=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThan(String value) {
            addCriterion("AccountName <", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLessThanOrEqualTo(String value) {
            addCriterion("AccountName <=", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameLike(String value) {
            addCriterion("AccountName like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotLike(String value) {
            addCriterion("AccountName not like", value, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameIn(List<String> values) {
            addCriterion("AccountName in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotIn(List<String> values) {
            addCriterion("AccountName not in", values, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameBetween(String value1, String value2) {
            addCriterion("AccountName between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andAccountnameNotBetween(String value1, String value2) {
            addCriterion("AccountName not between", value1, value2, "accountname");
            return (Criteria) this;
        }

        public Criteria andOperateIsNull() {
            addCriterion("Operate is null");
            return (Criteria) this;
        }

        public Criteria andOperateIsNotNull() {
            addCriterion("Operate is not null");
            return (Criteria) this;
        }

        public Criteria andOperateEqualTo(String value) {
            addCriterion("Operate =", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotEqualTo(String value) {
            addCriterion("Operate <>", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThan(String value) {
            addCriterion("Operate >", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateGreaterThanOrEqualTo(String value) {
            addCriterion("Operate >=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThan(String value) {
            addCriterion("Operate <", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLessThanOrEqualTo(String value) {
            addCriterion("Operate <=", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateLike(String value) {
            addCriterion("Operate like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotLike(String value) {
            addCriterion("Operate not like", value, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateIn(List<String> values) {
            addCriterion("Operate in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotIn(List<String> values) {
            addCriterion("Operate not in", values, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateBetween(String value1, String value2) {
            addCriterion("Operate between", value1, value2, "operate");
            return (Criteria) this;
        }

        public Criteria andOperateNotBetween(String value1, String value2) {
            addCriterion("Operate not between", value1, value2, "operate");
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

        public Criteria andUseridEqualTo(String value) {
            addCriterion("UserID =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("UserID <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("UserID >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("UserID >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("UserID <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("UserID <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("UserID like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("UserID not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("UserID in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("UserID not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("UserID between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("UserID not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("UserName is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("UserName is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("UserName =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("UserName <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("UserName >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("UserName >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("UserName <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("UserName <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("UserName like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("UserName not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("UserName in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("UserName not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("UserName between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("UserName not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andMachinenameIsNull() {
            addCriterion("MachineName is null");
            return (Criteria) this;
        }

        public Criteria andMachinenameIsNotNull() {
            addCriterion("MachineName is not null");
            return (Criteria) this;
        }

        public Criteria andMachinenameEqualTo(String value) {
            addCriterion("MachineName =", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotEqualTo(String value) {
            addCriterion("MachineName <>", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameGreaterThan(String value) {
            addCriterion("MachineName >", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameGreaterThanOrEqualTo(String value) {
            addCriterion("MachineName >=", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameLessThan(String value) {
            addCriterion("MachineName <", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameLessThanOrEqualTo(String value) {
            addCriterion("MachineName <=", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameLike(String value) {
            addCriterion("MachineName like", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotLike(String value) {
            addCriterion("MachineName not like", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameIn(List<String> values) {
            addCriterion("MachineName in", values, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotIn(List<String> values) {
            addCriterion("MachineName not in", values, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameBetween(String value1, String value2) {
            addCriterion("MachineName between", value1, value2, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotBetween(String value1, String value2) {
            addCriterion("MachineName not between", value1, value2, "machinename");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("`Time` is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("`Time` is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("`Time` =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("`Time` <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("`Time` >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("`Time` >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("`Time` <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("`Time` <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("`Time` in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("`Time` not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("`Time` between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("`Time` not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andDocnoIsNull() {
            addCriterion("DocNo is null");
            return (Criteria) this;
        }

        public Criteria andDocnoIsNotNull() {
            addCriterion("DocNo is not null");
            return (Criteria) this;
        }

        public Criteria andDocnoEqualTo(String value) {
            addCriterion("DocNo =", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotEqualTo(String value) {
            addCriterion("DocNo <>", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoGreaterThan(String value) {
            addCriterion("DocNo >", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoGreaterThanOrEqualTo(String value) {
            addCriterion("DocNo >=", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLessThan(String value) {
            addCriterion("DocNo <", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLessThanOrEqualTo(String value) {
            addCriterion("DocNo <=", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLike(String value) {
            addCriterion("DocNo like", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotLike(String value) {
            addCriterion("DocNo not like", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoIn(List<String> values) {
            addCriterion("DocNo in", values, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotIn(List<String> values) {
            addCriterion("DocNo not in", values, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoBetween(String value1, String value2) {
            addCriterion("DocNo between", value1, value2, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotBetween(String value1, String value2) {
            addCriterion("DocNo not between", value1, value2, "docno");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("`Status` is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("`Status` is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("`Status` =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("`Status` <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("`Status` >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("`Status` >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("`Status` <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("`Status` <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("`Status` in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("`Status` not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("`Status` between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("`Status` not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andModulecodeIsNull() {
            addCriterion("ModuleCode is null");
            return (Criteria) this;
        }

        public Criteria andModulecodeIsNotNull() {
            addCriterion("ModuleCode is not null");
            return (Criteria) this;
        }

        public Criteria andModulecodeEqualTo(String value) {
            addCriterion("ModuleCode =", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotEqualTo(String value) {
            addCriterion("ModuleCode <>", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeGreaterThan(String value) {
            addCriterion("ModuleCode >", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeGreaterThanOrEqualTo(String value) {
            addCriterion("ModuleCode >=", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeLessThan(String value) {
            addCriterion("ModuleCode <", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeLessThanOrEqualTo(String value) {
            addCriterion("ModuleCode <=", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeLike(String value) {
            addCriterion("ModuleCode like", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotLike(String value) {
            addCriterion("ModuleCode not like", value, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeIn(List<String> values) {
            addCriterion("ModuleCode in", values, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotIn(List<String> values) {
            addCriterion("ModuleCode not in", values, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeBetween(String value1, String value2) {
            addCriterion("ModuleCode between", value1, value2, "modulecode");
            return (Criteria) this;
        }

        public Criteria andModulecodeNotBetween(String value1, String value2) {
            addCriterion("ModuleCode not between", value1, value2, "modulecode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeIsNull() {
            addCriterion("FunctionCode is null");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeIsNotNull() {
            addCriterion("FunctionCode is not null");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeEqualTo(String value) {
            addCriterion("FunctionCode =", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotEqualTo(String value) {
            addCriterion("FunctionCode <>", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeGreaterThan(String value) {
            addCriterion("FunctionCode >", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionCode >=", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeLessThan(String value) {
            addCriterion("FunctionCode <", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeLessThanOrEqualTo(String value) {
            addCriterion("FunctionCode <=", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeLike(String value) {
            addCriterion("FunctionCode like", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotLike(String value) {
            addCriterion("FunctionCode not like", value, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeIn(List<String> values) {
            addCriterion("FunctionCode in", values, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotIn(List<String> values) {
            addCriterion("FunctionCode not in", values, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeBetween(String value1, String value2) {
            addCriterion("FunctionCode between", value1, value2, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctioncodeNotBetween(String value1, String value2) {
            addCriterion("FunctionCode not between", value1, value2, "functioncode");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNull() {
            addCriterion("FunctionName is null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIsNotNull() {
            addCriterion("FunctionName is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionnameEqualTo(String value) {
            addCriterion("FunctionName =", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotEqualTo(String value) {
            addCriterion("FunctionName <>", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThan(String value) {
            addCriterion("FunctionName >", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameGreaterThanOrEqualTo(String value) {
            addCriterion("FunctionName >=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThan(String value) {
            addCriterion("FunctionName <", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLessThanOrEqualTo(String value) {
            addCriterion("FunctionName <=", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameLike(String value) {
            addCriterion("FunctionName like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotLike(String value) {
            addCriterion("FunctionName not like", value, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameIn(List<String> values) {
            addCriterion("FunctionName in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotIn(List<String> values) {
            addCriterion("FunctionName not in", values, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameBetween(String value1, String value2) {
            addCriterion("FunctionName between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andFunctionnameNotBetween(String value1, String value2) {
            addCriterion("FunctionName not between", value1, value2, "functionname");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("ProductName is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("ProductName is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("ProductName =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("ProductName <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("ProductName >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("ProductName >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("ProductName <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("ProductName <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("ProductName like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("ProductName not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("ProductName in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("ProductName not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("ProductName between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("ProductName not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andFunctiondateIsNull() {
            addCriterion("FunctionDate is null");
            return (Criteria) this;
        }

        public Criteria andFunctiondateIsNotNull() {
            addCriterion("FunctionDate is not null");
            return (Criteria) this;
        }

        public Criteria andFunctiondateEqualTo(Date value) {
            addCriterion("FunctionDate =", value, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateNotEqualTo(Date value) {
            addCriterion("FunctionDate <>", value, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateGreaterThan(Date value) {
            addCriterion("FunctionDate >", value, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateGreaterThanOrEqualTo(Date value) {
            addCriterion("FunctionDate >=", value, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateLessThan(Date value) {
            addCriterion("FunctionDate <", value, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateLessThanOrEqualTo(Date value) {
            addCriterion("FunctionDate <=", value, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateIn(List<Date> values) {
            addCriterion("FunctionDate in", values, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateNotIn(List<Date> values) {
            addCriterion("FunctionDate not in", values, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateBetween(Date value1, Date value2) {
            addCriterion("FunctionDate between", value1, value2, "functiondate");
            return (Criteria) this;
        }

        public Criteria andFunctiondateNotBetween(Date value1, Date value2) {
            addCriterion("FunctionDate not between", value1, value2, "functiondate");
            return (Criteria) this;
        }

        public Criteria andDevdescIsNull() {
            addCriterion("devDesc is null");
            return (Criteria) this;
        }

        public Criteria andDevdescIsNotNull() {
            addCriterion("devDesc is not null");
            return (Criteria) this;
        }

        public Criteria andDevdescEqualTo(String value) {
            addCriterion("devDesc =", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescNotEqualTo(String value) {
            addCriterion("devDesc <>", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescGreaterThan(String value) {
            addCriterion("devDesc >", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescGreaterThanOrEqualTo(String value) {
            addCriterion("devDesc >=", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescLessThan(String value) {
            addCriterion("devDesc <", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescLessThanOrEqualTo(String value) {
            addCriterion("devDesc <=", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescLike(String value) {
            addCriterion("devDesc like", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescNotLike(String value) {
            addCriterion("devDesc not like", value, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescIn(List<String> values) {
            addCriterion("devDesc in", values, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescNotIn(List<String> values) {
            addCriterion("devDesc not in", values, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescBetween(String value1, String value2) {
            addCriterion("devDesc between", value1, value2, "devdesc");
            return (Criteria) this;
        }

        public Criteria andDevdescNotBetween(String value1, String value2) {
            addCriterion("devDesc not between", value1, value2, "devdesc");
            return (Criteria) this;
        }

        public Criteria andIsdevrowIsNull() {
            addCriterion("isDevRow is null");
            return (Criteria) this;
        }

        public Criteria andIsdevrowIsNotNull() {
            addCriterion("isDevRow is not null");
            return (Criteria) this;
        }

        public Criteria andIsdevrowEqualTo(Boolean value) {
            addCriterion("isDevRow =", value, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowNotEqualTo(Boolean value) {
            addCriterion("isDevRow <>", value, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowGreaterThan(Boolean value) {
            addCriterion("isDevRow >", value, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowGreaterThanOrEqualTo(Boolean value) {
            addCriterion("isDevRow >=", value, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowLessThan(Boolean value) {
            addCriterion("isDevRow <", value, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowLessThanOrEqualTo(Boolean value) {
            addCriterion("isDevRow <=", value, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowIn(List<Boolean> values) {
            addCriterion("isDevRow in", values, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowNotIn(List<Boolean> values) {
            addCriterion("isDevRow not in", values, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowBetween(Boolean value1, Boolean value2) {
            addCriterion("isDevRow between", value1, value2, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andIsdevrowNotBetween(Boolean value1, Boolean value2) {
            addCriterion("isDevRow not between", value1, value2, "isdevrow");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNull() {
            addCriterion("AppType is null");
            return (Criteria) this;
        }

        public Criteria andApptypeIsNotNull() {
            addCriterion("AppType is not null");
            return (Criteria) this;
        }

        public Criteria andApptypeEqualTo(Integer value) {
            addCriterion("AppType =", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotEqualTo(Integer value) {
            addCriterion("AppType <>", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThan(Integer value) {
            addCriterion("AppType >", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AppType >=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThan(Integer value) {
            addCriterion("AppType <", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeLessThanOrEqualTo(Integer value) {
            addCriterion("AppType <=", value, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeIn(List<Integer> values) {
            addCriterion("AppType in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotIn(List<Integer> values) {
            addCriterion("AppType not in", values, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeBetween(Integer value1, Integer value2) {
            addCriterion("AppType between", value1, value2, "apptype");
            return (Criteria) this;
        }

        public Criteria andApptypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AppType not between", value1, value2, "apptype");
            return (Criteria) this;
        }
    }

    /**
     */
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