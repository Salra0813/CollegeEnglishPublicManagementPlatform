package sicnu.sixteam.englishbackstage.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import java.util.Date;

//@Data
//@Builder
//@Entity
//@Table(name = "usr")
public class User {

//    @Id
//    @Column(length = 30,nullable = false)
//    @NotBlank(message="用户id不能为空")
    private String userid;//用户id
    private String uname;//    用户名
    private String passwd;//    密码
    private String sex;//性别
    private Date birthday;//出生日期
    private String pohone;//手机
    private String eid;//邮箱
    private String uschool;//学校
    private String headimg;//头像
    private String status;//角色
    private String uintrod;//简介

    public User(){}

    public User(String userid, String uname, String passwd, String sex, Date birthday, String pohone, String eid, String uschool, String headimg, String status, String uintrod) {
        this.userid = userid;
        this.uname = uname;
        this.passwd = passwd;
        this.sex = sex;
        this.birthday = birthday;
        this.pohone = pohone;
        this.eid = eid;
        this.uschool = uschool;
        this.headimg = headimg;
        this.status = status;
        this.uintrod = uintrod;
    }

    @Override
    public String toString() {
        return "User{" +
                "userid='" + userid + '\'' +
                ", uname='" + uname + '\'' +
                ", passwd='" + passwd + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", pohone='" + pohone + '\'' +
                ", eid='" + eid + '\'' +
                ", uschool='" + uschool + '\'' +
                ", headimg='" + headimg + '\'' +
                ", status='" + status + '\'' +
                ", uintrod='" + uintrod + '\'' +
                '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPohone() {
        return pohone;
    }

    public void setPohone(String pohone) {
        this.pohone = pohone;
    }

    public String getEid() {
        return eid;
    }

    public void setEid(String eid) {
        this.eid = eid;
    }

    public String getUschool() {
        return uschool;
    }

    public void setUschool(String uschool) {
        this.uschool = uschool;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getUintrod() {
        return uintrod;
    }

    public void setUintrod(String uintrod) {
        this.uintrod = uintrod;
    }




}