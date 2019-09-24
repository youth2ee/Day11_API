package com.naver.test;

public class God {

	private String name;
	private static God god;
	
	private God() {
	}
	
	//싱글톤(디자인패턴)
	public static God makeGod() { //static 붙으면 객체생성 안해도 됨
		if(God.god != null) {
			return God.god;
		}else { //객체생성은 null값인 경우 한번만 해준다.
			return new God();
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
