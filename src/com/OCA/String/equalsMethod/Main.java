package com.OCA.String.equalsMethod;

public class Main {

	public static void main(String[] args) {
		
		String var1 = new String("Java");
		String var2 = new String("Java");
		
		System.out.println(var1.equals(var2));  
		System.out.println(var1 == var2);
		
	}
	
	
	
	/*
	 * 							Exam TIP 
	 * 
	 *  	== compare the reference
	 *  
	 *  	equals() method : Compare the sequence of characters in the two String Object
	 */
}
