package com.example.demo.services;

import java.util.List;

import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.ifaces.RestaurantDao;
import com.example.demo.impl.RestaurantDaoImpl;
import com.example.demo.model.Restaurant;

public class RestaurantService {

	private RestaurantDao dao;

	public RestaurantService() {
		super();

		this.dao = new RestaurantDaoImpl();
	}
	
	
	public RestaurantService(RestaurantDao dao) {
		super();
		this.dao = dao;
	}


	public boolean add(Restaurant obj) {
		
		return this.dao.add(obj);
	}

public boolean add(Restaurant ...list) {
		
	boolean result =false;
	
	for(Restaurant eachRestaurant : list) {
		
		 result =this.dao.add(eachRestaurant);
		 
		 if(!result) {
			 throw new RuntimeException("Element Already Exisit");
		 }
		 
	}
	return result;
	}
	

	public List<Restaurant> findAll() {
		return this.dao.findAll();
	}

	public Restaurant findById(int id) throws ElementNotFoundException {
		
		try {
			return this.dao.findById(id);
		} catch (Exception e) {
			//throw e;
			throw new RuntimeException(e.getMessage());
		}
	}
	
}
