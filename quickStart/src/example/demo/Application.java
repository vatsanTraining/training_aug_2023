package example.demo;

import com.training.*;

public class Application {

public static void main(String[] args) {
	
	 Student ram = new Student(101,"Ramesh","Kumar",98);
	 
	Student shyam = new Student();
	 
	 System.out.println("Mark Scored:=>"+ram.getMarkScored());
	 
	 System.out.println("Mark Scored:=>"+shyam.getMarkScored());
	 
	 
	 Teacher kanna = new Teacher(200,"Kanna","english");
	 
	         // String result =kanna.showResult(ram);
//	          String updatedResult = result.toLowerCase();
	          
	       //   System.out.println(result);
	 
	     System.out.println("Before Method Call =>"+ ram.getLastName());
	          
	          System.out.println(kanna.showResult(ram));
	          
	          //For references to objects, you pass a copy of the reference 

	 	     System.out.println("After Method Call =>"+ ram.getLastName());

}
                            

	
}
