package com.OCA.PracticeTests.Chap2.DataTypes.Ex9;

public class Values {

	integer a = Integer.valueOf(1);  // Error
	
	public static void main(String[] args) {
		
		integer a = Integer.valueOf(2);  // Error  ==> there is no class named integer 
		integer b = Integer.valueOf(3);  // Error
		
		System.out.println(a + b);
	}
}
