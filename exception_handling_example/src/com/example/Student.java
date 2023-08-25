package com.example;

import java.util.Objects;

public class Student {

    private int rollNumber;
	private String firstName;
	private String lastName;
	private double markScored;
	
	

	public Student() throws Exception{
		this(000,"guest","guest",100);		
		
	}
	

	public Student(int rollNumber, String firstName, String lastName, double markScored) throws Exception {
		super();
		this.rollNumber = rollNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		if(markScored<0) {
			throw new Exception("ERR-104 Mark Should be positive number");
		} else {
		this.markScored = markScored;
		}
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
		if(markScored<0) {
			try {
				throw new Exception("ERR-104 Mark Should be positive number");
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		} else {
		this.markScored = markScored;
		}
	}


	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName, markScored, rollNumber);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return Objects.equals(firstName, other.firstName) && Objects.equals(lastName, other.lastName)
				&& Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNumber == other.rollNumber;
	}


	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", markScored=" + markScored + "]";
	}
	
	
	
}
