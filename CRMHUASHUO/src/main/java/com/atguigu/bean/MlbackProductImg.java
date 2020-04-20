package com.atguigu.bean;

public class MlbackProductImg {
    private Integer productimgId;

    private String productimgName;

    private String productimgUrl;
    
    private String productImgsecleturl;

    private Integer productId;

    private Integer productimgSortOrder;

    private String productimgCreatetime;

    private String productimgMotifytime;

    public Integer getProductimgId() {
        return productimgId;
    }

    public void setProductimgId(Integer productimgId) {
        this.productimgId = productimgId;
    }

    public String getProductimgName() {
        return productimgName;
    }

    public void setProductimgName(String productimgName) {
        this.productimgName = productimgName == null ? null : productimgName.trim();
    }

    public String getProductimgUrl() {
        return productimgUrl;
    }

    public void setProductimgUrl(String productimgUrl) {
        this.productimgUrl = productimgUrl == null ? null : productimgUrl.trim();
    }
    
    public String getProductImgsecleturl() {
		return productImgsecleturl;
	}

	public void setProductImgsecleturl(String productImgsecleturl) {
		this.productImgsecleturl = productImgsecleturl == null ? null : productImgsecleturl.trim();
	}

	public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductimgSortOrder() {
        return productimgSortOrder;
    }

    public void setProductimgSortOrder(Integer productimgSortOrder) {
        this.productimgSortOrder = productimgSortOrder;
    }

    public String getProductimgCreatetime() {
        return productimgCreatetime;
    }

    public void setProductimgCreatetime(String productimgCreatetime) {
        this.productimgCreatetime = productimgCreatetime == null ? null : productimgCreatetime.trim();
    }

    public String getProductimgMotifytime() {
        return productimgMotifytime;
    }

    public void setProductimgMotifytime(String productimgMotifytime) {
        this.productimgMotifytime = productimgMotifytime == null ? null : productimgMotifytime.trim();
    }
}