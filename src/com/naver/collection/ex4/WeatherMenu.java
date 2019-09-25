package com.naver.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.naver.collection.ex3.Weather;

public class WeatherMenu {

	private ArrayList<Weather> weathers;

	private Scanner sc;
	private WeatherService ws; //null이라는 데이터가 들어가 있음. 아직 객체 생성 전 단계. 
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
		HashMap<String, Weather> map = new HashMap<String, Weather>();

		while(check) {
			System.out.println("1. 날씨정보초기화");
			System.out.println("2. 날씨정보 추가");
			System.out.println("3. 전체 날씨정보");
			System.out.println("4. 지역 날씨정보");
			System.out.println("5. 지역 날씨삭제");
			System.out.println("6. 종료");

			int num = sc.nextInt();

			switch(num){
			case 1: //초기화
				map = ws.init();
				wv.view(map);
				break;

			case 2: //추가
				ws.addWeather(map);
				break;

			case 3: //전체검색
				wv.view(map);
				break;

			case 4: //지역검색
				Weather weather = ws.findWeather(map);
				if(weather != null) {
					wv.view(weather);
				} else {
					wv.view("해당지역의 정보가 없습니다.");
				}
				break;

			case 5: //삭제코드
				weather = ws.deleteWeather(map);
				if(weather != null) {
					wv.view("삭제성공");
				} else {
					wv.view("삭제실패");
				}
				break;

			case 6: //종료
				System.out.println("종료합니다.");
				check=!check;

			}


		}

	}
}
