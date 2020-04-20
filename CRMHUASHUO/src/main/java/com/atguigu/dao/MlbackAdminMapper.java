package com.atguigu.dao;

import com.atguigu.bean.MlbackAdmin;
import com.atguigu.bean.MlbackAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackAdminMapper {
    long countByExample(MlbackAdminExample example);

    int deleteByExample(MlbackAdminExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(MlbackAdmin record);

    List<MlbackAdmin> selectByExample(MlbackAdminExample example);

    MlbackAdmin selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") MlbackAdmin record, @Param("example") MlbackAdminExample example);

    int updateByExample(@Param("record") MlbackAdmin record, @Param("example") MlbackAdminExample example);

    int updateByPrimaryKeySelective(MlbackAdmin record);

    int updateByPrimaryKey(MlbackAdmin record);
    
    
    
    //查询后台登陆用户
    List<MlbackAdmin> selectMlbackAdmin(MlbackAdmin example);
    //查询全部登陆用户
	List<MlbackAdmin> selectMlbackAdminGetAll();
    //插入新用户
	int insertSelective(MlbackAdmin record);
}