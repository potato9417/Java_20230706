package com.java.jse;

import java.sql.SQLException;

public interface OrderInterface {
	
	void order() throws Exception; // 경우1
	// void order() throws ClassCastException; // 경우2
	// void order() throws SQLException; // 경우3
}
