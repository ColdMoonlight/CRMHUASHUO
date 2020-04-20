package com.atguigu.bean;

public class MlbackAreafreight {
    private Integer areafreightId; //id

    private String areafreightCountryEnglish;//地区名称英文，如japan

    private String areafreightCountry;//地区名称，如日本

    private Integer areafreightPrice;//运费价格

    private String areafreightCreatetime;

    private String areafreightMotifytime;

    public Integer getAreafreightId() {
        return areafreightId;
    }

    public void setAreafreightId(Integer areafreightId) {
        this.areafreightId = areafreightId;
    }

    public String getAreafreightCountryEnglish() {
        return areafreightCountryEnglish;
    }

    public void setAreafreightCountryEnglish(String areafreightCountryEnglish) {
        this.areafreightCountryEnglish = areafreightCountryEnglish == null ? null : areafreightCountryEnglish.trim();
    }

    public String getAreafreightCountry() {
        return areafreightCountry;
    }

    public void setAreafreightCountry(String areafreightCountry) {
        this.areafreightCountry = areafreightCountry == null ? null : areafreightCountry.trim();
    }

    public Integer getAreafreightPrice() {
        return areafreightPrice;
    }

    public void setAreafreightPrice(Integer areafreightPrice) {
        this.areafreightPrice = areafreightPrice;
    }

    public String getAreafreightCreatetime() {
        return areafreightCreatetime;
    }

    public void setAreafreightCreatetime(String areafreightCreatetime) {
        this.areafreightCreatetime = areafreightCreatetime == null ? null : areafreightCreatetime.trim();
    }

    public String getAreafreightMotifytime() {
        return areafreightMotifytime;
    }

    public void setAreafreightMotifytime(String areafreightMotifytime) {
        this.areafreightMotifytime = areafreightMotifytime == null ? null : areafreightMotifytime.trim();
    }
}