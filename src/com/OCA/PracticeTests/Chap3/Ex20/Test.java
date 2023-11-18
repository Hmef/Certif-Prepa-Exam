package com.OCA.PracticeTests.Chap3.Ex20;

public class Test {

	public static void main(String[] vars) {
		
		int leaders = 10 * (2 + (1 + 2 / 5)); // 
		int followers = leaders * 2;
		
		System.out.println(" leaders : " + leaders);
		// Ternary operators 
		System.out.println(leaders + followers < 10 ? "Too few" : "Too many");
	}
}
