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

import com.atguigu.bean.ImgCategory;
import com.atguigu.bean.Msg;
import com.atguigu.service.ImgCategoryService;
import com.atguigu.utils.DateUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
@RequestMapping("/index")
public class indexController {
	
	@Autowired
	ImgCategoryService imgCategoryService;
	
	
	
	/**
	 * 1.0	onuse	20191225
	 * to后台分类MlbackCategory列表页面
	 * @param jsp
	 * @return 
	 * */
	@RequestMapping("/tobackIndexPage")
	public String tologin(HttpSession session) throws Exception{
		
//		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("AdminUser");
//		if(mlbackAdmin==null){
//			//SysUsers对象为空
//			return "back/mlbackAdminLogin";
//		}else{
			return "back/backhome";//views\back\backhomeviews\back\backhome.jsp
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
		String imgCategoryName = imgCategory.getImgCategoryName();
		//获取归属类名
		Integer categoryParentId = imgCategory.getImgCategoryParentId();
		ImgCategory ImgCategoryParentNameReq = new ImgCategory();
		ImgCategoryParentNameReq.setImgCategoryId(categoryParentId);
		ImgCategory ImgCategoryOneRes = imgCategoryService.selectImgCategory(categoryParentId);
		String imgCategoryParentName="";
		String imgCategoryDesc="";
		if(ImgCategoryOneRes!=null){
			imgCategoryParentName = ImgCategoryOneRes.getImgCategoryName();
			imgCategoryDesc = ImgCategoryOneRes.getImgCategoryDesc();
		}else{
			imgCategoryParentName ="---none---";
		}
		//判断归属是否为none
		if(imgCategoryParentName.equals("---none---")){
			imgCategory.setImgCategoryDesc(imgCategoryParentName);
		}else{
			imgCategory.setImgCategoryDesc(imgCategoryDesc+">"+imgCategoryName);
		}
		//取出id
		Integer ImgCategoryId = imgCategory.getImgCategoryId();
		String nowTime = DateUtil.strTime14s();
		imgCategory.setImgCategoryParentName(imgCategoryParentName);
		if(ImgCategoryId==null){
			//无id，insert
			//System.out.println("插入ImgCategoryId"+mlbackCategory.toString());
			imgCategoryService.insertSelective(imgCategory);
			//System.out.println("插入ImgCategoryId"+mlbackCategory.toString());
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id，update
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
	 *	onuse	20200103	检查
	 * 返回信息
	 * */
	@RequestMapping("/isMobileOrPc")
	public static String  isMobileOrPc(HttpServletResponse reponse,HttpServletRequest request){
		
		String requestHeader = request.getHeader("user-agent");
		if(isMobileDevice(requestHeader)){
			System.out.println("使用手机浏览器");
			return "mfront/index";//手机首页
		}else{
			System.out.println("使用web浏览器");
			return "front/index";//PC首页
		}
	}
	
	/**
	 * 	onuse	20200103	检查
	 * 判断设备型号
	 * */
	public static boolean  isMobileDevice(String requestHeader){
        /**
         * android : 所有android设备
         * mac os : iphone ipad
         * windows phone:Nokia等windows系统的手机
         */
        String[] deviceArray = new String[]{"android","mac os","windows phone"};
        if(requestHeader == null)
            return false;//pc
        requestHeader = requestHeader.toLowerCase();
        for(int i=0;i<deviceArray.length;i++){
        	System.out.println("deviceArray[i]:"+deviceArray[i]);
            if(requestHeader.indexOf(deviceArray[i])>0){
                return true;//移动
            }
        }
        return false;
	}
	
}
