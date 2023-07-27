package com.java.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx05 {

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
		
		list.add(0,"친칠라");
		
		// 리스트 부분 추출
		// System.out.print(list.subList(0, 4)); // .subList(index, index-1)
		// String의 substring 메서드 처럼 마지막 인자 요소는 index-1
		
		// 배열로 역변환
		// 배열 : 안의 요소가 적을때 빠르게 작동
		// String strArr[] = new String[list.size()]; // 배열생성
		// strArr = list.toArray(strArr);
		// for(String s : strArr) {
			// System.out.print(s+" ");
		// }
		
		// 디자인패턴(행위패턴)이 적용된 Iterator 사용하여 적용 => 다량일 경우 성능 향상
		// Iterator<String> it = list.iterator();
		// while(it.hasNext()) {
			// System.out.print(it.next()+" ");
		// }
		
		// 역순(reverse) 나열 => 정렬x
		ListIterator<String> lit = list.listIterator(list.size());
		while(lit.hasPrevious()) {
			System.out.print(lit.previous()+" ");
		}
		
		
		
		System.out.println();
		list.forEach(x -> System.out.print(x + " ")); // 인자 => 람다(함수형) 프로그래밍
		
	}

}
