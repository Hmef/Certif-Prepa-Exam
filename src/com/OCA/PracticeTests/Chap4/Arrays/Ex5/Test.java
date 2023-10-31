package com.OCA.PracticeTests.Chap4.Arrays.Ex5;

import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
		
		printStormName("Arlene");
		
		printStormName(new String[] { "Bret" });
		
		//printStormNames("Cindy"); // doesn't compile
		
		printStormNames(new String[] { "Don" });
		
	}
	
	public static void printStormName(String... names) {
		
		System.out.println(Arrays.toString(names));
	}
	
	public static void printStormNames(String[] names) {
		
		System.out.println(Arrays.toString(names));
	}
}
