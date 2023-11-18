package com.OCA.PracticeTests.Chap3.Ex18;

public class Test {

	public static void main(String[] args) {
		
		final int saturday = 6; // what variable type of saturday is not permitted??
		
		int dayOfWeek = 0;
		
		switch(dayOfWeek) {
		
		default:
			System.out.println("Another weekday");
		break;
		
		case saturday: 
			System.out.println("Weekend!");
		
		}
		
		/*
		 * 					Exam TIP
		 * 
		 * 	switch statement do not support long values and 
		 * 	
		 * 	long cannot be converted to int without a possible 
		 * 
		 *  loss of data 
		 */
	}
}
