package com.atguigu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.atguigu.service.MlbackAdminService;
import com.atguigu.utils.IfMobileUtils;


@Controller
@RequestMapping("/MlActive")
public class MlfrontActiveTyController {
	
	@Autowired
	MlbackAdminService mlbackAdminService;
	
	/**
	 * 活动页面
	 * */
	@RequestMapping("/ActiveIndex")
	public String toindex(HttpServletResponse rep,HttpServletRequest res,HttpSession session) throws Exception{
		String ifMobile = IfMobileUtils.isMobileOrPc(rep, res);
		  
		if(ifMobile.equals("1")){
			return "mfront/mActiveindex";
		}else{
			return "front/pcActiveindex";
		}
	}
	
	/**
	 * 活动页面
	 * */
	@RequestMapping("/NowActiveIndex")
	public String toNowActiveIndex(HttpServletResponse rep,HttpServletRequest res,HttpSession session) throws Exception{
		String ifMobile = IfMobileUtils.isMobileOrPc(rep, res);
		  
		if(ifMobile.equals("1")){
			return "mfront/mNowActiveindex";
		}else{
			return "front/pcNowActiveindex";
		}
	}
	
}
