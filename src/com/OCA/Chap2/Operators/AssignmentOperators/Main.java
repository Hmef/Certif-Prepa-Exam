package com.OCA.Chap2.Operators.AssignmentOperators;

public class Main {

	
	public static void main(String... args) {
		
		/*
		 * 				Assignment Operators
		 */
		
		int a = 10;
		int b = a; // Ok to assign variables of same type
		
		float float1 = 10.2F;		 // OK to assign literal 10.2F to variable of type float
		float float2 = float1;  // Ok to assign variables of same type
		
		long num = 1009655327007276L;
		int val = num;  // Compiler won't allow this 
		
		int intVal = 1009;
		long longVal = intVal; //   ==> Allowed
		
		
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
