package com.OCA.PracticeTests.Chap2.DataTypes.Ex9;

public class Values {

	Integer a = Integer.valueOf(1);  // Error ==< the code does not compile
	
	public static void main(String[] args) {
		
		Integer a = Integer.valueOf(2);  // Error  ==> there is no class named integer 
		Integer b = Integer.valueOf(3);  // Error
		
		System.out.println(a + b);
	}
}
