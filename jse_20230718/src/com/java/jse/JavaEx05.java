package com.java.jse;

public class JavaEx05 {
	
	// 멤버필드
	int num;
	String str;
	
	// 메서드
	void method() {
		if(num>10) {
			System.out.println(num);
		}
		else {
			return; // void일 경우 return을 쓰면 안되지만 메서드 종료로 사용가능
		}
	}
	
	// 메서드 오버로딩
	void method(int num) {
		
		this.num =num; // 멤버필드 <= 인자
	}
	
	// 메서드 오버로딩
	void method(int num, String str) {
		
	}
	
	// 메서드 오버로딩
	void method(String str, int num) {
		
	}
	
	// 가변인자(var-args) => 배열로 인식
	void method(String ... strs) {
		
		for(String s:strs) {
			
			System.out.println(s);
		}
	}
	
	// 메서드 오버로딩이 아님 => 위에 메서드과 동시에 사용 불가 
	// method(String ... strs){}도 배열로 받기때문에 같은 메서드로 판단
	// void method(String[] strs) {}
	
	// method(String ... strs){}와 충돌 가능 => 오류는 나지않지만 비추천!
	// void method(String s, String ... strs) {}
	
	// 메서드 오버라이딩
	void method(int n, String ... strs) {}
	
	// 가변인자(배열)는 여러 인자가 들어갈 경우 마지막 인자가 되어야
	// void method(String ... strs, int n) {} // 오류
	
	
	public static void main(String[] args) {
		
		JavaEx05 obj = new JavaEx05();
		
		String arr[] = {"1","2","3"};
		
		obj.method("1");
		System.out.println("================");
		obj.method("1","2");
		System.out.println("================");
		obj.method(arr);
		
	}

}
