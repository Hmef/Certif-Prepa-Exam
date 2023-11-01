package com.OCA.String.OverloadedConstructors;

public class Main {

	public static void main(String... args) {
		
		String girl = new String("Celine");
		
		char[] name = new char[] {'P','a','u','l'};
		
		String boy = new String(name);  // String Constructor that accepts a char Array
		
		
		// StringBuilder
		StringBuilder sd1 = new StringBuilder("String Builder");
		String str1 = new String(sd1);  // String Constructor that accepts object of StringBuilder 
		
		// StringBuffer 
		StringBuffer sb1 = new StringBuffer("String Buffer");
		String str2 = new String(sb1);  // String Constructor that accepts object of StringBuffer
		
		String s = null;
		System.out.println("s = " + s);
	}
	
	
	/*
	 *  We can also invoke other overloaded Constructors of the class String to create its Objects 
	 *  
	 *  by using the Operator new
	 */
	
	/*
	 * 				Exam TIP
	 * 
	 * 		the default value for String is ==>     null
	 */
}
