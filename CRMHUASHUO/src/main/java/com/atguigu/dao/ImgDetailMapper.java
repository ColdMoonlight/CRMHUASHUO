package com.atguigu.dao;

import com.atguigu.bean.ImgDetail;
import com.atguigu.bean.ImgDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImgDetailMapper {
    long countByExample(ImgDetailExample example);

    int deleteByExample(ImgDetailExample example);

    int insert(ImgDetail record);

    List<ImgDetail> selectByExample(ImgDetailExample example);

    int updateByExampleSelective(@Param("record") ImgDetail record, @Param("example") ImgDetailExample example);

    int updateByExample(@Param("record") ImgDetail record, @Param("example") ImgDetailExample example);

    int updateByPrimaryKey(ImgDetail record);
    
    
    
    //add new One
    int insertSelective(ImgDetail record);
    //delete by OneId
    int deleteByPrimaryKey(Integer imgDetailId);
    //update by One
    int updateByPrimaryKeySelective(ImgDetail record);
    //select by OneId
    ImgDetail selectByPrimaryKey(Integer imgDetailId);
    //select by param
	List<ImgDetail> selectImgDetailByCategoryId(ImgDetail imgDetailReq);
    
}