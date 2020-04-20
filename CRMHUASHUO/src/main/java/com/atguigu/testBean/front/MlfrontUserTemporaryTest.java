package com.atguigu.testBean.front;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.bean.MlfrontUserTemporary;
import com.atguigu.dao.MlfrontUserTemporaryMapper;
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
public class MlfrontUserTemporaryTest {
	
	@Autowired
	MlfrontUserTemporaryMapper mlfrontUserTemporaryMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	
	
	
	/**
	 * mlfrontUserTemporaryMapper新增
	 */
	@Test
	public void testInsert(){
		
		//2、新增appUser信息
		MlfrontUserTemporary mlfrontUserTemporary = new MlfrontUserTemporary();
		/*
		      `userTemporary_id` INT(8) AUTO_INCREMENT primary key,
		   `userTemporary_ip` VARCHAR(512),
		   `userTemporary_createTime` VARCHAR(512),
		   `userTemporary_motifyTime` VARCHAR(512)
		 * */
//		appuserInfo.setAppuserId(null);						//用户IDappuser_id
		mlfrontUserTemporary.setUsertemporaryId(null);
		mlfrontUserTemporary.setUsertemporaryIp("192.168.1.1");
		String nowTime = DateUtil.strTime14s();
		mlfrontUserTemporary.setUsertemporaryCreatetime(nowTime);
		mlfrontUserTemporary.setUsertemporaryMotifytime(nowTime);
		
		mlfrontUserTemporaryMapper.insertSelective(mlfrontUserTemporary);
		
	}
	/**
	 * mlfrontUserTemporaryMapper删除
	 */
	@Test
	public void testDelete(){
		
		//2、生成员工数据，测试员工删除
		mlfrontUserTemporaryMapper.deleteByPrimaryKey(2);

		System.out.println("删除完成");
	}
	
	
	/**
	 * mlfrontUserTemporaryMapper更新
	 */
	@Test
	public void testUpdate(){
		
		MlfrontUserTemporary mlfrontUserTemporary = new MlfrontUserTemporary();
		//设置UserID
		mlfrontUserTemporary.setUsertemporaryId(3);
		mlfrontUserTemporary.setUsertemporaryIp("");
		String nowTime = DateUtil.strTime14s();
		mlfrontUserTemporary.setUsertemporaryMotifytime(nowTime);
		//更新时间
		
		//2、更新任务信息
		mlfrontUserTemporaryMapper.updateByPrimaryKeySelective(mlfrontUserTemporary);

		System.out.println("更新完成");
	}
	
	
	/**
	 * mlfrontUserTemporaryMapper查询全部
	 */
	@Test
	public void testSearchAll(){
		
		//查询全部信息
		List<MlfrontUserTemporary> mlfrontUserTemporaryList = mlfrontUserTemporaryMapper.selectMlfrontUserTemporaryGetAll();
		System.out.println(mlfrontUserTemporaryList);
		System.out.println("mlfrontUserListOne:"+mlfrontUserTemporaryList.size());
		System.out.println("查询全部完成");
		
	}
	


}
