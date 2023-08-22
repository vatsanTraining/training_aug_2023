package com.training;

import java.util.Arrays;

import com.training.ifaces.CrudRepository;
import com.training.impl.BookRepositoryImpl;
import com.training.model.Book;

public class BookApplication {

	
	public static void main(String[] args) {

		
		CrudRepository repo = new BookRepositoryImpl();   //1 super =sub
		
	System.out.println("Is Added ;=>"+repo.add(new Book(101,"Head First Java","Kathy Sieera")));	 //2 calling the method
	
	System.out.println("Is Added ;=>"+repo.add(new Book(102,"Thinking in Java","Bruce Ereckel")));
	

	           Book[] books =(Book[]) repo.findAll(); //3   casting 
	           
	           for(Book eachBook:books) {
	        	   if(eachBook!=null) {     // 4  // array size checking for null
	        		   System.out.println(eachBook);
	        	   }
	           }
	               
		

	}

}
