package com.example.demo;
import java.util.function.*;
public class UsingPredicate {

	public static void main(String[] args) {

		
		
		Predicate<Double> testPassMark = (mark) -> mark>80.0; 
		
		System.out.println( "is Passed :=>"+testPassMark.test(89.0));


		Predicate<Double> testLowerBound = (mark) -> mark<0.0; 

		Predicate<Double> testUpperBound = (mark) -> mark>100.0; 

				testUpperBound.or(testLowerBound).test(67.0);
				

		System.out.println("is Failed "+ testPassMark.negate().test(56.00));
		
		
	}

}
