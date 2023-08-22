package com.training.impl;

import com.training.ifaces.StudentRepository;
import com.training.model.Student;

public class StudentRepositoryImpl implements StudentRepository {
	
	private Student[] students;
	
	private static final int MAX=2;
	
	private int idxPos = 0;
	
	public StudentRepositoryImpl() {
		super();
        this.students = new Student[MAX];
	}

	
	public StudentRepositoryImpl(Student[] students) {
		super();
		this.students = students;
	}


	@Override
	public boolean add(Object obj) {

		boolean status = false;
		if(idxPos<MAX) {
			this.students[idxPos]=(Student)obj;
			idxPos++;
			status = true;
		}
		
		return status;
	}

	@Override
	public Object[] findAll() {
		return this.students;
	}

	@Override
	public boolean remove(int key) {
		return false;
	}

	@Override
	public double findAverageMark() {
		
		double average = 0.0;
	    double classTotal = 0.00;
		for(Student eachStudent : this.students) {
			
			double eachStudTotal = 0;
			  for(double[] inner : eachStudent.getMarkScoredPerYear()) {
				  
				  for(double mark : inner) {
					  eachStudTotal =eachStudTotal+ mark;
				  }
			  }
			  classTotal = classTotal+eachStudTotal;
		}
		 
		return classTotal/idxPos;
	}


}
