package com.OCA.Chap2.Operators.AssignmentOperators;

public class Foo {

	public static void main(String[] args) {
		
		boolean b1, b2, b3, b4, b5, b6;
		
		b1 = b2 = b3 = true;
		//b4 = 0;  
		b5 = false;
		//b6 = yes;
		
		System.out.println(b2);
		System.out.println(b5);
	}
	
	/*
	 * 			Select incorrect answers 
	 * 
	 *   	a. the code on line 1 will fail to compile 
	 *   	b. can't initialize a multiple variables like the code on line 9
	 *   	c. the code on line 10 is correct
	 *   	d. can't assign 'false' to a boolean variable
	 *   	e. the code on line 12 is correct
	 */
}
