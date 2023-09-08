package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Restaurant;
import com.example.demo.services.RestaurantService;

@RestController
@RequestMapping("/api/v1/restaurants")
@CrossOrigin(origins = "*")
public class RestaurantController {

	
	private RestaurantService service;

	@Autowired
	public RestaurantController(RestaurantService service) {
		super();
		this.service = service;
	}
	
	@GetMapping
	public List<Restaurant> findAll(){
		
		return this.service.findAll();
	}
	
	@PostMapping
	public ResponseEntity<String>  add(@RequestBody Restaurant entity){
		
		int rowAdded = this.service.add(entity);
		
		return ResponseEntity.status(201).body(rowAdded +" Row Added");
	}
	
		
	@GetMapping(path = "/{id}")
    public Restaurant findById(@PathVariable int id  ){
		
		return this.service.findById(id);
	}
	
	
}
