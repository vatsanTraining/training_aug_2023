package com.training.model;

import com.training.ifaces.Cleanable;

public class Car implements Cleanable {
	
	
	 private String model ;  
	 

	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Car(String model) {
		super();
		this.model = model;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public double findClearningCharges() {
		// TODO Auto-generated method stub
		return 500;
	}

}
