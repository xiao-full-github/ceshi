package cn.com.yzton.controller;

import cn.com.yzton.secondary.entity.EapUser2;
import cn.com.yzton.secondary.service.EapUser2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/eapUser2")
public class EapUser2Controller {
    @Autowired(required = false)
    private EapUser2Service eapUser2Service;
    /*
        登录
     */
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public EapUser2 login(String name, String password,
                          HttpServletRequest request) {
        HttpSession session = request.getSession();
        try {
            EapUser2 eapUser = eapUser2Service.login(name, password, true,
                    false, false);//true  1    false  0
            session.setAttribute("eapUser", eapUser);
            return eapUser;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public List<EapUser2> query() {
        return eapUser2Service.selectByExample(null);
    }
}
