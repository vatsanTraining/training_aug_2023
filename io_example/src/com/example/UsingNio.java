package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import com.example.exceptions.RangeCheckException;
import com.example.model.Student;

public class UsingNio {

	public static void main(String[] args) {

		Path pathRef= Paths.get("city.txt");
		
		

		     try {
		    	 
		    	 
		    	 if(Files.exists(pathRef))
		    	 {
				// Path path =Files.createFile(pathRef);
				 Student ram =new Student(203,"Rajiv","Kumar",79);
				 Student shyam =new Student(204,"Shyam","Kumar",99);

//					Files.writeString(path, ram.toString()+"\n",StandardOpenOption.APPEND);
//					Files.writeString(path, shyam.toString(),StandardOpenOption.APPEND);

					String content =Files.readString(pathRef);
					
					String[] values =content.split("/n");
					
					System.out.println(values[0]);
					

		    	 } else {
		    		 System.out.println("Bye");
						    	 }
			} catch (RangeCheckException |IOException e) {
			
				e.printStackTrace();
			}
		     
	}

}
