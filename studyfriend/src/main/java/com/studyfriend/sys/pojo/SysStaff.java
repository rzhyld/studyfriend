package com.studyfriend.sys.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "sys_staff")
public class SysStaff implements Serializable {

    @Id
    private Integer id; //主键
    private String staffCode; //人员编码
    private String staffName; //人员姓名
    private Integer orgId; //主岗ID
    private String personType; //人员类型
    private String empCode; //身份证号码
    private String sex; //性别 M：男 W：女
    private Date dateOfBirth; //出生日期
    private Date originalHireDate; //入职日期
    private Date effectiveStartDate; //生效日期
    private Date effectiveEndDate; //失效日期
    private String postcode; //邮政编码
    private String mailAddr; //通信地址
    private String phone; //电话
    private String email; //邮箱
    private String mobilPhone;//手机
    private String account; //账号
    private String passwd; //密码
    private String staffStatus; //是否在职等，Y，在职，N，离职，R，暂停
    private String attra;
    private String attrb;
    private String attrc;
    private String attrd;
    private String attre;
    private String attrf;
    private String attrg;
    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(String staffCode) {
        this.staffCode = staffCode;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getPersonType() {
        return personType;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getOriginalHireDate() {
        return originalHireDate;
    }

    public void setOriginalHireDate(Date originalHireDate) {
        this.originalHireDate = originalHireDate;
    }

    public Date getEffectiveStartDate() {
        return effectiveStartDate;
    }

    public void setEffectiveStartDate(Date effectiveStartDate) {
        this.effectiveStartDate = effectiveStartDate;
    }

    public Date getEffectiveEndDate() {
        return effectiveEndDate;
    }

    public void setEffectiveEndDate(Date effectiveEndDate) {
        this.effectiveEndDate = effectiveEndDate;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getMailAddr() {
        return mailAddr;
    }

    public void setMailAddr(String mailAddr) {
        this.mailAddr = mailAddr;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilPhone() {
        return mobilPhone;
    }

    public void setMobilPhone(String mobilPhone) {
        this.mobilPhone = mobilPhone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getStaffStatus() {
        return staffStatus;
    }

    public void setStaffStatus(String staffStatus) {
        this.staffStatus = staffStatus;
    }

    public String getAttra() {
        return attra;
    }

    public void setAttra(String attra) {
        this.attra = attra;
    }

    public String getAttrb() {
        return attrb;
    }

    public void setAttrb(String attrb) {
        this.attrb = attrb;
    }

    public String getAttrc() {
        return attrc;
    }

    public void setAttrc(String attrc) {
        this.attrc = attrc;
    }

    public String getAttrd() {
        return attrd;
    }

    public void setAttrd(String attrd) {
        this.attrd = attrd;
    }

    public String getAttre() {
        return attre;
    }

    public void setAttre(String attre) {
        this.attre = attre;
    }

    public String getAttrf() {
        return attrf;
    }

    public void setAttrf(String attrf) {
        this.attrf = attrf;
    }

    public String getAttrg() {
        return attrg;
    }

    public void setAttrg(String attrg) {
        this.attrg = attrg;
    }
}
