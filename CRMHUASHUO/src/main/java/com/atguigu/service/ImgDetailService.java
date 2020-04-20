package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.bean.ImgDetail;
import com.atguigu.dao.ImgDetailMapper;

@Service
public class ImgDetailService {
	
	
	@Autowired
	ImgDetailMapper imgDetailMapper;
	
	/**
	 * @author Shinelon
	 * @param ImgDetail
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(ImgDetail ImgDetail) {
		int intReslut = imgDetailMapper.insertSelective(ImgDetail);
		return intReslut;
	}

	/**
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int usertemporaryId) {
		int  intReslut = imgDetailMapper.deleteByPrimaryKey(usertemporaryId);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(ImgDetail ImgDetail) {
		int  intReslut = imgDetailMapper.updateByPrimaryKeySelective(ImgDetail);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param ImgDetail
	 * @exception 查看用户信息是否存在
	 * 
	 * */
	public ImgDetail selectImgDetailById(Integer imgDetailId) {
		ImgDetail  imgDetailOne = imgDetailMapper.selectByPrimaryKey(imgDetailId);
		return imgDetailOne;
	}

	public List<ImgDetail> selectImgDetailByCategoryId(ImgDetail ImgDetailReq) {
		List<ImgDetail>  imgDetailList = imgDetailMapper.selectImgDetailByCategoryId(ImgDetailReq);
		return imgDetailList;
	}

}
