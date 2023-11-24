package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex49;

public class Costume {

	public static void main(String[] black) {
		
		
		String witch = 'b';  // Error: declaration of witch is incorrect 
						    //  ==> it tries to store a char into a String variable reference
							// Solution ==> String witch = "b"; 
		String tail = "lack";
		System.out.println(witch);
		
		// concat()
		witch = witch.concat(tail); //
		System.out.println(witch);
	}
	
	/*
	 * 				Exam TIP 
	 * 
	 * 		'b' a character ==> can(t assign a character to a String variable reference
	 * 						==> the code doesn't compile 
	 * 		Solution ==> making b a String variable ==> "b"		
	 * 
	 */
}
