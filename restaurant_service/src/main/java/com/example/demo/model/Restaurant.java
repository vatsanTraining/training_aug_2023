package com.example.demo.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;


public class Restaurant {

	private int id;
	private String restaurantName;
	private String cuisine;
	private LocalDate openingDate;
    private double rating;
    
    
	public Restaurant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Restaurant(int id, String restaurantName, String cuisine, LocalDate openingDate, double rating) {
		super();
		this.id = id;
		this.restaurantName = restaurantName;
		this.cuisine = cuisine;
		this.openingDate = openingDate;
		this.rating = rating;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRestaurantName() {
		return restaurantName;
	}
	public void setRestaurantName(String restaurantName) {
		this.restaurantName = restaurantName;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public LocalDate getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(LocalDate openingDate) {
		this.openingDate = openingDate;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", cuisine=" + cuisine + ", openingDate="
				+ openingDate + ", rating=" + rating + "]";
	}
    
    
}
