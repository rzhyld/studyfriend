package com.studyfriend.sys.dao;

import com.studyfriend.sys.pojo.SysStaff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

/**
 * 人员信息对象DAO
 */
public interface SysStaffDAO extends JpaRepository<SysStaff, String>{

    /**
     * 根据登陆人员账号获取人员信息
     * @param account 人员登陆账号
     * @return 人员信息对象
     */
    @Query("select staff from SysStaff staff where account = ?1")
    public SysStaff getSysStaffByAccount(String account);


}
