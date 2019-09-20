package com.naver.collection.ex2;

import java.util.ArrayList;

public class StudentView {
	
	public void view(ArrayList<Student> students) {
		
		//학생들의 정보를 전부출력
		//2번 눌렀을 때 실행된다.
		
		for(int i=0;i<students.size();i++) {
			System.out.println(students.get(i).getName());
			System.out.println(students.get(i).getNum());
			System.out.println(students.get(i).getKor());
			System.out.println(students.get(i).getEng());
			System.out.println(students.get(i).getEng());
			System.out.println(students.get(i).getSum());
			System.out.println(students.get(i).getAvg());
		}
		
	}

}
