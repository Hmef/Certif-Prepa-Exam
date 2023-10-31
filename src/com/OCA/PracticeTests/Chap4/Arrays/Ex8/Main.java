package com.OCA.PracticeTests.Chap4.Arrays.Ex8;

public class Main {

	public static void main(String[] args) {
		
		String days[] = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday" };
		
		System.out.println(" days.length : " + days.length);
		System.out.println("");
		
		for(int i = 0; i < days.length; i++) {
			
			System.out.println(" i ==> " + i);
			System.out.println(days[i]);
		}
	}
}
