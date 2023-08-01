package jse_20230801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaEx04 {

	public static void main(String[] args) {
		
		// 읽을 파일 등록
		String fileName = "sample.txt";
		
		// try-with-resources(스트림 자원)
		// 자원반납 자동화
		// AutoCloseable 인터페이스와 관계가 있는 경우에 한함
		
		// 예외처리
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			String line = "";
			while((line=br.readLine())!=null) {
				System.out.print(line);
			}
		}
			
		
		catch (FileNotFoundException e) {
			
			System.out.println("파일없음");
			e.printStackTrace();
		}
		catch (IOException e) {
			
			System.out.println("파일 데이터 입력 오류");
			e.printStackTrace();
		}
		
		
	}

}
