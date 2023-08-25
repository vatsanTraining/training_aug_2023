package org.demo;

public class BookApplication {

	
	public static void main(String[] args) {
		
		 BookService.findById(24);
		 
		 try {
			BookService.findByNumber(23);
			BookService.findByIdWithRethrow(56);
		} catch (Exception e) {
			e.printStackTrace();
		}
		 
	}
}
