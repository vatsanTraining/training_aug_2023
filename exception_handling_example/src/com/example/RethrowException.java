package com.example;

import java.io.IOException;
import java.text.ParseException;

import com.example.services.StudentService;

public class RethrowException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
			System.out.println(StudentService.findLength());
	
			try {
				StudentService.preciseThrow();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
