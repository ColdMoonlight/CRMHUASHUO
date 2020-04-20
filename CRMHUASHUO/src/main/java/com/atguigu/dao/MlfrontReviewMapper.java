package com.atguigu.dao;

import com.atguigu.bean.MlfrontReview;
import com.atguigu.bean.MlfrontReviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MlfrontReviewMapper {
    long countByExample(MlfrontReviewExample example);

    int deleteByExample(MlfrontReviewExample example);

    int insert(MlfrontReview record);

    List<MlfrontReview> selectByExample(MlfrontReviewExample example);

    MlfrontReview selectByPrimaryKey(Integer reviewId);

    int updateByExampleSelective(@Param("record") MlfrontReview record, @Param("example") MlfrontReviewExample example);

    int updateByExample(@Param("record") MlfrontReview record, @Param("example") MlfrontReviewExample example);

    int updateByPrimaryKey(MlfrontReview record);
    
    
    //插入新类目00
    int insertSelective(MlfrontReview record);
    //删除本条00
    int deleteByPrimaryKey(Integer reviewId);
    //更新本条00
    int updateByPrimaryKeySelective(MlfrontReview record);
    //通过id查询
    List<MlfrontReview> selectMlfrontReviewById(MlfrontReview example);
    //查询全部
    List<MlfrontReview> selectMlfrontReviewGetAll();
    //查询一个产品下的全部review
	List<MlfrontReview> selectMlfrontReviewListByPId(MlfrontReview mlfrontReview);
	//条件搜索selectMlfrontReviewListBySearch
	List<MlfrontReview> selectMlfrontReviewListBySearch(MlfrontReview mlfrontReview);
	//查询从不同来源的地方selectReviewListFrom
	List<MlfrontReview> selectReviewListFrom(MlfrontReview mlfrontReview);
	
}