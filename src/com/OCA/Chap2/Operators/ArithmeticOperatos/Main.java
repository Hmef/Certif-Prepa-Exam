package com.OCA.Chap2.Operators.ArithmeticOperatos;

public class Main {

	public static void main(String[] args) {
		
		/*        char        */ 
		char char1 = 'a';
		char char2 = ++char1;
		char char3 = ++char2;
		System.out.println(char1);  // Outputs a
		System.out.println(char1 + char1); // 194 (ASCII value of a is 97)
		System.out.println(char1 - char1);  // 0
		System.out.println("char1++ : " + char1++); // b
		System.out.println("char2 : " + char2); // c
		System.out.println("char3 : " + char3);   // c
		
		/*        byte - short        */ 
		byte age1 = 10;
		byte age2 = 20;
		// short sum = age1 + age2;  // cannot convert from int to short 
		
		final byte age3 = 10;
		final byte age4 = 20;
		short sum2 = age3 + age4; // declared as final ==> the compiler is assumed that their sum assigned to a variable of type short 
		
		int age5 = 3;
		long age6 = 5;
		// int sum3 = age5 + age6;  // data type long ==> all operand values are Widened to long

		
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
		
		// aa - ++bb     Vs     aa - bb++ 
		int aa = 20;
		int bb = 10;
		int cc = aa - ++bb; // add +1 then make the operation 
		System.out.println(cc); // 9
		System.out.println(bb); // 11
		
		int aaa = 50;
		int bbb = 10;
		int ccc = aaa - bbb++; // make the operation and then add +1
		System.out.println(ccc); // 40
		System.out.println(bbb);  // 11
		
		// dd * --ee
		double dd = 20.0;
		double ee = 10.0;	
		double ff = dd * --ee;  // subtract -1 and then make the operation
		System.out.println(ff); // 180.0
		System.out.println(ee); // 9.0
	}
	
	/*
	 * 					Exam TIP
	 * 
	 * 		for all arithmetic operations with data types char, byte, short or int,
	 * 		all operand values are Widened to int 
	 * 
	 * 		if an arithmetic operation includes	the data type long ==> all operand values are widened to long		
	 */
}
