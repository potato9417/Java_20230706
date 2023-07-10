package com.java.jse;

public class JavaEx03 {

	public static void main(String[] args) {
		float num1 = 3.14E-3F; 
		System.out.println("num1 : "+num1);

		String str = "나는 '자바'개발자입니다.";
		// \ 이스케이프(escape)문자
		// String str1 = "나는 \"자바\"개발자입니다."; // ""문자열 안의 ""는 \"\"로 사용
		String str1 = "나는 \t자바\n개발자입니다."; // \t : 탭만큼의 공백, \n : 개행 
		
		System.out.println(str);
		System.out.println(str1);
	}

}
