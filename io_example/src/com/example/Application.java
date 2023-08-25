package com.example;

import java.io.File;
import java.io.IOException;

import com.example.exceptions.RangeCheckException;
import com.example.ifaces.FileHandler;
import com.example.impl.FileHandlerImpl;
import com.example.impl.ObjectStreamHandlerImpl;
import com.example.model.Student;
import com.example.services.FileHandlerService;
import com.training.utils.FileHandlerFactory;

public class Application {

	static File file =new File("student.txt");
	
	//static File file =new File("student.ser");


	public static void write(FileHandler handler) {
	
		
		
		try {
			Student ram = new Student(103, "Magesh", "Kumar", 28);
			
		 System.out.println("is Added :="+handler.writeToFile(ram, file));	
			
		} catch (RangeCheckException |IOException e) {   //2
			
			e.printStackTrace();
		}
	}
		public static void read(FileHandler handler) {
			
		
		
			 Student[] students;
			try {
				students = handler.readFromFile(file);
				  for(Student eachItem:students) {
					  System.out.println(eachItem);
				  }

			} catch (IOException | RangeCheckException e) {
				e.printStackTrace();
			}
			 
			
		
	}
	
	public static void main(String[] args) {

		
		write(FileHandlerFactory.getHandler(1));
		 
		 read(FileHandlerFactory.getHandler(1));
		
//		FileHandlerService service =new FileHandlerService();		
//		Student[] list = service.getStudentMarkGrtThan(80);
//		
//		  for(Student eachItem:list) {
//			   if(eachItem!=null) {
//			  System.out.println(eachItem);
//			   }
//		  }

	}

}
