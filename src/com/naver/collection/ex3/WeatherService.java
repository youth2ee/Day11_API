package com.naver.collection.ex3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

import com.naver.StringTokenizer.ex1.Member;
import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class WeatherService {
	
	private StringBuffer sb;
	private StringTokenizer st;
	private Scanner sc;
	
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
	
	public void init(ArrayList<Weather> weathers) { //1번
		//sb는 stringbuffer타입
		//st는 string타입
		//stringTokenizer는 string타입을 요하므로,
		//stringbuffer를 string으로 바꿔준다.
		
		//String str =""; 
		//str = sb.toString();
		//st = new StringTokenizer(str, "-");
		st = new StringTokenizer(sb.toString(), "-");
		
		while(st.hasMoreTokens()) {
			Weather weather = new Weather();
			
			weather.setCity(st.nextToken().toUpperCase());
			weather.setGion(Double.parseDouble(st.nextToken()));
			weather.setHumidity(Integer.parseInt(st.nextToken()));
			weather.setStatus(st.nextToken());
			
			weathers.add(weather);
		}
	}
	
	public void addWeather(ArrayList<Weather> weathers) { //2번
		sc = new Scanner(System.in);

			Weather weather = new Weather();
			
			System.out.println("추가할 도시");
			weather.setCity(sc.next().toUpperCase());
			System.out.println("기온");
			weather.setGzion(sc.nextDouble());
			System.out.println("습도");
			weather.setHumidity(sc.nextInt());
			System.out.println("상태");
			weather.setStatus(sc.next());
			
			weathers.add(weather);		
	}//2
	
	public Weather fineWeather(ArrayList<Weather> weathers) { //4번
		sc = new Scanner(System.in);
		
		System.out.println("찾을 도시의 이름");
		String city = sc.next().toUpperCase();
		
		Weather weather = null;
		
		for(int i=0;i<weathers.size();i++) {
			if(weathers.get(i).getCity().equals(city)) {
				weather = weathers.get(i);
				break;
			}
		}
		return weather;
		
		
		
	}//4

}
