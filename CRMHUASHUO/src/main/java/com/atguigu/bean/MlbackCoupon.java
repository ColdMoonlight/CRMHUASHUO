package com.atguigu.bean;

import java.math.BigDecimal;

public class MlbackCoupon {
    private Integer couponId;

    private String couponName;//满100减10块   手动输入

    private BigDecimal couponPrice;// 5  手动输入
    
    private BigDecimal couponPriceOff;// 5  手动输入

    private BigDecimal couponPriceBaseline;//100     使用的底钱，，减前满100.   手动输入

    private Integer couponStatus;//  0不生效,1生效中，，下拉选

    private String couponCode;  //优惠码  如  OFF15,,,,OFF15%    手动输入
    
    private String couponType;  //优惠码类型  0满减的,1百分比折扣的    手动输入
    
    private Integer couponLuckDrawType;		//优惠码是否支持抽奖  0不支持抽奖,1支持抽奖    手动输入
    
    private Integer couponLuckDrawWeight;	//优惠码抽奖权重 0--100%    手动输入
    
    private Integer couponTimes;  //优惠码已经使用次数  如  999,998次
    
    private Integer couponAllTimes;  //优惠码可以使用总次数  如  999,998次
    
    private Integer couponProductOnlyType;		//优惠码是否支持单品
    
    private Integer couponProductOnlyPId;		//优惠码支持单品的时候,所绑定的产品
    
    private String couponProductSeoNameOnlyPId;	//优惠码支持单品的时候,所绑定的产品的seo
    
    private String couponProductProNameOnlyPId;	//优惠码支持单品的时候,所绑定的产品的proname
    
    private Integer couponAdminId;

    private String couponAdminOperatorname;

    private String couponCreatetime;

    private String couponMotifytime;
    
    private String couponStarttime;
    
    private String couponEndtime;
    
    private String couponImgwapurl;	//优惠券wap端图

    private String couponImgpcurl;	//优惠券PC端图
    
    private Integer couponAreaNum;	//优惠券展示位置

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public String getCouponName() {
        return couponName;
    }

    public void setCouponName(String couponName) {
        this.couponName = couponName == null ? null : couponName.trim();
    }

    public BigDecimal getCouponPrice() {
        return couponPrice;
    }

    public void setCouponPrice(BigDecimal couponPrice) {
        this.couponPrice = couponPrice;
    }
    
    public BigDecimal getCouponPriceOff() {
		return couponPriceOff;
	}

	public void setCouponPriceOff(BigDecimal couponPriceOff) {
		this.couponPriceOff = couponPriceOff;
	}

    public BigDecimal getCouponPriceBaseline() {
        return couponPriceBaseline;
    }

    public void setCouponPriceBaseline(BigDecimal couponPriceBaseline) {
        this.couponPriceBaseline = couponPriceBaseline;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode == null ? null : couponCode.trim();
    }
    
	public String getCouponType() {
		return couponType;
	}

	public void setCouponType(String couponType) {
		this.couponType = couponType == null ? null : couponType.trim();
	}
	
	public Integer getCouponLuckDrawType() {
		return couponLuckDrawType;
	}

	public void setCouponLuckDrawType(Integer couponLuckDrawType) {
		this.couponLuckDrawType = couponLuckDrawType;
	}

	public Integer getCouponLuckDrawWeight() {
		return couponLuckDrawWeight;
	}

	public void setCouponLuckDrawWeight(Integer couponLuckDrawWeight) {
		this.couponLuckDrawWeight = couponLuckDrawWeight;
	}

	public Integer getCouponTimes() {
		return couponTimes;
	}

	public void setCouponTimes(Integer couponTimes) {
		this.couponTimes = couponTimes;
	}
	
    public Integer getCouponAllTimes() {
		return couponAllTimes;
	}

	public void setCouponAllTimes(Integer couponAllTimes) {
		this.couponAllTimes = couponAllTimes;
	}
	
    public Integer getCouponProductOnlyType() {
		return couponProductOnlyType;
	}

	public void setCouponProductOnlyType(Integer couponProductOnlyType) {
		this.couponProductOnlyType = couponProductOnlyType;
	}

	public Integer getCouponProductOnlyPId() {
		return couponProductOnlyPId;
	}

	public void setCouponProductOnlyPId(Integer couponProductOnlyPId) {
		this.couponProductOnlyPId = couponProductOnlyPId;
	}

	public String getCouponProductSeoNameOnlyPId() {
		return couponProductSeoNameOnlyPId;
	}

	public void setCouponProductSeoNameOnlyPId(String couponProductSeoNameOnlyPId) {
		this.couponProductSeoNameOnlyPId = couponProductSeoNameOnlyPId == null ? null : couponProductSeoNameOnlyPId.trim();
	}

	public String getCouponProductProNameOnlyPId() {
		return couponProductProNameOnlyPId;
	}

	public void setCouponProductProNameOnlyPId(String couponProductProNameOnlyPId) {
		this.couponProductProNameOnlyPId = couponProductProNameOnlyPId == null ? null : couponProductProNameOnlyPId.trim();
	}

	public Integer getCouponAdminId() {
        return couponAdminId;
    }

    public void setCouponAdminId(Integer couponAdminId) {
        this.couponAdminId = couponAdminId;
    }

    public String getCouponAdminOperatorname() {
        return couponAdminOperatorname;
    }

