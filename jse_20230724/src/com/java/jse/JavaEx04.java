package com.java.jse;

public class JavaEx04 {

	public static void main(String[] args) {
		
		// 예외 발생 => 오류
		int num1 = 24;
		int num2 = 0;
		int result = 0; // 초기화
		int arr[] = new int[3]; // 배열
		 
		// 예외 처리
		try {
			
			arr[-1] = 1; // 배열 인덱스 오류
			
			if(num2==0) {
				
				throw new ArithmeticException("나누는 수 = 0");
			}
			
			result = num1 / num2;
			
		}
		// 배열 인덱스 오버 체크 => 예외처리 클래스(전담반)
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("연산 오류-1 : "+e.getMessage());
			
		}
		// 산술 연산 예외처리(전담반)
		catch(ArithmeticException e) {
			
			System.out.println("연산 오류-2 : "+e.getMessage());
			result = num1 / 1;
			
		}
		
		// 처리 결과
		System.out.println("결과 : "+result);

	}

}
