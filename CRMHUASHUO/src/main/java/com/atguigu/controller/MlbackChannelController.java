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
import com.atguigu.bean.MlbackChannel;
import com.atguigu.bean.Msg;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.atguigu.service.MlbackChannelService;
import com.atguigu.utils.DateUtil;

@Controller
@RequestMapping("/MlbackChannel")
public class MlbackChannelController {
		
	@Autowired
	MlbackChannelService mlbackChannelService;
	
	/**
	 * 1.0	UseNow	0909
	 * to分类MlbackChannel列表页面
	 * @param jsp
	 * @return 
	 * */
	@RequestMapping("/toMlbackChannelPage")
	public String tologin(HttpSession session) throws Exception{
	
		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("AdminUser");
		if(mlbackAdmin==null){
			//SysUsers对象为空
			return "back/mlbackAdminLogin";
		}else{
			return "back/mlbackChannelPage";
		}
	}
	
	/**2.0	UseNow	0505
	 * 分类MlbackChannel列表分页list数据
	 * @param pn
	 * @return
	 */
	@RequestMapping(value="/getMlbackChannelByPage")
	@ResponseBody
	public Msg getMlbackChannelByPage(@RequestParam(value = "pn", defaultValue = "1") Integer pn,HttpSession session) {
		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("adminuser");
//		if(mlbackAdmin==null){
//			//SysUsers对象为空
//			return Msg.fail().add("resMsg", "session中adminuser对象为空");
//		}else{
			int PagNum = 20;
			PageHelper.startPage(pn, PagNum);
			List<MlbackChannel> mlbackChannelList = mlbackChannelService.selectMlbackChannelGetAll();
			PageInfo page = new PageInfo(mlbackChannelList, PagNum);
			return Msg.success().add("pageInfo", page);
//		}
	}
	
	
	/**3.0	UseNow	0505
	 * MlbackChannel	insert
	 * @param MlbackChannel
	 */
	@RequestMapping(value="/save",method=RequestMethod.POST)
	@ResponseBody
	public Msg saveSelective(HttpServletResponse rep,HttpServletRequest res,@RequestBody MlbackChannel mlbackChannel){
		//接受参数信息
		//获取类名
		Integer channelId = mlbackChannel.getChannelId();
		
		String nowtime = DateUtil.strTime14s();
		mlbackChannel.setChannelMotifytime(nowtime);

		if(channelId==null){
			mlbackChannel.setChannelCreatetime(nowtime);
			//无id，insert
			mlbackChannelService.insertSelective(mlbackChannel);
			//System.out.println("Channel insert success+intResult:"+intResult);
			return Msg.success().add("resMsg", "插入成功");
		}else{
			//有id，update
			mlbackChannelService.updateByPrimaryKeySelective(mlbackChannel);
			//System.out.println("Channel update success+intResult:"+intResult);
			return Msg.success().add("resMsg", "更新成功");
		}		
	}
	
	/**4.0	UseNow	0505
	 * MlbackChannel	delete
	 * @param id
	 */
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	@ResponseBody
	public Msg delete(@RequestBody MlbackChannel mlbackChannel){
		//接收id信息
		Integer channelId = mlbackChannel.getChannelId();
		mlbackChannelService.deleteByPrimaryKey(channelId);
		//System.out.println("delete success+intResult:"+intResult);
		return Msg.success().add("resMsg", "delete success");
	}
	
	/**
	 * 5.0	UseNow	0505
	 * 查看单条MlbackChannel详情
	 * @param MlbackChannel
	 * @return 
	 */
	@RequestMapping(value="/getOneMlbackChannelDetail",method=RequestMethod.POST)
	@ResponseBody
	public Msg getOneMlbackCategoryDetail(@RequestParam(value = "channelId") Integer channelId){
		
		//接受categoryId
		MlbackChannel mlbackChannelReq = new MlbackChannel();
		mlbackChannelReq.setChannelId(channelId);
		//查询本条
		List<MlbackChannel> mlbackChannelResList =mlbackChannelService.selectMlbackChannelById(mlbackChannelReq);
		MlbackChannel mlbackChannelOne =mlbackChannelResList.get(0);

		return Msg.success().add("resMsg", "查看单条MlbackChannel详情完毕")
					.add("mlbackChannelOne", mlbackChannelOne);
	}
	
}
