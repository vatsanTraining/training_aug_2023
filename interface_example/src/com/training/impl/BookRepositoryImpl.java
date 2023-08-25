package com.training.impl;

import com.training.ifaces.CrudRepository;
import com.training.model.Book;

public class BookRepositoryImpl implements CrudRepository {
	
	
	private Book[] books;
	
     int idxPos =0;
     
	public BookRepositoryImpl() {
		super();
		
		this.books = new Book[3];  //5  initializing
	}

	@Override
	public boolean add(Object obj) {
		
		if(idxPos<3) {
			this.books[idxPos]=(Book)obj;   //6    casting
			
			idxPos++;
			return true;
		}
		return false;
	}

	@Override
	public Object[] findAll() {
		return this.books;
	}

	@Override
	public boolean remove(int key) {
		return false;
	}
	
	//subtype should throw same as super type or its subclass exception
	// but never a super class exception

	// throwable => throwable , exception,...
	// Exception -> throwable => not allowed
	@Override
	public Object findById(int id) throws Exception {

		throw new Exception("Hi");
	}
	
	

}
