package com.atguigu.dao;

import com.atguigu.bean.MlbackCountDown;
import com.atguigu.bean.MlbackCountDownExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackCountDownMapper {
    long countByExample(MlbackCountDownExample example);

    int deleteByExample(MlbackCountDownExample example);

    int insert(MlbackCountDown record);

    List<MlbackCountDown> selectByExample(MlbackCountDownExample example);

    MlbackCountDown selectByPrimaryKey(Integer countdownId);

    int updateByExampleSelective(@Param("record") MlbackCountDown record, @Param("example") MlbackCountDownExample example);

    int updateByExample(@Param("record") MlbackCountDown record, @Param("example") MlbackCountDownExample example);

    int updateByPrimaryKey(MlbackCountDown record);
    
    //插入新的一条
    int insertSelective(MlbackCountDown record);
    //删除本条
    int deleteByPrimaryKey(Integer countdownId);
    //更新本条
    int updateByPrimaryKeySelective(MlbackCountDown record);
    //查询OneById
    MlbackCountDown selectMlbackCountDownById(MlbackCountDown example);
    //查询All
	List<MlbackCountDown> selectMlbackCountDownGetAll();
}