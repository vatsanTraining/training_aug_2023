package com.example.ifaces;
import java.util.*;

public interface CrudRepository<T> {

	
	int add(T entity);
	
	List<T> findAll();
	
}
