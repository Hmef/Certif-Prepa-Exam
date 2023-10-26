package com.OCP81Z0808.Char;

public class Test {

	public static void main(String[] args) {
		
		char c1 = 122;
		char c2 = '\u0122';
		
		//char c3 = -122; ==> Fail to compile 
		char c3 = (char) -122; // ==> casting to char 
		
		System.out.println("c1 = " + c1);
		System.out.println("c2 = " + c2);
		
		System.out.println("c3 = " + c3);
		
	}
}
