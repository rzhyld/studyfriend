package com.studyfriend.sys.web;

import com.studyfriend.sys.service.LoginService;
import com.studyfriend.sys.web.dto.LoginForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/")
    public String login(LoginForm loginForm) {

        return "syslogin/login";
    }

    @RequestMapping(value = "/sysLogin", method = RequestMethod.POST)
    public String sysLogin(LoginForm loginForm) {
        System.out.println("--------1" + loginForm.getUsername() + "1--1" + loginForm.getPasswd());
        if (loginForm.getUsername().trim() == "" || loginForm.getUsername().trim().equals("")) {

            loginForm.setReMessage("用户名不可以为空！");
            return login(loginForm);
        }
        if (loginService.sysStaffLogin(loginForm.getUsername(), loginForm.getPasswd())) {
            return "index";
        } else {
            loginForm.setReMessage("用户名或密码错误！");
            return login(loginForm);
        }

    }

}
