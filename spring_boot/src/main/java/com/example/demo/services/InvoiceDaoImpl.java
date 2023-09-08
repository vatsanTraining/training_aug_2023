package com.example.demo.services;
import java.time.LocalDate;
import java.util.*;

import org.springframework.stereotype.Component;

import com.example.demo.ifaces.InvoiceDao;
import com.example.demo.model.Invoice;

@Component
public class InvoiceDaoImpl implements InvoiceDao {

	private Map<String, List<Invoice>> listByCustomer;
	
	

	public InvoiceDaoImpl() {
		super();
		
		this.listByCustomer=new HashMap<>();
		
		List<Invoice> ramsList = new ArrayList<>();
		
		 ramsList.add(new Invoice(101,5600));
		 ramsList.add(new Invoice(201,6000));
		 ramsList.add(new Invoice(105,900));
		 ramsList.add(new Invoice(110,1600));
		 
		
		this.listByCustomer.put("ram", ramsList);
		
		
	}



	@Override
	public Map<String, List<Invoice>> findAll() {

		return this.listByCustomer;
	}

	
	
}
