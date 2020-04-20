package com.atguigu.bean;

public class MlbackActShowPro {
    private Integer actshowproId;	//活动品id

    private String actshowproName;	//活动品name

    private Integer actshowproActnum;	//活动品的活动组

    private Integer actshowproProid;	//产品id

    private String actshowproProname;	//产品名字
    
    private String actshowproSeoname;	//产品Seo名字
    
    private Integer actshowproCateid;	//类id

    private String actshowproCatename;	//类名字
    
    private String actshowproCateSeoname;	//类Seo名
    
    private String actshowproPageSeoname;	//活动seo路径名字
    
    private Integer actshowproIfproORcate;	//产品Seo名字

    private String actshowproImgwapurl;	//活动品wap端图

    private String actshowproImgpcurl;	//活动品PC端图

    private Integer actshowproStatus;	//活动品状态

    private Integer actshowproOrderth;	//活动品同级别编号

    private String actshowproCreatetime;	//创建时间

    private String actshowproMotifytime;	//更改时间

    public Integer getActshowproId() {
        return actshowproId;
    }

    public void setActshowproId(Integer actshowproId) {
        this.actshowproId = actshowproId;
    }

    public String getActshowproName() {
        return actshowproName;
    }

    public void setActshowproName(String actshowproName) {
        this.actshowproName = actshowproName == null ? null : actshowproName.trim();
    }

    public Integer getActshowproActnum() {
        return actshowproActnum;
    }

    public void setActshowproActnum(Integer actshowproActnum) {
        this.actshowproActnum = actshowproActnum;
    }

    public Integer getActshowproProid() {
        return actshowproProid;
    }

    public void setActshowproProid(Integer actshowproProid) {
        this.actshowproProid = actshowproProid;
    }

    public String getActshowproProname() {
        return actshowproProname;
    }

    public void setActshowproProname(String actshowproProname) {
        this.actshowproProname = actshowproProname == null ? null : actshowproProname.trim();
    }
    
    public String getActshowproSeoname() {
		return actshowproSeoname;
	}

	public void setActshowproSeoname(String actshowproSeoname) {
		this.actshowproSeoname = actshowproSeoname == null ? null : actshowproSeoname.trim();
	}
	
	public Integer getActshowproCateid() {
		return actshowproCateid;
	}

	public void setActshowproCateid(Integer actshowproCateid) {
		this.actshowproCateid = actshowproCateid;
	}

	public String getActshowproCatename() {
		return actshowproCatename;
	}

	public void setActshowproCatename(String actshowproCatename) {
		this.actshowproCatename = actshowproCatename == null ? null : actshowproCatename.trim();
	}
	
	public String getActshowproCateSeoname() {
		return actshowproCateSeoname;
	}

	public void setActshowproCateSeoname(String actshowproCateSeoname) {
		this.actshowproCateSeoname = actshowproCateSeoname == null ? null : actshowproCateSeoname.trim();
	}

	public String getActshowproPageSeoname() {
		return actshowproPageSeoname;
	}

	public void setActshowproPageSeoname(String actshowproPageSeoname) {
		this.actshowproPageSeoname = actshowproPageSeoname == null ? null : actshowproPageSeoname.trim();
	}

	public Integer getActshowproIfproORcate() {
		return actshowproIfproORcate;
	}

	public void setActshowproIfproORcate(Integer actshowproIfproORcate) {
		this.actshowproIfproORcate = actshowproIfproORcate;
	}

	public String getActshowproImgwapurl() {
        return actshowproImgwapurl;
    }

    public void setActshowproImgwapurl(String actshowproImgwapurl) {
        this.actshowproImgwapurl = actshowproImgwapurl == null ? null : actshowproImgwapurl.trim();
    }

    public String getActshowproImgpcurl() {
        return actshowproImgpcurl;
    }

    public void setActshowproImgpcurl(String actshowproImgpcurl) {
        this.actshowproImgpcurl = actshowproImgpcurl == null ? null : actshowproImgpcurl.trim();
    }

    public Integer getActshowproStatus() {
        return actshowproStatus;
    }

    public void setActshowproStatus(Integer actshowproStatus) {
        this.actshowproStatus = actshowproStatus;
    }

    public Integer getActshowproOrderth() {
        return actshowproOrderth;
    }

    public void setActshowproOrderth(Integer actshowproOrderth) {
        this.actshowproOrderth = actshowproOrderth;
    }

    public String getActshowproCreatetime() {
        return actshowproCreatetime;
    }

    public void setActshowproCreatetime(String actshowproCreatetime) {
        this.actshowproCreatetime = actshowproCreatetime == null ? null : actshowproCreatetime.trim();
    }

    public String getActshowproMotifytime() {
        return actshowproMotifytime;
    }

    public void setActshowproMotifytime(String actshowproMotifytime) {
        this.actshowproMotifytime = actshowproMotifytime == null ? null : actshowproMotifytime.trim();
    }
    
	public MlbackActShowPro() {
		super();
	}

	public MlbackActShowPro(Integer actshowproId, String actshowproName, Integer actshowproActnum,
			Integer actshowproProid, String actshowproProname, String actshowproSeoname, Integer actshowproCateid,
			String actshowproCatename, String actshowproCateSeoname, String actshowproPageSeoname,
			Integer actshowproIfproORcate, String actshowproImgwapurl, String actshowproImgpcurl,
			Integer actshowproStatus, Integer actshowproOrderth, String actshowproCreatetime,
			String actshowproMotifytime) {
		super();
		this.actshowproId = actshowproId;
		this.actshowproName = actshowproName;
		this.actshowproActnum = actshowproActnum;
		this.actshowproProid = actshowproProid;
		this.actshowproProname = actshowproProname;
		this.actshowproSeoname = actshowproSeoname;
		this.actshowproCateid = actshowproCateid;
		this.actshowproCatename = actshowproCatename;
		this.actshowproCateSeoname = actshowproCateSeoname;
		this.actshowproPageSeoname = actshowproPageSeoname;
		this.actshowproIfproORcate = actshowproIfproORcate;
		this.actshowproImgwapurl = actshowproImgwapurl;
		this.actshowproImgpcurl = actshowproImgpcurl;
		this.actshowproStatus = actshowproStatus;
		this.actshowproOrderth = actshowproOrderth;
		this.actshowproCreatetime = actshowproCreatetime;
		this.actshowproMotifytime = actshowproMotifytime;
	}

	@Override
	public String toString() {
		return "MlbackActShowPro [actshowproId=" + actshowproId + ", actshowproName=" + actshowproName
				+ ", actshowproActnum=" + actshowproActnum + ", actshowproProid=" + actshowproProid
				+ ", actshowproProname=" + actshowproProname + ", actshowproSeoname=" + actshowproSeoname
				+ ", actshowproCateid=" + actshowproCateid + ", actshowproCatename=" + actshowproCatename
				+ ", actshowproCateSeoname=" + actshowproCateSeoname + ", actshowproPageSeoname=" + actshowproPageSeoname
				+ ", actshowproIfproORcate=" + actshowproIfproORcate + ", actshowproImgwapurl=" + actshowproImgwapurl
				+ ", actshowproImgpcurl=" + actshowproImgpcurl + ", actshowproStatus=" + actshowproStatus
				+ ", actshowproOrderth=" + actshowproOrderth + ", actshowproCreatetime=" + actshowproCreatetime
				+ ", actshowproMotifytime=" + actshowproMotifytime + "]";
	}

}