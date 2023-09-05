package com.example.demo.func;

@FunctionalInterface
public interface Display<T> {

	public void show(T obj);
	default String greet() {
		
		return "From Default Method";
	}
}


