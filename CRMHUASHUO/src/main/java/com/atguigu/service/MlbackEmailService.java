package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.bean.MlbackEmail;
import com.atguigu.dao.MlbackEmailMapper;

@Service
public class MlbackEmailService {
	
	
	@Autowired
	MlbackEmailMapper mlbackEmailMapper;

	/**1
	 * @author Shinelon
	 * @param MlbackEmail
	 * @exception add方法用户信息是否存在
	 * */
	public int insertSelective(MlbackEmail mlbackFootNav) {
		int intReslut = mlbackEmailMapper.insertSelective(mlbackFootNav);
		return intReslut;
	}
	
	/**2
	 * @author Shinelon
	 * @param MlbackEmail
	 * @exception 删除本条信息
	 * */
	public int deleteByPrimaryKey(int footnavId) {
		// TODO Auto-generated method stub
		int  intReslut = mlbackEmailMapper.deleteByPrimaryKey(footnavId);
		return intReslut;
	}

	/**3
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * */
	public int updateByPrimaryKeySelective(MlbackEmail mlbackFootNav) {
		// TODO Auto-generated method stub
		int  intReslut = mlbackEmailMapper.updateByPrimaryKeySelective(mlbackFootNav);
		return intReslut;
	}
	
	
	
	/**4
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * */
	public List<MlbackEmail> selectMlbackEmailById(MlbackEmail mlbackEmail) {
		List<MlbackEmail>  mlbackEmailList = mlbackEmailMapper.selectMlbackEmailById(mlbackEmail);
		return mlbackEmailList;
	}
	
	/**5
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * */
	public List<MlbackEmail> selectMlbackEmailGetAllEmpt() {
		List<MlbackEmail>  mlbackEmailList = mlbackEmailMapper.selectMlbackEmailGetAllEmpt();
		return mlbackEmailList;
	}
	
	
	/**6
	 * @author Shinelon
	 * @param MlbackEmail
	 * @exception 查看全部的地址信息
	 * */
	public List<MlbackEmail> selectMlbackEmailAll() {
		List<MlbackEmail>  mlbackEmailList = mlbackEmailMapper.selectMlbackEmailGetAll();
		return mlbackEmailList;
	}
	
}
