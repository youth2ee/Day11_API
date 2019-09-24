package com.naver.test;

import java.util.Calendar;

public class Machine {
	
	//콜라 선택시 콜라를 만든다.
	//메서드 1번선택
	public Cola makeCola() {
		Cola cola = new Cola();
		cola.setBrand("코카콜라");
		cola.setPrice(1500);
		cola.setCalendar(Calendar.getInstance());
		return cola;
	}

	//사이다 선택시 사이다 만든다.
	//메서드 2번선택
	public Cider makeCider(String brand, int price, Calendar calendar) {
		Cider cider = new Cider();
		//객체만들어서 무언갈 추가적으로 다루고 싶을때는 변수를 이용.
		cider.setBrand(brand);
		cider.setPrice(price);
		cider.setCalendar(calendar);
		
		return cider;
	}
	
	//물 선택시 물만들어 준다.
	//메서드 3번선택
	public Water makeWater() {
		return new Water();
		//바로 리턴. 만들어서 바로 주기만 한다. 이럴땐 변수 이용하지 않는다.
	}
	
	
}
