package com.training.ifaces;

public interface CrudRepository {

	boolean add(Object obj);
	Object[] findAll();
	boolean remove(int key);
	Object findById(int id) throws Exception;
}
