package com.example.demo.model;

public class Product {

	private String productName;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@Override
	public String toString() {
		return "Product [productName=" + productName + "]";
	}
	
}
