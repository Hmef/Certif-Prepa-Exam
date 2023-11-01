package com.OCA.String.PoolOfStringConstant;

public class Main {

	public static void main(String[] args) {
		
		// Creating a String Object placed in a Pool of String CONSTANT
		System.out.println("Morning");
		
		// Placed in a Pool of String OBJECTS
		String morning1 = "Morning";
		
		// Compares their references ( address )
		System.out.println("Morning" == morning1);
		
		System.out.println(" ");
		System.out.println(" Creating String Object ==> new ");
		
		String morning2 = new String("Morning"); // this String Object is not placed in the pool of String constant 
		System.out.println("Morning");
		
		System.out.println("Morning" == morning2); // don't refer to the same String object
													// even if they define the same String VALUE
	}
	
	
	
	/*
	 * 				Exam TIP 
	 * 
	 * 		the value is reused from the pool of String Constants if a matching value is found 
	 * 
	 */
	
	/*
	 * 				Exam TIP
	 * 
	 * 		If a matching value is NOT found ==> the JVM creates a String Object with the specified value 
	 * 
	 * 		and places it in a Pool of String Constant
	 */
	
	/*
	 *  			String Object is IMMUTABLE
	 *  
	 *  	Because String Objects are immutable ==> the Pool of String Objects is also CALLED the Pool of String Constant
	 */
}

