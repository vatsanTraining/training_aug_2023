package com.example.ifaces;

import java.util.*;

import com.example.model.Invoice;
public interface InvoiceDao {

	
	Map<String,List<Invoice>> findAll();
}
