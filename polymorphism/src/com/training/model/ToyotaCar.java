package com.training.model;

import com.training.ifaces.Automobile;

public class ToyotaCar implements Automobile {

	@Override
	public String getColor() {
		return "black";
	}

	@Override
	public String getModel() {
		return "Camry";
	}

	@Override
	public double getPrice() {
		return 1200000;
	}

}
