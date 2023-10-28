package com.OCA.PracticeTests.Chap1.JavaBasics.Ex12;

public class ParkRanger {

	int birds = 10;
	
	public static void main(String[] data) {
		
		int trees = 5;
		
		System.out.println(trees + birds);  // Compilation 
		
	}
	
	/*
	 * 		Variable scope  
	 * 		
	 * 		static method ==> main method is a static method 
	 * 
	 * 		not static variable ==> birds
	 * 
	 * 		class instance variable ==> parkRanger ( ParkRanger parkRanger = new ParkRanger())
	 */
	
	/*
	 * 		Compilation Error ==> when a static method (main) try to access to a non-static variable (trees) without an instance of the class
	 */
}
