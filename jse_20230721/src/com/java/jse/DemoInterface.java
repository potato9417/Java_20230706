package com.java.jse;

// abstract public interface DemoInterface {} // 사용 가능
// public abstract interface DemoInterface {} // 사용 가능
public interface DemoInterface {
	
	// 멤버필드 => 상수(constant)만 허용 / public만 가능
	public static final String name ="java";
	String name01 = "java"; 
	final String name02 = "java";
	static String name03 = "java";
	static final String name04 = "java";
	// String name05; // 상수가 아님 => 오류 발생
	// protected static final name06 = "java"; // 오류 발생 
	// private static final name07 = "java"; // 오류 발생

	// 생성자 => 인터페이스는 생성자를 가질 수 없음
	// DemoInterface(){} // 오류 발생
	
	// 인스턴스 멤버 메서드(구현)를 만들수 없음 
	// void method() { } // 오류 발생
	
	// 추상 메서드
	void order();
	// abstract void order01(); // 사용가능
	
	// 정적 메서드 => java8 부터 사용가능
	static void staticMethod() {
		System.out.println("정적 메서드");
	}
	
	default void defaultMethod() {
		System.out.println("디폴트 메서드");
	}
	
	// 인스턴스 메서드
	// void method() {} // 오류 발생
	
	
	// 정적 블럭
	// static { // 오류 발생
	// 	 System.out.println("정적 블럭");
	// }
	
	// 인스턴스 블럭
	// { // 오류 발생
	// 	 System.out.println("인스턴스 블럭");
	// }
	
	// 예전에는 안됬지만 사용가능(파일생성시는 안되지만 입력하면 가능)
	public static void main(String[] args) {
		System.out.println("인터페이스의 실행");
		staticMethod();
	}
	
}

