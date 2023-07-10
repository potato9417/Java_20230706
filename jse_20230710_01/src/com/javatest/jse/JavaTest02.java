package com.javatest.jse;

import java.util.Scanner;

public class JavaTest02 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("int 값을 입력하세요 : ");
		int numInt = sc.nextInt();
		System.out.print("boolean값을 입력하세요 : ");
		boolean bool = sc.nextBoolean();
		System.out.print("string값을 입력하세요 : ");
		String str = sc.next();
		System.out.print("double값을 입력하세요 : ");
		double db = sc.nextDouble();
		
		System.out.println("int : "+numInt+"\nboolean : "+bool+"\ndouble : "+db+"\nString : "+str);
		
	}
}