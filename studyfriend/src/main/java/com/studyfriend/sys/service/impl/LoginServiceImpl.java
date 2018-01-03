package com.studyfriend.sys.service.impl;

import com.studyfriend.sys.dao.SysStaffDAO;
import com.studyfriend.sys.pojo.SysStaff;
import com.studyfriend.sys.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private SysStaffDAO sysStaffDAO;

    @Override
    public boolean sysStaffLogin(String account, String passwd) {
        SysStaff sysStaff = sysStaffDAO.getSysStaffByAccount(account);
        if(sysStaff != null && sysStaff.getPasswd().equals(passwd)) {
            return true;
        }
        return false;
    }
}
