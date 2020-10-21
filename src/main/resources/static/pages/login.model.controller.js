/* path:./login.model.js?2019/1/8 3:02:58
login.controller.js?2019/1/8 3:02:56
../clientversion.js?2019/1/11 7:56:34
../../app/viewextend.js?2019/1/8 2:41:44 */
/*--------start file:login.model.js-------------*/
define("login.model", ["jquery", "tp.modelStorage"], function ($, modelStorage, mBinder) {
    var service = $.service("ajaxpro/Ufida.T.SM.Login.UIP.LoginManager,Ufida.T.SM.Login.UIP.ashx", ["ValidatePassword", "CheckPassword", "ReLoginIn", "ClearUserMutex", "GetAccountsByUser", "GET:GetCompanyNameandAQD", "GetCompanyInfo", "GetVersionType", "GetUserVersionType", "SetWebServerShutDown", "ValidCloudUser", "ChkNet", "GetAuthCodeForLoginUrl", "CloudUserLogin", "GetEmail", "AddOperateLog", "UnRegister", "IsBindToComputer", "InsertComputerInfo",
        "GetAQDKeyState", "UpdateComputerInfo", "GetAQDBindingUser", "AQDGetAccounts", "GetCurentV", "CheckIsAccountAdmin", "GetActivateUrl", "SaveActivate", "GetDemoAccountNum", "GetDemoUserByRole", "HasDemoAccount"]);
    var activateService = $.service("ajaxpro/Ufida.T.SM.Login.UIP.ActivateHandler,Ufida.T.SM.Login.UIP.ashx", ["GetActivateUrl", "SaveActivate", "GetTrialUrl"]);
    service.getCheckCode = function (success) {
        $.get($.baseUrl + "img/checkcode.ashx?" + Math.random(), success)
    };
    var model = $.extend(modelStorage({
        userName: "",
        userNameBak: "",
        IsAccountAdmin: false,
        accountNum: "",
        accountText: "",
        accountName: "",
        accountID: "",
        webAppName: "",
        webAppID: "",
        isAdmin: false,
        errorCount: 0,
        version: "",
        company: "",
        loginDate: "",
        domain: "",
        keyArray: "",
        versionType: "",
        versionNo: "",
        specialEdition: "",
        appState: "",
        orgId: "",
        cloudUserId: "",
        UserId: "",
        md5Password: "",
        isCloudDeployment: "",
        lastLoginedAccNum: "",
        contacts: "",
        contactPhone: "",
        cloudEncryptionId: "",
        tipClosed: false,
        checkDogType: "",
        browserSetClosed: false,
        appMode: "",
        versionAuthTag: ""
    }), {
        password: "",
        passwordHide: "",
        accountList: [],
        isSupportPlugin: false,
        aqdKey: "",
        keyID: "",
        keyStatus: "",
        aqdEnabled: false,
        aqdAllowNoKey: false,
        lockToAdmin: false,
        showCheckCode: false,
        checkCodeValue: "",
        checkCodeImgUrl: "",
        checkCodeInputed: "",
        checkDogResult: "",
        curDomain: "",
        activate_url: "",
        activate_guid: "",
        isActive: true,
        trail_url: "",
        trail_guid: ""
    }, {
        setisAdmin: function (value) {
            this.isAdmin = value;
            if (model.specialEdition == "edu" && value == true) $("#forgetpwdlink").css("display", "none")
        }, setDeployeeType: function () {
            var is130 = this.versionNo.indexOf("13.") ===
                0;
            if (model.isCloudDeployment && model.isCloudDeployment == true) {
                $(".t-table").removeClass("t-soft").addClass("t-cloud");
                $("#isAdmin").siblings("span").text("企业管理员");
                $("#divCbx").css("display", "block");
                $("#divLbl").css("display", "none");
                $("#register").css("display", "");
                $("#divAccount").css("display", "none");
                $("#userName").attr("placeholder", "请输入手机号/邮箱");
                if (model.isAdmin) $("#password").removeAttr("required"); else $("#password").attr("required", "required");
                var t = (new Date).getTime();
                var gonggaoUrl = "https://t.static.chanjet.com/notice/init.html?t=" +
                    t;
                if (is130) gonggaoUrl = "https://t.static.chanjet.com/notice/init_130.html?t=" + t;
                if (noticeVersion.cloud) gonggaoUrl += "&v=" + noticeVersion.cloud;
                $(".t-gonggao").attr("href", gonggaoUrl)
            } else {
                $(".t-table").removeClass("t-cloud").addClass("t-soft");
                $("#isAdmin").siblings("span").text("系统管理员");
                $("#divCbx").css("display", "block");
                $("#divLbl").css("display", "none");
                $("#register").css("display", "none");
                $("#divAccount").css("display", "");
                $("#userName").attr("placeholder", "请输入手机号/邮箱/账号");
                var gonggaoUrl = "https://t.static.chanjet.com/notice/soft.html";
                if (is130) gonggaoUrl = "https://t.static.chanjet.com/notice/soft_130.html";
                if (noticeVersion.soft) gonggaoUrl += "?v=" + noticeVersion.soft;
                $(".t-gonggao").attr("href", gonggaoUrl)
            }
            $(".t-cloud .t-cloud-remove").remove();
            $(".t-soft .t-soft-remove").remove()
        }, setpasswordHide: function (value) {
            model.setuserName(value, "password")
        }, setuserName: function (value, property) {
            if (value) value = value.trim();
            $("#forgetpwdlink").css("display", "");
            this[property] = value;
            if (model.isCloudDeployment && model.isCloudDeployment == true) if (property ==
                "userName" && value) {
                var isValid = model.chkMobileOrEmailFormat(value);
                if (!isValid) {
                    $(model).trigger("loginError", [{
                        code: ".ContentErrorException",
                        message: "为提升账号安全，仅支持以手机号或邮箱登录，<br/>请重新输入登录账号。"
                    }]);
                    return
                }
            }
            if (this.userName && model.isAdmin == false) {
                if (!model.CheckBindAQD(model.isAdmin)) return;
                if (model.aqdEnabled) model.CheckBindUser(); else {
                    this.loadAccountList();
                    return []
                }
            } else {
                model.accountList = [];
                model.accountText = "";
                model.accountNum = "";
                model.accountID = "";
                model.versionNo = "";
                model.webAppID = "";
                model.webAppName =
                    "";
                if (property == "password") return {};
                return {"password": "", "passwordHide": "", "accountList": "", "accountText": "", "accountNum": ""}
            }
        }, getLoginName: function () {
            if (this.userName && this.userName.indexOf("\\") > -1) return this.userName;
            if (this.curDomain) return this.curDomain + "\\" + this.userName;
            if (this.domain) return this.domain + "\\" + this.userName;
            return this.userName
        }, getUrlParam: function (name) {
            var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)");
            var r = window.location.search.substr(1).match(reg);
            if (r != null) return unescape(r[2]);
            return null
        }, assignKey: function (SourceKey) {
            switch (SourceKey) {
                case "16":
                    return event.shiftKey;
                    break;
                case "17":
                    return event.ctrlKey;
                    break;
                case "18":
                    return event.altKey;
                    break
            }
            return false
        }, keyCompare: function (keyCode, dataKey) {
            if (keyCode >= 96 && keyCode <= 105) return keyCode - 48 == parseInt(dataKey); else return keyCode == parseInt(dataKey)
        }, setCookie: function (name, value) {
            var Days = 365;
            var exp = new Date;
            exp.setTime(exp.getTime() + Days * 24 * 60 * 60 * 1E3);
            document.cookie = name + "=" + escape(value) + ";expires=" + exp.toGMTString()
        },
        getCookie: function (name) {
            var arr = document.cookie.match(new RegExp("(^| )" + name + "=([^;]*)(;|$)"));
            if (arr != null) return unescape(arr[2]);
            return null
        }, delCookie: function (name) {
            var exp = new Date;
            exp.setTime(exp.getTime() - 1);
            var cval = model.getCookie(name);
            if (cval != null) document.cookie = name + "=" + cval + "; expires=" + exp.toGMTString()
        }, delCookieWithPath: function (name) {
            var exp = new Date;
            exp.setTime(exp.getTime() - 1);
            var cval = model.getCookie(name);
            if (cval != null) document.cookie = name + "=" + cval + "; expires=" + exp.toGMTString() +
                "; path=/"
        }
    }, {
        _init: function () {
            var from = model.getUrlParam("from");
            if (from == "install") {
                model.setisAdmin(true);
                var tempclass = $("#isUser").offsetParent().attr("class");
                $("#isUser").offsetParent().attr("class", $("#isAdmin").offsetParent().attr("class"));
                $("#isAdmin").offsetParent().attr("class", tempclass)
            } else if (from == "exp") {
                var industryCode = model.getUrlParam("industryCode");
                var groupCode = model.getUrlParam("groupCode");
                var accNum = model.getUrlParam("accNum");
                model.getDemoUserByRole(industryCode, groupCode,
                    accNum, from);
                return
            } else model.setisAdmin(false);
            model.showAdmin(0);
            model.InitBrowerSet();
            model.InitAcitveXTips();
            service.HasDemoAccount(function (ret) {
                if (ret == true) model.InitExpBtn()
            }, function (error) {
            });
            if (model.IsSupportPlugin()) {
                model.isSupportPlugin = true;
                var plugin = $('<embed type="application/NPCheckUsbKey30117" width="0" height="0" id="HTCOM" ><embed id = "Splugin" type="application/npGetPCInfo" width ="0" height ="0" >');
                $("#plugins").append(plugin)
            }
            service.GetVersionType({async: false}, function (ret) {
                model.versionType =
                    ret.VersionType;
                model.specialEdition = ret.SpecialEdition;
                var logoTicon = "ticon-" + model.versionType;
                if (model.specialEdition && model.specialEdition != "not") {
                    logoTicon += "_" + model.specialEdition.toLowerCase();
                    if (model.specialEdition == "edu" && model.isAdmin == true) $("#forgetpwdlink").css("display", "none")
                }
                $("#logoimg").addClass(logoTicon);
                if (!model.isCloudDeployment) {
                    model.isCloudDeployment = ret.IsCloudDeployment;
                    model.setDeployeeType()
                } else model.setDeployeeType();
                if (model.isCloudDeployment) $(".t-cloud-hidden").remove();
                else {
                    model.getLoginLogo();
                    $(".t-cloud-show").remove();
                    $("body > div.t-table").removeClass("t-cloud")
                }
                model.isActive = ret.isActive
            }, function (error) {
                $(".t-cloud-show").remove();
                $("body > div.t-table").removeClass("t-cloud");
                $.showMessageBoxTitle("提示", error.message, function (btn, dialog) {
                    var yes = btn.attr("id") == "yes";
                    dialog.modal("hide")
                })
            });
            if (from == "install") {
                if (!model.checkGenuine()) {
                    model.setisAdmin(false);
                    var tempclass = $("#isUser").offsetParent().attr("class");
                    $("#isUser").offsetParent().attr("class",
                        $("#isAdmin").offsetParent().attr("class"));
                    $("#isAdmin").offsetParent().attr("class", tempclass);
                    model.showAdmin();
                    return
                }
                var d = new Date;
                this.loginDate = $.dateFormat(d);
                var params = {
                    AccountNum: "000",
                    UserName: "admin",
                    Password: $.md5(""),
                    rdpYear: d.getFullYear() + "",
                    rdpMonth: d.getMonth() + 1 + "",
                    rdpDate: d.getDate() + "",
                    webServiceProcessID: "admin",
                    ali_csessionid: "",
                    ali_sig: "",
                    ali_token: "",
                    ali_scene: "",
                    role: "",
                    aqdKey: "",
                    fromWhere: "browser"
                };
                service.CheckPassword(params, function (value) {
                    $.showModal("ChangePassword.aspx",
                        {
                            width: 620,
                            height: 300,
                            title: "修改密码",
                            obj: {UserName: "admin", FirstLogin: 1, From: "install"},
                            cb: function (result) {
                                if (result == true) {
                                    var url = "portal/portal.html?from=install";
                                    model.webAppName && (url = "/" + model.webAppName + "/view/" + url);
                                    location = url
                                }
                            }
                        });
                    var versionKey = $.baseUrl.toLowerCase() + $.viewUrl + "/version";
                    var versionVal = localStorage.getItem(versionKey);
                    model.version = versionVal ? versionVal.replace('"', "").replace('"', "") : "";
                    model._save()
                }, function (error) {
                    if (error && error.code == "Ufida.T.SM.Login.DTO.FirstLoginException") {
                        $.showModal("ChangePassword.aspx",
                            {
                                width: 620,
                                height: 300,
                                title: "修改密码",
                                obj: {UserName: "admin", FirstLogin: 1, From: "install"},
                                cb: function (result) {
                                    if (result == true) {
                                        var url = "portal/portal.html?from=install";
                                        model.webAppName && (url = "/" + model.webAppName + "/view/" + url);
                                        location = url
                                    }
                                }
                            });
                        var versionKey = $.baseUrl.toLowerCase() + $.viewUrl + "/version";
                        var versionVal = localStorage.getItem(versionKey);
                        model.version = versionVal ? versionVal.replace('"', "").replace('"', "") : "";
                        model._save()
                    } else if (error && error.code == "Ufida.T.SM.Login.DTO.AdminEmptyPwdException") $(model).trigger("loginError",
                        [{code: error.code, message: error.message}])
                });
                return
            }
            var username = model.getUrlParam("AdminNum");
            var accountnum = model.getUrlParam("AccountNum");
            if (username != null && accountnum != null) {
                model.accountNum = accountnum;
                model.userNameBak = model.userName = username
            }
            this.loginDate = $.dateFormat(new Date);
            model.showCheckCode = model.errorCount > 3;
            if (model.showCheckCode) this.loadCheckCode();
            var istenant = false;
            if (window.location.search.indexOf("domain=") > -1) {
                var n = window.location.search.split("domain=");
                n = n[1] && n[1].split("?")[0].split("&")[0];
                model.curDomain = n;
                if (n == "") model.domain = n; else istenant = true
            }
            var domainhost = ".xxx.xx";
            if (location.hostname.indexOf(domainhost) != -1) {
                var n = location.hostname.split(domainhost)[0];
                model.curDomain = n;
                if (n == "www") model.domain = ""; else istenant = true
            }
            if (!istenant) model.domain = model.curDomain = "";
            var _this = this;
            service.GetCompanyNameandAQD(function (ret) {
                model.Remind = ret.Remind;
                model.checkDogType = ret.DogType;
                model.company = ret.CompanyName;
                model.contacts = ret.Contacts;
                model.contactPhone = ret.ContactPhone;
                model.cloudEncryptionId =
                    ret.CloudEncryptionId;
                model.versionAuthTag = ret.legal;
                model._save({company: 1, contacts: 1, contactPhone: 1, cloudEncryptionId: 1, checkDogType: 1});
                if (model.Remind == 1) $("#lanpan-tishi").css("display", "block");
                if (model.company == "激活" || ret.DogFile != 0) {
                    $("#cmyName").text("");
                    $("#contactUser").text("");
                    $("#telNum").text("");
                    model.initAuthDiv(false)
                } else {
                    $("#cmyName").text(model.company);
                    $("#contactUser").text(model.contacts);
                    $("#telNum").text(model.contactPhone);
                    model.initAuthDiv(true)
                }
                if (model.company == "激活" ||
                    model.checkDogType || ret.DogFile != 0 || model.isCloudDeployment) {
                    $("#cmyName2").text("");
                    $("#downloadAuth").hide()
                } else {
                    $("#cmyName2").text(model.company);
                    $("#downloadAuth").show()
                }
                _this.reloadSettingDiv();
                model.ShowPackageType(ret.PackageType);
                model.appMode = ret.AppMode;
                model.checkDogFile(ret.DogFile);
                if (!model.keyArray || model.keyArray != ret.KeyArray) model.keyArray = ret.KeyArray;
                model.aqdEnabled = ret.AQDIsEnabled;
                model.aqdAllowNoKey = ret.AQDAllowNoKey;
                model.isActive = ret.isActive;
                if (false == model.AQDPlugCheck()) return;
                if (model.aqdEnabled) {
                    if (model.keyID == "") model.GetAQDKeyID();
                    if (model.keyStatus != "1" && !model.aqdAllowNoKey) {
                        model.AlertInsertKey();
                        return
                    }
                    var computerInfo = model.GetAQDComputerInfo();
                    if (model.aqdKey == "") model.aqdKey = model.keyID + "_computerInfo:" + computerInfo;
                    model.CheckAQDKeyState()
                } else model.loadAccountList()
            }, function (error) {
                model.initAuthDiv(false);
                model.company = "演示版";
                model._save({company: 1});
                $(".left-bottom a").html(model.company)
            })
        }, initAuthDiv: function (isActivated) {
            var isCloud = model.isCloudDeployment;
            var parentClass = ".t-soft ";
            if (isCloud) parentClass = ".t-cloud";
            if (isActivated) {
                $(parentClass + ".t-li-auth").hide();
                $(parentClass + ".t-li-authinfo").show()
            } else {
                $(parentClass + ".t-li-auth").show();
                $(parentClass + ".t-li-authinfo").hide()
            }
        }, showAdmin: function (flg) {
            if (model.isAdmin) if (model.isCloudDeployment) {
                model.accountText = "企业管理员";
                model.changed("accountText");
                $("#loginDate").attr("readonly", "readonly");
                $("#accountText").hide();
                $("#isAdmin").attr("checked", true);
                model.isAdmin = true;
                model.changed("isAdmin");
                model.userName = "";
                model.password = "";
                model.changed("userName");
                model.changed("password");
                $("#loadAccountList").attr("disabled", true);
                $("#loadAccountList").hide();
                $("#accountText").closest(".input-group").addClass("disabled");
                $("#divAccount").css("display", "none")
            } else {
                model.accountText = "系统管理员";
                model.changed("accountText");
                $("#userName,#accountText,#loginDate").attr("readonly", "readonly");
                $("#isAdmin").attr("checked", true);
                model.isAdmin = true;
                model.userName = "admin";
                model.password = "";
                model.changed("isAdmin");
                model.changed("userName");
                model.changed("password");
                $("#loadAccountList").attr("disabled", true);
                $("#loadAccountList").hide();
                $("#divAccount").css("display", "");
                $("#userName,#accountText").closest(".input-group").addClass("disabled")
            } else {
                $("#userName,#accountText,#loginDate").removeAttr("readonly");
                $("#accountText").show();
                $("#isUser").attr("checked", true);
                model.isAdmin = false;
                if (model.userNameBak.split("\\").length > 1) model.userName = model.userNameBak.split("\\")[1]; else model.userName = model.userNameBak;
                model.accountText = "账套";
                if (flg == 1) model.setuserName(model.userName, "userName");
                model.changed("accountText");
                model.changed("userName");
                model.password = "";
                model.changed("password");
                $("#loadAccountList").attr("disabled", false);
                $("#loadAccountList").show();
                $("#userName,#accountText").closest(".input-group").removeClass("disabled")
            }
        }, checkDogFile: function (ret) {
            if (typeof ret == "object") ret = ret.value;
            model.checkDogResult = ret;
            if (ret == 0) ; else if (ret == 1) model.MsgAlert(UIPGetResouce("Login", "Login1222")); else model.MsgAlert(UIPGetResouce("Login",
                "Login1223"))
        }, loadAccountList: function (e, callback, that, obj) {
            var cachekey = this.userName + "~" + this.password;
            if (e && e._name == null && this._preload == cachekey) return;
            this._preload = cachekey;
            if (model.aqdEnabled) {
                model.GetAQDKeyID();
                if (model.keyID != "") {
                    var computerInfo = model.GetAQDComputerInfo();
                    model.aqdKey = model.keyID + "_computerInfo:" + computerInfo
                }
                if (e) {
                    model.CheckBindUser(null, callback, that, obj);
                    return
                }
            } else {
                model.keyID = "";
                model.aqdKey = ""
            }
            var loginName = model.getLoginName();
            if (!loginName) return;
            if (loginName.indexOf("\\") >
                0 && (model.curDomain != "" && model.curDomain != loginName.split("\\")[0] || loginName.split("\\")[1] == "")) return;
            var params = {
                userName: loginName,
                pwd: $.md5(model.password),
                includeHide: model.getCookie("ShowDefaultAccount") != null,
                aqdKey: model.aqdKey
            };
            if (model.isCloudDeployment) {
                var isFromLoginBtn = false;
                if (callback == this.login) isFromLoginBtn = true;
                params = {
                    userName: loginName,
                    pwd: $.md5(model.password),
                    includeHide: model.getCookie("ShowDefaultAccount") != null,
                    aqdKey: model.aqdKey,
                    isCloudDeployment: false,
                    isFromLoginBtn: isFromLoginBtn,
                    fromWhere: "browser"
                }
            }
            if (!model.isAdmin && model.isCloudDeployment && model.isCloudDeployment == true) if (!model.password) {
                model.accountList = [];
                model.accountText = "";
                model.changed({accountList: model.accountList, accountText: model.accountText});
                $("#divAccount").css("display", "none");
                return
            }
            service.GetAccountsByUser(params, function (value) {
                if (document.getElementById("accountText").value != "系统管理员") {
                    model.handleLoadAccount(value);
                    if (callback) callback.call(that, e, model.accountList, obj, value)
                }
            }, function (error) {
                model.enableLoginBtn();
                $(model).trigger("loginError", [{code: error.code, message: error.message}]);
                return
            })
        }, enableLoginBtn: function () {
            if ($("button[class*='t-login']").attr("disabled")) $("button[class*='t-login']").attr("disabled", false).css("cursor", "pointer").text("登录")
        }, disableLoginBtn: function () {
            if (!$("button[class*='t-login']").attr("disabled")) $("button[class*='t-login']").attr("disabled", true).css("cursor", "not-allowed").text("登录中. . .")
        }, handleLoadAccount: function (value) {
            if (model.aqdEnabled) if (value && value.length ==
                1 && value[0][0] == true) if (value[0][1] == true) model.WrongAQDAlert();
            model.accountList = [];
            model.accountText = "";
            model.accountID = "";
            model.versionNo = "";
            model.webAppID = "";
            model.webAppName = "";
            var haveSameVal = 0;
            model.UserId = "";
            if (value && value.length > 1) {
                if (value.length <= 2 && model.isCloudDeployment == true) $("#divAccount").css("display", "none"); else {
                    if (!model.isAdmin) $("#divAccount").css("display", "");
                    if ($(".datetimepicker").css("display") != "none") $(".datetimepicker").css("top", $(".datetimepicker").offset().top +
                        46)
                }
                var accountArray = $.map(value, function (item, index) {
                    return [item]
                });
                accountArray.splice(0, 1);
                model.accountList = accountArray;
                var accNum;
                if (model.accountNum) accNum = model.accountNum; else accNum = model.lastLoginedAccNum;
                var curr = 1;
                for (var i = 1; i < value.length; i++) if (accNum == value[i][1]) {
                    curr = i;
                    haveSameVal = 1;
                    break
                }
                if (haveSameVal == 0) curr = 1;
                model.webAppName = value[curr][4];
                model.webAppID = value[curr][3];
                model.accountText = value[curr][2];
                model.accountNum = value[curr][1];
                model.accountID = value[curr][0];
                model.appState =
                    value[curr][5];
                model.orgId = value[curr][6];
                model.cloudUserId = value[curr][7];
                model.UserId = value[curr][8];
                model.versionNo = value[curr][9];
                model.md5Password = $.md5(model.password);
                for (var i = 0; i < model.accountList.length; ++i) model.accountList[i][2] = model.cutAccountText(model.accountList[i][2]);
                model.accountText = model.cutAccountText(model.accountText)
            }
            model.changed({accountList: model.accountList, accountText: model.accountText});
            if (model.accountList.length > 0) setTimeout("$('#accountText').select()", 100)
        }, changeWebServer: function (cb,
                                      err) {
            var curWebServerID = model.webAppID;
            service.SetWebServerShutDown({webServerID: model.webAppID, accNum: model.accNum}, function (value) {
                model.webAppID = value;
                $.each(model.accountList, function (i, v) {
                    if (v.webAppID == curWebServerID) v.webAppID = value
                });
                cb && cb(value)
            }, function (error) {
                err && err(error)
            })
        }, getDocumentValue: function (id) {
            if (document.getElementById(id)) return document.getElementById(id).value;
            return ""
        }, changePassword: function (obj) {
            if (model.IsDate(this.loginDate)) {
                var d = new Date;
                if (this.loginDate) {
                    this.loginDate =
                        model.ChangeDate(this.loginDate);
                    d = $.datePrase(this.loginDate)
                }
                if (model.aqdEnabled == true || model.isCloudDeployment) {
                    model.GetAQDKeyID();
                    var computerInfo = model.GetAQDComputerInfo();
                    model.aqdKey = model.keyID + "_computerInfo:" + computerInfo
                }
                var ali_csessionid = this.getDocumentValue("hid_ali_csessionid");
                var ali_sig = this.getDocumentValue("hid_ali_sig");
                var ali_token = this.getDocumentValue("hid_ali_token");
                var ali_scene = this.getDocumentValue("hid_ali_scene");
                var role = "";
                if (model.isCloudDeployment) if (model.isAdmin) role =
                    "EnterpriseAdmin"; else role = "EnterpriseUser";
                var params = {
                    AccountNum: this.accountNum,
                    UserName: this.getLoginName(),
                    Password: $.md5(this.password),
                    rdpYear: d.getFullYear() + "",
                    rdpMonth: d.getMonth() + 1 + "",
                    rdpDate: d.getDate() + "",
                    webServiceProcessID: model.webAppID,
                    ali_csessionid: ali_csessionid,
                    ali_sig: ali_sig,
                    ali_token: ali_token,
                    ali_scene: ali_scene,
                    role: role,
                    aqdKey: model.aqdKey,
                    fromWhere: "browser"
                };
                service.CheckPassword(params, function (value) {
                    model.enableLoginBtn();
                    $("#isAdmin").attr("readonly", false);
                    $("#isUser").attr("readonly",
                        false);
                    if (model.userName.indexOf("\\") > 0 && (model.curDomain == "" || model.curDomain != model.userName.split("\\")[0])) {
                        model.curDomain = model.userName.split("\\")[0];
                        model.userName = model.userName.split("\\")[1]
                    }
                    model.domain = model.curDomain;
                    model.errorCount = 0;
                    model.showCheckCode = false;
                    model._save({domain: 1, errorCount: 1});
                    model.loginauthcode = model._storage.loginauthcode = Math.round(Math.random() * 1E4).toString();
                    model._save({
                        userName: "",
                        accountNum: "",
                        accountText: "",
                        accountName: "",
                        loginauthcode: ""
                    }, window.sessionStorage);
                    if (model.isCloudDeployment) service.GetUserVersionType({async: false}, function (ret) {
                        model.versionType = ret.VersionType;
                        model.cloudUserId = ret.clouduserid;
                        model.versionNo = ret.versionNo;
                        model._save({
                            versionType: ret.VersionType,
                            cloudUserId: ret.clouduserid,
                            versionNo: ret.versionNo
                        }, window.sessionStorage)
                    });
                    var versionKey = $.baseUrl.toLowerCase() + $.viewUrl + "/version";
                    var versionVal = localStorage.getItem(versionKey);
                    model.version = versionVal ? versionVal.replace('"', "").replace('"', "") : "";
                    model._save();
                    $(model).trigger("loginSuccess",
                        [value]);
                    if (model.isAdmin == false) model.userNameBak = model.userName
                }, function (error) {
                    model.enableLoginBtn();
                    if (model.isCloudDeployment && error.message == "WrongCheckCode") {
                        $(model).trigger("loginError", [{
                            code: "Ufida.T.SM.Login.DTO.CheckCodeErrorException",
                            message: "验证码不正确"
                        }]);
                        model.loadCheckCode();
                        return
                    }
                    if (error.message == "NoAdminAQD") {
                        if (model.aqdKey && model.aqdKey.indexOf("3758227465_computerInfo:") == 0) model.AlertInsertAdminKey(); else model.AlertExceptionMsg("AQD0016");
                        return
                    } else if (error.message == "AQD0002") {
                        if (model.AQDPlugCheck(error.message)) model.AlertExceptionMsg(error.message);
                        return
                    } else if (error.message == "AQD0012" || error.message == "AQD0011" || error.message == "AQD0015") {
                        model.AlertExceptionMsg(error.message);
                        return
                    } else if (error.message == "AQD0003") {
                        if (model.AQDPlugCheck(error.message)) model.AQDAlertWithClose(UIPGetResouce("Login", error.message));
                        return
                    } else if (error.message == "AQD0009") {
                        model.CheckBindComputer("true", "false");
                        return
                    } else if (error.message == "AQD0006") {
                        model.CheckBindComputer("false", "false");
                        return
                    } else if (model.isAdmin == true) model.lockToAdmin = true;
                    if (error.code &&
                        (error.code.indexOf("ContentErrorException") > -1 || error.code.indexOf("DateNotPeriodException") > -1)) model.HandleCheckCode();
                    if (error.Response.status == 504) {
                        var oDate = new Date;
                        oDate.setDate(oDate.getDate() - 1);
                        document.cookie = "_sid=;path=/; expires=" + oDate.toGMTString();
                        model.changeWebServer(function () {
                            model.login(e, acclist)
                        });
                        return
                    }
                    if (error.code && error.code.indexOf("FirstLoginException") > -1) {
                        service.ChkNet(function (ret) {
                            if (ret == false && loginInfo.appState && loginInfo.appState == "1" && model.user.cloudUserId &&
                                model.user.cloudUserId.length > 0) {
                                model.domain = model.curDomain;
                                model.errorCount = 0;
                                model.showCheckCode = false;
                                model._save({domain: 1, errorCount: 1});
                                $(model).trigger("loginSuccess", [true])
                            } else $(model).trigger("loginError", [error])
                        });
                        var versionKey = $.baseUrl.toLowerCase() + $.viewUrl + "/version";
                        var versionVal = localStorage.getItem(versionKey);
                        model.version = versionVal ? versionVal.replace('"', "").replace('"', "") : "";
                        model._save()
                    } else if (error.code && error.code.indexOf("AdminEmptyPwdException") > -1 && model.isAdmin) $(model).trigger("loginError",
                        [{code: error.code, message: error.message}]); else $(model).trigger("loginError", [error])
                });
                if (!this.isAdmin) {
                    this.userNameBak = this.userName;
                    this.accountName = this.accountText;
                    this.accountText = "";
                    this.accountList.length != 0;
                    this.versionType = model.versionType
                }
                return false
            } else $(model).trigger("loginError", [{code: ".ContentErrorException", message: "登录日期不是有效的日期"}])
        }, checkAdminAndWatchCertificate: function (password) {
            var d = new Date;
            service.ValidatePassword({userName: "admin", password: $.md5(password)}, function (result) {
                if (result ==
                    true) {
                    var tm = model.cloudEncryptionId || "";
                    $("#divAuthBeforeWatchCertificate").modal("hide");
                    setTimeout(function () {
                        window.open("http://tregister.chanjet.com/chaxun.aspx?TM=" + tm, "certificateWindow")
                    }, 300)
                } else $("#tipCheckAdmin").text("密码不正确")
            }, function (error) {
                $("#tipCheckAdmin").text("密码不正确")
            })
        }, toActivatePage: function () {
            var activate_url = "http://172.16.200.205:802/CencProductRegister.aspx?";
            var ret = model.getActivateUrl();
            if (ret) {
                activate_url = model.activate_url;
                localStorage.setItem("activate_url", model.activate_url);
                localStorage.setItem("acitvate_guid", model.activate_guid)
            } else return;
            var localHost = window.location.origin ? window.location.origin : window.location.protocol + "//" + window.location.host;
            var callBackUrl = localHost + "/tplus/view/activateTAction.html";
            callBackUrl = "&callback=" + encodeURIComponent(callBackUrl);
            var winUrl = activate_url + callBackUrl;
            window.open(winUrl)
        }, toTrialPage: function () {
            var ret = model.getTrialUrl();
            if (ret) {
                localStorage.setItem("trail_url", model.trail_url);
                localStorage.setItem("trail_guid", model.trail_guid);
                var localHost = window.location.origin ? window.location.origin : window.location.protocol + "//" + window.location.host;
                var callBackUrl = localHost + "/tplus/view/activateTAction.html";
                callBackUrl = "&callback=" + encodeURIComponent(callBackUrl);
                var url = model.trail_url + callBackUrl;
                window.open(url)
            }
        }, editCompanyInfo: function () {
            if (model.checkDogType) window.open("http://tregister.chanjet.com/new/ProduceRegisterM.htm?flag=usermodify", "Activate"); else model.toActivatePage()
        }, refreshCompanyInfo: function () {
            service.GetCompanyInfo(function (ret) {
                model.checkDogType =
                    ret.DogType;
                model.company = ret.CompanyName;
                model.contacts = ret.Contacts;
                model.contactPhone = ret.ContactPhone;
                model.cloudEncryptionId = ret.CloudEncryptionId;
                model._save({company: 1, contacts: 1, contactPhone: 1, cloudEncryptionId: 1, checkDogType: 1});
                if (model.company == "激活") {
                    $("#cmyName").text("");
                    $("#contactUser").text("");
                    $("#telNum").text("");
                    $(".t-li-auth").css("display", "block");
                    $(".t-li-authinfo").css("display", "none")
                } else {
                    $("#cmyName").text(model.company);
                    $("#contactUser").text(model.contacts);
                    $("#telNum").text(model.contactPhone);
                    $(".t-li-auth").css("display", "none");
                    $(".t-li-authinfo").css("display", "block")
                }
                if (model.company == "激活" || model.checkDogType) {
                    $("#cmyName2").text("");
                    $("#downloadAuth").hide()
                } else {
                    $("#cmyName2").text(model.company);
                    $("#downloadAuth").show()
                }
            }, function (error) {
            })
        }, UnRegister: function () {
            service.UnRegister({sessionID: "", clientType: ""})
        }, getDemoUserByRole: function (industryCode, groupCode, accNum, fromApp) {
            service.GetDemoUserByRole({
                industryCode: industryCode,
                groupCode: groupCode,
                accNum: accNum
            }, function (ret) {
                if (ret.success &&
                    ret.userName) {
                    if (model.isCloudDeployment) $.cookie("sid", ret.sid, {path: "/"});
                    var user = ret.userName;
                    var pwd = ret.pwd;
                    var accNum = ret.accNum;
                    var usermodelStorage = $.modelStorage($.baseUrl + "view/login.html");
                    if (usermodelStorage != null && usermodelStorage["versionNo"] != null && usermodelStorage["versionNo"] != "") {
                        var preVersion = usermodelStorage["versionNo"];
                        var curVersion = ret.versionNo;
                        if (preVersion != "" && curVersion != "" && preVersion != curVersion) {
                            model.MsgAlert("T+产品升级了！请清除浏览器缓存后，<font color='red'>重新打开</font>浏览器登录！<br/><br/><p><a target='_blank' href='./clearcache.html'>如何清除浏览器缓存?</a></p>");
                            return false
                        }
                    }
                    if (usermodelStorage) {
                        var serverVersion = window.clientVersion;
                        var clientVersion = usermodelStorage["version"];
                        if (clientVersion && clientVersion != serverVersion) {
                            model.MsgAlert("T+产品升级了！请清除浏览器缓存后，<font color='red'>重新打开</font>浏览器登录！<br/><br/><p><a target='_blank' href='./clearcache.html'>如何清除浏览器缓存?</a></p>");
                            return false
                        }
                    }
                    var urlOrgin = window.location.origin ? window.location.origin : window.location.protocol + "//" + window.location.host;
                    var url = "";
                    if (fromApp == "b2b") url = urlOrgin + "/tplus/view/portal/portal.html?fromApp=" +
                        fromApp + "&user=" + user + "&pwd=" + pwd + "&accNum=" + accNum + "&menu=B2B"; else url = urlOrgin + "/tplus/view/portal/portal.html?fromApp=" + fromApp + "&user=" + user + "&pwd=" + pwd + "&accNum=" + accNum;
                    window.location.href = url
                } else model.MsgAlert("获取演示账号失败")
            }, function (error) {
                model.MsgAlert("获取演示账号失败")
            })
        }, chkMobileOrEmailFormat: function (uname) {
            var mobileExpression = /^[\d]{11}$/;
            var emailExpression = /^\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*$/;
            return mobileExpression.test(uname) || emailExpression.test(uname)
        }, login: function (e,
                            acclist, obj, value) {
            var user = $.modelStorage($.baseUrl + "view/login.html");
            if (user != null && user["versionNo"] != null && user["versionNo"] != "") {
                var preVersion = user["versionNo"];
                var curVersion = "";
                for (var i = 0; i < model.accountList.length; i++) if (model.accountList[i][1] == this.accountNum) {
                    curVersion = model.accountList[i][9];
                    break
                }
                if (console.debug) {
                    console.debug("preVersion:" + preVersion);
                    console.debug("curVersion:" + curVersion)
                }
                if (preVersion != "" && curVersion != "" && preVersion != curVersion) {
                    model.MsgAlert("T+产品升级了！请清除浏览器缓存后，<font color='red'>重新打开</font>浏览器登录！<br/><br/><p><a target='_blank' href='./clearcache.html'>如何清除浏览器缓存?</a></p>");
                    return false
                }
            }
            if (user) {
                var serverVersion = window.clientVersion;
                var clientVersion = user["version"];
                if (clientVersion && clientVersion != serverVersion) {
                    model.MsgAlert("T+产品升级了！请清除浏览器缓存后，<font color='red'>重新打开</font>浏览器登录！<br/><br/><p><a target='_blank' href='./clearcache.html'>如何清除浏览器缓存?</a></p>");
                    return false
                }
            }
            if (!model.CheckBindAQD(this.isAdmin)) return false;
            $("#isAdmin").attr("readonly", true);
            $("#isUser").attr("readonly", true);
            if (window.sessionStorage && sessionStorage.length > 0) {
                var logined = modelStorage({
                    _storage: window.sessionStorage,
                    userName: "", accountNum: "", accountText: "", accountName: "", loginauthcode: ""
                });
                var usermodel = modelStorage({
                    _storage: window.localStorage,
                    userName: "",
                    accountNum: "",
                    accountText: "",
                    accountName: "",
                    loginauthcode: ""
                });
                if (usermodel.userName != null && usermodel.userName != "" && logined.userName != null && logined.userName != "") {
                    $(model).trigger("loginError", [{
                        code: ".UserLogined",
                        message: "用户 " + logined.userName + " 已经登录，是否继续登录？"
                    }]);
                    return false
                }
            }
            if (model.checkDogResult != 0) return false;
            if (this.userName == "") return true;
            if (model.isCloudDeployment &&
                model.isCloudDeployment == true) {
                if (!model.isAdmin) if (this.password == "") return false;
                var uname = model.getLoginName();
                if (uname) uname = uname.trim();
                var isValid = model.chkMobileOrEmailFormat(uname);
                if (!isValid) {
                    $(model).trigger("loginError", [{
                        code: ".ContentErrorException",
                        message: "为提升账号安全，仅支持以手机号或邮箱登录，<br/>请重新输入登录账号。"
                    }]);
                    return false
                }
            }
            if (model.isCloudDeployment) {
                if (this.showCheckCode && document.getElementById("hid_ali_sig").value == "") {
                    $(model).trigger("loginError", [{
                        code: "Ufida.T.SM.Login.DTO.CheckCodeErrorException",
                        message: "请滑动验证条"
                    }]);
                    return false
                }
            } else {
                if (this.showCheckCode && this.checkCodeInputed == "") return true;
                if (this.showCheckCode && $.md5) if ($.md5("checkcode:" + this.checkCodeInputed.toUpperCase()) != this.checkCodeValue) {
                    $(model).trigger("loginError", [{
                        code: "Ufida.T.SM.Login.DTO.CheckCodeErrorException",
                        message: "验证码不正确"
                    }]);
                    return false
                }
            }
            model.disableLoginBtn();
            var accountNum = this.accountNum;
            if (this.isAdmin) {
                accountNum = "000";
                model.webAppID = "admin"
            } else if (acclist == null) {
                this.loadAccountList({_name: "loadAccountByLogin"},
                    this.login, this, e);
                return false
            } else if (acclist && acclist.length == 0) {
                model.enableLoginBtn();
                model.HandleCheckCode();
                if (model.isCloudDeployment) if (value && value.length == 1 && value[0][2]) $(model).trigger("loginError", [{
                    code: ".ContentErrorException",
                    message: value[0][2]
                }]); else $(model).trigger("loginError", [{
                    code: ".ContentErrorException",
                    message: "账号或者密码不正确"
                }]); else if (value && value.length == 1 && value[0][2]) $(model).trigger("loginError", [{
                    code: ".ContentErrorException",
                    message: value[0][2]
                }]); else if (this.accountText !=
                    "") $(model).trigger("loginError", [{
                    code: ".ContentErrorException",
                    message: "用户名密码不正确"
                }]); else $(model).trigger("loginError", [{
                    code: ".ContentErrorException",
                    message: "<div style='text-align:left;'><span>登录失败：</span><br />1、请确认用户名及密码是否正确<br/>2、如使用畅捷通账号，请通过“忘记密码”找回<br/>3、否则请联系账套主管，在T+重置密码</div>"
                }]);
                return false
            } else if (this.accountNum == "") {
                this.accountNum = acclist[0][1];
                return false
            }
            if (this.isAdmin == false) accountNum = this.accountNum;
            if (model.webAppName) {
                service.serviceUrl = "/" + model.webAppName + "/" + service.serviceUrl.substr($.baseUrl.length);
                model._storage._name = "/" + model.webAppName + "/" + $.viewUrl
            }
            if (model.webAppID && $.cookie) $.cookie("sid", model.webAppID, {path: "/"});
            if (model.UserId) $.cookie("AIPortal_Res_Account", model.accountNum + "_" + model.UserId, {path: "/"});
            if (this.isAdmin == false) service.GetCurentV({accountNum: accountNum}, function (val) {
                if (val != null) {
                    var strMsg = "";
                    var isLogin = true;
                    switch (val) {
                        case 0:
                            break;
                        case 1:
                            strMsg = UIPGetResouce("Login", "Login1211");
                            isLogin = false;
                            break;
                        case 2:
                            strMsg = UIPGetResouce("Login", "Login1212");
                            isLogin = false;
                            break;
                        case 8:
                            break;
                        case 9:
                            strMsg = UIPGetResouce("Login", "Login1213");
                            isLogin = false;
                            break;
                        case 10:
                            strMsg = model.versionType + UIPGetResouce("Login", "Login1219");
                            isLogin = false;
                            break;
                        case 11:
                            strMsg = model.versionType + UIPGetResouce("Login", "Login1220");
                            isLogin = false;
                            break;
                        default:
                            break
                    }
                    if (!isLogin) {
                        $(model).trigger("loginError", [{code: ".CheckCurrentVesion", message: strMsg}]);
                        return false
                    } else if (model && model.appState && model.appState == "1" && model.cloudUserId && model.cloudUserId.length > 0 && !model.isCloudDeployment) service.ValidCloudUser({
                        userName: model.getLoginName(),
                        pwd: $.md5(model.password), orgId: model.orgId, caccNum: accountNum
                    }, function (val) {
                        return model.changePassword(obj)
                    }, function (err) {
                        model.enableLoginBtn();
                        if (err) {
                            $(model).trigger("loginError", [{code: ".ContentErrorException", message: err.message}]);
                            return false
                        }
                    }); else return model.changePassword(obj)
                }
            }, function (err) {
                model.enableLoginBtn()
            }); else return model.changePassword(obj)
        }, reLogin: function () {
            service.ReLoginIn({userName: model.getLoginName(), AccountNum: model.accountNum}, function (value) {
                model.errorCount =
                    0;
                model._save({errorCount: 1});
                $(model).trigger("loginSuccess", [value]);
                var versionKey = $.baseUrl.toLowerCase() + $.viewUrl + "/version";
                var versionVal = localStorage.getItem(versionKey);
                model.version = versionVal ? versionVal.replace('"', "").replace('"', "") : "";
                model._save()
            }, function (error) {
                $(model).trigger("loginError", [error])
            })
        }, initNoCaptcha: function () {
            document.getElementById("hid_ali_csessionid").value = "";
            document.getElementById("hid_ali_sig").value = "";
            document.getElementById("hid_ali_token").value = "";
            document.getElementById("hid_ali_scene").value = "";
            var nc = new noCaptcha;
            var nc_appkey = "1934";
            var nc_scene = "login";
            var nc_token = [nc_appkey, (new Date).getTime(), Math.random()].join(":");
            var nc_option = {
                renderTo: "#divNoCaptcha",
                appkey: nc_appkey,
                scene: nc_scene,
                token: nc_token,
                callback: function (data) {
                    document.getElementById("hid_ali_csessionid").value = data.csessionid;
                    document.getElementById("hid_ali_sig").value = data.sig;
                    document.getElementById("hid_ali_token").value = nc_token;
                    document.getElementById("hid_ali_scene").value =
                        nc_scene
                },
                error: function (s) {
                    $.showMessageBoxTitle("提示", "网络超时，请重试或刷新页面后重试", function (btn, dialog) {
                        var yes = btn.attr("id") == "yes";
                        dialog.modal("hide")
                    })
                }
            };
            nc.init(nc_option)
        }, loadCheckCode: function () {
            if (!this.showCheckCode) return;
            if (model.isCloudDeployment) {
                if (typeof noCaptcha == "function") {
                    this.initNoCaptcha();
                    return
                }
                document.getElementById("divNoCaptcha").style.display = "block";
                var d = new Date;
                var ts = "" + d.getFullYear() + d.getMonth() + d.getDate() + d.getHours();
                var head = document.getElementsByTagName("head")[0];
                var link = document.createElement("link");
                link.href = "//g.alicdn.com/sd/ncpc/nc.css?t=" + ts;
                link.rel = "stylesheet";
                link.type = "text/css";
                head.appendChild(link);
                $.getScript("//g.alicdn.com/sd/ncpc/nc.js?t=" + ts, function () {
                    this.initNoCaptcha()
                }.bind(this))
            } else service.getCheckCode(function (url) {
                model.checkCodeImgUrl = $.baseUrl + url;
                var results = model.checkCodeImgUrl.match(/([0-9A-Z]{32})/g);
                if (results && results.length > 0) model.checkCodeValue = results[0].toLowerCase();
                model.changed({checkCodeImgUrl: model.checkCodeImgUrl})
            })
        },
        clearUserMutex: function (e) {
            service.ClearUserMutex(function (msg) {
                e && e(msg)
            })
        }, HandleCheckCode: function () {
            model.errorCount++;
            model.showCheckCode = model.errorCount > 3;
            model.changed({showCheckCode: model.showCheckCode});
            model._save({errorCount: 1});
            model.loadCheckCode();
            model.changed({checkCodeInputed: ""})
        }, changed: function (props) {
            if ("object" == typeof props && props.accountText) {
                var control = model.findControlLogin();
                if (control) document.getElementById("div_logindate").style.visibility = "visible"; else {
                    document.getElementById("div_logindate").style.visibility =
                        "hidden";
                    props.loginDate = this.loginDate = $.dateFormat(new Date)
                }
            }
            $(model).trigger("change", [props])
        }, findControlLogin: function () {
            var cacc_num = model.accountNum;
            var accList = model.accountList;
            if (!accList) return 0;
            for (var i = 0; i < accList.length; i++) if (cacc_num == accList[i][1]) return accList[i][10] == "true" ? 1 : 0;
            return 0
        }, InitAcitveXTips: function () {
            var browerFlag = false;
            if (navigator.plugins) {
                var browserName = navigator.userAgent.toLowerCase();
                if (browserName.indexOf("edge") > -1) browerFlag = true
            } else {
                var a = navigator.plugins["Chanjet T+ PrintCtrl"];
                if (typeof a == "undefined") {
                    var regStr_chrome = /chrome\/[\d.]+/gi;
                    var version = navigator.userAgent.toLowerCase().match(regStr_chrome);
                    version = version == null ? "" : version[0];
                    if (version >= "chrome/45.0") browerFlag = true
                }
            }
            if (browerFlag) $("#liBrowserSet").hide(); else {
                var isshow = false;
                var a = null;
                try {
                    a = new ActiveXObject("BILLONE.BillOneCtrl.1")
                } catch (ex) {
                    a = null
                }
                if (a != null || navigator.mimeTypes["application/npbillone"]) isshow = false; else isshow = true;
                if (isshow) $("#guide_SetBrowser").show(); else $("#guide_SetBrowser").hide()
            }
            this.reloadSettingDiv()
        },
        InitBrowerSet: function () {
            if (navigator.appName == "T+Browser") $("#liBrowserSet").hide(); else $("#liBrowserSet").show();
            this.reloadSettingDiv()
        }, reloadSettingDiv: function () {
            var tblocks = $("#tSettingContent").find(".t-block");
            var len = tblocks.length;
            var count = 0;
            for (var i = 0; i < len; i++) {
                if ($(tblocks[i]).css("display") == "none") continue;
                count++
            }
            var newBlockCss;
            if (count == 2) newBlockCss = "t-col-2";
            if (count == 3) newBlockCss = "t-col-3";
            if (count == 4) newBlockCss = "t-col-4";
            for (var i = 0; i < len; i++) $(tblocks[i]).removeClass("t-col-2 t-col-3 t-col-4").addClass(newBlockCss);
            $(".t-setting-bg").css("opacity", 1)
        }, openCenterWindow: function (url, name, iWidth, iHeight) {
            var url, name, iWidth, iHeight;
            var iTop = (window.screen.availHeight - 30 - iHeight) / 2;
            var iLeft = (window.screen.availWidth - 10 - iWidth) / 2;
            window.open(url, name, "height=" + iHeight + ",,innerHeight=" + iHeight + ",width=" + iWidth + ",innerWidth=" + iWidth + ",top=" + iTop + ",left=" + iLeft + ",toolbar=no,menubar=no,scrollbars=auto,resizeable=no,location=no,status=no")
        }, forget: function (val, callRet) {
            service.ChkNet(function (value) {
                if (value != true) $(model).trigger("loginError",
                    [{
                        code: ".ContentErrorException",
                        message: "服务器不能联通外网，不能使用找回密码"
                    }]); else if (val && val.toLowerCase() == "admin") {
                    if (model.domain) {
                        $(model).trigger("loginError", [{
                            code: ".ContentErrorException",
                            message: "请使用租户账号" + model.domain + "对应的云密码，登录系统管理！<br /><a href='https://passport.chanjet.com/password/recovery' target=_blank>找回云账号密码</a>"
                        }]);
                        return
                    }
                    service.GetEmail(function (ret) {
                        if (ret && ret.length > 0) callRet(); else $(model).trigger("loginError", [{
                            code: ".ContentErrorException",
                            message: "没有设置邮箱，不能找回密码！<br />请系统管理员登录后，修改找回密码设置！<br />如果确实忘记密码且未设置邮箱，请联系服务商！"
                        }])
                    })
                } else window.open("https://passport.chanjet.com/password/recovery")
            })
        },
        cspLogin: function () {
            service.GetAuthCodeForLoginUrl({}, function (ret) {
                $.getJSON(ret + "callback=?", function (json) {
                    service.CloudUserLogin({
                        userName: model.userName,
                        pwd: $.md5(model.password),
                        caccNum: model.accountNum,
                        authCode: json.auth_code
                    }, function (val) {
                        window.open("http://i.chanjet.com/useraccount/index")
                    })
                }, function (error) {
                    console.info(error.message)
                })
            })
        }, cutAccountText: function (str) {
            if (/^\[000/.test(str)) return "[" + str.substring(4); else return str
        }, IsSupportPlugin: function () {
            var browserName = navigator.userAgent.toLowerCase();
            if (navigator.appName == "T+Browser") return true; else if ("ActiveXObject" in window) ; else if (navigator.plugins) if (browserName.indexOf("edge") > -1) return false; else {
                var regStr_chrome = /chrome\/[\d.]+/gi;
                var version = navigator.userAgent.toLowerCase().match(regStr_chrome);
                version = version == null ? "" : version[0];
                if (version >= "chrome/45.0" || browserName.indexOf("win64") > 0) return false; else if (version < "chrome/39.0") return false
            }
            return true
        }, IsDate: function (dateValue) {
            var regex = new RegExp("^(?:((?:([0-9]{4}-(?:(?:0?[1,3-9]|1[0-2])-(?:29|30)|((?:0?[13578]|1[02])-31)))|([0-9]{4}-(?:0?[1-9]|1[0-2])-(?:0?[1-9]|1\\d|2[0-8]))|(((?:(\\d\\d(?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))-0?2-29)))|(?:([0-9]{4}/(?:(?:0?[1,3-9]|1[0-2])/(?:29|30)|((?:0?[13578]|1[02])/31)))|([0-9]{4}/(?:0?[1-9]|1[0-2])/(?:0?[1-9]|1\\d|2[0-8]))|(((?:(\\d\\d(?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))/0?2/29)))|(?:([0-9]{4}(?:(?:0?[1,3-9]|1[0-2])(?:29|30)|((?:0?[13578]|1[02])31)))|([0-9]{4}(?:0?[1-9]|1[0-2])(?:0?[1-9]|1\\d|2[0-8]))|(((?:(\\d\\d(?:0[48]|[2468][048]|[13579][26]))|(?:0[48]00|[2468][048]00|[13579][26]00))0?229)))))$");
            if (dateValue.length < 8) return false; else if (!regex.test(dateValue)) return false;
            return true
        }, ChangeDate: function (dateValue) {
            var regex1 = new RegExp("^([0-9]{4})((?:0?[1-9])|(?:1[0-2]))((?:0?[1-9])|(?:[1-2][0-9])|30|31)$");
            var regex2 = new RegExp("[/-]");
            if (regex2.test(dateValue)) return dateValue; else return regex1.exec(dateValue)[1] + "-" + regex1.exec(dateValue)[2] + "-" + regex1.exec(dateValue)[3]
        }, MsgAlert: function (msg) {
            $.showMessageBoxTitle(UIPGetResouce("Common", "CommonTip"), msg, function (btn, dialog) {
                var yes =
                    btn.attr("id") == "yes";
                dialog.modal("hide")
            })
        }, ShowPackageType: function (val) {
            try {
                if (val == "experience") $("#packagetype").html(UIPGetResouce("Login", "Login1208")).show();
                if (val == "verify") ;
                if (val == "rd") $("#packagetype").html(UIPGetResouce("Login", "Login1210")).show();
                if (val == "official") $("#packagetype").html("").hide()
            } catch (ex) {
            }
        }
    }, {
        CloseNavigator: function () {
            return;
            var ie = navigator.appName == "Microsoft Internet Explorer" ? true : false;
            if (ie) {
                window.opener = null;
                window.open("", "_self", "");
                window.close()
            } else {
                window.open("",
                    "_parent", "");
                window.close();
                self.opener = null;
                self.open("", "_self");
                self.close()
            }
        }, AlertInsertKey: function () {
            model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0001"))
        }, AlertInsertAdminKey: function () {
            model.MsgAlert(UIPGetResouce("Login", "AQD0002"))
        }, AlertExceptionMsg: function (msgCode) {
            model.MsgAlert(UIPGetResouce("Login", msgCode))
        }, AQDPlugCheck: function (msg) {
            if (!model.aqdEnabled && (msg == null || msg.length == 0)) return true;
            if (!model.isSupportPlugin) {
                model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0003"));
                return false
            }
            var obj = this.GetAQDKeyPlug();
            var obj2 = this.GetAQDComputerPlug();
            if (obj == null || obj2 == null) {
                this.AQDDownLoadAlert("AQD0004");
                return false
            }
            try {
                obj.HCOMGetKeySerial(0)
            } catch (e) {
                this.AQDDownLoadAlert("AQD0004");
                return false
            }
            try {
                obj2.GetMainboardSN()
            } catch (e) {
                this.AQDDownLoadAlert("AQD0014");
                return false
            }
            return true
        }, AQDDownLoadAlert: function (msgcode) {
            $.showMessageBox(UIPGetResouce("Common", "CommonTip"), UIPGetResouce("Login", msgcode), function (btn, dialog) {
                var yes = btn.attr("id") == "yes";
                dialog.modal("hide");
                if (yes) window.location.href = "../ufaqd/update/Setup.exe"
            });
            var dialog = $().dialog("myModal");
            dialog.find(".close").on("click", function (e) {
                model.CloseNavigator()
            })
        }, GetAQDKeyPlug: function () {
            var obj;
            try {
                obj = new ActiveXObject("CheckUSBKey.HCheckUSBKey")
            } catch (e) {
            }
            if (obj == null && model.isSupportPlugin) obj = HTCOM;
            return obj
        }, GetAQDKeyID: function () {
            var obj = this.GetAQDKeyPlug();
            if (obj == null) return "";
            try {
                model.keyStatus = obj.CheckKeyWorkStatus();
                model.keyID = obj.HCOMGetKeySerial(0);
                if (model.keyID == "-536739831") model.keyID =
                    "3758227465"
            } catch (e) {
            }
        }, GetAQDComputerPlug: function () {
            var obj = null;
            try {
                obj = new ActiveXObject("GETPCINFO.GetPCInfoCtrl.1")
            } catch (e) {
            }
            if (obj == null && model.isSupportPlugin) obj = Splugin;
            return obj
        }, GetAQDComputerInfo: function () {
            var obj = this.GetAQDComputerPlug();
            if (obj == null) return "";
            try {
                if (obj.GetMainboardSN() == null || obj.GetMainboardSN() == "" || obj.GetBiosSN() == null || obj.GetBiosSN() == "") {
                    var macStr = "";
                    if (obj.GetMAC().substring(0, 1) == ";") macStr = obj.GetMAC().substring(1, 17); else macStr = obj.GetMAC().substring(0,
                        17);
                    return obj.GetName() + macStr + "&" + obj.GetMAC() + "&" + obj.GetName() + "&" + obj.GetName()
                } else return obj.GetMainboardSN() + "&" + obj.GetMAC() + "&" + obj.GetName() + "&" + obj.GetBiosSN()
            } catch (e) {
            }
        }, AQDAlertWithClose: function (msg) {
            $.showMessageBoxTitle(UIPGetResouce("Common", "CommonTip"), msg, function (btn, dialog) {
                dialog.modal("hide");
                model.CloseNavigator()
            });
            var dialog = $().dialog("myModal");
            dialog.find(".close").on("click", function (e) {
                model.CloseNavigator()
            });
            dialog.on("keydown", function (e) {
                if (event.keyCode == 27) model.CloseNavigator()
            })
        },
        CheckBindAQD: function (isAdmin) {
            if (!model.aqdEnabled) return true;
            var keyId = model.keyID;
            this.GetAQDKeyID();
            if (model.keyID == "") if (!this.AQDPlugCheck()) return false;
            if (model.keyStatus != "1" && !model.aqdAllowNoKey) {
                this.AlertInsertKey();
                return false
            }
            if (keyId == model.keyID) {
                if (isAdmin && model.lockToAdmin == false) {
                    this.AlertInsertAdminKey();
                    return false
                }
            } else if (isAdmin) model.keyID = keyId;
            return true
        }, CheckBindUser: function (e, callback, that, obj) {
            service.GetAQDBindingUser({aqdKey: model.aqdKey, userName: this.userName},
                function (result) {
                    var tempstr = result.split(";");
                    var status = tempstr[0];
                    var binded = tempstr[1];
                    var res = true;
                    if (status == "3") {
                        model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0012"));
                        return
                    } else if (status == "2") {
                        if (tempstr.length == 4) {
                            var approved = tempstr[2];
                            model.CheckBindComputer(binded, approved, e, callback, that, obj);
                            model.lockToAdmin = tempstr[3] == "false" ? false : true;
                            return
                        }
                        var users = binded.split(",");
                        var keyUser = false;
                        if (users.length > 0) {
                            for (var i = 0; i < users.length; i++) {
                                var userInfo = users[i].split("|");
                                for (var j =
                                    0; j < userInfo.length; j++) if (userInfo[j].toLowerCase() == model.userName.toLowerCase()) {
                                    keyUser = true;
                                    res = true;
                                    break
                                }
                                if (keyUser) break
                            }
                            if (!keyUser) {
                                model.handleLoadAccount(null);
                                model.MsgAlert(UIPGetResouce("Login", "AQD0005"));
                                res = false
                            }
                        } else {
                            model.handleLoadAccount(null);
                            model.MsgAlert(UIPGetResouce("Login", "AQD0005"));
                            res = false
                        }
                    } else if (status == "0") {
                        res = false;
                        model.WrongAQDAlert()
                    }
                    if (res) {
                        model.loadAccountList(e, callback, that, obj);
                        return []
                    }
                })
        }, CheckBindComputer: function (binded, approved, e, callback, that,
                                        obj) {
            var cNum = model.accountNum;
            var userName = this.getLoginName();
            var role = "";
            if (model.isCloudDeployment) if (model.isAdmin) role = "EnterpriseAdmin"; else role = "EnterpriseUser";
            if (binded == "false") $.showMessageBox(UIPGetResouce("Login", "AQD0006"), function (btn, dialog) {
                var yes = btn.attr("id") == "yes";
                dialog.modal("hide");
                if (yes) service.InsertComputerInfo({
                    aqdKey: model.aqdKey,
                    accNum: cNum,
                    userName: userName,
                    role: role
                }, function (ret) {
                    if (ret == 1) model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0007")); else model.AQDAlertWithClose(UIPGetResouce("Login",
                        "AQD0008"))
                }); else return false
            }); else {
                if (approved == "false") {
                    model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0009"));
                    return false
                } else if (!model.isAdmin) model.loadAccountList(null, callback, that, obj);
                var computerInfo = model.GetAQDComputerInfo();
                service.UpdateComputerInfo({
                    keyID: model.keyID,
                    computerInfo: computerInfo,
                    accNum: cNum,
                    userName: userName,
                    role: role
                }, function (value) {
                })
            }
        }, WrongAQDAlert: function () {
            if (model.aqdAllowNoKey && model.keyID == "3758227465") model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0010"));
            else if (model.keyID == "3758227465") model.AlertInsertKey(); else model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0011"))
        }, CheckAQDKeyState: function () {
            service.GetAQDKeyState({aqdKey: model.aqdKey}, function (result) {
                if (result != null) {
                    var tempstr = result.split(";");
                    var status = tempstr[0];
                    var binded = tempstr[1];
                    var approved = tempstr[2];
                    if (tempstr.length == 4) model.lockToAdmin = tempstr[3] == "false" ? false : true;
                    if (status == "2") model.CheckBindComputer(binded, approved); else if (status == "0") {
                        model.WrongAQDAlert();
                        return
                    } else if (status ==
                        "3") {
                        model.AQDAlertWithClose(UIPGetResouce("Login", "AQD0012"));
                        return
                    } else if (!model.isAdmin) model.loadAccountList()
                }
            })
        }, checkIsAccountAdmin: function () {
            service.CheckIsAccountAdmin({async: false}, function (json) {
                if (json == true) model.IsAccountAdmin = true; else model.IsAccountAdmin = json.value;
                model._save({"IsAccountAdmin": json.value})
            })
        }, InitExpBtn: function () {
            $("#expBtn").removeClass("t-hide")
        }, getActivateUrl: function () {
            var result = false;
            activateService.GetActivateUrl({async: false}, function (ret) {
                if (ret.result) {
                    model.activate_guid =
                        ret.guid;
                    model.activate_url = ret.url;
                    result = true
                } else {
                    var msg = "请求激活路径出错";
                    if (ret.error && ret.error.msg) msg = ret.error.msg;
                    $.showMessageBox("请求激活路径出错", msg)
                }
            }, function (error) {
                $.showMessageBox("请求激活路径出错", error)
            });
            return result
        }, getTrialUrl: function () {
            var result = false;
            activateService.GetTrialUrl({async: false}, function (ret) {
                if (ret.result) {
                    model.trail_url = ret.url;
                    model.trail_guid = ret.guid;
                    result = true
                } else {
                    var msg = "请求试用路径出错";
                    if (ret.error && ret.error.msg) msg = ret.error.msg;
                    $.showMessageBox("请求试用路径出错", msg)
                }
            }, function (error) {
                $.showMessageBox("请求试用路径出错",
                    error)
            });
            return result
        }, getLoginLogo: function () {
            $.get("/tplus/tapi/v1/customlogo/getLoginLogo", function (json) {
                if (json.Code == 0) ExLogo.initLoginLogo(json.Data); else console.log(json)
            })
        }, saveToModel: function (val) {
            if (val) {
                $.each(val, function (k, v) {
                    model[k] = v
                });
                model._save(val)
            }
        }, getFromModel: function (k) {
            if (k) return model[k]
        }, checkGenuine: function () {
            if (model.isActive) return true;
            model.MsgAlert("当前产品未经验证，请先<a href='javascript:void(0)' onclick='toTrialPage()'>【试用验证】</a>或<a href='javascript:void(0)' onclick='toActivatePage()'>【立即激活】</a>！");
            $().dialog("myModal").on("hidden.bs.modal", function () {
                if (window.location.search.indexOf("from=install") != -1) window.location.search = window.location.search.replace("from=install", ""); else window.location.reload()
            });
            return false
        }
    });
    +function (exportObj) {
        $.extend(exportObj, {
            isCloudDeployment: function () {
                return model.isCloudDeployment
            }
        })
    }(window);
    model.setpassword = model.setuserName;
    model._init();
    return model
});

