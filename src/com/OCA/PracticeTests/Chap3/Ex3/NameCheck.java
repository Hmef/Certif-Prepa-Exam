package com.OCA.PracticeTests.Chap3.Ex3;

public class NameCheck {

	public static void main(String... data) {
		
		String john = "john";
		String jon = new String(john);
		
		System.out.println((john == jon) +" "+ john.equals(jon));
		
		System.out.println(" john content ==> " + john.toString());
		
		System.out.println(" jon content ==> " + jon.toString());
	}
	
	/*
	 * 					== : compare the address (reference) of the two objects
	 * 
	 * 	John value is placed on the pool of the String objects 
	 * 	
	 */
	
	/*
	 * 					equals() method : compare the content
	 * 
	 * 	john.equals(jon) return true because the values they refers to are equivalent 
	 * 
	 * 
	 */
}
