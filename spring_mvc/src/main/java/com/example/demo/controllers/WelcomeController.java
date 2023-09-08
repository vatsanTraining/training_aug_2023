package com.example.demo.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.services.RestaurantService;

@Controller
@RequestMapping("/restaurants")
public class WelcomeController {
	
	
	private RestaurantService service;
	
	

	@Autowired
	public WelcomeController(RestaurantService service) {
		super();
		this.service = service;
	}

	@RequestMapping(value = "/greet" ,method = RequestMethod.GET)
	@ResponseBody
	public String greet() {
		
		return "Restaurant Management System";
	}
	
	@RequestMapping(value = "/bye" ,method = RequestMethod.GET)
	@ResponseBody
	public String bye() {
		
		return "<h1 style='text-align:center;'>Thanks for visiting</h1>";
	}
	
	@RequestMapping(value = "/list" ,method = RequestMethod.GET)
	@ResponseBody
	public String list() {
		
		  Map<String, Double>  details =service.getNamesWithRating();
		
		   String list = details.keySet().toString();
		   
		return "<h4 style='text-align:center;'>"+list+"</h4>";
	}
}
