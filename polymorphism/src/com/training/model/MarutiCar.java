package com.training.model;

import com.training.ifaces.Automobile;

public class MarutiCar implements Automobile {

	@Override
	public String getColor() {
		return "Red";
	}

	@Override
	public String getModel() {
		return "Dezire";
	}

	@Override
	public double getPrice() {
		return 700000;
	}

}
