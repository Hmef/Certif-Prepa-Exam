package com.OCA.PracticeTests.Chap3.Ex3;

public class NameCheck {

	public static void main(String... data) {
		
		String john = "john";
		String jon = new String(john);
		
		System.out.println((john == jon) +" "+ john.equals(jon));
		
		System.out.println(" john content ==> " + john.toString());
		
		System.out.println(" jon content ==> " + jon.toString());
		
		System.out.println(" john reference : " + john);
	}
	
	/*
	 * 					== 
	 * 
	 * 	john et jon the two objects are not the same So
	 * 
	 * 				==> john == jon ==> result : false
	 */
	
	/*
	 * 					equals() method 
	 * 
	 * 	john.equals(jon) return true because the values they refers to are equivalent 
	 * 
	 * 
	 */
}
