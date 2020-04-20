package com.atguigu.dao;

import com.atguigu.bean.MlbackProductSku;
import com.atguigu.bean.MlbackProductSkuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackProductSkuMapper {
    long countByExample(MlbackProductSkuExample example);

    int deleteByExample(MlbackProductSkuExample example);

    int insert(MlbackProductSku record);

    List<MlbackProductSku> selectByExample(MlbackProductSkuExample example);

    MlbackProductSku selectByPrimaryKey(Integer productskuId);

    int updateByExampleSelective(@Param("record") MlbackProductSku record, @Param("example") MlbackProductSkuExample example);

    int updateByExample(@Param("record") MlbackProductSku record, @Param("example") MlbackProductSkuExample example);

    int updateByPrimaryKey(MlbackProductSku record);
    
    
    //插入新类目00
    int insertSelective(MlbackProductSku record);
    //删除本条00
    int deleteByPrimaryKey(Integer groupId);
    //更新本条00
    int updateByPrimaryKeySelective(MlbackProductSku record);
    //查询后台登陆用户00
    List<MlbackProductSku> selectMlbackProductSkuByProductId(MlbackProductSku example);
  //查询后台登陆用户00
    List<MlbackProductSku> selectMlbackProductSkuByProductIdAndStatus(MlbackProductSku example);
    //查询全部登陆用户00
	List<MlbackProductSku> selectMlbackProductGetAll();
    
}