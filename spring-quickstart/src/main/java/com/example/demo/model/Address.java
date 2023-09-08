package com.example.demo.model;

public class Address {

	private String line1;
	private String line2;
	private String city;
	private long pincode;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String line1, String line2, String city, long pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pincode = pincode;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	
}
