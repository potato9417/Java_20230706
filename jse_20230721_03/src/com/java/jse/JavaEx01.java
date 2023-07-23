package com.java.jse;

// 내부(중첩)클래스 => Has-A 관계(집합) : 캡슐화
public class JavaEx01 {
	
	// 인스턴스 멤버 (내부) 클래스
	class InnerClass {
		
		String name;

		InnerClass(){
			System.out.println("InnerClass 생성자");
		}
		
		void method() {
			
			System.out.println("InnerClass.method");
		}
	}
	
	// static : 정적 멤버 (내부) 클래스
	static class StaticClass {
		
		String name;
		
		StaticClass() {
			System.out.println("StaticClass 생성자");
		}
		
		void method() {
			System.out.println("StaticClass.method");
		}
	}
	
	void localMethod() {
		
		// 지역 클래스
		class LocalClass {
			
			String name;
			
			LocalClass(){
				
				System.out.println("지역 클래스 생성자");
			}
			
			void method() {
				System.out.println("LocalClass.method");
			}
			
		}
		
		LocalClass localClass = new LocalClass();
		localClass.method();
		
	}
	
	
	public static void main(String[] args) {
		
		// InnerClass inner = new InnerClass(); // 오류 발생
		
		JavaEx01 outer = new JavaEx01();
		InnerClass inner1 = outer.new InnerClass();
		
		InnerClass inner2 = new JavaEx01().new InnerClass();
		
		JavaEx01.InnerClass inner3 = new JavaEx01().new InnerClass();
		
		
		StaticClass staticClass1 = new StaticClass();
		JavaEx01.StaticClass staticClass2 = new StaticClass();
		
		// JavaEx01.StaticClass staticClass = new JavaEx01().new StaticClass(); // 오류 발생
		
		System.out.println("===================");
		
		outer.localMethod();
		
	}

}
