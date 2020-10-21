package cn.com.yzton.primary.entity;

import org.springframework.util.Base64Utils;

import java.io.Serializable;
import java.util.Date;

/**
 * eap_configpath 系统配置
 *
 * @author
 */
public class EapConfigPath implements Serializable {
    /**
     * 主键
     */
    private String id;

    /**
     * 数据库路径
     */
    private String path;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 密码
     */
    private String password;

    /**
     * 是否是本地
     */
    private Boolean islocal;

    /**
     * 别名
     */
    private String alias;

    /**
     * 域名
     */
    private String domainName;

    /**
     * 机器名
     */
    private String machineName;

    /**
     * 数据库服务器名或IP
     */
    private String databaseserver;

    /**
     * 数据库登用户名
     */
    private String dataUser;

    /**
     * 数据库登录密码
     */
    private String dataPwd;

    /**
     * 管理员登陆密码
     */
    private String adminpassword;

    /**
     * 管理员最后登陆日期
     */
    private Date adminlastlogindate;

    /**
     * 系统版本号
     */
    private String sysversionno;

    /**
     * 服务器ID
     */
    private String serviceid;

    /**
     * 账套长度
     */
    private Integer codelength;

    /**
     * 已经废弃
     */
    private String enswarrant;

    /**
     * 租户ID
     */
    private String idtenant;

    /**
     * 密码升级状态
     */
    private Boolean upgradepwdstate;

    /**
     * 密码恢复设置
     */
    private String pwdrecoverset;

    /**
     * 皮肤值
     */
    private String skinvalue;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getIslocal() {
        return islocal;
    }

    public void setIslocal(Boolean islocal) {
        this.islocal = islocal;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getMachineName() {
        return machineName;
    }

    public void setMachineName(String machineName) {
        this.machineName = machineName;
    }

    public String getDatabaseserver() {
        return databaseserver;
    }

    public void setDatabaseserver(String databaseserver) {
        this.databaseserver = databaseserver;
    }

    public String getDataUser() {
        return dataUser;
    }

    public void setDataUser(String dataUser) {
        this.dataUser = dataUser;
    }

    public String getDataPwd() {
        return dataPwd;
    }

    public void setDataPwd(String dataPwd) {
        this.dataPwd = dataPwd;
    }

    public String getAdminpassword() {
        return adminpassword;
    }

    //Base64加密
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = new String(Base64Utils.encode(adminpassword.getBytes()));
    }

    public Date getAdminlastlogindate() {
        return adminlastlogindate;
    }

    //获取系统时间
    public void setAdminlastlogindate(Date adminlastlogindate) {
//        adminlastlogindate = new Date(System.currentTimeMillis());
        this.adminlastlogindate = adminlastlogindate;
    }

    public String getSysversionno() {
        return sysversionno;
    }

    public void setSysversionno(String sysversionno) {
        this.sysversionno = sysversionno;
    }

    public String getServiceid() {
        return serviceid;
    }

    //Base64加密
    public void setServiceid(String serviceid) {
        this.serviceid = new String(Base64Utils.encode(serviceid.getBytes()));
    }

    public Integer getCodelength() {
        return codelength;
    }

    public void setCodelength(Integer codelength) {
        this.codelength = codelength;
    }

    public String getEnswarrant() {
        return enswarrant;
    }

    public void setEnswarrant(String enswarrant) {
        this.enswarrant = enswarrant;
    }

    public String getIdtenant() {
        return idtenant;
    }

    public void setIdtenant(String idtenant) {
        this.idtenant = idtenant;
    }

    public Boolean getUpgradepwdstate() {
        return upgradepwdstate;
    }

    public void setUpgradepwdstate(Boolean upgradepwdstate) {
        this.upgradepwdstate = upgradepwdstate;
    }

    public String getPwdrecoverset() {
        return pwdrecoverset;
    }

    public void setPwdrecoverset(String pwdrecoverset) {
        this.pwdrecoverset = pwdrecoverset;
    }

    public String getSkinvalue() {
        return skinvalue;
    }

    public void setSkinvalue(String skinvalue) {
        this.skinvalue = skinvalue;
    }
}