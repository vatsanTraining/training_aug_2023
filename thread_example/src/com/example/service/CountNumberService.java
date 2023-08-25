package com.example.service;

import com.example.demo.CountNumbers;

public class CountNumberService implements Runnable {
	
	private int countTo;
	private String threadName;
	private CountNumbers count;
	

	public CountNumberService(int countTo, String threadName) {
		super();
		this.countTo = countTo;
		this.threadName = threadName;
		
		 count = new CountNumbers();
		
		Thread thread = new Thread(this, threadName);
		
		thread.start();
	}



	@Override
	public void run() {

		System.out.println("Result From :=>"+Thread.currentThread().getName()+"=>:"+count.countNumber(countTo));
		
	}

	
}
