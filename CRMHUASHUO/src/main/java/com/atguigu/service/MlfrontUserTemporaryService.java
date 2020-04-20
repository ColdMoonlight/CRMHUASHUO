package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.MlfrontUserTemporary;
import com.atguigu.dao.MlfrontUserTemporaryMapper;


@Service
public class MlfrontUserTemporaryService {
	
	
	@Autowired
	MlfrontUserTemporaryMapper mlfrontUserTemporaryMapper;
	
	/**
	 * @author Shinelon
	 * @param MlfrontUserTemporary
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(MlfrontUserTemporary mlfrontUserTemporary) {
		int intReslut = mlfrontUserTemporaryMapper.insertSelective(mlfrontUserTemporary);
		return intReslut;
	}

	/**
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int usertemporaryId) {
		// TODO Auto-generated method stub
		int  intReslut = mlfrontUserTemporaryMapper.deleteByPrimaryKey(usertemporaryId);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(MlfrontUserTemporary mlfrontUserTemporary) {
		// TODO Auto-generated method stub
		int  intReslut = mlfrontUserTemporaryMapper.updateByPrimaryKeySelective(mlfrontUserTemporary);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param MlfrontUser
	 * @exception 查看用户信息是否存在
	 * 
	 * */
	public List<MlfrontUserTemporary> selectMlfrontUserTemporary(MlfrontUserTemporary mlfrontUserTemporary) {
		List<MlfrontUserTemporary>  mlfrontUserTemporaryList = mlfrontUserTemporaryMapper.selectMlfrontUserTemporaryByIp(mlfrontUserTemporary);
		return mlfrontUserTemporaryList;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlfrontUserTemporary> selectMlfrontUserTemporaryGetAll() {
		List<MlfrontUserTemporary>  mlfrontUserTemporaryList = mlfrontUserTemporaryMapper.selectMlfrontUserTemporaryGetAll();
		return mlfrontUserTemporaryList;
	}

}
