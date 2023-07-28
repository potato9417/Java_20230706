package com.java.jse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> set = new HashSet<>();
		
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
		
		System.out.println("list의 크기 : " + list.size()); // 14 => 중복 허용
		
		set.addAll(list); // list를 set으로 치환
		
		// 리스트의 속성을 깨버려 stream화 => list가 아니게됨
		System.out.println(list.stream().count());
		
		// 복합적 요구사항 => stream(체인화)
		// 스트림(stream)프로그램 : 축약된 코드 => 편리
		list.stream()
				.filter(x -> x.contains("뱀"))
				.distinct()
				.sorted()
				.forEach(x -> System.out.print(x+" ")); // 도마뱀 뱀
		
	}

}
