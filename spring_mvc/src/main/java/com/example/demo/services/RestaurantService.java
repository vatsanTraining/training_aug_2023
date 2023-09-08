package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import static java.util.stream.Collectors.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;

import com.example.demo.entity.Restaurant;
import com.example.demo.ifaces.CrudRepository;

@Service
public class RestaurantService {

	CrudRepository<Restaurant> repo;

	@Autowired
	public RestaurantService(CrudRepository<Restaurant> repo) {
		super();
		this.repo = repo;
	}
	
	public Map<String,Double> getNamesWithRating(){
		
		
		return this.repo.findAll()
				.stream()
				.collect(toMap(Restaurant::getRestaurantName, Restaurant::getRating));
		
	}
	
	public List<Restaurant> findAll(){
		
		return this.repo.findAll();
	}
	
    public Restaurant findById(int id){
		
		return this.repo.findById(id);
	}

	public int add(Restaurant entity) {
		return this.repo.add(entity);
	}
	
	
}

//Function<Restaurant,Map<String,Double>> mapper = (t) ->{
//	Map<String,Double> map = new HashMap<String, Double>();
//	 map.put(t.getRestaurantName(), t.getRating());
//	return map;
//};

