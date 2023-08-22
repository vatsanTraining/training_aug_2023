package com.training;
import java.util.*;
import com.training.ifaces.CrudRepository;
import com.training.impl.StudentRepositoryImpl;
import com.training.model.Student;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrudRepository obj = new StudentRepositoryImpl();
		
		StudentRepositoryImpl repo =(StudentRepositoryImpl)obj;
		
		double[][] marks1 = { {10,20,30},
	             {40,50,60},
	             {70,80,90}
	             };

		double[][] marks2 = { {30,40,50},
	             {60,70,60},
	             {80,90,70}
	             };
Scanner sc = new Scanner(System.in);
		 int key =1;
		 do {
		  switch (key) {
		case 1:
			repo.add(new Student(101,"Ramesh",marks1));
			repo.add(new Student(102,"Rakesh",marks2));
			
          break;
		case 2:
			Student[] list = (Student[]) repo.findAll();   
			print(list);   
			break;
		default:
			break;
		}
		  System.out.println("1 to Continue 2 to print 3 to exit");
		  key = sc.nextInt();
		 }while(key<=2);
		 
		 sc.close();
	}

	private static void print(Student[] list) {

		 for(Student eachStudent : list) {
			  if(eachStudent!=null) {
			 System.out.println(eachStudent.getRollNumber());
			 System.out.println(eachStudent.getFirstName());
			 double total =0;

			 for(double[] inner : eachStudent.getMarkScoredPerYear())
			 {
				 for(double mark : inner) {
					 total =total+mark;
				 }
			 }
			 System.out.println("Student Average"+total);
			  }
			  System.out.println("==============");
		 }
		 
	}

}
