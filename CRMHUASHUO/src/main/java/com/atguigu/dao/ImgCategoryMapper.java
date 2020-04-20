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
    
    //��������Ŀ
    int insertSelective(ImgCategory record);
    //ɾ������
    int deleteByPrimaryKey(Integer imgCategoryId);
    //���±���
    int updateByPrimaryKeySelective(ImgCategory record);
    //select
    ImgCategory selectByPrimaryKey(Integer imgCategoryId);
    //��ѯȫ����½�û�
  	List<ImgCategory> selectImgCategoryGetAll();

	List<ImgCategory> selectImgCategoryByParentId();
    
}