package com.java.jse;

public class JavaEx06 {
	
	public static void main(String[] args) {
	
		// 외부인자(args) 처리
		
		// eclipse 외부 인자 입력방법
		// Run > Run Configurations > Java Application > Arguments 패널 > Variables > ${string_prompt}입력 > 실행

		for(String s: args) {
			System.out.print(s+" ");
			
		}
	}

}
