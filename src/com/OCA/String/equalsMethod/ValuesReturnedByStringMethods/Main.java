package com.OCA.String.equalsMethod.ValuesReturnedByStringMethods;

public class Main {

	public static void main(String[] args) {
		
		String lang1 = "Java";
		String lang2 = "JaScala";
		
		String returnValue1 = lang1.substring(0, 1);   // Ja
		String returnValue2 = lang2.substring(0, 1);   // Ja
		
		System.out.println(returnValue1 == returnValue2);
		System.out.println(returnValue1.equals(returnValue2));
		
		
		
		/*
		 * 						Exam TIP
		 * 
		 * 		Watch out for the exam questions that test you on using the == operator
		 * 		String values returned by methods of the class String 
		 * 
		 * 		these values are created using the new Operator 
		 * 
		 * 		they aren't placed in the String pool
		 */
	}
}
