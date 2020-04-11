package com.lsj.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: 日期处理类
 * @author:
 * @date: 2020年3月27日 上午8:58:06
 */
public class DataUtil {
	//在时间段内随机产生一个时间
	public static Date randomDate(Date startDate,Date endDate) {
		//从1970年到startDate的毫秒数
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		if(t2<t1) {
			throw new RuntimeException("开始日期不能大于结束日期");
		}
		//随机产生一个在t1-t2之间的毫秒数
		long t =(long)((Math.random()*(t2-t1))+t1);
		return new Date(t);
	}
	
	//返回传入日期的月初
	public static Date getInitMonth(Date date) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);//设置日历的开始日期为第一天
		c.set(Calendar.HOUR_OF_DAY, 0);//设置天的0小时
		c.set(Calendar.MINUTE, 0);//设置天的0分钟
		c.set(Calendar.SECOND, 0);//设置天的0秒
		return c.getTime();
	}
	
	//返回传入日期的月末
	public static Date getEndMonth(Date date) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		//用传入的日期初始化日历类
		c.setTime(date);
		//加一个月份-1秒
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		//用初始化日期,再次初始化日历类
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	//根据出身年月算年龄
	public static int getAgeByBirthday(Date birthday) {
		//获取日历类
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);//获取系统年,月,日
		int s_month = c.get(Calendar.MONTH);
		int s_date = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);//用出生日期初始日历类
		int b_year = c.get(Calendar.YEAR);//获取出生年,月,日
		int b_month = c.get(Calendar.MONTH);
		int b_date = c.get(Calendar.DAY_OF_MONTH);
		int age = s_year - b_year;
		if(s_month<b_month) {
			age = age-1;
		}
		if(s_month==b_month && s_date<b_date) {
			age = age-1;
		}
		return age;
	}
}
