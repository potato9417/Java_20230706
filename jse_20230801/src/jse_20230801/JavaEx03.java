package jse_20230801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaEx03 {

	public static void main(String[] args) {
		
		// 읽을 파일 등록
		String fileName = "sample.txt";
		
		// 입력 스트림 등록
		FileReader fis = null;
		BufferedReader br = null;
		
		// 예외처리(try-catch 처리 => throws 방법도 존재)
		try {
			
			fis = new FileReader(fileName);
			br = new BufferedReader(fis);
			
			// 첫번째 데이터 입출력
			// System.out.println((char)fis.read()); // 자
			System.out.println((char)br.read()); // 
			
			// 한줄 입출력
			System.out.println(br.readLine()); // 자바
			
			int ch;
			// 전체 데이터 입출력
			while((ch = br.read()) != -1) {
				
				System.out.print((char)ch); // 자바
			}
			System.out.println();
			
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
		
		// 자원 반납
		finally {
			System.out.println("자원 반납");
			try {
				
				// 자원 미반납시(객체 활성화 시)
				if(fis != null) {
					fis.close();
				}
				if(br != null) {
					br.close();
				}
				
			} 
			catch (IOException e) {

				e.printStackTrace();
				
			}
		}
	}

}
