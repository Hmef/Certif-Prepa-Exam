package com.OCP81Z0808.StringBuilder;

public class CreateStringBuilderObjects {

	
	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder();   // Creating an array of length 16
		StringBuilder sb2 = new StringBuilder(sb1);  
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
     			value = new char[16];  
     		}
 * 
 * 
 */



