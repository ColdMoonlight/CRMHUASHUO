package com.atguigu.testBean.back;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.atguigu.bean.MlbackAdmin;
import com.atguigu.dao.MlbackAdminMapper;

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
public class MlbackAdminTest {
	
	@Autowired
	MlbackAdminMapper mlbackAdminMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 测试DepartmentMapper
	 */
	@Test
	public void testCRUD(){
		
//		生成员工数据，测试员工插入insert接口
//		MlbackAdmin mlbackAdmin = new MlbackAdmin();
//		mlbackAdmin.setAdminAccname("adminzsh");
//		mlbackAdmin.setAdminPassword("abcd123456");
//		mlbackAdmin.setAdminOperatername("超级管理员");
//		mlbackAdmin.setAdminPower(2);
//		mlbackAdminMapper.insertSelective(mlbackAdmin);
		
		
//		生成员工数据，测试员工查询select接口		
//		MlbackAdmin mlbackAdmin = new MlbackAdmin();
//		mlbackAdmin.setAdminAccname("admin");
//		mlbackAdmin.setAdminPassword("abcd123456");
//		List<MlbackAdmin>  MlbackAdminList = mlbackAdminMapper.selectMlbackAdmin(mlbackAdmin);
//		for(MlbackAdmin mlbackAdminl:MlbackAdminList){
//			System.out.println(mlbackAdminl);
//		}
//		System.out.println(MlbackAdminList.size());
		
		
//		生成员工数据，测试员工查询select接口		
		List<MlbackAdmin>  MlbackAdminList = mlbackAdminMapper.selectMlbackAdminGetAll();
		for(MlbackAdmin mlbackAdminl:MlbackAdminList){
			System.out.println(mlbackAdminl);
		}
		System.out.println(MlbackAdminList.size());
		
	}

}
