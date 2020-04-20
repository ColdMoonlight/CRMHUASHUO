package com.atguigu.utils;

import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelUtils {
	//导出文件
//	public static XSSFWorkbook exportContacts(List<SysUser> list)
//	            throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
//	        XSSFWorkbook xssfWorkbook = null;
//	        String sheetName = "用户名称";
//	        xssfWorkbook = createExcelFile(list, sheetName);
//	        return xssfWorkbook;
//
//	    }
//
//	//创建EXCEL
//    public static XSSFWorkbook createExcelFile(List<SysUser> list, String sheetName)
//            throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
//        // 创建EXCEL
//        XSSFWorkbook workbook = new XSSFWorkbook();
//        // 创建EXCEL
//        XSSFSheet sheet = workbook.createSheet(sheetName);
//        XSSFRow row = sheet.createRow(0);
//        XSSFCell cell = row.createCell(0);
//        cell.setCellValue("UserId");
//        cell = row.createCell(1);
//        cell.setCellValue("UserName");
//        cell = row.createCell(2);
//        cell.setCellValue("UserPwd");
//        cell = row.createCell(3);
//        for (int i = 0; i < list.size(); i++) {
//            row = sheet.createRow(i+1);
//            row.createCell(0).setCellValue(list.get(i).getUserId());
//            row.createCell(1).setCellValue(list.get(i).getUserName());
//            row.createCell(2).setCellValue(list.get(i).getUserPwd());
//        }
//        return workbook;
//    }
//    
//    
//  //导出文件
//  	public static XSSFWorkbook exportContactsGroupDisplay(List<UserWork> list)
//  	            throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
//  	        XSSFWorkbook xssfWorkbook = null;
//  	        String sheetName = "用户名称";
//  	        xssfWorkbook = createExcelFileGroupDisplay(list, sheetName);
//  	        return xssfWorkbook;
//
//  	    }
//
//  	//创建EXCEL
//      public static XSSFWorkbook createExcelFileGroupDisplay(List<UserWork> list, String sheetName)
//              throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException {
//          // 创建EXCEL
//          XSSFWorkbook workbook = new XSSFWorkbook();
//          // 创建EXCEL
//          XSSFSheet sheet = workbook.createSheet(sheetName);
//          XSSFRow row = sheet.createRow(0);
//          XSSFCell cell = row.createCell(0);
//          cell.setCellValue("number");
//          cell = row.createCell(1);
//          cell.setCellValue("UserworkGroupdisplayId");
//          cell = row.createCell(2);
//          cell.setCellValue("UserworkIdfa");
//          cell = row.createCell(3);
//          cell.setCellValue("UserworkReceivetime");
//          cell = row.createCell(4);
//          for (int i = 0; i < list.size(); i++) {
//              row = sheet.createRow(i+1);
////              row.createCell(0).setCellValue(list.get(i).getUserworkId());
//              row.createCell(0).setCellValue(i+1);
//              row.createCell(1).setCellValue(list.get(i).getUserworkGroupdisplayId());
//              row.createCell(2).setCellValue(list.get(i).getUserworkIdfa());
//              row.createCell(3).setCellValue(list.get(i).getUserworkReceivetime());
//          }
//          return workbook;
//      }
}
