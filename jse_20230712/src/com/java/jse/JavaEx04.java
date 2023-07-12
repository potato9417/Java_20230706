package com.java.jse;

public class JavaEx04 {

	public static void main(String[] args) {
		
		System.out.println("---피라미드---");
		for(int i=0;i<5;i++) {

			for(int j=0;j<9;j++) {
				
				if(j>=Math.ceil(9/2)-i && j<=Math.ceil(9/2)+i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
				
			System.out.println();
		}
		
		System.out.println("---삼각형안의 역삼각형---");
		for(int i=0;i<5;i++) {
			
			for(int j=0;j<19;j++) {
				
				if(j>=Math.ceil(19/2)-i && j<=Math.ceil(19/2)+i){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
							
			System.out.println();
		}
		for(int i=0;i<5;i++) {

			for(int j=0;j<19;j++) {
				
				if(j==4) {
					
				}
				if(j>=Math.ceil(28/2)-i && j<=Math.ceil(28/2)+i){
					System.out.print("*");
					
				}
				else {
					if(j>=Math.ceil(9/2)-i && j<=Math.ceil(9/2)+i){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
					
				}
			}
				
			System.out.println();
		}
	}
}
