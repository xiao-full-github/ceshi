package cn.com.yzton.controller;

import cn.com.yzton.primary.entity.EapUser;
import cn.com.yzton.primary.service.EapUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Base64Utils;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Login")
public class LoginController {
    @Autowired(required = false)
    private EapUserService eapUserService;

    /*
        判断是普通用户还是系统管理员
     */
    @RequestMapping(value = "/GetAccountsByUser",method = RequestMethod.POST)
    public String GetAccountsByUser(@RequestParam("inlineRadioOptions") String inlineRadioOptions){
        String value = null;
        if(inlineRadioOptions.equals("普通用户")){
            value = "普通用户";
        }
        if(inlineRadioOptions.equals("系统管理员")){
            value = "系统管理员";
        }
        return value;
    }
}
