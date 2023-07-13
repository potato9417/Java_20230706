package com.java.jse;

public class JavaEx05 {
	
	public static void main(String[] args) {
		System.out.printf("%d! = %d%n", 5, factorial(5));
	}
	
	// 팩토리얼 실행 함수 (재귀함수 사용 - 무한반복에 유의)
	static int factorial(int i) {
		int result = 0;
		
		if(i>0) {
			result = i * factorial(i-1);
		}
		else {
			result = 1;
		}
		return result;
	};
	
}

