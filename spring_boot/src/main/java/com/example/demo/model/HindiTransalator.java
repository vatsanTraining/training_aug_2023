package com.example.demo.model;

import com.example.demo.ifaces.Transalator;

import java.util.*;

import org.springframework.stereotype.Component;

@Component
public class HindiTransalator implements Transalator {

	
	private Map<String,String> values;
	
	
	public HindiTransalator() {
		super();
		
		System.out.println("Constructor Called");
		
		this.values = new HashMap<>();

		values.put("water", "pani");
		values.put("rice", "chawl");
		values.put("banana","kela");
		values.put("thanks", "dhanyavad");
		values.put("Potata","aloo" );
	}

	@Override
	public String transalate(String word) {
		return this.values.get(word);
	}

}
