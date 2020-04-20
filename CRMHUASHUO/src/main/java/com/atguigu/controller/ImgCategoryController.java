package com.atguigu.controller;

import java.util.ArrayList;
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

import com.atguigu.bean.ImgCategory;
import com.atguigu.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.atguigu.service.ImgCategoryService;
import com.atguigu.utils.DateUtil;

@Controller
@RequestMapping("/ImgCategory")
public class ImgCategoryController {
	
	@Autowired
	ImgCategoryService imgCategoryService;
	
	/**
	 * 1.0	onuse	20191225
	 * to后台分类MlbackCategory列表页面
	 * @param jsp
	 * @return 
	 * */
	@RequestMapping("/toImgCategoryPage")
	public String tologin(HttpSession session) throws Exception{
		System.out.println("进来了");
//		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("AdminUser");
//		if(mlbackAdmin==null){
//			//SysUsers对象为空
//			return "back/mlbackAdminLogin";
//		}else{
			return "back/ImgCategoryPage";
//		}
	}

	
	/**2.0	onuse	20191225
	 * 后台MlbackCategory列表分页list数据
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/getImgCategoryByPage")
	@ResponseBody
	public Msg getImgCategoryByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpSession session) {

		int PagNum = 30;
		PageHelper.startPage(pn, PagNum);
		List<ImgCategory> imgCategoryList = imgCategoryService.selectImgCategoryGetAll();
		PageInfo page = new PageInfo(imgCategoryList, PagNum);
		return Msg.success().add("pageInfo", page);
	}
	
	/**3.0	onuse	20191225
	 * MlbackCategory	insert/update
	 * @param MlbackCategory
	 * @return
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSelective(HttpServletResponse rep,HttpServletRequest res,@RequestBody ImgCategory imgCategory){
		//接受参数信息
		//获取类名
//		String imgCategoryName = imgCategory.getImgCategoryName();//描述
		String imgCategorySeo = imgCategory.getImgCategorySeo();//描述
		//获取归属类名
		Integer categoryParentId = imgCategory.getImgCategoryParentId();
		String imgCategoryParentName="";
		String imgCategoryDesc="";
		ImgCategory ImgCategoryOneRes = null;
		if(categoryParentId>0){
			
			ImgCategory ImgCategoryParentNameReq = new ImgCategory();
			ImgCategoryParentNameReq.setImgCategoryId(categoryParentId);
			ImgCategoryOneRes = imgCategoryService.selectImgCategory(categoryParentId);
		}
		if(ImgCategoryOneRes!=null){
			imgCategoryParentName = ImgCategoryOneRes.getImgCategoryName();
			imgCategoryDesc = ImgCategoryOneRes.getImgCategoryDesc();
		}else{
			imgCategoryParentName ="---none---";
		}
		//判断归属是否为none
		if(imgCategoryParentName.equals("---none---")){
			imgCategory.setImgCategoryDesc(imgCategorySeo);
		}else{
			imgCategory.setImgCategoryDesc(imgCategoryDesc+">"+imgCategorySeo);
		}
		//取出id
		Integer ImgCategoryId = imgCategory.getImgCategoryId();
		String nowTime = DateUtil.strTime14s();
		imgCategory.setImgCategoryParentName(imgCategoryParentName);
		if(ImgCategoryId==null){
			//无id，insert
			imgCategory.setImgCategoryCreatetime(nowTime);
			//System.out.println("插入ImgCategoryId"+mlbackCategory.toString());
			imgCategoryService.insertSelective(imgCategory);
			//System.out.println("插入ImgCategoryId"+mlbackCategory.toString());
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id，update
			imgCategory.setImgCategoryMotifytime(nowTime);
			imgCategoryService.updateByPrimaryKeySelective(imgCategory);
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
	public Msg delete(@RequestBody ImgCategory imgCategory){
		//接收id信息
		int imgCategoryIdInt = imgCategory.getImgCategoryId();
		imgCategoryService.deleteByPrimaryKey(imgCategoryIdInt);
		return Msg.success().add("resMsg", "delete success");
	}
	
	/**
	 * 5.0	onuse	20200103
	 * 查单条MlbackCategory详情by-categoryId
	 * @param categoryId
	 * @return 
	 */
	@RequestMapping(value="/getImgCategoryDetailById",method=RequestMethod.POST)
	@ResponseBody
	public Msg getImgCategoryDetailById(@RequestParam(value = "imgCategoryId") Integer imgCategoryId){
		
		//接受categoryId
		//ImgCategory mlbackCategoryReq = new ImgCategory();
		//mlbackCategoryReq.setCategoryId(categoryId);
		//查询本条
		ImgCategory imgCategoryRes =imgCategoryService.selectImgCategory(imgCategoryId);
		return Msg.success().add("resMsg", "查categoryOne完毕").add("imgCategoryResOne", imgCategoryRes);
	}
	
	/**
	 * 7.0	onuse	20191225
	 * 获取全部类目，以便于下拉选择
	 * @param
	 * @return 
	 */
	@RequestMapping(value="/getImgCategoryAll",method=RequestMethod.GET)
	@ResponseBody
	public Msg getImgCategoryAll(HttpServletResponse rep,HttpServletRequest res){
		
		//查询全部的category信息，便于下拉
		List<ImgCategory> mlbackCategorydownList = imgCategoryService.selectImgCategoryByParentId();
		//System.out.println("操作说明:管理员查-categorydownList菜单");
		
		List<ImgCategory> imgCategorydownEr =new ArrayList<ImgCategory>();
		for(ImgCategory imgCategoryOne :mlbackCategorydownList){
			Integer imgCategoryParentId = imgCategoryOne.getImgCategoryParentId();
			if(imgCategoryParentId>0){
				imgCategorydownEr.add(imgCategoryOne);
			}
		}
		return Msg.success().add("resMsg", "success")
					.add("mlbackCategorydownList", mlbackCategorydownList).add("imgCategorydownEr", imgCategorydownEr);
	}

}
