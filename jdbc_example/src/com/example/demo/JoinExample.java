package com.example.demo;
import java.sql.*;

import com.example.demo.utils.ConnectionUtils;
public class JoinExample {

	public static void main(String[] args) {
		
		
		Connection con = ConnectionUtils.getMySqlConnection();
		
				
		String sql = "SELECT sys.doctor.doctor_name, sys.patient.patient_name from sys.doctor "
				+ "LEFT OUTER JOIN sys.patient on sys.doctor.patient_ref = sys.patient.patient_id "
				+ "where patient.patient_id =?";
		
		try(PreparedStatement pstmt= con.prepareStatement(sql)) {
			
			pstmt.setInt(1, 200);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("Doctor"+rs.getString(1));
				System.out.println("Patient"+rs.getString(2));

			}
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
}
