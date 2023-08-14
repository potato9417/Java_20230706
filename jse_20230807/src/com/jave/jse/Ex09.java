package com.jave.jse;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor = Score.inputSubject(sc, "국어");
		int eng = Score.inputSubject(sc, "영어");
		int math = Score.inputSubject(sc, "수학");
		int hist = Score.inputSubject(sc, "한국사");
		int soc = Score.inputSubject(sc, "사회");
		int sci = Score.inputSubject(sc, "과학");		
		
		//총점
		int sum = 0; 
		
		//평균
		float avg = 0;
		

		SubScore Score = new SubScore(kor, eng, math, hist, soc, sci);
		
		System.out.println("과목 점수 입력 현황 : " + Score);
		
		// 계산부
		sum = Score.sumSubjects(); // 합계
		avg = Score.avgSubjects(2); // 평균 : 소수점 두자리까지 표시 
				
		// 출력부
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		sc.close();
	}
}
