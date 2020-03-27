package com.lsj.common.utils;
import java.util.Collection;

/**
 * 
 * @ClassName: CollectionUtil 
 * @Description: 判断集合是否有值
 * @author: 敷小衍
 * @date: 2020年3月26日 上午10:45:50
 */
public class CollectionUtil {
	/**
	 * @Title: hasValue 
	 * @Description: 判断是否有值
	 * @param list
	 * @return
	 * @return: boolean
	 */
	public static boolean hasValue(Collection<?> condition){
		
		return condition==null || condition.isEmpty();
	}
}
