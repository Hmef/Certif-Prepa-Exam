package com.OCP81Z0809.Overloading;

public class Overloaded {

	public static void aMethod(int val) { System.out.println("int");}
	
	public static void aMethod(short val) { System.out.println("short");}
	
	public static void aMethod(Object val) { System.out.println("Object");}
	
	public static void aMethod(String val) { System.out.println("String");}
	
	
	public static void main(String[] args) {
		
		byte b = 9;
		aMethod(b); 
		aMethod(9);
		
		Integer i = 9;
		aMethod(i);
		aMethod("9");
	}
}

/*

		This process of the compiler trying to resolve the method call from 
		given overloaded method definitions is called overload resolution. 
		For resolving a method call, it first looks for the exact match 
		— the method definition with exactly same number of parameters and types of parameters. 
		If it can’t find an exact match, it looks for the closest match by using upcasts. 
		
*/