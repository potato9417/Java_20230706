package com.java.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx03 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("고양이");
		list.add("강아지");
		list.add("햄스터");
		list.add("고슴도치");
		list.add("고슴도치"); // 중복 허용
		list.add("앵무새");
		list.add("뱀");
		list.add("고슴도치");
		list.add("도마뱀");
		list.add("열대어");
		list.add("원숭이");
		list.add("알파카");
		list.add("여우");
		list.add("병아리");
		list.addAll(Arrays.asList(new String[] { "거북이", "금붕어", "이구아나", "페럿" }));
		
		// 전체 요소 나열
		// for문 => 반복문
		for(int i=0; i<list.size(); i++) { 
			System.out.print(list.get(i) + " ");
		}
		
		System.out.println();
		
		// forEach문 => iterator(반복자 패턴)
		for(String s : list) {
			System.out.print(s + " ");
		}
		
		System.out.println();
		
		// forEach메서드(함수) => iterator(반복자 패턴)
		list.forEach(x -> System.out.print(x + " ")); // 인자 => 람다(함수형) 프로그래밍
		System.out.println();
		list.forEach(System.out::print); // 간략하게 표현
		
	}

}
