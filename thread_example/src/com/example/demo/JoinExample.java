package com.example.demo;

import java.io.IOException;

class ConsoleInput implements Runnable{

	@Override
	public void run() {
		
		System.out.println("Start Reading");

		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished Reading");
	}
	
	
}

public class JoinExample {

	public static void main(String[] args) {
		
		System.out.println("Main Method Starts");
		
		Runnable task = new ConsoleInput();
		
		
		 Thread thread = new Thread(task);
		 
		 thread.start();
//		  try {
//			thread.join();
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		  
		  
		System.out.println("Main Method Ends");
	}
	
}
