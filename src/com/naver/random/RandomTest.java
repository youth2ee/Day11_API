package com.naver.random;

import java.util.Random;

public class RandomTest {
 
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int num = random.nextInt();
		
		num = random.nextInt(20); //0~19 : 범위를 한정
		
		System.out.println(num);
		
		
		
	}
}
