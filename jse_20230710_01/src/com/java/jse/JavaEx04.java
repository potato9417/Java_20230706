package com.java.jse;

public class JavaEx04 {

	public static void main(String[] args) {
		// double과 float의 부동소수점 연산 차이
		double num1 = 1 + 5.6 + 5.8;
		float num2 = 1f + 5.6f + 5.8f;
		// d,f를 붙여주면 실수
		// 실수 연산은 검사 확인 필수
		// 실수 리터럴을 기본적으로 double로 인식
		// float로 사용하려면 f를 필수적으로 입력해야함
		
		System.out.println(num1); // 12.3999999999
		System.out.println(num2); // 12.4
		
		boolean flag = num1 == num2 ? true : false;
		System.out.println("flag : " + flag); // false
	}

}
