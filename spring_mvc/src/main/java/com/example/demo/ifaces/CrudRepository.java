package com.example.demo.ifaces;

import java.util.List;

public interface CrudRepository<T> {

	int add(T t);
	T findById(int id);
	List<T> findAll();
	int remove(int id);
	int update(T t);
}
