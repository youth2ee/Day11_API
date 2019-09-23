package com.naver.collection.ex4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.naver.StringTokenizer.ex1.Member;
import com.naver.collection.ex3.Weather;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class WeatherService {
	
	private StringBuffer sb;
	private StringTokenizer st;
	private Scanner sc;
	
	public WeatherService() {
		sc = new Scanner(System.in);
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejeon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		
	}
		
	//hashmap
	//1번 날씨정보초기화
	public HashMap<String, Weather> init() {
		st = new StringTokenizer(sb.toString(), "-");
		//키는 도시명, value는 날씨타입
		
		HashMap<String, Weather> map = new HashMap<String, Weather>();
	
		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			
			weather.setCity(st.nextToken().toUpperCase());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			
			map.put(weather.getCity(), weather);
		}
		return map;
	}
	
	//2번 날씨정보추가
	public void addWeather(HashMap<String, Weather> map) { //2번
		sc = new Scanner(System.in);

			Weather weather = new Weather();
			
			System.out.println("추가할 도시");
			weather.setCity(sc.next().toUpperCase());
			System.out.println("기온");
			weather.setGion(sc.nextDouble());
			System.out.println("습도");
			weather.setHumidity(sc.nextInt());
			System.out.println("상태");
			weather.setStatus(sc.next());
			
			map.put(weather.getCity(), weather);
	}
	
	//4번 지역날씨정보
	public Weather findWeather(HashMap<String, Weather> map) {
		sc = new Scanner(System.in);
		System.out.println("찾을 도시의 이름");
		String city = sc.next().toUpperCase();
		
		Weather weather = map.get(city); //city가 key값과 같은지 
	
		return weather;	
	}
	
	//5번 지역날씨삭제
	public Weather deleteWeather(HashMap<String, Weather> map) {
		//도시명을 입력받아 해당 웨더를 삭제
		//삭제가 될수도 안될수도.
		
		System.out.println("삭제할 도시의 이름");
		String city = sc.next().toUpperCase();
		
		Weather weather = map.remove(city);
	
		return weather;
	}

}
