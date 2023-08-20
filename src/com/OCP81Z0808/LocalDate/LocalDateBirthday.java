package com.OCP81Z0808.LocalDate;

import java.time.LocalDate;

public class LocalDateBirthday {

	public static void main(String[] args) {
		
		LocalDate sandrineBday = LocalDate.parse("2020-08-30");
		LocalDate paulBday = LocalDate.parse("2020-07-29");
		
		System.out.println(sandrineBday.isAfter(paulBday));
		System.out.println(paulBday.isBefore(sandrineBday));
		System.out.println(sandrineBday.isBefore(sandrineBday));
	}
}
