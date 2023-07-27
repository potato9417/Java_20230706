package com.java.jse;

import java.util.ArrayList;
import java.util.List;

public class JavaEx02 {
	
	public static void main(String[] args) {
		
		// 일반 리스트 사용 => 입력된 자료형만 사용가능 => 성능 향상
		// List<String> list1 = new ArrayList<String>();
		// List<String> list1 = new ArrayList<>();
		// List<?> list1 = new ArrayList<String>();
		// List<> list1 = new ArrayList<String>(); // 오류발생
		
		// list1.add(1); // 오류 발생
		
		// 모든 자료형의 리스트 생성 => 성능 저하
		// List list2 = new ArrayList(); // java5이전에서 사용
		List<Object> list2 = new ArrayList<>(); 
		// 제네릭(generic)이란 데이터의 타입(data type)
		// 제너릭(제니릭)을 쓰지않으면 => raw type : 비추천
		// 제너릭의 효과 => 특정 자료형 요소 제한 => 성능 향상
		
		list2.add(1);
		list2.add("c");
		list2.add(new ArrayList<>());
		
	}

}
