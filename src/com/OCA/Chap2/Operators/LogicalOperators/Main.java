package com.OCA.Chap2.Operators.LogicalOperators;

public class Main {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		boolean test = a > 20 && b > 10;  // && (AND) ==> false AND true ==> false
		System.out.println(test); // false
		System.out.println(a > 20 || b > 10); // || (OR) ==> false OR true ==> true 
		System.out.println(!(b > 10)); // b > 10 ==> true ==> !true ==> false
		System.out.println(!(a > 20));  // true 
		
		int marks = 8;
		int total = 10;
		System.out.println(total < marks && ++marks > 5); // (false && true) ==> false
		System.out.println(marks);
	}
	
	/*
	 * 					Exam TIP
	 * 
	 *  	&& : true && true && false ==> false 
	 *  		
	 *  		 false && false ==> false 
	 *  
	 *  	|| : false || false || true ==> true
	 *  
	 *  		 false || false ==> false 
	 *  
	 */
}
