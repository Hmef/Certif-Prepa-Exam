package com.OCA.PracticeTests.Chap3.Ex15;

public class Main {

	public static void main(String... args) {
		
		int hops = 0;
		int jumps = 0;
		
		jumps = hops++;
		
		if(jumps)  // 
			System.out.println("Jump!");
		else
			System.out.println("Hop!");
	}
	
	/*
	 * 		Java doesn't automatically convert integers to boolean values for use in if-then statement  
	 * 
	 * 		if(jumps) evaluates to if(0), and since 0 is not a boolean value ==> the code does not compile
	 */
}
