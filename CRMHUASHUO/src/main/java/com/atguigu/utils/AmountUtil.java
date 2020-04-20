/*************************************************************************
*file name   :  AmountUtil.java
*copyright   :   umpay
*modified    :   Jan 10, 2011
*************************************************************************/
package com.atguigu.utils;

import java.text.DecimalFormat;

/*************************************************************************
 *class : AmountUtil
 *@author :  Ding Zhe
 *@version :  1.0  
 *description :  金额转换工具类
 *@see :                        
 *************************************************************************/
public class AmountUtil {
	//将分转换为元
	// 赵海堂 2016年6月27日 21:10:44
	// 修改金额过大出现科学计数法	
	public static String conversAmtF2Y(String fen) {
		if (null == fen || fen.trim().length() == 0) {
			return "0";
		}
		
		Long fenL = Long.parseLong(fen.trim());
		return Cent2Dollar(fenL);
	}
	
	/**
	 * 格式化金额为两位小数
	 * @param s
	 * @return
	 */
	public static String formatDouble(double s){
	    DecimalFormat fmt = new DecimalFormat("#0.00");
	    return fmt.format(s);
	}
	/**
	 * 格式化金额为两位小数,带千分位 1,000.00
	 * @param s
	 * @return
	 */
	public static String formatDouble1(double s){
	    DecimalFormat fmt = new DecimalFormat("#,##0.00");
	    return fmt.format(s);
	}
	public static String formatDouble1(String s){
	  
	    return formatDouble1(Double.valueOf(s));
	}
	
	public static void main(String[] args) {
		System.out.println(formatDouble1("10000.01"));
//		System.out.println(Cent2Dollar("1000000000000000000"));
	}
	
	/**
	 * 分转元
	 * 
	 * @param s
	 *            分格式
	 * @return 元格式
	 */
	public static String Cent2Dollar(String s) {
		return transformNumber(s, "###,##0.00", 0.01);
	}
	
	/**
	 * 元转分
	 * 
	 * @param s 分格式
	 * @return 元格式
	 */
	public static String DollarToCent(String s) {
		return transformNumber(s, "##0", 100);
	}
	
	/**
	 * ********************************************
	 * method name   : Cent2Dollar2 
	 * description   : 不带千分位的分转元
	 * @return       : String
	 * @param        : @param s
	 * @param        : @return
	 * modified      : Administrator ,  2016年12月8日
	 * @see          : 
	 * *******************************************
	 */
	public static String Cent2Dollar2(String s) {
		return transformNumber(s, "#0.00", 0.01);
	}
	/**
	 * ********************************************
	 * method name   : Cent2Dollar2 
	 * description   : 不带千分位的分转元
	 * @return       : String
	 * @param        : @param s
	 * @param        : @return
	 * modified      : Administrator ,  2016年12月8日
	 * @see          : 
	 * *******************************************
	 */
	public static String Cent2Dollar2(Long s) {
		return Cent2Dollar2(String.valueOf(s));
	}
	public static String Cent2Dollar(Long src) {
		return Cent2Dollar(String.valueOf(src));
	}
	private static String transformNumber(String src, String format, double rate) {
		
		if (src == null || src.trim().length() == 0) {
			return "0";
		}
		
		try{
			return new DecimalFormat(format).format(Double.parseDouble(src.trim()) * rate);
		}catch(NumberFormatException e){
			return "0";
		}
		
	}
}
