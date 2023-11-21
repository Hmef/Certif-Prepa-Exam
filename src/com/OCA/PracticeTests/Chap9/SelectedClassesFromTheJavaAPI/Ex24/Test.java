package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex24;

public class Test {

	public static void main(String[] args) {
		
		secret("paper123");
	}
	
	public static void secret(String mystery) {
		
		mystery = mystery.replace("1", "8");
		boolean test = mystery.startsWith("paper");
		System.out.println(test);
		
		String s  = mystery.toString();
		System.out.println(s);
	}
	
	/*
	 * 						Exam TIP
	 * 
	 * 		String is the only type of this three to have a startsWith() method
	 * 		
	 * 		replace() method with 2 parameters 	==> String 	
	 * 
	 * 		replace() method with 3 parameters ==> StringBuilder
	 */
	
	/*
	 *     secret(______ mystery) which the references type can fill the blank 
	 *     							to complete this method
	 *     
	 *     A. ArrayList
	 *     B. String
	 *     C. StringBuilder
	 *     D. None of the above
	 *     
	 */
	
	
}
