package com.naver.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.naver.collection.ex3.Weather;

public class WeatherView {
	
	public void view (String str) {
		System.out.println(str);
	}
	
	
	//한 지역의 날씨 정보를 출력
	public void view(Weather weather) {
		System.out.println("도시 : "+weather.getCity());
		System.out.println("기온 : "+weather.getGion());
		System.out.println("습도 : "+weather.getHumidity());
		System.out.println("상태 : "+weather.getStatus());
		System.out.println("================");
		
	}
	
	//전체지역의 날씨정보를 hashMap으로 출력
	public void view(HashMap<String, Weather> map) {
		//1단계. key들을 모을 key와 동일한 데이터타입의 iterator 생성
		Iterator<String> it = map.keySet().iterator();
		//key들을 keyset으로 열거형으로 만들어준다.
		
		//2단계. 
		while(it.hasNext()) {
			String key = it.next();
			//iterator의 첫번째를 꺼낸다.
			Weather weather = map.get(key);
			//꺼낸 키로 맵의 value를 꺼낸다.
			
			System.out.println(weather.getCity());
			System.out.println(weather.getGion());
			System.out.println(weather.getHumidity());
			System.out.println(weather.getStatus());
			System.out.println("================");
		}
	
	}
	
}
