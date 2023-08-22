package com.training.ifaces;

public interface CrudRepository {

	boolean add(Object obj);
	Object[] findAll();
	boolean remove(int key);
	
}
