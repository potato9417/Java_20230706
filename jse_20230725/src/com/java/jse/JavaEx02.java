package com.java.jse;

public class JavaEx02 {
	
	public static void main(String[] args) {
		
		int result = 0;
		int num1=10;
		int num2 = (int)(Math.random()*10)-2;
		
		try {
			
			for(int i=1;i<=10;i++) {
				
				result = (int)(num1*i/num2);
			}
			
		}
		catch(Exception e) {
			System.out.println("오류 발생");
		}
		
		
	}

}
