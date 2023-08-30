package com.example.demo.impl;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Restaurant;
import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.ifaces.Dao;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class RestaurantSqlImpl implements Dao<Restaurant> {
	
	private Connection con;
	

	public RestaurantSqlImpl(Connection con) {
		super();
		this.con = con;
	}

	//UPSERT
	@Override
	public boolean add(Restaurant obj) throws SQLException, ElementNotFoundException {
		
		
		
		String sql ="insert into restaurant_aug_2023 values(?,?,?,?,?)";
		
		int rowAffected =0;
		
		try (PreparedStatement pstmt = con.prepareStatement(sql)){
			
			LocalDate date = obj.getOpeningDate();
			java.sql.Date openDate = Date.valueOf(date);
			
			pstmt.setInt(1, obj.getId());
			pstmt.setString(2,obj.getRestaurantName() );
			pstmt.setString(3, obj.getCuisine());
			pstmt.setDate(4,openDate);
			pstmt.setDouble(5, obj.getRating());
			
			rowAffected = pstmt.executeUpdate();
			
		
		} catch (SQLException e) {
			throw e;
		}
		
		return rowAffected==1?true:false;
		
	}

	
	
	@Override
	public List<Restaurant> findAll()  throws SQLException{

		String sql = "select * from restaurant_aug_2023";
		
		List<Restaurant> list = new ArrayList<>();

		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			
		ResultSet rs =pstmt.executeQuery();
		
		
		 while(rs.next()) {    
			 
			 
		  Restaurant element = mapRowToObject(rs);
		  list.add(element);
			 
		 }
			
		} catch (SQLException e) {
			// TODO: handle exception
			throw e;
		}
		
		return list;
	}

	@Override
	public Restaurant findById(int id) throws ElementNotFoundException,SQLException {
		
		String sql = "select * from restaurant_aug_2023 where id =?";
		
		Restaurant element= null;

		try (PreparedStatement pstmt = con.prepareStatement(sql)) {
			
			pstmt.setInt(1, id);
			ResultSet rs = pstmt.executeQuery();
			
			if(rs.next()) {
									 
				  element = mapRowToObject(rs);
			}
			
			if(element==null) {
				throw new ElementNotFoundException("Element with id not fund",LocalDateTime.now(),"ERR-103");
			}
			
		} catch (Exception e) {
			throw e;
		}
		
		return element;
	}

	@Override
	public boolean remove(int id) throws ElementNotFoundException {

		return false;
	}

	private Restaurant mapRowToObject(ResultSet rs) throws SQLException {
		
		int  id = rs.getInt("id");
	    String restaurantName = rs.getString("restaurant_name");
		String cusine=	 rs.getString("cuisine");
		double rating =	 rs.getDouble("rating");
		Date date =rs.getDate("opening_date");

		  return new Restaurant(id, restaurantName, cusine,date.toLocalDate(), rating);

	}

	@Override
	public int update(Restaurant obj) throws Exception {

		String sql = "update restaurant_aug_2023 set restaurant_name=?, cuisine=?,opening_date=?,rating=? where id =?";
		
		int rowAffected=0;
		
		try(PreparedStatement pstmt = con.prepareStatement(sql)) {
			LocalDate date = obj.getOpeningDate();
			java.sql.Date openDate = Date.valueOf(date);
			
			pstmt.setString(1,obj.getRestaurantName() );
			pstmt.setString(2, obj.getCuisine());
			pstmt.setDate(3,openDate);
			pstmt.setDouble(4, obj.getRating());
			pstmt.setInt(5, obj.getId());

			rowAffected = pstmt.executeUpdate();
					
		} catch (Exception e) {
			throw e;
		}
		
		return rowAffected;
	}
}
