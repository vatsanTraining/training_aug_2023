package example.demo;

import com.training.services.*;

import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
	//	Student ram = new Student(Integer.parseInt(args[0]), args[1], args[2], Double.parseDouble(args[3]));
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Enter Roll Number");
//		int rollNumber = sc.nextInt();
//		
//		System.out.println("Enter First Name");
//		String firstName = sc.next();
//		
//		String lname ="";
//		System.out.println("Enter Last Name");
//		lname+= sc.nextLine();
//		
//		String lastName = lname;
//		
//		sc.next();
//		
//		System.out.println("Enter Mark Scored");
//		double markScored = sc.nextDouble();
//		
//		sc.nextDouble();
//		
//		Student ram = new Student(rollNumber, firstName, lastName, markScored);
//		
//		System.out.println(ram.getMarkScored());
//		System.out.println(ram.getFirstName());
//		
		
		 System.out.println(StudentService.allotGradeWrapper(Double.valueOf(90)));
		//sc.close();
		
		
		
	}

}
