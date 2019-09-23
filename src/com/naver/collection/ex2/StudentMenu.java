package com.naver.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentMenu {

	private ArrayList<Student> students;
	//students의 데이터타입 : ArrayList<Student>

	private StudentView sv;
	private StudentService ss;
	private Scanner sc;

	public StudentMenu() {
		students = new ArrayList<Student>();
		sv = new StudentView();
		ss = new StudentService();
		sc = new Scanner(System.in);
	}

	public void start() {
		//1. 학생정보를 등록
		//2. 학생의 전체정보를 출력
		//3. 학생정보를 조회 이름으로
		//4. 학생정보를 삭제
		//5. 종료

		boolean check = true;

		while(check) {
			System.out.println("1. 학생정보를 등록");
			System.out.println("2. 전체정보");
			System.out.println("3. 학생조회");
			System.out.println("4. 학생삭제");
			System.out.println("5. 종료");

			System.out.println("몇번할래?");
			int count = sc.nextInt();

			switch(count) {
			case 1:
				ss.studentInput(students);
				break;

			case 2:
				sv.view(students);
				break;

			case 3:
				Student student = ss.studentSearch(students);
				sv.view(student);
				break;

			case 4:
				//switch문은 Student student를 다시선언 할 수 없다.
				//혹시 니가 case 3의 break를 없앨수도 있으니까 
				//if else문에서는 각자 선언가능
				student = ss.studentSearch(students);
				ss.studentDelete(students, student);
				
				break;

			case 5:
				System.out.println("종료합니다.");
				check=!check;

			} //switch
		}
	}
}
