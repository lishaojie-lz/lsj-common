package com.lsj.common.utils;
import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: �жϼ����Ƿ���ֵ
 * @author: ��С��
 * @date: 2020��3��26�� ����10:45:50
 */
public class CollectionUtil {
	/**
	 * @Title: hasValue 
	 * @Description: �ж��Ƿ���ֵ
	 * @param list
	 * @return
	 * @return: boolean
	 */
	public static boolean hasValue(Collection<?> condition){
		
		return condition==null || condition.isEmpty();
	}
}
