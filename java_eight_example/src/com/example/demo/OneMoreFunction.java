package com.example.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class OneMoreFunction {

	public static void main(String[] args) {

		
		var convFactor =80.00;
		
		
		Function<Double, Double> inrToUsd = (inr) -> { 
			
			//convFactor = convFactor+5.0;
			double result =inr /convFactor;
			return result;
			
		 };
		
		
		
		System.out.println(inrToUsd.apply(45.00));
		
		
		Comparator<Company> comp = 
				 (var c1, var c2) -> c1.getCompanyName().compareTo(c2.getCompanyName());
		
		Set<Company> compList = new TreeSet(comp);
		
		compList.add(new Company("ndtv", "Public Ltd", 200));
		compList.add(new Company("tv9", "Private Ltd", 300));
		compList.add(new Company("suntv", "Public Ltd", 500));
		
		
		for(Company eachCompany :compList) {
			System.out.println(eachCompany);
		}
	}

}
