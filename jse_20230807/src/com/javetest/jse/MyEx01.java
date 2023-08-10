package com.javetest.jse;

import java.util.Scanner;

public class MyEx01 {

	public static void main(String[] args) {
		
		// 성적입력부
		Scanner sc = new Scanner(System.in);
	
		System.out.print("국어 성적 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 성적 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 성적 : ");
		int math = sc.nextInt();
		
		
		// 성적 출력부
		int sum = kor+eng+math;
		float avg = Math.round((sum/3f)*10)/10f;
		
		System.out.println("합계 : "+sum);
		System.out.println("평균 : "+avg);
		
		
		 
		sc.close();
	}
	
}
