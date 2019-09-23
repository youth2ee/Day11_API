package com.naver.collection.ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
	private Scanner sc;
	
	public StudentService() {
		sc = new Scanner(System.in);
	}

	public void studentInput(ArrayList<Student> students) {
		//학생의 정보를 저장
		
			Student student = new Student();

			System.out.println("이름");
			student.setName(sc.next());
			
			System.out.println("번호");
			student.setNum(sc.nextInt());

			System.out.println("국어");
			student.setKor(sc.nextInt());

			System.out.println("영어");
			student.setEng(sc.nextInt());

			System.out.println("수학");
			student.setMath(sc.nextInt());

			student.setSum(student.getKor()+student.getEng()+student.getMath());
			student.setAvg(student.getSum()/3);
			
			students.add(student);
			//students.add(index, element);
		
	}
	
	public Student studentSearch(ArrayList<Student> students) {
		
		System.out.println("찾을 학생의 이름");
		String name = sc.next();
		
		Student student = null;
		
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				student = students.get(i);
				break;
			}
		}
		return student;
	}
	
	public ArrayList<Student> studentDelete(ArrayList<Student> students, Student student) {
		System.out.println("삭제할 학생의 이름");
		String name = sc.next();
		//boolean check =true;
		
		// 배열과  student 한명의 주소값을 받아서 지우기
		students.remove(student);
		//student 한명의 주소값을 받아서 배열에서 지워줘. 
		//students.remove(student)값 자체는 boolean
		
		
		/* 배열 하나만 받아서 해결
		for(int i=0;i<students.size();i++) {
			if(students.get(i).getName().equals(name)) {
				students.remove(i);
				//students.remove(index)의 값 자체는 Student
				//check=true;
				break;
			}
			
			//return check; //트루면 지운거, 아니면 못지운거
		} */
		
		return students;
		
	}
	
	
}
