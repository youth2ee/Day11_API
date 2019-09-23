package com.naver.collection.generic;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductMain {

	public static void main(String[] args) {
		
		Tv tv = new Tv();
		Computer computer = new Computer();
		Notebook notebook = new Notebook();
		
		ArrayList<? extends Computer> ar = new ArrayList<Computer>();
		//Computer와 Computer를 상속받은 애들(Notebook)을 모을래
		
		//ar.add(computer);
		//ar.add(notebook);
		
		/*
		//<Generic> : 데이터타입에 제한을 둔다.
		ArrayList<Product> ar = new ArrayList<Product>();
		//product는 tv와 computer를 둘 다 받을 수 있다.
		
		ar.add(tv);
		ar.add(computer);
		
		ArrayList<Product> ar2 = new ArrayList<Product>();
		
		//arraylist 2개를 arraylist에 담을 수 있는가
		ArrayList<ArrayList<Product>> ar3 = new ArrayList<ArrayList<Product>>();
		
		//hashMap 사용
		HashMap<String, ArrayList<Product>> map = new HashMap<String, ArrayList<Product>>();
		*/
		
		
	}

}
