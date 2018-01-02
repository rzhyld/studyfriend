package com.studyfriend.sys.service;

/**
 * 登陆操作
 */
public interface LoginService {

    /**
     * 人员登陆
     * @param account 账号
     * @param passwd 密码
     * @return 是否正确
     */
    public boolean sysStaffLogin(String account, String passwd);
}
