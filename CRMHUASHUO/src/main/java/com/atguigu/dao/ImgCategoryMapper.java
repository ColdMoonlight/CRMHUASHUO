package com.atguigu.dao;

import com.atguigu.bean.ImgCategory;
import com.atguigu.bean.ImgCategoryExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgCategoryMapper {
    long countByExample(ImgCategoryExample example);

    int deleteByExample(ImgCategoryExample example);

    int insert(ImgCategory record);

    List<ImgCategory> selectByExample(ImgCategoryExample example);

    int updateByExampleSelective(@Param("record") ImgCategory record, @Param("example") ImgCategoryExample example);

    int updateByExample(@Param("record") ImgCategory record, @Param("example") ImgCategoryExample example);

    int updateByPrimaryKey(ImgCategory record);
    
    //插入新类目
    int insertSelective(ImgCategory record);
    //删除本条
    int deleteByPrimaryKey(Integer imgCategoryId);
    //更新本条
    int updateByPrimaryKeySelective(ImgCategory record);
    //select
    ImgCategory selectByPrimaryKey(Integer imgCategoryId);
    //查询全部登陆用户
  	List<ImgCategory> selectImgCategoryGetAll();

	List<ImgCategory> selectImgCategoryByParentId();
    
}