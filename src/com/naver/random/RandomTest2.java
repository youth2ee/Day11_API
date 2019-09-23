package com.naver.random;

import java.util.ArrayList;
import java.util.Random;

public class RandomTest2 {

	public static void main(String[] args) {
		//로또번호 뽑기
		//1~45 : 6개 뽑기

		Random random = new Random();
		ArrayList<Integer> ar = new ArrayList<>();

		/*
		for(int i=0;i<6;i++) {
			int num = random.nextInt(46); //0~45 까지 범위를 한정
			if(num!=0) {//0은 나올 수 없다.
				ar.add(num);
			} else {
				i--; //0이 나오면 뽑지않고 i가 하나 증가하므로 빼줌
				continue;	
			}*/

		for(int i=0;i<6;i++) {
			int num = random.nextInt(45)+1; 
			//0~44 까지 범위를 한정하고 +1을 해준다. -> 1~45
			ar.add(num);

			for(int j=0;j<i;j++) {
				if (ar.get(j)==num) {
					i--;
					ar.remove(j);
					break;
				}
			}
		}//for문

		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}

	}//메인메서드
}//클래스
