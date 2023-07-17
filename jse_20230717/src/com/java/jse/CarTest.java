package com.java.jse;

public class CarTest {

	public static void main(String[] args) {
		
		// 객체(인스턴스 : car1) 생성
		// Car : 자료형
		// new : 객체 '메모리 공간(heap)' 생성 => 고유한 주소 할당 
		// Car() : 객체(인스턴스) 생성
		// new Car() : 익명 객체(anonymous instance)
		// car1 = new Car() : 인스턴스 이름이 명명됨
		Car car1 = new Car();
		
		// 지역 변수 : 값을 초기화하지않으면 사용할수 없음(error발생)
		// String str;
		// System.out.println(str); 
		
		
		System.out.println(car1.name);
		// car1.name(멤버 필드) : 기본값이 지정되어 있음 => null
		// String의 기본값 : null
		// int, double 등 의 기본값 : 0
		car1.name = "pickup truck";
		// name = "pickup truck"; // 오류 발생
		System.out.println("car1.name = " + car1.name);
		
		Car.name2 = "pickup truck"; // static way(정적방식) => 권장사항x
		System.out.println("Car.name2 = " + Car.name2);
		
		
	}
	
}
