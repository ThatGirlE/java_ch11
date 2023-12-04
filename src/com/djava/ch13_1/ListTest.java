package com.djava.ch13_1;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		List<String> list1 = new ArrayList<String>(); // lists는 인터페이스(new연산자 바로만들수없다.). 자식클래스인 arraylist로
		
		list1.add("KOR");
		list1.add("jpn");
		list1.add("Usa");
		
		list1.size(); // list1에 저장된 객체의 수(length같은)
		
		
		System.out.println(list1.get(1)); // 인덱스
		
		list1.remove(1);
		
		for(int i=0; i<list1.size();i++) {
			System.out.println(list1.get(i));
		}
		
		
	}
	
}
