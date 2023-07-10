package com.java.jse;

import java.math.BigDecimal;

public class JavaEx05 {

	public static void main(String[] args) {
		// int num1 = 1L; // long => int 불가 (형변환필수: 큰타입->작은타입)
		int num1 = (int)1L;
		
		long num2 = 1; // int => long 가능 (자동변환: 작은타입->큰타임)
		// long num2 = (int)1; // 수동변환도 가능
		
		// byte < short < int < long < float < double
		
		long num3 = Long.MAX_VALUE;
		System.out.println("num3 : "+num3); // long
		float num4 = num3;
		System.out.println("num4 : "+num4); // float
		double num5 = num3;
		System.out.println("num5 : "+num5); // double
		// 값의 손실 발생 : 지수(E/e)표현을 쓰면서 소수부분이 날라갈 수 있음
		
		// 최고점 => 최저점 : 값의 순환
		long num6 = Long.MAX_VALUE+1;
		System.out.println("num6 : "+num6); // -9223372036854775808
		System.out.println("Long.MIN_VALUE : "+Long.MIN_VALUE); // -9223372036854775808
		
		// 최저점 => 최고점 : 값의 순환
		long num7 = Long.MIN_VALUE-1;
		System.out.println("num7 : "+num7); // 9223372036854775808
		System.out.println("Long.MAX_VALUE : "+Long.MAX_VALUE); // 9223372036854775808
		
		// long => BigInteger, BigDecimal : long을 초과하게 될 경우 사용
		// Quick Fix : Ctrl + 1 => 자동 import해줌 (package/class)
		BigDecimal num8 = new BigDecimal(Long.MAX_VALUE);
		System.out.println("Long.MAX_VALUE + 1 ="+num8.add(new BigDecimal(1))); // 9223372036854775808
		
	}

}
