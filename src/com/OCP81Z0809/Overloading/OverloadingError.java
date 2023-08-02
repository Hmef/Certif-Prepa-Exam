package com.OCP81Z0809.Overloading;

public class OverloadingError {

	
	public static void aMethod(byte val) { System.out.println("byte");}
	public static void aMethod(short val) { System.out.println("short");}
	
	// solution 
	public static void aMethod(int val) { System.out.println("int");}
	
	public static void main(String[] args) {
		
		aMethod(9); // closet match by upcast (cast byte to int)
	}
}
