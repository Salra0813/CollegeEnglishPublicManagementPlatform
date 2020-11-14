package sicnu.sixteam.englishbackstage.model;

import java.net.ServerSocket;

public class Course {
    private String cid;//课程id
    private String cname;//课程名
    private String cintrod;//课程介绍
    private String cschool;//开课学校
    private String tname;//开课老师
    private String tintrod;//老师简介
    private String tags;//标签
    private Integer snumber;//当前课程人数
    private String sufiimg;//封面图片
    private String reason;//开课理由

    public Course(String cid, String cname, String cintrod, String cschool, String tname, String tintrod, String tags, Integer snumber, String sufiimg, String reason) {
        this.cid = cid;
        this.cname = cname;
        this.cintrod = cintrod;
        this.cschool = cschool;
        this.tname = tname;
        this.tintrod = tintrod;
        this.tags = tags;
        this.snumber = snumber;
        this.sufiimg = sufiimg;
        this.reason = reason;
    }

    public Course(){}

    @Override
    public String toString() {
        return "Course{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", cintrod='" + cintrod + '\'' +
                ", cschool='" + cschool + '\'' +
                ", tname='" + tname + '\'' +
                ", tintrod='" + tintrod + '\'' +
                ", tags='" + tags + '\'' +
                ", snumber=" + snumber +
                ", sufiimg='" + sufiimg + '\'' +
                ", reason='" + reason + '\'' +
                '}';
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public String getCintrod() {
        return cintrod;
    }

    public void setCintrod(String cintrod) {
        this.cintrod = cintrod;
    }

    public String getCschool() {
        return cschool;
    }

    public void setCschool(String cschool) {
        this.cschool = cschool;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getTintrod() {
        return tintrod;
    }

    public void setTintrod(String tintrod) {
        this.tintrod = tintrod;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public Integer getSnumber() {
        return snumber;
    }

    public void setSnumber(Integer snumber) {
        this.snumber = snumber;
    }

    public String getSufiimg() {
        return sufiimg;
    }

    public void setSufiimg(String sufiimg) {
        this.sufiimg = sufiimg;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

}
