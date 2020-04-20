package com.atguigu.dao;

import com.atguigu.bean.MlbackFootNav;
import com.atguigu.bean.MlbackFootNavExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackFootNavMapper {
    long countByExample(MlbackFootNavExample example);

    int deleteByExample(MlbackFootNavExample example);

    int insert(MlbackFootNav record);

    List<MlbackFootNav> selectByExampleWithBLOBs(MlbackFootNavExample example);

    List<MlbackFootNav> selectByExample(MlbackFootNavExample example);

    MlbackFootNav selectByPrimaryKey(Integer footnavId);

    int updateByExampleSelective(@Param("record") MlbackFootNav record, @Param("example") MlbackFootNavExample example);

    int updateByExampleWithBLOBs(@Param("record") MlbackFootNav record, @Param("example") MlbackFootNavExample example);

    int updateByExample(@Param("record") MlbackFootNav record, @Param("example") MlbackFootNavExample example);

    int updateByPrimaryKeyWithBLOBs(MlbackFootNav record);

    int updateByPrimaryKey(MlbackFootNav record);
    
    
    //插入新类目00
    int insertSelective(MlbackFootNav record);
    //删除本条00
    int deleteByPrimaryKey(Integer couponId);
    //更新本条00
    int updateByPrimaryKeySelective(MlbackFootNav record);
    //查询后台登陆用户00
    List<MlbackFootNav> selectMlbackFootNavById(MlbackFootNav example);
    //查询后台登陆用户00
    List<MlbackFootNav> selectMlbackFootNavOneAllById(MlbackFootNav example);
    //查询全部登陆用户00
	List<MlbackFootNav> selectMlbackFootNavGetAll();

	List<MlbackFootNav> selectMlbackFootNavAllIfShow(MlbackFootNav mlbackFootNav);

	//简单查询底部导航
	List<MlbackFootNav> selectMlbackFootNavAllSimpleIfShow(MlbackFootNav mlbackFootNav);
    
}