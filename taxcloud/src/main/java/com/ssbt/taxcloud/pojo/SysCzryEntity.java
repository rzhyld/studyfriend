package com.ssbt.taxcloud.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_czry")
public class SysCzryEntity implements Serializable {

    @Id
    private String dlzh;
    private String sjhm;
    private String nsrsbh;
    private String dept_code_path;
    private String dlmm;
    private String nsrmc;
    private Date lrrq;
    private Date xgrq;
    private String lrry;
    private String xgry;
    private String yxbz;
    private Date qsrq;
    private Date zzrq;
    private String user_name;
    private String email;
    private String yhlx;
    private String dept_id;
    private Date dlsj;
    private Date cwsj;
    private String cwcs;
    private String sdbz;
    private String swjgdm;
    private String xzqh;
    private String qt_code_path;

    public String getDlzh() {
        return dlzh;
    }

    public void setDlzh(String dlzh) {
        this.dlzh = dlzh;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getNsrsbh() {
        return nsrsbh;
    }

    public void setNsrsbh(String nsrsbh) {
        this.nsrsbh = nsrsbh;
    }

    public String getDept_code_path() {
        return dept_code_path;
    }

    public void setDept_code_path(String dept_code_path) {
        this.dept_code_path = dept_code_path;
    }

    public String getDlmm() {
        return dlmm;
    }

    public void setDlmm(String dlmm) {
        this.dlmm = dlmm;
    }

    public String getNsrmc() {
        return nsrmc;
    }

    public void setNsrmc(String nsrmc) {
        this.nsrmc = nsrmc;
    }

    public Date getLrrq() {
        return lrrq;
    }

    public void setLrrq(Date lrrq) {
        this.lrrq = lrrq;
    }

    public Date getXgrq() {
        return xgrq;
    }

    public void setXgrq(Date xgrq) {
        this.xgrq = xgrq;
    }

    public String getLrry() {
        return lrry;
    }

    public void setLrry(String lrry) {
        this.lrry = lrry;
    }

    public String getXgry() {
        return xgry;
    }

    public void setXgry(String xgry) {
        this.xgry = xgry;
    }

    public String getYxbz() {
        return yxbz;
    }

    public void setYxbz(String yxbz) {
        this.yxbz = yxbz;
    }

    public Date getQsrq() {
        return qsrq;
    }

    public void setQsrq(Date qsrq) {
        this.qsrq = qsrq;
    }

    public Date getZzrq() {
        return zzrq;
    }

    public void setZzrq(Date zzrq) {
        this.zzrq = zzrq;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getYhlx() {
        return yhlx;
    }

    public void setYhlx(String yhlx) {
        this.yhlx = yhlx;
    }

    public String getDept_id() {
        return dept_id;
    }

    public void setDept_id(String dept_id) {
        this.dept_id = dept_id;
    }

    public Date getDlsj() {
        return dlsj;
    }

    public void setDlsj(Date dlsj) {
        this.dlsj = dlsj;
    }

    public Date getCwsj() {
        return cwsj;
    }

    public void setCwsj(Date cwsj) {
        this.cwsj = cwsj;
    }

    public String getCwcs() {
        return cwcs;
    }

    public void setCwcs(String cwcs) {
        this.cwcs = cwcs;
    }

    public String getSdbz() {
        return sdbz;
    }

    public void setSdbz(String sdbz) {
        this.sdbz = sdbz;
    }

    public String getSwjgdm() {
        return swjgdm;
    }

    public void setSwjgdm(String swjgdm) {
        this.swjgdm = swjgdm;
    }

    public String getXzqh() {
        return xzqh;
    }

    public void setXzqh(String xzqh) {
        this.xzqh = xzqh;
    }

    public String getQt_code_path() {
        return qt_code_path;
    }

    public void setQt_code_path(String qt_code_path) {
        this.qt_code_path = qt_code_path;
    }
}
