package com.java.jse;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaEx01_02 {

	// 숫자확인
	static boolean isUnsignedInt(String inputStr) {
		
		boolean returnVal = false;
		
		String reg = "\\d{1,}";
		boolean result = Pattern.matches(reg, inputStr);
		
		if(result == true) {
			System.out.println("양의 정수");
			returnVal = true;
		}
		else {
			System.out.println("양의 정수가 아닙니다.");
		}
		
		return returnVal;
	}
	
	// 입력
	static void input() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		String inputStr = sc.nextLine();
		
		boolean result = isUnsignedInt(inputStr);
		
		System.out.println("result : " + result);
		
		sc.close();
	}
	
	// 함수 실행
	public static void main(String[] args) {
		
		input();
	}
}
