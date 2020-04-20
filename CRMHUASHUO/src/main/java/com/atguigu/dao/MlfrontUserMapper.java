package com.atguigu.dao;

import com.atguigu.bean.MlfrontUser;
import com.atguigu.bean.MlfrontUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlfrontUserMapper {
    long countByExample(MlfrontUserExample example);

    int deleteByExample(MlfrontUserExample example);

    int insert(MlfrontUser record);

    List<MlfrontUser> selectByExample(MlfrontUserExample example);

    MlfrontUser selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") MlfrontUser record, @Param("example") MlfrontUserExample example);

    int updateByExample(@Param("record") MlfrontUser record, @Param("example") MlfrontUserExample example);

    int updateByPrimaryKey(MlfrontUser record);
    
    
    //插入MlfrontUser00
    int insertSelective(MlfrontUser record);
    //删除MlfrontUser00
    int deleteByPrimaryKey(Integer userId);
    //更新updatePwdByEmail
    int updatePwdByEmail(MlfrontUser record);
    //更新MlfrontUser00
    int updateByPrimaryKeySelective(MlfrontUser record);
    //条件查询MlfrontUser00
    List<MlfrontUser> selectMlfrontUserByConditionS(MlfrontUser example);
    //全部查询MlfrontUser00
  	List<MlfrontUser> selectMlfrontUserGetAll();
  	
  	//通过时间查询MlfrontUser00
  	List<MlfrontUser> selectMlfrontUserByDate(MlfrontUser record);
  	
  	List<MlfrontUser> selectMlfrontUserWhenFirst(MlfrontUser example);
    
    
}