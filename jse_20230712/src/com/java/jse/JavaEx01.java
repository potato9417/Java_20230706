package com.java.jse;

public class JavaEx01 {
	
	public static void main(String[] args) {
		
		
		System.out.println("---가로선---"); // 가로선(row:행)
		for(int i=0;i<5;i++) {
			System.out.print("*");
		}
		System.out.println();

		System.out.println("---세로선---"); // 세로선(column:열)
		for(int j=0;j<5;j++) {
			System.out.println("#");
		}
		
		System.out.println("---사각형---"); // 사각형(rectangle, square) = 행*열 (matrix) => 2차원 2D(dimension)
		for(int k=0;k<5;k++) {
			for(int l=0;l<5;l++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
