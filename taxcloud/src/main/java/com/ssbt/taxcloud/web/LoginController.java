package com.ssbt.taxcloud.web;

import com.ssbt.taxcloud.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @Autowired
    private SysLoginService sysLoginService;

    @RequestMapping("/")
    public String login() {
        sysLoginService.userLogin("sys_admin","11");
        return "resultPage";
    }
}
