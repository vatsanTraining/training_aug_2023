package com.training;

import com.training.ifaces.Cleanable;
import com.training.model.Car;
import com.training.model.Residence;

public class ProductFactory {

	
	public static Cleanable getObject(int key) {
		
//	 String env=System.getProperty("os.name");
//		
//	 if(env.equals("Windows 10"))
//	 {
//		 return new Residence(1800, "urban");
//	 }else {
//		 return new Car("seda");
//	 }
		
		if(key==1) {
			return new Residence(1800, "urban");
		} else {
			return new Car("Sedan");
		}
	
	}
}
