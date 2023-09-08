package com.example.demo.model;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Teacher {    //teacher  =>1

	private int teacherId;
	private String firstName;
	
	@Autowired
	@Qualifier("studentSiva")
	private Student student;
	
	private Set<Student> list;
	
	@Autowired
	public void setList(Set<Student> list) {
		this.list = list;
	}
	public Set<Student> getList() {
		return list;
	}
	public Teacher() {
		super();
	}
	public Teacher(int teacherId, String firstName, Student student) {
		super();
		this.teacherId = teacherId;
		this.firstName = firstName;
		this.student = student;
	}
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", firstName=" + firstName + ", student=" + student + "]";
	}
	
	
}
