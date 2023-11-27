package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.LocalDate;

import java.time.LocalDate;

public class LocalDateBirthday {

	public static void main(String[] args) {
		
		LocalDate sandrineBday = LocalDate.parse("2020-08-30");
		LocalDate paulBday = LocalDate.parse("2020-07-29");
		
		// isAfter() & isBefore()
		System.out.println(sandrineBday.isAfter(paulBday));  // true 
		System.out.println(paulBday.isBefore(sandrineBday));
		System.out.println(sandrineBday.isBefore(sandrineBday)); // false
	}
}
