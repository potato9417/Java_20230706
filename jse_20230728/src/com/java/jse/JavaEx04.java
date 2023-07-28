package com.java.jse;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class JavaEx04 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<>();
		
		map.put("신림","순대");
		map.put("마포", "돼지갈비");
		map.put("장충", "족발");
		map.put("무교", "낚지볶음");
		map.put("종로", "설렁탕");
		map.put("종로", "닭한마리");
		map.put("을지로", "생선구이");
		map.put("을지로", "골뱅이");
		map.put("응암", "감자탕");
		map.put("신당", "떡볶이");
		map.put("마장", "육고기");
		map.put("노량진", "회");
		map.put("흑석", "돼지갈비");
		
		// 중복허용 하지않아 먼저 들어간 값이 사라지고 나중에 들어간 값이 노출
		
		// 개별 요소 조회
		System.out.println(map.get("종로")); // 닭한마리
		System.out.println(map.get("을지로")); // 골뱅이
		
		// 전체 요소 조회
		map.forEach((x,y) -> System.out.println(x + "=" + y));
		// map.entrySet().forEach(x->System.out.println(x));
		// map.keySet().forEach(x->System.out.println(x+"="+map.get(x)));
		
		
	}

}
