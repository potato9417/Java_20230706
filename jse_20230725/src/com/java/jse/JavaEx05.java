package com.java.jse;

public class JavaEx05 {
	
	String name;
	int price;
	String detail;
	
	// 기본생성자
	JavaEx05(){}
	
	// 오버로딩 생성자 => 멤버 필드들의 값을 한번에 설정
	public JavaEx05(String name, int price, String detail) {
		this.name = name;
		this.price = price;
		this.detail = detail;
	}

	@Override
	public String toString() {
		return "JavaEx05 [name=" + name + ", price=" + price + ", detail=" + detail + "]";
	}

	public static void main(String[] args) {

		JavaEx05 obj1 = new JavaEx05("제육볶음",5900,"돼지고기 고추장 볶음");
		
		System.out.println(obj1);
		// toString 원래 용도
		// 의미 : 문자열 변환 => 멤버필드 확인
		// 재정의) 객체 => 문자열 변환 => 멤버필드 확인(문자열)
		// Object 모든 클래스의 부모 클래스 => 멤버(메서드) 상속 가능
		System.out.println(obj1.toString()); // com.java.jse.JavaEx05@77f99a05
		
		
	}


}
