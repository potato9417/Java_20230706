package com.java.jse;

import java.util.Date;

public class JavaEx03 {

	public static void main(String[] args) {
		
		// final(상속불가)
		// => 중요한, 변하면 안되는 내용이 있을 경우
		
		// System
		System.out.println(System.getenv());
		System.out.println(new Date(System.currentTimeMillis()));
		System.out.println(System.getProperties());
		
		// Math
		System.out.println(Math.E);
	}
}
