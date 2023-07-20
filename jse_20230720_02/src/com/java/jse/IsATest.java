package com.java.jse;

public class IsATest {

	public static void main(String[] args) {
		
		// Clerk work = new Clerk();
		Manager work = new Clerk(); // 형변환 사용하면 더 직관적

		// 추상클래스는 직접적으로 생성자 호출이 불가 - 오류발생
		// Manager work = new Manager(); 

		work.order();
	}

}