package com.example.demo.services;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.entity.Restaurant;
import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.ifaces.Dao;

public class RestaurantService {

	
	private Dao<Restaurant> dao;

	public RestaurantService(Dao<Restaurant> dao) {
		super();
		this.dao = dao;
	}
	
	public boolean add(Restaurant obj) throws SQLException, ElementNotFoundException {
		
		return this.dao.add(obj);
	}
	
	public List<Restaurant> findAll() throws SQLException{
		
		return this.dao.findAll();
	}
}
