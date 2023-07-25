package com.java.jse;

import java.io.IOException;
import java.sql.SQLException;

public class OrderInterfaceImpl implements OrderInterface{

	// 부모 클래스 메서드와 다른계층의 예외처리를 가질수 없다
	// 부모(조상) 클래스(인터페이스)보다 더 넓은(포괄적인, 상위의) 예외클래스를 가질수 없다
	
	@Override
	// public void order() throws ClassCastException { // 1,2,3) 사용 가능
	public void order() throws Exception { // 1) 사용가능 2,3) 오류 발생
	// public void order() throws SQLException { // 3) 사용가능
	// public void order() throws NumberFormatException { // 1) 사용가능 2,3) 사용 가능
	// public void order() throws IOException { // 1) 사용가능 2,3) 오류 발생
		
	}
	
}