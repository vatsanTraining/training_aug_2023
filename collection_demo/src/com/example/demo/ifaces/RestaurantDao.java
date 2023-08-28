package com.example.demo.ifaces;

import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.model.Restaurant;
import java.util.*;
public interface RestaurantDao {

	public boolean add(Restaurant obj);
	public List<Restaurant> findAll();
	public Restaurant findById(int id) throws ElementNotFoundException;
	public boolean remove(int id) throws ElementNotFoundException;
}
