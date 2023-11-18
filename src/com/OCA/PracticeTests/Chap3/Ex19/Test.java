package com.OCA.PracticeTests.Chap3.Ex19;

public class Test {

	public static void main(String[] args) {
		
		int time = 11;
		//int day = 4;
		boolean day = true;
		
		String dinner = time > 10 ? day ? "Takeout" : "Salad" : "Leftovers"; //Error==> day is not a booealn
		System.out.println(dinner);
		
		/*
		 or 
		 int day = 4;
		 String dinner = time > 10 ? day < 5 ? "Takeout" : "Salad" : "Leftovers";
		 */
		
	}
}
