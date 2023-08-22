package com.training.model;

import java.util.Arrays;

public class Student {

	private int rollNumber;
	private String firstName;
	private double[][] markScoredPerYear;  // 3 years and 3 subjects
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String firstName, double[][] markScoredPerYear) {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.markScoredPerYear = markScoredPerYear;
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
	public double[][] getMarkScoredPerYear() {
		return markScoredPerYear;
	}
	public void setMarkScoredPerYear(double[][] markScoredPerYear) {
		this.markScoredPerYear = markScoredPerYear;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", markScoredPerYear="
				+ Arrays.toString(markScoredPerYear) + "]";
	}
	
	
	
	
}
