package com.example.demo.entity;

public class CibilScore {

	private String panCardNumber;
	private String firstName;
	private String lastName;
	private double cibilScore;
	
	public CibilScore() {
		super();
	
	}
	public CibilScore(String panCardNumber, String firstName, String lastName, double cibilScore) {
		super();
		this.panCardNumber = panCardNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.cibilScore = cibilScore;
	}
	public String getPanCardNumber() {
		return panCardNumber;
	}
	public void setPanCardNumber(String panCardNumber) {
		this.panCardNumber = panCardNumber;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getCibilScore() {
		return cibilScore;
	}
	public void setCibilScore(double cibilScore) {
		this.cibilScore = cibilScore;
	}
	@Override
	public String toString() {
		return "CibilScore [panCardNumber=" + panCardNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", cibilScore=" + cibilScore + "]";
	}
	
	
}
