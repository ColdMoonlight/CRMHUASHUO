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
import com.atguigu.bean.MlbackCountDown;
import com.atguigu.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.atguigu.service.MlbackAdminService;
import com.atguigu.service.MlbackCountDownService;
import com.atguigu.utils.DateUtil;


@Controller
@RequestMapping("/MlbackCountDown")
public class MlbackCountDownController {
		
	@Autowired
	MlbackCountDownService mlbackCountDownService;
	
	@Autowired
	MlbackAdminService mlbackAdminService;
	
	/**
	 * 1.0	useOn	0505
	 * to-MlbackCountDown列表页面
	 * @param jsp
	 * @return 
	 * */
	@RequestMapping("/toMlbackCountDownPage")
	public String toMlbackCountDownPage() throws Exception{
	
		return "back/mlbackCountDownPage";
	}
	
	
	/**2.0	useOn	0505
	 * MlbackCountDown列表分页list数据
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/getMlbackCountDownByPage")
	@ResponseBody
	public Msg getMlbackCountDownByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpSession session) {
		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("adminuser");
//		if(mlbackAdmin==null){
//			//SysUsers对象为空
//			return Msg.fail().add("resMsg", "session中adminuser对象为空");
//		}else{
		int PagNum = 20;
			PageHelper.startPage(pn, PagNum);
			List<MlbackCountDown> mlbackCountDownList = mlbackCountDownService.selectMlbackCountDownAll();
			PageInfo page = new PageInfo(mlbackCountDownList, PagNum);
			return Msg.success().add("pageInfo", page);
//		}
	}
	
	/**3.0	useOn	0505
	 * MlbackCountDown	insert
	 * @param MlbackCountDown
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSelective(HttpServletResponse rep,HttpServletRequest res,@RequestBody MlbackCountDown mlbackCountDown){
		//接受参数信息
		System.out.println("mlbackCountDown:"+mlbackCountDown);
		//取出id
		System.out.println(1);
		Integer countdownId = mlbackCountDown.getCountdownId();
		String nowTime = DateUtil.strTime14s();
		mlbackCountDown.setCountdownMotifytime(nowTime);
		if(countdownId==null){
			//无id,insert
			mlbackCountDown.setCountdownCreatetime(nowTime);
			int intResult = mlbackCountDownService.insertSelective(mlbackCountDown);
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id,update
			int intResult = mlbackCountDownService.updateByPrimaryKeySelective(mlbackCountDown);
			return Msg.success().add("resMsg", "更新成功");
		}		
	}
	
	/**4.0	useOn	0505
	 * MlbackCountDown	delete
	 * @param id
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Msg delete(@RequestBody MlbackCountDown mlbackCountDown){
		//接收id信息
		Integer countdownId = mlbackCountDown.getCountdownId();
		int intResult = mlbackCountDownService.deleteByPrimaryKey(countdownId);
		return Msg.success().add("resMsg", "delete success");
	}
	
	/**
	 * 5.0	useOn	0505
	 * 查看单条MlbackCountDown-详情细节
	 * @param MlbackCountDown
	 * @return 
	 */
	@RequestMapping(value="/getOneMlbackCountDownDetail",method=RequestMethod.POST)
	@ResponseBody
	public Msg getOneMlbackCountDownDetail(@RequestParam(value = "countdownId") Integer countdownId){
		//接受categoryId
		MlbackCountDown mlbackCountDownReq = new MlbackCountDown();
		mlbackCountDownReq.setCountdownId(countdownId);
		//查询本条
		MlbackCountDown mlbackCountDownOne =mlbackCountDownService.selectMlbackCountDownById(mlbackCountDownReq);
		return Msg.success().add("resMsg", "查-单条mlbackCountDownOne详情完毕")
					.add("mlbackCountDownOne", mlbackCountDownOne);
	}
	
}
