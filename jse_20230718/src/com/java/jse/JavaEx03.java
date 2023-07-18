package com.java.jse;

public class JavaEx03 {
	
	// 멤버필드
	String name;
	
	// 기본생성자/구축자(default constructor) => 인자가 없는 생성자
	// 생성자 명칭 = 클래스명 과 동일하게 생성
	// 생정자는 반드시 리턴/반환값 작성(안쓸경우 void)
	
	// 생성자
	JavaEx03(){ 
		System.out.println("기본 생성자");	
	}
	
	// 일반 멤버 메서드
	void JavaEx03(){ 
		System.out.println("메서드");	
	}
	
	// 오버로딩(over-load-ing) 생성자 => 기본생성자 반드시 작성해야함
	// 오버로딩생성자 : 다형성(Poly-morpth-ism) : 객체가 다른 모양을 가진다
	// 인자의 종류/갯수/순서 변경하여 다양한 메서드(생성자 포함)를 생성
	// return값이 존재하지않는다
	JavaEx03(String name){ 
		this.name = name;
		System.out.printf("%s는 이름입니다.",name);
	}
	
	public static void main(String[] args) {
		
		JavaEx03 javaEx03 = new JavaEx03(); // 기본 생성자 호출
		javaEx03.JavaEx03(); // 메서드 호출
		
		// 다형성 => 다양한 생성자 => 다양한 객체(인스턴스) 생성
		JavaEx03 otherJavaEx03 = new JavaEx03("Java"); // 오버로딩 생성자 호출
		
		javaEx03.name = "Java";
		
	}

}
