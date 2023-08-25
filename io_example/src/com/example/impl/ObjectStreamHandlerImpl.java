package com.example.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.example.exceptions.RangeCheckException;
import com.example.ifaces.FileHandler;
import com.example.model.Student;

public class ObjectStreamHandlerImpl implements FileHandler {

	@Override
	public boolean writeToFile(Student student, File file) throws IOException {
		
		boolean result = false;
		
		
		try (ObjectOutputStream outStream = new ObjectOutputStream(new FileOutputStream(file))) {
			
			outStream.writeObject(student);
			
			result = true;
			
		}catch (Exception e) {
			
			throw e;
		}
		
		
		return result;
	}

	@Override
	public Student[] readFromFile(File file) throws IOException, RangeCheckException {

		Student[] list  =new Student[2];
		
		int idx=0;
		
		try(ObjectInputStream inStream = new ObjectInputStream(new FileInputStream(file))) {
			
			Student obj = (Student)inStream.readObject();
			
			list[idx]=obj;
			
		} catch (Exception e) {
                  e.printStackTrace();
		}
		
		return list;
	}

}
