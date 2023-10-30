package com.OCA.PracticeTests.Chap3.Ex2;

public class Main {

	public static void main(String[] args) {
		
		int meal = 5;
		int tip = 2;
		
		int total = meal +( meal>6 ? ++tip : --tip);
	}
	
	/*
	 * 	Ternary Expression ( meal>6 ? ++tip : --tip)
	 * 
	 * 		
	 */
}
