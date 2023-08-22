package com.training;

public class Student {

    int rollNumber;
	private String firstName;
	private String lastName;
	private double markScored;
	
	
	public Student() {
		this(102,"Shyam","Reddy",60);		
		
	}
	

	public Student(int rollNumber, String firstName, String lastName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.markScored = markScored;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
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

	public double getMarkScored() {
		return markScored;
	}

	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	
	
	
}
