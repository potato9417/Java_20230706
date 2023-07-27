package com.java.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaEx04 {

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
		
		// 특정 위치(index)에 요소 삽입(insert)
		list.add(0,"친칠라");
		
		// 요소 보여 여부 확인
		// System.out.println("요소 보유 여부 : "+list.contains("고양이")); // true => boolean값
		// System.out.print(list.containsAll(Arrays.asList(new String[]{ "뱀", "원숭이", "열대어", "금붕어" })));
		
		
 		// 요소 삭제 => 중복요소일때 앞(index)에 있는 요소 삭제
		// list.remove("고슴도치");
		
		// 다수 요소 삭제
		// list.removeAll(Arrays.asList(new String[]{ "뱀", "원숭이", "열대어", "금붕어" }));
		// list.removeAll(Arrays.asList("뱀", "원숭이", "열대어", "금붕어"));
	
		
		// 전체 요소 삭제
		// list.clear();
		// System.out.println("리스트 요소 보유 여부 : "+ list.isEmpty());
		
		// 교집합
		// System.out.println("공통 포함 요소 : "+list.retainAll(Arrays.asList("뱀", "원숭이", "열대어","악어"))); // 뱀, 원숭이, 열대어
		// 인자로 들어가는 리스트의 요소들과공통되는(교집합) 요소들로 재구성
		
		// 인덱스 찾기
		// System.out.println("특정 요소의 인덱스 값 : "+ list.indexOf("고양이")); // 1
		// System.out.println("특정 요소의 인덱스 값 : "+ list.lastIndexOf("고슴도치")); // 8
		
		// 정렬(sort, order)
		// 기본 오름차순(ascending) 정렬 => 인코딩 방식 코드순 ex) UTF-8
		// list.sort(Comparator.naturalOrder()); // 오름차순 (자바8 이후)
		// list.sort(Comparator.reverseOrder()); // 내림차순 (자바8 이후)
		// Collections.sort(list); // 오름차순 (자바8 전)
		// Collections.sort(list, new Comparator<String>() { // 자바8 전
			// @Override
			// public int compare(String o1, String o2) {
				// return o1.compareTo(o2); // 오름차순
				// return o2.compareTo(o1); // 내림차순	
			// }
		// });
		// list.sort((o1,o2)-> o1.compareTo(o2)); // 오름차순
		list.sort((o1,o2)-> o2.compareTo(o1)); // 내림차순
		
		
		
		list.forEach(x -> System.out.print(x + " ")); // 인자 => 람다(함수형) 프로그래밍
		System.out.println();
		
	}

}
