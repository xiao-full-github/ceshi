package cn.com.yzton.controller;

import cn.com.yzton.primary.entity.EapUser;
import cn.com.yzton.primary.service.EapUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/eapUser")
public class EapUserController {
    @Autowired(required = false)
    private EapUserService eapUserService;



    @RequestMapping(value = "/GetPersonName",method = RequestMethod.GET)
    public String GetPersonName(){
        return "";
    }

}
