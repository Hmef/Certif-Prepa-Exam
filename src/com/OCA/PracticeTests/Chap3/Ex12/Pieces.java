package com.OCA.PracticeTests.Chap3.Ex12;

public class Pieces {

	public static void main(String[] info) {
		
		int flair = 15;
		
		if(flair >= 15 && flair < 37) {
			
			System.out.println("not enough");
			
		} if(flair == 37) {
			
			System.out.println("Just right");
		} else {
			
			System.out.println("Too many");
		}
	}
	
	/*
	 * 			notice that the second if-then statement is not connected to the first if-then statement 
	 *  
	 */
}
