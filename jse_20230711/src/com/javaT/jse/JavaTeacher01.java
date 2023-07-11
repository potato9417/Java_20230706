package com.javaT.jse;

import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaTeacher01 {
	
	// public 다른데서도 함수 사용가능
	// private 이곳에서만 함수 사용
	// void 리턴값이 정해지지않았을 경우
	// 리턴값이 있을 경우 데이터유형입력	
	
	// 입력 함수(메서드)화
	// 양의 정수 여부 점검 => 반환(리턴)값 : boolean(true,false)
	// boolean 함수일 경우 is~, has~로 함수명 지정 => 함수의 특징반영 : 서술어+목적어(명사구)
	// ex) isUnsigned, isUnsignedInt, isInteger 등
	// 인자 : 문자열(입력값)을 양의 정수판정
	static boolean isUnsignedInt(String inputStr) {
		
		// 리턴값 부터 처리 해주면 좋음
		boolean returnVal = false;
	
		// 코드
		String reg = "\\d{1,}"; // 정규표현식 : 1자리 이상의 양의 정수인지 점검(regex)
		boolean result = Pattern.matches(reg, inputStr);
		// Pattern.matches(정규표현식, 값); : 값이 정규표현식에 맞는지 틀린지 확인
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
		// System.out.println("result : "+result);
		
		if(result == true) {
			System.out.println("양의 정수");
			returnVal = true;
		}
		else {
			System.out.println("양의 정수가 아닙니다.");
			// returnVal = false; // 안써도 상관은 없음
		}
		
		return returnVal;
	}
	
	// 입력부
	static void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		String inputStr = sc.nextLine();
		
		boolean result = isUnsignedInt(inputStr);
		// Pattern.matches(정규표현식, 값); : 값이 정규표현식에 맞는지 틀린지 확인
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/Pattern.html
		System.out.println("result : "+result);
		
		sc.close();
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/regex/package-summary.html
		
	}

	public static void main(String[] args) {
		input();
		
	}
}
