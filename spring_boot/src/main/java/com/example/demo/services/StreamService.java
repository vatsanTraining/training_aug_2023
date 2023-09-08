package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.Invoice;

@Component
public class StreamService {

	private InvoiceDaoImpl dao;

	@Autowired
	public StreamService(InvoiceDaoImpl dao) {
		super();
		this.dao = dao;
	}
	
	public List<Invoice> findAll(){
		
		return this.dao.findAll().get("ram");
	}
	
	
}
