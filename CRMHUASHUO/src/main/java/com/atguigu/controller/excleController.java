package com.atguigu.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.atguigu.bean.MlfrontPayInfo;
import com.atguigu.service.MlfrontPayInfoService;
import com.atguigu.utils.DateUtil;

@Controller
@RequestMapping("/excle")
public class excleController {
	
	@Autowired
	MlfrontPayInfoService mlfrontPayInfoService;
	
	
	@RequestMapping(value="/exportPayInfo",method=RequestMethod.GET)
	public void export(HttpServletResponse rep,HttpServletRequest res,HttpSession session){
		rep.setContentType("application/octet-stream");
		
		String nowTime = DateUtil.strDate8();
		//rep.setHeader("Content-Disposition", "attachment;filename=export.xls");
		rep.setHeader("Content-Disposition", "attachment;filename="+nowTime+"payinfo.xls");
		
		
		HSSFWorkbook wb = new HSSFWorkbook();
		
		HSSFSheet sheet = wb.createSheet("sheet0");
		
		HSSFRow row = sheet.createRow(0);
		
		HSSFCell cell = row.createCell(0);
		
		List<MlfrontPayInfo> list = mlfrontPayInfoService.selectMlfrontPayInfoAll();
		
		cell.setCellValue("number");
        cell = row.createCell(1);
        cell.setCellValue("PayinfoId");
        cell = row.createCell(2);
        cell.setCellValue("PayinfoOid");
        cell = row.createCell(3);
        cell.setCellValue("PayinfoMoney");
        cell = row.createCell(4);
        for (int i = 0; i < list.size(); i++) {
            row = sheet.createRow(i+1);
            row.createCell(0).setCellValue(i+1);
            row.createCell(1).setCellValue(list.get(i).getPayinfoId());
            row.createCell(2).setCellValue(list.get(i).getPayinfoOid());
            row.createCell(3).setCellValue(list.get(i).getPayinfoMoney()+"");
        }
		try {
			OutputStream out =rep.getOutputStream();
			wb.write(out);
			out.flush();
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	/**1.1	useOn
	 * 远程调用url,name,pimageUrl
	 * @return Map
	 */
//	private Map<String, String> HttpGetPImgUrl(String id) {
//		HttpUtil httpUtil = new HttpUtil();
//		String urls="https://itunes.apple.com/cn/lookup";
//		String idParm = "id="+id;
//		String result = null;
//		Map<String, String> iosNeedMap= new HashMap<String, String>();
//		try {
//			result = httpUtil.sendPostUrl(urls,idParm,"utf-8");
//			JSONObject JSONObject = new JSONObject(result);
//			String resStr = JSONObject.get("results").toString();
//			String resStr2 =resStr.substring(1, resStr.length()-1);
//			System.out.println(resStr2);
//			JSONObject JSONObjectStr2 = new JSONObject(resStr2);
//			iosNeedMap.put("artworkUrl100", (String) JSONObjectStr2.get("artworkUrl100"));
////			iosNeedMap.put("trackName", (String) JSONObjectStr2.get("trackName"));
//			iosNeedMap.put("bundleId", (String) JSONObjectStr2.get("bundleId"));
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return iosNeedMap;
//	}

}