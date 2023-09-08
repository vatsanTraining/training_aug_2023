package com.example.demo.services;

import org.springframework.context.annotation.Conditional;

import com.example.demo.ifaces.Transalator;

public class TransalatorService {

	
	private Transalator transalator;

	public TransalatorService() {
		super();
		System.out.println("Constructor Called");

	}

	public TransalatorService(Transalator transalator) {
		super();
		this.transalator = transalator;
	}
	
	
	public Transalator getTransalator() {
		return transalator;
	}

	public void setTransalator(Transalator transalator) {
		this.transalator = transalator;
	}

	public String transalate(String word) {
		
		return this.transalator.transalate(word.toLowerCase());
	}
}
