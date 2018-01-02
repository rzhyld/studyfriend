package com.studyfriend.sys.pojo;

import java.io.Serializable;
import java.util.Date;

public class SysStaff implements Serializable {

//     int ID INT(11) NOT NULL AUTO_INCREMENT,
//    String STAFF_CODE VARCHAR(512) DEFAULT NULL COMMENT '人员编码',
//    String STAFF_NAME VARCHAR(512) DEFAULT NULL COMMENT '姓名',
//    int ORG_ID INT(11) DEFAULT NULL COMMENT '主岗ID 必定有',
//    String PERSON_TYPE VARCHAR(8) DEFAULT NULL COMMENT '人员类型',
//    String EMP_CODE VARCHAR(64) DEFAULT NULL COMMENT '身份证号',
//    String SEX CHAR(1) DEFAULT NULL COMMENT '性别 M 男 W 女',
//    Date DATE_OF_BIRTH DATE DEFAULT NULL COMMENT '出生日期',
//    Date ORIGINAL_HIRE_DATE DATE DEFAULT NULL COMMENT '入职日期',
//    EFFECTIVE_START_DATE DATE DEFAULT NULL COMMENT '生效日期',
//    EFFECTIVE_END_DATE DATE DEFAULT NULL COMMENT '',

    private Integer id;
    private String code;
    private String orgCode;
    private String name;
    private Integer orgId;
    private String personType;
    private String empCode;
    private String sex;
    private Date dateOfBirth;
    private Date originalHireDate;
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
}
