package com.OCA.Chap2.Identifiers;

public class Main {

	public static void main(String[] args) {
		
		byte exam_total = 7;
		
		// int exam-Total = 1090;  // Syntax Error on token "-"
		
		int falsetrue;  // allowed 	
		int javaseminar; // allowed 
		// int DATA-COUNT;  // not allowed 
		int DATA_COUNT;  // allowed 
		// int car.DATA_COUNT;  // not allowed 
		// int %ctr;  // not allowed (%)
		int Ÿto£and$; // Valid (though strange)
		
		int Integer = 5;
		System.out.println(" Integer is a valid Identifier ?!!!! " + Integer);  // ????????
		
		int Object = 7;
		System.out.println(" Object is allowed as Identifier ?!!! " + Object);
		
		// int goto;  // Not allowed 
		
		int Constant; // Valid Idenitifer 
		
		// int book@manning; // Not allowed 
		
		int that;  // Valid
		
		//int world@; // Invalid, @ character is not allowed 
		
		int $World1NYear; // Allowed, $ Currency sign
		
		//int 1ManhatenUniversity; // Invalid ==> Identifier can' start with a numeric value or digits
		
		//int Digital!; // not valid, ! character is not allowed 
		
		//int const; // not allowed
		
		int constant; // allowed 
		
		int nullValue;  // allowed, null 
		
		int Happy2help; // Allowed 
		
		// int Four season$2023; // Not allowed, there is a space after Four 

			
	}
	
	
	void errors() {};  // errors Identifier ==> valid 
	
	/*
	 * 		Exam Question : identify a valid and invalid identifiers
	 * 
	 * 				==> Identifier : name of packages, classes, interfaces, methods and variables 
	 */
	
	/*
	 * 
	 * 		Underscore ==> allowed 
	 * 
	 * 		hyphen ==> not allowed 
	 * 
	 * 		a dot => not allowed 
	 * 
	 * 		% ==> not allowed 
	 * 
	 * 		const ==> not allowed 
	 * 
	 * 
	 */
	
	/*
	 * 
	 * 		Exam TIP: Identifier should be start with Only a Currency Sign, a letter or an Underscore 
	 * 
	 */
	
	/*
	 * Identifiers are case-sensitive ==> nomad and Nomad are two different identifiers 
	 */
}
