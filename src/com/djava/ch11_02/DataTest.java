package com.djava.ch11_02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataTest {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		System.out.println(now);
		String nowTime = now.toString();  // now 객체를 문자형으로
		
		SimpleDateFormat sip = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sip.format(now));
		
	}

}
