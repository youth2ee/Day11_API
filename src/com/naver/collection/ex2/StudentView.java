package com.naver.collection.ex2;

import java.util.ArrayList;

public class StudentView {
	
	public void view (Student student) {
		//학생 정보 1명 출력
		//3번 눌렀을 때 실행된다.
		System.out.println("이름 : "+student.getName());
		System.out.println("번호 : "+student.getNum());
		System.out.println("국어 : "+student.getKor());
		System.out.println("영어 : "+student.getEng());
		System.out.println("수학 : "+student.getMath());
		System.out.println("합계 : "+student.getSum());
		System.out.println("평균 : "+student.getAvg());
	}
	
	public void view(ArrayList<Student> students) {
		//학생들의 정보를 전부출력
		//2번 눌렀을 때 실행된다.
		for(int i=0;i<students.size();i++) {
			System.out.println("이름 : "+students.get(i).getName());
			System.out.println("번호 : "+students.get(i).getNum());
			System.out.println("국어 : "+students.get(i).getKor());
			System.out.println("영어 : "+students.get(i).getEng());
			System.out.println("수학 : "+students.get(i).getMath());
			System.out.println("합계 : "+students.get(i).getSum());
			System.out.println("평균 : "+students.get(i).getAvg());
		}
	}
}
