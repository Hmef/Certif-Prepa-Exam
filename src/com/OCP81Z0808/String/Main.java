package com.OCP81Z0808.String;

public class Main {

	public static void main(String[] args) {
		
		
		// ***************** charAt() *****************
		String name = new String("Paul");
		System.out.println(name.charAt(2));  // u
		
		// ***************** indexOf() *****************
		String letters = "ABCAB";
		System.out.println(letters.indexOf('B'));  // 1
		System.out.println(letters.indexOf('S'));      // -1 
		System.out.println(letters.indexOf("CA")); // 2
		
		System.out.println(letters.indexOf('B', 2)); // 4
		
		// ***************** substring() *****************
		String exam = "oracle";
		String sub = exam.substring(2);
		System.out.println(sub);
		
		
		// ***********************************
		// ***************** trim() *****************
		String varWithSpace = " AB CB   "; // Before trim() method 
		System.out.println(":" + varWithSpace + ":");
	
		System.out.println(":" + varWithSpace.trim() + ":");// after trim() method 
		
		
		// ***************** replace() *****************
		String letterS = "ABCAB";
		letterS.replace('B', 'b');
		System.out.println(letterS);
		letterS.replace("CA", "12");
		System.out.println(letterS);
		
		// ==> Error 
		letterS.replace("A", 'a');    // won't compile - we can't mix char and String 
		

	}
	
}
