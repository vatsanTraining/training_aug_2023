package com.example.demo;

public class PrintNumbers implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
	
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}

}
