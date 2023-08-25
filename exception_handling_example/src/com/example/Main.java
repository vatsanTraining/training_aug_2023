package com.example;

import java.util.InputMismatchException;
import java.util.Scanner;

import com.example.utils.ExceptionHandler;

public class Main {

	public static void main(String[] args) {

		  int denom =2;
		  int numera=5;
		  
		   
		  try {
			int response = numera/denom;
			System.out.println("Value:=>"+response);
		} catch (ArithmeticException e) {
		System.err.println("Denominator should not be Zero");
		}
		  
		  System.out.println("Done ...bye");
		  
		  
		  System.out.println(ExceptionHandler.processString("Twentythreee"));
		  
		  
		  try (Scanner sc = new Scanner(System.in)) {
			  
			  int no = sc.nextInt();
			  
			  System.out.println(no);
		}
		  catch(InputMismatchException e) {
			System.err.println(e.getMessage());
		}
		  
	}

}
