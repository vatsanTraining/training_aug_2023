package com.example.impl;
import java.time.LocalDate;
import java.util.*;

import com.example.ifaces.InvoiceDao;
import com.example.model.Invoice;
public class InvoiceDaoImpl implements InvoiceDao {

	private Map<String, List<Invoice>> listByCustomer;
	
	

	public InvoiceDaoImpl() {
		super();
		
		this.listByCustomer=new HashMap<>();
		
		List<Invoice> ramsList = new ArrayList<>();
		
		 ramsList.add(new Invoice(101,LocalDate.of(2000, 10, 12),"Ram",5600));
		 ramsList.add(new Invoice(201,LocalDate.of(2000, 8, 21),"Ram",6000));
		 ramsList.add(new Invoice(105,LocalDate.of(2000, 7, 2),"Ram",900));
		 ramsList.add(new Invoice(110,LocalDate.of(2000, 6, 11),"Ram",1600));
		 
		List<Invoice> shyamList = new ArrayList<>();
		
		shyamList.add(new Invoice(401,LocalDate.of(2001, 10, 12),"Shyam",15600));
		shyamList.add(new Invoice(402,LocalDate.of(2002, 1, 21),"Shyam",26000));
		shyamList.add(new Invoice(405,LocalDate.of(2002, 4, 2),"Shyam",1900));
		shyamList.add(new Invoice(410,LocalDate.of(2002, 3, 11),"Shyam",4600));
		
		this.listByCustomer.put("ram", ramsList);
		
		
		this.listByCustomer.put("shyam", shyamList);
	}



	@Override
	public Map<String, List<Invoice>> findAll() {

		return this.listByCustomer;
	}

	
	
}
