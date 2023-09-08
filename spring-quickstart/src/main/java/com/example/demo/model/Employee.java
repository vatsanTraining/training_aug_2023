package com.example.demo.model;

public class Employee {

	private String employeeName;
	private int phoneNumber;
	private Address address;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String employeeName, int phoneNumber, Address address) {
		super();
		this.employeeName = employeeName;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";
	}
	
	
}
