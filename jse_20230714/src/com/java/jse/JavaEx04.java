package com.java.jse;

public class JavaEx04 {

	public static void main(String[] args) {

		// 다차원 배열, 2차원(2D)배열
		// 배열 선언(정의)
		int arr[][];
		// int []arr[]; int [][]arr; int [] arr []; => []를 비워놔야함

		// 배열의 메모리 공간 할당 : [행][열]
		arr = new int[3][2]; // 가변배열이라 [3][]:가능(1차원 배열) [][3]:불가능 => 행값을 채워야함

		// 개별 요소
		// System.out.println(arr[0][0]); // 기본값 : 0
		// arr[0][0] = 1;
		// System.out.println(arr[0][0]); // 1

		arr[0][1] = 1;
		arr[1][0] = 1;
		arr[2][1] = 1;

		// 전체 나열
		for (int i = 0; i < arr.length; i++) { // 행

			for (int j = 0; j < arr[i].length; j++) { // 열
				// arr[i].length : arr[3][2](2차원 배열) => 요소(1차원배열)의 개수 = 3
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// forEach문

		for (int[] arr1 : arr) {
			for (int n : arr1) {
				System.out.print(n + " ");
			}
			System.out.println();
		}

	}

}
