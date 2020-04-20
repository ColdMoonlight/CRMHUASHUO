package com.atguigu.bean;

public class MlbackEmail {
    private Integer emailId;

    private String emailName;

    private String emailStatus;

    private String emailCreatetime;

    private String emailMotifytime;

    private String emailContent;

    public Integer getEmailId() {
        return emailId;
    }

    public void setEmailId(Integer emailId) {
        this.emailId = emailId;
    }

    public String getEmailName() {
        return emailName;
    }

    public void setEmailName(String emailName) {
        this.emailName = emailName == null ? null : emailName.trim();
    }

    public String getEmailStatus() {
        return emailStatus;
    }

    public void setEmailStatus(String emailStatus) {
        this.emailStatus = emailStatus == null ? null : emailStatus.trim();
    }

    public String getEmailCreatetime() {
        return emailCreatetime;
    }

    public void setEmailCreatetime(String emailCreatetime) {
        this.emailCreatetime = emailCreatetime == null ? null : emailCreatetime.trim();
    }

    public String getEmailMotifytime() {
        return emailMotifytime;
    }

    public void setEmailMotifytime(String emailMotifytime) {
        this.emailMotifytime = emailMotifytime == null ? null : emailMotifytime.trim();
    }

    public String getEmailContent() {
        return emailContent;
    }

    public void setEmailContent(String emailContent) {
        this.emailContent = emailContent == null ? null : emailContent.trim();
    }
}