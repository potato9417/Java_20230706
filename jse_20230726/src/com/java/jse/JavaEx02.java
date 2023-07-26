package com.java.jse;

public class JavaEx02 {
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
		t1.start();
		t2.start();
		t3.start();
		
		// 멀티스레드 => 실행 순서가 딱히 없다 => JVM이 실행 순서를 정함 (<-> 싱글스레드 => 순서대로 실행됨)
		
	}
	
}

class Thread1 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("*");
		}
		
	}
	
}
class Thread2 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("#");
		}
	}
	
}
class Thread3 extends Thread {
	
	@Override
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("%");
		}
	}
	
}
