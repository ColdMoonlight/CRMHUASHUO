package com.atguigu.bean;

public class MlbackAdmin {
    private Integer adminId;

    private String adminAccname;

    private String adminPassword;

    private String adminOperatername;

    private Integer adminPower;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminAccname() {
        return adminAccname;
    }

    public void setAdminAccname(String adminAccname) {
        this.adminAccname = adminAccname == null ? null : adminAccname.trim();
    }

    public String getAdminPassword() {
        return adminPassword;
    }

    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword == null ? null : adminPassword.trim();
    }

    public String getAdminOperatername() {
        return adminOperatername;
    }

    public void setAdminOperatername(String adminOperatername) {
        this.adminOperatername = adminOperatername == null ? null : adminOperatername.trim();
    }

    public Integer getAdminPower() {
        return adminPower;
    }

    public void setAdminPower(Integer adminPower) {
        this.adminPower = adminPower;
    }
}