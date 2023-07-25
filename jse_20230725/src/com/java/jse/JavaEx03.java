package com.java.jse;

public class JavaEx03 {
	
	public static void main(String[] args) {
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2)); // false
		
		
		obj1 = "java";
		obj2 = "java";
		System.out.println(obj1.equals(obj2)); // true
		

		obj1 = new String("java");
		obj2 = new String("java");
		System.out.println(obj1.equals(obj2)); // true => 값으로 비교
		System.out.println(obj1 == obj2); // false => 주소 값으로 비교
		
	}

}
