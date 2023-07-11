package com.java.jse;

import java.util.Scanner;

public class JavaEx01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num%2==0) {
			// System.out.println(num+"은(는) 2의 배수입니다.");
			System.out.printf("%d은(는) 2의배수입니다.",num);
		}
		else {
			// System.out.println(num+"은(는) 2의 배수가 아닙니다.");
			System.out.printf("%d은(는) 2의배수가 아닙니다.",num);
		}
		sc.close();
	}
}