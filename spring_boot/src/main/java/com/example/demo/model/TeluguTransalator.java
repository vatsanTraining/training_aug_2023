package com.example.demo.model;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.demo.ifaces.Transalator;

@Component
public class TeluguTransalator implements Transalator {

private Map<String,String> values;
	
	public TeluguTransalator() {
		super();
		System.out.println("Constructor Called");

		this.values = new HashMap<>();
		
		values.put("water", "neelu");
		values.put("rice", "beeyam");
		values.put("banana","aratipandu");
		values.put("thanks", "dhyanvadamulu");
		values.put("Potata","dhumpa" );
	}

	@Override
	public String transalate(String word) {
		return this.values.get(word);
	}

	

}
