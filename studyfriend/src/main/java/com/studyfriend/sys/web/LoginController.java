package com.studyfriend.sys.web;

import com.studyfriend.sys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String login() {
        System.out.print("111111");
        return "syslogin/login";
    }

/*    @RequestMapping("/sysLogin")
    public String sysLogin() {

        return "index";
    }*/
}
