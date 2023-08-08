package com.jave.jse;

import java.util.Scanner;

public class Ex02 {
	
	// 국영수 성적 입력 후 총점, 평균 구하기
	public static void main(String[] args) {
		
		// 성적 입력부
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적을 입력하세요 : ");
		int kor = sc.nextInt();
		System.out.println("국어 : "+kor);
		
		System.out.print("수학성적을 입력하세요 : ");
		int math = sc.nextInt();
		System.out.println("수학 : "+math);
		
		System.out.print("영어성적을 입력하세요 : ");
		int eng = sc.nextInt();
		System.out.println("영어 : "+eng);
		
		// 총점
		int sum = 0;
		
		// 평균 : 소수점 1자리에서 반올림
		float avg1, avg2, avg3, avg4 = 0;
				
		
		// 총점 계산부
		sum = kor + math + eng;

		// 평균 계산부
		avg1 = Math.round((sum/3)*10)/10; // 88.0 : 내림
		avg2 = Math.round((sum/3f)*10)/10f; // 88.7 : 소수점 1자리에서 반올림
		avg3 = Math.round((sum/3f)*100)/100f; // 88.67 : 소수점 2자리에서 반올림
		avg4 = Math.round((sum/3f)*1000)/1000f; // 88.667 : 소수점 3자리에서 반올림
		

		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg1);
		System.out.println("평균 : " + avg2);
		System.out.println("평균 : " + avg3);
		System.out.println("평균 : " + avg4);
		

		// 자원 반납 => garbage collection 적용대상이 아님
		sc.close();

	}

}
