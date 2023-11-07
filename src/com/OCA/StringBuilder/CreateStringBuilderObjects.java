package com.OCA.StringBuilder;

public class CreateStringBuilderObjects {

	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();   
		StringBuilder sb2 = new StringBuilder(sb1);   // sb1 Vs sb2 ??!
		StringBuilder sb3 = new StringBuilder(50);
		StringBuilder sb4 = new  StringBuilder("test Stringbuilder");  
		
		
		// ********* Exam TIP *********
		

	}
}


/*
 * 
     		Code executes behind the scenes
     		initialize the array value defined in the class StringBuilder() itself
     		 
     		StringBuilder sb1 = new StringBuilder();
     						==>
     		StringBuilder() { 
     			value = new char[16];    // Creating an array of length 16
     		}
 * 
 * 
 */



