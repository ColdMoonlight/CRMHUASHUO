package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.MlfrontAddress;
import com.atguigu.dao.MlfrontAddressMapper;


@Service
public class MlfrontAddressService {
	
	@Autowired
	MlfrontAddressMapper mlfrontAddressMapper;
	
	/**1
	 * @author Shinelon
	 * @param MlfrontAddress
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(MlfrontAddress mlfrontAddress) {
		int intReslut = mlfrontAddressMapper.insertSelective(mlfrontAddress);
		return intReslut;
	}
	
	/**2
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int addressId) {
		// TODO Auto-generated method stub
		int  intReslut = mlfrontAddressMapper.deleteByPrimaryKey(addressId);
		return intReslut;
	}
	
	/**3
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(MlfrontAddress mlfrontAddress) {
		// TODO Auto-generated method stub
		int  intReslut = mlfrontAddressMapper.updateByPrimaryKeySelective(mlfrontAddress);
		return intReslut;
	}
	
	/**4
	 * @author Shinelon
	 * @param MlbackProduct
	 * @exception 查看全部的地址信息
	 * 
	 * */
	public List<MlfrontAddress> selectMlfrontAddressAll() {
		List<MlfrontAddress>  mlfrontAddressList = mlfrontAddressMapper.selectMlfrontAddressGetAll();
		return mlfrontAddressList;
	}
	
	/**5
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlfrontAddress> selectMlfrontAddressById(MlfrontAddress mlfrontAddress) {
		List<MlfrontAddress>  mlfrontAddressList = mlfrontAddressMapper.selectMlfrontAddressById(mlfrontAddress);
		return mlfrontAddressList;
	}
	
	/**6
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlfrontAddress> selectMlfrontAddressByuInfo(MlfrontAddress mlfrontAddress) {
		List<MlfrontAddress>  mlfrontAddressList = mlfrontAddressMapper.selectMlfrontAddressByuInfo(mlfrontAddress);
		return mlfrontAddressList;
	}
	/**6
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlfrontAddress> selectMlfrontAddressByuId(MlfrontAddress mlfrontAddress) {
		List<MlfrontAddress>  mlfrontAddressList = mlfrontAddressMapper.selectMlfrontAddressByuId(mlfrontAddress);
		return mlfrontAddressList;
	}
	
	/**5
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public MlfrontAddress selectMlfrontAddressByIp(String mlfrontAddressIp) {
		MlfrontAddress  mlfrontAddress = mlfrontAddressMapper.selectMlfrontAddressByIp(mlfrontAddressIp);
		return mlfrontAddress;
	}
}
