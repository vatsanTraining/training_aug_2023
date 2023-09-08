package com.example.demo.ifaces;

import java.util.List;
import java.util.Optional;

public interface CrudRepository<T,ID> {

	int add(T t);
	Optional<T> findById(ID id);
	List<T> findAll();
	int remove(int id);
	int update(T t);
}
