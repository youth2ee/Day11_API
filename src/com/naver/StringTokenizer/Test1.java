package com.naver.StringTokenizer;

import java.util.ArrayList;
//ArrayList 클래스의 위치
import java.util.StringTokenizer; 
//StringTokenizer 클래스의 위치

//-> jva.util의 모든 클래스를 가져오려면
import java.util.*;
//다만, java 전체를 한꺼번에 가져올 수는 없다. 패키지명까지는 써야한다.


//패키지의 이름이 다르면, 동명의 클래스 이름 가능.

//import com.naver.m1.Member;
//m1패키지의 Member 클래스의 위치

//import com.naver.m2.Member; //에러 
//동일한 이름의 클래스명을 쓰고 싶다면
//하나는 import 못쓰고 본문에 주소를 다 써줘야 한다.

public class Test1 {

	public static void main(String[] args) {

		String str = "iu,27,pooh,10,donkey,15,piglet,20";

		//Member m1 = new Member();
		//m1
		
		//com.naver.m2.Member m2 =  new com.naver.m2.Member();
		//m2
		
		StringTokenizer st = new StringTokenizer(str, ","); //클래스 
		//일단 자기의 패키지 안에서 그 이름의 클래스를 찾는데
		//자기의 패키지 안에 없으면 다른 패키지에서 찾는다.
		//위의 부분에 import가 자동으로 생성되어 불러와준다.

		//몇번 쪼갤지 모르므로 while문
		while(st.hasMoreTokens()) {
			//st.hasMoreTokens() : 남은 토큰이 있으면 true 없으면 false
			
			String s = st.nextToken(); //문자열 자르는 메서드 
			//"iu"
			String age = st.nextToken(); //여러번 자를 수 있다. //한번 돌때 2번씩 자를 수 있다.
			//그다음 ,찾는다. "27"
			
			System.out.println(s);
			
		}



	}

}
