package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.LocalTime;

import java.time.LocalTime;

public class Main {

	public static void main(String[] args) {
		
		/* 			LocalTime 			*/
		
		LocalTime timeHrsMin = LocalTime.of(12, 12);
		LocalTime timeHrsMinSec = LocalTime.of(0, 12, 6);
		LocalTime timeHrsMinSecNano = LocalTime.of(14, 7, 10, 998654578); // 14:07:10.998654578
		
		System.out.println(timeHrsMinSec);
		System.out.println(timeHrsMinSecNano);
		
		// get the current time ==> now()
		LocalTime time = LocalTime.now(); 
		System.out.println(time);
		
		// parse String to LocalTime
		LocalTime time2 = LocalTime.parse("15:01:23"); // 15:01:23
		
		// LocalTime Constants
		System.out.println(LocalTime.MAX);  // 23:59:59.999999999
		System.out.println(LocalTime.MIN);  // 00:00
		System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT)); // true
		
		// Runtime Exception       Vs      Compilation Error
		LocalTime timeHrsMin2 = LocalTime.of(120, 12); // RuntimeException ==> DateTimeException 
		//LocalTime timeHrsMin3 = LocalTime.of(9986545781, 12); // Compilation Error ==> is out of int range
		
		
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
}
