package com.java.jse;

import java.util.regex.Pattern;

public class JavaEx01 {
	
	public static void main(String[] args) {
		
		// 010-1234-5678
		// String phoneRegex = "\\d{3}-[0-9]{4}-[0-9]{4}";
		String phoneRegex = "010-\\d{4}-\\d{4}";
		
		String target1 = "010-1234-5678";
		String target2 = "011-123-4567";
		String target3 = "0as-가나다-4567";
		
		boolean result1 = Pattern.matches(phoneRegex, target1);
		System.out.println("result1 : " + result1); // true
		
		boolean result2 = Pattern.matches(phoneRegex, target2);
		System.out.println("result2 : " + result2); // false
		
		boolean result3 = Pattern.matches(phoneRegex, target3);
		System.out.println("result3 : " + result3); // false
		
		
	}

}

