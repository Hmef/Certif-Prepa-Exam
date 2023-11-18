package com.OCA.PracticeTests.Chap3.Ex17;

public class TheBigRace {

	public static void main(String[] in) {
		
		int tiger = 2;
		short lion = 3;
		
		long winner = lion+2*(tiger + lion); // multiplication Operator is powerful than addition
		System.out.println(winner);
	}
	
	/*
	 * 				Exam TIP 
	 * 
	 * 	parentheses take precedence over the operations outside the parentheses 
	 * 
	 * 		1. Parentheses 3+2*(5) 
	 * 		2. Multiplication 3+10  
	 * 		3. Addition 10
	 * 
	 * 		Parentheses > Multiplication > Addition
	 * 
	 */
}
