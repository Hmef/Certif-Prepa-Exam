package com.OCA.Chap2.Operators.AssignmentOperators;

public class Main {

	
	public static void main(String... args) {
												
		
		/* 			Assignment Operators     */
	
		int x = 10;
		int y = x; // Ok to assign variables of same type
		
		float float1 = 10.2F;		 // OK to assign literal 10.2F to variable of type float
		float float2 = float1;  // Ok to assign variables of same type
		
		long num = 1009655327007276L;
		// int val = num;  // Compiler won't allow this 
		
		int intVal = 1009;
		long longVal = intVal; //   ==> Allowed
		
		
		/* Define and Initialize in the SAME line   */
		
		int a = 7, b = 10, c = 8;
		a = b = c;  
		System.out.println(a);   // print 8 
		
		/*
		 *  the assignment starts from the right to the left
		 *  
		 *  the value of variable c is assigned to b 
		 *  and the value of b is assigned to a
		 */
		
		
	}
	
	/*
	 * 					Exam TIP
	 * 
	 * 		+= ==> short form of addition
	 * 
	 * 		+= this Operator can be read as ==> first ADD and then assign 
	 * 
	 * 		/= : first divide and then assign 
	 * 
	 * 		%= : first modulus and then assign
	 * 
	 * 				a /= b;   ==>   a = a / b;
	 */
	
	/*
	 * 					Exam TIP
	 * 
	 * 		assigning a Bigger value (long) to a a variable that's only 
	 * 		capable of storing a smaller value range ==> int val = num;
	 */
	
	/*
	 * 					Exam TIP
	 * 		
	 * 		you CAN'T use the Assignment operator to assign a boolean value
	 * 		to a variable of type char, byte, int, short, long, float or double 
	 * 		or vice versa
	 */
	
	
}
