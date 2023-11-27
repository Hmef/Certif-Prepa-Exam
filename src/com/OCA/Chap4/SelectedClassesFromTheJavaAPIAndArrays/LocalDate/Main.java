package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.LocalDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {
	
	public static void main(String[] args) {
		
		/*				LocalDate				*/
		
		// of()
		LocalDate date1 = LocalDate.of(2015, 12, 27);
		LocalDate date2 = LocalDate.of(2015, Month.DECEMBER, 29);  // Month.DECEMBER
		
		// parse()
		LocalDate date = LocalDate.parse("2020-08-30"); 
		
		// getDayOfMonth()
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());     // SUNDAY
		System.out.println(date.getDayOfYear());  // 243
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());  // getMonthValue() ==> 8
		System.out.println(date.getYear());
		
		// minusDays - minusWeeks
		LocalDate date3 = LocalDate.of(2015, 10, 20); // date3 is immutable
		System.out.println(date3.minusDays(3));  // create and return a copy of date3 with the specified days
		System.out.println(date3.minusWeeks(10)); // 2015-08-11
		
		// minusWeeks(-13)
		System.out.println(date3.minusWeeks(-13)); // 2016-01-19 ==>  add 13 weeks to 2015-10-20
		
		// withHour() 
		
		// LocalDate.of() - atTime()
		LocalDate interviewDate = LocalDate.of(2016,02,28); // LocalDate.of()
		
		System.out.println(interviewDate.atTime(16, 30));
		System.out.println(interviewDate.atTime(16, 30, 20)); // 2016-02-28T16:30:20
		System.out.println(interviewDate.atTime(16, 30, 20, 300)); // T separate Date and Time
		System.out.println(interviewDate.atTime(LocalTime.of(16, 30))); // 2016-02-28T16:30
		
		// DateTimeException - LocalDate.of() - atTime()
		//System.out.println(interviewDate.atTime(LocalTime.of(11111, 30)));  // valid values 0 - 23 : 11111

		// toEpochDay()
		LocalDate launchBook = LocalDate.of(2016, 2, 8);
		LocalDate aDate = LocalDate.of(1970, 1, 8);
		
		System.out.println(launchBook.toEpochDay());  // the count of days from January 1, 1970 ==> output: 16839
		System.out.println(aDate.toEpochDay());  // Output ==> 7 days 
		
		// parse() Exception : invalid format
		LocalDate date4 = LocalDate.parse("test");  // DateTimeParseException
		//System.out.println(date3);
		
		// parse() Exception : 2 digits
		LocalDate date5 = LocalDate.parse("2015:4:6"); // values of month and day must be TWO digits
	}
	
	/*
	 * 					Exam TIP
	 * 							LocalDate Constructor
	 * 	
	 * 	LocalDate Constructor is marked as PRIVATE ==> so we need use one of the factory methods to instantiate it
	 *  
	 *  like the static method ==> of()
	 * 		
	 */
	
	/*
	 * 							Exam TIP 
	 * 									 Immutable
	 * 
	 *  The LocalDate instances are immutable
	 *  
	 *   LocalDate can be used to store dates like 2015-12-27 
	 * 
	 */
	
	/*
	 * 					 		Exam TIP
	 * 									DateTimeParseException
	 * 
	 *  if we pass invalid value to parse() or of() ==> we will get DateTimeParseException
	 *  
	 *  The format of the String passed to parse() method must be exactly of the format 9999-99-99
	 *  
	 *  LocalDate.parse("2015:4:6"); ==> java.time.format.DateTimeParseException: Text '2015:4:6' could not be parsed at index 4
	 */
	
	// System.out.println(interviewDate.atTime(LocalTime.of(11111, 30))); // throw DateTimeException
	
	/*
	 * 				  Exam TIP
 							   atTime()
 
 			add time to date ==> interviewDate.atTime(16, 30) ==> 2016-02-28T16:30
 			T : separate Date and Time
	 */
	/*
	 * 					Exam TIP
 								 toEpochDay()
 			
 			the count of days from January 1, 1970 
	 */

}
