package cn.com.yzton.secondary.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * eap_user
 * @author 
 */
public class EapUser2 implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 是否账套主管
     */
    private Boolean isadmin;

    /**
     * 备注
     */
    private String memo;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 最近登录日期
     */
    private Date lastlogindate;

    /**
     * 顺序号
     */
    private Integer ordernum;

    /**
     * 创建日期
     */
    private Date createddate;

    /**
     * 角色类型
     */
    private Boolean actortype;

    /**
     * 是否总部
     */
    private Boolean isheadquarters;

    /**
     * 所属营销机构ID
     */
    private Integer idmarketingorgan;

    /**
     * 最后修改日期
     */
    private Date lastmodifydate;

    /**
     * 密码
     */
    private String password;

    /**
     * 后置名称
     */
    private String expressionname;

    /**
     * Dudu号码
     */
    private String duduphone;

    /**
     * 是否是演示用户
     */
    private Boolean isdemo;

    /**
     * 是否系统
     */
    private Boolean issystem;

    /**
     * 是否修改登录时间
     */
    private Boolean iscontrollogin;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 编号
     */
    private String code;

    /**
     * 授权状态
     */
    private Boolean authstate;

    /**
     * 员工名称
     */
    private String personname;

    /**
     * 是否停用
     */
    private Boolean isstoped;

    /**
     * 名称
     */
    private String name;

    /**
     * IsUsed
     */
    private Boolean isused;

    /**
     * 是否客户端用户
     */
    private Boolean isweb;

    /**
     * 移动端用户
     */
    private Boolean ismobile;

    /**
     * 密码更新状态
     */
    private Boolean upgradepwdstate;

    /**
     * 云用户ID
     */
    private String clouduserid;

    /**
     * 人员id
     */
    private Integer idperson;

    /**
     * 电商通用户
     */
    private Boolean isdst;

    /**
     * 分布时间戳
     */
    private Date ts;

    /**
     * 是否显示新功能介绍页面
     */
    private Boolean shownewfuncintro;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsadmin() {
        return isadmin;
    }

    public void setIsadmin(Boolean isadmin) {
        this.isadmin = isadmin;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public Integer getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(Integer ordernum) {
        this.ordernum = ordernum;
    }

    public Date getCreateddate() {
        return createddate;
    }

    public void setCreateddate(Date createddate) {
        this.createddate = createddate;
    }

    public Boolean getActortype() {
        return actortype;
    }

    public void setActortype(Boolean actortype) {
        this.actortype = actortype;
    }

    public Boolean getIsheadquarters() {
        return isheadquarters;
    }

    public void setIsheadquarters(Boolean isheadquarters) {
        this.isheadquarters = isheadquarters;
    }

    public Integer getIdmarketingorgan() {
        return idmarketingorgan;
    }

    public void setIdmarketingorgan(Integer idmarketingorgan) {
        this.idmarketingorgan = idmarketingorgan;
    }

    public Date getLastmodifydate() {
        return lastmodifydate;
    }

    public void setLastmodifydate(Date lastmodifydate) {
        this.lastmodifydate = lastmodifydate;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getExpressionname() {
        return expressionname;
    }

    public void setExpressionname(String expressionname) {
        this.expressionname = expressionname;
    }

    public String getDuduphone() {
        return duduphone;
    }

    public void setDuduphone(String duduphone) {
        this.duduphone = duduphone;
    }

    public Boolean getIsdemo() {
        return isdemo;
    }

    public void setIsdemo(Boolean isdemo) {
        this.isdemo = isdemo;
    }

    public Boolean getIssystem() {
        return issystem;
    }

    public void setIssystem(Boolean issystem) {
        this.issystem = issystem;
    }

    public Boolean getIscontrollogin() {
        return iscontrollogin;
    }

    public void setIscontrollogin(Boolean iscontrollogin) {
        this.iscontrollogin = iscontrollogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getAuthstate() {
        return authstate;
    }

    public void setAuthstate(Boolean authstate) {
        this.authstate = authstate;
    }

    public String getPersonname() {
        return personname;
    }

    public void setPersonname(String personname) {
        this.personname = personname;
    }

    public Boolean getIsstoped() {
        return isstoped;
    }

    public void setIsstoped(Boolean isstoped) {
        this.isstoped = isstoped;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getIsused() {
        return isused;
    }

    public void setIsused(Boolean isused) {
        this.isused = isused;
    }

    public Boolean getIsweb() {
        return isweb;
    }

    public void setIsweb(Boolean isweb) {
        this.isweb = isweb;
    }

    public Boolean getIsmobile() {
        return ismobile;
    }

    public void setIsmobile(Boolean ismobile) {
        this.ismobile = ismobile;
    }

    public Boolean getUpgradepwdstate() {
        return upgradepwdstate;
    }

    public void setUpgradepwdstate(Boolean upgradepwdstate) {
        this.upgradepwdstate = upgradepwdstate;
    }

    public String getClouduserid() {
        return clouduserid;
    }

    public void setClouduserid(String clouduserid) {
        this.clouduserid = clouduserid;
    }

    public Integer getIdperson() {
        return idperson;
    }

    public void setIdperson(Integer idperson) {
        this.idperson = idperson;
    }

    public Boolean getIsdst() {
        return isdst;
    }

    public void setIsdst(Boolean isdst) {
        this.isdst = isdst;
    }

    public Date getTs() {
        return ts;
    }

    public void setTs(Date ts) {
        this.ts = ts;
    }

    public Boolean getShownewfuncintro() {
        return shownewfuncintro;
    }

    public void setShownewfuncintro(Boolean shownewfuncintro) {
        this.shownewfuncintro = shownewfuncintro;
    }
}