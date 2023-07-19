package com.java.jse;

public class Child extends Parent {
	
	String skill02 = "JSP 프로그래밍 기술";
	
	void exec() {
		
		// 상속받았기때문에 사용가능
		System.out.println(super.skill01);
		System.out.println(this.skill01);
		System.out.println(skill01);
		
		System.out.println("============");
		
		System.out.println(super.skill02);
		System.out.println(this.skill02);
		System.out.println(skill02);
		
		System.out.println("============");
		
		// System.out.println(super.skill03); // 비추천(주의 표시뜸)
		System.out.println(Parent.skill03); // 추천
		
	}

	Child() {
		
		// super(); // 명시적으로 호출
		// 호출하지않아도 => 부모 클래스의 기본 생성자를 자동으로 호출
		
		Child child = new Child();
		
		child.exec();
	}
	
}
