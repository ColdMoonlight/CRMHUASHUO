package com.atguigu.bean;

public class MlbackReviewImg {
    private Integer reviewimgId;

    private String reviewimgName;

    private String reviewimgUrl;

    private Integer reviewId;

    private Integer reviewimgSortOrder;

    private String reviewimgCreatetime;

    private String reviewimgMotifytime;

    public Integer getReviewimgId() {
        return reviewimgId;
    }

    public void setReviewimgId(Integer reviewimgId) {
        this.reviewimgId = reviewimgId;
    }

    public String getReviewimgName() {
        return reviewimgName;
    }

    public void setReviewimgName(String reviewimgName) {
        this.reviewimgName = reviewimgName == null ? null : reviewimgName.trim();
    }

    public String getReviewimgUrl() {
        return reviewimgUrl;
    }

    public void setReviewimgUrl(String reviewimgUrl) {
        this.reviewimgUrl = reviewimgUrl == null ? null : reviewimgUrl.trim();
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public Integer getReviewimgSortOrder() {
        return reviewimgSortOrder;
    }

    public void setReviewimgSortOrder(Integer reviewimgSortOrder) {
        this.reviewimgSortOrder = reviewimgSortOrder;
    }

    public String getReviewimgCreatetime() {
        return reviewimgCreatetime;
    }

    public void setReviewimgCreatetime(String reviewimgCreatetime) {
        this.reviewimgCreatetime = reviewimgCreatetime == null ? null : reviewimgCreatetime.trim();
    }

    public String getReviewimgMotifytime() {
        return reviewimgMotifytime;
    }

    public void setReviewimgMotifytime(String reviewimgMotifytime) {
        this.reviewimgMotifytime = reviewimgMotifytime == null ? null : reviewimgMotifytime.trim();
    }

	public MlbackReviewImg(Integer reviewimgId, String reviewimgName, String reviewimgUrl, Integer reviewId,
			Integer reviewimgSortOrder, String reviewimgCreatetime, String reviewimgMotifytime) {
		super();
		this.reviewimgId = reviewimgId;
		this.reviewimgName = reviewimgName;
		this.reviewimgUrl = reviewimgUrl;
		this.reviewId = reviewId;
		this.reviewimgSortOrder = reviewimgSortOrder;
		this.reviewimgCreatetime = reviewimgCreatetime;
		this.reviewimgMotifytime = reviewimgMotifytime;
	}

	public MlbackReviewImg() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "MlbackReviewImg [reviewimgId=" + reviewimgId + ", reviewimgName=" + reviewimgName + ", reviewimgUrl="
				+ reviewimgUrl + ", reviewId=" + reviewId + ", reviewimgSortOrder=" + reviewimgSortOrder
				+ ", reviewimgCreatetime=" + reviewimgCreatetime + ", reviewimgMotifytime=" + reviewimgMotifytime + "]";
	}
    
}