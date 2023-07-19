package home;

import other.Parent; // other 패키지 안에있는 Parent 클래스

// class : public default(기본값)만 사용가능
// default : 같은 패키지 내에서만 접근 가능
public class Child extends Parent { // is-a(상속) 관계
	
	// 멤버 필드/메서드(생성자 포함) : 4대 접근 제한자 모두 사용가능
	// => public protected private default

	// 무표기(default) 접근 제한자
	// => 같은 패키지내에 있는 다른 객체에서 접근 가능
	public String name;
	// protected String name;
	// protected : 상속관계에서 사용 가능
	// private String name; // 자신의 클래스에서만 접근가능
	// private : 접근 가시성(access-visibility)
	
	// private void method(){} 
	void method() {
		System.out.println(this.name);
		
		// 동적필드 상속받을 경우
		// System.out.println(super.money);
		// super(부모클래스의 인스턴스,객체) <-> this
		
		// 정적(static)필드 상속받을 경우
		System.out.println(Parent.money);
		// static필드를 상속받을 경우 super 사용대신 Parent.money로 사용
		
	}


}
