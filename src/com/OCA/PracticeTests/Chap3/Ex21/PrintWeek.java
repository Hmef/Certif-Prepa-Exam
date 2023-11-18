package com.OCA.PracticeTests.Chap3.Ex21;

public class PrintWeek {

	public static void main(String[] days) {
		
		System.out.println(5 + 6 + "7" + 8 + 9);
	}
	
	/*
	 * 				Exam TIP
	 * 
	 * 		Java evaluates + from left to right 
	 * 		1. the first two values are both numbers ==> addition 5 + 6
	 * 		2. 11 + "7" ==> numbers + String ==> is a String concatenation 
	 * 						since one of the terms is a String ==> 117
	 * 		3. String + 8 ==> Concatenation ==> result : 1178
	 * 		4. String + 9 ==> Concatenation ==> result : 11789
	 */
}
