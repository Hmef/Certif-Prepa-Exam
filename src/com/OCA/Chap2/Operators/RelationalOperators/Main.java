package com.OCA.Chap2.Operators.RelationalOperators;

public class Main {

	public static void main(String[] args) {
		
		int i1 = 10;
		int i2 = 20;
		System.out.println(i1 >= i2);
		System.out.println(i1 > 10); // false
		System.out.println(i2 >= 20);  // true
		
		long long1 = 10;
		long long2 = 20;
		System.out.println( long1 <= long2);
		
		/* Comparing primitives using == and != */
		int a = 10;
		int b = 20;
		System.out.println(a == b); // false
		System.out.println(a != b);  // true
		
		boolean b1 = false;
		System.out.println(b1 == true); // false
		System.out.println(b1 != true); // true
		
		/* Compilation error */
		//System.out.println( a == b1); // can't compare boolean with int
		
		int c = 10;
		int d = 20;
		System.out.println(c = d); // 20  ==> this is not a boolean value ==> its an assignment operation    Exam TIP
		
		boolean d1 = false;
		System.out.println(d1 = true); // true : assignment operation
		
		
	}
	
	/*
	 * 					Exam TIP
	 * 
	 * 		we can't compare incomparable value ==> we can't compare a boolean with an int, char, byte, double ...etc
	 */
	/*
	 * 				Exam TIP
	 * 							=   Vs  ==
	 *  
	 *  It's a very common mistake to use the assignment operator, =, in place of 
	 *  the equality operator, ==, to compare primitive values
	 */
}
