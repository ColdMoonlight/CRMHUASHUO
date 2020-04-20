package com.atguigu.dao;

import com.atguigu.bean.MlbackCoupon;
import com.atguigu.bean.MlbackCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlbackCouponMapper {
    long countByExample(MlbackCouponExample example);

    int deleteByExample(MlbackCouponExample example);

    int insert(MlbackCoupon record);

    List<MlbackCoupon> selectByExample(MlbackCouponExample example);

    MlbackCoupon selectByPrimaryKey(Integer couponId);

    int updateByExampleSelective(@Param("record") MlbackCoupon record, @Param("example") MlbackCouponExample example);

    int updateByExample(@Param("record") MlbackCoupon record, @Param("example") MlbackCouponExample example);

    int updateByPrimaryKey(MlbackCoupon record);
    
    
    
    //插入新类目00
    int insertSelective(MlbackCoupon record);
    //删除本条00
    int deleteByPrimaryKey(Integer couponId);
    //更新本条00
    int updateByPrimaryKeySelective(MlbackCoupon record);
    //查询后台登陆用户00
    List<MlbackCoupon> selectMlbackCouponByConditionS(MlbackCoupon example);
    //查询后台登陆用户00
    List<MlbackCoupon> selectMlbackCouponBYCode(MlbackCoupon example);
    //查询全部登陆用户00
	List<MlbackCoupon> selectMlbackCouponGetAll();
	//查询全部登陆用户00
	List<MlbackCoupon> selectMlbackCouponBYAreaNum(MlbackCoupon mlbackCoupon);
	//查询全部生效中的可抽奖优惠券
	List<MlbackCoupon> selectMlbackCouponByLuckDrawType(MlbackCoupon mlbackCoupon);
    
}