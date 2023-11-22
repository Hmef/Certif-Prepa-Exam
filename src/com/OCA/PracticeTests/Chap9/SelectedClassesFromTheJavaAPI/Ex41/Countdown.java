package com.OCA.PracticeTests.Chap9.SelectedClassesFromTheJavaAPI.Ex41;

public class Countdown {

	public static void main(String[] args) {
		
		StringBuilder builder = new StringBuilder("54321");
		String s = builder.substring(2);
		System.out.println(s);
		System.out.println(builder.charAt(1));
		
	}
}
