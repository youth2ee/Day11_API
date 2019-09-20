package com.naver.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {
	
	private ArrayList<Student> students;
	//students의 데이터타입 : ArrayList<Student>
	
	public StudentMenu() {
		students = new ArrayList<Student>();
	}
	
	public void start() {
		//1. 학생정보를 등록
		//2. 학생의 전체정보를 출력
		//3. 학생정보를 조회 이름으로
		//4. 학생정보를 삭제
		//5. 종료
		Scanner sc = new Scanner(System.in);
		
		StudentView sv = new StudentView();
		StudentService ss = new StudentService();
				
			System.out.println("1. 학생정보를 등록");
			System.out.println("2. 전체정보");
			System.out.println("3. 학생조회");
			System.out.println("4. 학생삭제");
			System.out.println("5. 종료");

			System.out.println("입력");
			int count = sc.nextInt();

			switch(count) {
			case 1:
				ss.studentInput(students);
				break;

			case 2:
				sv.view(students);
				break;

			case 3:
				break;

			case 4:
				break;

			case 5:

			} //switch
			

	
	}

}
