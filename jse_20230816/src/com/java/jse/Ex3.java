package com.java.jse;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex3 {
	
	// 총점 메서드 => 배열
	private static Map<String, Integer> sum(int ... subjects) {
		
		int resultSum = 0;
		int subjectsLength = subjects.length;
		
		for(int i = 0; i<subjects.length; i++) {
			resultSum += subjects[i];
		}
		
		// 리턴값을 여러개 빼기위해 map사용
		Map<String, Integer> map = new HashMap<>();
		
		// 값 추가
		map.put("총합", resultSum);
		map.put("과목수", subjectsLength);
		
		return map;
	}
	
	
	// 평균 메서드(소수점 두자리에서 반올림)
	private static float avg(int resultSum, float i, int j) {
		
		float resultAvg = 0;
		int powNum = (int) Math.pow(10, j);
		
		return resultAvg = (float)Math.round((resultSum/i)*powNum)/powNum;
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
		int sum = sum(kor,eng,math).get("총합");
		int classNum= sum(kor,eng,math).get("과목수");
		float avg = avg(sum,classNum, 2);
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	
		sc.close();
	}

}
