package com.gd.bean;

/**
 * 用户信息表
 * 
 * @author wcyong
 * 
 * @date 2018-07-23
 */
public class Usertable {
    /**
     * 用户编号
     */
    private Integer userid;

    /**
     * 用户姓名
     */
    private String realname;

    /**
     * 所在部门
     */
    private String department;

    /**
     * 查看电视的权限 0无权限 1有权限
     */
    private Integer tvpurview;

    /**
     * 查看电台的权限 0无权限 1有权限
     */
    private Integer fmpurvie;

    /**
     * 查看视图的权限 0无权限 1有权限
     */
    private Integer formview;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public Integer getTvpurview() {
        return tvpurview;
    }

    public void setTvpurview(Integer tvpurview) {
        this.tvpurview = tvpurview;
    }

    public Integer getFmpurvie() {
        return fmpurvie;
    }

    public void setFmpurvie(Integer fmpurvie) {
        this.fmpurvie = fmpurvie;
    }

    public Integer getFormview() {
        return formview;
    }

    public void setFormview(Integer formview) {
        this.formview = formview;
    }
}