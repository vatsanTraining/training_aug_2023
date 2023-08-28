package com.example.demo;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.model.Restaurant;
import com.example.demo.services.RestaurantService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RestaurantService service = new RestaurantService();
		
		 service.add(new Restaurant(1010, "Sagar Restaurant", "multi",LocalDate.of(2021, Month.APRIL, 12), 4.2));
		 
		 service.add(new Restaurant(2010, "Balaji Bhavan", "south",LocalDate.of(1998, Month.MAY, 23), 4.1));

		List<Restaurant> list= service.findAll();

		for(Restaurant eachRestaurant : list) {
			System.out.println(eachRestaurant
					);
		}
		
		try {
			System.out.println("Found Element :=>"+ service.findById(1012));
		} catch (ElementNotFoundException e) {
			e.printStackTrace();
		}
		
	}

}
