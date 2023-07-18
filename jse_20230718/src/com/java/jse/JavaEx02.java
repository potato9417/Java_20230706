package com.java.jse;

public class JavaEx02 {

	// 비정적 멤버 필드
	String name;
	// 정적 멤버 필드
	static String name1;
	
	// 정적(static) 멤버 필드 <= 비정적(non-static)필드(= 인스턴스 멤버 필드) 대입 불가
	// static String name2 = name; // 오류
	
	// 정적 멤버 필드 <= 정적 필드 대입 가능
	static String name2 = name1; // 가능
	
	// 정적 멤버 메서드
	public static void main(String[] args) {
		
		// 정적 멤버 메서드 <= 비정적 필드 대입 불가
		// System.out.println(name); // 오류
		
		// 정적 멤버 메서드 <= 정적 필드 대입 가능
		System.out.println(name1); // 가능
	}
	
}