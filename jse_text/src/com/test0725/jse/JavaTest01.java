package com.test0725.jse;

import java.util.Scanner;

public class JavaTest01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");		
		int num1 = sc.nextInt();

		System.out.print("정수를 입력하세요 : ");
		int num2 = sc.nextInt();
		
		System.out.printf("%d+%d = %d", num1,num2,num1+num2);
		
		sc.close();
	}
}