    public void setCouponAdminOperatorname(String couponAdminOperatorname) {
        this.couponAdminOperatorname = couponAdminOperatorname == null ? null : couponAdminOperatorname.trim();
    }

    public String getCouponCreatetime() {
        return couponCreatetime;
    }

    public void setCouponCreatetime(String couponCreatetime) {
        this.couponCreatetime = couponCreatetime == null ? null : couponCreatetime.trim();
    }

    public String getCouponMotifytime() {
        return couponMotifytime;
    }

    public void setCouponMotifytime(String couponMotifytime) {
        this.couponMotifytime = couponMotifytime == null ? null : couponMotifytime.trim();
    }
    
	public String getCouponStarttime() {
		return couponStarttime;
	}

	public void setCouponStarttime(String couponStarttime) {
		this.couponStarttime = couponStarttime == null ? null : couponStarttime.trim();
	}

	public String getCouponEndtime() {
		return couponEndtime;
	}

	public void setCouponEndtime(String couponEndtime) {
		this.couponEndtime = couponEndtime == null ? null : couponEndtime.trim();
	}

	public String getCouponImgwapurl() {
		return couponImgwapurl;
	}

	public void setCouponImgwapurl(String couponImgwapurl) {
		this.couponImgwapurl = couponImgwapurl == null ? null : couponImgwapurl.trim();
	}

	public String getCouponImgpcurl() {
		return couponImgpcurl;
	}

	public void setCouponImgpcurl(String couponImgpcurl) {
		this.couponImgpcurl = couponImgpcurl == null ? null : couponImgpcurl.trim();
	}

	public Integer getCouponAreaNum() {
		return couponAreaNum;
	}

	public void setCouponAreaNum(Integer couponAreaNum) {
		this.couponAreaNum = couponAreaNum;
	}

	public MlbackCoupon() {
		super();
	}

	public MlbackCoupon(Integer couponId, String couponName, BigDecimal couponPrice, BigDecimal couponPriceOff,
			BigDecimal couponPriceBaseline, Integer couponStatus, String couponCode, String couponType,
			Integer couponLuckDrawType, Integer couponLuckDrawWeight, Integer couponTimes, Integer couponAllTimes,
			Integer couponProductOnlyType, Integer couponProductOnlyPId, String couponProductSeoNameOnlyPId,
			String couponProductProNameOnlyPId, Integer couponAdminId, String couponAdminOperatorname,
			String couponCreatetime, String couponMotifytime, String couponStarttime, String couponEndtime,
			String couponImgwapurl, String couponImgpcurl, Integer couponAreaNum) {
		super();
		this.couponId = couponId;
		this.couponName = couponName;
		this.couponPrice = couponPrice;
		this.couponPriceOff = couponPriceOff;
		this.couponPriceBaseline = couponPriceBaseline;
		this.couponStatus = couponStatus;
		this.couponCode = couponCode;
		this.couponType = couponType;
		this.couponLuckDrawType = couponLuckDrawType;
		this.couponLuckDrawWeight = couponLuckDrawWeight;
		this.couponTimes = couponTimes;
		this.couponAllTimes = couponAllTimes;
		this.couponProductOnlyType = couponProductOnlyType;
		this.couponProductOnlyPId = couponProductOnlyPId;
		this.couponProductSeoNameOnlyPId = couponProductSeoNameOnlyPId;
		this.couponProductProNameOnlyPId = couponProductProNameOnlyPId;
		this.couponAdminId = couponAdminId;
		this.couponAdminOperatorname = couponAdminOperatorname;
		this.couponCreatetime = couponCreatetime;
		this.couponMotifytime = couponMotifytime;
		this.couponStarttime = couponStarttime;
		this.couponEndtime = couponEndtime;
		this.couponImgwapurl = couponImgwapurl;
		this.couponImgpcurl = couponImgpcurl;
		this.couponAreaNum = couponAreaNum;
	}

	@Override
	public String toString() {
		return "MlbackCoupon [couponId=" + couponId + ", couponName=" + couponName + ", couponPrice=" + couponPrice
				+ ", couponPriceOff=" + couponPriceOff + ", couponPriceBaseline=" + couponPriceBaseline
				+ ", couponStatus=" + couponStatus + ", couponCode=" + couponCode + ", couponType=" + couponType
				+ ", couponLuckDrawType=" + couponLuckDrawType + ", couponLuckDrawWeight=" + couponLuckDrawWeight
				+ ", couponTimes=" + couponTimes + ", couponAllTimes=" + couponAllTimes + ", couponProductOnlyType="
				+ couponProductOnlyType + ", couponProductOnlyPId=" + couponProductOnlyPId
				+ ", couponProductSeoNameOnlyPId=" + couponProductSeoNameOnlyPId + ", couponProductProNameOnlyPId="
				+ couponProductProNameOnlyPId + ", couponAdminId=" + couponAdminId + ", couponAdminOperatorname="
				+ couponAdminOperatorname + ", couponCreatetime=" + couponCreatetime + ", couponMotifytime="
				+ couponMotifytime + ", couponStarttime=" + couponStarttime + ", couponEndtime=" + couponEndtime
				+ ", couponImgwapurl=" + couponImgwapurl + ", couponImgpcurl=" + couponImgpcurl + ", couponAreaNum="
				+ couponAreaNum + "]";
	}
	
	
    
}