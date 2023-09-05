package com.example.demo;

import com.example.demo.func.Display;

import java.util.function.*;

public class Main {

	public static void main(String[] args) {

				
		Display<Double> print = (arg) -> System.out.println(arg *2.0);
		
		print.show(45.0);
		
		System.out.println(print.greet());
		
		Predicate<Double> testAge = (var age) ->  age >18;
		
		testAge.test(23.0);
		
		Function<String, Integer> strLength =  (str) -> str.length();
		
	    System.out.println(strLength.apply("World"));
	
		
	}

}
