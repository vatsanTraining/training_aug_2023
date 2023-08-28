package com.example.demo.model;

import java.time.LocalDate;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {

	
	private int id;
	private String restaurantName;
	private String cuisine;
	private LocalDate openingDate;
    private double rating;
    
	public Restaurant() {
		super();
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
	public int hashCode() {
		return Objects.hash(cuisine, id, openingDate, rating, restaurantName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Restaurant other = (Restaurant) obj;
		return Objects.equals(cuisine, other.cuisine) && id == other.id
				&& Objects.equals(openingDate, other.openingDate)
				&& Double.doubleToLongBits(rating) == Double.doubleToLongBits(other.rating)
				&& Objects.equals(restaurantName, other.restaurantName);
	}
	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", restaurantName=" + restaurantName + ", cuisine=" + cuisine + ", openingDate="
				+ openingDate + ", rating=" + rating + "]";
	}
	@Override
	public int compareTo(Restaurant otherObj) {

		if(this.rating > otherObj.rating) return -1;
		if(this.rating < otherObj.rating) return 1;
		return 0;
	}
	
	
    
}
