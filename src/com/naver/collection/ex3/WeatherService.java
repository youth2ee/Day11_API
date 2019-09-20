package com.naver.collection.ex3;

import java.util.StringTokenizer;

public class WeatherService {
	
	private StringBuffer sb;
	private StringTokenizer st;
	
	public WeatherService() {
		sb = new StringBuffer();
		sb.append("Seoul-17.2-60-흐림-");
		sb.append("Daejeon-29.9-20-맑음-");
		sb.append("Jeju-1.2-99-눈-");
		sb.append("Incheon-89-20-불");
		
	}
	
	//문자열 하나 파싱 토크나이저
	
	//메서드명 init
	//날씨정보를 파싱해서 저장한다. 
	//어레이리스트에 하나씩 한다.
	
	//메서드명 addWeather
	//날씨정보를 입력받아서 추가한다.
	//없는 지역을 직접 입력받아서 
	//지역 기온 습도 현재상태 를 스캐너로 입력받는다.
	//추가하는 것
	
	//메서드명 fineWeather
	//도시명을 입력받아서 해당 웨더객체를 찾는다. 
	
	public void init() { //1번
		String str =""; 
		str = sb.toString();
		st = new StringTokenizer(str, "-");
	}
	
	public void addWeather() { //2번
	
		
		
		
		
	}
	
	public void fineWeather() { //4번
		
	}

}