/*--------end file:login.model.js-------------*/
/*--------start file:login.controller.js-------------*/
define("login.controller", ["tp.controllerBase", "login.model"], function (binder, model) {
    function forget(val) {
        var callRet = function () {
            $.showModal("RecoverPassword.aspx", {width: 530, height: 220, title: "找回密码"})
        };
        model.forget(val, callRet)
    }

    function toPortal(arg) {
        model.checkIsAccountAdmin();
        setTimeout(function () {
            var url = "portal/portal.html?t=" + (new Date).getTime();
            model.webAppName && (url = "/" + model.webAppName + "/view/" + url);
            if (!model.isAdmin) model.lastLoginedAccNum = model.accountNum;
            model.domain = model.curDomain;
            if (arg !==
                false) model._save();
            if (arg) url += arg;
            location = url
        }, 0)
    }

    $(model).on("loginSuccess", function () {
        toPortal()
    });
    $(model).on("loginError", function (e, error) {
        var from = model.getUrlParam("from");
        if (!from && location.href.indexOf("login.html") > -1) from = "login"; else from = "";
        var dialog;
        var errType = error.code.replace("Ufida.T.SM.Login.DTO", "");
        if (errType == ".FirstLoginException" && model.isAdmin) {
            model.domain = model.curDomain;
            model.clearUserMutex(function (msg) {
                dialog = $.showModal("ChangePassword.aspx", {
                    width: 620,
                    height: 300,
                    title: "修改密码",
                    obj: {
                        From: from,
                        UserName: model.userName,
                        Domain: model.curDomain,
                        toPortal: toPortal,
                        AccID: model.accountID,
                        FirstLogin: 1,
                        IsCloudUser: model && !model.isAdmin && model.appState && model.appState == "1" && model.cloudUserId && model.cloudUserId.length > 0
                    },
                    cb: function (result) {
                        if (result == true) toPortal()
                    }
                });
                model._save()
            });
            return
        } else dialog = $.showMessageBox("提示", "<div class='msgbox'><img src='../img/login/warning.png'/> <div class='errcontent'>" + error.message + "</div><div class='hide'>" + error.code + "</div></div>",
            function (btn, dialog) {
                var yes = btn.attr("id") == "yes";
                dialog.modal("hide");
                model.enableLoginBtn();
                $("#isAdmin").attr("readonly", false);
                $("#isUser").attr("readonly", false);
                switch (errType) {
                    case ".FirstLoginException":
                        model.domain = model.curDomain;
                        model.clearUserMutex(function (msg) {
                            if (yes) {
                                $.showModal("ChangePassword.aspx", {
                                    width: 620, height: 300, title: "修改密码", obj: {
                                        UserName: model.userName,
                                        Domain: model.curDomain,
                                        toPortal: toPortal,
                                        AccID: model.accountID,
                                        FirstLogin: 1,
                                        IsCloudUser: model && !model.isAdmin && model.appState &&
                                            model.appState == "1" && model.cloudUserId && model.cloudUserId.length > 0
                                    }, cb: function (result) {
                                        if (result == true) toPortal()
                                    }
                                });
                                model._save()
                            } else toPortal()
                        });
                        break;
                    case ".UserLogined":
                        if (yes) {
                            window.sessionStorage.clear();
                            model.login()
                        }
                        break;
                    case ".LoginedException":
                        if (yes) model.reLogin();
                        break;
                    case ".OneBrowserOneProductException":
                        if (yes) {
                            model.UnRegister();
                            model.login()
                        }
                        break;
                    case ".CheckCodeErrorException":
                        $("#checkCodeInputed").focus();
                        break;
                    case ".ContentErrorException":
                        $("#password").focus();
                        break;
                    case ".CheckCurrentVesion":
                        break;
                    default:
                        break
                }
            });
        if (dialog) if (errType == ".FirstLoginException" && !model.isAdmin) {
            dialog.find(".close").on("click", function (e) {
                toPortal()
            });
            dialog.on("keydown", function (e) {
                if (event.keyCode == 27) {
                    model.enableLoginBtn();
                    $("#isAdmin").attr("readonly", false);
                    $("#isUser").attr("readonly", false);
                    toPortal()
                }
            })
        } else {
            dialog.find(".close").on("click", function (e) {
                model.enableLoginBtn();
                $("#isAdmin").attr("readonly", false);
                $("#isUser").attr("readonly", false)
            });
            dialog.on("keydown",
                function (e) {
                    if (event.keyCode == 27) {
                        model.enableLoginBtn();
                        $("#isAdmin").attr("readonly", false);
                        $("#isUser").attr("readonly", false)
                    }
                })
        }
    });
    $(model).on("change", function (e, props) {
        checodeShow(props)
    });
    $("#isAdmin,#isUser").on("change", function (e) {
        $(this).attr("checked", "true");
        model.isAdmin = e.target.id == "isAdmin";
        model.password = "";
        model.changed("password");
        model.showAdmin(1)
    });
    $("#register").on("click", function (e) {
        if (model.isCloudDeployment) window.open("./../view/register.html"); else window.open("./sm/createaccount.html")
    });
    $("#jihuo").on("click", function (e) {
        model.toActivatePage()
    });
    $("#expBtn").on("click", function (e) {
        var twidth = 584;
        var theight = 390;
        if (model.isCloudDeployment) {
            twidth = 540;
            theight = 400
        }
        $.showModal("./view/selectRoles.html", {width: twidth, height: theight, title: "", className: "t-exp"})
    });
    var checodeShow = function (props) {
        if (model.checkCodeImgUrl) {
            if (model.showCheckCode) $("#checkCodeInputed").attr("required", ""); else $("#checkCodeInputed").removeAttr("required");
            $("#checkCodeImgUrl").attr("src", model.checkCodeImgUrl)
        }
    };
    binder.bind(model, $(document.body));
    if (!model.isCloudDeployment) checodeShow();
    setTimeout(function () {
        if (!model.userName) $("#userName").focus(); else $("#password").focus()
    }, 0);
    +function () {
        var serverVersion = window.clientVersion;
        var clientVersion = model.version;
        if (clientVersion && clientVersion != serverVersion) {
            model.MsgAlert("T+产品升级了！请清除浏览器缓存后，<font color='red'>重新打开</font>浏览器登录！<br/><br/><p><a target='_blank' href='./clearcache.html'>如何清除浏览器缓存?</a></p>");
            return
        } else if (!clientVersion) {
            model.version = serverVersion;
            model._save()
        }
        model.delCookieWithPath("sid")
    }();
    +function () {
        $.getScript("../js/login/cloudNotic.js?t=" + (new Date).getTime(), function () {
            if (typeof cloudNoticInfo != "undefined" && cloudNoticInfo.info) $("#tcloudNotic").addClass("t-cloud-notic").html("<span class='ticon ticon-gonggao'></span>" + cloudNoticInfo.info); else $("#tcloudNotic").removeClass("t-cloud-notic").html("")
        })
    }();
    +function (exportObj) {
        $.extend(exportObj, {
            testWindowLevel: function () {
                console.log("testWindowLevel")
            }, getVersionAuthTag: function () {
                return {
                    versionAuthTag: model.versionAuthTag,
                    isCloudDeployment: model.isCloudDeployment,
                    cloudEncryptionId: model.cloudEncryptionId,
                    type: "login"
                }
            }
        })
    }(window);
    this.document.onkeyup = function () {
        if (!model.isAdmin) {
            KeyArray = model.keyArray.split("|");
            if (KeyArray && KeyArray.length == 3) {
                if (model.assignKey(KeyArray[0]) && model.assignKey(KeyArray[1]) && model.keyCompare(event.keyCode, KeyArray[2])) {
                    model.setCookie("ShowDefaultAccount", "0");
                    model.loadAccountList({_name: "loadAccountByLogin"}, this.login, this)
                } else ;
                return
            }
        }
    };
    model.delCookie("ShowDefaultAccount");
    var inputed = false;
    var keydowned = false;
    $("#accountText").on("click", function () {
        $(this).select()
    });
    $("#accountText").on("input", function () {
        inputed = true
    });
    $("#accountText").on("keydown", function () {
        keydowned = true
    });
    $("#accountText").on("change", function () {
        var control = model.findControlLogin();
        if (control) document.getElementById("div_logindate").style.visibility = "visible"; else {
            document.getElementById("div_logindate").style.visibility = "hidden";
            model.loginDate = $.dateFormat(new Date);
            model.changed({loginDate: 1})
        }
    });
    $("#userName").on("change", function () {
        inputed = false;
        keydowned = false
    });
    $("#password").on("change", function () {
        inputed = false;
        keydowned = false
    });
    $("#accountList").on("show.bs.dropdown", function () {
        if (!inputed || !keydowned) return;
        var text = $("#accountText").val();
        var oldAccountList = model.accountList;
        var tmpAccountList = [];
        for (var i = 0; i < model.accountList.length; ++i) if (model.accountList[i][1].indexOf(text) >= 0 || model.accountList[i][2].indexOf(text) >= 0) tmpAccountList.push(model.accountList[i]);
        model.changed({accountList: tmpAccountList});
        $("#accountList").off("hidden.bs.dropdown");
        $("#accountList").on("hidden.bs.dropdown", function () {
            model.accountList = oldAccountList
        })
    });
    return {forget: forget}
});

/*--------end file:login.controller.js-------------*/
/*--------start file:../clientversion.js-------------*/
var clientVersion = "117";

/*--------end file:../clientversion.js-------------*/
/*--------start file:../../app/viewextend.js-------------*/
+function ($) {
    $.viewExtend = {
        "view/login.html": {
            login: function () {
                require(["login.model"], function (model) {
                })
            }
        }
    };
    if (typeof define != "undefined") define("app.viewextend", [], $.viewExtend)
}(jQuery || windows);

/*--------end file:../../app/viewextend.js-------------*/
