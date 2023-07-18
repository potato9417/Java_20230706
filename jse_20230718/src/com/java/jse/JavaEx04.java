package com.java.jse;

public class JavaEx04 {
	
	// 멤버 필드
	String name;
	int age;
	float money;
	
	// 생성자(메모리 동적 : new) => static(정적) 사용 불가
	JavaEx04(){
		
		System.out.println("기본 생성자");
	}

	// 오버로딩 생성자
	public JavaEx04(String name) {
		
		// 생성자안에서 생성자 호출 => 생성자 안의 첫문장에 호출해야함
		// JavaEx04(); // 오류 : 생성자x => 일반멤버 메서드
		// new JavaEx04(); // new 생성자 => 익명 인스턴스(객체)
		this(); // 생성자 자체 호출
		// this.멤버필드/메서드 => this : 클래스의 객체 자신(self)
		// this() => 기본 생성자
		
		this.name=name;
		
		System.out.println("오버로딩 생성자");
	}
	
	public JavaEx04(String name, int age) {
		
		this(name); // JavaEx04(String name); 호출
		
		this.age=age;
		
		System.out.println("오버로딩 생성자 -2");
	}


	public static void main(String[] args) {
		JavaEx04 javaEx04 = new JavaEx04("java", 29);
		
	}

}
