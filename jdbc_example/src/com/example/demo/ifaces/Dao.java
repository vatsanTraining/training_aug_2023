package com.example.demo.ifaces;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.exceptions.ElementNotFoundException;


public interface Dao<T> {

	public boolean add(T obj) throws SQLException, ElementNotFoundException;
	public List<T> findAll() throws SQLException;
	public T findById(int id) throws ElementNotFoundException, SQLException;
	public boolean remove(int id) throws ElementNotFoundException;
    public int update(T obj) throws Exception;

	
}
