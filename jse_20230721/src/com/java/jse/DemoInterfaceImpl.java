package com.java.jse;

public class DemoInterfaceImpl implements DemoInterface {

	@Override
	public void order() {
		// TODO Auto-generated method stub

	}
		
	// default메서드는 선택적 override => 강제성이없다
	@Override
	public void defaultMethod() {
		
		// DemoInterface.staticMethod();
		// default 메서드의 부모(상위) 메서드
		DemoInterface.super.defaultMethod();
		System.out.println("디폴트 메서드 재정의");
		
	}

	public static void main(String[] args) {
		
	}

}
