package com.example.demo;

public class QuickStart {

	public static void main(String[] args) {

		System.out.println(Thread.currentThread().getName());
		
		Runnable target = new PrintNumbers();
		
		Thread thread1 = new Thread(target, "Ramesh");
		
		
		Thread thread2 = new Thread(target, "Suresh");

		
		Thread thread3 = new Thread(target, "Magesh");
		
		thread1.start();
		thread2.start();
		thread3.start();

		
		
		try {
		
			Thread.sleep(500);
			System.out.println("Hello World");

			Thread.sleep(500);
			
			System.out.println("Hello India");

			Thread.sleep(500);

			System.out.println("Hello Hyderabad");

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


		
		
	}

}
