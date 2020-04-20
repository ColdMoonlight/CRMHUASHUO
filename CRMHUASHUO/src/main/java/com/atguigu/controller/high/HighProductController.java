package com.atguigu.controller.high;

import java.util.List;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.atguigu.bean.MlbackProduct;
import com.atguigu.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.atguigu.service.MlbackProductService;

@Controller
@RequestMapping("/HighProduct")
public class HighProductController {
		
	@Autowired
	MlbackProductService mlbackProductService;
	
	/**1.0	useOn	200317
	 * 分类MlbackProduct列表分页list数据
	 * @param pn,
	 * Integer productStatus;
	 * String productName;
	 * @return
	 */
	@RequestMapping(value="/highProductBySearch",method=RequestMethod.POST)
	@ResponseBody
	public Msg selectMlfrontReviewListBySearch(@RequestParam(value = "pn", defaultValue = "1") Integer pn,@RequestParam(value = "productStatus") Integer productStatus,
			@RequestParam(value = "productName") String productName,HttpSession session) {

		MlbackProduct mlbackProductReq = new MlbackProduct();
		if("999".equals(productName)){
			mlbackProductReq.setProductName(null);
		}else{
			mlbackProductReq.setProductName(productName);
		}

		if(productStatus==999){
			System.out.println("productStatus==999");
		}else{
			mlbackProductReq.setProductStatus(productStatus);
		}

		int PagNum = 20;
		PageHelper.startPage(pn, PagNum);
		List<MlbackProduct> mlbackProductList = mlbackProductService.selectHighMlbackProduct(mlbackProductReq);
		
		PageInfo page = new PageInfo(mlbackProductList, PagNum);
		return Msg.success().add("pageInfo", page).add("resMsg", "产品高级模糊搜索完毕");
	}
	
}