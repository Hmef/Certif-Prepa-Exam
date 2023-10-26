package com.OCP81Z0808.Chap2.Identifiers;

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
	}
	
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
	 */
}
