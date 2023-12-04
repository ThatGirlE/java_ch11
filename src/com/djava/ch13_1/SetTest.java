package com.djava.ch13_1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("홍길동");
		set.add("김유신");
		set.add("홍길동");
		set.add("이순신");
		
		// set은 인덱스가 없음
		Iterator<String> iterator = set.iterator();// iterlator 데이터를 가리키는 화살표같은
		
		while(iterator.hasNext()) {
			String result = iterator.next(); // 1개씩 객체를 반환함
			System.out.println(result);
			
		}
		
		
				
	}
	
}
