package com.jave.jse;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		
		// 성적 입력부
		Scanner sc = null;
		int kor = 0;
		
		while(true) {			

			System.out.print("국어성적을 입력하세요 : ");
			
			// 예외 처리 (try-catch)
			try {
				
				sc = new Scanner(System.in);
				
				kor = sc.nextInt();
				System.out.println("국어 : " + kor);   
				
				// 정상입력 : 0 ~ 100 => break
				if(kor>=0 && kor<=100) {
					System.out.println("정상 입력");
					break;
				}
				else { // 메세징
					System.out.println("점수는 0 ~ 100 사이 정수로 입력하세요.");
				}
			}
			catch(InputMismatchException e) {
				
				System.out.println("점수는 숫자로 입력하세요.");
			}
			

		} // while -----
		
		sc.close();

	}

}
