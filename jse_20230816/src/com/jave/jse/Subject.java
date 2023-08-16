package com.jave.jse;

import java.util.Scanner;

public class Subject {

	/** 국어 성적 */
	int kor;
	
	/** 영어 성적 */
	int eng;
	
	/** 수학 성적 */
	int math;
	
	/** 기본 생성자 */
	public Subject() {
		
	}

	/** 오버로딩 생성자 */
	public Subject(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	@Override
	public String toString() {
		return String.format("Subject [kor=%s, eng=%s, math=%s]", kor, eng, math);
	}
	
	// 입력부 함수화
	@SuppressWarnings("resource")
	public static int inputSubject(Scanner sc, String subject) {
		
		int score = 0;
		
		// 입력부		
		while (true) {
			
			try {				
				sc = new Scanner(System.in); // 주의 무한 루프를 방지하기 위해서는 한번더 인스턴스를 생성합니다.		
				System.out.print(subject + " 성적 입력 : ");
				
				score = sc.nextInt();
				
				System.out.println(subject + " : " + score);
				
				// 정상 입력 : 0 ~ 100 => 분기(break)
				if (score >= 0 && score <= 100) {					
					System.out.println("정상 입력");
					break;
				} else { // 메시징
					System.out.println("점수는 0~100점 사이 정수로 입력하십시오.");
				}
				
			// } catch (InputMismatchException e) {
			} catch (Exception e) {
				
				System.out.println("점수는 숫자(정수)로 입력하십시오.");
			}	
		
		} // while (true) ... 
		
		return score;
	} //

	/**
	 * 총점을 구하는 메서드
	 * 
	 * @return 총점
	 */
	public int sumSubjects() {
		
		/*
		int sum;
		
		// sum = kor + eng + math;
		sum = this.kor + this.eng + this.math;
		
		return sum;
		*/
		
		return this.kor + this.eng + this.math;
	} //
	
	/**
	 * 평균을 구하는 메서드
	 * 
	 * @param i 반올림시 소수점 자리수
	 * @return 평균
	 */
	public float avgSubjects(int i) {
		
		float decPow = (float)Math.pow(10, i);
		
		return Math.round((this.sumSubjects() / 3f) * decPow) / decPow; 
	} //
	
	public static void main(String[] args) {
		
	}
	
}