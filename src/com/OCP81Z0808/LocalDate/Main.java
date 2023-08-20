package com.OCP81Z0808.LocalDate;

import java.time.LocalDate;

public class Main {
	
	public static void main(String[] args) {
		
		LocalDate date = LocalDate.parse("2020-08-30");
		
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfYear());
		System.out.println(date.getMonth());
		System.out.println(date.getMonthValue());
		System.out.println(date.getYear());
	}

}
