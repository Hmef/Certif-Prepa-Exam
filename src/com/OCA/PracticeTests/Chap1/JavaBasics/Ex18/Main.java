package com.OCA.PracticeTests.Chap1.JavaBasics.Ex18;

public class Main {

	public static void main(String[] args) {
		
		String tree = "pine";
		int count = 0;
		 
		int height = 0;  // Solution 
		if(tree.equals("pine")) {
			
			//int height = 50; // Local variable
			height = 50;
			count = count + 1;
		}	
		System.out.println(height + count); // not compile ==> Initialize variable ==> int height = 0;
	}
	
	/*
	 * 		the height variable is declared within the if statement block
	 * 
	 * 		it cannot be referenced outside the if statement and the code does not compile 
	 */
}
