package com.atguigu.utils;

import java.util.Random;
/**
 * ***********************************************************************
 * <br>description : RandomCode ������
 * @author      Zhou shaohua
 * @version     1.0  
 * @date        2017��6��19�� ����3:52:57 
 ************************************************************************
 */
public class RandomCodeUtil {
	
	public String getSix() {
		Random rad = new Random();

		String result = rad.nextInt(1000000) + "";

		if (result.length() != 6) {
			return getSix();
		}
		return result;
	}

	public String getTwo() {
		Random rad = new Random();

		String result = rad.nextInt(100) + "";

		if (result.length() != 2) {
			return getTwo();
		}
		return result;
	}

	public String getSixTeen() {

		Random rad = new Random();
		String result1 = rad.nextInt(100000000) + "";
		String result2 = rad.nextInt(100000000) + "";
		if (result1.length() != 8) {
			return getSix();
		}
		if (result2.length() != 8) {
			return getSix();
		}
		String result = result1 + result2;

		return result;
	}

}
