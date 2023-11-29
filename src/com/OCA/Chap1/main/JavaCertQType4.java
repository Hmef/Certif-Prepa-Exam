package com.OCA.Chap1.main;

public class JavaCertQType4 {

	public static void main(String... method) {
		
		main();
		main(method);
	}
	protected static void main() {
		System.out.println("EJava");
	}
	
	/*
	 *  		Output
	 *  	EJava 
	 *   java.lang.StackOverflowError
	 */
}
