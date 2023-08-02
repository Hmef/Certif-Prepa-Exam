package com.OCP81Z0809.Overloading;

public class AmbiguousOverload {

	
	public static void aMethod(long val1, int val2) {
		
		System.out.println("long , int");
	}
	
	public static void aMethod(int val1, long val2) {
		
		System.out.println("int, long");
	}
	
	
	public static void main(String[] args) {
		
		//aMethod(9, 10); // Error Ambiguous Overload - there are two matches ( long and Integer ) 
		
	}
}


/*
 * 
 * 
			
			Why did this call become an “ambiguous” call? 
			The constants 9 and 10 are ints. 
			There are two aMethod definitions: one is aMethod(long, int) and another is aMethod(int, long)
			So there is no exact match for the call aMethod(int, int).
			An integer can be implicitly upcasted to both long as well as Integer
			
			Which one will the compiler choose? 
			Since there are TWO matches 
			the compiler complains with an ERROR that the call is ambiguous. 
 * 
 * 
 */
