package cn.com.yzton.primary.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * eap_user
 * @author 
 */
public class EapUser implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 修改登录时间
     */
    private Boolean iscontrollogin;

    /**
     * 账套编码
     */
    private Integer caccNum;

    /**
     * 集群Web服务器Id
     */
    private Integer idwebserver;

    /**
     * 停用
     */
    private Boolean isstoped;

    /**
     * cdkey
     */
    private String cdkey;

    /**
     * 电商通用户
     */
    private Boolean isdst;

    /**
     * 邮箱账号
     */
    private String email;

    /**
     * 密码
     */
    private String password;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 用户ID
     */
    private Integer userid;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 最后登录日期
     */
    private Date lastlogindate;

    /**
     * 最后退出日期
     */
    private Date lastlogoutdate;

    /**
     * 云用户ID
     */
    private String clouduserid;

    /**
     * 是否pc用户
     */
    private Boolean isweb;

    /**
     * 皮肤
     */
    private String skinvalue;

    /**
     * 分组名称
     */
    private String groupname;

    /**
     * 移动端用户
     */
    private Boolean ismobile;

    /**
     * 角色编码
     */
    private String rolecode;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIscontrollogin() {
        return iscontrollogin;
    }

    public void setIscontrollogin(Boolean iscontrollogin) {
        this.iscontrollogin = iscontrollogin;
    }

    public Integer getCaccNum() {
        return caccNum;
    }

    public void setCaccNum(Integer caccNum) {
        this.caccNum = caccNum;
    }

    public Integer getIdwebserver() {
        return idwebserver;
    }

    public void setIdwebserver(Integer idwebserver) {
        this.idwebserver = idwebserver;
    }

    public Boolean getIsstoped() {
        return isstoped;
    }

    public void setIsstoped(Boolean isstoped) {
        this.isstoped = isstoped;
    }

    public String getCdkey() {
        return cdkey;
    }

    public void setCdkey(String cdkey) {
        this.cdkey = cdkey;
    }

    public Boolean getIsdst() {
        return isdst;
    }

    public void setIsdst(Boolean isdst) {
        this.isdst = isdst;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public Date getLastlogindate() {
        return lastlogindate;
    }

    public void setLastlogindate(Date lastlogindate) {
        this.lastlogindate = lastlogindate;
    }

    public Date getLastlogoutdate() {
        return lastlogoutdate;
    }

    public void setLastlogoutdate(Date lastlogoutdate) {
        this.lastlogoutdate = lastlogoutdate;
    }

    public String getClouduserid() {
        return clouduserid;
    }

    public void setClouduserid(String clouduserid) {
        this.clouduserid = clouduserid;
    }

    public Boolean getIsweb() {
        return isweb;
    }

    public void setIsweb(Boolean isweb) {
        this.isweb = isweb;
    }

    public String getSkinvalue() {
        return skinvalue;
    }

    public void setSkinvalue(String skinvalue) {
        this.skinvalue = skinvalue;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname;
    }

    public Boolean getIsmobile() {
        return ismobile;
    }

    public void setIsmobile(Boolean ismobile) {
        this.ismobile = ismobile;
    }

    public String getRolecode() {
        return rolecode;
    }

    public void setRolecode(String rolecode) {
        this.rolecode = rolecode;
    }
}