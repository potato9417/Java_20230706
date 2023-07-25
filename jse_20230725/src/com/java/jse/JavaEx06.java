package com.java.jse;

import java.util.Date;

public class JavaEx06 {

	public static void main(String[] args) {
		
		// 1970.01.01 ~ 지금까지 밀리초 누계(long)
		System.out.println(System.currentTimeMillis());
		System.out.println(new Date(System.currentTimeMillis()));
		
		System.out.println(System.getProperties());
		System.out.println("===========");
		System.out.println(System.getProperty("java.version"));
		System.out.println("===========");
		System.out.println(System.getenv());
		
	}
}
