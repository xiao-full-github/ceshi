package cn.com.yzton.primary.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EapConfigPathExample implements Serializable {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EapConfigPathExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andPathIsNull() {
            addCriterion("`Path` is null");
            return (Criteria) this;
        }

        public Criteria andPathIsNotNull() {
            addCriterion("`Path` is not null");
            return (Criteria) this;
        }

        public Criteria andPathEqualTo(String value) {
            addCriterion("`Path` =", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotEqualTo(String value) {
            addCriterion("`Path` <>", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThan(String value) {
            addCriterion("`Path` >", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathGreaterThanOrEqualTo(String value) {
            addCriterion("`Path` >=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThan(String value) {
            addCriterion("`Path` <", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLessThanOrEqualTo(String value) {
            addCriterion("`Path` <=", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathLike(String value) {
            addCriterion("`Path` like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotLike(String value) {
            addCriterion("`Path` not like", value, "path");
            return (Criteria) this;
        }

        public Criteria andPathIn(List<String> values) {
            addCriterion("`Path` in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotIn(List<String> values) {
            addCriterion("`Path` not in", values, "path");
            return (Criteria) this;
        }

        public Criteria andPathBetween(String value1, String value2) {
            addCriterion("`Path` between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andPathNotBetween(String value1, String value2) {
            addCriterion("`Path` not between", value1, value2, "path");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("User_Name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("User_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("User_Name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("User_Name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("User_Name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("User_Name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("User_Name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("User_Name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("User_Name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("User_Name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("User_Name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("User_Name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("User_Name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("User_Name not between", value1, value2, "userName");
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

        public Criteria andIslocalIsNull() {
            addCriterion("IsLocal is null");
            return (Criteria) this;
        }

        public Criteria andIslocalIsNotNull() {
            addCriterion("IsLocal is not null");
            return (Criteria) this;
        }

        public Criteria andIslocalEqualTo(Boolean value) {
            addCriterion("IsLocal =", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotEqualTo(Boolean value) {
            addCriterion("IsLocal <>", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalGreaterThan(Boolean value) {
            addCriterion("IsLocal >", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("IsLocal >=", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalLessThan(Boolean value) {
            addCriterion("IsLocal <", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalLessThanOrEqualTo(Boolean value) {
            addCriterion("IsLocal <=", value, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalIn(List<Boolean> values) {
            addCriterion("IsLocal in", values, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotIn(List<Boolean> values) {
            addCriterion("IsLocal not in", values, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLocal between", value1, value2, "islocal");
            return (Criteria) this;
        }

        public Criteria andIslocalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("IsLocal not between", value1, value2, "islocal");
            return (Criteria) this;
        }

        public Criteria andAliasIsNull() {
            addCriterion("`Alias` is null");
            return (Criteria) this;
        }

        public Criteria andAliasIsNotNull() {
            addCriterion("`Alias` is not null");
            return (Criteria) this;
        }

        public Criteria andAliasEqualTo(String value) {
            addCriterion("`Alias` =", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotEqualTo(String value) {
            addCriterion("`Alias` <>", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThan(String value) {
            addCriterion("`Alias` >", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasGreaterThanOrEqualTo(String value) {
            addCriterion("`Alias` >=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThan(String value) {
            addCriterion("`Alias` <", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLessThanOrEqualTo(String value) {
            addCriterion("`Alias` <=", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasLike(String value) {
            addCriterion("`Alias` like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotLike(String value) {
            addCriterion("`Alias` not like", value, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasIn(List<String> values) {
            addCriterion("`Alias` in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotIn(List<String> values) {
            addCriterion("`Alias` not in", values, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasBetween(String value1, String value2) {
            addCriterion("`Alias` between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andAliasNotBetween(String value1, String value2) {
            addCriterion("`Alias` not between", value1, value2, "alias");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNull() {
            addCriterion("Domain_Name is null");
            return (Criteria) this;
        }

        public Criteria andDomainNameIsNotNull() {
            addCriterion("Domain_Name is not null");
            return (Criteria) this;
        }

        public Criteria andDomainNameEqualTo(String value) {
            addCriterion("Domain_Name =", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotEqualTo(String value) {
            addCriterion("Domain_Name <>", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThan(String value) {
            addCriterion("Domain_Name >", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameGreaterThanOrEqualTo(String value) {
            addCriterion("Domain_Name >=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThan(String value) {
            addCriterion("Domain_Name <", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLessThanOrEqualTo(String value) {
            addCriterion("Domain_Name <=", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameLike(String value) {
            addCriterion("Domain_Name like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotLike(String value) {
            addCriterion("Domain_Name not like", value, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameIn(List<String> values) {
            addCriterion("Domain_Name in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotIn(List<String> values) {
            addCriterion("Domain_Name not in", values, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameBetween(String value1, String value2) {
            addCriterion("Domain_Name between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andDomainNameNotBetween(String value1, String value2) {
            addCriterion("Domain_Name not between", value1, value2, "domainName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNull() {
            addCriterion("Machine_Name is null");
            return (Criteria) this;
        }

        public Criteria andMachineNameIsNotNull() {
            addCriterion("Machine_Name is not null");
            return (Criteria) this;
        }

        public Criteria andMachineNameEqualTo(String value) {
            addCriterion("Machine_Name =", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotEqualTo(String value) {
            addCriterion("Machine_Name <>", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThan(String value) {
            addCriterion("Machine_Name >", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameGreaterThanOrEqualTo(String value) {
            addCriterion("Machine_Name >=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThan(String value) {
            addCriterion("Machine_Name <", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLessThanOrEqualTo(String value) {
            addCriterion("Machine_Name <=", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameLike(String value) {
            addCriterion("Machine_Name like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotLike(String value) {
            addCriterion("Machine_Name not like", value, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameIn(List<String> values) {
            addCriterion("Machine_Name in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotIn(List<String> values) {
            addCriterion("Machine_Name not in", values, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameBetween(String value1, String value2) {
            addCriterion("Machine_Name between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andMachineNameNotBetween(String value1, String value2) {
            addCriterion("Machine_Name not between", value1, value2, "machineName");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverIsNull() {
            addCriterion("DatabaseServer is null");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverIsNotNull() {
            addCriterion("DatabaseServer is not null");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverEqualTo(String value) {
            addCriterion("DatabaseServer =", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverNotEqualTo(String value) {
            addCriterion("DatabaseServer <>", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverGreaterThan(String value) {
            addCriterion("DatabaseServer >", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverGreaterThanOrEqualTo(String value) {
            addCriterion("DatabaseServer >=", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverLessThan(String value) {
            addCriterion("DatabaseServer <", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverLessThanOrEqualTo(String value) {
            addCriterion("DatabaseServer <=", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverLike(String value) {
            addCriterion("DatabaseServer like", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverNotLike(String value) {
            addCriterion("DatabaseServer not like", value, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverIn(List<String> values) {
            addCriterion("DatabaseServer in", values, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverNotIn(List<String> values) {
            addCriterion("DatabaseServer not in", values, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverBetween(String value1, String value2) {
            addCriterion("DatabaseServer between", value1, value2, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDatabaseserverNotBetween(String value1, String value2) {
            addCriterion("DatabaseServer not between", value1, value2, "databaseserver");
            return (Criteria) this;
        }

        public Criteria andDataUserIsNull() {
            addCriterion("Data_User is null");
            return (Criteria) this;
        }

        public Criteria andDataUserIsNotNull() {
            addCriterion("Data_User is not null");
            return (Criteria) this;
        }

        public Criteria andDataUserEqualTo(String value) {
            addCriterion("Data_User =", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotEqualTo(String value) {
            addCriterion("Data_User <>", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserGreaterThan(String value) {
            addCriterion("Data_User >", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserGreaterThanOrEqualTo(String value) {
            addCriterion("Data_User >=", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserLessThan(String value) {
            addCriterion("Data_User <", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserLessThanOrEqualTo(String value) {
            addCriterion("Data_User <=", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserLike(String value) {
            addCriterion("Data_User like", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotLike(String value) {
            addCriterion("Data_User not like", value, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserIn(List<String> values) {
            addCriterion("Data_User in", values, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotIn(List<String> values) {
            addCriterion("Data_User not in", values, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserBetween(String value1, String value2) {
            addCriterion("Data_User between", value1, value2, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataUserNotBetween(String value1, String value2) {
            addCriterion("Data_User not between", value1, value2, "dataUser");
            return (Criteria) this;
        }

        public Criteria andDataPwdIsNull() {
            addCriterion("Data_Pwd is null");
            return (Criteria) this;
        }

        public Criteria andDataPwdIsNotNull() {
            addCriterion("Data_Pwd is not null");
            return (Criteria) this;
        }

        public Criteria andDataPwdEqualTo(String value) {
            addCriterion("Data_Pwd =", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdNotEqualTo(String value) {
            addCriterion("Data_Pwd <>", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdGreaterThan(String value) {
            addCriterion("Data_Pwd >", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdGreaterThanOrEqualTo(String value) {
            addCriterion("Data_Pwd >=", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdLessThan(String value) {
            addCriterion("Data_Pwd <", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdLessThanOrEqualTo(String value) {
            addCriterion("Data_Pwd <=", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdLike(String value) {
            addCriterion("Data_Pwd like", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdNotLike(String value) {
            addCriterion("Data_Pwd not like", value, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdIn(List<String> values) {
            addCriterion("Data_Pwd in", values, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdNotIn(List<String> values) {
            addCriterion("Data_Pwd not in", values, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdBetween(String value1, String value2) {
            addCriterion("Data_Pwd between", value1, value2, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andDataPwdNotBetween(String value1, String value2) {
            addCriterion("Data_Pwd not between", value1, value2, "dataPwd");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNull() {
            addCriterion("AdminPassword is null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIsNotNull() {
            addCriterion("AdminPassword is not null");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordEqualTo(String value) {
            addCriterion("AdminPassword =", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotEqualTo(String value) {
            addCriterion("AdminPassword <>", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThan(String value) {
            addCriterion("AdminPassword >", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("AdminPassword >=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThan(String value) {
            addCriterion("AdminPassword <", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLessThanOrEqualTo(String value) {
            addCriterion("AdminPassword <=", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordLike(String value) {
            addCriterion("AdminPassword like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotLike(String value) {
            addCriterion("AdminPassword not like", value, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordIn(List<String> values) {
            addCriterion("AdminPassword in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotIn(List<String> values) {
            addCriterion("AdminPassword not in", values, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordBetween(String value1, String value2) {
            addCriterion("AdminPassword between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminpasswordNotBetween(String value1, String value2) {
            addCriterion("AdminPassword not between", value1, value2, "adminpassword");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateIsNull() {
            addCriterion("AdminLastLoginDate is null");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateIsNotNull() {
            addCriterion("AdminLastLoginDate is not null");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateEqualTo(Date value) {
            addCriterion("AdminLastLoginDate =", value, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateNotEqualTo(Date value) {
            addCriterion("AdminLastLoginDate <>", value, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateGreaterThan(Date value) {
            addCriterion("AdminLastLoginDate >", value, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateGreaterThanOrEqualTo(Date value) {
            addCriterion("AdminLastLoginDate >=", value, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateLessThan(Date value) {
            addCriterion("AdminLastLoginDate <", value, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateLessThanOrEqualTo(Date value) {
            addCriterion("AdminLastLoginDate <=", value, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateIn(List<Date> values) {
            addCriterion("AdminLastLoginDate in", values, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateNotIn(List<Date> values) {
            addCriterion("AdminLastLoginDate not in", values, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateBetween(Date value1, Date value2) {
            addCriterion("AdminLastLoginDate between", value1, value2, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andAdminlastlogindateNotBetween(Date value1, Date value2) {
            addCriterion("AdminLastLoginDate not between", value1, value2, "adminlastlogindate");
            return (Criteria) this;
        }

        public Criteria andSysversionnoIsNull() {
            addCriterion("SysVersionNo is null");
            return (Criteria) this;
        }

        public Criteria andSysversionnoIsNotNull() {
            addCriterion("SysVersionNo is not null");
            return (Criteria) this;
        }

        public Criteria andSysversionnoEqualTo(String value) {
            addCriterion("SysVersionNo =", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoNotEqualTo(String value) {
            addCriterion("SysVersionNo <>", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoGreaterThan(String value) {
            addCriterion("SysVersionNo >", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoGreaterThanOrEqualTo(String value) {
            addCriterion("SysVersionNo >=", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoLessThan(String value) {
            addCriterion("SysVersionNo <", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoLessThanOrEqualTo(String value) {
            addCriterion("SysVersionNo <=", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoLike(String value) {
            addCriterion("SysVersionNo like", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoNotLike(String value) {
            addCriterion("SysVersionNo not like", value, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoIn(List<String> values) {
            addCriterion("SysVersionNo in", values, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoNotIn(List<String> values) {
            addCriterion("SysVersionNo not in", values, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoBetween(String value1, String value2) {
            addCriterion("SysVersionNo between", value1, value2, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andSysversionnoNotBetween(String value1, String value2) {
            addCriterion("SysVersionNo not between", value1, value2, "sysversionno");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNull() {
            addCriterion("ServiceId is null");
            return (Criteria) this;
        }

        public Criteria andServiceidIsNotNull() {
            addCriterion("ServiceId is not null");
            return (Criteria) this;
        }

        public Criteria andServiceidEqualTo(String value) {
            addCriterion("ServiceId =", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotEqualTo(String value) {
            addCriterion("ServiceId <>", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThan(String value) {
            addCriterion("ServiceId >", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidGreaterThanOrEqualTo(String value) {
            addCriterion("ServiceId >=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThan(String value) {
            addCriterion("ServiceId <", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLessThanOrEqualTo(String value) {
            addCriterion("ServiceId <=", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidLike(String value) {
            addCriterion("ServiceId like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotLike(String value) {
            addCriterion("ServiceId not like", value, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidIn(List<String> values) {
            addCriterion("ServiceId in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotIn(List<String> values) {
            addCriterion("ServiceId not in", values, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidBetween(String value1, String value2) {
            addCriterion("ServiceId between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andServiceidNotBetween(String value1, String value2) {
            addCriterion("ServiceId not between", value1, value2, "serviceid");
            return (Criteria) this;
        }

        public Criteria andCodelengthIsNull() {
            addCriterion("CodeLength is null");
            return (Criteria) this;
        }

        public Criteria andCodelengthIsNotNull() {
            addCriterion("CodeLength is not null");
            return (Criteria) this;
        }

        public Criteria andCodelengthEqualTo(Integer value) {
            addCriterion("CodeLength =", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotEqualTo(Integer value) {
            addCriterion("CodeLength <>", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthGreaterThan(Integer value) {
            addCriterion("CodeLength >", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthGreaterThanOrEqualTo(Integer value) {
            addCriterion("CodeLength >=", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLessThan(Integer value) {
            addCriterion("CodeLength <", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthLessThanOrEqualTo(Integer value) {
            addCriterion("CodeLength <=", value, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthIn(List<Integer> values) {
            addCriterion("CodeLength in", values, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotIn(List<Integer> values) {
            addCriterion("CodeLength not in", values, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthBetween(Integer value1, Integer value2) {
            addCriterion("CodeLength between", value1, value2, "codelength");
            return (Criteria) this;
        }

        public Criteria andCodelengthNotBetween(Integer value1, Integer value2) {
            addCriterion("CodeLength not between", value1, value2, "codelength");
            return (Criteria) this;
        }

        public Criteria andEnswarrantIsNull() {
            addCriterion("EnsWarrant is null");
            return (Criteria) this;
        }

        public Criteria andEnswarrantIsNotNull() {
            addCriterion("EnsWarrant is not null");
            return (Criteria) this;
        }

        public Criteria andEnswarrantEqualTo(String value) {
            addCriterion("EnsWarrant =", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantNotEqualTo(String value) {
            addCriterion("EnsWarrant <>", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantGreaterThan(String value) {
            addCriterion("EnsWarrant >", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantGreaterThanOrEqualTo(String value) {
            addCriterion("EnsWarrant >=", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantLessThan(String value) {
            addCriterion("EnsWarrant <", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantLessThanOrEqualTo(String value) {
            addCriterion("EnsWarrant <=", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantLike(String value) {
            addCriterion("EnsWarrant like", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantNotLike(String value) {
            addCriterion("EnsWarrant not like", value, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantIn(List<String> values) {
            addCriterion("EnsWarrant in", values, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantNotIn(List<String> values) {
            addCriterion("EnsWarrant not in", values, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantBetween(String value1, String value2) {
            addCriterion("EnsWarrant between", value1, value2, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andEnswarrantNotBetween(String value1, String value2) {
            addCriterion("EnsWarrant not between", value1, value2, "enswarrant");
            return (Criteria) this;
        }

        public Criteria andIdtenantIsNull() {
            addCriterion("idTenant is null");
            return (Criteria) this;
        }

        public Criteria andIdtenantIsNotNull() {
            addCriterion("idTenant is not null");
            return (Criteria) this;
        }

        public Criteria andIdtenantEqualTo(String value) {
            addCriterion("idTenant =", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantNotEqualTo(String value) {
            addCriterion("idTenant <>", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantGreaterThan(String value) {
            addCriterion("idTenant >", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantGreaterThanOrEqualTo(String value) {
            addCriterion("idTenant >=", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantLessThan(String value) {
            addCriterion("idTenant <", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantLessThanOrEqualTo(String value) {
            addCriterion("idTenant <=", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantLike(String value) {
            addCriterion("idTenant like", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantNotLike(String value) {
            addCriterion("idTenant not like", value, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantIn(List<String> values) {
            addCriterion("idTenant in", values, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantNotIn(List<String> values) {
            addCriterion("idTenant not in", values, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantBetween(String value1, String value2) {
            addCriterion("idTenant between", value1, value2, "idtenant");
            return (Criteria) this;
        }

        public Criteria andIdtenantNotBetween(String value1, String value2) {
            addCriterion("idTenant not between", value1, value2, "idtenant");
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

        public Criteria andPwdrecoversetIsNull() {
            addCriterion("PwdRecoverSet is null");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetIsNotNull() {
            addCriterion("PwdRecoverSet is not null");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetEqualTo(String value) {
            addCriterion("PwdRecoverSet =", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetNotEqualTo(String value) {
            addCriterion("PwdRecoverSet <>", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetGreaterThan(String value) {
            addCriterion("PwdRecoverSet >", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetGreaterThanOrEqualTo(String value) {
            addCriterion("PwdRecoverSet >=", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetLessThan(String value) {
            addCriterion("PwdRecoverSet <", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetLessThanOrEqualTo(String value) {
            addCriterion("PwdRecoverSet <=", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetLike(String value) {
            addCriterion("PwdRecoverSet like", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetNotLike(String value) {
            addCriterion("PwdRecoverSet not like", value, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetIn(List<String> values) {
            addCriterion("PwdRecoverSet in", values, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetNotIn(List<String> values) {
            addCriterion("PwdRecoverSet not in", values, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetBetween(String value1, String value2) {
            addCriterion("PwdRecoverSet between", value1, value2, "pwdrecoverset");
            return (Criteria) this;
        }

        public Criteria andPwdrecoversetNotBetween(String value1, String value2) {
            addCriterion("PwdRecoverSet not between", value1, value2, "pwdrecoverset");
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