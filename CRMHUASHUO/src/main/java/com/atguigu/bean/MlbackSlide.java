package com.atguigu.bean;

public class MlbackSlide {
    private Integer slideId;

    private String slideName;

    private Integer slideArea;

    private Integer slideFirthNum;

    private Integer slideWapstatus;

    private Integer slidePcstatus;

    private String slideWapimgurl;

    private String slidePcimgurl;

    private Integer slideProid;

    private String slideProname;

    private String slideSeoname;
    
    private Integer slideCateid;	//产品id
    
    private String slideCatename;	//产品名字
    
    private String slideCateSeoname;	//产品名字
    
    private Integer slideIfproORcateORpage;	//产品Seo名字	0pro	1cate	2page
    
    private String slidePagename;	//活动名字
    
    private String slidePageSeoname;	//活动seo路径名字

    private Integer slideIfinto;

    private String slideCreatetime;

    private String slideMotifytime;

    public Integer getSlideId() {
        return slideId;
    }

    public void setSlideId(Integer slideId) {
        this.slideId = slideId;
    }

    public String getSlideName() {
        return slideName;
    }

    public void setSlideName(String slideName) {
        this.slideName = slideName == null ? null : slideName.trim();
    }

    public Integer getSlideArea() {
        return slideArea;
    }

    public void setSlideArea(Integer slideArea) {
        this.slideArea = slideArea;
    }

    public Integer getSlideFirthNum() {
        return slideFirthNum;
    }

    public void setSlideFirthNum(Integer slideFirthNum) {
        this.slideFirthNum = slideFirthNum;
    }

    public Integer getSlideWapstatus() {
        return slideWapstatus;
    }

    public void setSlideWapstatus(Integer slideWapstatus) {
        this.slideWapstatus = slideWapstatus;
    }

    public Integer getSlidePcstatus() {
        return slidePcstatus;
    }

    public void setSlidePcstatus(Integer slidePcstatus) {
        this.slidePcstatus = slidePcstatus;
    }

    public String getSlideWapimgurl() {
        return slideWapimgurl;
    }

    public void setSlideWapimgurl(String slideWapimgurl) {
        this.slideWapimgurl = slideWapimgurl == null ? null : slideWapimgurl.trim();
    }

    public String getSlidePcimgurl() {
        return slidePcimgurl;
    }

    public void setSlidePcimgurl(String slidePcimgurl) {
        this.slidePcimgurl = slidePcimgurl == null ? null : slidePcimgurl.trim();
    }

    public Integer getSlideProid() {
        return slideProid;
    }

    public void setSlideProid(Integer slideProid) {
        this.slideProid = slideProid;
    }

    public String getSlideProname() {
        return slideProname;
    }

    public void setSlideProname(String slideProname) {
        this.slideProname = slideProname == null ? null : slideProname.trim();
    }

    public String getSlideSeoname() {
        return slideSeoname;
    }

    public void setSlideSeoname(String slideSeoname) {
        this.slideSeoname = slideSeoname == null ? null : slideSeoname.trim();
    }
    
    public Integer getSlideCateid() {
		return slideCateid;
	}

	public void setSlideCateid(Integer slideCateid) {
		this.slideCateid = slideCateid;
	}

	public String getSlideCatename() {
		return slideCatename;
	}

	public void setSlideCatename(String slideCatename) {
		this.slideCatename = slideCatename == null ? null : slideCatename.trim();
	}

	public String getSlideCateSeoname() {
		return slideCateSeoname;
	}

	public void setSlideCateSeoname(String slideCateSeoname) {
		this.slideCateSeoname = slideCateSeoname == null ? null : slideCateSeoname.trim();
	}

	public Integer getSlideIfproORcateORpage() {
		return slideIfproORcateORpage;
	}

	public void setSlideIfproORcateORpage(Integer slideIfproORcateORpage) {
		this.slideIfproORcateORpage = slideIfproORcateORpage;
	}

	public String getSlidePagename() {
		return slidePagename;
	}

	public void setSlidePagename(String slidePagename) {
		this.slidePagename = slidePagename == null ? null : slidePagename.trim();
	}

	public String getSlidePageSeoname() {
		return slidePageSeoname;
	}

	public void setSlidePageSeoname(String slidePageSeoname) {
		this.slidePageSeoname = slidePageSeoname == null ? null : slidePageSeoname.trim();
	}

	public Integer getSlideIfinto() {
        return slideIfinto;
    }

    public void setSlideIfinto(Integer slideIfinto) {
        this.slideIfinto = slideIfinto;
    }

    public String getSlideCreatetime() {
        return slideCreatetime;
    }

    public void setSlideCreatetime(String slideCreatetime) {
        this.slideCreatetime = slideCreatetime == null ? null : slideCreatetime.trim();
    }

    public String getSlideMotifytime() {
        return slideMotifytime;
    }

    public void setSlideMotifytime(String slideMotifytime) {
        this.slideMotifytime = slideMotifytime == null ? null : slideMotifytime.trim();
    }

	public MlbackSlide() {
		super();
	}

	public MlbackSlide(Integer slideId, String slideName, Integer slideArea, Integer slideFirthNum,
			Integer slideWapstatus, Integer slidePcstatus, String slideWapimgurl, String slidePcimgurl,
			Integer slideProid, String slideProname, String slideSeoname, Integer slideCateid, String slideCatename,
			String slideCateSeoname, Integer slideIfproORcateORpage, String slidePagename, String slidePageSeoname,
			Integer slideIfinto, String slideCreatetime, String slideMotifytime) {
		super();
		this.slideId = slideId;
		this.slideName = slideName;
		this.slideArea = slideArea;
		this.slideFirthNum = slideFirthNum;
		this.slideWapstatus = slideWapstatus;
		this.slidePcstatus = slidePcstatus;
		this.slideWapimgurl = slideWapimgurl;
		this.slidePcimgurl = slidePcimgurl;
		this.slideProid = slideProid;
		this.slideProname = slideProname;
		this.slideSeoname = slideSeoname;
		this.slideCateid = slideCateid;
		this.slideCatename = slideCatename;
		this.slideCateSeoname = slideCateSeoname;
		this.slideIfproORcateORpage = slideIfproORcateORpage;
		this.slidePagename = slidePagename;
		this.slidePageSeoname = slidePageSeoname;
		this.slideIfinto = slideIfinto;
		this.slideCreatetime = slideCreatetime;
		this.slideMotifytime = slideMotifytime;
	}

	@Override
	public String toString() {
		return "MlbackSlide [slideId=" + slideId + ", slideName=" + slideName + ", slideArea=" + slideArea
				+ ", slideFirthNum=" + slideFirthNum + ", slideWapstatus=" + slideWapstatus + ", slidePcstatus="
				+ slidePcstatus + ", slideWapimgurl=" + slideWapimgurl + ", slidePcimgurl=" + slidePcimgurl
				+ ", slideProid=" + slideProid + ", slideProname=" + slideProname + ", slideSeoname=" + slideSeoname
				+ ", slideCateid=" + slideCateid + ", slideCatename=" + slideCatename + ", slideCateSeoname="
				+ slideCateSeoname + ", slideIfproORcateORpage=" + slideIfproORcateORpage + ", slidePagename="
				+ slidePagename + ", slidePageSeoname=" + slidePageSeoname + ", slideIfinto=" + slideIfinto
				+ ", slideCreatetime=" + slideCreatetime + ", slideMotifytime=" + slideMotifytime + "]";
	}
    
}