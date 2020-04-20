package com.atguigu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.atguigu.bean.MlbackProductSku;
import com.atguigu.bean.Msg;
import com.atguigu.service.MlbackAdminService;
import com.atguigu.service.MlbackProductSkuService;
import com.atguigu.utils.DateUtil;

@Controller
@RequestMapping("/MlbackProductSku")
public class MlbackProductSkuController {
		
	@Autowired
	MlbackProductSkuService mlbackProductSkuService;
	
	@Autowired
	MlbackAdminService mlbackAdminService;
	
	/**1.0	onuse	200104
	 * MlbackProductSku	add/update
	 * @param MlbackProductSku
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSelective(HttpServletResponse rep,HttpServletRequest res,@RequestBody MlbackProductSku mlbackProductSku){
		//接受参数
		Integer productskuId = mlbackProductSku.getProductskuId();
		String nowTime = DateUtil.strTime14s();
		mlbackProductSku.setProductskuMotifytime(nowTime);
		if(productskuId==null){
			//无id，insert
			mlbackProductSku.setProductskuCreatetime(nowTime);
			mlbackProductSkuService.insertSelective(mlbackProductSku);
			//System.out.println("productSku,insert,success");
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id，update
			mlbackProductSkuService.updateByPrimaryKeySelective(mlbackProductSku);
			//System.out.println("productSku,update,success");
			return Msg.success().add("resMsg", "更新成功");
		}		
	}
	
	/**
	 * 2.0	onuse	200104
	 * 查看单产品的全部sku
	 * @param productId
	 * @return 
	 */
	@RequestMapping(value="/getOneProductAllSku",method=RequestMethod.POST)
	@ResponseBody
	public Msg getOneMlbackProductDetail(@RequestParam(value = "productId") Integer productId){
		
		//接受信息
		MlbackProductSku mlbackProductSkuReq = new MlbackProductSku();
		mlbackProductSkuReq.setProductId(productId);
		List<MlbackProductSku> mlbackProductSkuResList =mlbackProductSkuService.selectMlbackProductSku(mlbackProductSkuReq);
		return Msg.success().add("resMsg", "查看本productid的全部sku详情信息")
					.add("mlbackProductSkuResList", mlbackProductSkuResList);
	}
	
	/**
	 * 2.0	UseNow	0505
	 * 查看单条类目的详情细节
	 * @param MlbackProduct
	 * @return 
	 */
	@RequestMapping(value="/getfrontOneProductAllSku",method=RequestMethod.POST)
	@ResponseBody
	public Msg getfrontOneProductAllSku(@RequestParam(value = "productId") Integer productId){
		
		//接受信息
		MlbackProductSku mlbackProductSkuReq = new MlbackProductSku();
		mlbackProductSkuReq.setProductId(productId);
		mlbackProductSkuReq.setProductskuStatus(1);//0	NO	1	Yes
		List<MlbackProductSku> mlbackProductSkuResList =mlbackProductSkuService.selectMlbackProductSkuAndStatus(mlbackProductSkuReq);
		return Msg.success().add("resMsg", "查看本productid的全部sku详情信息")
					.add("mlbackProductSkuResList", mlbackProductSkuResList);
	}
	
}
