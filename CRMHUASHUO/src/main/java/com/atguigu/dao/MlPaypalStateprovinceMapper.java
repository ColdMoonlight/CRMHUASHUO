package com.atguigu.dao;

import com.atguigu.bean.MlPaypalStateprovince;
import com.atguigu.bean.MlPaypalStateprovinceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlPaypalStateprovinceMapper {
    long countByExample(MlPaypalStateprovinceExample example);

    int deleteByExample(MlPaypalStateprovinceExample example);

    int insert(MlPaypalStateprovince record);

    List<MlPaypalStateprovince> selectByExample(MlPaypalStateprovinceExample example);

    MlPaypalStateprovince selectByPrimaryKey(Integer stateprovinceId);

    int updateByExampleSelective(@Param("record") MlPaypalStateprovince record, @Param("example") MlPaypalStateprovinceExample example);

    int updateByExample(@Param("record") MlPaypalStateprovince record, @Param("example") MlPaypalStateprovinceExample example);

    int updateByPrimaryKey(MlPaypalStateprovince record);
    
    
    //增
    int insertSelective(MlPaypalStateprovince record);
    //删
    int deleteByPrimaryKey(Integer stateprovinceId);
    //改
    int updateByPrimaryKeySelective(MlPaypalStateprovince record);
    //通过CountryCode查询
    List<MlPaypalStateprovince> selectMlPaypalStateprovinceByCountryCode(MlPaypalStateprovince record);
    //通过CountryCode+province全称查询该条信息
	List<MlPaypalStateprovince> selectMlPaypalStateprovinceByCountryCodeAndProvince(MlPaypalStateprovince mlPaypalStateprovinceReq);
    
}