package com.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.example.model.Invoice;

public class SortingExample {

	public static void main(String[] args) {

		List<Invoice> ramsList = new ArrayList<>();
		
		 ramsList.add(new Invoice(101,LocalDate.of(2000, 10, 12),"Ram",5600));
		 ramsList.add(new Invoice(201,LocalDate.of(2000, 8, 21),"Ram",6000));
		 ramsList.add(new Invoice(105,LocalDate.of(2000, 7, 2),"Ram",900));
		 ramsList.add(new Invoice(110,LocalDate.of(2000, 6, 11),"Ram",1600));
		
		 
		// ramsList.stream().filter(e ->e.getInvoiceNumber()<200).map(e->e.getCustomerName()).forEach(System.out::println);
		 
		 ramsList.stream()
		         .sorted(Comparator.comparing(Invoice::getInvoiceNumber).reversed())
		         .forEach(System.out::println);
		 
		 
	}

}
