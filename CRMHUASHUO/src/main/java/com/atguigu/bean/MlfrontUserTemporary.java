package com.atguigu.bean;

public class MlfrontUserTemporary {
    private Integer usertemporaryId;

    private String usertemporaryIp;

    private String usertemporaryCreatetime;

    private String usertemporaryMotifytime;

    public Integer getUsertemporaryId() {
        return usertemporaryId;
    }

    public void setUsertemporaryId(Integer usertemporaryId) {
        this.usertemporaryId = usertemporaryId;
    }

    public String getUsertemporaryIp() {
        return usertemporaryIp;
    }

    public void setUsertemporaryIp(String usertemporaryIp) {
        this.usertemporaryIp = usertemporaryIp == null ? null : usertemporaryIp.trim();
    }

    public String getUsertemporaryCreatetime() {
        return usertemporaryCreatetime;
    }

    public void setUsertemporaryCreatetime(String usertemporaryCreatetime) {
        this.usertemporaryCreatetime = usertemporaryCreatetime == null ? null : usertemporaryCreatetime.trim();
    }

    public String getUsertemporaryMotifytime() {
        return usertemporaryMotifytime;
    }

    public void setUsertemporaryMotifytime(String usertemporaryMotifytime) {
        this.usertemporaryMotifytime = usertemporaryMotifytime == null ? null : usertemporaryMotifytime.trim();
    }
}