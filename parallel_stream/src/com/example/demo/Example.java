package com.example.demo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Example {

	
	
	public static void hello() throws Exception {
		
		
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(new File("abc")));
		Scanner sc = new Scanner(System.in);
		
		try(out;sc){
			
			//TODO
		}catch (Exception e) {

			e.printStackTrace();
		}
	}
}
