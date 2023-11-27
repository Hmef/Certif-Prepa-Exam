package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.LocalTime;

import java.time.LocalTime;

public class LocalTimeExceptions {

	public static void main(String[] args) {
		
		/* 			LocalTime Exceptions		*/

		LocalTime timeHrsMin = LocalTime.of(12, 12);
		LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);

		// Runtime Exception       Vs      Compilation Error
		LocalTime timeHrsMin2 = LocalTime.of(120, 12); // RuntimeException ==> DateTimeException 
		//LocalTime timeHrsMin3 = LocalTime.of(9986545781, 12); // Compilation Error ==> is out of int range
		
		// values passed to parse must be TWO digits
		LocalTime time4 = LocalTime.parse("2:1"); // Invalid value ==> parse("02:10") valid values
		System.out.println(time4);
		
		// RuntimeException ==> DateTimeException
		LocalTime time3 = LocalTime.parse("test"); // Invalid value for HourOfDay (valid values 0 - 23): 120
		System.out.println(time3);
		
		
	}
	/*
	 * 					Exam TIP
	 * 
	 *  			DateTimeException
	 *  
	 *  java.time.DateTimeException : Invalid value for HourOfDay (valid values 0 - 23): 120  
	 */
	
	/*
	 * 				   Exam TIP
	 * 
	 * 			   is out of int range
	 * 
	 *   LocalTime timeHrsMin3 = LocalTime.of(9986545781, 12); ==> 9986545781 is out of int range
	 */
	
	/*
	 * 				DateTimeException ==> parse() - Two digits
	 * 
	 * 	The Hours and Minutes values passed to parse() must be Two digist
	 *  a single digits is considered as an INVALID value 
	 */
	
}
