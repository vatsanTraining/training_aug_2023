package com.example.demo;

import java.util.List;
import java.util.function.Consumer;

public class UsingParallelStream {

	
	public static void print() {
		
		List<String> cityList =List.of("Ambala","Bhopal","Madurai","Pune","Simla");
		
		
		System.out.println("Serial Stream");
		
		Consumer<String> consumer = (e) ->{
			System.out.println(e);
			System.out.println("Thred:=>"+Thread.currentThread().getName());
		
		};
		
		cityList.stream().forEach(consumer);
		
		
		System.out.println("Parallel Stream");
		
		
		cityList.parallelStream().forEach(consumer);

		
		
	}
}
