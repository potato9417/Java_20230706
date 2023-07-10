package com.javatest.jse;

import java.util.Scanner;

public class JavaTest01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.print("값을 입력하세요 : ");
		
		String str = sc.next();
		System.out.println(str);
		sc.close();
	}
}