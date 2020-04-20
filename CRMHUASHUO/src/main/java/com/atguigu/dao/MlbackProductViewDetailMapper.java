package com.atguigu.dao;

import com.atguigu.bean.MlbackProductViewDetail;
import com.atguigu.bean.MlbackProductViewDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackProductViewDetailMapper {
    long countByExample(MlbackProductViewDetailExample example);

    int deleteByExample(MlbackProductViewDetailExample example);

    int insert(MlbackProductViewDetail record);

    List<MlbackProductViewDetail> selectByExample(MlbackProductViewDetailExample example);

    MlbackProductViewDetail selectByPrimaryKey(Integer proviewdetailId);

    int updateByExampleSelective(@Param("record") MlbackProductViewDetail record, @Param("example") MlbackProductViewDetailExample example);

    int updateByExample(@Param("record") MlbackProductViewDetail record, @Param("example") MlbackProductViewDetailExample example);

    int updateByPrimaryKeySelective(MlbackProductViewDetail record);

    int updateByPrimaryKey(MlbackProductViewDetail record);
    
    
    
    //插入新类目
    int insertSelective(MlbackProductViewDetail record);
    //删除本条
    int deleteByPrimaryKey(Integer proviewdetailId);
    //按照时间查询全部登陆用户
	List<MlbackProductViewDetail> selectMlbackProductViewDetailByTime(MlbackProductViewDetail example);

}