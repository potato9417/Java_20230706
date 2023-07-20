package com.java.jse;

public class Clerk implements Manager {

	// 구현(implement, realize)
	@Override
	public void order() {
		
		// 부모 인터페이스의 메서드 => 추상 메서드(코드가 없음) - 오류 발생
		// super.order(); 
		
		System.out.println("지시대로 일하다");
		
	}
	
	// 접근제한자(public > default) 축소 - 오류
	// void order(){} 

	// 접근제한자(public > private) 축소 - 오류
	// private void order(){} 
	
	// 접근제한자(public > protected) 축소 - 오류
	// protected void order(){} 
	
	public static void main(String[] args) {
		
		// Clerk obj = new Clerk();
		Manager obj = new Clerk(); // 형변환 => 다형성
		// 객체간 형변환(형변환 연산자 활용) => 상속/구현 관계일때 가능
		obj.order();
	}
}
