package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.MlbackProductViewDetail;
import com.atguigu.dao.MlbackProductViewDetailMapper;


@Service
public class MlbackProductViewDetailService {
	
	
	@Autowired
	MlbackProductViewDetailMapper mlbackProductViewDetailMapper;
	
	/**
	 * @author Shinelon
	 * @param MlbackProductViewDetail
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(MlbackProductViewDetail mlbackProductViewDetail) {
		int intReslut = mlbackProductViewDetailMapper.insertSelective(mlbackProductViewDetail);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int actshowproId) {
		int  intReslut = mlbackProductViewDetailMapper.deleteByPrimaryKey(actshowproId);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlbackProductViewDetail> selectMlbackProductViewDetailByTime(MlbackProductViewDetail mlbackProductViewDetail) {
		List<MlbackProductViewDetail>  MlbackProductViewDetailList = mlbackProductViewDetailMapper.selectMlbackProductViewDetailByTime(mlbackProductViewDetail);
		return MlbackProductViewDetailList;
	}

}
