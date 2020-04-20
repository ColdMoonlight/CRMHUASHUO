package com.atguigu.test;

import com.atguigu.utils.PropertiesUtil;

public class propertyTest {
	public static void main(String[] args) {
		
		//String tels = PropertyUtil.getStrValue("Manager.properties", "tel.you");
		String tels = (String) PropertiesUtil.getProperty("Mail.properties", "mail.acount");
		System.out.println("mail.acount:"+tels);
	}

}
