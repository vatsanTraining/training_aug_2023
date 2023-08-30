package com.example.demo.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.entity.Restaurant;
import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.ifaces.Dao;

public class RestaurantInMemoryImpl implements Dao<Restaurant> {

	
	private List<Restaurant> list;
	
	public RestaurantInMemoryImpl() {
		super();
		
		this.list=new ArrayList<>();
	}

	@Override
	public boolean add(Restaurant obj) throws SQLException, ElementNotFoundException {
		return this.list.add(obj);
	}

	@Override
	public List<Restaurant> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return this.list;
	}

	@Override
	public Restaurant findById(int id) throws ElementNotFoundException, SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean remove(int id) throws ElementNotFoundException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int update(Restaurant obj) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
