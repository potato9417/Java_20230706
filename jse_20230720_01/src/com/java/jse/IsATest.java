package com.java.jse;

public class IsATest {

	public static void main(String[] args) {
		
		Clerk work1 = new Clerk();
		work1.order();
		work1.doClerk();
		
		Manager work2 = new Manager();
		work2.order();
		work2.doManager();

		// 형변환 => 다형성
		Manager work3 = new Clerk();
		work3.order(); // Clerk의 메서드 출력 =>동일한 메서드일 경우 생성자 기준!
		work3.doManager();
		// work3.doClerk(); // 오류 발생
		// 멤버(필드/메서드) 사용성 => 자료형(클래스/인터페이스) 기준!
		
		
		work2 = work1;
		
		// work1 = work2; // 오류 발생
		work1 = (Clerk)work2; // 가끔 실행오류 발생
		work1.doClerk();
		
		// work1 = work3; // 오류발생
		work1 = (Clerk)work3; // 형변환 가능 : 생성자 기준
		work1.doClerk();
		
		
	}

}
