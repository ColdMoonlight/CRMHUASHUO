package com.atguigu.dao;

import com.atguigu.bean.MlbackActShowPro;
import com.atguigu.bean.MlbackActShowProExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackActShowProMapper {
    long countByExample(MlbackActShowProExample example);

    int deleteByExample(MlbackActShowProExample example);

    int insert(MlbackActShowPro record);

    List<MlbackActShowPro> selectByExample(MlbackActShowProExample example);

    MlbackActShowPro selectByPrimaryKey(Integer actshowproId);

    int updateByExampleSelective(@Param("record") MlbackActShowPro record, @Param("example") MlbackActShowProExample example);

    int updateByExample(@Param("record") MlbackActShowPro record, @Param("example") MlbackActShowProExample example);

    int updateByPrimaryKey(MlbackActShowPro record);
    
    
    
    //插入新类目
    int insertSelective(MlbackActShowPro record);
    //删除本条
    int deleteByPrimaryKey(Integer groupId);
    //更新本条
    int updateByPrimaryKeySelective(MlbackActShowPro record);
    //查询后台登陆用户
    MlbackActShowPro selectMlbackActShowProById(MlbackActShowPro example);
    //查询全部登陆用户
	List<MlbackActShowPro> selectMlbackActShowProGetAll();

	List<MlbackActShowPro> selectMlbackActShowProByActnum(MlbackActShowPro mlbackActShowPro);
    
}