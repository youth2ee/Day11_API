package com.naver.calendar;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest4 {
	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		Date d = new Date(); //현재시간
		System.out.println(d);
		
		d = calendar.getTime();
		System.out.println(d);
		
	}
	
}
