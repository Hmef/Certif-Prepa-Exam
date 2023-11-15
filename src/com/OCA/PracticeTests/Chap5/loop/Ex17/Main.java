package com.OCA.PracticeTests.Chap5.loop.Ex17;

public class Main {
	
	public static void main(String[] args) {
		
		int count = 0;  // solution 
		do {
			//int count = 0;
			do {
				count++;
			} while(count < 2); 
			break;
		} while(true);
		System.out.println(count); //
	}

	/*
	 * 					Exam TIP
	 * 
	 * 		the count variable declare inside the loop
	 * 
	 * 		it's not in scope after the loop
	 */
	
}
