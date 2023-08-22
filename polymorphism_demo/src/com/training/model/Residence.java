package com.training.model;

import com.training.ifaces.Cleanable;

public class Residence implements Cleanable {
	
	
	private double areaInSqft;
	private String location;

	
	public Residence() {
		super();
	}
	public Residence(double areaInSqft, String location) {
		super();
		this.areaInSqft = areaInSqft;
		this.location = location;
	}
	public double getAreaInSqft() {
		return areaInSqft;
	}


	public void setAreaInSqft(double areaInSqft) {
		this.areaInSqft = areaInSqft;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	@Override
	public double findClearningCharges() {
		
		double charge = 1000.0;
		
		if(location.toLowerCase().equals("urban") && areaInSqft<1000) {
			charge=2000;
		} 
		return charge;
	}

}
