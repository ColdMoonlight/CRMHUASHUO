package com.atguigu.bean;

public class ImgCategory {
    private Integer imgCategoryId;

    private String imgCategoryName;

    private Integer imgCategoryParentId;

    private String imgCategoryParentName;

    private String imgCategorySeo;

    private Integer imgCategorySortOrder;

    private String imgCategoryCreatetime;

    private String imgCategoryMotifytime;

    private String imgCategoryDesc;

    public Integer getImgCategoryId() {
        return imgCategoryId;
    }

    public void setImgCategoryId(Integer imgCategoryId) {
        this.imgCategoryId = imgCategoryId;
    }

    public String getImgCategoryName() {
        return imgCategoryName;
    }

    public void setImgCategoryName(String imgCategoryName) {
        this.imgCategoryName = imgCategoryName == null ? null : imgCategoryName.trim();
    }

    public Integer getImgCategoryParentId() {
        return imgCategoryParentId;
    }

    public void setImgCategoryParentId(Integer imgCategoryParentId) {
        this.imgCategoryParentId = imgCategoryParentId;
    }

    public String getImgCategoryParentName() {
        return imgCategoryParentName;
    }

    public void setImgCategoryParentName(String imgCategoryParentName) {
        this.imgCategoryParentName = imgCategoryParentName == null ? null : imgCategoryParentName.trim();
    }

    public String getImgCategorySeo() {
        return imgCategorySeo;
    }

    public void setImgCategorySeo(String imgCategorySeo) {
        this.imgCategorySeo = imgCategorySeo == null ? null : imgCategorySeo.trim();
    }

    public Integer getImgCategorySortOrder() {
        return imgCategorySortOrder;
    }

    public void setImgCategorySortOrder(Integer imgCategorySortOrder) {
        this.imgCategorySortOrder = imgCategorySortOrder;
    }

    public String getImgCategoryCreatetime() {
        return imgCategoryCreatetime;
    }

    public void setImgCategoryCreatetime(String imgCategoryCreatetime) {
        this.imgCategoryCreatetime = imgCategoryCreatetime == null ? null : imgCategoryCreatetime.trim();
    }

    public String getImgCategoryMotifytime() {
        return imgCategoryMotifytime;
    }

    public void setImgCategoryMotifytime(String imgCategoryMotifytime) {
        this.imgCategoryMotifytime = imgCategoryMotifytime == null ? null : imgCategoryMotifytime.trim();
    }

    public String getImgCategoryDesc() {
        return imgCategoryDesc;
    }

    public void setImgCategoryDesc(String imgCategoryDesc) {
        this.imgCategoryDesc = imgCategoryDesc == null ? null : imgCategoryDesc.trim();
    }

	public ImgCategory() {
		super();
	}

	public ImgCategory(Integer imgCategoryId, String imgCategoryName, Integer imgCategoryParentId,
			String imgCategoryParentName, String imgCategorySeo, Integer imgCategorySortOrder,
			String imgCategoryCreatetime, String imgCategoryMotifytime, String imgCategoryDesc) {
		super();
		this.imgCategoryId = imgCategoryId;
		this.imgCategoryName = imgCategoryName;
		this.imgCategoryParentId = imgCategoryParentId;
		this.imgCategoryParentName = imgCategoryParentName;
		this.imgCategorySeo = imgCategorySeo;
		this.imgCategorySortOrder = imgCategorySortOrder;
		this.imgCategoryCreatetime = imgCategoryCreatetime;
		this.imgCategoryMotifytime = imgCategoryMotifytime;
		this.imgCategoryDesc = imgCategoryDesc;
	}

	@Override
	public String toString() {
		return "ImgCategory [imgCategoryId=" + imgCategoryId + ", imgCategoryName=" + imgCategoryName
				+ ", imgCategoryParentId=" + imgCategoryParentId + ", imgCategoryParentName=" + imgCategoryParentName
				+ ", imgCategorySeo=" + imgCategorySeo + ", imgCategorySortOrder=" + imgCategorySortOrder
				+ ", imgCategoryCreatetime=" + imgCategoryCreatetime + ", imgCategoryMotifytime="
				+ imgCategoryMotifytime + ", imgCategoryDesc=" + imgCategoryDesc + "]";
	}
    
}