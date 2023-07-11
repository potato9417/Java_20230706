package com.java.jse;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Javaex01_01 {
		
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 : ");
		String inputNum = sc.nextLine();
		
		String reg = "\\d{1,}";
		boolean result = Pattern.matches(reg, inputNum);
		
		if(result==true) {
			System.out.println("양수");
		}
		else {
			System.out.println("잘못입력");
		}
	
		sc.close();
	}
}
