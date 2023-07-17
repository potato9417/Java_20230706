package com.javatest.jse;

public class Month {
	
	public static void main(String[] args) {
	
		// 기본 enum
		System.out.println(Months.DECEMBER); // 이름
		System.out.println(Months.DECEMBER.ordinal()); // index
		
		// value값이 있는 enum
		System.out.println(MonthsStr.DECEMBER.name()); // 이름
		System.out.println(MonthsStr.DECEMBER.getValue()); // value값
		System.out.println(MonthsStr.DECEMBER.ordinal()); // index
	}
	
}
