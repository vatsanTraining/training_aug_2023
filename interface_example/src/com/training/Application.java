package com.training;

import com.training.ifaces.Function;
import com.training.utils.CelToFaren;
import com.training.utils.UsdToInr;

public class Application {

	public static void print(Function obj,double arg) {
		
		if(obj instanceof UsdToInr) {
			System.out.println("Currency Converter Called");
		} else {
			System.out.println("Temprature Converter Called");
		}
		
		System.out.println(obj.apply(arg));
		
	}
	public static void main(String[] args) {

		
		print(new CelToFaren(),100);
		print(new UsdToInr(),32);
	}

}
