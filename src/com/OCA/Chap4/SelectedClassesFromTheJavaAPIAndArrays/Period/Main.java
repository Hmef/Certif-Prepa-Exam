package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.Period;

import java.time.Period;

public class Main {

	public static void main(String[] args) {
		
		/*               Period             */

		Period period1 = Period.of(1, 2, 7);
		
		Period period2 = Period.ofYears(2);
		System.out.println(period2); // P2Y
		
		Period period3 = Period.ofWeeks(10);
		System.out.println(period3);  // P70D
		
		// 35 days not stored as 1 month and 5 days: Exam TIP
		Period period4 = Period.ofDays(35);
		System.out.println(period4);   // P35D
		System.out.println(period4.getDays()); // 0
		
		// you can define negative or positive period of time: Exam TIP
		Period period5 = Period.ofMonths(-12);
		System.out.println(period5);  // P-12M
		
		Period period6 = Period.of(5, -11, 7);
		System.out.println(period6); // P5Y-11M7D
		
		// parse a String to Period ==> parse()
		Period period7 = Period.parse("P5Y"); // P5Y

		Period period8 = Period.parse("P-6Y"); //P-6Y
		
		Period period9 = Period.parse("+P9M");  // P9M
		
		Period period10 = Period.parse("-P-4D");  // Exam TIP ==> P4D
		
		Period p5years = Period.parse("p5Y1m2d"); // P5Y1M2D
		
		Period p5weeks = Period.parse("-P5W"); // P-35D ==> 5 * 7 
		System.out.println(p5weeks);

		/*
		 * 					Exam TIP
		 * 
		 * 	 you can parsing a String to instantiate Period by using its static method parse()
		 */
		
		//  P5Y1M2D : Period of 5 years, 1 month and 2 days
	}
}
