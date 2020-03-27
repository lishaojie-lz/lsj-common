package com.lsj.common.utils;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(1, 120);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] x = RandomUtil.subRandom(1, 10, 3);
		for (int i : x) {
			System.out.println(i);
		}
 	}

	@Test
	public void testRandomCharacter() {
		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	public void testRandomString() {
		String string =RandomUtil.randomString(4);
		System.out.println(string);
	}

}
