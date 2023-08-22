package com.training.utils;

import com.training.ifaces.Automobile;

public class CombinedAutoFactory extends AutomobileFactory {

	@Override
	public Automobile getProduct(int key) {
		
		 return  (key==4)? new Bike(): super.getProduct(key);
	
	}

	
}
