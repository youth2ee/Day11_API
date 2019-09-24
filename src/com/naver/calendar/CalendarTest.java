package com.naver.calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		//현재시간의 정보
		Calendar cal = Calendar.getInstance(); //new gregorianCalendar() 받아와라
		
		//get : 가지고 와라
		int hour= cal.get(Calendar.HOUR); //5 (12시간제)
		hour = cal.get(Calendar.HOUR_OF_DAY); //17 (24시간제)
		System.out.println(hour);
		
		int min = cal.get(Calendar.MINUTE);
		System.out.println(min);
		
		//연도
		int year = cal.get(Calendar.YEAR);
		System.out.println(year);
		
		year = cal.get(Calendar.DAY_OF_YEAR);
		System.out.println(year);
		
		year = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println(year);
	
		
		//월
		int mon = cal.get(Calendar.MONTH);
		System.out.println(mon); 
		//현재 9월 23일이지만 8월이라고 나온다.
		//0으로 시작해서 현재보다 1달 적은 달이 표시된다.
		//1월은 0, 2월은 1, 12월은 11이라고 표시된다.
		System.out.println(mon+1);
		//출력할때 +1해준다.
		
		//일
		int day = cal.get(Calendar.DATE);
		System.out.println(day);
		
		day = cal.get(Calendar.DAY_OF_WEEK); //그 주의 몇번째 날이냐
		System.out.println(day); //일요일이 1, 월요일이 2

	}

}
