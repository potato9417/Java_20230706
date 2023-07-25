package com.java.jse;

import java.util.Objects;

public class JavaEx04 {
	
	String name;
	int price;
	String detail;
	
	@Override
	public int hashCode() {
		return Objects.hash(detail, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaEx04 other = (JavaEx04) obj;
		return Objects.equals(detail, other.detail) && Objects.equals(name, other.name) && price == other.price;
	}
	
	public static void main(String[] args) {
		
		JavaEx04 obj1 = new JavaEx04();
		obj1.name = "마우스";
		obj1.price = 5000;
		obj1.detail = "무선 저소음 마우스";
				
		JavaEx04 obj2 = new JavaEx04();
		obj2.name = "마우스";
		obj2.price = 5000;
		obj2.detail = "무선 저소음 마우스";
		
		// Object는 모든 클래스의 부모(조상) 클래스 => 멤버(메서드포함) 어떤 클래스나 사용가능! => 코드 재사용
		
		// hashcode 원래 기능 : 메모리 주소값 => 객체의 고유(unique)값
		// hashcode 재정의 : 두 객체의 멤버 필드들의 값을 비교 => 용도 변경
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		// equals : 의미(같다) => 멤버필드들의 값이 같다 
		System.out.println(obj1.equals(obj2));
		
	}

}
