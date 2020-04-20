package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atguigu.bean.ImgCategory;
import com.atguigu.dao.ImgCategoryMapper;


@Service
public class ImgCategoryService {
	
	
	@Autowired
	ImgCategoryMapper imgCategoryMapper;
	
	/**
	 * @author Shinelon
	 * @param ImgCategory
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(ImgCategory ImgCategory) {
		int intReslut = imgCategoryMapper.insertSelective(ImgCategory);
		return intReslut;
	}

	/**
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int usertemporaryId) {
		int  intReslut = imgCategoryMapper.deleteByPrimaryKey(usertemporaryId);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(ImgCategory ImgCategory) {
		int  intReslut = imgCategoryMapper.updateByPrimaryKeySelective(ImgCategory);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param MlfrontUser
	 * @exception 查看用户信息是否存在
	 * 
	 * */
	public ImgCategory selectImgCategory(Integer imgCategoryId) {
		ImgCategory  imgCategoryOne = imgCategoryMapper.selectByPrimaryKey(imgCategoryId);
		return imgCategoryOne;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<ImgCategory> selectImgCategoryGetAll() {
		List<ImgCategory>  ImgCategoryList = imgCategoryMapper.selectImgCategoryGetAll();
		return ImgCategoryList;
	}

	public List<ImgCategory> selectImgCategoryByParentId() {
		List<ImgCategory>  ImgCategoryList = imgCategoryMapper.selectImgCategoryByParentId();
		return ImgCategoryList;
	}

}
