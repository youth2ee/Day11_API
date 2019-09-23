package com.naver.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest4 {

	public static void main(String[] args) {
		
		// 경품 추첨
		// 닭다리쿠션 40%, 최신핸드폰 10%, 은갈치넥타이 50%
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("최신핸드폰");
		
		for(int i=0;i<4;i++){
			ar.add("닭다리쿠션");
		}
		
		for(int i=0;i<5;i++) {
			ar.add("은갈치넥타이");
		}
		
		Random random = new Random();
		int num = random.nextInt(ar.size());
		System.out.println(ar.get(num));
	}

}
