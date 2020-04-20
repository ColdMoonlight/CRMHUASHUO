package com.atguigu.bean;

public class MlbackProductSku {
    private Integer productskuId;// 取下来，null不null,都传回来

    private String productskuName;//length

    private String productskuNameDetails; //optionValue

    private String productskuMoneyDetails;//price

    private String productskuStockDetails;//quantity

    private String productskuImageurlDetails;//不要

    private Integer productId;//productId

    private Integer productskuStatus;//productStatus

    private Integer productskuAdminId;//不要

    private String productskuAdminOperatorname;//不要

    private String productskuCreatetime;//不要

    private String productskuMotifytime;//不要

    public Integer getProductskuId() {
        return productskuId;
    }

    public void setProductskuId(Integer productskuId) {
        this.productskuId = productskuId;
    }

    public String getProductskuName() {
        return productskuName;
    }

    public void setProductskuName(String productskuName) {
        this.productskuName = productskuName == null ? null : productskuName.trim();
    }

    public String getProductskuNameDetails() {
        return productskuNameDetails;
    }

    public void setProductskuNameDetails(String productskuNameDetails) {
        this.productskuNameDetails = productskuNameDetails == null ? null : productskuNameDetails.trim();
    }

    public String getProductskuMoneyDetails() {
        return productskuMoneyDetails;
    }

    public void setProductskuMoneyDetails(String productskuMoneyDetails) {
        this.productskuMoneyDetails = productskuMoneyDetails == null ? null : productskuMoneyDetails.trim();
    }

    public String getProductskuStockDetails() {
        return productskuStockDetails;
    }

    public void setProductskuStockDetails(String productskuStockDetails) {
        this.productskuStockDetails = productskuStockDetails == null ? null : productskuStockDetails.trim();
    }

    public String getProductskuImageurlDetails() {
        return productskuImageurlDetails;
    }

    public void setProductskuImageurlDetails(String productskuImageurlDetails) {
        this.productskuImageurlDetails = productskuImageurlDetails == null ? null : productskuImageurlDetails.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getProductskuStatus() {
        return productskuStatus;
    }

    public void setProductskuStatus(Integer productskuStatus) {
        this.productskuStatus = productskuStatus;
    }

    public Integer getProductskuAdminId() {
        return productskuAdminId;
    }

    public void setProductskuAdminId(Integer productskuAdminId) {
        this.productskuAdminId = productskuAdminId;
    }

    public String getProductskuAdminOperatorname() {
        return productskuAdminOperatorname;
    }

    public void setProductskuAdminOperatorname(String productskuAdminOperatorname) {
        this.productskuAdminOperatorname = productskuAdminOperatorname == null ? null : productskuAdminOperatorname.trim();
    }

    public String getProductskuCreatetime() {
        return productskuCreatetime;
    }

    public void setProductskuCreatetime(String productskuCreatetime) {
        this.productskuCreatetime = productskuCreatetime == null ? null : productskuCreatetime.trim();
    }

    public String getProductskuMotifytime() {
        return productskuMotifytime;
    }

    public void setProductskuMotifytime(String productskuMotifytime) {
        this.productskuMotifytime = productskuMotifytime == null ? null : productskuMotifytime.trim();
    }
}