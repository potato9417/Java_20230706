package com.java.jse;

public class JavaEx01 {

	public static void main(String[] args) {
		
		// 예외 발생 => 오류
		// int num1 = 24;
		// int num2 = 0;
		// int result = num1 / num2;
		// java.lang.ArithmeticException: / by zero
		
		int num1 = 24;
		float num2 = 0.0f;
		float result = num1 / num2;
		System.out.println(result); // Infinity(무한소)
		
		System.out.println(7 / 0.0f); // Infinity(무한소)
		System.out.println(7 % 0.0f); // NaN(Not a Number)
		
		

	}

}
