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
import com.atguigu.bean.MlbackAdmin;
import com.atguigu.bean.MlbackEmail;
import com.atguigu.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.atguigu.service.MlbackAdminService;
import com.atguigu.service.MlbackEmailService;
import com.atguigu.utils.DateUtil;

@Controller
@RequestMapping("/MlbackEmail")
public class MlbackEmailController {
		
	@Autowired
	MlbackEmailService mlbackEmailService;
	
	@Autowired
	MlbackAdminService mlbackAdminService;
	
	/**
	 * 1.0	UseNow	0505
	 * toMlbackEmail列表页面
	 * @param jsp
	 * @return 
	 * */
	@RequestMapping("/toMlbackEmailPage")
	public String toMlbackEmailPage() throws Exception{
	
		return "back/mlbackEmailPage";
	}
	
	/**2.0	UseNow	0505
	 * MlbackEmail	insert
	 * @param MlbackEmail
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSelective(HttpServletResponse rep,HttpServletRequest res,@RequestBody MlbackEmail mlbackEmail){
		//接受参数信息
		//取出id
		Integer emailId = mlbackEmail.getEmailId();
		String nowTime = DateUtil.strTime14s();
		mlbackEmail.setEmailMotifytime(nowTime);
		if(emailId==null){
			//无id，insert
			mlbackEmail.setEmailCreatetime(nowTime);
			int intResult = mlbackEmailService.insertSelective(mlbackEmail);
			System.out.println("后台操作:emailId为null,走add+intResult:"+intResult);
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id，update
			int intResult = mlbackEmailService.updateByPrimaryKeySelective(mlbackEmail);
			System.out.println("后台操作:emailId不为null,走update+intResult:"+intResult);
			return Msg.success().add("resMsg", "更新成功");
		}		
	}
	
	/**3.0	UseNow	0505
	 * MlbackEmail	delete
	 * @param id
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Msg delete(@RequestBody MlbackEmail mlbackEmail){
		//接收id信息
		Integer emailId = mlbackEmail.getEmailId();
		int intResult = mlbackEmailService.deleteByPrimaryKey(emailId);
		System.out.println("后台操作:delete success:"+intResult);
		return Msg.success().add("resMsg", "delete success");
	}
	
	/**4.0	UseNow	0505
	 * 分类MlbackEmail列表分页list数据
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/getMlbackEmailByPage")
	@ResponseBody
	public Msg getMlbackEmailByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpSession session) {
		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("adminuser");
//		if(mlbackAdmin==null){
//			//SysUsers对象为空
//			return Msg.fail().add("resMsg", "session中adminuser对象为空");
//		}else{
		int PagNum = 20;
			PageHelper.startPage(pn, PagNum);
			List<MlbackEmail> mlbackEmailList = mlbackEmailService.selectMlbackEmailGetAllEmpt();
			PageInfo page = new PageInfo(mlbackEmailList, PagNum);
			return Msg.success().add("pageInfo", page);
//		}
	}
	
	/**
	 * 5.0	UseNow	0505
	 * 查看单条类目的详情细节
	 * @param MlbackEmail
	 * @return 
	 */
	@RequestMapping(value="/getOneMlbackEmailOneDetail",method=RequestMethod.POST)
	@ResponseBody
	public Msg getOneMlbackEmailOneDetail(@RequestParam(value = "emailId") Integer emailId){
		
		//接受categoryId
		MlbackEmail mlbackEmailReq = new MlbackEmail();
		mlbackEmailReq.setEmailId(emailId);
		//查询本条
		List<MlbackEmail> mlbackEmailResList =mlbackEmailService.selectMlbackEmailById(mlbackEmailReq);
		MlbackEmail mlbackEmailOne = new MlbackEmail();
		if(mlbackEmailResList.size()>0){
			mlbackEmailOne =mlbackEmailResList.get(0);
		}else{
			mlbackEmailOne = null;
		}
		return Msg.success().add("resMsg", "查看单条mlbackEmailOne的详情细节完毕")
					.add("mlbackEmailOne", mlbackEmailOne);
	}
	
}
