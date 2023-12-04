package com.djava.ch13_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {

		Map<String, Integer> map1 = new HashMap<String, Integer>();  // < > 안에는 class만 들어온다
		
		map1.put("나이", 25);   // 인덱스 없음
		map1.put("월급", 200);
		map1.put("연봉", 2400);
		
		System.out.println(map1.get("월급"));
		
		Set<String> KeySet = map1.keySet(); //중복이 되지 않는 key값		
		
		Iterator<String> iterator = KeySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			System.out.println(map1.get(key));
			
			
			

		
			
		}
		
	}

}
