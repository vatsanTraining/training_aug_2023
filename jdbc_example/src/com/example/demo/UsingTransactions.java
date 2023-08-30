package com.example.demo;
import java.util.*;

import com.example.demo.utils.ConnectionUtils;

import java.sql.*;
import java.sql.Date;
import java.time.LocalDate;
public class UsingTransactions {

	public static void main(String[] args) {

		
		String docSql = "insert into doctor values(?,?,?,?)";
		String patSql ="insert into patient values(?,?,?)";
		String restSql="insert into restaurant_aug_2023 values(?,?,?,?,?)";
		Savepoint point1=null;
		Connection con = ConnectionUtils.getMySqlConnection();
		try(
				PreparedStatement pstmt3 = con.prepareStatement(restSql);
				PreparedStatement pstmt2 = con.prepareStatement(patSql);
				PreparedStatement pstmt1 =con.prepareStatement(docSql)) {
			
			con.setAutoCommit(false);
			
			
			pstmt3.setInt(1, 2001);
			pstmt3.setString(2,"Asif");
			pstmt3.setString(3, "Indian");
			pstmt3.setDate(4,Date.valueOf(LocalDate.of(2010,1, 4)));
			pstmt3.setDouble(5, 4.2);

			int rowAddedInRestaurant=pstmt3.executeUpdate();
			
			System.out.println("Row Added in Restaurant"+rowAddedInRestaurant);

			point1 = con.setSavepoint();
			
			pstmt1.setInt(1, 2020);
			pstmt1.setString(2,"Manikandan" );
			pstmt1.setString(3,"dental");
			pstmt1.setInt(4, 200);
			
			int rowAddedInDoctor = pstmt1.executeUpdate();
			
			System.out.println("Row Added in Doctor"+rowAddedInDoctor);
			
			
			
			pstmt2.setInt(1, 600);
			pstmt2.setString(2, "Guru");
			pstmt2.setString(3, "chennai");
			
			int rowAddedInPatient = pstmt2.executeUpdate();
			
			System.out.println("Row Added in Patient"+rowAddedInPatient);

			con.commit();
			
		} catch (Exception e) {
			
			try {
				con.rollback(point1);
				con.commit();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
			e.printStackTrace();
			
		}
		
	}

}
