package com.OCA.String;

public class CountingStringObjects {

	public static void main(String... args) {
		
		String summer = new String("Summer");
		
		String summer2 = "Summer";
		
		System.out.println("Summer"); // doesn't create a new String Object ==> it reuses the String Object with the value "Summer"
										// that's already existed in the Pool of String Constant 
		
		System.out.println("autumn");
		
		System.out.println(" Java is a case-sensitive ==> summer is not the same as Summer ");
		System.out.println("autumn" == "summer");  // create new String Object ==> summer
		
		System.out.println("Summer" == summer2);
		
		System.out.println(summer == summer2);
		
		String autumn = new String("Summer");
		
		System.out.println(summer == autumn);
		
		// 5 objects created ( summer is a new object created and placed in a pool of String Constant)
		
		/*
		 * 					Exam TIP
		 * 
		 * 		String Object created with new is NEVER Pooled
		 * 
		 */
	}
}
