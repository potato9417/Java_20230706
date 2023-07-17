package com.javastury.jse;

public class Cat {

	String name;
	int age;
	
	public String catInfo(String name, int age){
		
		return String.format("%s은/는 %d살입니다.",name,age);
	}
}