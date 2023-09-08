package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.Dao;
import com.example.demo.dao.RestaurantDaoImpl;
import com.example.demo.model.Restaurant;

@Service
public class RestaurantService {

	
	private Dao<Restaurant> dao ;

	
	
	

    @Autowired
	public RestaurantService(Dao<Restaurant> dao) {
		super();
		this.dao = dao;
	}



	public Dao<Restaurant> getDao() {
		return dao;
	}



	

	
	
	
	
}
