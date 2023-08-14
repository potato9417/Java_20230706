package com.jave.jse;

import java.util.Scanner;

public class Score {
	
	// 필드
	int kor;
	int eng;
	int math;
	
	// 기본 생성자
	public Score() {}
	
	// 오버로딩 생성자
	public Score(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// 문자변환 메서드
	public String toString() {
		return String.format("Subject [kor=%s, eng=%s, math=%s]", kor, eng, math);
	}
	
	// 입력 메서드
	public static int inputSubject(Scanner sc, String subject) {
	    int score = 0;
	    while(true) {
	        try {
	            System.out.print(subject+"성적입력 :");
	            score = sc.nextInt();
	            System.out.println(subject + " : " + score);
	            if (score >= 0 && score <= 100) {					
	                System.out.println("정상 입력");
	                break;
	            } else {
	                System.out.println("점수는 0~100점 사이 정수로 입력하십시오.");
	            }
	        }
	        catch(Exception e){
	            System.out.println("점수는 숫자(정수)로 입력하십시오.");
	            sc.nextLine();  
	        }
	    }
	    return score;
	}
	
	// 총점 메서드
	public int sumSubjects() {
		
		return this.kor + this.eng + this.math;
	}
	
	// 평균 메서드
	public float avgSubjects(int i) {
		
		float decPow = (float)Math.pow(10, i);
		
		return Math.round((this.sumSubjects()/3f)*decPow) /decPow;
	}

}
