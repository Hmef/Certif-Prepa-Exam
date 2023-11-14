package com.OCA.Chap2.Operators.ArithmeticOperatos;

public class Main {

	public static void main(String[] args) {
		
		/*     Modulus %  (Remainder in division) */
		
		int a = 10;
		int b = 6;
		
		int m = a % b;  //
		
		System.out.println(m);  // print 4
		
		double c = 10.0;
		double d = 6.0;
		
		double md = c % d;
		
		System.out.println(md);  // print 4.0
		
		/*    Increment and Decrement */
		
		int var = 10;
		++var;
		var++;
		System.out.println(++var);       // print 13
		System.out.println(var++);  // print 13
		
		--var;
		var--;
		System.out.println(--var);   // print 11
		System.out.println(var--); // print 11   
		
	}
}
