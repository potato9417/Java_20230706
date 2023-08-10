package com.jave.jse;

import java.util.Scanner;

public class Ex08 {
	
	// 국영수 성적 입력 후 총점, 평균 구하기
	public static void main(String[] args) {
		
		// 성적 입력부
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적을 입력하세요 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학성적을 입력하세요 : ");
		int math = sc.nextInt();
		
		System.out.print("영어성적을 입력하세요 : ");
		int eng = sc.nextInt();
		
		// 총점
		int sum = 0;
		
		// 평균 : 소수점 1자리에서 반올림
		float avg = 0;
				
		
		// 총점 계산부
		sum = kor + math + eng;

		// 평균 계산부
		avg = Math.round((sum/3f)*10)/10f; // 88.7 : 소수점 1자리에서 반올림

		
		// 출력부
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		

		// 자원 반납 => garbage collection 적용대상이 아님
		sc.close();

	}

}
