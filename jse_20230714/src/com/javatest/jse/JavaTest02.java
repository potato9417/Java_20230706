package com.javatest.jse;

public class JavaTest02 {
	
	public static void main(String[] args) {
		
		int arr2[][] = new int[3][3];
		int num=1;
		for(int[]arr1:arr2) {
			for(int n:arr1) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
