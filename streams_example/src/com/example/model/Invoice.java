package com.example.model;

import java.time.LocalDate;
import java.util.Objects;

public class Invoice {

	private int invoiceNumber;
	private LocalDate invoiceDate;
	private String customerName;
	private double invoiceAmount;
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Invoice(int invoiceNumber, LocalDate invoiceDate, String customerName, double invoiceAmount) {
		super();
		this.invoiceNumber = invoiceNumber;
		this.invoiceDate = invoiceDate;
		this.customerName = customerName;
		this.invoiceAmount = invoiceAmount;
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public LocalDate getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(LocalDate invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, invoiceAmount, invoiceDate, invoiceNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Invoice other = (Invoice) obj;
		return Objects.equals(customerName, other.customerName)
				&& Double.doubleToLongBits(invoiceAmount) == Double.doubleToLongBits(other.invoiceAmount)
				&& Objects.equals(invoiceDate, other.invoiceDate) && invoiceNumber == other.invoiceNumber;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", invoiceDate=" + invoiceDate + ", customerName="
				+ customerName + ", invoiceAmount=" + invoiceAmount + "]";
	}
	
	
}
