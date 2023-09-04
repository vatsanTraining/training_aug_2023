package com.example.demo;

public class Task implements Runnable {

	@Override
	public void run() {

		for(int i=0;i<=5;i++) {
			System.out.println(i);
		}
	}

}
