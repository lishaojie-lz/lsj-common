package com.lsj.common.utils;

import java.util.Date;

/**
 * 
 * @ClassName: DataUtil 
 * @Description: ���ڴ�����
 * @author: ��С��
 * @date: 2020��3��27�� ����8:56:56
 */
public class DataUtil {
	/**
	 * 
	 * @Title: randomDate 
	 * @Description: �����������������
	 * @param startDate
	 * @param endDate
	 * @return
	 * @return: Date
	 */
	public static Date randomDate(Date startDate,Date endDate){
		long t1 = startDate.getTime();//��1970�굽startDate �ĺ�����
		long t2 = endDate.getTime();//��1970�굽endDate �ĺ�����
		if(t2<t1){
			throw new RuntimeException("�����쳣����ʼ���ڲ��ܴ��ڽ�������");
		}
		//�������һ��t1��t2֮��ĺ�����
		long t = (long) ((Math.random()*(t2-t1+1))+t1);
		return new Date(t);
		
	}
}
