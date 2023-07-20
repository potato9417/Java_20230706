package com.java.jse;

public class Child extends Parent {
	
	// 오버라이딩(overriding) : 함수의 재정의
	// 부모의 코드를 변경
	@Override // 오버라이딩이라는 것을 명시
	void order() {
		super.order(); // 부모클래스의 order메서드 호출
		System.out.println("자식 클래스의 메서드");
	}
	// 접근제한자가 확장(default < public) - 가능
	// public void order(){} 
	
	// 인자부가 다름 - 오류발생
	// void order(int n) {}
	
	// 함수명이 다름 - 오류발생
	// void order02() {}	
	
	// 리턴형이 다름 - 오류발생
	// int order(int n) {}
	
	// 접근제한자가 축소(default > private) - 오류발생
	// private void order(int n) {}
	
	public static void main(String[] args) {
		
		//Child child = new Child();
		Parent child = new Child(); // 형변환 => 다형성
		// 객체간 형변환(형변환 연산자 활용) => 상속/구현 관계일때 가능

		child.order();
	}

}
