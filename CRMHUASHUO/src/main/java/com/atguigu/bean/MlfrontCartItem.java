package com.atguigu.bean;

import java.math.BigDecimal;

public class MlfrontCartItem {
    private Integer cartitemId;

    private Integer cartitemUid;

    private Integer cartitemCartId;
    
    private Integer cartitemStatus;

    private Integer cartitemProductId;

    private String cartitemProductName;

    private BigDecimal cartitemProductOriginalprice;

    private String cartitemProductMainimgurl;

    private Integer cartitemProductActoff;

    private String cartitemProductskuIdstr;

    private String cartitemProductskuIdnamestr;

    private String cartitemProductskuNamestr;

    private String cartitemProductskuMoneystr;

    private Integer cartitemProductNumber;

    private String cartitemCreatetime;

    private String cartitemMotifytime;

    public Integer getCartitemId() {
        return cartitemId;
    }

    public void setCartitemId(Integer cartitemId) {
        this.cartitemId = cartitemId;
    }

    public Integer getCartitemUid() {
        return cartitemUid;
    }

    public void setCartitemUid(Integer cartitemUid) {
        this.cartitemUid = cartitemUid;
    }

    public Integer getCartitemCartId() {
        return cartitemCartId;
    }

    public void setCartitemCartId(Integer cartitemCartId) {
        this.cartitemCartId = cartitemCartId;
    }

    public Integer getCartitemStatus() {
        return cartitemStatus;
    }

    public void setCartitemStatus(Integer cartitemStatus) {
        this.cartitemStatus = cartitemStatus;
    }
    
    public Integer getCartitemProductId() {
        return cartitemProductId;
    }

    public void setCartitemProductId(Integer cartitemProductId) {
        this.cartitemProductId = cartitemProductId;
    }

    public String getCartitemProductName() {
        return cartitemProductName;
    }

    public void setCartitemProductName(String cartitemProductName) {
        this.cartitemProductName = cartitemProductName == null ? null : cartitemProductName.trim();
    }

    public BigDecimal getCartitemProductOriginalprice() {
        return cartitemProductOriginalprice;
    }

    public void setCartitemProductOriginalprice(BigDecimal cartitemProductOriginalprice) {
        this.cartitemProductOriginalprice = cartitemProductOriginalprice;
    }

    public String getCartitemProductMainimgurl() {
        return cartitemProductMainimgurl;
    }

    public void setCartitemProductMainimgurl(String cartitemProductMainimgurl) {
        this.cartitemProductMainimgurl = cartitemProductMainimgurl == null ? null : cartitemProductMainimgurl.trim();
    }

    public Integer getCartitemProductActoff() {
        return cartitemProductActoff;
    }

    public void setCartitemProductActoff(Integer cartitemProductActoff) {
        this.cartitemProductActoff = cartitemProductActoff;
    }

    public String getCartitemProductskuIdstr() {
        return cartitemProductskuIdstr;
    }

    public void setCartitemProductskuIdstr(String cartitemProductskuIdstr) {
        this.cartitemProductskuIdstr = cartitemProductskuIdstr == null ? null : cartitemProductskuIdstr.trim();
    }

    public String getCartitemProductskuIdnamestr() {
        return cartitemProductskuIdnamestr;
    }

    public void setCartitemProductskuIdnamestr(String cartitemProductskuIdnamestr) {
        this.cartitemProductskuIdnamestr = cartitemProductskuIdnamestr == null ? null : cartitemProductskuIdnamestr.trim();
    }

    public String getCartitemProductskuNamestr() {
        return cartitemProductskuNamestr;
    }

    public void setCartitemProductskuNamestr(String cartitemProductskuNamestr) {
        this.cartitemProductskuNamestr = cartitemProductskuNamestr == null ? null : cartitemProductskuNamestr.trim();
    }

    public String getCartitemProductskuMoneystr() {
        return cartitemProductskuMoneystr;
    }

    public void setCartitemProductskuMoneystr(String cartitemProductskuMoneystr) {
        this.cartitemProductskuMoneystr = cartitemProductskuMoneystr == null ? null : cartitemProductskuMoneystr.trim();
    }

    public Integer getCartitemProductNumber() {
        return cartitemProductNumber;
    }

    public void setCartitemProductNumber(Integer cartitemProductNumber) {
        this.cartitemProductNumber = cartitemProductNumber;
    }

    public String getCartitemCreatetime() {
        return cartitemCreatetime;
    }

    public void setCartitemCreatetime(String cartitemCreatetime) {
        this.cartitemCreatetime = cartitemCreatetime == null ? null : cartitemCreatetime.trim();
    }

    public String getCartitemMotifytime() {
        return cartitemMotifytime;
    }

    public void setCartitemMotifytime(String cartitemMotifytime) {
        this.cartitemMotifytime = cartitemMotifytime == null ? null : cartitemMotifytime.trim();
    }

    public MlfrontCartItem() {
		super();
		// TODO Auto-generated constructor stub
	}
    
	public MlfrontCartItem(Integer cartitemId, Integer cartitemUid, Integer cartitemCartId, Integer cartitemStatus,
			Integer cartitemProductId, String cartitemProductName, BigDecimal cartitemProductOriginalprice,
			String cartitemProductMainimgurl, Integer cartitemProductActoff, String cartitemProductskuIdstr,
			String cartitemProductskuIdnamestr, String cartitemProductskuNamestr, String cartitemProductskuMoneystr,
			Integer cartitemProductNumber, String cartitemCreatetime, String cartitemMotifytime) {
		super();
		this.cartitemId = cartitemId;
		this.cartitemUid = cartitemUid;
		this.cartitemCartId = cartitemCartId;
		this.cartitemStatus = cartitemStatus;
		this.cartitemProductId = cartitemProductId;
		this.cartitemProductName = cartitemProductName;
		this.cartitemProductOriginalprice = cartitemProductOriginalprice;
		this.cartitemProductMainimgurl = cartitemProductMainimgurl;
		this.cartitemProductActoff = cartitemProductActoff;
		this.cartitemProductskuIdstr = cartitemProductskuIdstr;
		this.cartitemProductskuIdnamestr = cartitemProductskuIdnamestr;
		this.cartitemProductskuNamestr = cartitemProductskuNamestr;
		this.cartitemProductskuMoneystr = cartitemProductskuMoneystr;
		this.cartitemProductNumber = cartitemProductNumber;
		this.cartitemCreatetime = cartitemCreatetime;
		this.cartitemMotifytime = cartitemMotifytime;
	}

	@Override
	public String toString() {
		return "MlfrontCartItem [cartitemId=" + cartitemId + ", cartitemUid=" + cartitemUid + ", cartitemCartId="
				+ cartitemCartId + ", cartitemStatus=" + cartitemStatus + ", cartitemProductId=" + cartitemProductId
				+ ", cartitemProductName=" + cartitemProductName + ", cartitemProductOriginalprice="
				+ cartitemProductOriginalprice + ", cartitemProductMainimgurl=" + cartitemProductMainimgurl
				+ ", cartitemProductActoff=" + cartitemProductActoff + ", cartitemProductskuIdstr="
				+ cartitemProductskuIdstr + ", cartitemProductskuIdnamestr=" + cartitemProductskuIdnamestr
				+ ", cartitemProductskuNamestr=" + cartitemProductskuNamestr + ", cartitemProductskuMoneystr="
				+ cartitemProductskuMoneystr + ", cartitemProductNumber=" + cartitemProductNumber
				+ ", cartitemCreatetime=" + cartitemCreatetime + ", cartitemMotifytime=" + cartitemMotifytime + "]";
	}

}