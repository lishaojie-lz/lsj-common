package com.lsj.common.utils;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		String str="abc";
		boolean hasLength = StringUtil.hasLength(str);
		System.out.println(hasLength);
	}

	@Test
	public void testHasText() {
		String str=" ";
		boolean hasLength = StringUtil.hasText(str);
		System.out.println(hasLength);
	}

	@Test
	public void testRandomChineseString() {
		/*
		 * String string = StringUtil.randomChineseString(); System.out.println(string);
		 */
		String string = StringUtil.randomChineseString(500);
		System.out.println(string);
		
	}

	@Test
	public void testGenerateChineseName() {
		String string = StringUtil.generateChineseName();
		System.out.println(string);
	}



}
