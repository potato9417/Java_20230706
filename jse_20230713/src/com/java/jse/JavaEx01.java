package com.java.jse;

public class JavaEx01 {
	
	public static void main(String[] args) {
		// 속이 빈 마름모 만들기
		
		//윗쪽 빈 삼각형 만들기
		for(int i=0; i<9; i++) {
			for(int j=0; j<9-i; j++) {
				System.out.print("*");
			}
			for(int k=0; k<(i+1)*2-1; k++) {
				System.out.print(" ");
			}
			for(int l=0; l<9-i; l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 아랫쪽 빈삼각형 만들기
		for(int i=0; i<10; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			for(int k=18; k>(i-1)*2+1; k--) {
				System.out.print(" ");
			}
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

