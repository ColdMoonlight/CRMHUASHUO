package com.atguigu.dao;

import com.atguigu.bean.MlbackVideoShowArea;
import com.atguigu.bean.MlbackVideoShowAreaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackVideoShowAreaMapper {
    long countByExample(MlbackVideoShowAreaExample example);

    int deleteByExample(MlbackVideoShowAreaExample example);

    int insert(MlbackVideoShowArea record);

    List<MlbackVideoShowArea> selectByExample(MlbackVideoShowAreaExample example);

    MlbackVideoShowArea selectByPrimaryKey(Integer videoshowareaId);

    int updateByExampleSelective(@Param("record") MlbackVideoShowArea record, @Param("example") MlbackVideoShowAreaExample example);

    int updateByExample(@Param("record") MlbackVideoShowArea record, @Param("example") MlbackVideoShowAreaExample example);

    int updateByPrimaryKey(MlbackVideoShowArea record);

	
    //插入新类目
    int insertSelective(MlbackVideoShowArea record);
    //删除本条
    int deleteByPrimaryKey(Integer videoshowareaId);
    //更新本条
    int updateByPrimaryKeySelective(MlbackVideoShowArea record);
    //通过id查询本条
    MlbackVideoShowArea selectMlbackVideoShowAreaById(MlbackVideoShowArea example);
    //查询全部
	List<MlbackVideoShowArea> selectMlbackVideoShowAreaGetAll();

	List<MlbackVideoShowArea> selectMlbackVideoShowAreawapListByArea(MlbackVideoShowArea mlbackVideoShowArea);
	
	List<MlbackVideoShowArea> selectMlbackVideoShowAreapcListByArea(MlbackVideoShowArea mlbackVideoShowArea);
	
}