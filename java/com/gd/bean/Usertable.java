package com.gd.bean;

/**
 * �û���Ϣ��
 * 
 * @author wcyong
 * 
 * @date 2018-07-23
 */
public class Usertable {
    /**
     * �û����
     */
    private Integer userid;

    /**
     * �û�����
     */
    private String realname;

    /**
     * ���ڲ���
     */
    private String department;

    /**
     * �鿴���ӵ�Ȩ�� 0��Ȩ�� 1��Ȩ��
     */
    private Integer tvpurview;

    /**
     * �鿴��̨��Ȩ�� 0��Ȩ�� 1��Ȩ��
     */
    private Integer fmpurvie;

    /**
     * �鿴��ͼ��Ȩ�� 0��Ȩ�� 1��Ȩ��
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