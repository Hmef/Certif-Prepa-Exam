package com.OCA.String.PoolOfStringObjects;

public class Test {

	public static void main(String[] args) {
		
		// Creating two String objects using ==> new Operator
		String str1 = new String("Paul");
		String str2 = new String("Paul");
		
		// Comparing the address of the objects referred to
		System.out.println(str1 == str2);
		
		/*
		 *  str1    =========>  Paul   
		 *  
		 *  str2 	=========>  Paul
		 */
		
		// Creating two String using = 
		String str3 = "Harry";
		String str4 = "Harry";
		
		// == Comparing the address
		System.out.println(str3 == str4);  
		
		/*
		 * 		str3 & str4  =========>  Harry  ( same sequence of characters )
		 */
	}
	
	
	
	
	
	/*
	 * 	Creating a String Object by using 				
	 * 
	 * 			new Operator          or        String literal value ( value within double quotes ) 
	 * 
	 * 			      String reference variable     =     assign a String literal value   ==>  Example : String str3 = "Harry";
	 */
	
	
	/*
	 * 		Pool of String Objects 
	 * 
	 * 		objects created with = are Stored in the Pool of String objects (not constants) 
	 * 
	 */
	
	/*
	 * 					Exam TIP 
	 * 
	 * 		String Objects created using = (the assignment Operator) refer to the same object 
	 * 
	 * 		IF they store the same sequence of characters 
	 * 
	 */
	
	/*
	 * 					Exam TIP
	 * 
	 * 	Before creating a NEW Object in the pool, java search an object with similar content 
	 */
	
	
}


