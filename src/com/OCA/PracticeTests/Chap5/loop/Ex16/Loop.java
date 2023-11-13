package com.OCA.PracticeTests.Chap5.loop.Ex16;

public class Loop {
	
	private static int count;
	
	private static String[] stops = new String[] {"Washington", "Monroe", "Jakson", "LaSalle"};
	
	public static void main(String[] args) {
		
		// The value of count variable before Increment 
		System.out.println(" count before Incrementation : " + count);
		
		while(count < stops.length) {  // lengh
			
			if(stops[count++].length() < 8) {   // length()
				
				break;
			}
		}
		System.out.println(" count after increment : " + count);
		System.out.println(" stops.length : " + stops.length);
		
	}
}
