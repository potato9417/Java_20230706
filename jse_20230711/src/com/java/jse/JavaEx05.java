package com.java.jse;

import java.util.Scanner;

public class JavaEx05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수를 입력하세요 : ");
		int korNum = sc.nextInt();
		System.out.print("수학점수를 입력하세요 : ");
		int mathNum = sc.nextInt();
		System.out.print("영어점수를 입력하세요 : ");
		int engNum = sc.nextInt();
		
		int sumNum = korNum+mathNum+engNum;
		float avgNum = sumNum/3;
		System.out.printf("국어점수 : %d%n수학점수 : %d%n영어점수 : %d%n총 점수 : %d%n평균 : %f",korNum,mathNum,engNum,sumNum,avgNum);
		
		sc.close();
	}
}
