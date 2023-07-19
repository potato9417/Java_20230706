package home;

public class Child2 {
	
	// 클래스 내부에 다른 클래스 멤버 : has-a 관계 => 소유관계
	Child child;

	void method2() {
		
		System.out.println(child.name);
		child.method();
		
	}
	
}

