package com.example.demo.model;

import java.util.Objects;

public class Student  {

	private int rollNumber;
	private String studentName;
	private double markScored;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, double markScored) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.markScored = markScored;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public double getMarkScored() {
		return markScored;
	}
	public void setMarkScored(double markScored) {
		this.markScored = markScored;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", markScored=" + markScored
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(markScored, rollNumber, studentName);
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
		return Double.doubleToLongBits(markScored) == Double.doubleToLongBits(other.markScored)
				&& rollNumber == other.rollNumber && Objects.equals(studentName, other.studentName);
	}
	
}
