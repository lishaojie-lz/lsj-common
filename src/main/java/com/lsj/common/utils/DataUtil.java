package com.lsj.common.utils;

import java.util.Date;

/**
 * 
 * @ClassName: DataUtil 
 * @Description: 日期处理类
 * @author: 敷小衍
 * @date: 2020年3月27日 上午8:56:56
 */
public class DataUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: 产生随机的俩个日期
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate){
		long t1 = startDate.getTime();//从1970年到startDate 的毫秒数
		long t2 = endDate.getTime();//从1970年到endDate 的毫秒数
		if(t2<t1){
			throw new RuntimeException("参数异常：开始日期不能大于结束日期");
		}
		//随机产生一个t1到t2之间的毫秒数
		long t = (long) ((Math.random()*(t2-t1+1))+t1);
		return new Date(t);
		
	}
}
