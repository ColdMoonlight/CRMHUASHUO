package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.MlbackProductSku;
import com.atguigu.dao.MlbackProductSkuMapper;


@Service
public class MlbackProductSkuService {
	
	
	@Autowired
	MlbackProductSkuMapper mlbackProductSkuMapper;
	
	/**
	 * @author Shinelon
	 * @param MlbackProduct
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(MlbackProductSku mlbackProductSku) {
		int intReslut = mlbackProductSkuMapper.insertSelective(mlbackProductSku);
		return intReslut;
	}

	/**
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int productskuId) {
		int  intReslut = mlbackProductSkuMapper.deleteByPrimaryKey(productskuId);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(MlbackProductSku mlbackProductSku) {
		int  intReslut = mlbackProductSkuMapper.updateByPrimaryKeySelective(mlbackProductSku);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param MlbackProduct
	 * @exception 查看用户信息是否存在
	 * 
	 * */
	public List<MlbackProductSku> selectMlbackProductSku(MlbackProductSku mlbackProductSku) {
		List<MlbackProductSku>  mlbackProductSkuList = mlbackProductSkuMapper.selectMlbackProductSkuByProductId(mlbackProductSku);
		return mlbackProductSkuList;
	}
	
	/**
	 * @author Shinelon
	 * @param MlbackProduct
	 * @exception 查看用户信息是否存在
	 * 
	 * */
	public List<MlbackProductSku> selectMlbackProductSkuAndStatus(MlbackProductSku mlbackProductSku) {
		List<MlbackProductSku>  mlbackProductSkuList = mlbackProductSkuMapper.selectMlbackProductSkuByProductIdAndStatus(mlbackProductSku);
		return mlbackProductSkuList;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlbackProductSku> selectMlbackProductSkuGetAll() {
		List<MlbackProductSku>  mlbackProductSkuList = mlbackProductSkuMapper.selectMlbackProductGetAll();
		return mlbackProductSkuList;
	}

}
