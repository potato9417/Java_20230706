package com.java.jse;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaEx01 {

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
		
		System.out.println("set의 크기 :" + set.size()); // 12 => 중복 제외
		
		// set의 요소 전체 나열(for 사용) => 넣었던 순서로 반환되지않음 => set만의 순서로 나열
		for(String s : set ) {
			System.out.print(s+" ");
		}
		
		System.out.println();
		
		// set의 요소 전체 나열(Iterator 사용)
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		System.out.println();
		
		// set의 요소 전체 나열(forEach함수사용)
		set.forEach(x -> System.out.print(x+" "));
		set.forEach(System.out::print);
		
		System.out.println();
		
		
	}

}
