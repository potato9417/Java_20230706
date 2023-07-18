package com.java.jse;

public class JavaEx01 {
	
	// 멤버필드
	String name;
	String name2 = name; // 멤버 필드간의 대입
	String name3 = this.name; // 멤버 필드간의 대입
	// this : 클래스 자기 자신의(self) 인스턴스
	
	// 기본 생성자
	JavaEx01() {
		name2 = name; // 멤버 필드간의 대입
		this.name3 = this.name; // 멤버 필드간의 대입
	}
	
	// 오버로드 생성자 대입 종류 3가지
	// JavaEx01(String name3) {
		// name = name;
		// 인자가 다른 이름일 경우 : 멤버필드 <= 멤버필드 대입
		
	// }
	// JavaEx01(String name) {
		// name = name;
		// 인자가 멤버필드명과 같을 경우 : 인자 <= 인자 대입
		
	// }
	// JavaEx01(String name) {
		// this.name = name;
		// 멤버필드 <= 인자 대입
		
	// }
	
	
	// 메서드 대입 종류 3가지
	// void method(String name) {
		// name2 = name;
		// 멤버필드 <= 인자
	// }
	// void method(String name) {
		// name = name;
		// 인자 <= 인자
	// }
	// void method(String name) {
		// this.name = name;
	 	// 멤버필드 <= 인자
	// }

	
	public static void main(String[] args) {
		
		// 객체 변수
		JavaEx01 javaEx01;
		
		// 객체 변수 => 인스턴스(고유 주소 할당)
		javaEx01 = new JavaEx01();
		
		System.out.println("javaEx01 인스턴스(객체)의 고유값 : "+javaEx01);
		// 결과값 : com.java.jse.JavaEx01@77f99a05
		System.out.println("javaEx01 인스턴스(객체)의 고유값 : "+javaEx01.toString());
		// 결과값 : com.java.jse.JavaEx01@77f99a05
		
		javaEx01.name = "java";
		
		System.out.println("javaEx01.name : "+javaEx01.name); // 결과값 : java
		
	}

}