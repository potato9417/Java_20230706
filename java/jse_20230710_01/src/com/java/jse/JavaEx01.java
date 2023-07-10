package com.java.jse;

public class JavaEx01 {

	// public static void main(String[] args) {
	// public static void main(String params[]) {
	public static void main(String args[]) {
		// char(2byte) - 정수/문자 타입(교제에 따라서 다르게 표현함)
		// short(2byte), int(4byte), long(8byte) - 양/음수
		// boolean(1byte)
		// 기본타입들은 객체가 아님(소문자표기)
		
		// 기본 자료형의 범위(최솟값~최댓값) : 값이 있음 => 형변환을 위한 wrapper class가 존재
		// https://jminc00.tistory.com/13
		// wrapper class ex) int => Integer
		
		// byte
		System.out.println(Byte.MIN_VALUE); // -128(최솟값)
		System.out.println(Byte.MAX_VALUE); // 127(최댓값)
		
		// 형식자(java.util.Formatter) 포맷터
		System.out.printf("byte 자료형의 범위는 %d ~ %d %n", Byte.MIN_VALUE, Byte.MAX_VALUE);
		// %d : digit(decimal) => integeral(정수)의 값
		// %n : 줄바꿈(\n)
		// printf : js의 ``효과를 줄수 있음 => Formatter
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/PrintStream.html#printf(java.lang.String,java.lang.Object...)
		
		// 기본 자료형 => 랩퍼 클래스(wrapper class)
		// byte => Byte, short => Short, int => Integer
		// long => Long, float => Float, double => Double
		// char => Character
		
		// TODO
		// System.out.printf("기본타입 자료형의 범위는 %d ~ %d", 랩퍼클래스.MIN_VALUE, 랩퍼클래스.MAX_VALUE);
		System.out.printf("int 자료형의 범위는 %d ~ %d %n",Integer.MIN_VALUE,Integer.MAX_VALUE);
		
		// char은 (int)로 형변환 해줘야 값을 확인 할수 있다
		System.out.printf("char 자료형의 범위는 %c ~ %c %n", Character.MIN_VALUE,Character.MAX_VALUE); // 공백출력
		System.out.printf("char 자료형의 범위는 %d ~ %d %n", (int)Character.MIN_VALUE,(int)Character.MAX_VALUE);
		System.out.println("char 자료형의 범위는 "+(int)Character.MIN_VALUE+" ~ " + (int)Character.MAX_VALUE);
		
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.printf("float 자료형의 범위는 %f ~ %f %n", Float.MIN_VALUE, Float.MAX_VALUE); // 부동소수점때문에 정확한 값이 나오지않음
		System.out.printf("float 자료형의 범위는 %e ~ %e %n", Float.MIN_VALUE, Float.MAX_VALUE); // 주로 float는 이 방법을 사용
		System.out.printf("float 자료형의 범위는 %a ~ %a %n", Float.MIN_VALUE, Float.MAX_VALUE); // 16진수로 표현되며 잘 쓰지않음
		
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.printf("double 자료형의 범위는 %e ~ %e %n", Double.MIN_VALUE, Double.MAX_VALUE); 
		// double, float는 실수값으로 확인하는게 좋음
		
	}

}
