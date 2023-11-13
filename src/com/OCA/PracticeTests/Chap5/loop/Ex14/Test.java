package com.OCA.PracticeTests.Chap5.loop.Ex14;

public class Test {

	
	public static void main(String[] args) {
		
		String letters = "";
		System.out.println(" letters : " + letters);
		System.out.println(" letters.length() ==> " + letters.length()); // ==> 0
		
		while(letters.length() != 2) 
			letters += "a";
		System.out.println(letters);  // Response 

		/*
		 * 			length() method
		 * 
		 * 			String letters = "";  ==> the length of an empty String is 0 
		 * 
		 * 			letters = "a"; ==> letters.length() == 1
		 * 
		 * 			"a" and not 'a'  
		 */
	}
}
