package com.javaT.jse;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaTeacher01_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String inputStr = sc.nextLine();
		
		String reg = "\\d{1,}"; // 정규표현식 : 1자리 이상의 양의 정수인지 점검(regex)
		boolean result = Pattern.matches(reg, inputStr);
		// Pattern.matches(정규표현식, 값); : 값이 정규표현식에 맞는지 틀린지 확인
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
		System.out.println("result : "+result);
		
		if(result == true) {
			System.out.println("양의 정수");
		}
		else {
			System.out.println("양의 정수가 아닙니다. 다시입력해주세요 : ");
			inputStr = sc.nextLine();
		}
		
		sc.close();
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/package-summary.html
		
		
	}
}
