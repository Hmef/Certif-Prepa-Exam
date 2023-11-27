package com.OCA.Chap4.SelectedClassesFromTheJavaAPIAndArrays.LocalDateTime;

import java.time.LocalDateTime;

public class PrizeCeremonyLocalDateTime {

	public static void main(String[] args) {
		
		LocalDateTime prizeCeremony = LocalDateTime.parse("2016-06-05T14:00:00");
		LocalDateTime dateTimeNow = LocalDateTime.now();
		
		if(prizeCeremony.getMonthValue() == 6) {
			System.out.println("Can't invite president");
		} else {
			System.out.println("President invited");
		}
		
		LocalDateTime chiefGuestDeparture = LocalDateTime.parse("2016-06-05T14:30:00");
		
		if(prizeCeremony.plusHours(2).isAfter(chiefGuestDeparture)) 
			System.out.println(" Chief Guest will leave before ceremony completes");
		
	}
}
