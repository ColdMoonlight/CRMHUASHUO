package com.atguigu.bean;

public class MlbackProductViewDetail {
    private Integer proviewdetailId;

    private String proviewdetailSessionid;

    private String proviewdetailName;

    private Integer proviewdetailProid;

    private String proviewdetailProname;

    private String proviewdetailSeoname;

    private String proviewdetailCreatetime;

    private String proviewdetailMotifytime;
    
    private String proviewdetailStarttime;
    
    private String proviewdetailEndtime;

    public Integer getProviewdetailId() {
        return proviewdetailId;
    }

    public void setProviewdetailId(Integer proviewdetailId) {
        this.proviewdetailId = proviewdetailId;
    }

    public String getProviewdetailSessionid() {
        return proviewdetailSessionid;
    }

    public void setProviewdetailSessionid(String proviewdetailSessionid) {
        this.proviewdetailSessionid = proviewdetailSessionid == null ? null : proviewdetailSessionid.trim();
    }

    public String getProviewdetailName() {
        return proviewdetailName;
    }

    public void setProviewdetailName(String proviewdetailName) {
        this.proviewdetailName = proviewdetailName == null ? null : proviewdetailName.trim();
    }

    public Integer getProviewdetailProid() {
        return proviewdetailProid;
    }

    public void setProviewdetailProid(Integer proviewdetailProid) {
        this.proviewdetailProid = proviewdetailProid;
    }

    public String getProviewdetailProname() {
        return proviewdetailProname;
    }

    public void setProviewdetailProname(String proviewdetailProname) {
        this.proviewdetailProname = proviewdetailProname == null ? null : proviewdetailProname.trim();
    }

    public String getProviewdetailSeoname() {
        return proviewdetailSeoname;
    }

    public void setProviewdetailSeoname(String proviewdetailSeoname) {
        this.proviewdetailSeoname = proviewdetailSeoname == null ? null : proviewdetailSeoname.trim();
    }

    public String getProviewdetailCreatetime() {
        return proviewdetailCreatetime;
    }

    public void setProviewdetailCreatetime(String proviewdetailCreatetime) {
        this.proviewdetailCreatetime = proviewdetailCreatetime == null ? null : proviewdetailCreatetime.trim();
    }

    public String getProviewdetailMotifytime() {
        return proviewdetailMotifytime;
    }

    public void setProviewdetailMotifytime(String proviewdetailMotifytime) {
        this.proviewdetailMotifytime = proviewdetailMotifytime == null ? null : proviewdetailMotifytime.trim();
    }

	public String getProviewdetailStarttime() {
		return proviewdetailStarttime;
	}

	public void setProviewdetailStarttime(String proviewdetailStarttime) {
		this.proviewdetailStarttime = proviewdetailStarttime == null ? null : proviewdetailStarttime.trim();
	}

	public String getProviewdetailEndtime() {
		return proviewdetailEndtime;
	}

	public void setProviewdetailEndtime(String proviewdetailEndtime) {
		this.proviewdetailEndtime = proviewdetailEndtime == null ? null : proviewdetailEndtime.trim();
	}

}