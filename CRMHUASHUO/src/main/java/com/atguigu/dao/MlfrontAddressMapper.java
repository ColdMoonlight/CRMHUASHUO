package com.atguigu.dao;

import com.atguigu.bean.MlfrontAddress;
import com.atguigu.bean.MlfrontAddressExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlfrontAddressMapper {
    long countByExample(MlfrontAddressExample example);

    int deleteByExample(MlfrontAddressExample example);

    int insert(MlfrontAddress record);

    List<MlfrontAddress> selectByExample(MlfrontAddressExample example);

    MlfrontAddress selectByPrimaryKey(Integer addressId);

    int updateByExampleSelective(@Param("record") MlfrontAddress record, @Param("example") MlfrontAddressExample example);

    int updateByExample(@Param("record") MlfrontAddress record, @Param("example") MlfrontAddressExample example);

    int updateByPrimaryKey(MlfrontAddress record);
    
    
    
    //插入新地区价格模板
    int insertSelective(MlfrontAddress record);
    //删除本条地区价格模板
    int deleteByPrimaryKey(Integer addressId);
    //更新本条地区价格模板
    int updateByPrimaryKeySelective(MlfrontAddress record);
    //查询后台登陆用户00
    List<MlfrontAddress> selectMlfrontAddressByuInfo(MlfrontAddress example);
    //查询后台登陆用户00
    List<MlfrontAddress> selectMlfrontAddressByuId(MlfrontAddress example);
    //查询后台登陆用户00
    List<MlfrontAddress> selectMlfrontAddressById(MlfrontAddress example);
    //查询全部登陆用户00
	List<MlfrontAddress> selectMlfrontAddressGetAll();
	
	MlfrontAddress selectMlfrontAddressByIp(String addressIp);
	
    
    
}