package com.example.demo;

public class CountNumbers {

	public CountNumbers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int countNumber(int countTo) {
		
		int total =0;
		
		for(int i=0;i<=countTo;i++) {
			total+=i;
		}
		
		return total;
	}
}
