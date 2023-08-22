package com.training.utils;

import com.training.ifaces.Automobile;

public class Bike implements Automobile {

	@Override
	public String getColor() {
		// TODO Auto-generated method stub
		return "Yellow";
	}

	@Override
	public String getModel() {
		// TODO Auto-generated method stub
		return "John Deer";
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 1500000;
	}

}
