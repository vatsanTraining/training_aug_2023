package com.example.demo.utils;

import java.sql.*;

public class ConnectionUtils {

	
	private static Connection con;
	
	
	public static Connection getMySqlConnection() {
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sys", "root", "srivatsan");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	public static void closeConnection() {
		
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
