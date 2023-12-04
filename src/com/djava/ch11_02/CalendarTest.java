package com.djava.ch11_02;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance();
		
		//Calendar now = new Calendar(); 추상클래스이므로 new 연산자 사용 불가
		
		int nowYear = now.get(Calendar.YEAR); // 현재 연도를 반환
		
		int month = now.get(Calendar.MONTH) + 1;
		
		System.out.println(month);
	}

}
