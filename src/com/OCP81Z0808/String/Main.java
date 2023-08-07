package com.OCP81Z0808.String;

public class Main {

	public static void main(String[] args) {
		
		
		// ***************** CharAt() *****************
		String name = new String("Paul");
		System.out.println(name.charAt(2));
		
		// ***************** IndexOf() *****************
		String letters = "ABCAB";
		System.out.println(letters.indexOf('B'));
		System.out.println(letters.indexOf('S'));
		System.out.println(letters.indexOf("CA"));
		
		System.out.println(letters.indexOf('B', 2));
		
		// ***************** Substring) *****************
		String exam = "oracle";
		String sub = exam.substring(2);
		System.out.println(sub);
	}
	
}
