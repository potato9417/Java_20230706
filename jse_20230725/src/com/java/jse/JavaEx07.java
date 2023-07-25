package com.java.jse;

public class JavaEx07 {
	
	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		
		Object obj = new Object();
		// obj.equals(obj);
		// Object.equals => 재정의
		System.out.println(str1.equals(str2)); // true
		System.out.println(str1.contentEquals(str2)); // true => 좀 더 정확하게 비교
		
		char chArr[] = str1.toCharArray();
		System.out.println(chArr[0]); // j
		
		byte byteArr[] = str1.getBytes();
		// 첫 128자리까지의 영문 비롯하여 특수 문자에 한함 => ASCII 코드
		System.out.println(byteArr[0]); // 106
		System.out.println((char)byteArr[0]); // j
		
		String str3 = "자바개발자반";
		// .substring(n,m); => n부터 m-1까지
		System.out.println(str3.substring(1)); // 바개발자반
		System.out.println(str3.substring(1,4)); // 바개발
		
		String str4 = "자바,개발자,반";
		String strArr[] = str4.split(","); // ["자바","개발자","반]
		for(String s :strArr) {
			System.out.print(s+ " "); // 자바 개발자 반
		}
		
		System.out.println();
		String str5 = "비자바개발자를 위한 자바 특강";
		// .replace(변경전,변경후) : 정규식지원x
		System.out.println(str5.replace("자바", "파이썬"));
		// .replaceAll : 정규식지원o
		System.out.println(str5.replaceAll("자바", "파이썬"));
		System.out.println(str5.replaceAll("\\s", ",")); // \\s : 공백(whitespace)
		
	}

}
