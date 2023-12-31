package com.OCA.PracticeTests.Chap1.JavaBasics.Ex12;

public class ParkRanger {

	//static int birds = 10; // Solution 1 ==> static int birds = 10;
	
	int birds = 10; 
	
	public static void main(String[] data) {
		
		int trees = 5;
		
		ParkRanger parkRanger = new ParkRanger();  // instance of the class 
		
		// System.out.println(trees + birds);  // Compilation Error
		
		System.out.println(trees + parkRanger.birds);  // Solution 2

		
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
	
	/*
	 * 
	 *  Watch Out ==> static int    NOT   int static 
	 * 
	 */
}
