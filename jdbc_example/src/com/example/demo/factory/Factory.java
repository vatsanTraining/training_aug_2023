package com.example.demo.factory;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.Dao;
import com.example.demo.impl.RestaurantInMemoryImpl;
import com.example.demo.impl.RestaurantSqlImpl;
import com.example.demo.utils.ConnectionUtils;

public class Factory {

	public static Dao<Restaurant> getDaoImpl(int key) {

		switch (key) {
		case 1:
			return new RestaurantSqlImpl(ConnectionUtils.getMySqlConnection());
			
		case 2:
			return new RestaurantInMemoryImpl();
		default:
			return null;
		}
	}

}
