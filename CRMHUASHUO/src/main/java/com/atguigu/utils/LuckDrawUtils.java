package com.atguigu.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import com.atguigu.Vo.LuckDrawDate;
import com.atguigu.bean.MlbackCoupon;

public class LuckDrawUtils {

	final static int num = 100;
	
	/**
	 * 随机生成id
	 * @return
	 */
	public static LuckDrawDate getLuckDrawDate(List<MlbackCoupon> mlbackCouponResList)  throws Exception{

		//调取可以抽奖的接口，拿到八个的权重
		
		double d = (int)(Math.random()*num+1);//因为不需要0，所以需要加1
		
		//System.out.println(d);

		List<LuckDrawDate> LuckDrawDateList = new ArrayList<LuckDrawDate>();
		
		for(MlbackCoupon mlbackCouponOne:mlbackCouponResList){
			
			LuckDrawDate luckDrawDateOne = new LuckDrawDate();
			
			Integer CouponId = mlbackCouponOne.getCouponId();
			
			Integer CouponLuckDrawWeight =mlbackCouponOne.getCouponLuckDrawWeight();
			
			String CouponCode = mlbackCouponOne.getCouponCode();
			
			luckDrawDateOne.setLuckDrawCouponId(CouponId);
			luckDrawDateOne.setLuckDrawCouponCode(CouponCode);
			
			for(int i=0;i<CouponLuckDrawWeight;i++){
				LuckDrawDateList.add(luckDrawDateOne);
			}
		}
		
		//System.out.println("LuckDrawDateList.size():"+LuckDrawDateList.size());
		
		Integer num = getRandomNumber();
		
		LuckDrawDate luckDrawDateRes = LuckDrawDateList.get(num-1);
		//System.out.println("luckDrawDateRes:"+luckDrawDateRes.toString());
		
		return luckDrawDateRes;
	}
	
	private static Integer getRandomNumber() {
		
		Random r = new Random();
		int d = r.nextInt(num)+1;
		//System.out.println(d);
		
		return d;
	}

}
