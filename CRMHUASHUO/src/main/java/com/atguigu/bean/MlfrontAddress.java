package com.atguigu.bean;

public class MlfrontAddress {
    private Integer addressId;  // 新增的时候不传(新增以后，接口中我会返回这个addressId，和之前一样，初始的时候input hidden掉)，更新传

    private Integer addressUid;//不传

    private String addressIp;//不传

    private String addressEmail;//必传

    private String addressTelephone;//必传

    private String addressUserfirstname;//必传
    
    private String addressUserlastname;//必传
    
    private String addressCountry;//必传
    
    private String addressCountryAll;//必传
    
    private String addressProvince;//必传
    
    private String addressProvinceCode;//必传

    private String addressCity;//必传

    private String addressDetail;//必传

    private String addressPost;//必传

    private String addressCreatetime;

    private String addressMotifytime;

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressUid() {
        return addressUid;
    }

    public void setAddressUid(Integer addressUid) {
        this.addressUid = addressUid;
    }

    public String getAddressIp() {
        return addressIp;
    }

    public void setAddressIp(String addressIp) {
        this.addressIp = addressIp == null ? null : addressIp.trim();
    }

    public String getAddressEmail() {
        return addressEmail;
    }

    public void setAddressEmail(String addressEmail) {
        this.addressEmail = addressEmail == null ? null : addressEmail.trim();
    }

    public String getAddressTelephone() {
        return addressTelephone;
    }

    public void setAddressTelephone(String addressTelephone) {
        this.addressTelephone = addressTelephone == null ? null : addressTelephone.trim();
    }

    public String getAddressUserfirstname() {
        return addressUserfirstname;
    }

    public void setAddressUserfirstname(String addressUserfirstname) {
        this.addressUserfirstname = addressUserfirstname == null ? null : addressUserfirstname.trim();
    }

    public String getAddressUserlastname() {
        return addressUserlastname;
    }

    public void setAddressUserlastname(String addressUserlastname) {
        this.addressUserlastname = addressUserlastname == null ? null : addressUserlastname.trim();
    }

    public String getAddressCountry() {
        return addressCountry;
    }

    public void setAddressCountry(String addressCountry) {
        this.addressCountry = addressCountry;
    }
    
    public String getAddressCountryAll() {
		return addressCountryAll;
	}

	public void setAddressCountryAll(String addressCountryAll) {
		this.addressCountryAll = addressCountryAll == null ? null : addressCountryAll.trim();
	}

	public String getAddressProvince() {
        return addressProvince;
    }

    public void setAddressProvince(String addressProvince) {
        this.addressProvince = addressProvince == null ? null : addressProvince.trim();
    }
    
    public String getAddressProvinceCode() {
		return addressProvinceCode;
	}

	public void setAddressProvinceCode(String addressProvinceCode) {
		this.addressProvinceCode = addressProvinceCode == null ? null : addressProvinceCode.trim();
	}

	public String getAddressCity() {
        return addressCity;
    }

    public void setAddressCity(String addressCity) {
        this.addressCity = addressCity == null ? null : addressCity.trim();
    }

    public String getAddressDetail() {
        return addressDetail;
    }

    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail == null ? null : addressDetail.trim();
    }

    public String getAddressPost() {
        return addressPost;
    }

    public void setAddressPost(String addressPost) {
        this.addressPost = addressPost == null ? null : addressPost.trim();
    }

    public String getAddressCreatetime() {
        return addressCreatetime;
    }

    public void setAddressCreatetime(String addressCreatetime) {
        this.addressCreatetime = addressCreatetime == null ? null : addressCreatetime.trim();
    }

    public String getAddressMotifytime() {
        return addressMotifytime;
    }

    public void setAddressMotifytime(String addressMotifytime) {
        this.addressMotifytime = addressMotifytime == null ? null : addressMotifytime.trim();
    }
    
	public MlfrontAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MlfrontAddress(Integer addressId, Integer addressUid, String addressIp, String addressEmail,
			String addressTelephone, String addressUserfirstname, String addressUserlastname, String addressCountry,
			String addressProvince, String addressProvinceCode, String addressCity, String addressDetail, String addressPost,
			String addressCreatetime, String addressMotifytime) {
		super();
		this.addressId = addressId;
		this.addressUid = addressUid;
		this.addressIp = addressIp;
		this.addressEmail = addressEmail;
		this.addressTelephone = addressTelephone;
		this.addressUserfirstname = addressUserfirstname;
		this.addressUserlastname = addressUserlastname;
		this.addressCountry = addressCountry;
		this.addressProvince = addressProvince;
		this.addressProvinceCode = addressProvinceCode;
		this.addressCity = addressCity;
		this.addressDetail = addressDetail;
		this.addressPost = addressPost;
		this.addressCreatetime = addressCreatetime;
		this.addressMotifytime = addressMotifytime;
	}

	@Override
	public String toString() {
		return "MlfrontAddress [addressId=" + addressId + ", addressUid=" + addressUid + ", addressIp=" + addressIp
				+ ", addressEmail=" + addressEmail + ", addressTelephone=" + addressTelephone
				+ ", addressUserfirstname=" + addressUserfirstname + ", addressUserlastname=" + addressUserlastname
				+ ", addressCountry=" + addressCountry + ", addressProvince=" + addressProvince+ ", addressProvinceCode=" + addressProvinceCode
				+ ", addressCity="+ addressCity + ", addressDetail=" + addressDetail + ", addressPost=" + addressPost
				+ ", addressCreatetime=" + addressCreatetime + ", addressMotifytime=" + addressMotifytime + "]";
	}
    
    
    
}