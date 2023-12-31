package com.OCP81Z0808.LocalDate;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2020-08-30"); 
		
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
		
		// LocalDate.of() - atTime()
		
		LocalDate interviewDate = LocalDate.of(2016,02,28); // LocalDate.of()
		
		System.out.println(interviewDate.atTime(16, 30));
		System.out.println(interviewDate.atTime(16, 30, 20));
		System.out.println(interviewDate.atTime(16, 30, 20, 300));
		System.out.println(interviewDate.atTime(LocalTime.of(16, 30)));
		
		/*
		 * Exam TIP 
		 */
		//System.out.println(interviewDate.atTime(LocalTime.of(11111, 30))); // throw DateTimeException
		
		
		// toEpochDay()
		
		LocalDate launchBook = LocalDate.of(2016, 2, 8);
		LocalDate aDate = LocalDate.of(1970, 1, 8);
		
		System.out.println(launchBook.toEpochDay());  // the count of days from January 1, 1970
		System.out.println(aDate.toEpochDay());  // Output ==> 7 days 
		
		
	}

}
