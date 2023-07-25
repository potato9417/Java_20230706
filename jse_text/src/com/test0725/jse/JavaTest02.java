package com.test0725.jse;

//import java.util.Scanner;

public class JavaTest02 {
	
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("문자를 입력하세요 : ");
//		String str = sc.nextLine();
		
		String str = "The first character is a blank";
//		System.out.println(str);

		
		String strArr[] = str.split(" ");
		for(int i=0; i<strArr.length;i++) {
			if((int)strArr[i]==0) {
				
			}
		}
		System.out.print(strArr.length);
		
		
	}

}
