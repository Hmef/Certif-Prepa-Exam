package com.OCA.PracticeTests.Chap5.loop.Ex15;

// package peregrine

public class TimeLoop {

	public static void main(String[] args) {  // java peregrine.TimeLoop September 3 1940?
		
		for(int i = args.length; i >= 0; i++) {	
			System.out.println("args");
		}
	}
	
	/*
	 * 		What is the result of the following when run with 
	 * 
	 * 		java peregrine.TimeLoop September 3 1940?
	 * 
	 * 		Output 
	 * 
	 * 		A. args
	 * 		B. argsargs
	 * 		C. this code does not compile
	 * 		D. None of the above
	 */
	
	/*
	 *     java peregrine.TimeLoop September 3 1940? ==> there are 3 arguments passed to the program   
	 *    
	 *     ==> this means that i is 3 on the first iteration of the loop
	 *     
	 *     this code produces an infinite loop
	 */
}
