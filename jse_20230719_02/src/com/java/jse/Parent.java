package com.java.jse;

public class Parent {
	
	String skill01 = "자바 프로그래밍 기술-01";
	String skill02 = "자바 프로그래밍 기술-02";
	static String skill03 = "자바프로그래밍 기술-03";
	
	// 자식클래스에서 호출하지않아도 자동 호출
	Parent(){
		System.out.println("부모 생성자");
	}

}
