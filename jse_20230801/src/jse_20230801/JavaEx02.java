package jse_20230801;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaEx02 {

	public static void main(String[] args) {
		
		// 읽을 파일 등록
		String fileName = "sample.txt";
		
		// 입력 스트림 등록
		FileReader fis = null;
		
		// 예외처리(try-catch 처리 => throws 방법도 존재)
		try {
			
			fis = new FileReader(fileName);
			
			// 첫번째 데이터 입출력
			// System.out.println((char)fis.read()); // 자
			
			int ch;
			// 전체 데이터 입출력
			while((ch = fis.read()) != -1) {
				
				System.out.print((char)ch); // 자바
			}
			System.out.println();
			
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("파일없음");
			e.printStackTrace();
		}
		catch (IOException e) {
			
			System.out.println("파일 데이터 입력 오류");
			e.printStackTrace();
		}
		
		// 자원 반납
		finally {
			System.out.println("자원 반납");
			try {
				
				// 자원 미반납시(객체 활성화 시)
				if(fis != null) {
					fis.close();
				}
				
			} 
			catch (IOException e) {

				e.printStackTrace();
				
			}
		}
	}

}
