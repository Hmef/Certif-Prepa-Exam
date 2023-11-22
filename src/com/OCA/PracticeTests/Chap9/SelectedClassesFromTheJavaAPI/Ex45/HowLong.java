package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex45;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HowLong {

	public static void main(String[] args) {
		
		LocalDate newYears = LocalDate.of(2017, 1, 1);
		Period period = Period.ofDays(1);
		DateTimeFormatter format = DateTimeFormatter.ofPattern("MM-dd-yyyy");  // Error ==> ("mm-dd-yyyy")
		System.out.println(format.format(newYears.minus(period)));
	}
	
	/*
	 * 					Exam TIP
	 *  
	 *  		MM      Vs    mm 
	 *  MM represents month      mm represents minutes 
	 *  
	 *  minutes not defined on a LocalDate object
	 *  
	 *  ofPattern("mm-dd-yyyy") ==> UnsupportedTemporalTypeException : Unsupported Field: MinuteOfHour
	 *  
	 */
}
