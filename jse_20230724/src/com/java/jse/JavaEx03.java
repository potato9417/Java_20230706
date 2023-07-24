package com.java.jse;

public class JavaEx03 {

	public static void main(String[] args) {
		
		// 예외 발생 => 오류
		int num1 = 24;
		int num2 = 0;
		int result;
		 
		// 예외 처리
		try {
			if(num2==0) {
				
				// throws : 메서드 단위 예외처리 => 메서드 우측에 부착
				// throw : 예외처리
				throw new ArithmeticException("나누는 수 = 0"); // 메세지 바로 생성
				// catch 해당 예외처리 구문으로 바로 이동
			}
			
			result = num1 / num2;
			
		}
		catch(ArithmeticException e) {
			
			// 처리 구문 => 메시징, 패치(후속조치) 구문
			System.out.println("연산 오류 : "+e.getMessage());
			// 조치 구문
			result = num1 / 1;
			
		}
		
		// 처리 결과
		System.out.println("결과 : "+result);
		

		
		

	}

}
