package com.java.jse;

public class JavaEx05 {

	public static void main(String[] args) {

		// 다차원 배열의 초기화(값 입력)
		int arr[][] = { { 1, 2 }, { 3, 4 }, { 5, 6 } };

		for (int[] arr1 : arr) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

		// 가변 배열
		// int row = 3;
		// int col = 2;
		// int arr2[][]=new int[row][col]; // 변수 입력 가능 => 변수활용 가변배열

		int arr2[][] = new int[3][];

		arr2[0] = new int[] { 1, 2, 3 };
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;

		for (int[] arr1 : arr2) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}
	}
}
