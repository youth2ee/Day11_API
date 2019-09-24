package com.naver.test;

import java.util.Calendar;
import java.util.Scanner;

public class Menu {
	
	private Machine machine;
	private Scanner sc;
	
	public Menu() {
		machine = new Machine();
		sc = new Scanner(System.in);
	}
	
	public void select() {

		/*
		Cola cola = machine.makeCola();
		Cider cider = machine.makeCider();
		Water water = machine.makeWater();
		*/
		//주는 메서드 void면 리턴받는게 없으므로, 받지 않는다.
		
		
		boolean check = true;
		//while(check) {
			System.out.println("1. 콜라");
			System.out.println("2. 사이다");
			System.out.println("3. 물");
			System.out.println("4. 종료");
		
			int select = sc.nextInt();
			Drink drink=null;
			//drink는 콜라, 사이다, 물을 모두 담을 수 있다.
			
			
			if(select==1) {
				drink = machine.makeCola();
			}else if(select==2) {
				drink = machine.makeCider("스프라이트",2000,Calendar.getInstance());
			}else if(select==3) {
				drink = machine.makeWater();
			}else {
				//break;
			}
			
			System.out.println(drink.getBrand());
			
			
			
		//} while
		
		
		
	}

}
