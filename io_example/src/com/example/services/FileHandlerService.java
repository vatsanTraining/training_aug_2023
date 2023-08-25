package com.example.services;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

import com.example.exceptions.RangeCheckException;
import com.example.ifaces.FileHandler;
import com.example.impl.FileHandlerImpl;
import com.example.model.Student;

public class FileHandlerService {

	static File file =new File("student.txt");
	private FileHandler handler;
	
	

	public Student[] getListSortBy(String prop) {
		
		//Arrays.sort(list);
		return null;
	}
	
	public FileHandlerService() {
		super();
      this.handler = new FileHandlerImpl();
	}



	public Student[] getStudentMarkGrtThan(double mark) {
		
		Student[] filteredList = null;
		int idxPos=0;

		try {
			Student[] list = handler.readFromFile(file);
			
			
			filteredList = new Student[list.length];
			for(Student eachStudent : list) {
				if(eachStudent!=null && eachStudent.getMarkScored()>mark) {
				filteredList[idxPos++]=eachStudent;
				}
			}
			
		} catch (IOException | RangeCheckException e) {
			e.printStackTrace();
			
		}
		
		return filteredList;
	}
}
