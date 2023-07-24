package com.java.jse;

public class JavaEx06 {

	public static void main(String[] args) {
		
		// 예외 발생 => 오류
		int num1 = 24;
		int num2 = 0;
		int result = 0; // 초기화
		int arr[] = new int[3]; // 배열
		int result2;
		 
		// 예외 처리
		try {
			
			// 형변환 오류
			// java.lang.NumberFormatException: For input string: "abc"
			result2 =Integer.parseInt("abc");
			
			arr[-1] = 1; // 배열 인덱스 오류
			
			if(num2==0) {
				
				throw new ArithmeticException("나누는 수 = 0");
			}
			
			result = num1 / num2;
			
		}
		// 배열인덱스 || 형변환 오류 => 공동 처리 ||대신 |로 표기
		catch(ArrayIndexOutOfBoundsException | NumberFormatException e) {
			
			System.out.println("배열인덱스 또는 형변환 오류 : "+e.getMessage());
			
		}
		catch(ArithmeticException e) {
			
			System.out.println("연산 오류-2 : "+e.getMessage());
			result = num1 / 1;
			
		}
		catch(Exception e) {
			
			System.out.println("다른 종류의 예외(사건) : "+e);
			
		}
		finally {
			// 자원반납(close), 마무리 메시징
			System.out.println("예외 발생 유무와 무관하게 마무리 처리");
		}
		
		// 처리 결과
		System.out.println("결과 : "+result);

	}

}
