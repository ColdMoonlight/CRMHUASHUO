package com.atguigu.dao;

import com.atguigu.bean.MlbackProductImg;
import com.atguigu.bean.MlbackProductImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackProductImgMapper {
    long countByExample(MlbackProductImgExample example);

    int deleteByExample(MlbackProductImgExample example);

    int insert(MlbackProductImg record);

    List<MlbackProductImg> selectByExample(MlbackProductImgExample example);

    MlbackProductImg selectByPrimaryKey(Integer productimgId);

    int updateByExampleSelective(@Param("record") MlbackProductImg record, @Param("example") MlbackProductImgExample example);

    int updateByExample(@Param("record") MlbackProductImg record, @Param("example") MlbackProductImgExample example);

    int updateByPrimaryKey(MlbackProductImg record);
    
    
    
    //插入新图片00
    int insertSelective(MlbackProductImg record);
    //删除本条图片00
    int deleteByPrimaryKey(Integer productimgId);
    //更新本条图片00
    int updateByPrimaryKeySelective(MlbackProductImg record);
    //条件查询图片00
    List<MlbackProductImg> selectMlbackProductImgByConditionS(MlbackProductImg example);
    //查询所有图片00
	List<MlbackProductImg> selectMlbackProductImgGetAll();
	
	//查询本产品下的多张图00
	List<MlbackProductImg> selectMlbackProductImgByProductId(Integer productId);
	
	//查询本条图片否存在
	List<MlbackProductImg> selectMlbackProductImgByPIdAndImgSort(MlbackProductImg example);
	
	List<MlbackProductImg> selectMlbackProductImgByProductImgId(Integer productimgId);
	
}