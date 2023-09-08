package com.example.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Restaurant;

@Repository
public class RestaurantDaoImpl implements Dao<Restaurant> {

	private List<Restaurant> list;
	 
    @Autowired
	public RestaurantDaoImpl(List<Restaurant> list) {
		super();
		this.list = list;
	}

    @Override
	public List<Restaurant> findAll() {
		return this.list;
	}
	 
	 
}
