package com.example.demo.dao;

import java.util.List;

import com.example.demo.model.Restaurant;

public interface Dao<T> {

	List<T> findAll();

}
