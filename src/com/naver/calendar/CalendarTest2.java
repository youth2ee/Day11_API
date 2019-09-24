package com.naver.calendar;

import java.util.Calendar;

public class CalendarTest2 {

	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		System.out.println(year);

		calendar.set(calendar.YEAR, 2020);
		year = calendar.get(Calendar.YEAR);
		System.out.println(year);

		int d = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);

		//2020.9.25 목(5) -> 2020.11.24 화(3)
		
		calendar.set(calendar.MONTH,10);
		d = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(d);
		
		
		
		
	}

}
