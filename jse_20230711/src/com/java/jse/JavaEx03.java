package com.java.jse;

import java.util.Scanner;

public class JavaEx03 {
	public static void main(String[] agrs) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=9;i++) {
			// System.out.println(num+"x"+i+"="+num*i);
			System.out.printf("%dx%d=%d%n",num,i,num*i);
		}
		sc.close();
	}
}
