package com.naver.collection.map;

import java.util.HashMap;
import java.util.Iterator;

public class MapTest {

	public static void main(String[] args) {
		//map
		
		HashMap<String, Integer> map = new HashMap<String, Integer>(); 
		//일반적 key : string / value는 object
		//키는 무슨타입으로 할꺼고 value는 무슨값으로 할래
		// <> : generic - <>안의 이런 데이터타입을 모으자는 의미

		map.put("f1", 1);
		map.put("k1", 2);
		map.put("s1", 1); //값의 중복을 허용한다.
		
		System.out.println(map.get("f1")); //1
		System.out.println(map.get("k1")); //2
		System.out.println(map.get("s1")); //1		
		
		map.put("f1", 10);
		//다만 키값의 중복은 허용하지 않는다.
		//같은 키 값에 넣는다면 "수정"의 의미
		
		System.out.println(map.get("f1")); //10
		
		//반복문을 돌리기 위해서는 '키'를 알아내야 한다.
		//map에서 key꺼내서 iterator로 받기
		Iterator<String> it = map.keySet().iterator();
		
		//iterator의 다음이 있습니까? 있으면 true 없으면 false
		while(it.hasNext()) {
			
			String key = it.next();
			//하나씩 키값을 받는다.
			System.out.println(map.get(key));
			//map의 키값에는 순서가 없다.
			
			
		}
		
		
	}

}
