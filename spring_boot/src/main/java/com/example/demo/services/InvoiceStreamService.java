package com.example.demo.services;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Invoice;

import static java.util.stream.Collectors.*;

import java.time.LocalDate;

@Component

public class InvoiceStreamService {

	
	Map<String,List<Invoice>> invoiceMap;

	List<Invoice> invList;
	
	@Autowired
	private InvoiceDaoImpl dao ;
	
	
	public InvoiceStreamService() {
		super();
		// TODO Auto-generated constructor stub
	}


	public InvoiceStreamService(Map<String, List<Invoice>> invoiceMap) {
		super();
		this.invoiceMap = invoiceMap;
		
		this.invList=dao.findAll().values().stream().flatMap(e -> e.stream()).collect(toList());
		
	}
	
	
	public List<Invoice> getProductsByPrice(String custName){
		
	//	List<Invoice> ramsList = invoiceMap.get(custName);
		
		// select * from Invoice where invoiceAmount >4000
		
//		List<Invoice> list = ramsList.stream()
//				     .filter(e ->e.getInvoiceAmount()>4000).collect(toList());
		
		return this.invList;
	}
	
	public List<Invoice> getProductsByPrice(String custName,Predicate<Invoice> condition){
		
		
		return invoiceMap.get(custName).stream().filter(condition).collect(toList());

	}
	
//	public List<String> getCustomerNames(String custName,Predicate<Invoice> condition){
//		
////		return invoiceMap.get(custName).stream().filter(condition)
////				 .map(element -> element.getCustomerName()).collect(toList());
//	}
	
//    public List<String> getCustomerNames(){
		
//	return this.invList.stream().map(e -> e.getCustomerName()).collect(toList());
		 
	//}
//	public Map<LocalDate,Double> getCustomerNameAndAmount(String custName, Predicate<Invoice> condition){
//		
////		return invoiceMap.get(custName).stream().filter(condition)
////				       .collect(toMap(Invoice::getInvoiceDate, Invoice::getInvoiceAmount));
//	}
	
	public List<Invoice> sortByProp(){
		
		return null;
	}
	
//	public double findInvoiceByMaxAmount(String custName) {
//	
////	Optional<Double> optional=	invoiceMap.get(custName)
////			                          	  .stream()
////			                              .map(element -> element.getInvoiceAmount())
////			                              .max(Comparator.comparing(Double::doubleValue));
////	
////		 return optional.get();
////		 
//		 
//		 Optional<Invoice> optional=	invoiceMap.get(custName)
//             	  .stream()
//                 .max(Comparator.comparing(Invoice::getInvoiceAmount));
//
//             return optional.get().getInvoiceAmount();
//	}
//
	
	
	
}
