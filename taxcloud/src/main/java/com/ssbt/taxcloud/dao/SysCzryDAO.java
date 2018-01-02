package com.ssbt.taxcloud.dao;

import com.ssbt.taxcloud.pojo.SysCzryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.awt.print.Pageable;
import java.util.List;

public interface SysCzryDAO extends JpaRepository<SysCzryEntity, String> {

    @Query("select czry from SysCzryEntity czry where dlzh = ?1")
    public SysCzryEntity findSysCzryEntityByDlzh(String dlzh);

    @Query("select czry from SysCzryEntity czry where sjhm like ?1")
    public List<SysCzryEntity> findAllByParam(String sjhm, Pageable pageable);


}
