package com.java.jse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Subject {
	
	// 멤버필드
	int kor;
	int eng;
	int math;
	
	// 기본 생성자
	public Subject(){}
	
	// 오버로딩 생성자
	public Subject(int kor, int eng, int math) {
		
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 입력메서드
	public ArrayList<Integer> inputScore() {
		
		ArrayList<Integer> scores = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어성적 : ");
		kor = sc.nextInt();
		System.out.print("영어성적 : ");
		eng = sc.nextInt();
		System.out.print("수학성적 : ");
		math = sc.nextInt();
		scores.add(kor);
		scores.add(eng);
		scores.add(math);

		return scores;
	}
	
	// 총합메서드
	public int sum(int ... subjects) {
		
		int resultSum = 0;
		for(int i=0; i<subjects.length; i++) {
			resultSum += subjects[i];
		}
		return resultSum;
	}
	
	// 평균메서드
	public float avg(int resultSum, float i, float j) {
		
		float resultAvg = 0;
		
		int powNum = (int) Math.pow(10, j);
		
		return resultAvg = (float)Math.round((resultSum/i)*powNum)/powNum;
	}
	
	public static void main(String[] args) {
		
		Subject sbj = new Subject();
		ArrayList scores = sbj.inputScore();
		int scoresSize = scores.size();
		System.out.println(scores.size());
		int score1 = (int) scores.get(0);
		int score2 = (int) scores.get(1);
		int score3 = (int) scores.get(2);
		
		int sum = sbj.sum(score1,score2,score3);
		float avg = sbj.avg(sum, scoresSize, 2);
		
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+avg);
	}
}

