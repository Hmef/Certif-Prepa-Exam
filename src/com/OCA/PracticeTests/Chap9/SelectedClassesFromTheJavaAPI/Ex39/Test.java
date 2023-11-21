package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex39;

public class Test {

	public static void main(String... args) {
		
		String happy = " :) - (: ";
		String really = happy.trim();
		System.out.println(really.toString());
		String question = happy.substring(1,happy.length()-1); //
		System.out.println(happy.length());
		System.out.println(question.toString());
		
		System.out.println(really.equals(question)); //
	}
	
	/*
	 * 			Exam TIP
	 * 
	 * 		equals compare the content of the two String Object
	 * 
	 * 		The Two String Object reside in the Pool of String Object
	 */
	
}
