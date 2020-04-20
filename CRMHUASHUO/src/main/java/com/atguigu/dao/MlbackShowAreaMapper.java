package com.atguigu.dao;

import com.atguigu.bean.MlbackShowArea;
import com.atguigu.bean.MlbackShowAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackShowAreaMapper {
    long countByExample(MlbackShowAreaExample example);

    int deleteByExample(MlbackShowAreaExample example);

    int insert(MlbackShowArea record);

    List<MlbackShowArea> selectByExample(MlbackShowAreaExample example);

    MlbackShowArea selectByPrimaryKey(Integer showareaId);

    int updateByExampleSelective(@Param("record") MlbackShowArea record, @Param("example") MlbackShowAreaExample example);

    int updateByExample(@Param("record") MlbackShowArea record, @Param("example") MlbackShowAreaExample example);

    int updateByPrimaryKey(MlbackShowArea record);
    
    
    //插入新地区价格模板
    int insertSelective(MlbackShowArea record);
    //删除本条地区价格模板
    int deleteByPrimaryKey(Integer showareaId);
    //更新本条地区价格模板
    int updateByPrimaryKeySelective(MlbackShowArea record);
    //查询后台登陆用户00
    List<MlbackShowArea> selectMlbackShowAreaById(MlbackShowArea example);
    //查询全部登陆用户00
	List<MlbackShowArea> selectMlbackShowAreaGetAll();

	List<MlbackShowArea> selectMlbackShowAreaByNumthAndStatus(MlbackShowArea mlbackShowArea);
    
}