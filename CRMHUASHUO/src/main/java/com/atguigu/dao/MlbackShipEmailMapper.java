package com.atguigu.dao;

import com.atguigu.bean.MlbackShipEmail;
import com.atguigu.bean.MlbackShipEmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackShipEmailMapper {
    long countByExample(MlbackShipEmailExample example);

    int deleteByExample(MlbackShipEmailExample example);

    int insert(MlbackShipEmail record);

    List<MlbackShipEmail> selectByExample(MlbackShipEmailExample example);

    MlbackShipEmail selectByPrimaryKey(Integer shipemailId);

    int updateByExampleSelective(@Param("record") MlbackShipEmail record, @Param("example") MlbackShipEmailExample example);

    int updateByExample(@Param("record") MlbackShipEmail record, @Param("example") MlbackShipEmailExample example);

    int updateByPrimaryKey(MlbackShipEmail record);
    
    
    //插入新地区价格模板
    int insertSelective(MlbackShipEmail record);
    //删除本条地区价格模板
    int deleteByPrimaryKey(Integer shipemailId);
    //更新本条地区价格模板
    int updateByPrimaryKeySelective(MlbackShipEmail record);
    //通过id查询查询
    List<MlbackShipEmail> selectMlbackShipEmailById(MlbackShipEmail record);
    //查询全部登陆用户00
	List<MlbackShipEmail> selectMlbackShipEmailGetAll();

	List<MlbackShipEmail> selectMlbackShowAreaByNumthAndStatus(MlbackShipEmail mlbackShowArea);
	//用值查询信息
	List<MlbackShipEmail> selectMlbackShipEmailByshipemailNameth(MlbackShipEmail mlbackShipEmail);
    
}