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
	 * @Description: �жϼ����Ƿ�Ϊ��
	 * @return: void
	 */
	@Test
	public void testHasValue() {
		/**
		 * �ж�list�����Ƿ�Ϊ��
		 */
		List<Integer> list = new ArrayList<Integer>();
		/*list.add(10);*/
		boolean hasValue = CollectionUtil.hasValue(list);
		if(hasValue==false  ){
			System.out.println("list���ϲ��ǿյ�");
		}else{
			System.out.println("list�����ǿյ�");
		}
		/**
		 * �ж�set�����Ƿ�Ϊ��
		 */
		Set<Integer> set = new HashSet<Integer>();
		set.add(100);
		boolean hasValue2 = CollectionUtil.hasValue(set);
		if(hasValue2==false){
			System.out.println("set���ϲ��ǿյ�");
		}else{
			System.out.println("set�����ǿյ�");
		}
	}
	
}
