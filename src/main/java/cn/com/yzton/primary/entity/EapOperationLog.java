package cn.com.yzton.primary.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * eap_operationlog
 * @author 
 */
public class EapOperationLog implements Serializable {
    /**
     * 编号
     */
    private Long id;

    /**
     * 操作类型
     */
    private Boolean operatetype;

    /**
     * 账套号
     */
    private String accountid;

    /**
     * 账套名称
     */
    private String accountname;

    /**
     * 操作名称
     */
    private String operate;

    /**
     * 操作人
     */
    private String userid;

    /**
     * 操作人
     */
    private String username;

    /**
     * 访问设备
     */
    private String machinename;

    /**
     * 时间
     */
    private Date time;

    /**
     * 单据号
     */
    private String docno;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 模块编码
     */
    private String modulecode;

    /**
     * 功能编号
     */
    private String functioncode;

    /**
     * FunctionName
     */
    private String functionname;

    /**
     * ProductName
     */
    private String productname;

    /**
     * 时间
     */
    private Date functiondate;

    /**
     * 开发描述
     */
    private String devdesc;

    /**
     * 开发行
     */
    private Boolean isdevrow;

    /**
     * 生成程序
     */
    private Integer apptype;

    /**
     * 描述
     */
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getOperatetype() {
        return operatetype;
    }

    public void setOperatetype(Boolean operatetype) {
        this.operatetype = operatetype;
    }

    public String getAccountid() {
        return accountid;
    }

    public void setAccountid(String accountid) {
        this.accountid = accountid;
    }

    public String getAccountname() {
        return accountname;
    }

    public void setAccountname(String accountname) {
        this.accountname = accountname;
    }

    public String getOperate() {
        return operate;
    }

    public void setOperate(String operate) {
        this.operate = operate;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMachinename() {
        return machinename;
    }

    public void setMachinename(String machinename) {
        this.machinename = machinename;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getDocno() {
        return docno;
    }

    public void setDocno(String docno) {
        this.docno = docno;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getModulecode() {
        return modulecode;
    }

    public void setModulecode(String modulecode) {
        this.modulecode = modulecode;
    }

    public String getFunctioncode() {
        return functioncode;
    }

    public void setFunctioncode(String functioncode) {
        this.functioncode = functioncode;
    }

    public String getFunctionname() {
        return functionname;
    }

    public void setFunctionname(String functionname) {
        this.functionname = functionname;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public Date getFunctiondate() {
        return functiondate;
    }

    public void setFunctiondate(Date functiondate) {
        this.functiondate = functiondate;
    }

    public String getDevdesc() {
        return devdesc;
    }

    public void setDevdesc(String devdesc) {
        this.devdesc = devdesc;
    }

    public Boolean getIsdevrow() {
        return isdevrow;
    }

    public void setIsdevrow(Boolean isdevrow) {
        this.isdevrow = isdevrow;
    }

    public Integer getApptype() {
        return apptype;
    }

    public void setApptype(Integer apptype) {
        this.apptype = apptype;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}