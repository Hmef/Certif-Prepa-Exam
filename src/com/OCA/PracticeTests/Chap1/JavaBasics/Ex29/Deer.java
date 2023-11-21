package com.OCA.PracticeTests.Chap1.JavaBasics.Ex29;

/* package forest   */ 

public class Deer {
	
	public static void main(String... deerParams) {
		
		//System.out.println(theInput[2]);
		System.out.println(deerParams[2]);
	}
	
	
	/*
	  		Which command will cause the application to output the message White-tailed ?
	  			
	  		A. java forest.Deer deer 5 "White-tailed deer"   ==> 3 arguments 
	  		B. java forest.Deer "White-tailed deer" deer 3   ==> 3 inputs 
	  		C. java forest.Deer Red deer White-tailed deer   ==> 4 arguments
	  		D. java forest.Deer My " deer White-tailed"      ==> 2 inputs
	 */
	
	/*
	 * 					Exam TIP 
	 * 
	 * 	"" the double quote group input arguments
	 *  the third argument of Option A is "White-tailed deer" 
	 *  Option D has only 2 inputs ==> ArrayIndexOutOfBoundsException : trying to read the third argument at runtime
	 */

}
