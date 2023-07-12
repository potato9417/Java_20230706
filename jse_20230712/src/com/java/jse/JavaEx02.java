package com.java.jse;

public class JavaEx02 {
	
	public static void main(String[] args) {
		
		System.out.println("---평행사변형---"); // 평행사변형(parallelogram)
		for(int i=0;i<5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(" ");
				
			}
			for(int k=0;k<5;k++) {
				System.out.print("*");					
			}
			System.out.println();
		}
		
		System.out.println("---평행사변형2---"); // 평행사변형2(parallelogram)
		for(int l=5;l>0;l--) {
			for(int m=0;m<l;m++) {
				System.out.print(" ");
				
			}
			for(int n=0;n<5;n++) {
				System.out.print("*");					
			}
			System.out.println();
		}
		
		System.out.println("---사선---"); // 사선
		for(int o=0;o<5;o++) {
			for(int p=0;p<o;p++) {
				System.out.print(" ");
				
			}
			System.out.print("*");					
			System.out.println();
		}
	}

}
