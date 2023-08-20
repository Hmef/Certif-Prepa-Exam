package com.OCP81Z0808.LocalDate;

import java.time.LocalTime;

public class LocalTimeTest {

	public static void main(String[] args) {
		
		LocalTime timeHrsMin = LocalTime.of(12, 12);
		LocalTime timeHrsMinSec = LocalTime.of(0, 12, 16); 
		
		/*
		 * Exam TIP 
		 */
		LocalTime timeHrsMin2 = LocalTime.of(120, 12); // DateTimeException ==> valid values 0 - 23
	}
}
