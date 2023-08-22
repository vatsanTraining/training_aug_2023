package com.training.model;

import com.training.ifaces.Automobile;

public class KiaCar implements Automobile {

	@Override
	public String getColor() {
		return "Grey";
	}

	@Override
	public String getModel() {
		return "sonnet";
	}

	@Override
	public double getPrice() {
		return 1100000;
	}

}
