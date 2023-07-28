package com.java.jse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

public class JavaEx03 {
	
	public static void main(String[] args) {
		
		NavigableSet<String> set = new TreeSet<>();
		
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
		
		set.addAll(list); // TreeSet : 기본 오름차순 정렬
		set.add("가오리");
		
		System.out.println(set.first());
		System.out.println(set.last());
		
		set.forEach(x-> System.out.print(x+" "));
		
		System.out.println();
		
		set.subSet("고슴도치", "뱀") // 고슴도치 고양이 도마뱀
		   .forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		set.subSet("고슴도치", true, "뱀", true) // 고슴도치 고양이 도마뱀 뱀
		   .forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		set.headSet("고슴도치") // 가오리 강아지
		   .forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		set.headSet("고슴도치", true) // 가오리 강아지 고슴도치 
		   .forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		set.tailSet("열대어") // 열대어 원숭이 햄스터 
		   .forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		set.tailSet("열대어", false) // 원숭이 햄스터
		   .forEach(x->System.out.print(x+" "));
		
		System.out.println();
		
		// 역정렬(descendingSet 사용)
		set.descendingSet().forEach(x->System.out.print(x+" ")); 
		
		System.out.println();
		
		// 역정렬(subSet 사용)
		set = (NavigableSet<String>) set.subSet("고양이", "여우");
		set.descendingSet()
		   .forEach(x->System.out.print(x+" "));
		
		// 역정렬 : 일시적으로 내림차순으로 변경(desceningIterator 사용)
		Iterator<String> it = set.descendingIterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
	}

}
