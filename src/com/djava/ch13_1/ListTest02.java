package com.djava.ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {

	public static void main(String[] args) {
	
	Member member1 = new Member("홍길동", 27, "010-8888-1234", "경기도 하남시");
	Member member2 = new Member("이순신", 31, "010-9999-1234", "서울 용산구");
	Member member3 = new Member("김유신", 45, "010-7777-1234", "경기도 분당");
	
	// 리스트이 이름 memberlist
	ArrayList<Member> memberList = new ArrayList<Member>();    // 객체들을 한세트로 만드는게 리스트
	
	
	memberList.add(member1);
	memberList.add(member2);
	memberList.add(member3);
	
	System.out.println(memberList);
	
	
	
	}
	
	
}
