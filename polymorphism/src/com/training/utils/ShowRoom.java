package com.training.utils;

import com.training.ifaces.Automobile;

public class ShowRoom {

	
	public void printQuote(Automobile auto) {
		
		System.out.println("Price :="+auto.getPrice());
		System.out.println("Color :="+auto.getColor());
		System.out.println("Model :="+auto.getModel());
			
	}
	
	public Automobile getQuote(int choice) {

		AutomobileFactory factory=new AutomobileFactory();
		 if(choice>3) {
  	      factory  = new CombinedAutoFactory();
		 }
	  return factory.getProduct(choice);
	
	
	}
}
