package com.example.demo.ifaces;

import java.util.*;

import com.example.demo.model.Invoice;
public interface InvoiceDao {

	
	Map<String,List<Invoice>> findAll();
}
