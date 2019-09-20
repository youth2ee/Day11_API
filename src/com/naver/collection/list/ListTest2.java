package com.naver.collection.list;

import java.util.ArrayList;

public class ListTest2 {

	public static void main(String[] args) {
		//ArrayList 만들기
		//E는 변수역할. 데이터타입을 담는 변수. 데이터타입을 선언.
		//이 arraylist에 어떤 타입을 받을지를, E 자리에 데이터타입을 넣어준다. 
		//꺼낼때 형변환 필요없어진다. 무조건 정해진 그 타입으로 받기 때문에
		//일반적으로 데이터타입을 선언하고 사용한다.
		// <>를 Generic이라고 한다. 
		
		ArrayList<String> ar = new ArrayList<>();
		//뒤<>는 생략가능
		
		ar.add("");
		String str = ar.get(0);
		
		//정수형을 담는 arrayList
		
		ArrayList<Integer> ar2 = new ArrayList<>();
		//int(primitive)를 넣으면 에러. reference형인 Integer를 써야 한다.
		
		ar2.add(1);
		
		
		

	}

}
