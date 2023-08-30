package com.example.demo;

import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Restaurant;
import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.factory.Factory;
import com.example.demo.ifaces.Dao;
import com.example.demo.impl.RestaurantInMemoryImpl;
import com.example.demo.impl.RestaurantSqlImpl;
import com.example.demo.services.RestaurantService;
import com.example.demo.utils.ConnectionUtils;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Dao<Restaurant> dao = Factory.getDaoImpl(1);
		
		RestaurantService service = new RestaurantService(dao);
		
		try {
			System.out.println("Is Added:=>"+service.add(new Restaurant(9823, "Best Coffee", "coffee", LocalDate.now(), 4.2)));
			
			
			List<Restaurant> list = service.findAll();
			
			for(Restaurant eachRestaurant: list) {
				System.out.println(eachRestaurant);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ElementNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
