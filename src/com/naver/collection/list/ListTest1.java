package com.naver.collection.list;

import java.util.ArrayList;

public class ListTest1 {

	public static void main(String[] args) {
		// 1,2,3
		// Arraylist : 데이터받아서 차례로 추가. 다른 데이터타입도 가능.
		//vs 배열 : 미리 칸을 정하고 시작해야된다. 같은 데이터타입만 묶는다.
	
		ArrayList ar = new ArrayList();
		
		//요소를 추가
		ar.add(1);// 인덱스 번호0 //add하면 칸수가 하나씩 늘어난다.
		ar.add(2);// 인덱스 번호1
		ar.add(3);// 인덱스 번호2
		ar.add("four"); //인덱스 번호3
		//모든 데이터타입을 담는다. 
		//이런식이면 하나 만들고 뒤에 하나씩 차례로 칸이 추가됨
		
		
		ar.add(1, "two"); //1번인덱스에  이 값을 추가해주세요
		//중간에 이 배열한칸이 추가되는것. 교체되는것 아니다.
		
		ar.set(1, "two"); //1번인덱스에 이 값으로 수정하세요
		//중간에 이 배열값으로 수정된다.
		
		ar.remove(1); //1번 배열이 아예 사라짐 
		
		//ar.clear(); //배열값이 사라짐.
		
		//int num = ar.get(0); //에러
		
	
		int num=10;
		Integer n =num; //auto boxing
		ar.add(num); 
		//사실 괄호안에 object타입(r타입)이어야 한다.
		//변수에 수를 넣어서 넣으면 원래 안됨. 
		num =(int) ar.get(0);
		String name = (String) ar.get(3);
		
		
		//빼기
		System.out.println(ar.get(0)); //1
		System.out.println(ar.get(1)); //2
		System.out.println(ar.get(2)); //3
		
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}

}
