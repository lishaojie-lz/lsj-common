package com.lsj.common.utils;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DataUtilTest {

	@Test
	public void testRandomDate() {
		SimpleDateFormat sFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.set(2010, 0, 0);
		for (int i = 0; i < 100; i++) {
			Date date = DataUtil.randomDate(c.getTime(),new Date());
			System.out.println(sFormat.format(date));
		}
	}

}
