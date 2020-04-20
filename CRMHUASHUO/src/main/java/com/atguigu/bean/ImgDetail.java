package com.atguigu.bean;

public class ImgDetail {
    private Integer imgDetailId;

    private String imgDetailName;

    private String imgDetailUrl;

    private Integer imgDetailCategoryId;

    private String imgDetailCategoryName;

    private String imgDetailCreatetime;

    private String imgDetailMotifytime;

    public Integer getImgDetailId() {
        return imgDetailId;
    }

    public void setImgDetailId(Integer imgDetailId) {
        this.imgDetailId = imgDetailId;
    }

    public String getImgDetailName() {
        return imgDetailName;
    }

    public void setImgDetailName(String imgDetailName) {
        this.imgDetailName = imgDetailName == null ? null : imgDetailName.trim();
    }

    public String getImgDetailUrl() {
        return imgDetailUrl;
    }

    public void setImgDetailUrl(String imgDetailUrl) {
        this.imgDetailUrl = imgDetailUrl == null ? null : imgDetailUrl.trim();
    }

    public Integer getImgDetailCategoryId() {
        return imgDetailCategoryId;
    }

    public void setImgDetailCategoryId(Integer imgDetailCategoryId) {
        this.imgDetailCategoryId = imgDetailCategoryId;
    }

    public String getImgDetailCategoryName() {
        return imgDetailCategoryName;
    }

    public void setImgDetailCategoryName(String imgDetailCategoryName) {
        this.imgDetailCategoryName = imgDetailCategoryName == null ? null : imgDetailCategoryName.trim();
    }

    public String getImgDetailCreatetime() {
        return imgDetailCreatetime;
    }

    public void setImgDetailCreatetime(String imgDetailCreatetime) {
        this.imgDetailCreatetime = imgDetailCreatetime == null ? null : imgDetailCreatetime.trim();
    }

    public String getImgDetailMotifytime() {
        return imgDetailMotifytime;
    }

    public void setImgDetailMotifytime(String imgDetailMotifytime) {
        this.imgDetailMotifytime = imgDetailMotifytime == null ? null : imgDetailMotifytime.trim();
    }
}