package com.OCA.PracticeTests.Chap1.JavaBasics.Ex18;

public class Main {

	public static void main(String[] args) {
		
		String tree = "pine";
		int count = 0;
		
		if(tree.equals("pine")) {
			
			int height = 50; // Local variable
			count = count + 1;
		}	
		System.out.println(height + count); // Compilation Error 
	}
}
