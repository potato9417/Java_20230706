package com.java.jse;

import java.util.Scanner;

public class JavaEx07 {

	public static void main(String[] args) {
		
		// 표준(standard : std) 입력 : System.in
		// 표준 => 콘솔(출력 : text mode, terminal), 키보드(입력) / 마우스x, 웹브라우저x
		// (cmd)command/CLI/prompt => 표준 입출력
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 : ");
		String str = sc.next();
		
		System.out.println("입력한 내용 : "+str);
		sc.close(); // 자원반납 : 자원 부족 현상(resource leak : 리소스 리크) 방지

	}

}
