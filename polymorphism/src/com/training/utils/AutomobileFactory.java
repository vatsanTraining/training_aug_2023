package com.training.utils;

import com.training.ifaces.Automobile;
import com.training.model.KiaCar;
import com.training.model.MarutiCar;
import com.training.model.ToyotaCar;

public class AutomobileFactory {

	public Automobile getProduct(int key) {
		
		switch (key) {
		case 1:
			return new MarutiCar();
		case 2:
			return new KiaCar();
		case 3:
			return new ToyotaCar();
		default:
			return null;
		}
	}
}
