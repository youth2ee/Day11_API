package com.naver.StringTokenizer.ex1;

import java.util.StringTokenizer;

public class MemberMaker {
	
	private String memberInfo;
	
	public MemberMaker() {
		this.memberInfo = "pooh-pooh-12-donkey-donkey-10-piglet-piglet-20";
	}
	
	public void makeMember() {
		//멤버인포의 내용을 파싱해서
		//멤버객체를 생성해서 모든 정보를 출력하세요
		
		//split
		/*
		String [] info = memberInfo.split("-");
		for(int i=0;i<info.length;i++) {
			Member member = new Member();
			member.setId(info[i]);
			member.setName(info[++i]);
			member.setAge(info[++i]);
		}
		*/
		
		//tokenizer
		StringTokenizer st = new StringTokenizer(this.memberInfo,"-");
		Member [] members = new Member[3]; 
		int index=0;
		
		while(st.hasMoreTokens()) {
			Member member = new Member();
			
			member.setId(st.nextToken());
			member.setName(st.nextToken());
			member.setAge(Integer.parseInt(st.nextToken()));
			
			members[index] = member;
			index++;
		}//while
		
		for(int i=0; i<members.length;i++) {
			System.out.println("Id : "+members[i].getId());
			System.out.println("Name : "+members[i].getName());
			System.out.println("Age : "+members[i].getAge());
		}//for

	}//makeMember
	
	

	}


