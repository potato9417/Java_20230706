package com.java.jse;

public class JavaEx03 {

	public static void main(String[] args) {

		// int arr[] = new int[10]; // 배열 기본값 : 0
		// 배열의 초기화 => 다른 기본값(초기값) 입력
		int arr[] = { 1, 2, 3, 4, 5 }; // int arr[]; arr new int[5]; => o

		// int arr[]; arr new int[5] {1,2,3,4,5}; => x
		// int arr[]; arr={1,2,3,4,5}; => x

		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}

		// forEach문 (enhanced for loop : 향상된 for문)
		// 다음 요소 검색 방식(iterator : 반복자 패턴방식)
		// => 반복이 많을 때 일반 방식보다 성능 향상
		for (int n : arr) {
			
			System.out.print(n + " ");

		}

	}
}
