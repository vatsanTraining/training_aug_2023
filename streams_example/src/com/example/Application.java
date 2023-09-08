package com.example;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.example.ifaces.InvoiceDao;
import com.example.impl.InvoiceDaoImpl;
import com.example.services.InvoiceStreamService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		InvoiceDao dao = new InvoiceDaoImpl();

		InvoiceStreamService service = new InvoiceStreamService(dao.findAll());
		
		
		service.getProductsByPrice("ram").forEach(System.out::println);
		
		service.getProductsByPrice("shyam").forEach(System.out::println);
		
		Map<LocalDate,Double>  map= service.getCustomerNameAndAmount("ram", e -> e.getInvoiceAmount()>3000);
		
		Set<Map.Entry<LocalDate,Double>> setView= map.entrySet();
		
	
		 for(Map.Entry<LocalDate, Double> eachItem :setView) {
			 
			 System.out.println(eachItem.getKey() + ","+ eachItem.getValue());
		 }
		
		 List<String> names = List.of("Ramesh","Suresh","Magesh","Rajesh");
		 
		
	}

}
