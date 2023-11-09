package com.OCA.PracticeTests.Chap2.DataTypes.Ex9;

public class Values {

	Integer a = Integer.valueOf(1);  // Error ==> the code does not compile
	static int m = 55;  // Error ==> change to static 
	
	public static void main(String[] args) {
		
		
		Integer a = Integer.valueOf(2);  // Solution  ==> there is no class named integer ==> Integer is a class 
		Integer b = Integer.valueOf(3);  // int is a primitive type and Integer is a class 
		
		Integer n = Integer.valueOf(m);
		
		System.out.println(a + b);
		System.out.println(n);
	}
}
