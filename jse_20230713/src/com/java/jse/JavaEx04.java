package com.java.jse;

public class JavaEx04 {

	// 소수 여부 확인
	static boolean isPrimeNum(int num) {
        
        boolean flag=true;
        
        // Math.sqrt() : 제곱근 구하기
        for(int j=2; j<=(int)Math.sqrt(num); j++){
            
            if(num % j ==0){
                flag=false;
                break;
            } else {
                flag=true;
            }
        }
        
        return flag;
    } //
	
	// 소수의 합계
	public static void main(String[] args) {
		int sumNum = 0;
		
		for(int i=1;i<=100;i++) {
			 
			if(i!=1) {
				if(isPrimeNum(i)) {
					sumNum += i;
				}
			}
			
		}
		System.out.print(sumNum);
	}
}
