package org.demo;

import java.io.IOException;

public class BookService {

	public static void findById(int id) throws RuntimeException{
		
		int[] numbers = {45,10,24,50};
		
		for(int number:numbers) {
			
			if(id==number) {
				System.out.println("number found");
			} else {
				throw new RuntimeException("Element with id"+ id + "not found");
			}
		}
	}
	
	
	public static void findByNumber(int id)  throws Exception{
		
		int[] numbers = {45,10,24,50};
		
		for(int number:numbers) {
			
			if(id==number) {
				System.out.println("number found");
			} else {
				throw new Exception("Element with id"+ id + "not found");
			}
		}
	}
	
	public static void findByIdWithRethrow(int id) throws IOException {
		
		int[] numbers = {45,10,24,50};
		
		for(int number:numbers) {
			
			if(id==number) {
				System.out.println("number found");
			} else {
				try {
					throw new IOException("Element with id"+ id + "not found");
				} catch (Exception e) {
					e.printStackTrace();
					throw e;
				}
			}
		}
	}
}
