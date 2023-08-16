package com.java.jse;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		// 국영수 값입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적 : ");
		int kor = sc.nextInt();
		System.out.print("영어성적 : ");
		int eng = sc.nextInt();
		System.out.print("수학성적 : ");
		int math = sc.nextInt();
		
		// 총점 구하기
		int sum = kor+eng+math;
		System.out.println("총점 : "+sum);
		
		// 평균 구하기(소수점 두자리에서 반올림)
		float avg = Math.round((sum/3f)*10)/10f;
		System.out.println("평균 : "+avg);
		
		sc.close();
	}

}
