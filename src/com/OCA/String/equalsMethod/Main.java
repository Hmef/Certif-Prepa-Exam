package com.OCA.String.equalsMethod;

public class Main {

	public static void main(String[] args) {
		
		String var1 = new String("Java");
		String var2 = new String("Java");
		
		String var3 = "code";
		String var4 = "code";
		
		System.out.println(var1.equals(var2));  
		System.out.println(var1 == var2);
		
		System.out.println(var3.equals(var4));  // equals method
		System.out.println(var3 == var4);      // == 
		
		// use != Operator to compare the inequality of objects referred to by String variables
		System.out.println(var1 != var2);
		System.out.println(var3 != var4);  // refer to the same object in the pool of String constants 
		
	}
	
	/*
	 * 				Exam TIP
	 * 
	 * 	you should NEVER use == Operator for comparing String values 
	 * 
	 */
	
	
	/*
	 * 							Exam TIP 
	 * 
	 *  	== compare the reference
	 *  
	 *  	equals() method : Compare the sequence of characters in the two String Object
	 *  
	 *  	!= compare inequality of the references
	 */
}
