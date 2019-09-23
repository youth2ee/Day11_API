package com.naver.random;

import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		//로또번호 뽑기
		//1~45 : 6개 뽑기

		Random random = new Random();

		for(int i=0;i<6;i++) {
			int num = random.nextInt(46); //0~45 까지 범위를 한정
			if(num!=0) { //0은 나올 수 없다.
				System.out.println(num);
			} else {
				continue;	
			}
		}
	}

}
