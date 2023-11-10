package com.OCA.PracticeTests.Chap2.DataTypes.Ex30;

public class Test {

	public static void main(String[] args) {
		
		String cat = "animal", dog = "animal";
		System.out.println(cat + dog);
		
		String cat2 = "animal"; dog2 = "animal";  // Error ==> dog2 does not have a type
																// ==> String dog2 = "animal";
		
		String cat3, dog3 = "animal";   // Compile ==> but only assigns the value to dog variable
												//Initialize cat3 ==> cat3 = null;
		System.out.println(cat3 + dog3);
		
		
		String cat4, String dog4 = "animal";  // Error ==> Does not compile 
	}
	
	
	/*
	 * 		Which of the following correctly assigns "animal" to Both variables ??
	 * 
	 * 		A. String cat = "animal", dog = "animal";
	 * 		
	 * 		B. String cat = "animal"; dog = "animal";   // ;
	 * 
	 * 		C. String cat, dog = "animal";
	 * 
	 * 		D. String cat, String dog = "animal";
	 * 
	 */
	
	/*
	 * 						Exam TIP
	 * 
	 * 		the type should only be specified once per declaration 
	 * 
	 * 		String cat3, dog3 = "animal"; ==> // Compile ==> but only assigns the value to dog variable
	 * 														//Initialize cat3 ==> cat3 = null;
	 */
}
