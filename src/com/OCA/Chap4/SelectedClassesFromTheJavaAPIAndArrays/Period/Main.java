package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.Period;

import java.time.LocalDate;
import java.time.Period;

public class Main {

	public static void main(String[] args) {
		
		/*               Period             */

		Period period1 = Period.of(1, 2, 7);
		
		Period period2 = Period.ofYears(2);
		System.out.println(period2); // P2Y
		
		Period period3 = Period.ofWeeks(10);
		System.out.println(period3);  // P70D
		
		// a period of 35 days is not stored as 1 month and 5 days: Exam TIP
		Period period4 = Period.ofDays(35);
		System.out.println(period4);   // P35D
		System.out.println(period4.getDays()); // 35
		System.out.println(period4.getMonths());  // 0
		
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
		
		// Period.ofDays()
		LocalDate date = LocalDate.of(2020, 01, 31);
		System.out.println(date.plus(Period.ofDays(1))); // 2020-02-01
		
		// getMonths() - getDays()
		Period period11 = Period.of(2, 13, 40);
		System.out.println(period11.getMonths());  // 13 without any Exception 
		System.out.println(period11.getDays()); // 40
		
		// isZero()
		Period period12 = Period.of(0, 0, 5); // a period instance is Zero if ALL Three units are 0
		System.out.println(period12.isZero()); // false
		
		// isNegative()
		Period period13 = Period.of(0, 0, -5); // at least one of three components is NEGATIVE
		System.out.println(period13.isNegative()); 
		
		// multipliedBy()
		Period period14 = Period.of(4, 11, 10);
		System.out.println(period14.multipliedBy(2)); // P8Y22M20D
		
		Period period15 = Period.of(4, -11, 10);
		System.out.println(period15.multipliedBy(2)); // P8Y-22M20D
		
		// minus()  
		Period period10Days = Period.of(0, 0, 10);
		Period period1Month = Period.of(0, 1, 0);
		System.out.println(period10Days.minus(period1Month)); // P-1M10D NOT 20 days
		
		// minusDays()
		System.out.println(period10Days.minusDays(5)); // P5D
		
		// minusMonths()
		System.out.println(period10Days.minusMonths(5)); // P-5M10D
		
		// plus()
		System.out.println(period10Days.plus(period1Month)); // P1M10D
		
		// plusDays()
		System.out.println(period10Days.plusDays(15)); // P25D
		
		// plusYears()
		System.out.println(period10Days.plusYears(5)); // P5Y10D
		
		// plusMonths()
		System.out.println(period1Month.plusMonths(10)); // P11M
		
		// toTotalMonth()
		System.out.println(Period.of(10, 5, 40).toTotalMonths()); // 125
	}
	/*
	 * 					Exam TIP
	 * 
	 * 	 you can parsing a String to instantiate Period by using its static method parse()
	 */
	
	//  P5Y1M2D : Period of 5 years, 1 month and 2 days
	
	/*
	 * 					Exam TIP 
	 * 							Period.ofDays(35)		
	 * 
	 * 		 a period of 35 days is not stored as 1 month and 5 days ==> its an individual element
	 *  
	 *       its stored as 35 days 
	 */
	/*
	 * 					Exam TIP
	 * 							getMonths()
	 * 	
	 *  in the Period class, the both getMonths() and minusMonths() use the plural 
	 *  getMonths() With S ==> watch out for exam questions 
	 */
	
	/*
	 * 					Exam TIP
	 * 							multipliedBy()
	 * 
	 *  multipliedBy() is used to modify all elements of a period instance 
	 *  
	 *  Period doesn't define a "divideBy()" method
	 * 
	 */
}
