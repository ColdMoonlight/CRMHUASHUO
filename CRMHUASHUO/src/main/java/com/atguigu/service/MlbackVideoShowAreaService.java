package com.atguigu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.atguigu.bean.MlbackVideoShowArea;
import com.atguigu.dao.MlbackVideoShowAreaMapper;

@Service
public class MlbackVideoShowAreaService {
	
	@Autowired
	MlbackVideoShowAreaMapper mlbackSlideMapper;
	
	/**
	 * @author Shinelon
	 * @param MlbackSlide
	 * @exception add方法用户信息是否存在
	 * 
	 * */
	public int insertSelective(MlbackVideoShowArea mlbackSlide) {
		int intReslut = mlbackSlideMapper.insertSelective(mlbackSlide);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 删除本条信息
	 * 
	 * */
	public int deleteByPrimaryKey(int slideId) {
		int  intReslut = mlbackSlideMapper.deleteByPrimaryKey(slideId);
		return intReslut;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 更新本条信息
	 * 
	 * */
	public int updateByPrimaryKeySelective(MlbackVideoShowArea mlbackSlide) {
		int  intReslut = mlbackSlideMapper.updateByPrimaryKeySelective(mlbackSlide);
		return intReslut;
	}

	/**
	 * @author Shinelon
	 * @param MlbackVideoShowArea
	 * @exception 查看用户信息是否存在
	 * 
	 * */
	public MlbackVideoShowArea selectMlbackVideoShowAreaById(MlbackVideoShowArea mlbackSlide) {
		MlbackVideoShowArea  MlbackVideoShowAreaOne = mlbackSlideMapper.selectMlbackVideoShowAreaById(mlbackSlide);
		return MlbackVideoShowAreaOne;
	}
	
	/**
	 * @author Shinelon
	 * @param 
	 * @exception 查看全部用户信息
	 * 
	 * */
	public List<MlbackVideoShowArea> selectMlbackVideoShowAreaGetAll() {
		List<MlbackVideoShowArea>  MlbackVideoShowAreaList = mlbackSlideMapper.selectMlbackVideoShowAreaGetAll();
		return MlbackVideoShowAreaList;
	}

	public List<MlbackVideoShowArea> selectMlbackVideoShowAreawapListByArea(MlbackVideoShowArea mlbackSlide) {
		List<MlbackVideoShowArea>  MlbackVideoShowAreaList = mlbackSlideMapper.selectMlbackVideoShowAreawapListByArea(mlbackSlide);
		return MlbackVideoShowAreaList;
	}
	
	public List<MlbackVideoShowArea> selectMlbackVideoShowAreapcListByArea(MlbackVideoShowArea mlbackSlide) {
		List<MlbackVideoShowArea>  MlbackVideoShowAreaList = mlbackSlideMapper.selectMlbackVideoShowAreapcListByArea(mlbackSlide);
		return MlbackVideoShowAreaList;
	}

}
