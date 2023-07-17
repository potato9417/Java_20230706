package com.java.jse;

// public => 접근 제한자(지시자, 제어자, 변경자) : access modifier 
// ex) public(개방적(open))
// 접근 권한(access permission) : 보안
// class : 클래스를 만드는 키워드
// Car : 식별자(사용자가 만드는 용어,언어 : identifier)
// 클래스 명명 : upper-camelcase 사용하는 것이 일반적
// { } : 블럭(block : 영역)
public class Car {

	// 멤버(member) : 소속 => 속성 + 동작(행위)
	// 멤버필드(속성) + 생성자/메서드(동작)
	// UML(그림 설계/모델링 언어) => 클래스 다이어그램(class diagram)
	// 패키지.클래스(이름) -> 멤버 필드 -> 멤버 메서드 : 순서를 지켜주는 것이 좋음
	
	// 멤버필드
	String name;
	static String name2;
	
	// 생성자(constructor : 구축자)
	// 생성자는 클래스이름과 같아야함
	// 문법) 기본 생성자만 존재하는 경우는 묵시적(implicit) 정의 가능 => 없어도 있는 걸로 판단 => new 생성자
	// 그러나 다른 생성자(오버로딩 생성자)가 존재할 경우에 기본생성자를 호출할때는 반드시 명시적으로 정의 해야함! 
	
	// 기본생성자 : 인자가 없는 생성자 (no-argument/no-parameter constructor)
	public Car() {
		
		System.out.println("기본 생성자");
	}
	
	// 오버로딩 생성자 (오버로딩 : 같은 이름의 메소드를 중복하여 정의하는 것을 의미)
	public Car(String name) {
		
		System.out.println("오버로딩 생성자");
	}
	
	// 멤버 메서드(인스턴스 멤버 메서드) : 비정적 멤버 메서드 => static이 아님
	public String printCar(String name) {
		// return "이것은 "+ name + "자동차입니다.";
		return String.format("이것은 %s 자동차입니다.%n", name);
		
	}
	
}
