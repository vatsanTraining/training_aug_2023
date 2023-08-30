package com.example.demo;
import java.util.*;

import com.example.demo.entity.Patient;
import com.example.demo.entity.Restaurant;

import java.sql.*;
import java.time.LocalDate;

public class ImmutableCollection {

	public static void main(String[] args) {

		
		
		Set<Restaurant> list = Set.of(new Restaurant(101,"haa","south",LocalDate.now(),4.2),
										new Restaurant(102,"ooh","north",LocalDate.now(),4.1)
										);
		
		Map<String,Restaurant> map = 
				
				Map.of("Abc",new Restaurant(), "KYC",new Restaurant());
		
		System.out.println("List Type:="+ list.getClass().getName());
		
		System.out.println("Key Abc"+map.get("Abc"));
		
		System.out.println(list);
		
		//list.add(new Restaurant());
		
	}

}
