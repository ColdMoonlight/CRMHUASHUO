package com.atguigu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.MlPaypalShipAddress;
import com.atguigu.bean.Msg;
import com.atguigu.service.MlPaypalShipAddressService;
import com.atguigu.service.MlbackAdminService;

@Controller
@RequestMapping("/MlPaypalShipAddress")
public class MlPaypalShipAddressController {
		
	@Autowired
	MlPaypalShipAddressService mlPaypalShipAddressService;
	
	@Autowired
	MlbackAdminService mlbackAdminService;
	
	/**
	 * 1.0	onuse	200104
	 * 查-单条PaypalShipAddress的详情
	 * @param shippingaddressPayinfoid
	 * @return
	 */
	@RequestMapping(value="/getOneMlfrontReviewDetailById",method=RequestMethod.POST)
	@ResponseBody
	public Msg getOneMlPaypalShipAddressByPayinfoid(@RequestParam(value = "shippingaddressPayinfoid") String shippingaddressPayinfoid){
		//接收信息
		MlPaypalShipAddress mlPaypalShipAddressReq = new MlPaypalShipAddress();
		//封装参数
		mlPaypalShipAddressReq.setShippingaddressPayinfoid(shippingaddressPayinfoid);
		List<MlPaypalShipAddress> mlPaypalShipAddressRes =mlPaypalShipAddressService.selectMlPaypalShipAddressByPayinfoid(mlPaypalShipAddressReq);
		return Msg.success().add("resMsg", "查-单条paypal返回的地址完毕")
					.add("mlPaypalShipAddressOne", mlPaypalShipAddressRes);
	}
	
}
