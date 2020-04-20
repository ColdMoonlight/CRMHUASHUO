package com.atguigu.dao;

import com.atguigu.bean.MlbackVideo;
import com.atguigu.bean.MlbackVideoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackVideoMapper {
    long countByExample(MlbackVideoExample example);

    int deleteByExample(MlbackVideoExample example);

    int insert(MlbackVideo record);

    List<MlbackVideo> selectByExample(MlbackVideoExample example);

    MlbackVideo selectByPrimaryKey(Integer videoId);

    int updateByExampleSelective(@Param("record") MlbackVideo record, @Param("example") MlbackVideoExample example);

    int updateByExample(@Param("record") MlbackVideo record, @Param("example") MlbackVideoExample example);

    int updateByPrimaryKey(MlbackVideo record);
    
    
    
    
    //插入新类目
    int insertSelective(MlbackVideo record);
    //删除本条
    int deleteByPrimaryKey(Integer videoId);
    //更新本条
    int updateByPrimaryKeySelective(MlbackVideo record);
    //查询后台登陆用户
    MlbackVideo selectMlbackVideoById(MlbackVideo example);
    //查询全部登陆用户
	List<MlbackVideo> selectMlbackVideoGetAll();
	
	List<MlbackVideo> selectMlbackvideoByVideoAreaCount(MlbackVideo mlbackVideo);

	List<MlbackVideo> selectMlbackvideoByVideoArea(MlbackVideo mlbackVideo);
    
}