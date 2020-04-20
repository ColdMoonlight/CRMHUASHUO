package com.atguigu.dao;

import com.atguigu.bean.MlbackAreafreight;
import com.atguigu.bean.MlbackAreafreightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackAreafreightMapper {
    long countByExample(MlbackAreafreightExample example);

    int deleteByExample(MlbackAreafreightExample example);

    int insert(MlbackAreafreight record);

    List<MlbackAreafreight> selectByExample(MlbackAreafreightExample example);

    MlbackAreafreight selectByPrimaryKey(Integer areafreightId);

    int updateByExampleSelective(@Param("record") MlbackAreafreight record, @Param("example") MlbackAreafreightExample example);

    int updateByExample(@Param("record") MlbackAreafreight record, @Param("example") MlbackAreafreightExample example);

    int updateByPrimaryKey(MlbackAreafreight record);
    
    
    
    //插入新地区价格模板
    int insertSelective(MlbackAreafreight record);
    //删除本条地区价格模板
    int deleteByPrimaryKey(Integer areafreightId);
    //更新本条地区价格模板
    int updateByPrimaryKeySelective(MlbackAreafreight record);
    //查询后台登陆用户00
    List<MlbackAreafreight> selectMlbackAreafreightByAreafreightCountryEnglish(MlbackAreafreight example);
    //查询后台登陆用户00
    List<MlbackAreafreight> selectMlbackAreafreightById(MlbackAreafreight example);
  //查询后台登陆用户00
    List<MlbackAreafreight> selectMlbackAreafreightByEng(MlbackAreafreight example);
    //查询全部登陆用户00
	List<MlbackAreafreight> selectMlbackAreafreightGetAll();
}