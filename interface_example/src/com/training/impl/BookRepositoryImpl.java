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
		// TODO Auto-generated method stub
		return false;
	}

}
