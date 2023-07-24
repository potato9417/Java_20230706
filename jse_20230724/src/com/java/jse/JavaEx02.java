package com.java.jse;

public class JavaEx02 {

	public static void main(String[] args) {
		
		// 예외 발생 => 오류
		int num1 = 24;
		int num2 = 0;
		int result;
		 
		// 예외 처리
		try {
			
			result = num1 / num2;
			
		}
		catch(ArithmeticException e) {
			
			// 처리 구문 => 메시징, 패치(후속조치) 구문
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage()); 
			e.printStackTrace(); // 전문 나옴
			
			System.out.println("==============");
			System.out.println("연산 오류");
			// 조치 구문
			result = num1 / 1;
			
		}
		
		// 처리 결과
		System.out.println("결과 : "+result);
		

		
		

	}

}
