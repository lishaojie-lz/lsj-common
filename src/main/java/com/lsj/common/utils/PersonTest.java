package com.lsj.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void testPerson() {
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			String name = StringUtil.generateChineseName();
			int age = RandomUtil.random(1, 120);
			String about = StringUtil.randomChineseString(140);
			Date date = new  Date();
			SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
			p.setName(name);
			p.setAge(age);
			p.setAbout(about);
			p.setCreated(sFormat.format(date));
			System.out.println(p);
		}
	}

}
