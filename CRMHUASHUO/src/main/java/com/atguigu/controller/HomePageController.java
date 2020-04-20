package com.atguigu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atguigu.bean.MlbackAdmin;

/**
 * HomePage
 * @author
 *
 */
@Controller
@RequestMapping("/HomePage")
public class HomePageController {
	
	/**
	 * 	onuse	20200103	检查
	 * */
	@RequestMapping("/toHomePage")
	public String tologin(HttpSession session) throws Exception{
		
		MlbackAdmin mlbackAdmin =(MlbackAdmin) session.getAttribute("AdminUser");
		if(mlbackAdmin==null){
			//SysUsers对象为空
			return "back/mlbackAdminLogin";
		}else{
			return "back/mlbackHomePage";
		}
	}
	
//	
//	@RequestMapping("/getUrlPage")
//	public String getUrl() throws Exception{
//		
//		System.out.println("进入toMoneyOutApplyPage");
//	
//		return "receive";
//	} 
//	
//	@RequestMapping("/receive")
//	public String udid(HttpServletResponse response,HttpServletRequest request,HttpSession session) throws Exception{
//		
//		 response.setContentType("text/html;charset=UTF-8");
//		  request.setCharacterEncoding("UTF-8");
//	
//		  //接收HTTP请求参数
//		  InputStream is = request.getInputStream();
//		  //接收HTTP中的BufferedReader对象
//		  BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
//		  StringBuilder sb = new StringBuilder();
//	
//		  //HTTP参数信息
//		  String buffer = null;
//		  while ((buffer = br.readLine()) != null) {
//		   sb.append(buffer);
//		  }
//		  String content = sb.toString().substring(sb.toString().indexOf("<?xml"), sb.toString().indexOf("</plist>")+8);
//		  System.out.println("---------------------------------------");
//		  System.out.println(content);
//		  System.out.println("---------------------------------------");
//	
//	
//		     // xml解析
//		     SAXReader reader = new SAXReader();
//		     // 创建接受对象
//		     Document document = null;
//		     
//		     String udidValue = null;
//		     //解析xml文件
//		     try {
//		         document = reader.read(new ByteArrayInputStream(content.getBytes("GBK")));
//		         //document.get.getElementsByTagName("");
//		         Element rootElement = document.getRootElement();
//		         List<Element> list=rootElement.element("dict").elements();
//	//		         System.out.println(list.get(0).getText());
//	//		         System.out.println(list.get(1).getText());
//		         udidValue = list.get(1).getText();
//	//		         System.out.println(rootElement.getNodeTypeName());
//	//
//	//		         System.out.println("根节点为:" + rootElement.getName()); 
//		         
//		     } catch (DocumentException e) {
//		         e.printStackTrace();
//		     }
//		     String url ="kuaiche://?UDID=";
//		     url =url + udidValue;
//		     System.out.println(url);
//		  response.setHeader("Location", url);
//		  response.setStatus(301);
//	
//		return "udid";
//	}

}
