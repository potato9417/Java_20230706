package com.java.jse;

public class JavaEx02 {

	public static void main(String[] args) {
		
		// 배열(Array) : 같은 자료형이 다수
		
		// 배열의 선언(정의)
		int arr[]; // int arr []; int []arr; int [] arr; : 가능 => [] 비워놔야함
		
		// 배열 객체 (메모리 공간) 할당
		arr = new int[10]; // [] 크기 할당해야함 
		// => int : 4byte => 10개이므로 40byte 할당
		
		// 배열 선언(정의)과 객체 할당 동시에
		int arr2[] = new int[10];
		
		// 개별 요소 접근
		System.out.println(arr[0]); // 0 => 배열은 지역변수이지만 기본값(default value)가 있다
		// 기본값 => string : null, float : 0.0 , array : 0 등 
		// int num;
		// System.out.println(num); // 오류 => 기본자료형의 지역변수는 값을 할당하고 출력해야함

	}
}