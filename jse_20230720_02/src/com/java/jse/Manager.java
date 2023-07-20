package com.java.jse;

// 추상클래스 : 중간 관리자 느낌 => 지시 + 일(구현)
// 지시(추상메서드) + 구현(일반메서드)
// abstract : 클래스에서는 무조건 사용 / 인터페이스에서는 생략가능

// abstract public class Manager {} // 순서 상관없이 사용가능
public abstract class Manager {
// public class Manager{} // 일반 클래스는 추상 메서드 사용 불가 - 오류 발생
	
	// 멤버 필드
	String name;
	
	// 생성자
	Manager(){
		System.out.println("추상 클래스의 생성자");
	}
	
	// 일반메서드
	void work() { 
		System.out.println("일");
	}
	
	// 추상 메서드 => 지시/명령
	abstract void order();
	
}
