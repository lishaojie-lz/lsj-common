package com.lsj.common.utils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class CollectionUtilTest {

	/**
	 * 
	 * @Title: testHasValue 
	 * @Description: 判断集合是否为空
	 * @return: void
	 */
	@Test
	public void testHasValue() {
		/**
		 * 判断list集合是否为空
		 */
		List<Integer> list = new ArrayList<Integer>();
		/*list.add(10);*/
		boolean hasValue = CollectionUtil.hasValue(list);
		if(hasValue==false  ){
			System.out.println("list集合不是空的");
		}else{
			System.out.println("list集合是空的");
		}
		/**
		 * 判断set集合是否为空
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		boolean hasValue2 = CollectionUtil.hasValue(set);
		if(hasValue2==false){
			System.out.println("set集合不是空的");
		}else{
			System.out.println("set集合是空的");
		}
	}
	
}
