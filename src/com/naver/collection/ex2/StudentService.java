package com.naver.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

	public ArrayList<Student> studentInput(ArrayList<Student> students) {
		//학생의 정보를 저장

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<students.size();i++) {
			Student student = new Student();

			System.out.println("이름");
			student.setName(sc.next());

			System.out.println("국어");
			student.setKor(sc.nextInt());

			System.out.println("영어");
			student.setEng(sc.nextInt());

			System.out.println("수학");
			student.setMath(sc.nextInt());

			students.add(student);
		}

		return students;
	}
}
