package com.atguigu.bean;

public class MlfrontReview {
	
    private Integer reviewId;

    private Integer reviewUid;

    private String reviewUname;

    private String reviewUimgurl;

    private Integer reviewPid;

    private String reviewPname;

    private String reviewCreatetime;

    private String reviewMotifytime;

    private String reviewConfirmtime;
    
    private String reviewStarttime;

    private String reviewEndtime;

    private Integer reviewStatus;

    private String reviewDetailstr;

    private String reviewImgidstr;

    private Integer reviewProstarnum;
    
    private Integer reviewFrom;

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewUid() {
        return reviewUid;
    }

    public void setReviewUid(Integer reviewUid) {
        this.reviewUid = reviewUid;
    }

    public String getReviewUname() {
        return reviewUname;
    }

    public void setReviewUname(String reviewUname) {
        this.reviewUname = reviewUname == null ? null : reviewUname.trim();
    }

    public String getReviewUimgurl() {
        return reviewUimgurl;
    }

    public void setReviewUimgurl(String reviewUimgurl) {
        this.reviewUimgurl = reviewUimgurl == null ? null : reviewUimgurl.trim();
    }

    public Integer getReviewPid() {
        return reviewPid;
    }

    public void setReviewPid(Integer reviewPid) {
        this.reviewPid = reviewPid;
    }

    public String getReviewPname() {
        return reviewPname;
    }

    public void setReviewPname(String reviewPname) {
        this.reviewPname = reviewPname == null ? null : reviewPname.trim();
    }

    public String getReviewCreatetime() {
        return reviewCreatetime;
    }

    public void setReviewCreatetime(String reviewCreatetime) {
        this.reviewCreatetime = reviewCreatetime == null ? null : reviewCreatetime.trim();
    }

    public String getReviewMotifytime() {
        return reviewMotifytime;
    }

    public void setReviewMotifytime(String reviewMotifytime) {
        this.reviewMotifytime = reviewMotifytime == null ? null : reviewMotifytime.trim();
    }

    public String getReviewConfirmtime() {
        return reviewConfirmtime;
    }

    public void setReviewConfirmtime(String reviewConfirmtime) {
        this.reviewConfirmtime = reviewConfirmtime == null ? null : reviewConfirmtime.trim();
    }
    
    public String getReviewStarttime() {
		return reviewStarttime;
	}

	public void setReviewStarttime(String reviewStarttime) {
		this.reviewStarttime = reviewStarttime == null ? null : reviewStarttime.trim();
	}

	public String getReviewEndtime() {
		return reviewEndtime;
	}

	public void setReviewEndtime(String reviewEndtime) {
		this.reviewEndtime = reviewEndtime == null ? null : reviewEndtime.trim();
	}

    public Integer getReviewStatus() {
        return reviewStatus;
    }

    public void setReviewStatus(Integer reviewStatus) {
        this.reviewStatus = reviewStatus;
    }

    public String getReviewDetailstr() {
        return reviewDetailstr;
    }

    public void setReviewDetailstr(String reviewDetailstr) {
        this.reviewDetailstr = reviewDetailstr == null ? null : reviewDetailstr.trim();
    }

    public String getReviewImgidstr() {
        return reviewImgidstr;
    }

    public void setReviewImgidstr(String reviewImgidstr) {
        this.reviewImgidstr = reviewImgidstr == null ? null : reviewImgidstr.trim();
    }

    public Integer getReviewProstarnum() {
        return reviewProstarnum;
    }

    public void setReviewProstarnum(Integer reviewProstarnum) {
        this.reviewProstarnum = reviewProstarnum;
    }

	public Integer getReviewFrom() {
		return reviewFrom;
	}

	public void setReviewFrom(Integer reviewFrom) {
		this.reviewFrom = reviewFrom;
	}
    
}