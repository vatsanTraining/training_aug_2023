package com.example.demo;
import java.sql.*;

import com.example.demo.utils.ConnectionUtils;
public class MetaData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Connection con = ConnectionUtils.getMySqlConnection();
		
		String sql = "select * from restaurant_aug_2023";
		
		    
		try(PreparedStatement pstmt = con.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery()) {
			
		  DatabaseMetaData dbmeta = con.getMetaData();
		  
		  System.out.println("Rdbms Name" +dbmeta.getDatabaseProductName());
		  System.out.println("JDBC Driver Name" +dbmeta.getDriverName());
		  
		  

		  
		  ResultSetMetaData rsmeta	= rs.getMetaData();
			
		  System.out.println("Table Name" +rsmeta.getTableName(4));
		  System.out.println("Number of Columns:=>"+ rsmeta.getColumnCount());
		  
		  
			while(rs.next()) {
			System.out.println(rs.getString(2));
			}
		} catch (Exception e) {
			 e.printStackTrace();;
		}
	}

}
