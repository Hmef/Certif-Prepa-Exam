package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.LocalTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeBasics {

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
		System.out.println(LocalTime.NOON);  // 12:00
		System.out.println(LocalTime.MIN.equals(LocalTime.MIDNIGHT)); // true
		
		// getHour 
		LocalTime time3 = LocalTime.of(16, 20, 12, 9753324);
		System.out.println(time3.getHour());
		System.out.println(time3.getMinute());
		System.out.println(time3.getSecond());
		System.out.println(time3.getNano());
		
		// minusMinutes() 
		LocalTime movieStartTime = LocalTime.of(21, 0, 0); // we can use LocalTime.parse("21:00:00");
		int commuteMin = 35;
		LocalTime paulStartTime = movieStartTime.minusMinutes(commuteMin);
		System.out.println(" Start by " + paulStartTime + " from office");
		
		// plusMinutes()
		
		// withMinute()
		LocalTime startTime = LocalTime.of(5, 7, 9);
		if(startTime.getMinute() < 30)
			startTime = startTime.withMinute(0);
		System.out.println(startTime); // 0 minutes 
		
		// atDate() 
		LocalTime timee = LocalTime.of(14, 10, 0);
		LocalDate date = LocalDate.of(2016, 02, 25);
		LocalDateTime dateTime = timee.atDate(date);  // 2016-02-25T14:10
		System.out.println(dateTime);
	}
	
	/*
	 * 					Exam TIP
	 * 				             getHour()
	 * 
	 * 	Watch out for exam questions that use Invalid method names  
	 * 
	 * 		getHour         Not       getHours with S
	 *  	getMinute()     Not       getMinutes() with S 
	 *      getSecond()     Not       getSeconds() with S 
	 *      getNano()       Not       getNanoSeconds() 
	 */
	
	/*
	 * 					   Exam TIP 
	 * 					            MinusMinutes()
	 * 
	 *   unlike getMinute     ==>     MinusMinutes (with S) use the Plural 
	 */
	
	/*
	 * 					Exam TIP
	 				             atDate()
	 				             
	 	  atDate() ==> create a LocalDateTime instance ==> combine LocalTime with LocalDate
	 */
	
	/*
	 * 					Exam TIP
	 * 							 DateTimeException
	 *  
	 *  java.time.DateTimeException : Invalid value for HourOfDay (valid values 0 - 23): 120  
	 */
	
}
