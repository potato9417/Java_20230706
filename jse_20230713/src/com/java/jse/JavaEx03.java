package com.java.jse;

public class JavaEx03 {
	
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
	
	public static void main(String[] args) {
		
		// 1부터 100까지의 숫자 만들기
		
		for(int i=1;i<=100;i++) {
			 
			// 1은 소수가 아니므로 1을 제외
			if(i!=1) {
				if(isPrimeNum(i)) {
					System.out.println(i);
				}
			}
			
			
		}
	}

}

