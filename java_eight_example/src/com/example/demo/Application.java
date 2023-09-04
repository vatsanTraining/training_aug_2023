package com.example.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Non functional implementing interface and creating instance
		
		Object obj;
		
		Thread thread = new Thread(new Task());
		
		thread.start();
		
		// Functional programming with Lambda
		
		Runnable target =    () ->{
			for(int i=0;i<=5;i++) {
				System.out.println(i);
			}
		};
		
		
		List<String> firstList = List.of("Ram","Shyam","Ganesh");
		
		List<String> secondList = List.of("Rani","Rashi","Rakhi");
		
		List<List<String>> combined =List.of(firstList,secondList);
		
		System.out.println(combined);
		
		
		List<String> flattend =   combined.stream()
				                    .flatMap((e)->e.stream())
				                    .collect(Collectors.toList());
		
		

		System.out.println(flattend);
		
		
		
	}

}
