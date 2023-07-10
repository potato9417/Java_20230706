package com.java.jse;

public class JavaEx06 {

	public static void main(String[] args) {
		String str = 1 + 2 + "3" + 4 + 5;
		// 1 + 2 = 3 : 사칙연산(덧셈)
		// 3 + "3" = "33" : 문자열 연결연산
		// "33" + 4 = "334" : 문자열 연결연산
		// "334" + 5 = "3345" : 문자열 연결연산
		System.out.println("str : "+str); // "3345"

		String numStr1 = "123";
		// int num1 = (int)numsStr1; // 다른(기본/참조) 자료형이므로 변환불가 
		int num1 = Integer.parseInt(numStr1); // String => int : 형변환 메서드 사용 parseInt()
		System.out.println(num1 +1); //124
	}

}