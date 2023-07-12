package com.java.jse;

public class JavaEx03 {
	
	public static void main(String[] args) {
		
		System.out.println("---삼각형---");
		for(int k=0;k<7;k++) {
			for(int m=0;m<=k;m++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
		System.out.println("---역삼각형---");
		for(int i=0;i<7;i++) {
			for(int j=0;j<7-i;j++) {
				System.out.print("*");
				}
			
			System.out.println();
		}

	}

}
