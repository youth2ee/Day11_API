package com.naver.calendar;

import java.util.Calendar;

public class CalendarTest5 {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance(); //현재시간
		//int h = calendar.get(Calendar.HOUR_OF_DAY);
		Long l1 = calendar.getTimeInMillis(); //현재시간을 long타입의 숫자로 바꿔준다.
		//->random()의 매개변수로 이용가능
		//1초는  1000 millisecond
		System.out.println(l1);
		
		Calendar calendar2 = Calendar.getInstance(); //5시간 뒤
		calendar2.add(Calendar.HOUR_OF_DAY, 50); //5시간을 더해준다.
		//int h2 = calendar2.get(Calendar.HOUR_OF_DAY);
		long l2 = calendar2.getTimeInMillis();
		System.out.println(l2);
		
		//System.out.println(h2-h);
		System.out.println(l2-l1);
		long l3 = l2-l1;
		System.out.println(l3/1000);//82800초
		System.out.println(l3/(1000*60));//1380분
		System.out.println(l3/(1000*60*60));//23시간
		System.out.println(l3/(1000*60*60*24)+"일");//날짜
		
		long l4 =l3%(1000*60*60*24);
		System.out.println(l4/(1000*60*60)+"시간");
		
		
		
		
		

	}

}
