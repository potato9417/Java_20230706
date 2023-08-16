package com.java.jse;

import java.util.Scanner;

public class Ex2 {
	
	// 총점 메서드
	private static int sum(int kor, int eng, int math) {
		
		int resultSum = 0;
		
		return resultSum = kor+eng+math;
	}
	
	
	// 평균 메서드(소수점 두자리에서 반올림)
	private static float avg(int resultSum, float i) {
		
		float resultAvg = 0;
		
		
		return resultAvg = (float)Math.round((resultSum/i)*10)/10f;
	}

	public static void main(String[] args) {
		
		// 국영수 값입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적 : ");
		int kor = sc.nextInt();
		System.out.print("영어성적 : ");
		int eng = sc.nextInt();
		System.out.print("수학성적 : ");
		int math = sc.nextInt();
		
		// 결과 출력
		int sum = sum(kor,eng,math);
		float avg = avg(sum,3);
		
		System.out.println("총합 : "+sum+" 평균 : "+avg);
	
		sc.close();
	}

}
