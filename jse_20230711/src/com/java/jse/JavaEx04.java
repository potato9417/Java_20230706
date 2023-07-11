package com.java.jse;

public class JavaEx04 {
	public static void main(String[] args) {
		int i=0;
		int j=8;
		
		while(i<=8) {
			System.out.printf(" ");
			i++;
			while(j>=0) {
				System.out.printf("*");
				j--;
			}
			j=8-i;
			System.out.println();
		}
	}
}
