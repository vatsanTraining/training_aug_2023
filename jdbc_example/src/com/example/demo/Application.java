package com.example.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Restaurant;
import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.ifaces.Dao;
import com.example.demo.impl.RestaurantSqlImpl;
import com.example.demo.utils.ConnectionUtils;

public class Application {

	public static void main(String[] args) {

		Connection con =ConnectionUtils.getMySqlConnection();
		
		Dao<Restaurant> dao = new RestaurantSqlImpl(con);
		
		try {
		
//			System.out.println("is Row Added "+
//			        dao.add(new Restaurant(1024, "BBQ Hyd", "multicuisine", LocalDate.of(2021, 12, 26), 4.6)));
//			
			
			System.out.println("Row Updated :=>"+ dao.update(new Restaurant(1024, "BBQ Hyd", "multicuisine", LocalDate.of(1992, 12, 16), 4.2)));
			
			List<Restaurant> list = dao.findAll();
			
			for(Restaurant eachRestaurant : list) {
				System.out.println(eachRestaurant);
			}
			
			System.out.println("Find By id");
			
			System.out.println(dao.findById(1021));
			
		} catch (Exception  e) {
			e.printStackTrace();
		}
		
		ConnectionUtils.closeConnection();
	}

}
