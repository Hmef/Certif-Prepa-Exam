package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex33;

public class Legos {

	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder();
		sb.append("red");
		sb.deleteCharAt(0);
		sb.delete(1, 2);  //  
		
		System.out.println(sb);
	}
	

	/*
	 * 						Exam TIP
	 * 	
	 * 		Line 7 creates an empty StringBuilder
	 * 		Line 8 adds three characters to it 
	 * 		Line 9 removes the first character
	 * 		Line 10 deletes the characters starting at position 1 and ending right BEFORE position 2
	 * 							==> which removes the character at index 1 	
	 */
	
	/*
	 * 		sb.delete(int start, int end);
	 */
}
