package com.atguigu.dao;

import com.atguigu.bean.MlbackEmail;
import com.atguigu.bean.MlbackEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackEmailMapper {
    long countByExample(MlbackEmailExample example);

    int deleteByExample(MlbackEmailExample example);

    int insert(MlbackEmail record);

    List<MlbackEmail> selectByExampleWithBLOBs(MlbackEmailExample example);

    List<MlbackEmail> selectByExample(MlbackEmailExample example);

    MlbackEmail selectByPrimaryKey(Integer emailId);

    int updateByExampleSelective(@Param("record") MlbackEmail record, @Param("example") MlbackEmailExample example);

    int updateByExampleWithBLOBs(@Param("record") MlbackEmail record, @Param("example") MlbackEmailExample example);

    int updateByExample(@Param("record") MlbackEmail record, @Param("example") MlbackEmailExample example);

    int updateByPrimaryKeyWithBLOBs(MlbackEmail record);

    int updateByPrimaryKey(MlbackEmail record);
    
    
    //插入新类目
    int insertSelective(MlbackEmail record);
    //删除本条
    int deleteByPrimaryKey(Integer emailId);
    //更新本条
    int updateByPrimaryKeySelective(MlbackEmail record);
    //查询单条信息
    List<MlbackEmail> selectMlbackEmailById(MlbackEmail example);
    //查询全部信息
	List<MlbackEmail> selectMlbackEmailGetAll();
	//查询全部信息除了富文本字段
	List<MlbackEmail> selectMlbackEmailGetAllEmpt();
    
}