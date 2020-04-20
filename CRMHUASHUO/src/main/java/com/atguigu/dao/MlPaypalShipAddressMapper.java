package com.atguigu.dao;

import com.atguigu.bean.MlPaypalShipAddress;
import com.atguigu.bean.MlPaypalShipAddressExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlPaypalShipAddressMapper {
    long countByExample(MlPaypalShipAddressExample example);

    int deleteByExample(MlPaypalShipAddressExample example);

    int insert(MlPaypalShipAddress record);

    List<MlPaypalShipAddress> selectByExample(MlPaypalShipAddressExample example);

    MlPaypalShipAddress selectByPrimaryKey(Integer shippingaddressId);

    int updateByExampleSelective(@Param("record") MlPaypalShipAddress record, @Param("example") MlPaypalShipAddressExample example);

    int updateByExample(@Param("record") MlPaypalShipAddress record, @Param("example") MlPaypalShipAddressExample example);

    int updateByPrimaryKey(MlPaypalShipAddress record);
    
    
    //增
    int insertSelective(MlPaypalShipAddress record);
    //删
    int deleteByPrimaryKey(Integer shippingaddressId);
    //改
    int updateByPrimaryKeySelective(MlPaypalShipAddress record);
    //通过Payinfoid查询
    List<MlPaypalShipAddress> selectMlPaypalShipAddressByPayinfoid(MlPaypalShipAddress record);
    
}