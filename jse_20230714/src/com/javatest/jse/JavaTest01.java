package com.javatest.jse;

public class JavaTest01 {
	public static void main(String[] args) {
		
		System.out.println("---배열---");
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("---다중배열---");
		
		int arr2[][] = new int[3][2];
		
		for(int[] arr1:arr2) {
			for(int n:arr1) {
				System.out.print(n+" ");
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("---외부요소입력---");
		
		for(String s:args) {
			System.out.print(s+" ");
		}
		
	}

}
