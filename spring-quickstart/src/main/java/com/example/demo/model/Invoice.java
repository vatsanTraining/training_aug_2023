package com.example.demo.model;

public class Invoice {

	
	private Customer cust;
	private Product prod;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Invoice(Customer cust, Product prod) {
		super();
		this.cust = cust;
		this.prod = prod;
	}

	public Customer getCust() {
		return cust;
	}
	public void setCust(Customer cust) {
		this.cust = cust;
	}
	public Product getProd() {
		return prod;
	}
	public void setProd(Product prod) {
		this.prod = prod;
	}
	@Override
	public String toString() {
		return "Invoice [cust=" + cust + ", prod=" + prod + "]";
	}
	
}
