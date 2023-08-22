package com.training;

import com.training.ifaces.CrudRepository;
import com.training.impl.StudentRepositoryImpl;
import com.training.model.Student;

public class StudentApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CrudRepository obj = new StudentRepositoryImpl();
		
		StudentRepositoryImpl repo =(StudentRepositoryImpl)obj;
		

		 int key =1;
		  switch (key) {
		case 1:
			double[][] marks = { {10,20,30},
					             {40,50,60},
					             {70,80,90}
					             };
			repo.add(new Student(101,"Ramesh", marks));
			repo.add(new Student(102,"SureshS", marks));

		case 2:
			Student[] list = (Student[]) repo.findAll();   
			print(list);   
			break;
		default:
			break;
		}
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
			 System.out.println(total);
			  }
			  System.out.println("==============");
		 }
		 
	}

}
