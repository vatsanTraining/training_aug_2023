package com.example.demo;

import java.util.*;
import java.util.function.*;

public class MethodReference {

	public static void main(String[] args) {

		List<String> names = List.of("Basker","Shiv","Abhi","Yash","Chand","Zubin");
		
		List<String> cityList = List.of("Bombay","Shimogo","Allahabad","Pune","Chandigar","Zaskar");
		
		Consumer<String> print = (element) -> System.out.println(element);
		
		
		names.forEach(print);
		
		cityList.forEach(print);

		
		names.forEach((element) -> System.out.println(element));
		
		names.forEach(System.out::println);
		
		
		Supplier<String> bestBook = ()-> "Hello World";
		
		System.out.println(bestBook.get());
		
	
	}

}
