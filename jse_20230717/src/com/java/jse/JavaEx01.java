package com.java.jse;

public class JavaEx01 {
	
	// 정적 멤버 필드(static) 가능
	static final String str1 = ""; // 사용가능
	final static String str2 = ""; // 사용가능
	
	public static void main(String[] args) {
		
		// 열거타입 enumeration(enum)
		// final : 상수 (js에서의 const)
		final String str = ""; // 대입불가 => 상수(constant) : 값을 보호(캡슐화)
		// 지역변수 => 정적 키워드(static) 사용불가
		// static final String str = ""; // 오류 바깥으로 빼야함
		
		System.out.println(Week.MONDAY);
		// 이렇게 파일을 따로 만들어서 하면 수정할때 힘들어서 열거타입을 사용함
		
		System.out.println(WeekEnum.MONDAY); // 기본 이름
		System.out.println("====WeekEnum====");
		System.out.println(WeekEnum.MONDAY.getValue()); // 넣은 값
		System.out.println(WeekEnum.MONDAY.name()); // 이름
		
		System.out.println(WeekEnum.MONDAY.ordinal()); // 순서(0부터~)
		System.out.println("====WeekEnumStr====");
		System.out.println(WeekEnumStr.MONDAY.getValue()); // 넣은 값
		System.out.println(WeekEnumStr.MONDAY.name()); // 이름
		System.out.println(WeekEnumStr.MONDAY.ordinal()); // 순서(0부터~)
		
	}

}
