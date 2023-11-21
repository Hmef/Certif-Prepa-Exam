package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex30;

public class Countdown {

	public static void main(String[] args) {
	
		String builder = "54321";
		builder = builder.substring(4);
		System.out.println(builder.toString());
		System.out.println(builder.charAt(2));  // StringIndexOutOfBoundsException
	}
	
	
	/*
	 * 				Exam TIP
	 * 
	 * 		builder.substring(4) ==> 1
	 * 
	 * 		chartAt() method 
	 * 
	 * 		String is immutable so the line create a new String with the value 1
	 */
}
