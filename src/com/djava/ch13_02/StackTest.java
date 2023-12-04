package com.djava.ch13_02;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		
		
		Stack<String> stack1 = new Stack<String>();
		
		stack1.push("홍길동");
		stack1.push("이순신");
		stack1.push("김유신");
		
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		
	}

}
