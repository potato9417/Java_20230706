package com.java.jse;

public class Test {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i<5) {
				for(int j=0;j<18;j++) {
					
					if(j>=Math.ceil(18/2)-i && j<=Math.ceil(18/2)+i){
						System.out.print("*");
					}
					else {
						System.out.print(" ");
					}
				}
			}
			else {
				for(int j=0;j<27;j++) {
					
					if(j>=18-i && j<=18+i){
						System.out.print("*");
					}
					else {
						if(j>=9-i && j<=9+i){
							System.out.print("*");
						}
						else {
							System.out.print(" ");
						}
					}
				}
			}


			
				
			System.out.println();
		}
	}
}
