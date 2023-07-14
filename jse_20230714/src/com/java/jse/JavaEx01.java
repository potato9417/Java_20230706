package com.java.jse;

public class JavaEx01 {

	public static void main(String[] args) {

		// 불변 객체(immutable object)
		String str1 = "abcd"; 
		String str2 = "abcd";
		String str3 = new String("abcd");
		String str4 = new String("abcd");
		
		// 내용(문자열 값)으로 비교
		System.out.println(str1 == str2); // true
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.contentEquals(str3));
		System.out.println(str3.equals(str1)); // true
		System.out.println(str1.contentEquals(str3)); // true
		System.out.println(str3.equals(str4)); // true
		
		// 메모리 주소로 비교
		System.out.println(str1 == str3); // false
		System.out.println(str3 == str4); // false
		
	}
}
