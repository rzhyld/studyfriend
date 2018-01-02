package com.ssbt.taxcloud.service.impl;

import com.ssbt.taxcloud.dao.SysCzryDAO;
import com.ssbt.taxcloud.pojo.SysCzryEntity;
import com.ssbt.taxcloud.service.SysLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysLoginServiceImpl implements SysLoginService {

    @Autowired
    private SysCzryDAO sysCzryDAO;

    @Override
    public boolean userLogin(String dlzh, String dlmm) {
        SysCzryEntity loginCzry = sysCzryDAO.findSysCzryEntityByDlzh(dlzh);
        return false;
    }
}
