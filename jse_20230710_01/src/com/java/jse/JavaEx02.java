package com.java.jse;

public class JavaEx02 {

	public static void main(String[] args) {
		// int num1 = 1000;
		// int num1 = 1E3; // 1E3 : double 
		int num1 = (int)1E3; // double -> int 형변환 필수
		// int num1 = (int)1E+3; // 위에것과 같은 결과
		// 1x10^3 => 실수이므로 형변환 필수
		float num2 = (float)2E-3; // 0.002
		// E뒤에 숫자만큼 소숫점 위치 변경(음수)
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		
		// float num3 = 2E-3; // 형변환 해야 사용가능 double(8byte) => float(4byte)
		// float num3 = 2E-3D; // 형변환 해야 사용가능 double(8byte) => float(4byte)
		// float num3 = 2E-3F; // float(4byte 실수형)
		float num3 = (float)2E-3D; // double => float로 형변환하여 사용가능 
		System.out.println("num3 : "+num3);
		
		// E/e : 지수(exponential)
		// mantissa : 가수
		
	}

}
