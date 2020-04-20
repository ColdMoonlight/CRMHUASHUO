package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.MlbackCountDown;
import com.atguigu.dao.MlbackCountDownMapper;


@Service
public class MlbackCountDownService {
	
	
	@Autowired
	MlbackCountDownMapper mlbackCountDownMapper;


	
	/**1
	 * @author Shinelon
	 * @param mlbackCountDown
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(MlbackCountDown mlbackCountDown) {
		int intReslut = mlbackCountDownMapper.insertSelective(mlbackCountDown);
		return intReslut;
	}
	
	
	/**2
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int countdownId) {
		// TODO Auto-generated method stub
		int  intReslut = mlbackCountDownMapper.deleteByPrimaryKey(countdownId);
		return intReslut;
	}

	/**5
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(MlbackCountDown mlbackCountDown) {
		// TODO Auto-generated method stub
		int  intReslut = mlbackCountDownMapper.updateByPrimaryKeySelective(mlbackCountDown);
		return intReslut;
	}
	

	
	/**3
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public MlbackCountDown selectMlbackCountDownById(MlbackCountDown mlbackCountDown) {
		MlbackCountDown  MlbackCountDownOne = mlbackCountDownMapper.selectMlbackCountDownById(mlbackCountDown);
		return MlbackCountDownOne;
	}

	/**1
	 * @author Shinelon
	 * @param MlbackProduct
	 * @exception 查看全部的地址信息
	 * 
	 * */
	public List<MlbackCountDown> selectMlbackCountDownAll() {
		List<MlbackCountDown>  MlbackCountDownList = mlbackCountDownMapper.selectMlbackCountDownGetAll();
		return MlbackCountDownList;
	}
	
}
