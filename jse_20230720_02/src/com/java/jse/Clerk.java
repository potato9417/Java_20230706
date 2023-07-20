package com.java.jse;

public class Clerk extends Manager {

	Clerk(){
		// super(); // 쓰지않아도 자동 상속
		System.out.println("상속된(파생) 클래스의 생성자");
	}
	
	@Override
	void order() {
		

	}

}
