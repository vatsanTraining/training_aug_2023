package com.example.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/* <bean id="invoice" class="com.example.demo.model">
 <property name="invoiceNumber" value="101">
</bean>
*/

@Component
public class Invoice {

	//@Value("101")
	private int invoiceNumber;
	
	//@Value("4500.00")
	private double amount;
	
	//@Autowired                // field Injection
	private Customer customer;
	
	public Invoice() {
		super();
	}
	public Invoice(int invoiceNumber, double amount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
	}
	// <td colspan=2>
	@Autowired
	public Invoice(@Value("209") int invoiceNumber,  @Value("5600")double amount, Customer customer) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.amount = amount;
		this.customer = customer;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	public Customer getCustomer() {
		return customer;
	}
	
	//@Autowired   // setter DI
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", amount=" + amount + "]";
	}
	
	
}
