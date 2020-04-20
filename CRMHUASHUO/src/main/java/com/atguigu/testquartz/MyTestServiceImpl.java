package com.atguigu.testquartz;

import org.springframework.stereotype.Component;

import com.atguigu.dao.quartz.IMyTestService;

@Component  //import org.springframework.stereotype.Component;
public class MyTestServiceImpl implements IMyTestService{
//	@Scheduled(cron="0/5 * *  * * ? ")   //每5秒执行一次
	@Override
	public void myTest(){
		System.out.println("进入测试");
	}

}

