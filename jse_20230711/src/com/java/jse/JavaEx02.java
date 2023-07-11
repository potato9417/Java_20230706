package com.java.jse;

public class JavaEx02 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=9;i++) {
			System.out.println("---"+i+"---");
			for(int j=1;j<=9;j++) {
				// System.out.println(i+"x"+j+"="+i*j);
				System.out.printf("%dx%d=%d%n",i,j,i*j);
			}
		}
	}
}
