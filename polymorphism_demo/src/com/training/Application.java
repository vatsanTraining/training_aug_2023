package com.training;

import com.training.ifaces.Cleanable;

public class Application {

	public static void main(String[] args) {

		Cleanable product = ProductFactory.getObject(2);
		
		System.out.println(product.findClearningCharges());
		
	}

}
