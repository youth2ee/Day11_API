package com.naver.calendar;

import java.util.Calendar;

public class CalendarTest3 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //현재시간을 받을래
		//택배 배달 : 실행시점부터 2일뒤에 배송예정. 현재의 년월일하고 2일뒤의 년월일을 찍으려고 한다.
		//오늘은 언제고 배달완료일은 언제니
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH)+1;
		int day = calendar.get(Calendar.DATE); //9월 24일
		System.out.println(year+"/"+month+"/"+day);
		
		calendar.set(Calendar.DATE, day+2); //9월 26일
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DATE);
		System.out.println(year+"/"+month+"/"+day);
		
		calendar.set(Calendar.DATE, day+10); //10월 6일
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DATE);
		System.out.println(year+"/"+month+"/"+day);
		
		//roll
		calendar.roll(Calendar.DATE, 2); //10월 8일 //'일'만 바뀜
		day = calendar.get(Calendar.DATE);
		System.out.println(year+"/"+month+"/"+day);
		
		//add
		calendar.add(Calendar.DATE, 50); //11월 27일 //'일', '월'까지 바뀜
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DATE);
		System.out.println(year+"/"+month+"/"+day);
		
		
		
		
		
		
	}

}
