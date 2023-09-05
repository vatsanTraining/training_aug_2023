package com.example;

import java.util.Optional;

public class UsingOptional {

	public static Optional<String> getCity(int key) {
		
		switch (key) {
		case 1:
			
			return Optional.of("Pune");
		case 2:
			return Optional.of("Dallas");
		default:
			return Optional.empty();
		}
	}
	public static void main(String[] args) {

		Optional<String> result = getCity(2);
		
//		  if(!result.isEmpty()){
//				System.out.println(result.get());
//		   } else {
//			   System.out.println("Invalid Choice");
//		   }
		
		
		 System.out.println(result.orElseThrow( () -> new RuntimeException("Invalid Choice") ));
	}

}
