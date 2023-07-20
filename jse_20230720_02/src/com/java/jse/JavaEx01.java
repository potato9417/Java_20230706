package com.java.jse;

public class JavaEx01 {

	public static void main(String[] args) {
		
		String str = "Java";
		
		// instanceof : 어떤 객체가 어느 클래스의 인스턴스인지 확인
		System.out.println(str instanceof String); // true
		System.out.println(str instanceof Object); // true
		// System.out.println(str instanceof StringBuilder); // 컴파일 에러(실행에러)
	}
}
