package com.atguigu.bean;

public class PageTimeVo {
	
	private Integer pn;
	
    private String beginTime;

    private String endTime;

	public Integer getPn() {
		return pn;
	}

	public void setPn(Integer pn) {
		this.pn = pn;
	}

	public String getBeginTime() {
		return beginTime;
	}

	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public PageTimeVo(Integer pn, String beginTime, String endTime) {
		super();
		this.pn = pn;
		this.beginTime = beginTime;
		this.endTime = endTime;
	}

	public PageTimeVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "pageTime [pn=" + pn + ", beginTime=" + beginTime + ", endTime=" + endTime + "]";
	}
	
}
