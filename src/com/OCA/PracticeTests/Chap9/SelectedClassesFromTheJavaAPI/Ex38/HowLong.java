package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex38;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HowLong {

	public static void main(String[] args) {
		
		//LocalDate newYears = LocalDate.of(2017, 0, 0); // Invalid value of MonthOfYear() 
													   // valid values (1 - 12) ==> DateTimeException
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		System.out.println(newYears); // 2017-01-01
		
		// Period
		Period period = Period.ofDays(1);
		
		//  DateTimeFormatter 
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println(format.format(newYears));  // 01-01-2017
		
		System.out.println(format.format(newYears.minus(period))); // subtract 1 day	
	}
	
	/*
	 * 					Exam TIP
	 	
	 	LocalDate newYears = LocalDate.of(2017, 1, 1);
		System.out.println(newYears); ==>  2017-01-01
		
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println(format.format(newYears));  ==>    01-01-2017
	 */
	
	/*
	 * LocalDate newYears = LocalDate.of(2017, 1, 1) ==> creates a date representing January 1, 2017
	 */
	
	/*
	 * 	DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy") 
	 *  ==> defines the format as month followed by day followed by year		
	 */
	
	/*
	 * 				DateTimeException
	 * 
	 *  LocalDate newYears = LocalDate.of(2017, 0, 0); ==> Invalid value of MonthOfYear() 
	 *  											 ==> valid values (1 - 12)
	 */
}
