package com.java.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx01 {

	public static void main(String[] args) {
		
		String arr1[] = { "java", "c", "c++", "python" };
		// arr1.length // 기본 배열이 가지고 있는 메서드는 별로없다
		
		List<String> list1 = Arrays.asList(arr1); // 배열을 리스트로 치환
		System.out.println("리스트의 요소 갯수 : "+ list1.size()); // 리스트의 크기
		System.out.println("리스트의 첫 요소 : "+ list1.get(0)); // 리스트 값가지고오기(index)
		
		// 주의!
		// list.add("go"); // 오류발생 => Array.asList 메서드로 치환할 경우는 캡슐화가 됨 => 요소 추가/삭제 불가!
		// list1.set(0, "javascript"); // 변경 가능

		System.out.println("===============");
		
		// 요소 추가/삭제 가능한 리스트 변환
		// List<String> list2 = new List<>(); // 오류 발생
		List<String> list2 = new ArrayList<>();
		list2.addAll(Arrays.asList(arr1)); // 배열을 리스트로 치환한 리스트를 list2로 밀어넣기
		System.out.println("리스트의 요소 갯수 : "+ list2.size());
		System.out.println("리스트의 첫 요소 : "+ list2.get(0));
		
		// 배열 추가
		list2.add("dart");
		System.out.println("리스트의 요소 갯수 : "+ list2.size());
		System.out.println("리스트의 마지막 요소 : "+ list2.get(list2.size()-1));
		
		System.out.println("===============");
		
		// 배열 삭제
		list2.remove(0);
		
		// 배열 변경
		list2.set(0, "javascript");
		System.out.println("리스트의 요소 갯수 : "+ list2.size());
		System.out.println("리스트의 첫 요소 : "+ list2.get(0));
		
	}

}
