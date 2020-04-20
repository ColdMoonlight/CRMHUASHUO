package com.atguigu.dao;

import com.atguigu.bean.MlfrontUserTemporary;
import com.atguigu.bean.MlfrontUserTemporaryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlfrontUserTemporaryMapper {
    long countByExample(MlfrontUserTemporaryExample example);

    int deleteByExample(MlfrontUserTemporaryExample example);

    int insert(MlfrontUserTemporary record);

    List<MlfrontUserTemporary> selectByExample(MlfrontUserTemporaryExample example);

    MlfrontUserTemporary selectByPrimaryKey(Integer usertemporaryId);

    int updateByExampleSelective(@Param("record") MlfrontUserTemporary record, @Param("example") MlfrontUserTemporaryExample example);

    int updateByExample(@Param("record") MlfrontUserTemporary record, @Param("example") MlfrontUserTemporaryExample example);

    int updateByPrimaryKey(MlfrontUserTemporary record);
    
    
    //插入MlfrontUserTemporary
    int insertSelective(MlfrontUserTemporary record);
    //删除MlfrontUserTemporary
    int deleteByPrimaryKey(Integer userId);
    //更新MlfrontUserTemporary
    int updateByPrimaryKeySelective(MlfrontUserTemporary record);
    //条件查询MlfrontUserTemporary
    List<MlfrontUserTemporary> selectMlfrontUserTemporaryByIp(MlfrontUserTemporary example);
    //全部查询MlfrontUserTemporary
  	List<MlfrontUserTemporary> selectMlfrontUserTemporaryGetAll();
  	
    
}