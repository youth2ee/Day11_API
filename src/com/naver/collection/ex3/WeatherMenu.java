package com.naver.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherMenu {
	
	private ArrayList<Weather> weathers;
	
	private Scanner sc;
	private WeatherService ws;
	private WeatherView wv;
	
	public WeatherMenu() {
		weathers = new ArrayList<Weather>();
		sc = new Scanner(System.in);
		ws = new WeatherService();
		wv = new WeatherView();
	}

	//메서드 명 start
	//실행되면 1. 날씨정보 초기화 -> service - init 메서드 실행
	//2. 날씨정보 추가 -> service - addWeather 메서드 실행 
	//3. 전체 날씨정보 -> WeatherView - view메서드 실행
	//4. 지역 날씨검색 -> 메서드 2개 실행 fineWeather 메서드 실행하고 view 메서드 실행
	//5. 프로그램 종료
	
	public void start() {
		
		boolean check = true;
		
		while(true) {
		System.out.println("1. 날씨정보초기화");
		System.out.println("2. 날씨정보 추가");
		System.out.println("3. 전체 날씨정보");
		System.out.println("4. 지역 날씨정보");
		System.out.println("5. 종료");
		
		int num = sc.nextInt();
		
		switch(num){
		case 1:
			ws.init(weathers);
			break;
			
		case 2:
			ws.addWeather(weathers);
			break;
			
		case 3:
			wv.view(weathers);
			break;
			
		case 4:
			Weather weather = ws.fineWeather(weathers);
			wv.view(weather);
			break;
			
		case 5:
		}
		
		
		}
		
	}
}
