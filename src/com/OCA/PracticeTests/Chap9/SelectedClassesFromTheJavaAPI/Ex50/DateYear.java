package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex50;

import java.time.LocalDate;

public class DateYear {

	public static void main(String[] args) {
		
		/*   			LocalDate 			   */ 
		
		LocalDate xmas = LocalDate.of(2016, 12, 25);
		//xmas.setYears(2017);  // Error ==> doesn't compile
		
		// getYear()
		System.out.println(xmas.getYear());
		
		// withMonth()
		System.out.println(xmas.withMonth(6));  // alter the month of the xmas 
		
		// withYear() 
		System.out.println(xmas.withYear(2020));
		
		// withDayOfYear()
		System.out.println(xmas.withDayOfYear(55));
		System.out.println(xmas.withDayOfYear(366)); //
		
		// getMonthValue()
		System.out.println(xmas.getMonthValue());
		
		// toString()
		System.out.println("xmas : " + xmas.toString());
	}
	
	/*
	 * 				Exam TIP
	 * 
	 *   date and time are Immutable ==> this means they do not contain setter methods
	 */
	
	/*
	 * 				Exam TIP
	 * 
	 *  withMonth() method returns a copy of the LocalDate with the month-of-year altered  
	 *  
	 *  withDayOfYear() method: result from 1 to 365-366
	 *  
	 */
}
