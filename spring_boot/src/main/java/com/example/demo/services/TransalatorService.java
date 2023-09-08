package com.example.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Transalator;

@Component("service")
public class TransalatorService {

	
	private Transalator teluguTransalator;
	
	@Autowired
	@Qualifier("hindiTransalator")
	private Transalator hindiTransalator;

	public TransalatorService() {
		super();
		System.out.println("Constructor Called");

	}

	public TransalatorService(Transalator teluguTransalator) {
		super();
		this.teluguTransalator = teluguTransalator;
	}
	
	
	public Transalator getTransalator() {
		return this.teluguTransalator;
	}

	@Autowired
	@Qualifier("teluguTransalator")
	
	public void setTransalator(Transalator teluguTransalator) {
		this.teluguTransalator = teluguTransalator;
	}

	public String transalate(String word) {
		
		return this.teluguTransalator.transalate(word.toLowerCase()) +"," +this.hindiTransalator.transalate(word);
		
	}
}
