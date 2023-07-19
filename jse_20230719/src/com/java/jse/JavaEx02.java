package com.java.jse;

import java.util.Calendar;
import static java.util.Calendar.*; // Calendar 클래스 안의 모든 메서드 가지고 올때
import static java.util.Calendar.AM; // AM 메서드만 가지고 올떄
// static => 다른 클래스 안에 있는 메서드를 현재 클래스 안에 정의된 것처럼 사용하기위해
// => 단위테스트(모의테스트)에서 사용 (주의해서 사용해야함)

public class JavaEx02 {
	
	public static void main(String[] args) {
		
		System.out.println(Calendar.AM);
		System.out.println(AM);
		
	}

}
