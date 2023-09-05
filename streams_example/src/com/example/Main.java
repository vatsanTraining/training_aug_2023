package com.example;

import java.util.List;
import java.util.Map;

import com.example.impl.InvoiceDaoImpl;
import com.example.model.Invoice;
import static java.util.stream.Collectors.*;
public class Main {

	public static void main(String[] args) {

		Map<String, List<Invoice>> map =
				
				 new InvoiceDaoImpl().findAll();
		
		
		List<Invoice> invList  =map.values().stream().flatMap(e -> e.stream()).collect(toList());
	
		 invList.forEach(System.out::println);
	
	}

}
