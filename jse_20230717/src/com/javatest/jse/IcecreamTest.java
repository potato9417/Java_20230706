package com.javatest.jse;

public class IcecreamTest {
	
	public static void main(String[] args) {
		
		// 객체 생성
		Icecream icecream = new Icecream();
		
		// 객체의 멤버필드의 값 지정
		icecream.name = "tank-boy";
		
		System.out.println(icecream.name);
		// Icecream 클래스의 멤버 메서드 사용
		System.out.println(icecream.printIcecream(icecream.name));
	}

}
