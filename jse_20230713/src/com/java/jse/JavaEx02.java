package com.java.jse;

public class JavaEx02 {
	
	public static void main(String[] args) {
		// 별모양 만들기
		
		// 별 위에부분 만들기
		for(int i=0; i<5; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 윗변이 더 긴 사각형만들기
		for(int i=0; i<5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<19-i*2; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		// 밑변이 더 긴 사각형 만들기
		for(int i=6; i>0; i--) {
			for(int j=0; j<i-1; j++) {
				System.out.print(" ");
			}
			for(int k=0; k<19-i*2+2; k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		
		// 역삼각형 만들기
		for(int i=5; i>0; i--) {
			for(int j=0; j<9-i+1; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<=i*2-2; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
