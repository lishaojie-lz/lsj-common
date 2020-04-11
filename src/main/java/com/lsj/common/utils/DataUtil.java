package com.lsj.common.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil 
 * @Description: ���ڴ�����
 * @author:
 * @date: 2020��3��27�� ����8:58:06
 */
public class DataUtil {
	//��ʱ������������һ��ʱ��
	public static Date randomDate(Date startDate,Date endDate) {
		//��1970�굽startDate�ĺ�����
		long t1 = startDate.getTime();
		long t2 = endDate.getTime();
		if(t2<t1) {
			throw new RuntimeException("��ʼ���ڲ��ܴ��ڽ�������");
		}
		//�������һ����t1-t2֮��ĺ�����
		long t =(long)((Math.random()*(t2-t1))+t1);
		return new Date(t);
	}
	
	//���ش������ڵ��³�
	public static Date getInitMonth(Date date) {
		//��ȡ������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		c.set(Calendar.DAY_OF_MONTH, 1);//���������Ŀ�ʼ����Ϊ��һ��
		c.set(Calendar.HOUR_OF_DAY, 0);//�������0Сʱ
		c.set(Calendar.MINUTE, 0);//�������0����
		c.set(Calendar.SECOND, 0);//�������0��
		return c.getTime();
	}
	
	//���ش������ڵ���ĩ
	public static Date getEndMonth(Date date) {
		//��ȡ������
		Calendar c = Calendar.getInstance();
		//�ô�������ڳ�ʼ��������
		c.setTime(date);
		//��һ���·�-1��
		c.add(Calendar.MONTH, 1);
		Date initMonth = getInitMonth(c.getTime());
		//�ó�ʼ������,�ٴγ�ʼ��������
		c.setTime(initMonth);
		c.add(Calendar.SECOND, -1);
		return c.getTime();
	}
	
	//���ݳ�������������
	public static int getAgeByBirthday(Date birthday) {
		//��ȡ������
		Calendar c = Calendar.getInstance();
		int s_year = c.get(Calendar.YEAR);//��ȡϵͳ��,��,��
		int s_month = c.get(Calendar.MONTH);
		int s_date = c.get(Calendar.DAY_OF_MONTH);
		c.setTime(birthday);//�ó������ڳ�ʼ������
		int b_year = c.get(Calendar.YEAR);//��ȡ������,��,��
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
