package com.atguigu.testBean.front;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.bean.MlfrontUser;
import com.atguigu.dao.MlfrontUserMapper;
import com.atguigu.utils.DateUtil;

/**
 * 测试dao层的工作
 * @author lfy
 *推荐Spring的项目就可以使用Spring的单元测试，
 *1、导入SpringTest模块
 *2、@ContextConfiguration指定Spring配置文件的位
 *3、直接autowired要使用的组件即可
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MlfrontUserTest {
	
	@Autowired
	MlfrontUserMapper mlfrontUserMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	
	
	
	/**
	 * appuserInfoMapper新增
	 */
	@Test
	public void testInsert(){
		
		//2、新增appUser信息
		MlfrontUser mlfrontUser = new MlfrontUser();
		/*
		   `user_id` INT(8) AUTO_INCREMENT primary key,
		   `user_email` VARCHAR(512) NOT NULL,
		   `user_password` VARCHAR(512) NOT NULL,
		   `user_telephone` VARCHAR(512),
		   `user_address_country` VARCHAR(512) ,
		   `user_address_province` VARCHAR(512),
		   `user_address_city` VARCHAR(512),
		   `user_address_streetaddress` VARCHAR(512),
		   `user_address_postalcode` VARCHAR(512) ,
		   `user_firstName` VARCHAR(512) ,
		   `user_lastName` VARCHAR(512) ,
		   `user_createTime` VARCHAR(512) ,
		   `user_motifyTime` VARCHAR(512) ,
		   `user_lastonlineTime` VARCHAR(512) ,
		   `user_point` INT(8) ,
		   `user_couponidStr` VARCHAR(512) 
		 * */
//		appuserInfo.setAppuserId(null);						//用户IDappuser_id
		mlfrontUser.setUserId(null);
		mlfrontUser.setUserEmail("user_email");
		mlfrontUser.setUserPassword("user_password");
		mlfrontUser.setUserTelephone("user_telephone");
		mlfrontUser.setUserAddressCountry("user_address_country");
		mlfrontUser.setUserAddressProvince("user_address_province");
		mlfrontUser.setUserAddressCity("user_address_city");
		mlfrontUser.setUserAddressStreetaddress("user_address_streetaddress");
		mlfrontUser.setUserAddressPostalcode("user_address_postalcode");
		mlfrontUser.setUserFirstname("user_firstName");
		mlfrontUser.setUserLastname("user_lastName");
		String nowTime = DateUtil.strTime14s();
		mlfrontUser.setUserCreatetime(nowTime);
		mlfrontUser.setUserMotifytime(nowTime);
		mlfrontUser.setUserLastonlinetime(nowTime);
		mlfrontUser.setUserPoint(1000);
		mlfrontUser.setUserCouponidstr("");
		
		mlfrontUserMapper.insertSelective(mlfrontUser);
		
	}
	/**
	 * mlfrontUserMapper删除
	 */
	@Test
	public void testDelete(){
		
		//2、生成员工数据，测试员工删除
		mlfrontUserMapper.deleteByPrimaryKey(2);

		System.out.println("删除完成");
	}
	
	
	/**
	 * mlfrontUserMapper更新
	 */
	@Test
	public void testUpdate(){
		
		MlfrontUser mlfrontUser = new MlfrontUser();
		//设置UserID
		mlfrontUser.setUserId(3);
		mlfrontUser.setUserEmail("1111111111111111");
		mlfrontUser.setUserPassword("user_password");
		mlfrontUser.setUserTelephone("user_telephone");
		mlfrontUser.setUserAddressCountry("user_address_country");
		mlfrontUser.setUserAddressProvince("user_address_province");
		mlfrontUser.setUserAddressCity("user_address_city");
		mlfrontUser.setUserAddressStreetaddress("user_address_streetaddress");
		mlfrontUser.setUserAddressPostalcode("user_address_postalcode");
		mlfrontUser.setUserFirstname("user_firstName");
		mlfrontUser.setUserLastname("user_lastName");
		String nowTime = DateUtil.strTime14s();
		mlfrontUser.setUserMotifytime(nowTime);
		mlfrontUser.setUserLastonlinetime(nowTime);
		mlfrontUser.setUserPoint(1000);
		mlfrontUser.setUserCouponidstr("");
		//更新时间
		
		//2、更新任务信息
		mlfrontUserMapper.updateByPrimaryKeySelective(mlfrontUser);

		System.out.println("更新完成");
	}
	
	
	/**
	 * mlfrontUserMapper条件查询
	 */
	@Test
	public void testSearchByConditions(){
		
		MlfrontUser mlfrontUser = new MlfrontUser();
		//设置UserID
		mlfrontUser.setUserId(3);
		//查询全部信息
		List<MlfrontUser> mlfrontUserListOne = mlfrontUserMapper.selectMlfrontUserByConditionS(mlfrontUser);
		System.out.println(mlfrontUserListOne);
		System.out.println("mlfrontUserListOne:"+mlfrontUserListOne.size());
		System.out.println("条件查询完成");
	}
	
	/**
	 * groupDisplayMapper查询全部
	 */
	@Test
	public void testSearchAll(){
		
		MlfrontUser mlfrontUser = new MlfrontUser();
		//查询全部信息
		List<MlfrontUser> mlfrontUserList = mlfrontUserMapper.selectMlfrontUserGetAll();
		System.out.println(mlfrontUserList);
		System.out.println("mlfrontUserListOne:"+mlfrontUserList.size());
		System.out.println("查询全部完成");
		
	}
	


}
