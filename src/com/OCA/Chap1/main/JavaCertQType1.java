package com.OCA.Chap1.main;

public class JavaCertQType1 {

	public static void main(String... cmd) {
		
		main("private", cmd);
	}
	
	private static void main(String type, String[] args) {
		
		System.out.println(args[0] + args[1]);
	}
	
	/*
	 * 				Exam TIP
	 * 						ArrayIndexOutOfBoundsException
	 * 	
	 * 	 java.lang.ArrayIndexOutOfBoundsException: 0
	 */
}
