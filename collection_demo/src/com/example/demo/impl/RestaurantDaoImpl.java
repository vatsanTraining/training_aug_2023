package com.example.demo.impl;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.demo.exceptions.ElementNotFoundException;
import com.example.demo.ifaces.RestaurantDao;
import com.example.demo.model.Restaurant;

public class RestaurantDaoImpl implements RestaurantDao {

	private List<Restaurant> list;
	
	
	public RestaurantDaoImpl() {
		super();
       this.list = new ArrayList<>();   // if you miss this line list will be null 
	}

	@Override
	public boolean add(Restaurant obj) {
		return this.list.add(obj);
	}

	@Override
	public List<Restaurant> findAll() {
		
		return this.list;
	}

	@Override
	public Restaurant findById(int id) throws ElementNotFoundException {

		
		Iterator<Restaurant> itr = list.iterator();
		Restaurant found = null;
		
		while(itr.hasNext()) {
			 
			 Restaurant obj = itr.next();
             if(obj.getId()==id) {
            	 found = obj;
             }
		 }
		  if(found==null) {
			  throw new ElementNotFoundException("Element with given id not found", LocalDateTime.now(), "ERR-101");
		  }
		
		return found;
	}

	@Override
	public boolean remove(int id) throws ElementNotFoundException {

		Restaurant found = findById(id);
		
		 return this.list.remove(found);
		 
	}

}
