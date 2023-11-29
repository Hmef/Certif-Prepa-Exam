package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.Period;

import java.time.LocalDate;
import java.time.Period;

public class PeriodBetweenN {

	public static void main(String[] args) {
		
		LocalDate vacationStart = LocalDate.of(2020, 12, 31);
		LocalDate vacationEnd = LocalDate.of(2021, 1, 7);
		
		// Period.between()
		Period periodBetween = Period.between(vacationStart, vacationEnd); // P7D
		//
		Period perioddBetween = Period.between(vacationEnd, vacationStart); // P-7D
		System.out.println(periodBetween);  // P7D (Period of 7 days)
		System.out.println(perioddBetween);  
	}
}
