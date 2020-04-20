package com.atguigu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import com.atguigu.bean.ImgDetail;
import com.atguigu.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.atguigu.service.ImgDetailService;
import com.atguigu.utils.DateUtil;

@Controller
@RequestMapping("/ImgDeatil")
public class ImgDeatilController {
	
	@Autowired
	ImgDetailService imgDetailService;
	
	/**
	 * 1.0	onuse	20191225
	 * to后台分类MlbackCategory列表页面
	 * @param jsp
	 * @return 
	 * */
//	@RequestMapping("/toImgDetailPage")
//	public String tologin(HttpSession session) throws Exception{
//		System.out.println("进来了");
////		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("AdminUser");
////		if(mlbackAdmin==null){
////			//SysUsers对象为空
////			return "back/mlbackAdminLogin";
////		}else{
//			return "back/img/ImgDetailPage";
////		}
//	}
	
	/**2.0	onuse	20191225
	 * 后台MlbackCategory列表分页list数据
	 * @param pn
	 * @return
	 */
	//@RequestMapping(value="/getImgDetailByCategoryId",method=RequestMethod.POST)
	@RequestMapping(value="/getImgDetailByCategoryId")
	@ResponseBody
	public Msg getImgDetailByCategoryId(@RequestParam(value = "pn", defaultValue = "1") Integer pn,
			@RequestParam(value = "imgDetailCategoryId", defaultValue = "1") Integer imgDetailCategoryId,HttpSession session) {

		ImgDetail imgDetailReq = new ImgDetail();
		imgDetailReq.setImgDetailCategoryId(imgDetailCategoryId);
		int PagNum = 30;
		PageHelper.startPage(pn, PagNum);
		List<ImgDetail> imgDetailList = imgDetailService.selectImgDetailByCategoryId(imgDetailReq);
		PageInfo page = new PageInfo(imgDetailList, PagNum);
		return Msg.success().add("pageInfo", page);
		//return Msg.success().add("imgDetailList", imgDetailList);
	}
	
	/**3.0	onuse	20191225
	 * ImgDetail	insert/update
	 * @param ImgDetail
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSelective(HttpServletResponse rep,HttpServletRequest res,@RequestBody ImgDetail imgDetail){
		//接受参数信息
		//获取类名
		Integer imgDetailId = imgDetail.getImgDetailId();
		
		String nowTime = DateUtil.strTime14s();
		if(imgDetailId==null){
			//无id，insert
			imgDetail.setImgDetailCreatetime(nowTime);
			//System.out.println("插入ImgCategoryId"+mlbackCategory.toString());
			imgDetailService.insertSelective(imgDetail);
			//System.out.println("插入ImgCategoryId"+mlbackCategory.toString());
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id，update
			imgDetail.setImgDetailMotifytime(nowTime);
			imgDetailService.updateByPrimaryKeySelective(imgDetail);
			//System.out.println("后台操作:categoryId不为null,走update+intResult:"+intResult);
			return Msg.success().add("resMsg", "更新成功");
		}	
	}
	
	/**4.0	onuse	20191225
	 * MlbackCategory	delete
	 * @param id
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Msg delete(@RequestBody ImgDetail imgDetail){
		//接收id信息
		int imgDetailIdInt = imgDetail.getImgDetailId();
		imgDetailService.deleteByPrimaryKey(imgDetailIdInt);
		return Msg.success().add("resMsg", "delete success");
	}
	
	/**
	 * 5.0	onuse	20200103
	 * getImgDetailById
	 * @param imgDetailId
	 * @return 
	 */
	@RequestMapping(value="/getImgDetailById",method=RequestMethod.POST)
	@ResponseBody
	public Msg getImgCategoryDetailById(@RequestParam(value = "imgDetailId") Integer imgDetailId){
		
		//接受categoryId
		//查询本条imgDetailId
		ImgDetail imgDetailRes =imgDetailService.selectImgDetailById(imgDetailId);
		return Msg.success().add("resMsg", "查categoryOne完毕").add("imgDetailResOne", imgDetailRes);
	}

}
